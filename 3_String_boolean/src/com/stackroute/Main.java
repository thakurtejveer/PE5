//3. Write a program where an array of strings is input and output is a Map<​ String​ ,boolean> where
//each different ​ string​ is a key and its value is true if that ​ string​ appears 2 or more times in the array
//Input :​ ​ String​ arr[] = {“a”,”b”,”c”,”d”,”a”,”c”,”c”}
//Output - {“a” : true,”b” :false ,”c” :true,”d” : false}

package com.stackroute;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("Enter number of Strings you want in string array: ");
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int i=0;
        Map<String, Boolean> map= new TreeMap<>();
        if(n==0)
            return;
        while(i<n)
        {
            System.out.format("Enter String %d: ",i+1);
            String s=scanner.next();
            if(!map.containsKey(s))
            {
                map.put(s,false);
            }
            else
            {
                map.put(s,true);
            }
            i++;
        }
        Set<String> keys=map.keySet();
        for (String key:keys)
        {
            System.out.println(key+": "+map.get(key));
        }


    }
}
