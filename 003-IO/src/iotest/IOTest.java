package iotest;

import org.junit.Test;

import java.io.*;

public class IOTest {
    public static void main(String[] args) throws IOException {

    }

    @Test
    public void test1() {
        FileReader fr = null;
        try {
            File file = new File("hello.txt");  //相较于当前module下的
            System.out.println(file.getAbsoluteFile());

            fr = new FileReader(file);


//        int data = fr.read();
//        while(data != -1){
//            System.out.print((char)data);
//            data = fr.read();
//        }

            int data;
            while ((data = fr.read()) != -1){
                System.out.print((char)data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if(fr != null) fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


    @Test
    public void test2() {
        FileReader fr = null;
        try {
            //1.File类的实例化
            File file = new File("hello.txt");

            //2.FileReader流的实例化
            fr = new FileReader(file);

            //3.读入的操作
            //read(char[] cbuf):返回每次读入cbuf数组中的字符个数，如果达到文件末尾，返回-1
            char[] cbuf = new char[5];
            int len;
            while((len = fr.read(cbuf)) != -1){
                for (int i = 0; i < len; i++) {
                    System.out.print(cbuf[i]);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fr != null) fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @Test
    public void testFileWrite() throws IOException {
        //1.提供File对象
        File file = new File("hello.txt");
        //2.提供FileWrite对象 数据写入
        FileWriter fw = new FileWriter(file);
        //3.写出操作
        fw.write("I have a dream\n");
        fw.write("you need to have a dream");
        //4.流资源的关闭
        fw.close();
    }

    @Test
    public void testFileReaderFileWrite() {
        FileReader fr = null;
        FileWriter fw = null;
        try {
            //1.创建File类的对象，指明读入和写出的文件
            File srcFile = new File("hello.txt");
            File destFile = new File("hello2.txt");

            //2.创建输入流和输出流
            fr = new FileReader(srcFile);
            fw = new FileWriter(destFile);

            //3.数据读入和写出操作
            char[] cbuf = new char[5];
            int len;
            while ((len = fr.read(cbuf)) != -1){
                fw.write(cbuf, 0, len); //每次写出len个字符
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                //4.关闭流资源
                if (fw != null) fw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

            try {
                //4.关闭流资源
                if (fr != null) fw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


}


