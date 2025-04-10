package lesson05;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

public class FileDownloader {
	public static void main(String[] args) throws Exception {
		
		String img = "https://search.pstatic.net/common/?src=http%3A%2F%2Fblogfiles.naver.net%2FMjAyNDExMDRfMTc4%2FMDAxNzMwNzI3OTEyNDk4.H6h49xWfw9sawkTz8-1ezytpID8bpSmxiBEaIM_z5h8g.7KI8VhByWlltQyrGk1vbt-vs9CkTTPjbLaldqrxWyI0g.PNG%2Fcdad9aba-d342-4469-adbf-ef90a6766241.png&type=sc960_832";
		
		URL url = new URL(img);
		
		
		InputStream is = url.openStream();		//입력		
		FileOutputStream fos = new FileOutputStream("img.png");
		
		int b = 0;
		while( (b = is.read()) != -1 ) {
			fos.write(b);
			
		}
		fos.close();
		
	}

}
