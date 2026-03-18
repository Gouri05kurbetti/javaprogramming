package Experiment_No3;

public class Person {
	
	    String name;
	    int age;

	    Person(String name, int age)
	    {
	        this.name = name;
	        this.age = age;
	    }
	}

	class Employee extends Person
	{
	    double salary;

	    Employee(String name, int age, double salary)
	    {
	        super(name, age);
	        this.salary = salary;
	    }

	    // Method Overriding
	    double calculateSalary()
	    {
	        return salary;
	    }

	    // Method Overloading
	    void updateData(String name)
	    {
	        this.name = name;
	    }

	    void updateData(String name, int age)
	    {
	        this.name = name;
	        this.age = age;
	    }

	    void display()
	    {
	        System.out.println("Employee Name: " + name);
	        System.out.println("Age: " + age);
	        System.out.println("Salary: " + calculateSalary());
	    }
	}

	class Manager extends Employee
	{
	    double bonus;

	    Manager(String name, int age, double salary, double bonus)
	    {
	        super(name, age, salary);
	        this.bonus = bonus;
	    }

	    // Method Overriding
	    double calculateSalary()
	    {
	        return salary + bonus;
	    }

	    void display()
	    {
	        System.out.println("Manager Name: " + name);
	        System.out.println("Age: " + age);
	        System.out.println("Total Salary: " + calculateSalary());
	    }
	


	    public static void main(String[] args)
	    {
	        Employee e = new Employee("Raj", 25, 30000);
	        e.display();

	        System.out.println();

	        Manager m = new Manager("Siya", 35, 50000, 10000);
	        m.display();

	        System.out.println("\nUpdating Employee Data...");
	        e.updateData("Rohan");
	        e.display();
	    }
	}


