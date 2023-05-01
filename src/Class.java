import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Class {
    static int user_number = 0, sum_even = 0, sum_odd = 0, even_counter = 0, odd_couter = 0;
    static List<Integer> evenNums = new ArrayList<>(); // declarar lista vacia sin tamaño
    static List<Integer> oddNums = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter en number Sr/Sra: ");
        user_number = sc.nextInt();

        for (int i = 1; i < user_number+1; i++) {
            if (i % 2 == 0) { //gives me the given numbers
                even_counter++; // <-correct  // error -> even_counter = i++;
                sum_even += i; // OR sum_even = sum_even + i;
                evenNums.add(i);
            } else {
                odd_couter++;
                sum_odd += i; // OR sum_odd = sum_odd + i;
                oddNums.add(i);
            }
        }

        System.out.println("Total even numbers: " + even_counter + "\nThe sum of all even numbers " + sum_even);
        System.out.println("Total odd numbers: " + even_counter + "\nThe sum of all odd numbers " + sum_odd);
        System.out.print("Even numbers: ");
        for (int i = 0; i < evenNums.size()-1; i++) {
            System.out.print(evenNums.get(i)+" "); //<-Correct// Error -> System.out.print(i);
        }
        System.out.print("\nodd numbers: ");
        for (Integer oddNum : oddNums) {
            System.out.print(oddNum+ " ");
        }
    }

}
