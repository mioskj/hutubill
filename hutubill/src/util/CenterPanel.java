package util;

import java.awt.Component;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class CenterPanel extends JPanel{
	private double rate;//拉伸的比例
	private JComponent c;//显示的组件
	private boolean strech;//是否拉伸
	
	public CenterPanel(double rate,boolean strech)
	{
		this.setLayout(null);
		this.rate = rate;
		
	}
	
}
