
public class Arithmetic {

    public static void main(String[] args) {
        
        /*
        --------------------------------README!!--------------------------------
        The following is simply a proof of concept for how command line
        arguments could be used. It barely works and should probably be
        overlooked (only works on Windows cmd.exe for some reason ¯\_(^-^)_/¯ )
        ------------------------------------------------------------------------
        */

        int a, b;
        char op;

        try {

            a = Integer.parseInt(args[0]);

            b = Integer.parseInt(args[1]);

            if (args[2].length() != 1) {
                throw new Exception("The operation argument must be a valid "
                        + "arithmetic argument (+, -, *, /)");
            }

            System.out.print(args[0] + args[2] + args[1] + "=");

            switch (args[2].charAt(0)) {
                case '+': System.out.println(a + b); break;
                case '-': System.out.println(a - b); break;
                case '*': System.out.println(a * b); break;
                case '/': System.out.println(a / b); break;
                default:
                    throw new Exception("The operation argument must be a "
                            + "valid arithmetic argument (+, -, *, /)");
            }

        } catch (Exception e) {
            System.out.println(e);
            System.out.println("INVALID ARGUMENTS");
        }

    }

}
