package newpackage;


import javax.swing.JLabel;
import javax.swing.JPanel;

class MyPanel extends JPanel{

    public MyPanel(){
        super();
        showGUI();
    }

    private JLabel[] createLabels(){
        
        JLabel[] labels=new JLabel[10];
        for (int i=0;i<10;i++){
            labels[i]=new JLabel("message" + i);
        }
        return labels;
    }

    public void showGUI(){
        JLabel[] labels=createLabels();
        for (int i=0;i<10;i++){
            this.add(labels[i]);
        }
    }



 public static void main(String[] args) 
 
 {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MyPanel().setVisible(true);
            }
        });
     
 
 
 
 }
 
 
 
 
 
 
 
 
}
