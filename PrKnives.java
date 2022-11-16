
//AUTOR KNIVES

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class prKnives {
        public static void main(String[] args) {
                prKnives f = new prKnives();
        }

        static JFrame f;
        static JFrame f1;
        static JButton b1;

        JLabel title;

        public prKnives() {
                f = new JFrame("KNIVES");
                f.setLayout(null);
                f.setBounds(200, 200, 1200, 600);
                f.setSize(1200, 600);
                f.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
                Components();
                f.setVisible(true);
        }

        public static void graph() {
                f1 = new JFrame("Grafica");
                f1.setLayout(null);
                f1.setSize(500, 500);
                f1.setBounds(500, 200, 500, 500);
                f1.setVisible(true);
        }

        public void Components() {
                title = new JLabel("Titulo");
                f.setLayout(null);
                title.setBackground(new java.awt.Color(0, 162, 255));
                title.setBounds(280, 30, 500, 70);
                title.setOpaque(true);
                title.setFont(new java.awt.Font("Century Gothic", 5, 30));
                title.setHorizontalAlignment(SwingConstants.CENTER);
                f.add(title);

                JButton b1 = new JButton();
                b1.setText("Click");
                b1.setBounds(500, 300, 100, 40);
                b1.setLayout(null);
                b1.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent arg0) {
                                graph();
                        }
                });
                f.add(b1);

        }

}
