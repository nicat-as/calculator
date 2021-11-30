import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        call();
        slash();
    }

    public boolean isPrime() {
        double nu = 47;
        double i;
        for (i = 2; i < nu; i++)
            if (nu % i == 0)
                break;

        if (nu == i)
            return true;
        else
            return false;

    }

    public static String print(int[] arr) {
        if (arr == null) {
            return "null";
        }
        int maxIndex = arr.length - 1;
        StringBuilder b = new StringBuilder();

        for (int i = 0; i < arr.length; i++) {
            b.append(arr[i]);
            if (i == maxIndex) {
                return b.append(']').toString();
            }
            b.append(", ");
        }
        return b.toString();
    }

    public static void call() {
        Scanner input = new Scanner(System.in);
        System.out.println("Write a number:");
        int inpu = input.nextInt();

        int count = 0;

        //1204405

        while (true) {
            if (inpu % 10 == 0) {
                count++;
            }
            inpu = inpu / 10;
            if (inpu == 0){
                break;
            }
        }
        System.out.println(count);
    }

    public static void slash(){
        String slash = "\\";
        String exc = "!";
        String backSlash = "/";
        int i, j;

        for (i = 0, j = 22; i <= 10; i=i+2, j=j-4) {
            System.out.println(slash.repeat(i) + exc.repeat(j) + backSlash.repeat(i));
        }
    }
}
