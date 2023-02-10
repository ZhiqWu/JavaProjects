package zwu.io.test;

import java.io.*;

/*
 * 打印流 PrintStream
 * */
public class PrintTest01 {
    public static void main(String[] args) throws FileNotFoundException {
        PrintStream ps = System.out;
        ps.println("打印流");
        ps.println(true);

        ps = new PrintStream(new BufferedOutputStream(new FileOutputStream("print.txt")), true);
        ps.println("打印流");
        ps.println(true);
        ps.close();

        //重定向输出端
        System.setOut(ps);
        System.out.println("改变");

        //重定向回控制台
        System.setOut(new PrintStream(new BufferedOutputStream(new FileOutputStream(FileDescriptor.out)), true));
        System.out.println("我回来了！");
    }
}
