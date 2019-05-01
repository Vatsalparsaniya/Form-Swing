import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;


public class Form extends JFrame implements ActionListener {
    private JFrame mainFrame;
    private JLabel NameLabel,fLabel,slabel;
    private JTextField nameField;

    JCheckBox[] cb = new JCheckBox[4];
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
    JFrame nextFrame;
    JTextArea jTextArea;
    JPanel jPanel4;
    JLabel[] nextJlabel = new JLabel[15];
    JPanel nextInside1;
    JPanel nextInside2;
    //List<JLabel> nextJlabel;


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

        cb[0] = new JCheckBox("APPLE");
        cb[1] = new JCheckBox("GRAPES");
        cb[2] = new JCheckBox("CHERRY");
        cb[3] = new JCheckBox("WATER MELON");
        jpanel1.setLayout(new BoxLayout(jpanel1,1));
        jpanel1.setBackground(Color.cyan);
        jpanel1.add(fLabel);
        cb[0].setBackground(Color.cyan);
        cb[1].setBackground(Color.cyan);
        cb[2].setBackground(Color.cyan);
        cb[3].setBackground(Color.cyan);
        jpanel1.add(cb[0]);
        jpanel1.add(cb[1]);
        jpanel1.add(cb[2]);
        jpanel1.add(cb[3]);

        slabel = new JLabel("Select Item :");
        radioButton1 = new JRadioButton();
        radioButton1.setText("MALE");
        radioButton1.setBackground(Color.cyan);
        radioButton2 = new JRadioButton();
        radioButton2.setText("FEMALE");
        radioButton2.setBackground(Color.cyan);
        radioButton1.addActionListener(this);
        radioButton2.addActionListener(this);
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
        button1.addActionListener(this);
        button2 = new JButton("EXIT");
        button2.addActionListener(this);
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

    public void show_button(){
        String name = nameField.getText();
        String ckList = new String();

        int n = cb.length;
        for (int i = 0 ; i < n ;i++){
            if(cb[i].isSelected()){
                ckList = ckList.concat(","+cb[i].getText());
            }
        }
        var ckl = ckList.split(",");
        int len = ckl.length;
        String radioText;
        if(radioButton1.isSelected()){
            radioText = radioButton1.getText();
        }else{
            radioText = radioButton2.getText();
        }
        String jcombox = jComboBox.getSelectedItem().toString();
        String jlist_text = jlist.getSelectedValue().toString();

        nextFrame = new JFrame();
        jTextArea = new JTextArea();
        jPanel4 = new JPanel();

        jPanel4.setLayout(new BoxLayout(jPanel4,BoxLayout.Y_AXIS));
        nextJlabel[0] = new JLabel();
        nextJlabel[0].setText("Name :  " + name);
        jPanel4.add(Box.createRigidArea(new Dimension(0, 30)));

        jPanel4.add(nextJlabel[0]);
        jPanel4.add(Box.createRigidArea(new Dimension(0, 10)));
        nextInside1 = new JPanel();
        nextInside1.setLayout(new BoxLayout(nextInside1,0));
        nextJlabel[1] = new JLabel();
        nextJlabel[1].setText("Fruits :");
        //nextInside1.add(Box.createRigidArea(new Dimension(100, 0)));
        nextInside1.setBackground(Color.cyan);
        nextInside1.add(nextJlabel[1]);
        nextInside1.add(Box.createRigidArea(new Dimension(10, 0)));
        nextInside2 = new JPanel();
        nextInside2.setBackground(Color.cyan);
        nextInside2.setLayout(new BoxLayout(nextInside2,1));
        int i = 0;
        int p = 2;
        int l = ckl.length;
        while (l > i) {
            nextJlabel[p] = new JLabel();
            nextJlabel[p].setText(ckl[i]);
            nextInside2.add(nextJlabel[p++]);
            i++;
        }
        nextInside1.add(nextInside2);
        jPanel4.add(nextInside1);

        nextJlabel[p] = new JLabel();
        nextJlabel[p].setText("Gender :  " + radioText);
        jPanel4.add(Box.createRigidArea(new Dimension(0, 10)));
        jPanel4.add(nextJlabel[p++]);

        nextJlabel[p] = new JLabel();
        nextJlabel[p].setText("City :  " + jcombox);
        jPanel4.add(Box.createRigidArea(new Dimension(0, 10)));
        jPanel4.add(nextJlabel[p++]);

        nextJlabel[p] = new JLabel();
        nextJlabel[p].setText("Collage :  " + jlist_text);
        jPanel4.add(Box.createRigidArea(new Dimension(0, 10)));
        jPanel4.add(nextJlabel[p++]);

        mainFrame.getContentPane().removeAll();
        jPanel4.setBackground(Color.cyan);
        mainFrame.add(jPanel4);
        mainFrame.setVisible(true);
    }

    public  void actionPerformed(ActionEvent e){
        if(e.getSource() == button1){
            show_button();

        }
        if(e.getSource() == button2){
            System.exit(0);
        }
        if(e.getSource() == radioButton1){
            if(radioButton2.isSelected()){
                radioButton2.setSelected(false);
            }
        }
        if(e.getSource() == radioButton2){
            if(radioButton1.isSelected()){
                radioButton1.setSelected(false);
            }
        }
    }


    public static void main(String[] args) {
         new Form();
    }
}
