/*
/usr/local/Cellar/openjdk/21.0.2/bin/javac *.java
/usr/local/Cellar/openjdk/21.0.2/bin/java Main
*/

import java.io.*;
import java.util.*;

class Main {

    public static void main(String[] args) {
        System.out.println("Number of Employees Who Met the Target");

        Solution solution = new Solution();

        int[] hours1 = { 0, 1, 2, 3, 4 };
        int target1 = 3;
        int count1 = solution.numberOfEmployeesWhoMetTarget(hours1, target1);
        System.out.println("Count = " + count1);

        int[] hours2 = { 5, 1, 4, 2, 2 };
        int target2 = 6;
        int count2 = solution.numberOfEmployeesWhoMetTarget(hours2, target2);
        System.out.println("Count = " + count2);

    }
}
