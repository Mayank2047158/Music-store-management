package MayankNew;       //package defined

import java.util.*;

abstract class Person { //define class abstract and Parent Class
    
    String name;            //  Data Members
    int age;
    String address;

    Person(){   // Default Constroctor

    }

    Person(String name,int age, String address){    // Parameterized Constroctor
        this.name = name;
        this.age=age;
        this.address=address;
    }


    public void read() {        // Memeber Function
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter Name: ");
        name = scn.nextLine();
        System.out.print("Enter Age: ");
        age = Integer.parseInt(scn.nextLine());
        System.out.print("Enter Address: ");
        address = scn.nextLine();
    }

    public void show() {        // Memeber Function
        System.out.println("\n Employee Name - " + this.name);
        System.out.println("Age - " + this.age);
        System.out.println("Address - " + this.address);
    }

    public abstract void tryAbstract();
    //made the function abstract
}

class Employee extends Person {             // Dervied Class extending Parent Class
    int EmployeeID;
    String Department;

    public void read() {        // Memeber Function
        super.read();
        Scanner scn = new Scanner(System.in);
        Random rand = new Random();
        EmployeeID = rand.nextInt(1000);
        System.out.print("Department Name: ");
        Department = scn.nextLine();
    }

    public void show() {        // Memeber Function
        super.show();
        System.out.println("EmployeeID - " + this.EmployeeID);
        System.out.println("Department name - " + this.Department);
    }

	@Override
	public void tryAbstract() { 
        //made the function abstract
        String string = "Mayank";
	}
}


public class MusicStore {
    public static void main(String[] args) {
        
        Login ln =new Login();
        ln.login();
        
        System.out.println("\n ------------------------ :\n");
        
        Metadata object1 = new Metadata();
        System.out.println(object1);

        Metadata obj1 = new Metadata("Ragreza", 350, 2008, "Temp", "Arijit", 5, 150);
        obj1.printDetails();
        
        System.out.println("\n ------------------------ :\n");
        System.out.println("\n -----Customer Details------ :\n");

        Customers c = new Customers();
        c.printDetails();
    
        System.out.println("\n Now choose your option :");
        System.out.println("\n ------------------------ :");
        
        System.out.println("\nEnter 1 for adding details");
        System.out.println("Enter 2 for buying music");
        
        Scanner a = new Scanner(System.in);
        int choice=a.nextInt();
        
        switch(choice)  // Control Statement
	    {
	        case 1:
                System.out.print("Enter Number of Employee: ");
                Scanner ns = new Scanner(System.in);
                int noe = Integer.parseInt(ns.nextLine());
                Employee[] obj = new Employee[noe];     // Array 
                for (int i=0;i<noe;i++){
                    obj[i] = new Employee();
                    System.out.printf("- - - Enter %d Employee Details - - - \n",i+1);
                    obj[i].read();
                    obj[i].show();
                    }
                break;
    
            case 2:
                System.out.println("\n Enter Number of Music CD :");
                Scanner sc = new Scanner(System.in);
                int number=sc.nextInt();
                Metadata data[] = new Metadata[number];     // Array
                Functionality f = new Functionality();
                for(int i = 0 ; i < number ; i++){      // Control Statement
                    data[i] = f.getInputMetadata(i);
                }
                System.out.println("--------------------");
            
                for(int i = 0 ; i < data.length ; i++){     // Control Statement
                    data[i].printDetails1(data.length - i);
                }
                break;
    
            default:
		        throw new InputMismatchException("Please Input valid Inputs only");     // User defined Exception
        }

        
        
     
    }

    
    static  //static block
    {   
        final String CompanyName = "BlackNirvana";          // final keyword
        System.out.println("Welcome to Music Store >>>>> "+ CompanyName);
    }
}
