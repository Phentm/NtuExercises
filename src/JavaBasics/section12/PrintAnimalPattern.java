package JavaBasics.section12;

public class PrintAnimalPattern {

    public static void main(String[] args) {
        
        /*
        
                  '__'
                  (©©)
          /========\/
         / || %% ||
        *  ||----||
           ¥¥    ¥¥
           ""    ""
        
        */
        
        System.out.println("          '__'\n          (\u00A9\u00A9)\n"
                + "  /========\\/\n / || %% ||\n*  ||----||\n"
                + "   \u00A5\u00A5    \u00A5\u00A5\n   \"\"    \"\"");
        
        System.out.printf("          '__'\n          (\u00A9\u00A9)\n"
                + "  /========\\/\n / || %%%% ||\n*  ||----||\n"
                + "   \u00A5\u00A5    \u00A5\u00A5\n   \"\"    \"\"\n");
        
    }

}
