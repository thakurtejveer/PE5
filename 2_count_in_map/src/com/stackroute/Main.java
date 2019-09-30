//2. Write a program to find the number of counts in the following ​ String​ . Store the output in
//Map<​ String​ ,Integer> as key value pair.
//Input : ​ String​ str = “one one -one___two,,three,one @three*one?two”;
//Output : {"one":5 , "two":2, "three" :2}

package com.stackroute;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
	String str= "one one -one___two,,three,one @three*one?two";
        Map<String, Integer> stringIntegerMap= new HashMap<>();
        int count=0;
        stringIntegerMap.put("one",0);
        stringIntegerMap.put("two",0);
        stringIntegerMap.put("three",0);
        Set<String> keys =stringIntegerMap.keySet();
        for(String key:keys)
        {
            Pattern pattern=Pattern.compile(key);
            Matcher matcher=pattern.matcher(str);
            while(matcher.find())
            {
                count++;
                stringIntegerMap.put(key,count);
            }
            count=0;
        }
        for(String key:keys)
        {
            System.out.println(key+":"+stringIntegerMap.get(key));
        }
    }
}
