package snake;

import java.awt.*;
import java.awt.event.ActionListener;

import javax.swing.*;
import snake.Board.*;

public class Game extends JFrame {

    Game() {
        add(new Board());
        setResizable(false);
        pack();
        setTitle("Tan Zhi Quan 1605893 (Snake)");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {

        // Creates a new thread so our GUI can process itself
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame frame = new Game();
                frame.setVisible(true);
            }
        });
    }
}