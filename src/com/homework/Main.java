package com.homework;


public class Main {

    public static void main(String[] args) {
        // write your code here

        String str = "helloworld";
        String output = "";
        for (; ;) {
            for (int i = 0; i < str.length(); i++) {
                output = str.substring(0, i) + str.substring(i, i + 1).toUpperCase() + str.substring(i + 1);
                System.out.println(output);
                // with animation uncomment the line below ... But I'm not sure it's working right :D
                //System.out.print("\r" + output);
            }
        }
    }
}

