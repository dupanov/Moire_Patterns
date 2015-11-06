
 /*
 * Example code for Think Java (http://thinkapjava.com)
 *
 * Copyright(c) 2011 Allen B. Downey
 * GNU General Public License v3.0 (http://www.gnu.org/copyleft/gpl.html)
 *
 * @author Allen B. Downey
 */

import com.sun.istack.internal.NotNull;

import java.awt.*;
import javax.swing.*;
import java.awt.Graphics;
import java.awt.Color;

import static java.awt.Dialog.*;


 public class Moire extends Canvas {
    public void paint(Graphics g) {

        int i = 3;
        Rectangle bb = new Rectangle(getWidth()/2, getHeight()/2 , i, i );
        while (bb.width < getWidth()) {
            bb.grow(i, i);
            g.drawOval (bb.x, bb.y,  bb.width, bb.height);
        }

    }



    public static void main(String[] args) {
        // make the frame
        JFrame frame1 = new JFrame();
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // add the canvas
        Canvas canvas = new Lines();
        canvas.setSize(400, 400);
        canvas.setBackground(Color.white);
        frame1.getContentPane().add(canvas);

        // show the frame
        frame1.pack();
        frame1.setVisible(true);

        /*JFrame frame2 = new JFrame();
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // add the canvas
        Canvas canvas2 = new Lines();
        canvas.setSize(400, 400);
        canvas.setBackground(Color.white);
        frame2.getContentPane().add(canvas2);

        // show the frame
        frame2.pack();
        frame2.setVisible(true);*/
    }
 }

 class Lines extends Canvas {
     public void paint(Graphics g) {
         for (int j = 0; j < this.getWidth(); j+=20) {
               g.drawLine(j, 0, this.getWidth()-j, this.getHeight());
         }
         for (int j = 0; j < this.getHeight(); j+=20) {
             g.drawLine(0, j, this.getWidth(), this.getHeight()-j);
         }
     }
}



