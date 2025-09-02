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
public class Engine implements DrawingEngine {
    private ArrayList<Shape>shapes;
    public Engine() {
        shapes=new ArrayList<>();
    }
    @Override
    public void addShape(Shape shape){
        shapes.add(shape);
    }
    @Override
     public void removeShape(Shape shape) {
        shapes.remove(shape);
    }

    @Override
    public Shape[] getShapes() {
        return shapes.toArray(Shape[]::new);
    }
    @Override
    public void setShapes(Shape[]shapes){
        this.shapes=new ArrayList<>(Arrays.asList(shapes));
    }
    @Override
    public void refresh(Graphics canvas) {
        canvas.clearRect(0,0,600,400);
        canvas.setColor(Color.WHITE);
        canvas.fillRect(0, 0,600, 400);
        for (Shape shape : shapes) 
            shape.draw(canvas);
    }
    
}
