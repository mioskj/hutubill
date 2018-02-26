package gui.panel;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import gui.model.CategoryTableModel;
import util.ColorUtil;
import util.GUIUtil;

public class CategoryPanel extends JPanel {
	static {
		GUIUtil.useLNF();
	}
	public static CategoryPanel instance = new CategoryPanel();
	
	public JButton bAdd = new JButton("����");
    public JButton bEdit = new JButton("�༭");
    public JButton bDelete = new JButton("ɾ��");
    String columNames[] = new String[]{"��������","���Ѵ���"};
    
    public CategoryTableModel ctm = new CategoryTableModel();
    public JTable t = new JTable(ctm);
    
    public CategoryPanel() {
    	GUIUtil.setColor(ColorUtil.blueColor,bAdd,bEdit,bDelete);
    	JScrollPane sp = new JScrollPane(t);
    	JPanel pSubmit = new JPanel();
    	pSubmit.add(bAdd);
    	pSubmit.add(bEdit);
    	pSubmit.add(bDelete);
    	
    	this.setLayout(new BorderLayout());
    	this.add(sp,BorderLayout.CENTER);
    	this.add(pSubmit, BorderLayout.SOUTH);
    }
    public static void main(String[] args) {
    	GUIUtil.showPanel(CategoryPanel.instance);
    }

}
