
import javax.swing.*;
import java.awt.event.*;

public class Table2 extends JFrame {
    JLabel l1;
    JTextField t1;
    JButton b1;
    JTextArea t2;

    public Table2() {
        setTitle("Multiplication Table Generator");
        setSize(400, 400);
        setLayout(null);

        l1 = new JLabel("Enter a number:");
        l1.setBounds(50, 50, 150, 30);
        add(l1);

        t1 = new JTextField();
        t1.setBounds(200, 50, 100, 30);
        add(t1);

        b1 = new JButton("Enter");
        b1.setBounds(150, 100, 100, 30);
        add(b1);

        t2 = new JTextArea();
        t2.setBounds(50, 150, 300, 200);
        add(t2);

        // Button click event
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    int num = Integer.parseInt(t1.getText());
                    StringBuilder sb = new StringBuilder();
                    for (int i = 1; i <= 10; i++) {
                        sb.append(num).append(" x ").append(i).append(" = ").append(num * i).append("\n");
                    }
                    t2.setText(sb.toString());
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Please enter a valid number.");
                }
            }
        });

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Table2();
    }
}
