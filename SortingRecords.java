/*
 * UCF COP3330 Fall 2021 Assignment 2 Solution
 * Copyright 2021 Taha Al Balushi
 */
package ex39;

import java.util.*;

public class SortingRecords {
    public static void main(String ar[]) {
        HashMap<String, String> emp = new HashMap<>();
        emp.put("Johnson","John");
        emp.put("Xiong","Tou");
        emp.put("Michalsen","Michaela");
        emp.put("Webber","Sally");
        Set<String > s = new HashSet<>();
        s=emp.keySet();
        List<String> list = new ArrayList<String>(s);
        Collections.sort(list);
        for(int i=0;i<emp.size();i++)
        {
            System.out.print(list.get(i)+"  "+emp.get(list.get(i)));
            System.out.println();
        }
    }
}
