package com.board.task;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.board.domain.BoardAttachVO;
import com.board.mapper.BoardAttachMapper;

import lombok.extern.log4j.Log4j;

@Log4j
@Component
public class FileCheckTask {
	
	@Autowired
	BoardAttachMapper boardAttachMapper;
	
	private String getFolderYesterday() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Calendar cal = Calendar.getInstance();
		
		cal.add(Calendar.DATE, -1);
		
		String str = sdf.format(cal.getTime());
		
		return str.replace("-", File.separator);
	}
	
	private String getFolder() {
	      SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	      
	      Date date = new Date(); // 현재날짜가 년월일시분초다나옴
	      
	      String str = sdf.format(date); // 2023-10-02
	      
	      return str.replace("-", File.separator);
	}
	
	@Scheduled(cron = "0 * * * * *")
	public void checkFiles() throws Exception {
		log.warn("----------------");
		
		List<BoardAttachVO> fileList = boardAttachMapper.getList();
		
		List<Path> fileListPath = fileList.stream()
				.map(vo -> Paths.get("d:\\upload", vo.getUploadPath(), vo.getUuid() + "_" + vo.getFileName()))
				.collect(Collectors.toList());
		
		fileList.stream().filter(vo -> vo.isFileType() == true)
						.map(vo -> Paths.get("d:\\upload", vo.getUploadPath(), "s_" + vo.getUuid() + "_" + vo.getFileName()))
						.forEach(path -> fileListPath.add(path));
		
		fileListPath.forEach(f -> log.warn(f));
		
		File dir = Paths.get("d:\\upload", getFolderYesterday()).toFile();
		
		File[] removeFiles = dir.listFiles(file -> fileListPath.contains(file.toPath()) == false);
		log.warn("-------삭제될파일목록-------");
		for(File file : removeFiles) {
			log.warn(file);
			file.delete();
		}
	}
	
}
