/**
 * @author  Russell Waring
 * @file    OOP3200 - Week 12, Java - Packages and Access Control
 * @date    December 1st, 2021
 * @description     Building off lesson from week 11. Following along with week 12p2.
 */
package ca.durhamcollege;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {
        //ArrayList<Drawable> drawables = new ArrayList<Drawable>(); // empty collection
        ArrayList<Shape> shapes = new ArrayList<Shape>();

        try
        {
            //drawables.add(new Circle(new Vector2D(10,20), 20));
            //drawables.add(new Triangle(new Vector2D(30,40), new Vector2D(50,60), new Vector2D(70,80)));

            shapes.add(new Circle(new Vector2D(10,20), 20));
            shapes.add(new Triangle(new Vector2D(30,40), new Vector2D(50,60), new Vector2D(50,30)));
            shapes.add(new Rectangle(new Vector2D(90,100), 40.0f, 40.0f));


            for (var shape: shapes)
            {
                System.out.println(shape); // because both have a ToString method, can be printed
            }

        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }

    }
}
