package MayankNew;       //package defined


import java.util.ArrayList;
import java.util.Scanner;

public class Collection {
    /*COLLECTION CLASS */
    public static void main(String[] args) {
        ArrayList<String> str = new ArrayList<String>();
        Scanner sc = new Scanner(System.in);
        for(int i = 0 ; i < 4 ; i++){
            System.out.println("Enter Name of people enter store today");
            str.add(sc.nextLine());
        }
        System.out.println("Input Completed");
        for (String s : str) {
            System.out.println("NAME : " + s);
        }
        sc.close();

    }
}