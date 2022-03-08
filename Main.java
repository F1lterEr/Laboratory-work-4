package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите кол-во элеметов массива:");
        int ch = scanner.nextInt();
        int[] nums = new int[ch];
        int ch1 = 0;
        for (int i = 0; i <= (ch-1); i++){
            System.out.println("Введите число с " + i + " индексом:");
            nums[i] = scanner.nextInt();
            ch1 += nums[i];
        }
        System.out.println("Ваш массив: " + Arrays.toString(nums));

        int min = nums[0];

        for (int i = 1; i < ch; i++) {
            if (nums[i] < min)

                min = nums[i];
        }
        System.out.println("Минимальное значение массива: " + min);
        System.out.println("Среднее арифметическое: " + (ch1/ch));
        System.out.println("Сумма минимального знчения массива и среднего арифметического числа: " + (min + (ch1/ch)));

    }
}
