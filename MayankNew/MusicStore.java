package MayankNew;

import java.util.*;
import java.util.Scanner;

class Person {
    String name;
    int age;
    String address;

    Person(){

    }

    Person(String name,int age, String address){
        this.name = name;
        this.age=age;
        this.address=address;
    }


    public void read() {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter Name: ");
        name = scn.nextLine();
        System.out.print("Enter Age: ");
        age = Integer.parseInt(scn.nextLine());
        System.out.print("Enter Address: ");
        address = scn.nextLine();
    }

    public void show() {
        System.out.println("\n Employee Name - " + this.name);
        System.out.println("Age - " + this.age);
        System.out.println("Address - " + this.address);
    }
}

class Employee extends Person {
    int EmployeeID;
    String Department;

    public void read() {
        super.read();
        Scanner scn = new Scanner(System.in);
        Random rand = new Random();
        EmployeeID = rand.nextInt(1000);
        System.out.print("Department Name: ");
        Department = scn.nextLine();
    }

    public void show() {
        super.show();
        System.out.println("EmployeeID - " + this.EmployeeID);
        System.out.println("Department name - " + this.Department);
    }

}

public class MusicStore {
    public static void main(String[] args) {
        /*Metadata object1 = new Metadata();
        System.out.println(object1);

        Metadata obj1 = new Metadata("Ragreza", 350, 2008, "Temp", "Arijit", 5, 150);
        obj1.printDetails();
        
        Customers c = new Customers();
        c.printDetails();*/
    
        System.out.println("\n Now choose your option :");
        System.out.println("\n ------------------------ :");
        
        System.out.println("\nEnter 1 for adding details");
        System.out.println("Enter 2 for buying music");
        
        Scanner a = new Scanner(System.in);
        int choice=a.nextInt();
        
        switch(choice)
	{
	
	case 1:
        
        System.out.print("Enter Number of Employee: ");
        Scanner ns = new Scanner(System.in);
        int noe = Integer.parseInt(ns.nextLine());
        Employee[] obj = new Employee[noe];
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
        Metadata data[] = new Metadata[number];
        Functionality f = new Functionality();
        for(int i = 0 ; i < number ; i++){
             data[i] = f.getInputMetadata(i);
        }
        System.out.println("--------------------");
    
        for(int i = 0 ; i < data.length ; i++){
            data[i].printDetails1(data.length - i);
        }
        break;
    
    default:
		System.out.println("Wrong Choice!\n");
			
	}

        
        
       /* for(Metadata m : data){
            m.printDetails();
        }*/

        
        /*catch (InputMismatchException e) 
        {
           System.out.println("--Enter a valid choice--");
        }*/
    }

    //static block
    static
    {
        System.out.println("Welcome to Music Store");
    }
}
