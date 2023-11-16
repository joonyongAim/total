package 입출력스트림;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Sample03 {

	public static void main(String[] args) throws Exception {
		
		FileInputStream fis = new FileInputStream("src/입출력스트림/Sample03.java");
		FileOutputStream fos = new FileOutputStream("test.txt");
		
		int data = 0;
		
		while( (data = fis.read()) != -1) {
			fos.write(data);
		}
		
		fis.close();
		fos.close();
	}

}
