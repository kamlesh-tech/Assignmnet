package CoreJava1;

import java.util.*;

class Q9 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of day");
        int days = sc.nextInt();
        int year = days / 365;
        int m = days % 365;
        int week = m / 7;
        int k = m % 7;
        int day = k;
        System.out.println("The year in the day is " + year);
        System.out.println("The week in the day is " + week);
        System.out.println("The remaining day is " + day);
    }
}
