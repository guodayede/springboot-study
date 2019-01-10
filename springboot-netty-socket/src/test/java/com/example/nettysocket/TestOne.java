package com.example.nettysocket;

import org.junit.Test;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;

/**
 * @author gyc
 * @Title: TestOne
 * @ProjectName springboot-study
 * @Description:
 * @date 2018/12/25 10:30
 */
public class TestOne {

    @Test
    public void testa(){
        try {
            Socket socket = new Socket("localhost", 9098);
            OutputStream outputStream = socket.getOutputStream();
            PrintWriter printWriter = new PrintWriter(outputStream);
            printWriter.write("test");
            printWriter.flush();
            socket.shutdownOutput();
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
