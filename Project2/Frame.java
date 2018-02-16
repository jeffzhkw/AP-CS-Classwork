package project2;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Frame extends JFrame{
	
	JButton OK = new JButton("确定");
	JTextArea 输入框 = new JTextArea(3,27);//3行27列
	static JTextArea 显示框 = new JTextArea(20,33);
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
		输入框.setLineWrap(true);
		显示框.setLineWrap(true);
		显示框.setEditable(false);
		输入框.setBorder(BorderFactory.createLineBorder(Color.black));
		
		p1.add(new JScrollPane(显示框),BorderLayout.CENTER);
		p2.add(输入框);
		p2.add(OK);
		
		this.setLayout(new BorderLayout());
		this.add(p1,BorderLayout.CENTER);
		this.add(p2,BorderLayout.SOUTH);
		
		OK.addActionListener((ActionListener) new Action());
		
		setVisible(true);//必须写在最后一行
	}
	
	private class Action implements ActionListener{
		public void actionPerformed(ActionEvent e){
			input = 输入框.getText();
			显示框.append("原文："+input+"\n");
			输入框.setText("");
			显示框.append("加密："+a.encryptMessage(input)+"\n");
		}
	}
}

