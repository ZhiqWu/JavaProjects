package zwu.io.test;

import java.io.*;

/*
 * 打印流 PrintWriter
 * */
public class PrintTest02 {
    public static void main(String[] args) throws FileNotFoundException {


        PrintWriter pw = new PrintWriter(new BufferedOutputStream(new FileOutputStream("print.txt")), true);
        pw.println("打印流");
        pw.println(true);
        pw.close();
    }
}
