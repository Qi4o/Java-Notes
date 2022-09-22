package iotest;

import org.junit.Test;

import java.io.*;

/**
 * @Author Qiao
 * @Create 2021/12/19 18:28
 */

public class ObjectInputOutputStreamTest {

    // 对象序列号过程
    @Test
    public void test1(){
        ObjectOutputStream oos = null;
        try {
            //1
            oos = new ObjectOutputStream(new FileOutputStream("object.dat"));
            //2
            oos.writeObject(new String("woaiii"));
            oos.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (oos != null){
                //3
                try {
                    oos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    //对象反序列化过程
    @Test
    public void testObjectInputStream(){
        ObjectInputStream ois = null;
        try {
            ois = new ObjectInputStream(new FileInputStream("object.dat"));
            Object obj = ois.readObject();
            String str = (String) obj;
            System.out.println(str);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            if(ois != null){
                try {
                    ois.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
