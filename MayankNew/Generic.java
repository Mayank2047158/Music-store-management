package MayankNew;

import java.util.ArrayList;
import java.util.Scanner;

public class Generic {
    /*GENERIC CLASS */
    public static void main(String[] args) {
        ArrayList<Integer> str = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);
        for(int i = 0 ; i < 4 ; i++){
            System.out.println("No of Customer enter in store:");
            str.add(sc.nextInt());
            sc.nextLine();
        }
        System.out.println("Input Completed");
        for (Integer s : str) {
            System.out.println("NO : " + s);
        }
        sc.close();
    }
}