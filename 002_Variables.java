import java.util.*;

public class Main {

public static void main(String args[])
{
    int x = 15;
    int y = 10;
    int sum = x + y;

    System.out.println("Sum of "+x+" and "+y+" is "+sum); //String + int  = String

    int prd = x * y;

    System.out.println("Product of "+x+" and "+y+" is "+prd);

    // x / y, y / x, x % y
    int v1 = x / y;  // (int) / (int) = (int)
    int v2 = y / x;
    int v3 = x % y;

    System.out.println(v1); // 1
    System.out.println(v2); // 0 (quotient)
    System.out.println(v3); // 5 (remainder)

    // *, /, % all have same priority, left to right we execute one by one

    int exp = x*y/x+y;
    System.out.println(exp); // 20

    exp = (x*y)/(x+y);
    System.out.println(exp); // 6

}
}