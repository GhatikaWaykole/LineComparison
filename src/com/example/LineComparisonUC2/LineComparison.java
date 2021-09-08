package com.example.LineComparisonUC2;
public class LineComparison {
        public static void main(String args[]) {
            // lengh of the cordinate system
            int X1 = 10, X2 = 20, Y1 = 12, Y2 = 27;
            int A1 = 20, A2 = 22, B1 = 30, B2 = 35;
            //   int lenghOfLine =0, lenghOfLine1 =0;
            double lenghOfLine = (Math.sqrt((X2 - X1) ^ 2 + (Y2 - Y1) ^ 2));
            double lenghOfLine1 = (Math.sqrt((A2 - A1) ^ 2 + (B2 - B1) ^ 2));
            System.out.println("Length of the first line" + lenghOfLine);
            System.out.println("Length of the second line" + lenghOfLine1);
//        System.out.println("Line are equal"+lenghOfLine.equals(lenghOfLine1);
            if (lenghOfLine == lenghOfLine1)
                System.out.println("Length is equal");
            else
                System.out.println("Length not equal");
        } // Add UC2 code
}