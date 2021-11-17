package at.campus02.wagenhofer;

public class LottoZahlenApp {
    public static void main(String[] args) {

        int size = 6;
        int maxNumber = 45;

        for (int i = 0; i < size; i++) {
            System.out.printf("Random Number: " + generateRandomNumbers(size,maxNumber)[i] + "\n");
        }
    }

    public static int[] generateRandomNumbers(int size, int maxNumber){

        int[] number = new int[size];

        for (int i = 0; i < size; i++) {
            number[i] = (int) (Math.random() * maxNumber + 1);
        }

        return number;
    }
}
