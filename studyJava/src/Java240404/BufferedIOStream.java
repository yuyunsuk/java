package Java240404;

import java.io.*;

public class BufferedIOStream {
    public static void main(String[] args) throws IOException {
        File orgFile = new File(FileObject.CURRENT + "/mycat_origin.jpg");
        File copyFile = new File(FileObject.CURRENT + "/mycat_copy1.jpg");
        if (!orgFile.exists()) {
            System.out.println("복사할 대상 파일이 없습니다.");
        }
        InputStream is = new FileInputStream(orgFile);
        OutputStream os = new FileOutputStream(copyFile);

        // 기존의 방법은 1 바이트 씩 읽고, 쓰기 때문에 속도가 느림
        // 1 바이트 마다 read/write 하지 않고, 버퍼에 모았다가 한번에 하면 속도를 높일 수 있음
        // BufferedInputStream 과 BufferedOutputStream 을 같이 사용함.
        BufferedInputStream bis = new BufferedInputStream(is);
        BufferedOutputStream bos = new BufferedOutputStream(os);

        int data;
        // BufferedStream 을 사용하려면, is 대신 bis, os 대신 bos 로 변경
        while ((data = bis.read()) != -1 ) {
            bos.write(data);
        }
        is.close();
        os.flush();
        os.close();



    }
}
