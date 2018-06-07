package newpackage;
import java.util.Scanner;
    import javax.swing.JFrame;
    import javax.swing.*;
    import java.awt.*;
    import java.awt.event.*;

    //put in a file called area.java
    public class area extends JFrame{


            int[] myArray;
            JTextArea area = new JTextArea();
     //constructor 
     area(){
            myArray = new int[3];
            myArray[0] = 1;
            myArray[1] = 2;
            myArray[2] = 3;




    for (int i=0; i<myArray.length; i++)
    {
            area.append( myArray[i]+"\t");
    }
    add(area);

       }
    public static void main(String args[]) {

         area gui = new area();
         gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         gui.setSize(400,200);
         gui.setVisible(true);
       }
    }