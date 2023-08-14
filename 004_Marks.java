import java.util.*;

public class Main {

public static void main(String args[])
{
    Scanner sc = new Scanner(System.in);
    int marks = sc.nextInt();

    if(marks > 90){
        System.out.println("Excellent!");
    }
    else if((marks <= 90) && (marks >80)){
        System.out.println("good");
    }
    else if((marks <= 80) && (marks >70)){
        System.out.println("fair");
    }
    else if((marks <= 70) && (marks >60)){
        System.out.println("meets expectations");
    }
    else if(marks <= 60){
        System.out.println("below par");
    }
}
}