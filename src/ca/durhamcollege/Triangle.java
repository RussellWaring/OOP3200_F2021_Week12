/** Triangle.java
 * @author  Russell Waring
 * @file    OOP3200 - Week 12, Java - Packages and Access Control
 * @date    December 1st, 2021
 * @description     Building off lesson from week 11. Following along with week 12p2.
 */
package ca.durhamcollege;

public class Triangle extends Shape
{
    // Private Instance Members

    // Constructors

    /**
     * Constructs a Triangle with three points (p1, p2, p3)
     * @param p1 the first point
     * @param p2 the second point
     * @param p3 the third point
     */
    Triangle(Vector2D p1, Vector2D p2, Vector2D p3) throws Exception
    {
        super();
        setVertices(p1, p2, p3);
    }

    /**
     * Constructs a Triangle from a Vector2D Array of points.
     * The Vector2D must have a minimum size of 3 for this constructor to be used
     *
     * @param vertices Vector2D Array to be passed to the constructor
     * @throws Exception throws an Exception if the size f the vertices array is less than 3
     */
    Triangle(Vector2D[] vertices) throws Exception
    {
        super();
        if(vertices.length >= 3)
        {
            setVertices(vertices[0], vertices[1], vertices[2]);
        }
        else
        {
            throw new Exception("ERROR: Triangle constructed with less than 3 vertices");
        }

    }

    // ==========Public Properties

    @Override
    public float getArea()
    {
        Vector2D A = getVertices().get(0);
        //System.out.println("DEBUG: " + A);

        Vector2D B = getVertices().get(1);
        Vector2D C = getVertices().get(2);
        var firstTerm = A.getX() * (B.getY() - C.getY());
        //System.out.println("DEBUG: " + firstTerm);
        var secondTerm = B.getX() * (C.getY() - A.getY());
        var thirdTerm = C.getX() * (A.getY() - B.getY());

        return Math.abs((firstTerm + secondTerm + thirdTerm)/2);
    }

    // ==========Private Methods
    // ==========Public Methods

    /**
     * Sets the values of the Vertices of the Triangle.
     * If values for these points already exist, they are overwritten. Overridden(?).
     * @param p1 the first point
     * @param p2 the second point
     * @param p3 the third point
     */
    public void setVertices(Vector2D p1, Vector2D p2, Vector2D p3) throws Exception
    {
        Vector2D[] vertices = {p1, p2, p3};

        // check if any of the Vector2Ds are the same
        if ((p1.equals(p2)) || (p1.equals(p3)) || (p2.equals(p3)))
        {
            throw new Exception("ERROR: Triangle constructed with at least one duplicate vertex.");
        }
        else
        {
            super.setVertices(vertices);
        }
    }

    public String toString()
    {
        String outputString = "";
        outputString += "------------------------------\n";
        outputString += "Triangle\n";
        outputString += super.toString();
        outputString += "------------------------------\n";
        //outputString += "Perimeter     : " + getPerimeter() + "\n";
        outputString += "Area          : " + getArea() + "\n";
        return outputString;
    }

    @Override
    public void Draw()
    {
        System.out.println("Now Drawing Triangle!");
    }

    @Override
    public void Update()
    {

    }
}
