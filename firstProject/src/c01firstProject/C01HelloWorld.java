package c01firstProject;

import java.util.Scanner;

public class C01HelloWorld {
   public static void main(String[] args) {
	   Scanner scn = new Scanner(System.in);
	  System.out.println("Hello World");
	  System.out.println("What u r name?");
	  String name = scn.next();
	  System.out.println("Welcome "+name);
   }
}
