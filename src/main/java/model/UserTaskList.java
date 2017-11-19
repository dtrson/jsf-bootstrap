package model;

public class UserTaskList {
	
	private String name;
	private String type;
	
	public UserTaskList(){
		
	}
	
	public UserTaskList(String name, String type) {
		super();
		this.name = name;
		this.type = type;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	
}
