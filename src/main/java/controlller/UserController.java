package controlller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

import model.UserTaskList;
import java.io.Serializable;

@Named
@SessionScoped
public class UserController implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private List<UserTaskList> list1; 
	
	private List<UserTaskList> list2;


	@PostConstruct
	private void init() {
		
		list1 = new ArrayList<UserTaskList>();
		list2 = new ArrayList<UserTaskList>();
		
		list1.add(new UserTaskList("Item 1", "Type 1"));
		list1.add(new UserTaskList("Item 2", "Type 2"));
		list1.add(new UserTaskList("Item 3", "Type 3"));
		
		list2.add(new UserTaskList("Item 4", "Type 4"));
		list2.add(new UserTaskList("Item 5", "Type 5"));
		list2.add(new UserTaskList("Item 6", "Type 6"));

	}

	public List<UserTaskList> getList1() {
		return list1;
	}

	public void setList1(List<UserTaskList> list1) {
		this.list1 = list1;
	}

	public List<UserTaskList> getList2() {
		return list2;
	}

	public void setList2(List<UserTaskList> list2) {
		this.list2 = list2;
	}
	
	
}
