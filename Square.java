/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab6;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author bassam
 */
public class Square extends ShapeClass{
    public Square(Point position, Color color, Color fillColor, double side,int n) {
        this.position = position;
        this.color = color;
        this.fillColor = fillColor;
        properties.put("side",side);
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
        int side = (int)(1*properties.get("side"));
        if (color != null) {
            canvas.setColor(color);
            canvas.drawRect(position.x, position.y,side,side);
        }
        if (fillColor != null) {
            canvas.setColor(fillColor);
            canvas.fillRect(position.x, position.y,side,side);
        }
    }
        @Override
    public String toString(){
        return "square"+n;
    }
}
