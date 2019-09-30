//1. Write a Java program to update specific array element by given element and empty the ​ array list​ .
//Input: [Apple, Grape, Melon, Berry]
//Output: [Kiwi, Grape, Mango, Berry]
//Array list​ after removing all elements []

package com.stackroute;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        List<String> strings= new ArrayList<>();
        strings.add("Apple");
        strings.add("Grapes");
        strings.add("Melon");
        strings.add("Berry");
        Scanner scanner=new Scanner(System.in);
        System.out.println("Input: "+strings);
        strings.set(0, "Kiwi");
        strings.set(2, "Mango");
        System.out.println("output "+strings);
        strings.clear();
        System.out.println("Array list after removing all elements: " +strings);
    }
}
