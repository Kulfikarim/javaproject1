package com.constructors.corejava;

public class StudentInfo {
	
	int sid;
	String name;
	String branch;
	
	
	StudentInfo(int sid,String name,String branch){
		
		this.sid = sid;
		this.name  =  name;
		this.branch = branch;
		
	}

	
	StudentInfo(StudentInfo s){
		
		this.name ="kiran";
		this.sid = s.sid+1;
		this.branch = s.branch;
		
		
	}
	public static void main(String[] args) {
		
		
		
		StudentInfo s = new StudentInfo(101, "karim", "MCA");
		
		StudentInfo s1 = new StudentInfo(s);
		s.display();
		s1.display();
	

	}
	
	void display() {
		System.out.println("id : " + sid);
		System.out.println("name : " + name);
		System.out.println("branch : " + branch);
	}

}
