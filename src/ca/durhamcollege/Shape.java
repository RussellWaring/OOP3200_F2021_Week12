/**
 * @author  Russell Waring
 * @file    OOP3200 - Week 11, Java - Classes & Objects (continued)
 * @date    November 22nd, 2021
 * @description     Created while following along in class of week 11.
 */
package ca.durhamcollege;

import java.lang.reflect.Array;
import java.util.ArrayList;

public abstract class Shape
{
    // PRIVATE INSTANCE VARIABLES
    private ArrayList<Vector2D> vertices;
    private ArrayList<Line> edges;


    // PUBLIC PROPERTIES


    // CONSTRUCTORS
    Shape()
    {
        vertices.add(Vector2D.zero());
        edges.add(new Line());
    }

    Shape(Vector2D[] vertices)
    {
        build(vertices);
    }

    // PRIVATE METHODS
    private void build(Vector2D[] vertices)
    {
        // Adds all the vertices to the shape
        for (int i = 0; i < vertices.length; i++)
        {
            this.vertices.add(vertices[i]);
        }

        // Build edges
        for (int i = 0; i < this.vertices.size(); i++)
        {
            if (i < this.vertices.size() - 1)
            {
                this.edges.add(new Line(this.vertices.get(i), this.vertices.get(i+1)));
            }
            else
            {
                this.edges.add(new Line(this.vertices.get(i), this.vertices.get(0)));
            }
        }

        // vert 0 to vert 1
        // vert 1 to vert 2
        // vert 2 to vert 0 <- special case
    }

    public String toString()
    {
        String outputString = "";
        outputString += "------------------------------\n";
        outputString += "Vertices: \n";
        outputString += "------------------------------\n";
        for (var vertex: vertices)
        {
            outputString += vertex.toString() + "\n";
        }

        outputString += "\n------------------------------\n";
        outputString += "Edges: \n";
        outputString += "------------------------------\n";
        for (var edge: edges)
        {
            outputString += edge.toString() + "\n";
        }


        return outputString;
    }

    // PUBLIC METHODS

}
