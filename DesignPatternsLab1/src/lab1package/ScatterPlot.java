/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1package;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author erins
 */
public class ScatterPlot implements GraphStrategy {
 
    @Override
    public void graph(ArrayList data)
    {
        JOptionPane.showMessageDialog(null, "A scatter plot will be shown");
    }
    
}
