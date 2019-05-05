package com.Lhschools;

public class Main {

    public static void main(String[] args) {
	Scanner keyboard;
        int y;
        int w;
        int m;
        int d;
        int n;
        String rhyme;
        String day;
        String month;

        boolean loop = true;

        keyboard = new Scanner(System.in);

        System.out.println("Monday's child is fair of face,");
        System.out.println("Tuesday's child is full of grace,");
        System.out.println("Wednesday's child is full of woe");
        System.out.println("Thursday's child has far to go.");
        System.out.println("Friday's child is loving and giving,");
        System.out.println("Saturday's child works hard for a living,");
        System.out.println("But the child born on the Sabbath Day,");
        System.out.println("Is fair and wise and good in every way.");
        System.out.println();
	    
	 while (loop) {
         System.out.print("Hello there, based on the date of birth you provide,");
         System.out.println(" I will tell you what day of the week you were born on and what the poem says about you!");
         System.out.println("So, what year were you born on?");
         y = keyboard.nextInt();

         System.out.println("What month of that year were you born on? (in numbers)");
         m = keyboard.nextInt();

         System.out.println("What day of that month were you born on?");
         d = keyboard.nextInt();

         System.out.println("");
    }
}
