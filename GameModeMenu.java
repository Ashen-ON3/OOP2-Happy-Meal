import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GameModeMenu extends JFrame implements ActionListener {

    JButton pvp, ai, arcade;
    String playerName;

    public GameModeMenu(String name) {

        playerName = name;

        setTitle("Select Game Mode");
        setSize(900,600);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
        setLayout(new GridLayout(4,1));

        JLabel title = new JLabel("Choose Game Mode", JLabel.CENTER);

        pvp = new JButton("Player vs Player");
        ai = new JButton("Player vs AI");
        arcade = new JButton("Arcade Mode");

        pvp.addActionListener(this);
        ai.addActionListener(this);
        arcade.addActionListener(this);

        add(title);
        add(pvp);
        add(ai);
        add(arcade);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {

        new HeroSelection(playerName);

        dispose();
    }
}