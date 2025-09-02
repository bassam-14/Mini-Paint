/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab6;

import java.awt.Color;
import java.awt.Point;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author bassam
 */
public abstract class ShapeClass implements Shape{
    protected Point position;
    protected Map<String, Double> properties = new HashMap<>();
    protected Color color;
    protected Color fillColor;
    protected int n;
}
