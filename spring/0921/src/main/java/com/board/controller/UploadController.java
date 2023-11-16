package com.board.controller;

import java.io.File;
import java.io.FileOutputStream;
import java.net.URLDecoder;
import java.nio.file.Files;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.board.domain.FileDTO;

import net.coobird.thumbnailator.Thumbnailator;

@Controller
public class UploadController {

   @GetMapping("/uploadForm")
   public String uploadForm() {
      return "uploadForm";
   }
   
   @PostMapping("/uploadAction")
   public void upload(MultipartFile[] uploadFile, Model model) {
      
      String uploadFolder = "d:\\upload";
      
      for(MultipartFile file : uploadFile) {
         System.out.println("--------");
         System.out.println("파일명 : " + file.getOriginalFilename());
         System.out.println("크기 : " + file.getSize());
         
         File saveFile = new File(uploadFolder, file.getOriginalFilename());
         
         try {
            file.transferTo(saveFile);
         } catch (Exception e) {
            e.printStackTrace();
         }
         
      }
      
   }
   
   @GetMapping("/uploadAjax")
   public void uploadAjax() {
      
   }
   
   private String getFolder() {
      SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
      
      Date date = new Date(); // 현재날짜가 년월일시분초다나옴
      
      String str = sdf.format(date); // 2023-10-02
      
      return str.replace("-", File.separator);
   }
   
   private boolean checkImageType(File file) {
      try {
         String contentType = Files.probeContentType(file.toPath());
         
         return contentType.startsWith("image");
      } catch (Exception e) {
         e.printStackTrace();
      }
      
      return false;
   }
   
   @PostMapping(value = "/uploadAjax", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
   @ResponseBody
   public ResponseEntity<List<FileDTO>> upload(MultipartFile[] uploadFile) {
      
      List<FileDTO> list = new ArrayList<>();
      String uploadFolder = "d:\\upload";
      String uploadFolderPath = getFolder();
      
      File uploadPath = new File(uploadFolder, uploadFolderPath);
      
      if(!uploadPath.exists())
         uploadPath.mkdirs();
      
      for(MultipartFile file : uploadFile) {
         FileDTO dto = new FileDTO();
         
         String uploadFileName = file.getOriginalFilename();         
         dto.setFileName(uploadFileName);
         
         UUID uuid = UUID.randomUUID();
         dto.setUuid(uuid.toString());
         
         uploadFileName = uuid.toString() + "_" + uploadFileName;
         
         File saveFile = new File(uploadPath, uploadFileName);
         
         try {
            file.transferTo(saveFile);
            
            dto.setUploadPath(uploadFolderPath);
            
            if(checkImageType(saveFile)) {
               dto.setImage(true);
               
               FileOutputStream thumbnail = new FileOutputStream(new File(uploadPath, "s_" + uploadFileName));
               
               Thumbnailator.createThumbnail(file.getInputStream(), thumbnail, 100, 100);
               
               thumbnail.close();
            }
            
            list.add(dto);
            
         } catch (Exception e) {
            // TODO: handle exception
         }
      }
      
      return new ResponseEntity<>(list, HttpStatus.OK);
   }
   
   
   @GetMapping("/display")
   @ResponseBody
   public ResponseEntity<byte[]> getFile(String fileName) {
      
      File file = new File("d:\\upload\\" + fileName);
      
      ResponseEntity<byte[]> result = null;
      
      try {
         HttpHeaders header = new HttpHeaders();
         header.add("Content-type", Files.probeContentType(file.toPath()));
         
         result = new ResponseEntity<>(FileCopyUtils.copyToByteArray(file), header, HttpStatus.OK);
      }catch (Exception e) {
         e.printStackTrace();
      }
      
      return result;
   }
   
   
   
   
   @GetMapping(value = "/download", produces = MediaType.APPLICATION_OCTET_STREAM_VALUE)
   @ResponseBody
   public ResponseEntity<Resource> download(String fileName) {
      
      System.out.println("다운받는 파일명 : " + fileName);
      
      FileSystemResource resource = new FileSystemResource("d:\\upload\\" + fileName);
      
      System.out.println("리소스 : " + resource);
      
      String resourceName = resource.getFilename();
      
      String oriName = resourceName.substring(resourceName.indexOf("_") + 1);
      
      HttpHeaders header = new HttpHeaders();
      
      try {
         header.add("Content-Disposition",
               "attachment; filename=" + new String(oriName.getBytes("utf-8"), "iso-8859-1"));
      } catch (Exception e) {
         e.printStackTrace();
      }
      
      return new ResponseEntity<>(resource, header, HttpStatus.OK);
   }
   
   
   
   @PostMapping("/deleteFile")
   @ResponseBody
   public ResponseEntity<String> deleteFile(String fileName, String type) {
      File file = null;
      
      try {
         file = new File("d:\\upload\\" + URLDecoder.decode(fileName, "utf-8"));
         file.delete(); // 섬네일 또는 이미지가 아닌 파일
         
         if(type.equals("image")) {
            String oriFileName = file.getAbsolutePath().replace("s_", "");
            
            file = new File(oriFileName);
            
            file.delete(); // 원본 이미지 파일이 삭제
         }
         
      } catch (Exception e) {
         e.printStackTrace();
      }
      
      return new ResponseEntity<>("삭제성공", HttpStatus.OK);
   }
   
   
   
   
//   @PostMapping("/uploadAjax")
//   public void upload(MultipartFile[] uploadFile) {
//      String path = "d:\\upload";
////                              년,월,일이 각각 폴더 구조형태로 리턴
////                        d:\\upload   2023\\10\\02
//      File uploadPath = new File(path, getFolder());
////      d:\\upload\\2023\\10\\02 폴더가 존재하냐?
//      if(uploadPath.exists() == false) {
////         d:\\upload\\2023\\10\\02 폴더 생성
//         uploadPath.mkdirs();
//      }
//      
//      for(MultipartFile file : uploadFile) {
//         System.out.println("-----");
//         System.out.println("파일명 : " + file.getOriginalFilename());
//         
//         UUID uuid = UUID.randomUUID();
//         
//         String uploadFileName = uuid.toString() + "_" + file.getOriginalFilename();
//         
//         File saveFile = new File(uploadPath, uploadFileName);
//         
//         try {
//            file.transferTo(saveFile);
//            
//            if(checkImageType(saveFile)) {
//               FileOutputStream thumbnail = new FileOutputStream(new File(uploadPath, "s_" + uploadFileName));
//               
//               Thumbnailator.createThumbnail(file.getInputStream(), thumbnail, 100, 100);
//               
//               thumbnail.close();
//            }
//         } catch (Exception e) {
//            e.printStackTrace();
//         }
//      }
//      
//   }
   
   
}
