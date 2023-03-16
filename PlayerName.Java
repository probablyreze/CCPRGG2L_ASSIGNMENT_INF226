import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.border.LineBorder;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PlayerName extends JFrame implements ActionListener {

    JTextField nameField;
    JButton submitButton;
    JLabel nameLabel;
    JLabel gameTitle;

    // Constructor
    PlayerName() {

        super("Brick Breaker - Enter Name"); // Title of window

        // Icon
        ImageIcon icon = new ImageIcon("icon.png");
        this.setIconImage(icon.getImage());

        // Image Background
        ImageIcon background = new ImageIcon("Stars.gif");
        JLabel label = new JLabel(background);
        label.setSize(710, 620);

        // gameTitle
        gameTitle = new JLabel("BRICK BREAKER");
        gameTitle.setBounds(125, 130, 450, 40);
        gameTitle.setForeground(Color.ORANGE); // Font color

        // Name label
        nameLabel = new JLabel("Enter your name:");
        nameLabel.setBounds(210, 225, 200, 35);
        nameLabel.setForeground(Color.ORANGE); // Font color

        // Name field
        nameField = new JTextField();
        nameField.setBounds(200, 270, 300, 30);
        nameField.setBorder(new LineBorder(Color.WHITE, 3, true));

        // Submit button
        submitButton = new JButton("Submit");
        submitButton.setBounds(295, 330, 100, 40);
        submitButton.setBackground(new Color(13, 14, 71)); 
        submitButton.setForeground(Color.WHITE);
        submitButton.setBorder(new LineBorder(Color.WHITE, 3, true));
        submitButton.addActionListener(this);

        // Create the font
        try {
            Font font = Font.createFont(Font.TRUETYPE_FONT, App.class.getResourceAsStream("Emulogic.ttf"));
            gameTitle.setFont(font.deriveFont(Font.PLAIN, 34));
            nameLabel.setFont(font.deriveFont(Font.PLAIN, 23));
            nameField.setFont(font.deriveFont(Font.PLAIN, 15));
            submitButton.setFont(font.deriveFont(Font.PLAIN, 13));
        } catch(Exception e) {
            e.printStackTrace();
        }

        // Add to window
        this.add(label);
        label.add(nameLabel);
        label.add(nameField);
        label.add(submitButton);
        label.add(gameTitle);

        // Dimensions
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(710, 620);
        this.setVisible(true);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == submitButton) {
            String playerName = nameField.getText();
            // Do something with the player name (e.g. display it in the game)
            dispose(); // Close the window
        }
    }
}
