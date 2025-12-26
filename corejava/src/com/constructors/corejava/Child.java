package com.constructors.corejava;


class Person {
    int id;
    String name;

    // Parameterized constructor
    Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Copy constructor
    Person(Person p) {
        this.id = p.id;
        this.name = p.name;
    }
}


 class Child extends Person {
	 
	
		    double salary;

		    // Parameterized constructor
		   Child(int id, String name, double salary) {
		        super(id, name);
		        this.salary = salary;
		    }

		    // Copy constructor
		    Child(Employee e) {
		        super(e);          // calls Person copy constructor
		        this.salary = e.salary;
		    }

		    void display() {
		        System.out.println(id + " " + name + " " + salary);
		    }

		    public static void main(String[] args) {
		      Child e1 = new Chid(101, "Amit", 50000);
		        Child e2 = new Child(e1);   // copy constructor

		        e1.display();
		        e2.display();
		    }
		}


	

}
