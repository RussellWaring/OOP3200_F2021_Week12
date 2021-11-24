/**
 * @author  Russell Waring
 * @file    OOP3200 - Week 11, Java - Classes & Objects (continued)
 * @date    November 22nd, 2021
 */
package ca.durhamcollege;

import java.util.Vector;

public class Main
{

    public static void main(String[] args)
    {
/*        try
        {
            Triangle triangle = new Triangle(new Vector2D(0,1), new Vector2D(2,0), new Vector2D(0,0));

            System.out.println(triangle.toString());
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }*/

        Circle circle = new Circle(new Vector2D(19.5f, 25.3f), 13.758f);

        System.out.println(circle.toString());

    }
}
