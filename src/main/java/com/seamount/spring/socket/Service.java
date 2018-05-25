package com.seamount.spring.socket;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * tcp
 * 协议socket通信
 * @author Administrator
 *
 */
public class Service {

	public void serverSocket() throws IOException{
		ServerSocket serverSocket = new ServerSocket(10086);
		Socket socket = serverSocket.accept();
		InputStream inputStream = socket.getInputStream();
		InputStreamReader reader = new InputStreamReader(inputStream);
		BufferedReader br = new BufferedReader(reader);
		String info = null;
		while ((info = br.readLine()) != null) {
			System.out.println("我是服务器，客户端说："+info);
		}
		socket.shutdownInput();
		OutputStream outputStream = socket.getOutputStream();
		PrintWriter pw = new PrintWriter(outputStream);
		pw.write("欢迎您！");
		pw.flush();
		
		pw.close();
		outputStream.close();
		br.close();
		reader.close();
		inputStream.close();
		socket.close();
		serverSocket.close();
	}
}
