package 입출력스트림;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class Sample02 {

	public static void main(String[] args) throws IOException {
		byte[] inSrc = {0,1,2,3,4,5,6,7,8,9};
		byte[] outSrc = null;
		byte[] temp = new byte[4];
		
		ByteArrayInputStream input = new ByteArrayInputStream(inSrc);
		ByteArrayOutputStream output = new ByteArrayOutputStream();
		
		while(input.available() > 0) {
			input.read(temp);
			output.write(temp);
			
			outSrc = output.toByteArray();
			
			System.out.println("temp : " + Arrays.toString(temp));
			System.out.println("outSrc : " + Arrays.toString(outSrc));
		}

	}

}
