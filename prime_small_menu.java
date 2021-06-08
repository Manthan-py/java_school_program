import java.util.Scanner ;
public class prime_small_menu
{
    public static void main()
    {
        System.out.println("*********************************Menu*********************************");
        System.out.println("1. To check the number is prime or composite.");
        System.out.println("2. To get the smallest digit from the number.");
        System.out.println("*********************************Menu*********************************");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        switch(choice) 
        {
            case 1:
                System.out.println("Enter the number to check : ");
                int num_check = sc.nextInt();
                int p=0;
                for (int i=1;i<=num_check;i++)
                {
                    if (num_check%i==0) 
                    {
                        p++;
                    }
                }
                if (p<=2) {
                    System.out.println("The entered number is prime");
                    System.out.println("*****************************Thank you*****************************");
                }
                else {
                    System.out.println("The entered number is composite");
                    System.out.println("*****************************Thank you*****************************");
                }
                break;
            case 2:
                System.out.println("Enter the number to give its smallest digit");
                int num = sc.nextInt();
                int smallest = 9;
                while (num!=0) {
                    int small = num%10;
                    smallest = Math.min(small,smallest);
                    num/=10;
                }
                System.out.println("The smallest digit is " + smallest);
                System.out.println("*****************************Thank you*****************************");
                break;
            default :
                System.out.println("Enter a valid menu number")
                System.out.println("*****************************Thank you*****************************")
        }
    }
}
