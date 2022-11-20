import java.awt.Color;
import java.awt.Dimension;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Interfaz extends JFrame {

        static int xCast;
        static int yCast;

        static int wp = 950;
        static int hp = 700;

        static int wp2 = 500;
        static int hp2 = 500;

        static int esc = 20;

        public static void main(String[] args) {
                Interfaz pl = new Interfaz();
                pl.setVisible(true);
        }


        public Interfaz() {
                setTitle("Interfaz");
                setBounds(100, 100, wp, hp);
                setMinimumSize(new Dimension(wp, hp));
                setResizable(false);
                setLayout(null);
                startComponents();
                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);;
        }

        public void startComponents() {
                JPanel df = new JPanel();
                df.setBackground(Color.WHITE);
                df.setBounds(0, 0, wp, hp);
                df.setLayout(null);
                getContentPane().add(df);

                JPanel df2 = new JPanel();
                df2.setBounds(400, 100, wp2+2, hp2+2);
                df2.setLayout(null);
                df2.setBorder(BorderFactory.createLineBorder(Color.BLACK));
                df.add(df2);


                JPanel plc = new JPanel();
                plc.setBounds(1, 1, wp2, hp2);
                plc.setLayout(null);
                df2.add(plc);


                JLabel title = new JLabel();
                title.setText("TITULO");
                title.setBackground(new java.awt.Color(0, 162, 255));
                title.setBounds(0, 0, wp, 70);
                title.setOpaque(true);
                title.setFont(new java.awt.Font("Century Gothic", 5, 30));
                title.setHorizontalAlignment(SwingConstants.CENTER);
                df.add(title);

                JLabel VX = new JLabel();
                VX.setText("Valor de X : ");
                VX.setBounds(100, 150, 90, 50);
                df.add(VX);

                JTextField vx1 = new JTextField();
                vx1.setBounds(200, 160, 100, 30);
                df.add(vx1);

                JLabel VY = new JLabel();
                VY.setText("Valor de Y : ");
                VY.setBounds(100, 200, 90, 50);
                df.add(VY);

                TextField vy1 = new TextField();
                vy1.setBounds(200, 210, 100, 30);
                df.add(vy1);

                JLabel ValXY = new JLabel();
                ValXY.setBounds(50, 360, 180, 100);
                df.add(ValXY);

                JButton b1 = new JButton();
                b1.setBounds(200, 260, 100, 40);
                b1.setBackground(new java.awt.Color(0, 162, 255));
                b1.setText("Activar");
                b1.setLayout(null);

                getContentPane().addMouseListener(new MouseAdapter() {
                        @Override
                        public void mouseClicked(MouseEvent e) {
                                if (e.getButton()==1) {
                                        esc++;
                                } else if (e.getButton()==3) {
                                        esc--;
                                }
                                Plano p = new Plano(plc, esc);
                                p.dibujar();
                                p.dibujarPunto(xCast,yCast);
                        }
                });

                b1.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent arg0) {
                                xCast = Integer.parseInt(vx1.getText());
                                yCast = Integer.parseInt(vy1.getText());
                                ValXY.setText(xCast + " + " + yCast + " = " + (xCast + yCast));
                                Plano p = new Plano(plc, esc);
                                p.dibujar();
                                p.dibujarPunto(xCast,yCast);
                        }
                });

                df.add(b1);
        }
}
