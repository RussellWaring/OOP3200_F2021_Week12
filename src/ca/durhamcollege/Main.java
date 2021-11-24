/**
 * @author  Russell Waring
 * @file    OOP3200 - Week 11, Java - Classes & Objects (continued)
 * @date    November 22nd, 2021
 */
package ca.durhamcollege;

public class Main
{

    public static void main(String[] args)
    {
        try
        {
            Triangle triangle = new Triangle(new Vector2D(0,1), new Vector2D(2,0), new Vector2D(0,0));

            System.out.println(triangle.toString());
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }


    }
}
