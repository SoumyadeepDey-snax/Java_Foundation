import java.util.*;

public class Main {

public static void main(String args[])
{
    Scanner sc = new Scanner(System.in);
    // int age = sc.nextInt(); // to input int
    // String name = sc.nextLine(); // to input full line with space

    //But when we input both int and string we face a bug so we input both as string

    int n = Integer.parseInt(sc.nextLine()); // converting str --> int
    String name = sc.nextLine();

    System.out.println(n + name);
}
}