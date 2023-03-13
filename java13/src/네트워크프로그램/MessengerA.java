package 네트워크프로그램;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class MessengerA extends JFrame {

	DatagramSocket socket;
	JTextArea list;
	JTextField input;

	public MessengerA() {
		try {
			socket = new DatagramSocket(7777);
		} catch (SocketException e2) {
			e2.printStackTrace();
		}
		list = new JTextArea();
		input = new JTextField();

		add(list, BorderLayout.CENTER);
		add(input, BorderLayout.SOUTH);
		setTitle("Messenger A");
		setSize(500, 500);
		list.setBackground(Color.DARK_GRAY);
		list.setForeground(Color.white);
		input.setBackground(Color.GRAY);
		
		Font font = new Font("함초롬바탕", Font.BOLD, 30);
		list.setFont(font);
		input.setFont(font);

		input.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String s = input.getText();
				try {
					DatagramSocket socket = new DatagramSocket(); // 전화기역할

					// UDP용 패킷이 있어야 함.(데이터, 데이터의 크기, ip, port)
					byte[] data = s.getBytes();
					InetAddress ip = InetAddress.getByName("127.0.0.1");
					DatagramPacket packet = new DatagramPacket(data, data.length, ip, 5555);

					// 소켓을 이용해서 패킷을 보낸다.!
					list.append("나 >> " + s + "\n");
					input.setText("");
					socket.send(packet);
					socket.close(); // 전화기를 끊는다.!
				} catch (SocketException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (UnknownHostException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

			}
		});

		setVisible(true);

	}

	public void process() {
		while (true) {
			try {
				System.out.println("받을 준비중...");

				byte[] data = new byte[256];
				DatagramPacket packet = new DatagramPacket(data, data.length);

				socket.receive(packet);

				list.append("너 >> " + new String(data) + "\n");
			} catch (SocketException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		MessengerA name = new MessengerA();
		name.process();
	}

}
