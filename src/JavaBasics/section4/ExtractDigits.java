package JavaBasics.section4;

public class ExtractDigits {

    public static void main(String[] args) {
        
        int number = 15423;                     //Number to be extracted from
        int temp = number;                      //Temporary storage variable
        
        while (temp > 10) {
            System.out.print(temp % 10 + " ");
            temp = temp / 10;
        }
        
        System.out.println(temp);
        
    }

}
