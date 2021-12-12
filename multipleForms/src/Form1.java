import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Form1 extends JFrame implements ActionListener {

    JButton openForm = new JButton("Submit");
    JButton closeForm = new JButton("Reset");
    JLabel nameLabel = new JLabel("Name: ");
    JLabel surnameLabel = new JLabel("Surname: ");
    JTextField nameText = new JTextField(10);
    JTextField surnameText = new JTextField(10);

    private String myName;
    private String mySurname;

    public Form1(){
        //setting the layout and visual window of the
        //component
        setLayout(new FlowLayout());
        setSize(400,400);
        setTitle("Form 1");
        setLocation(400,200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        //add the component to the Jframe
        add(nameLabel);
        add(nameText);
        add(surnameLabel);
        add(surnameText);
        add(openForm);
        add(closeForm);

        //whatever action is performed is linked to these buttons
        openForm.addActionListener(this);
        closeForm.addActionListener(this);


    }

    //main method
    public static void main(String[] args) {
        Form1 f1 = new Form1();
    }

    public void setName(String name){
        this.myName = name;
    }
    public void setSurname(String surname){
        this.mySurname = surname;
    }
    public String getMyName(){
        return (this.myName);
    }
    public String getMySurname(){
        return (this.mySurname);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        //action to perform when you click on any button
        if (e.getSource() == openForm){
            this.dispose();
            Form2 f2 = new Form2();
            
            f2.name.setText(nameText.getText());
            f2.surname.setText(surnameText.getText());


        }else if (e.getSource() == closeForm) {
            dispose();
        }
    }
}
