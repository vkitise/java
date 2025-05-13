import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class swing{
public static void main(String[] args) {
JFrame frame = new JFrame("Swing Event Handling Example");
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
JPanel panel = new JPanel();
JButton alphaButton = new JButton("Alpha");
JButton betaButton = new JButton("Beta");
ActionListener alphaListener = new ActionListener() {

public void actionPerformed(ActionEvent e) {
JOptionPane.showMessageDialog(frame, "Alpha pressed");
}
};
ActionListener betaListener = new ActionListener() {
public void actionPerformed(ActionEvent e) {
JOptionPane.showMessageDialog(frame, "Beta pressed");
}
};
alphaButton.addActionListener(alphaListener);
betaButton.addActionListener(betaListener);
panel.add(alphaButton);
panel.add(betaButton);
frame.getContentPane().add(panel, BorderLayout.CENTER);
frame.setSize(300, 200);
frame.setVisible(true);
}
}