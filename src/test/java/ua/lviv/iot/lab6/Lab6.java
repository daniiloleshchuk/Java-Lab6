package ua.lviv.iot.lab6;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ua.lviv.iot.lab6.RegEx.RegEx;
import ua.lviv.iot.lab6.Scanner.CustomScanner;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Lab6 {
    @Test
    public void lab6WithScannerViaTest() {
        //System.out.println("Enter number");
        //Scanner scannerForInt = new Scanner(new InputStreamReader(System.in));

        String numberInput = "3";
        InputStream inputStreamForInt = new ByteArrayInputStream(numberInput.getBytes());
        System.setIn(inputStreamForInt);
        Scanner scannerForInt = new Scanner(inputStreamForInt);
        int number = scannerForInt.nextInt();



        //System.out.println("Enter string");
        //Scanner scannerForString = new Scanner(new InputStreamReader(System.in));
        String stringInput = "How much did it cost? Hello, World! IoT ! Bye, World. Does he like the car? How much " +
                "did it cost?,  Does he like the car?";
        InputStream inputStreamForString = new ByteArrayInputStream(stringInput.getBytes());
        Scanner scannerForString = new Scanner(inputStreamForString);
        String string = scannerForString.nextLine();
        System.out.println(RegEx.findInInterrogativeSentencesWordLengthOf(number, string));
    }
    //                               -----------------IN MAIN EVERYTHING WORK---------------------

    public static void main(String ... args) {
        System.out.println("Enter number");
        Scanner scannerForInt = new Scanner(System.in);
        int number = scannerForInt.nextInt();
        System.out.println("Enter string");
        Scanner scannerForString = new Scanner(System.in);
        String string = scannerForString.nextLine();
        System.out.println(RegEx.findInInterrogativeSentencesWordLengthOf(number, string));
        /* TEXT TO CHECK
                        How much did it cost? Hello, World! IoT ! Bye, World. Does he like the car? How much did it
                        cost?,  Does he like the car?
         */
    }

    @Test
    public void testFindInInterrogativeSentencesLengthOF() {
        System.out.println(RegEx.findInInterrogativeSentencesWordLengthOf(3, "How much did it cost? Hello, World! IoT ! Bye, World. " +
                "Does he like the car? " +
                "How much did it cost? Hello, World! IoT ! Bye, World. Does he like the car? "));
    }


}
