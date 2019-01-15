import java.io.IOException;
import java.util.Scanner;

/**
 * Java program to find matching pairs of integers in a given array
 *
 * Created by Geeky Kelvin on 1/15/2019.
 * Email: Kelvinator4leo@gmail.com
 */
public class SockMerchant {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        int[] ar = {10, 20, 20, 10, 10, 30, 50, 10, 20};
        int result = sockMerchant(9, ar);
        System.out.println(result);
    }

    // Complete the sockMerchant function below.
    static int sockMerchant(int n, int[] ar) {

        //Sort the array first using bruteforce approach
        boolean flag = true;
        int temp;

        while(flag) {
            flag = false;
            for (int i = 0; i < ar.length-1; i++) {
                if (ar[i] > ar[i+1]) {
                    temp = ar[i];
                    ar[i] = ar[i+1];
                    ar[i+1] = temp;
                    flag = true;
                }
            }
        }

        //finding matching pairs in the sorted array
        int pairFound = 0;

        for (int i = 0; i < ar.length-1; i++) {
            //if pair exists:
            if (ar[i] == ar[i+1]) {
                //increase pairFound
                pairFound++;
                //move to next element in array
                i++;
            }
        }
        //Output
        return pairFound;
    }

}