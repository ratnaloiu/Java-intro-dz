package task;

import java.util.Scanner;

public class TaskFour {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите целое число");
        String s = sc.nextLine();
        int iterations = s.length() + 1;
        int result = 0;
        for (int i = 1; i < iterations; i++) {
            result = result + Character.getNumericValue(s.charAt(i - 1));
        }
        System.out.println(result);
    }
}


