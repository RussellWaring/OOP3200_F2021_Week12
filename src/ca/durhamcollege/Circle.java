/** Circle.java
 * @author  Russell Waring
 * @file    OOP3200 - Week 12, Java - Packages and Access Control
 * @date    December 1st, 2021
 * @description     Building off lesson from week 11. Following along with week 12p2.
 */
package ca.durhamcollege;

public class Circle extends Shape
{
    // ==========Private Instance Members
    private Vector2D center;
    private float radius;

    // ==========Public Properties
    public float getRadius()
    {
        return radius;
    }

    public void setRadius(float radius)
    {
        this.radius = radius;
    }

    public Vector2D getCenter()
    {
        return center;
    }

    public void setCenter(Vector2D center)
    {
        super.setVertex(center);
        this.center = center;
    }

    public void set(Vector2D center, float radius)
    {
        setCenter(center);
        setRadius(radius);
    }

    public float getCircumference()
    {
        return (float) (Math.PI * radius * 2);
    }

    @Override
    public float getArea()
    {
        return (float) (Math.PI * Math.pow(radius, 2));
    }

    // ==========Constructors
    public Circle(Vector2D center, float radius)
    {
        super();
        set(center, radius);
    }

    // ==========Private Methods

    // ==========Public Methods
    @Override
    public String toString()
    {
        String outputString = "";
        outputString += "------------------------------\n";
        outputString += "Circle\n";
        outputString += "------------------------------\n";
        outputString += "Center        : " + getCenter() + "\n";
        outputString += "Radius        : " + getRadius() + "\n";
        outputString += "Area          : " + getArea() + "\n";
        outputString += "Circumference : " + getCircumference() + "\n";
        outputString += "------------------------------\n";
        return outputString;
    }

    @Override
    public void Draw()
    {
        System.out.println("Now Drawing Circle!");
    }

    @Override
    public void Update()
    {

    }
}
