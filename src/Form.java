import javax.swing.*;
import java.awt.*;


public class Form extends JFrame {
    private JFrame mainFrame;
    private JLabel NameLabel,fLabel,slabel;
    private JTextField nameField;

    JCheckBox cb1,cb2,cb3,cb4;
    JPanel jpanel1 = new JPanel();
    JPanel jPanel2 = new JPanel();
    JRadioButton radioButton1;
    JRadioButton radioButton2;
    JComboBox jComboBox;
    JPanel jpanel = new JPanel();


    JPanel jpanel3 = new JPanel();
    JList jlist ;
    JButton button1,button2;
    JPanel mainPanel;

    Form(){

        mainFrame = new JFrame("Hello this is New Frame");
        mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel,1));
        NameLabel = new JLabel();
        NameLabel.setText("Enter Your Name :");
        nameField = new JTextField();
        nameField.setText("name");
        jpanel.setLayout(new BoxLayout(jpanel,0));
        jpanel.add(NameLabel);
        jpanel.add(nameField);
        jpanel.setBackground(Color.cyan);
        jpanel.setMaximumSize(new Dimension(400, 20));
        fLabel = new JLabel();
        fLabel.setText("Select items :");
        cb1 = new JCheckBox("APPLE");
        cb2 = new JCheckBox("GRAPES");
        cb3 = new JCheckBox("CHERRY");
        cb4 = new JCheckBox("WATER MELON");
        jpanel1.setLayout(new BoxLayout(jpanel1,1));
        jpanel1.setBackground(Color.cyan);
        jpanel1.add(fLabel);
        cb1.setBackground(Color.cyan);
        cb2.setBackground(Color.cyan);
        cb3.setBackground(Color.cyan);
        cb4.setBackground(Color.cyan);
        jpanel1.add(cb1);
        jpanel1.add(cb2);
        jpanel1.add(cb3);
        jpanel1.add(cb4);

        slabel = new JLabel("Select Item :");
        radioButton1 = new JRadioButton();
        radioButton1.setText("MALE");
        radioButton1.setBackground(Color.cyan);
        radioButton2 = new JRadioButton();
        radioButton2.setText("FEMALE");
        radioButton2.setBackground(Color.cyan);
        jPanel2.add(slabel);
        jPanel2.setBackground(Color.cyan);
        jPanel2.setLayout(new BoxLayout(jPanel2,1));
        jPanel2.add(radioButton1);
        jPanel2.add(radioButton2);
        jpanel1.setBackground(Color.cyan);

        String s[] = {"PDPU","IITS","NIT SURAT","NIRMA"};
        jComboBox = new JComboBox(s);
        jComboBox.setMaximumSize(new Dimension(150, 20));

        String list[] = {"SURAT","GANDHINAGAR","MUMBAI","DELHI"};
        jlist = new JList(list);
        jlist.setBackground(Color.cyan);

        button1 = new JButton("Show");
        button2 = new JButton("EXIT");
        jpanel3.add(button1);
        jpanel3.add(Box.createRigidArea(new Dimension(10, 0)));
        jpanel3.add(button2);
        jpanel3.setLayout(new BoxLayout(jpanel3,0));
        jpanel3.setBackground(Color.cyan);

        jpanel.setBounds(50,20,100,50);
        jpanel1.setBounds(50,20,100,50);
        jPanel2.setBounds(50,20,100,50);
        jpanel3.setBounds(50,20,100,50);

        mainPanel.add(Box.createRigidArea(new Dimension(0, 30)));
        mainPanel.add(jpanel);
        mainPanel.add(Box.createRigidArea(new Dimension(0, 10)));
        mainPanel.add(jpanel1);
        mainPanel.add(Box.createRigidArea(new Dimension(0, 10)));
        mainPanel.add(jPanel2);
        mainPanel.add(Box.createRigidArea(new Dimension(0, 10)));
        mainPanel.add(jComboBox);
        mainPanel.add(Box.createRigidArea(new Dimension(0, 10)));
        mainPanel.add(jlist);
        mainPanel.add(Box.createRigidArea(new Dimension(0, 10)));
        mainPanel.add(jpanel3);
        mainPanel.setBackground(Color.cyan);
        mainFrame.add(mainPanel);
        mainFrame.setBounds(100,100,400,500);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setVisible(true);
    }
    public static void main(String[] args) {
         new Form();
    }
}
