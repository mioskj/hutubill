package util;

import java.awt.Component;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class CenterPanel extends JPanel{
	private double rate;//����ı���
	private JComponent c;//��ʾ�����
	private boolean strech;//�Ƿ�����
	
	public CenterPanel(double rate,boolean strech)
	{
		this.setLayout(null);
		this.rate = rate;
		
	}
	
}
