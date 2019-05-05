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
	 w = Formula(d,m,y);
	 rhyme = TNR(w);
	 day = DOW(w);
	 n = NODIM(m, y);
	 month = month(m);
		 
	 System.out.println("You were born on a " + day + "!");
	 System.out.println("Also, The Nursery Rhyme says that you " + rhyme);
	 System.out.println("");	 
    }
	public static int Formula (int d, int m, int y) {
        if (m == 1 || m == 2) {
            m += 12;
            y -= 1;
        }
        int e = y % 100;
        int c = y / 100;
        int w = (d + (13 * (m + 1) / 5) + e + (e / 4) + (c / 4) + (5 * c)) % 7;
        return w;    
}
public static String TNR(int h){
        String rhyme;

        switch (h) {
            case 0:
                rhyme = "are fair of face!";
                break;
            case 1:
                rhyme= "are full of grace!";
                break;
            case 2:
                rhyme = "are full of woe!";
                break;
            case 3:
                rhyme = "have far to go!";
                break;
            case 4:
                rhyme = "are loving and giving!";
                break;
            case 5:
                rhyme = "work hard for a living!";
                break;
            case 6:
                rhyme = "are fair and wise and good in every way!";
                break;
            default:
                rhyme = "error!";
                break;
        }
        return rhyme;
}
    public static String DOW(int w){
        String day;
        switch (w) {
            case 0:day = "Saturday";
                break;
            case 1:  day = "Sunday";
                break;
            case 2:  day = "Monday";
                break;
            case 3:  day = "Tuesday";
                break;
            case 4:  day = "Wednesday";
                break;
            case 5:  day = "Thursday";
                break;
            case 6:  day = "Friday";
                break;
            default: day = "error!";
                break;
        }
        return day;
    }
public static int NODIM(int m, int year){
        int n;
        int leap;
        leap = year % 400;

        switch(m){
            case 1 : n = 31;
                break;
            case 2 :
                if (leap == 0) {
                    n = 29;
                } else {
                    n = 28;
                }
                break;
            case 3 : n = 31;
                break;
            case 4 : n = 30;
                break;
            case 5 : n = 31;
                break;
            case 6 : n = 30;
                break;
            case 7 : n = 31;
                break;
            case 8 : n = 31;
                break;
            case 9: n = 30;
                break;
            case 10 : n = 31;
                break;
            case 11 : n = 30;
                break;
            case 12 : n = 31;
                break;
            default: n = 0;
                break;
        }
        return n;
public static String month(int m){
        String month;
        switch(m){
            case 1:
                month = "January";
                break;
            case 2:
                month = "February";
                break;
            case 3:
                month = "March";
                break;
            case 4:
                month = "April";
                break;
            case 5:
                month = "May";
                break;
            case 6:
                month = "June";
                break;
            case 7:
                month= "July";
                break;
            case 8:
                month = "August";
                break;
            case 9:
                month = "September";
                break;
            case 10:
                month = "October";
                break;
            case 11:
                month = "November";
                break;
            case 12:
                month = "December";
                break;
            default:
                month = "error!";
        }
        return month;
    }

}
