package gitDemo.sendEmail;

import java.awt.Container;
import java.security.Key;
import java.security.SecureRandom;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Demo extends JFrame{
	
	public static void main(String[] args) {
		
	}
	
	public Demo() {
		Container conn = this.getContentPane();   //得到窗口的容器
	    conn.setLayout(null);   //设置布局方式为空 也就是绝对布局
	    JLabel L1 = new JLabel("Hello,world!");     //创建一个标签 并设置初始内容
	    L1.setBounds(50,20,100,20);     
	    
	    JButton B1 = new JButton("按钮1");    //创建一个按钮
	    B1.setBounds(100,50,100,30);    //设置按钮的大小和位置
	    
	    conn.add(L1);
	    conn.add(B1);   //添加到容器
		this.setTitle("nihao");
		this.setName("lal");
		//设置窗口是否可视
		this.setVisible(true);
		//设置窗口的大小是否可以调节
		this.setResizable(true);
		//设置窗口大小和x,y位置
		this.setBounds(400, 300, 511, 654);
		//设置窗口退出则程序退出
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
