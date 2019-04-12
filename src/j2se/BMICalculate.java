package j2se;
import java.util.Scanner;

public class BMICalculate {
    public static void main(String[] args) {
    	Scanner s = new Scanner(System.in);
    	System.out.println("Please input height:");
    	float height = s.nextFloat();
    	System.out.println("Please input weight:");
    	float weight = s.nextFloat();
    	System.out.println("The current BMI is:"+weight/(height*height));
    }

}
