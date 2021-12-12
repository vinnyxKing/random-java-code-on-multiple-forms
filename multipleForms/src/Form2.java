import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Form2 extends JFrame implements ActionListener {

    private String Namename;
    private String SurnameName;

    JLabel name = new JLabel(Namename);
    JLabel surname = new JLabel(SurnameName);
    JButton btnback = new JButton("Back");

    public String getNamename() {
        return Namename;
    }

    public void setNamename(String namename) {
        Namename = namename;
    }

    public String getSurnameName() {
        return SurnameName;
    }

    public void setSurnameName(String surnameName) {
        SurnameName = surnameName;
    }

    public Form2(){
        setLayout(new FlowLayout());
        setTitle("Form 2");
        setLocation(400,200);
        setSize(400,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        add(name);
        add(surname);
        add(btnback);

        btnback.addActionListener(this);



    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnback){
            this.dispose();
            Form1 f1 = new Form1();

        }
    }
}

