import java.util.*;
public class factor
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to find it's factor");
        int num = sc.nextInt();
        System.out.print("The factors of the given number are :- ");
        for (int i = 1;i<=num;i++) {
            //num = num/i;
            if (num%i==0) {
                System.out.print(i+",");
            }
        }
    }
}