package com.corejava;

public class Count {
	
static 	int count = 0;
    Count(){
		count++;
		
	}
    void showcount() {
    	
    	System.out.println("object count : " + count);
    }

	public static void main(String[] args) {
	Count n1 = new Count();
	Count n2 = new Count();
	Count n3 = new Count();
		
		n3.showcount();

	}

}
