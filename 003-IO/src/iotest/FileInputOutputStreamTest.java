package iotest;


import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

//FileInputStream和FileOutputStream
public class FileInputOutputStreamTest {


    @Test
    public void testFileInputStream() throws IOException {
        File srcFile = new File("img.png");
        File destFile = new File("img1.png");

        FileInputStream fis = new FileInputStream(srcFile);
        FileOutputStream fos = new FileOutputStream(destFile);

        byte[] buffer = new byte[1024];
        int len;
        while ((len = fis.read(buffer)) != -1){
            fos.write(buffer);
        }

        fis.close();
        fos.close();
    }
}


