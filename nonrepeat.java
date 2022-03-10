package com.studyopedia;
import java.util.Scanner;
public class nonrepeat {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        String c = a.nextLine();
        String b[];
        String ans = "";
        b = c.split(" ");
        for (int i = 0; i < b.length; i++)
            for (int j = i + 1; j < b.length; j++) {
                if (b[i]==(b[j])){
                    b[j] = "remove";
                }
            }
        for (String d : b) {
            if (d != "remove") {
                ans = ans + d+" ";
            }
        }
        System.out.println("ans is " +ans);
    }
}