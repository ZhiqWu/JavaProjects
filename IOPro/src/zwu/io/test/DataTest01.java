package zwu.io.test;
/*
 * 数据流
 * 1.先写后读
 * 2.读取的顺序与写出保持一致
 *
 * DataOutputStream
 * DataInputStream
 * */

import java.io.*;

public class DataTest01 {
    public static void main(String[] args) throws IOException {
        //写出
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        DataOutputStream dos = new DataOutputStream(new BufferedOutputStream(baos));

        //操作数据类型 + 数据
        dos.writeUTF("编码辛酸泪");
        dos.writeInt(18);
        dos.writeBoolean(false);
        dos.writeChar('a');
        dos.flush();
        byte[] data = baos.toByteArray();
        System.out.println(data.length);

        //读取
        DataInputStream dis = new DataInputStream(new BufferedInputStream(new ByteArrayInputStream(data)));
        String msg = dis.readUTF();
        int age = dis.readInt();
        boolean flag = dis.readBoolean();
        char ch = dis.readChar();
        System.out.println(msg);
    }
}
