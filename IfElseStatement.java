package Branching;

public class IfElseStatement {
    public static void main(String[] args) {
        int a = 5;
        if (a>10){
            System.out.println("a is greater than 10");
        }
        else{
            System.out.println("a is less than 10");
            if(a<=10){
                System.out.println("a is less than or equal to 10");
            }
            else{
                System.out.println("a is not equal to 10");
            }
        }
    }
}
