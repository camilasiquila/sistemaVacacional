package sistema;

import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

public class Licence extends JFrame implements ActionListener, ChangeListener {

    //para implementar un evento dentro de un jhbboxs ---> ChangeListener
    //para implementar un evento dentro de un boton ---> ActionListener
    //un JtexArea va acompaniado de un JScrollpane

    private JLabel label1, label2;
    private JCheckBox checkBox1;
    private JButton button1, button2;
    private JScrollPane scrollPane1;
    private JTextArea textArea1;
    String name = "";

    public Licence(){
        setLayout(null);
        setTitle("Licence de uso");
        Image img = Toolkit.getDefaultToolkit().getImage("images/icon.png");
        setIconImage(img);
        Welcome windowWelcome = new Welcome();
        name = windowWelcome.texto;

        label1 = new JLabel("TERMS & CONDITIONS");
        label1.setBounds(215,5,200,30);
        label1.setFont(new Font("Andale Mono", 1, 14));
        label1.setForeground(new Color(0,0,0));
        add(label1);

        textArea1 = new JTextArea();
        textArea1.setEditable(false); // para que el usuario no modifique dentro del JtextArea
        textArea1.setFont(new Font("Andale Mono", 0 , 9));
        textArea1.setText(("\n\n          TERMS & CONDITIONS\"" +
                "\n\n            A.  PROHIBIDA SU VENTA O DISTRIBUCION SIN AUTORIZACION DE CAMILA GISELLE SIQUILA." +
                "\n            B.  PROHIBIDA LA ALTERACION DEL C0DIGO FUENTE O DISENiO DE LAS INTERFACES GRAFICAS." +
                "\n            C.  CAMILA NO SE HACE RESPONSABLE DEL MAL USO DE ESTE SOFTWARE." +
                "\n\n          LOS ACUERDOS LEGALES EXPUESTOS ACONTINUACION RIGEN EL USO QUE USTED HAGA DE ESTE SOFTWARE" +
                "\n          CAMILA, NO SE RESPONSABILIZAN DEL USO QUE USTED" +
                "\n          HAGA CON ESTE SOFTWARE Y SUS SERVICIOS. PARA ACEPTAR ESTOS TERMINOS HAGA CLIC EN (ACEPTO)" +
                "\n          SI USTED NO ACEPTA ESTOS TERMINOS, HAGA CLIC EN (NO ACEPTO) Y NO UTILICE ESTE SOFTWARE." +
                "\n\n        PARA MAYOR INFORMACION SOBRE NUESTROS SERVICIOS, POR FAVOR VISITE" +
                "\n          https://github.com/CaMilaSiquila"));
        scrollPane1 = new JScrollPane(textArea1);
        scrollPane1.setBounds(10,40,510,170);
        add(scrollPane1);

        checkBox1 = new JCheckBox(name +" Agree");
        checkBox1.setBounds(10,250,300,30);
        checkBox1.addChangeListener(this);
        add(checkBox1);

        button1 = new JButton("Continue");
        button1.setBounds(10,290,100,30);
        button1.addActionListener(this);
        button1.setEnabled(false);
        add(button1);

        button2 = new JButton("Disagree");
        button2.setBounds(120,290,100,30);
        button2.addActionListener(this);
        button2.setEnabled(true);
        add(button2);

        ImageIcon img2 = new ImageIcon("images/logo-mc.png");
        label2 = new JLabel();
        label2.setBounds(415,215,100,100);
        label2.setIcon(new ImageIcon(img2.getImage().getScaledInstance(100,100,Image.SCALE_SMOOTH)));
        add(label2);
    }

    @Override
    public void stateChanged(ChangeEvent e) {
        if(checkBox1.isSelected()) {
            button1.setEnabled(true);
            button2.setEnabled(false);
        } else {
            button1.setEnabled(false);
            button2.setEnabled(true);
        }
    }
    @Override
    public void actionPerformed(ActionEvent e) {
    if(e.getSource()==button1){
        Main mainWindow = new Main();
        mainWindow.setBounds(0,0,650,635);
        mainWindow.setVisible(true);
        mainWindow.setResizable(false);
        mainWindow.setLocationRelativeTo(null);
        this.setVisible(false);
    } else if (e.getSource()==button2) {
        Welcome ventanaWelcome = new Welcome();
        ventanaWelcome.setBounds(0, 0, 350, 450);
        ventanaWelcome.setVisible(true);
        ventanaWelcome.setResizable(false);
        ventanaWelcome.setLocationRelativeTo(null);
        this.setVisible(false);
    }
    }

    public static void main (String[] args){
        Licence licenceWindow = new Licence();
        licenceWindow.setBounds(0,0,600,360);
        licenceWindow.setVisible(true); //interfaz que sea visible
        licenceWindow.setResizable(false); //para que el ussuario no modifique las dimesiones de mi interfaz
        licenceWindow.setLocationRelativeTo(null); //que cuando se inicie la interfaz, se muestre en el centro de la pantalla
        licenceWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
