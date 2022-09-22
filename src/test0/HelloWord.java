package test0;

import org.junit.Test;

import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

public class HelloWord {
    public static void main(String[] args) {
        unicodeToCn("\\u4e2a\\u4eba\\u7528\\u6237\\u8d26\\u53f7\\u5df2\\u9501\\u5b9a\\uff01");
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
    public void test2(){
        try {
            System.out.println(InetAddress.getLocalHost().getAddress());
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }


    //客户端
    @Test
    public void client() {
        Socket socket = null;
        OutputStream os = null;
        try {
            InetAddress inet = InetAddress.getByName("127.0.0.1");
            socket = new Socket(inet, 8899);

            os = socket.getOutputStream();
            os.write("你好，我是客户端".getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (os != null){
                try {
                    os.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (socket != null){
                try {
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }

    //服务端
    @Test
    public void server() {

        ServerSocket ss = null;
        Socket socket = null;
        InputStream is = null;
        ByteArrayOutputStream baos = null;
        try {
            ss = new ServerSocket(8899);

            socket = ss.accept();

            is = socket.getInputStream();

            //可能会乱码
//        byte[] buffer = new byte[20];
//        int len;
//        while ((len = is.read()) != -1){
//            String str = new String(buffer, 0, len);
//            System.out.print(str);
//        }

            baos = new ByteArrayOutputStream();
            byte[] buffer = new byte[20];
            int len;
            while ((len = is.read(buffer)) != -1){
                baos.write(buffer, 0, len);
            }
            System.out.println(baos);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //关闭资源
            if (baos != null){
                try {
                    baos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (is != null){
                try {
                    is.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (socket != null){
                try {
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (ss != null){
                try {
                    ss.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }


    @Test
    public void test3(){
        for (int i = 0; i < 99999999; i++) {
            System.out.println(i);
        }
    }

    @Test
    public static void unicodeToCn(String unicode){

        /** 以 \ u 分割，因为java注释也能识别unicode，因此中间加了一个空格*/

            String[] strs = unicode.split("\\\\u");

            String returnStr = "";
            // 由于unicode字符串以 \ u 开头，因此分割出的第一个字符是""。

        for (int i = 1; i < strs.length; i++) {
            returnStr += (char) Integer.valueOf(strs[i], 16).intValue();
        }

        System.out.println(returnStr);

        }
}










