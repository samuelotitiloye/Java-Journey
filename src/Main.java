public class Main {

    public static void main(String[] args) {
        System.out.println(LeapYear.isLeapYear(2017));
    }
}
//git repo name change
// The following years are not leap years:
// 1700, 1800, 1900, 2100, 2200, 2300, 2500, 2600
// This is because they are evenly divisible by 100 but not by 400.

// The following years are leap years:
// 1600, 2000, 2400
// This is because they are evenly divisible by both 100 and 400.


// * isLeapYear(-1600); → should return false since the parameter is not in range (1-9999)

// * isLeapYear(1600); → should return true since 1600 is a leap year

// * isLeapYear(2017); → should return false since 2017 is not a leap year

// * isLeapYear(2000);  → should return true because 2000 is a leap year