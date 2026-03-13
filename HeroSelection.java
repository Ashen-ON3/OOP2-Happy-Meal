import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class HeroSelection extends JFrame implements ActionListener {

    JButton mark, ted, den, ashley, vince, zack, clent, trone, backButton;
    String playerName;

    public HeroSelection(String playerName) {
        this.playerName = playerName;

        setTitle("Select Your Hero");
        setSize(900, 600);
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel mainPanel = new JPanel(new BorderLayout(10, 10));
        mainPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        JPanel heroPanel = new JPanel(new GridLayout(4, 2, 10, 10));

        mark = new JButton("Happy Mark");
        ted = new JButton("Happy Ted");
        den = new JButton("Happy Den");
        ashley = new JButton("Happy Ashley");
        vince = new JButton("Happy Vince");
        zack = new JButton("Happy Zack");
        clent = new JButton("Happy Clent");
        trone = new JButton("Happy Trone");

        JButton[] heroes = {mark, ted, den, ashley, vince, zack, clent, trone};
        for (JButton hero : heroes) {
            hero.addActionListener(this);
            heroPanel.add(hero);
        }

        mainPanel.add(heroPanel, BorderLayout.CENTER);

        backButton = new JButton("BACK");
        backButton.setFont(new Font("Arial", Font.BOLD, 20));
        backButton.setBackground(Color.LIGHT_GRAY);
        backButton.addActionListener(e -> {
            new GameModeMenu(playerName); 
            dispose(); 
        });

        JPanel backPanel = new JPanel();
        backPanel.add(backButton);
        mainPanel.add(backPanel, BorderLayout.SOUTH);

        add(mainPanel);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton selected = (JButton)e.getSource();
        JOptionPane.showMessageDialog(this,
                "You selected: " + selected.getText());
    }
}