/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package lab6;
/**
 *
 * @author bassam
 */
public interface DrawingEngine {
    public void addShape(Shape shape);
    public void removeShape(Shape shape);
    public Shape[]getShapes();
    public void setShapes(Shape[]shapes);
    public void refresh(java.awt.Graphics canvas);
}
