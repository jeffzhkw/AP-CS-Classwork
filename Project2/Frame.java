package project2;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Frame extends JFrame{
	
	JButton OK = new JButton("ȷ��");
	JTextArea ����� = new JTextArea(3,27);//3��27��
	static JTextArea ��ʾ�� = new JTextArea(20,33);
	static String input = "";
	RouteCipher a = new RouteCipher(4,3);
	
	
	
	public Frame(){
		super("xxxxxxx");
		setSize(400,500);
		JPanel p1 = new JPanel();
		p1.setLayout(new BorderLayout());
		JPanel p2 = new JPanel();
		p2.setLayout(new FlowLayout());
		
		
		OK.setSize(80,40);
		�����.setLineWrap(true);
		��ʾ��.setLineWrap(true);
		��ʾ��.setEditable(false);
		�����.setBorder(BorderFactory.createLineBorder(Color.black));
		
		p1.add(new JScrollPane(��ʾ��),BorderLayout.CENTER);
		p2.add(�����);
		p2.add(OK);
		
		this.setLayout(new BorderLayout());
		this.add(p1,BorderLayout.CENTER);
		this.add(p2,BorderLayout.SOUTH);
		
		OK.addActionListener((ActionListener) new Action());
		
		setVisible(true);//����д�����һ��
	}
	
	private class Action implements ActionListener{
		public void actionPerformed(ActionEvent e){
			input = �����.getText();
			��ʾ��.append("ԭ�ģ�"+input+"\n");
			�����.setText("");
			��ʾ��.append("���ܣ�"+a.encryptMessage(input)+"\n");
		}
	}
}

