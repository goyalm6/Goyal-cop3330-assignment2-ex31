/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution, Exercise 31
 *  Copyright 2021 Mayank Goyal
 */

package ex31;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int inputAge;
        int inputRestingPulse;

        while(true)
        {
            System.out.print("Resting Pulse : ");
            String input = scanner.next();

            if(isNumeric(input))
            {
                inputRestingPulse = Integer.parseInt(input);
                break;
            }
            else
            {
                System.out.println("Invalid Pulse");
            }
        }

        while(true)
        {
            System.out.print("Age : ");
            String input = scanner.next();
            if(isNumeric(input))
            {
                inputAge = Integer.parseInt(input);
                break;
            }
            else
            {
                System.out.println("Invalid Age");
            }
        }

        System.out.printf("\nResting Pulse: %d\tAge: %d\n", inputRestingPulse, inputAge);

        System.out.printf("\nIntensity\t| Rate\n");
        System.out.printf("------------|--------\n");

        for(int intensity = 55 ; intensity <= 95 ; intensity += 5)
        {
            int rate = getHeartRate(inputAge, inputRestingPulse, intensity);
            System.out.println(intensity+"%\t\t\t| "+rate+" bpm");
        }
        scanner.close();
    }

    static int getHeartRate(int inputAge, int inputRestingPulse, int intensity) {
        int rate = (((220 - inputAge) - inputRestingPulse) * intensity /100) + inputRestingPulse;
        return rate;
    }

    static boolean isNumeric(String input)
    {
        try
        {
            Integer.parseInt(input);
        }
        catch(Exception e)
        {
            return false;
        }
        return true;
    }
}
