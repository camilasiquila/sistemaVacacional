package sistema;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;


public class Welcome extends JFrame implements ActionListener {
    private JTextField textfield1;
    private JLabel label1, label2, label3, label4;
    private JButton button1;
    public static String texto = "";
    private JPanel panel = new JPanel();

    public Welcome() {
        setLayout(null);
        setTitle("Welcome"); //coloca el titulo en la parte superior del programa
        getContentPane().setBackground(new Color(225, 22, 22)); //color de fondo rojo
        Image img = Toolkit.getDefaultToolkit().getImage("images/icon.png");
        setIconImage(img);

        ImageIcon img1 = new ImageIcon("images/logo-mc.png");
        label1 = new JLabel();
        label1.setBounds(115, 15, 100, 100); //dimesiones y coordenadas
        label1.setIcon(new ImageIcon(img1.getImage().getScaledInstance(100,100,Image.SCALE_SMOOTH)));
        add(label1); //quetodo lo anterior se agregue a ese label

        label2 = new JLabel("Holiday Control System");
        label2.setBounds(45, 135, 300, 30);
        label2.setFont(new Font("Andale Mono", 3, 18)); //texto normal:0, negrita:1, cursiva:2, negrita y cursiva:3
        label2.setForeground(new Color(255, 255, 255)); //color del texto
        add(label2);

        label3 = new JLabel("Enter your name");
        label3.setBounds(45, 212, 200, 30);
        label3.setFont(new Font("Andale Mono", 1, 12)); //texto normal:0, negrita:1, cursiva:2, negrita y cursiva:3
        label3.setForeground(new Color(255, 255, 255)); //color del texto
        add(label3);

        label4 = new JLabel("©2022 Camila Siquila");
        label4.setBounds(85, 375, 300, 30);
        label4.setFont(new Font("Andale Mono", 1, 12)); //texto normal:0, negrita:1, cursiva:2, negrita y cursiva:3
        label4.setForeground(new Color(255, 255, 255)); //color del texto
        add(label4);

        textfield1 = new JTextField();
        textfield1.setBounds(45, 240, 255, 25);
        textfield1.setBackground(new Color(224, 224, 224));
        textfield1.setFont(new Font("Andale Mono", 1, 14));
        textfield1.setForeground(new Color(0, 0, 0));
        add(textfield1);

        button1 = new JButton("Enter");
        button1.setBounds(125, 280, 100, 30);
        button1.setBackground(new Color(255, 255, 255));
        button1.setFont(new Font("Andale Mono", 1, 14));
        button1.setForeground(new Color(0, 0, 0));
        button1.addActionListener(this);
        add(button1);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button1) {
        texto = textfield1.getText().trim(); //metodo TRIM borra los espacios que el usuario pueda introducir
            if(texto.equals("")){
                JOptionPane.showMessageDialog(null, "Please, enter your name");
            } else {
                Licence licenceWindow = new Licence();
                licenceWindow.setBounds(0,0,600,360);
                licenceWindow.setVisible(true);
                licenceWindow.setResizable(false);
                licenceWindow.setLocationRelativeTo(null);
                this.setVisible(false);
            }
        }
    }

    public static void main(String[] args) {
        Welcome windowWelcome = new Welcome();
        windowWelcome.setBounds(0, 0, 350, 450);
        windowWelcome.setVisible(true);
        windowWelcome.setResizable(false);
        windowWelcome.setLocationRelativeTo(null);
        windowWelcome.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

}






