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

        System.out.println("Maximum : " + maximum + "\nPosition : " + position);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three strings : ");
        String str1 = sc.next();
        String str2 = sc.next();
        String str3 = sc.next();
        toPrintMax(str1, str2, str3);
    }
}
