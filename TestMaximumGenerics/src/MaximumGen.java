import java.util.Scanner;

public class MaximumGen<T extends Comparable<T>> {

    T firstG, secondG, thirdG;

    public MaximumGen(T firstG, T secondG, T thirdG) {
        this.firstG = firstG;
        this.secondG = secondG;
        this.thirdG = thirdG;
    }
    
    public static void main(String[] args) {
        new MaximumGen<Integer>(12, 32, 9).toPrint();
        new MaximumGen<Double>(4.7, 4.8, 6.2).toPrint();
        new MaximumGen<String>("Peach", "Apple", "Banana").toPrint();

    }

    private void toPrint() {
        toPrintMax(firstG, secondG, thirdG);
    }

    public void toPrintMax(T first, T second, T third) {
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
}
