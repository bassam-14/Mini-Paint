/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package lab6;
import java.awt.*;
import java.util.*;
import java.io.*;
/**
 *
 * @author bassam
 */
public interface Shape extends Serializable {
    public void setPosition(Point position);
    public Point getPosition();
    public void setProperties(Map<String,Double>properties);
    public Map<String,Double> getProperties();
    public void setColor(Color color);
    public Color getColor();
    public void setFillColor(Color color);
    public Color getFillColor();
    public void draw(Graphics canvas);
}
