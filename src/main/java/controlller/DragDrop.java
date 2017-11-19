package controlller;

import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

import model.UserTaskList;

import java.io.Serializable;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;

@Named
@SessionScoped
public class DragDrop implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Inject
	private UserController userController;
	
	public DragDrop(){
		
	}
	
	public String getPayload() {
		// this method sends a string, that's a concatenation
		// of the saved item's titles, back to the client
		List<UserTaskList> savedItems = userController.getList2();
		Iterator<UserTaskList> it = savedItems.iterator();
		String s = "";
		
		while (it.hasNext()) {
			UserTaskList item = it.next();
			s += item.getName() + " | ";
		}
		return s;
	}
	
	public void setPayload(String payload) {
		// payload was set in the drop event listener for the 
		// h5:drop component in /sections/feeds/menuLeft.xhtml
		StringTokenizer st = new StringTokenizer(payload);
		UserTaskList item = new UserTaskList();
		
		item.setName(st.nextToken("|"));
		st.nextToken(" ");
		item.setType(st.nextToken(" "));
		
		
		userController.getList2().add(item);
	}

}
