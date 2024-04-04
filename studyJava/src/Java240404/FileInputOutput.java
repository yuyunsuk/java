package Java240404;

import java.io.*;
import java.nio.charset.Charset;

public class FileInputOutput {
    public static void main(String[] args) throws IOException {
        File file = new File(FileObject.CURRENT + "/fileio.txt");
        if (!file.exists()) {
            file.createNewFile();
        }
        OutputStream os = new FileOutputStream(file);
        //byte[] arrayByte = "Hello world. Let's study spring framework.\r\n".getBytes();
        byte[] arrayByte = "안녕하세요.".getBytes(Charset.forName("UTF-8"));
        os.write(arrayByte);
        os.flush();
        os.close();

        // 읽기
        InputStream is = new FileInputStream(file);
        int data = 0;
        byte[] buffer = new byte[1000];
        String str = "";
//        while (data != -1) { // 2번 반복됨
//            data = is.read(buffer); // 1번째는 읽고, 2번재 -1이 됨
//            if (data >= 0) {
//                str = str + new String(buffer, 0, data, Charset.forName("UTF-8"));
//            }
//        }
        while ((data = is.read(buffer)) != -1) { // 1번만 읽음
            str = str + new String(buffer, 0, data, Charset.forName("UTF-8"));
        }
        //String str = new String(buffer);
        //String str = new String(buffer, Charset.forName("UTF-8"));

        System.out.println(str);
        is.close();



    }
}
