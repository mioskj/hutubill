package gui.model;

import java.util.ArrayList;
import java.util.List;

import javax.swing.ComboBoxModel;
import javax.swing.event.ListDataListener;


public class CategoryComboBoxModel implements ComboBoxModel<String>{
	public List<String>cs = new ArrayList<>();
	
	String c;
	public CategoryComboBoxModel() {
		cs.add("餐饮");
		cs.add("交通");
		cs.add("住宿");
		cs.add("话费");
		c = cs.get(0);
	}
	
	@Override
	public int getSize() {
		return cs.size();
	}

	@Override
	public void addListDataListener(ListDataListener arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getElementAt(int index) {
		// TODO Auto-generated method stub
		return cs.get(index);
	}

	@Override
	public void removeListDataListener(ListDataListener arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Object getSelectedItem() {
		// TODO Auto-generated method stub
		return c;
	}

	@Override
	public void setSelectedItem(Object anItem) {
		// TODO Auto-generated method stub
		c = (String) anItem;
		
	}
	
	

}
