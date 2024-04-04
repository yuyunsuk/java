package Java240404;

import java.io.*;

public class DataIOStream {
    public static void main(String[] args) throws IOException {
        File dataFile = new File(FileObject.CURRENT + "/fileData.data");
        OutputStream os = new FileOutputStream(dataFile);
        InputStream is = new FileInputStream(dataFile);

        // 기존의 IO Stream 들은 바이트 단위로만 읽고 쓸 수 있는 반면,
        // DataInputStream/DataOutputStream 은 여러 원시자료형의 형태에 맞춰 읽고 쓸 수 있음.
        BufferedOutputStream bos = new BufferedOutputStream(os);
        BufferedInputStream bis = new BufferedInputStream(is);

        DataOutputStream dos = new DataOutputStream(bos);
        DataInputStream dis = new DataInputStream(bis);

        dos.writeInt(35);
        dos.writeDouble(5.8);
        dos.writeChar('A');
        dos.writeUTF("안녕하세요");

        //os.flush();
        dos.flush();

        // 읽기
        int a = dis.readInt(); // 4byte
        double b = dis.readDouble(); // 8 byte
        char c = dis.readChar(); // 2 byte
        String d = dis.readUTF();

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);

        os.close();
        bos.close();
        dos.close();

        is.close();
        bis.close();
        dis.close();



    }
}
