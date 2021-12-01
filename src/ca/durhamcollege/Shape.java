/**
 * @author  Russell Waring
 * @file    OOP3200 - Week 12, Java - Packages and Access Control
 * @date    December 1st, 2021
 * @description     Building off lesson from week 11. Following along with week 12p2.
 */
package ca.durhamcollege;

import java.lang.reflect.Array;
import java.util.ArrayList;

public abstract class Shape
{
    // PRIVATE INSTANCE VARIABLES
    private ArrayList<Vector2D> vertices;
    private ArrayList<Line> edges;


    // ==========PUBLIC PROPERTIES
    public void setVertices(Vector2D[] vertices)
    {
        build(vertices);
    }

    public void setVertex(Vector2D vertex)
    {
        // vertices.clear();
        // vertices.add(vertex);
        Vector2D[] vertices = {vertex};
        build(vertices);
    }

    // ==========CONSTRUCTORS
    // empty constructor
    Shape()
    {
        initialize();
        vertices.add(Vector2D.zero());
        edges.add(new Line());
    }

    // parameterized constructor
    Shape(Vector2D[] vertices)
    {
        initialize();
        setVertices(vertices);
    }

    // ==========PRIVATE METHODS

    /**
     * Initializes two empty ArrayLists to be used for the Shape Class
     */
    private void initialize()
    {
        vertices = new ArrayList<Vector2D>();
        edges = new ArrayList<Line>();
    }
    private void build(Vector2D[] vertices)
    {
        this.vertices.clear();
        this.edges.clear();

        // adds all the vertices to the shape
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

    @Override
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

    // ==========PUBLIC METHODS

}
