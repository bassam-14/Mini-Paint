/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab6;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author bassam
 */
public class LineSegment extends ShapeClass{
    public LineSegment(Point position, Color color,double endX,double endY,int n) {
        this.position = position;
        this.color = color;
        fillColor=Color.WHITE;
        properties.put("endX",endX);
        properties.put("endY",endY);
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
        double x=properties.get("endX");
        double y=properties.get("endY");
        if (color != null) {
            canvas.setColor(color);
            canvas.drawLine(position.x,position.y,(int)x,(int)y);
        }
    }
        @Override
    public String toString(){
        return "line"+n;
    }
}
