package JavaBasics.section12;

public class DateUtil {
    
    public static final String[] strMon= {"Jan", "Feb", "Mar", "Apr", "May", "Jun", 
                                   "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
    
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
    }
    
    public static boolean isValidDate(int year, int month, int day) {
        if (year > 9999 || year < 1)
            return false;
        
        if (month > 12 || month < 1)
            return false;
        
        if (day > 28 || day < 1) {
            switch (month) {
                case 1:
                    return day <= 31;
                case 2:
                    return isLeapYear(year);
                case 3:
                    return day <= 31;
                case 4:
                    return day <= 30;
                case 5:
                    return day <= 31;
                case 6:
                    return day <= 30;
                case 7:
                    return day <= 31;
                case 8:
                    return day <= 31;
                case 9:
                    return day <= 30;
                case 10:
                    return day <= 31;
                case 11:
                    return day <= 30;
                case 12:
                    return day <= 31;
                default:
                    return false;
            }
        }
        
        return true;
    }
    
    public static int getDayOfWeek(int year, int month, int day) {
        
        if (!isValidDate(year, month, day))
            return -1;
        
        int corrCent = 6 - (((year%400)/100)*2), corrMon;
        
        switch (month) {
            case 1:
                if (isLeapYear(year))
                    corrMon = 6;
                else
                    corrMon = 0;
                break;
            case 2:
                if (isLeapYear(year))
                    corrMon = 2;
                else
                    corrMon = 3;
                break;
            case 3:
                corrMon = 3;
                break;
            case 4:
                corrMon = 6;
                break;
            case 5:
                corrMon = 1;
                break;
            case 6:
                corrMon = 4;
                break;
            case 7:
                corrMon = 6;
                break;
            case 8:
                corrMon = 2;
                break;
            case 9:
                corrMon = 5;
                break;
            case 10:
                corrMon = 0;
                break;
            case 11:
                corrMon = 3;
                break;
            case 12:
                corrMon = 5;
                break;
            default:
                corrMon = -1;
                break;
        }
        
        return (corrCent + (year % 100) + ((year % 100)/4) + corrMon + day) % 7;
    }
    
    public static String toString(int year, int month, int day) {
        
        String finalStr = "";
        
        switch (getDayOfWeek(year, month, day)) {
            case 0:
                finalStr += "Sunday ";
                break;
            case 1:
                finalStr += "Monday ";
                break;
            case 2:
                finalStr += "Tuesday ";
                break;
            case 3:
                finalStr += "Wednesday ";
                break;
            case 4:
                finalStr += "Thursday ";
                break;
            case 5:
                finalStr += "Friday ";
                break;
            case 6:
                finalStr += "Saturday ";
                break;
            case -1:
                return finalStr;
        }
        
        return finalStr + day + " " + strMon[month-1] + " " + year;
        
    }
    
}
