import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import java.awt.*;

public class ColorMenu extends JFrame{

    // Jlist
    JList colorList;
    // Color arrays
    private String[] colorNameArray = {"GRAY", "LIGHT GRAY", "WHITE", "BLACK"};
    private Color[] colorClassArray = {Color.GRAY, Color.LIGHT_GRAY, Color.WHITE, Color.BLACK};
    
    ColorMenu(){

        // JLabel
        JLabel label = new JLabel();
        label.setText("Choose background color");
        label.setFont(new Font("Arial", Font.BOLD, 20));
        this.add(label);

        // Jlist
        colorList = new JList(colorNameArray);
        // Restricts to one selection
        colorList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        colorList.setFont(new Font("Arial", Font.BOLD, 25));

        // Add event
        BGColorEventHandler bgcolorHandler = new BGColorEventHandler();
        colorList.addListSelectionListener(bgcolorHandler);

        this.add(colorList);

        this.setLayout(new FlowLayout());
        this.setTitle("Snake Game");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(250,500);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        // set background color of frame
        this.getContentPane().setBackground(Color.MAGENTA);
        // lock frame
        this.setResizable(false);
    }

    // Event Handler
    private class BGColorEventHandler implements ListSelectionListener{

        public void valueChanged(ListSelectionEvent event){
            GamePanel gp = new GamePanel();
            gp.gameBGcolor = colorClassArray[colorList.getSelectedIndex()];

            // open game frame
            new GameFrame();

            // Close color menu
            dispose();
        }
    } 
    
}
