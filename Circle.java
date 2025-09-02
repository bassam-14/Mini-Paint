/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab6;

import java.util.*;
import java.awt.*;

/**
 *
 * @author bassam
 */
public class Circle extends ShapeClass {

    public Circle(Point position, Color color, Color fillColor, double radius,int n) {
        this.position = position;
        this.color = color;
        this.fillColor = fillColor;
        properties.put("radius", radius);
        this.n=n;
    }

    @Override
    public Point getPosition() {
        return position;
    }

    @Override
    public void setPosition(Point position) {
        this.position = position;
    }

    @Override
    public Map<String, Double> getProperties() {
        return properties;
    }

    @Override
    public void setProperties(Map<String, Double> properties) {
        this.properties = properties;
    }

    @Override
    public Color getColor() {
        return color;
    }

    @Override
    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public Color getFillColor() {
        return fillColor;
    }

    @Override
    public void setFillColor(Color fillColor) {
        this.fillColor = fillColor;
    }

    @Override
    public void draw(Graphics canvas) {
        int diameter = (int) (2 * properties.get("radius"));
        if (color != null) {
            canvas.setColor(color);
            canvas.drawOval(position.x, position.y, diameter, diameter);
        }
        if (fillColor != null) {
            canvas.setColor(fillColor);
            canvas.fillOval(position.x, position.y, diameter, diameter);
        }
    }
    @Override
    public String toString(){
        return "circle"+n;
    }
}
