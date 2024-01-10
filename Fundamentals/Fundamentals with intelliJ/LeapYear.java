package bites.examples;

//All years divisible by 400 ARE leap years (e.g. 2000 was a leap year)
//All years divisible by 100 but not by 400 are NOT leap years (e.g. 1700, 1800 and 1900 were not leap years)
//All years divisible by 4 and not by 100 ARE leap years (e.g. 2004, 2008 and 2012 were leap years)
//All years not divisible by 4 are NOT leap years (e.g. 2009, 2010 and 2011 were not leap years)
public class LeapYear {
    public static Boolean isLeapYear(Integer year) {
        if (year % 400 == 0) {
            return true;
        } else if (year % 100 == 0 && year % 400 != 0) {
            return false;
        } else if (year % 4 == 0 && year % 100 != 0) {
            return true;
        } else if (year % 4 != 0) {
            return false;
        } else {
            return false;
        }
    }
    public static void main(String[] args) {
        System.out.println("Is the year 2000 a leap year? " + LeapYear.isLeapYear(2000));
        System.out.println("Is the year 1970 a leap year? " + LeapYear.isLeapYear(1970));
        System.out.println("Is the year 1900 a leap year? " + LeapYear.isLeapYear(1900));
        System.out.println("Is the year 1988 a leap year? " + LeapYear.isLeapYear(1988));
        System.out.println("Is the year 1500 a leap year? " + LeapYear.isLeapYear(1500));
    }
}
