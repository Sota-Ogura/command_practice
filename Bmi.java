import java.util.*;
public class Bmi {
    public static void main(String[] args) {
        Scanner stdin = new Scanner( System.in ) ;
        double BMI , height , weight;
        weight = stdin.nextInt();
		height = stdin.nextDouble();
        BMI = weight / height / height;
        System.out.println(BMI);
        System.out.println(BMI);
    }
}