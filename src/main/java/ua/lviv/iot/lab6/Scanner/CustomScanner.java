package ua.lviv.iot.lab6.Scanner;

import java.util.Scanner;

public class CustomScanner {

    public String scanString(){
        System.out.println("Enter your String");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public int scanInt(){
        System.out.println("Enter your int");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
}
