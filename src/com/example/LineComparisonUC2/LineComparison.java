package com.example.LineComparisonUC2;

class lineEquation{
   private int X1,X2,Y1,Y2;
   private int A1,A2,B1,B2;
   public int lenghthOfLine;
   public int lengthOfLine1;
    //method to compute the line length
    public void getLineLength(int X1,int X2,int Y1,int Y2,int A1,int A2,int B1, int B2){
        this.X1=X1;
        this.X2=X2;
        this.Y1=Y1;
        this.Y2=Y2;
        this.A1=A1;
        this.A2=A2;
        this.B1=B1;
        this.B2=B2;
        lenghthOfLine = (int)(Math.sqrt((X2 - X1) ^ 2 + (Y2 - Y1) ^ 2));
        lengthOfLine1 = (int)(Math.sqrt((A2 - A1) ^ 2 + (B2 - B1) ^ 2));
    }
    public int setLineLength(){
        return  lenghthOfLine;
    }
    public void getLineCheck(){
        if(this.lenghthOfLine == this.lengthOfLine1)
            System.out.println("Line are equal in the length");
        else if(this.lenghthOfLine < this.lengthOfLine1)
            System.out.println("length of line1 less than the length of line2");
        else
            System.out.println("length of line1 is greater than the length of line2");

    }
}

public class LineComparison {
    public static void main(String args[]) {
        lineEquation line = new lineEquation();
        // lengh of the cordinate system
        int X1 = 10, X2 = 20, Y1 = 12, Y2 = 27;
        int A1 = 20, A2 = 22, B1 = 30, B2 = 35;
        //   int lenghOfLine =0, lenghOfLine1 =0;
    /*    int lenghOfLine = (int)(Math.sqrt((X2 - X1) ^ 2 + (Y2 - Y1) ^ 2));
        int lenghOfLine1 = (int)(Math.sqrt((A2 - A1) ^ 2 + (B2 - B1) ^ 2));
        System.out.println("Length of the first line" + lenghOfLine);
        System.out.println("Length of the second line" + lenghOfLine1);
       System.out.println("Line are equal"+lenghOfLine.equals(lenghOfLine1);
        if(lenghOfLine == lenghOfLine1)
            System.out.println("Length is equal");
       else if(lenghOfLine > lenghOfLine1)
            System.out.println("Length of the line1 is greater than length of line2");
        else
            System.out.println("Length of line1 is smaller than length of line2");  */
        // calling the class method to compute length of the line
        line.getLineLength(10,40,60,80,20,22,40,60);
        line.getLineCheck();


    }
}