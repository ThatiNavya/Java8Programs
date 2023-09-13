package com.implementing_PrintInterf_nestedclass;

public interface Print {
    void print(String message);
}
 class MainClass {
    public static void main(String args[]) {
        //using nested class
        Print myNestedPrinter = new Print(){
            public void print(String x) {
                System.out.println(x);
            }
        };
      //using lambda
        Print myPrinter = x -> System.out.println(x);
        myNestedPrinter.print("Hello");
        myPrinter.print("Hiiiii!");
    }
 }