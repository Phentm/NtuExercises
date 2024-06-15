package JavaBasics.section12;

public class DriverDateUtil {

    public static void main(String[] args) {
        
        System.out.println(DateUtil.isLeapYear(1900));  // false
        System.out.println(DateUtil.isLeapYear(2000));  // true
        System.out.println(DateUtil.isLeapYear(2011));  // false
        System.out.println(DateUtil.isLeapYear(2012));  // true
        
        System.out.println(DateUtil.isValidDate(2012, 2, 29));  // true
        System.out.println(DateUtil.isValidDate(2011, 2, 29));  // false
        System.out.println(DateUtil.isValidDate(2099, 12, 31)); // true
        System.out.println(DateUtil.isValidDate(2099, 12, 32)); // false
        
        System.out.println(DateUtil.getDayOfWeek(1982, 4, 24));  // 6:Sat
        System.out.println(DateUtil.getDayOfWeek(2000, 1, 1));   // 6:Sat
        System.out.println(DateUtil.getDayOfWeek(2054, 6, 19));  // 5:Fri
        System.out.println(DateUtil.getDayOfWeek(2012, 2, 17));  // 5:Fri

        System.out.println(DateUtil.toString(2012, 2, 14)); // Tuesday 14 Feb 2012
        
    }

}
