package com.example.LineComparisonUC2;
public class LineComparison {
    public static void main(String args[]) {
        // lengh of the cordinate system
        int X1 = 10, X2 = 20, Y1 = 12, Y2 = 27;
        //   int lenghOfLine =0, lenghOfLine1 =0;
        double lenghOfLine = (Math.sqrt((X2 - X1) ^ 2 + (Y2 - Y1) ^ 2));
        System.out.println("Length of the line" + lenghOfLine);
    }
}