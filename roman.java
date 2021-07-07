package com.company;

import java.util.Scanner;

public class roman {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        int ones = (num)%10;
        int tens = ((num/10)%10);
        int hundred = ((num/100)%10);
        int thousand = ((num/1000)%10);
//        System.out.println(ones);
//        System.out.println(tens);
//        System.out.println(hundred);
//        System.out.println(thousand);
        String rom = "";
        if (ones==1) {
            rom = "I";
        }
        else if (ones==2) {
            rom="II";
        }
        else if (ones==3) {
            rom="III";
        }
        else if (ones==4) {
            rom="IV";
        }
        else if (ones==5) {
            rom="V";
        }
        else if (ones==6) {
            rom="VI";
        }
        else if (ones==7) {
            rom="VII";
        }
        else if (ones==8) {
            rom="VIII";
        }
        else if (ones==9) {
            rom="IX";
        }
//        System.out.print(rom);
        String romT = "";
        if (tens==1) {
            romT = "X";
        }
        else if (tens==2) {
            romT="XX";
        }
        else if (tens==3) {
            romT="XXX";
        }
        else if (tens==4) {
            romT="XL";
        }
        else if (tens==5) {
            romT="L";
        }
        else if (tens==6) {
            romT="LX";
        }
        else if (tens==7) {
            romT="LXX";
        }
        else if (tens==8) {
            romT="LXXX";
        }
        else if (tens==9) {
            romT="XC";
        }
        String romH = "";
        if (hundred==1) {
            romH = "C";
        }
        else if (hundred==2) {
            romH="CC";
        }
        else if (hundred==3) {
            romH="CCC";
        }
        else if (hundred==4) {
            romH="CD";
        }
        else if (hundred==5) {
            romH="D";
        }
        else if (hundred==6) {
            romH="DC";
        }
        else if (hundred==7) {
            romH="DCC";
        }
        else if (hundred==8) {
            romH="DCCC";
        }
        else if (hundred==9) {
            romH="CM";
        }
        String romTh = "";
        if (thousand==1) {
            romTh = "M";
        }
        else if (thousand==2) {
            romTh="MM";
        }
        else if (thousand==3) {
            romTh="MMM";
        }
        else if (thousand==4) {
            romTh="MV\u0304";
        }
        else if (thousand==5) {
            romTh="V\u0304";
        }
        else if (thousand==6) {
            romTh="V\u0304M";
        }
        else if (thousand==7) {
            romTh="V\u0304MM";
        }
        else if (thousand==8) {
            romTh="V\u0304MMM";
        }
        else if (thousand==9) {
            romTh="MX\u0304";
        }
        System.out.print("Roman number : ");
        System.out.println(romTh+romH+romT+rom);
    }
}
