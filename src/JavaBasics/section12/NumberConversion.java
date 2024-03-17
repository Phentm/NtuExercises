package JavaBasics.section12;

public class NumberConversion {

    public static void main(String[] args) {
        
        
        System.out.println(toRadix("1010101100001101", 2, 16));
        
        
        
        
    }
    
    
    public static String toRadix(String in, int inRadix, int outRadix) {        
        
        int decNum;
        String out = "", inStr = in.toLowerCase();
        
        decNum = toDec(inStr, inRadix);
        
        // Note on error handling:
        // error handling is not required for "in" and "inRadix" since it 
        // contains a call to "toDec()" which already contains error 
        // handling code for these variables.
        
        if (outRadix < 2 || outRadix > 36) {
            System.err.println("Output radix not in range (2-36)");
            return out;  
            
        }else if (outRadix == 10)
            return String.valueOf(decNum);
        
        // Building output string (based on the required radix)
        int rem;
        
        while (decNum != 0) {
            
            rem = decNum % outRadix;
            decNum /= outRadix;
            
            if (outRadix < 10)
                out = rem + out;
            
            else {
                if (rem > 9)
                    out = (char)(rem + 87) + out;
                else
                    out = rem + out;
            }
        }
        
        return out.toUpperCase();
    }
    
    
    public static int toDec(String in, int inRadix) {
        
        // Error handling
        if (in.equals("") || !validateRadix(in, inRadix))
            return 0;
        else if (inRadix == 10)
            return Integer.parseInt(in);
        
        int decSum = 0, len = in.length();
        String inStr = in.toLowerCase();
        
        // Adding powers of "inRadix" from LSD (inRadix^0) to MSD
        for (int i = 0; i < len; i++) {
            
            char c = inStr.charAt(len - i - 1);
            
            if (c >= 48 && c <= 57)
                decSum += Math.pow(inRadix, i) * (c-48);
            else    
                decSum += Math.pow(inRadix, i) * (c-87);
        }
        return decSum;
    }
    
    // using regex: "[0-9a-f]+"
    public static boolean validateRadix(String in, int radix) {
        
        if (radix < 2 || radix > 36) {
            System.err.println("Radix is out of range (2-36)");
            return false;
        }
        
        String regex, inStr = in.toLowerCase();
        
        if (radix < 11)
            regex = "[0-" + (radix - 1) + "]+";
        
        else
            regex = "[0-9a-" + (char)('a' + (radix-11) ) + "]+";
        
        if (!inStr.matches(regex)) {
            System.err.println("Number does not match radix");
            return false;
        }
        
        return true;
    }

}
