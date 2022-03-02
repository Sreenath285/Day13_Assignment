import java.util.Scanner;

public class Maximum {

    public static <T extends Comparable<T>>void toPrintMax(T first, T second, T third) {
        T maximum = first;
        String position = "First";
        if (second.compareTo(maximum) > 0) {
            maximum = second;
            position = "Second";
        }
        if (third.compareTo(maximum) > 0){
            maximum = third;
            position = "Third";
        }

        System.out.println("Maximum number : " + maximum + "\nPosition : " + position);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers : ");
        float num1 = sc.nextFloat();
        float num2 = sc.nextFloat();
        float num3 = sc.nextFloat();
        toPrintMax(num1, num2, num3);
    }
}
