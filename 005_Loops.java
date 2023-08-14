import java.util.*;

public class Main {

public static void main(String args[])
{
    int  i =1;

    while(i <= 9){
        System.out.print(i + " ");
        i=i+1; // i++
    }
    System.out.println("DONE!");

    for(int j=1; j<=9; j++){
        System.out.print(j+" ");
    }
    // flow of for loop, first initialize, then check --> body --> increment (repeat until check false)
}
}