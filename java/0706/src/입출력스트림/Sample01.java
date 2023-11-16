package 입출력스트림;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;

public class Sample01 {

	public static void main(String[] args) {
		byte[] inSrc = {0,1,2,3,4,5,6,7,8,9};
		byte[] outSrc = null;
		byte[] temp = new byte[10];
		
		ByteArrayInputStream input = new ByteArrayInputStream(inSrc);
		ByteArrayOutputStream output = new ByteArrayOutputStream();
		
		input.read(temp, 0, temp.length);
		System.out.println(Arrays.toString(temp));
		output.write(temp, 5, 5);
		outSrc = output.toByteArray();
		
		System.out.println(Arrays.toString(outSrc));
//		int data = 0;
//		
//		while( (data = input.read()) != -1) {
//			output.write(data);
//		}
//		
//		outSrc = output.toByteArray();
//		
//		System.out.println(Arrays.toString(outSrc));

	}

}
