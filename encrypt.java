import java.util.*;
public class encrypt
{
    public static void main()
    {
        System.out.println("-------------------MENU-------------------");
        System.out.println("1. Encryption program");
        System.out.println("2. Decryption program");
        System.out.println("-------------------MENU-------------------");
        Scanner c = new Scanner(System.in);
        int Choice = c.nextInt();
        switch(Choice)
        {
            case 1 :
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the string to encrypt :-");
            String s1 = sc.nextLine();
            char c1;
            for (int i =0;i<s1.length();i++)
            {
                c1 = s1.charAt(i);
                int asc;
                asc = c1;
                asc++;
                char b = (char)asc;
                System.out.print(b);
            }
            System.out.println("\n");
            System.out.println("-------------------THANK YOU-------------------");
            break;
            case 2:
            Scanner sc2 = new Scanner(System.in);
            System.out.println("Enter the encypted string to decrypt :-");
            String s2 = sc2.nextLine();
            char c2;
            for (int i =0;i<s2.length();i++)
            {
                c2 = s2.charAt(i);
                int asc;
                asc = c2;
                asc--;
                char j = (char)asc;
                System.out.print(j);
            }
            System.out.println("\n");
            System.out.println("-------------------THANK YOU-------------------");
            break;
        }

    }
}