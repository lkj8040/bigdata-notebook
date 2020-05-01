package com.vishnu.tcp.client;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.Socket;

public class TcpClient {

	public static void main(String[] args) throws Exception {
		String sentence;
		String modifiedSentence;
		BufferedReader inFromUser = new BufferedReader(new InputStreamReader(System.in));
		Socket clientSocket = new Socket("localhost", 4443);
		DataOutputStream outToServer = new DataOutputStream(clientSocket.getOutputStream());
		outToServer.writeBytes("test message" + '\n');
		clientSocket.close();
		System.out.println("2 edition by remote lkj8040 at 2020-05-01 11:29");
		System.out.println("1 edition by liukuijian at 2020-05-01 11:24");
		System.out.println("3 edition by liukuijian at 2020-05-01 11:46");
	}
}
