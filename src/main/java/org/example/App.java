package org.example;

/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solutions
 *  Copyright 2021 Chad Higgins
 */

/*
Sometimes you have to round up to the next number rather than follow standard rounding rules.

Calculate gallons of paint needed to paint the ceiling of a room.
Prompt for the length and width, and assume one gallon covers 350 square feet.
Display the number of gallons needed to paint the ceiling as a whole number.

Example Output
You will need to purchase 2 gallons of paint to cover 360 square feet.

Remember, you can’t buy a partial gallon of paint. You must
round up to the next whole gallon.

Constraints
Use a constant to hold the conversion rate.
Ensure that you round up to the next whole number.
 */

import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        Scanner in = new Scanner(System.in);

        int length = in.nextInt();
        int width = in.nextInt();

        int roomSize = length*width;

        int gallon = 350;
        int gallons = 1;

        while(roomSize-gallon > 0)
        {
            roomSize = roomSize-gallon;

            gallons += 1;
        }


        System.out.println("You will need to purchase " + gallons + " gallons of paint to cover " + length*width + " square feet.");
    }
}
