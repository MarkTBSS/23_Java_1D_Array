//import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        String mockInput = "5\n" +
                            "10\n" +
                            "20\n" +
                            "30\n" +
                            "40\n" +
                            "50";
        Scanner scanner = new Scanner(mockInput);
        int n = scanner.nextInt();
        scanner.nextLine();
        for (int i=0; i < n; i++) { 
            int a = scanner.nextInt();
            System.out.println(a);
        }
        scanner.close();

        int[] myArray = new int[4];
        myArray[3] = 12;
        System.out.println(myArray);
        System.out.println(myArray[3]);
        for (int each : myArray) { 
            System.out.println(each);
        }
    }
}