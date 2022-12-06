package sistema;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Main extends JFrame implements ActionListener {

    private JMenuBar menuBar;
    private JMenu menuOptions, menuCalculation, menuAbout, menuBackgroundColor;
    private JMenuItem miCalculation, miRed, miViolet, miBlack, miAutor, miExit, miNew;
    private JLabel labelLogo, labelWelcome, labelTitle, labelName, labelPaternalSurname, labelMaternalSurname, labelDepartment, labelSeniority, labelResult, labelFooter;
    private JTextField txtEmployeeName, txtPaternalEmployeeSurname, txtMaternalEmployeeSurname;
    private JComboBox comboDepartment, comboSeniority;
    private JScrollPane scrollPane1;
    private JTextArea textArea1;
    String autorName = "";

    public Main(){
        setLayout(null);
        setTitle("Main Window");
        getContentPane().setBackground(new Color(178, 13, 13));
        Image img = Toolkit.getDefaultToolkit().getImage("images/icon.png");
        setIconImage(img);
        Welcome windowWelcome = new Welcome();
        autorName = windowWelcome.texto;


        menuBar= new JMenuBar();
        menuBar.setBackground(new Color(224, 192, 79));
        setJMenuBar(menuBar);


        menuOptions= new JMenu("Options");
        menuOptions.setBackground(new Color(255,0,0));
        menuOptions.setFont(new Font("Andale Mono", 1, 14));
        menuOptions.setForeground(new Color(255,255,255));
        menuBar.add(menuOptions);

        menuCalculation= new JMenu("Calculation");
        menuCalculation.setBackground(new Color(255,0,0));
        menuCalculation.setFont(new Font("Andale Mono", 1, 14));
        menuCalculation.setForeground(new Color(255,255,255));
        menuBar.add(menuCalculation);

        menuAbout= new JMenu("About");
        menuAbout.setBackground(new Color(255,0,0));
        menuAbout.setFont(new Font("Andale Mono", 1, 14));
        menuAbout.setForeground(new Color(255,255,255));
        menuBar.add(menuAbout);

        menuBackgroundColor = new JMenu("Background Color");
        menuBackgroundColor.setFont(new Font("Andale Mono", 1,14));
        menuBackgroundColor.setForeground(new Color(255,0,0));
        menuOptions.add(menuBackgroundColor);

        miCalculation= new JMenuItem("Holidays");
        miCalculation.setFont(new Font("Andale Mono",1,14));
        miCalculation.setForeground((new Color(255,0,0)));
        menuCalculation.add(miCalculation);
        miCalculation.addActionListener(this);

        miRed= new JMenuItem("Red");
        miRed.setFont(new Font("Andale Mono",1, 14));
        miRed.setForeground(new Color(255,0,0));
        menuBackgroundColor.add(miRed);
        miRed.addActionListener(this);

        miViolet= new JMenuItem("Violet");
        miViolet.setFont(new Font("Andale Mono",1, 14));
        miViolet.setForeground(new Color(93, 47, 134));
        menuBackgroundColor.add(miViolet);
        miViolet.addActionListener(this);

        miBlack= new JMenuItem("Black");
        miBlack.setFont(new Font("Andale Mono",1, 14));
        miBlack.setForeground(new Color(31, 30, 30));
        menuBackgroundColor.add(miBlack);
        miBlack.addActionListener(this);

        miNew = new JMenuItem("New");
        miNew.setFont(new Font("Andale Mono",1,14));
        miNew.setForeground(new Color(255,0,0));
        menuOptions.add(miNew);
        miNew.addActionListener(this);

        miAutor = new JMenuItem("Autor");
        miAutor.setFont(new Font("Andale Mono",1,14));
        miAutor.setForeground(new Color(255,0,0));
        menuAbout.add(miAutor);
        miAutor.addActionListener(this);

        miExit = new JMenuItem("Exit");
        miExit.setFont(new Font("Andale Mono",1,14));
        miExit.setForeground(new Color(255,0,0));
        menuOptions.add(miExit);
        miExit.addActionListener(this);

        //Label del Logo COCA-COLA
        ImageIcon img2 = new ImageIcon("images/payaso.png");
        labelLogo = new JLabel();
        labelLogo.setBounds(55,0,150,150);
        labelLogo.setIcon(new ImageIcon(img2.getImage().getScaledInstance(150,150,Image.SCALE_SMOOTH)));
        add(labelLogo);

        labelWelcome = new JLabel("Welcome " + "" +  autorName);
        labelWelcome.setBounds(250,30,500,50);
        labelWelcome.setFont(new Font("Sweetly Scented", 1,40));
        labelWelcome.setForeground(new Color(255,255,255));
        add(labelWelcome);

        labelTitle = new JLabel("Employee data for the calculation of holidays");
        labelTitle.setBounds(25,155,900,25);
        labelTitle.setFont(new Font("Andale Mono", 0,24));
        labelTitle.setForeground(new Color(255,255,255));
        add(labelTitle );

        labelName = new JLabel("Names (*)");
        labelName.setBounds(25,188,180,25);
        labelName.setFont(new Font("Andale Mono",1,12));
        labelName.setForeground(new Color(255,255,255));
        add(labelName);

        txtEmployeeName = new JTextField();
        txtEmployeeName.setBounds(25,213,150,25);
        txtEmployeeName.setBackground(new java.awt.Color(224,224,224));
        txtEmployeeName.setFont(new java.awt.Font("Andale Mono",1,14));
        txtEmployeeName.setForeground(new Color(121, 111, 111));
        add(txtEmployeeName);

        labelPaternalSurname = new JLabel("Paternal surname (*)");
        labelPaternalSurname.setBounds(25,248,180,25);
        labelPaternalSurname.setFont(new Font("Andale Mono",1,12));
        labelPaternalSurname.setForeground(new Color(255,255,255));
        add(labelPaternalSurname);

        txtPaternalEmployeeSurname = new JTextField();
        txtPaternalEmployeeSurname.setBounds(25,273,150,25);
        txtPaternalEmployeeSurname.setBackground(new java.awt.Color(224,224,224));
        txtPaternalEmployeeSurname.setFont(new java.awt.Font("Andale Mono",1,14));
        txtPaternalEmployeeSurname.setForeground(new java.awt.Color(121, 111, 111));
        add(txtPaternalEmployeeSurname);

        labelMaternalSurname = new JLabel("Maternal surname (*)");
        labelMaternalSurname.setBounds(25,308,180,25);
        labelMaternalSurname.setFont(new Font("Andale Mono", 1,12));
        labelMaternalSurname.setForeground(new Color(255,255,255));
        add(labelMaternalSurname);

        txtMaternalEmployeeSurname = new JTextField();
        txtMaternalEmployeeSurname.setBounds(25,334,150,25);
        txtMaternalEmployeeSurname.setBackground(new java.awt.Color(224,224,224));
        txtMaternalEmployeeSurname.setFont(new java.awt.Font("Andale Mono",1,14));
        txtMaternalEmployeeSurname.setForeground(new java.awt.Color(121, 111, 111));
        add(txtMaternalEmployeeSurname);

        labelDepartment = new JLabel("Select Department (*)");
        labelDepartment.setBounds(220,188,180,25);
        labelDepartment.setFont(new Font("Andale Mono", 1,12));
        labelDepartment.setForeground(new Color(255,255,255));
        add(labelDepartment);

        comboDepartment = new JComboBox();
        comboDepartment.setBounds(220,213,220,25);
        comboDepartment.setBackground(new java.awt.Color(224,224,224));
        comboDepartment.setFont(new java.awt.Font("Andale Mono", 1,14));
        comboDepartment.setForeground(new java.awt.Color(121, 111, 111));
        add(comboDepartment);
        comboDepartment.addItem("");
        comboDepartment.addItem("Customer Service");
        comboDepartment.addItem("Logistics Department");
        comboDepartment.addItem("Management Department");

        labelSeniority = new JLabel("Select seniority (*)");
        labelSeniority.setBounds(220,248,180,25);
        labelSeniority.setFont(new Font("Andale Mono", 1,12));
        labelSeniority.setForeground(new Color(255,255,255));
        add(labelSeniority);

        comboSeniority = new JComboBox();
        comboSeniority.setBounds(220,273,220,25);
        comboSeniority.setBackground(new java.awt.Color(224,224,224));
        comboSeniority.setFont(new java.awt.Font("Andale Mono", 1,14));
        comboSeniority.setForeground(new java.awt.Color(121, 111, 111));
        add(comboSeniority);
        comboSeniority.addItem("");
        comboSeniority.addItem(" 1 year");
        comboSeniority.addItem(" 2 to 6 years");
        comboSeniority.addItem(" 7 or more years");

        labelResult= new JLabel("Calculation result");
        labelResult.setBounds(220,307,180,25);
        labelResult.setFont(new Font("Andale Mono", 1,12));
        labelResult.setForeground(new Color(255,255,255));
        add(labelResult);

        textArea1 = new JTextArea();
        textArea1.setEditable(false);
        textArea1.setBackground(new Color(224,224,224));
        textArea1.setFont(new Font("Andale Mono",1,11));
        textArea1.setForeground(new Color(121, 111, 111));
        textArea1.setText("(*)Mandatory"+"\n\n Calculation Reuslt");
        scrollPane1 = new JScrollPane(textArea1);
        scrollPane1.setBounds(220,333,385,90);
        add(scrollPane1);

        labelFooter= new JLabel("©2022 Camila Siquila | Todos los derechos reservados");
        labelFooter.setBounds(135,445,500,30);
        labelFooter.setFont(new java.awt.Font("Andale Mono",1,12));
        labelFooter.setForeground(new java.awt.Color(255,255,255));
        add(labelFooter);



    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == miCalculation) {
            String employeeName = txtEmployeeName.getText();
            String ps = txtPaternalEmployeeSurname.getText();
            String ms = txtMaternalEmployeeSurname.getText();
            String d = comboDepartment.getSelectedItem().toString();
            String s = comboSeniority.getSelectedItem().toString();

            if (employeeName.equals("") || ps.equals("") || ms.equals("") || d.equals("") || s.equals("")) {
                JOptionPane.showMessageDialog(null, "Complete the fields");
            } else {
                if (d.equals("Customer Service")) {
                    if (s.equals(" 1 year")) {
                        textArea1.setText("\n   Employee " + employeeName + " " + ps + " " + ms +
                                "\n   working in  " + d + " with " + s +
                                "\n   receive 6 days holiday");
                    }
                    if (s.equals(" 2 to 6 years")) {
                        textArea1.setText("\n   Employee " + employeeName + " " + ps + " " + ms +
                                "\n   working in  " + d + " with " + s +
                                "\n   receive 14 days holiday");
                    }
                    if (s.equals(" 7 or more years")) {
                        textArea1.setText("\n   Employee " + employeeName + " " + ps + " " + ms +
                                "\n   working in  " + d + " with " + s +
                                "\n   receive 20 days holiday");
                    }

                }
                    if (d.equals("Logistic Department")) {
                        if (s.equals(" 1 year")) {
                            textArea1.setText("\n   Employee " + employeeName + " " + ps + " " + ms +
                                    "\n   working in  " + d + " with " + s +
                                    "\n   receive 7 days holiday");
                        }
                        if (s.equals(" 2 to 6 years")) {
                            textArea1.setText("\n   Employee " + employeeName + " " + ps + " " + ms +
                                    "\n   working in  " + d + " with " + s +
                                    "\n   receive 15 days holiday");
                        }
                        if (s.equals(" 7 or more years")) {
                            textArea1.setText("\n   Employee " + employeeName + " " + ps + " " + ms +
                                    "\n   working in  " + d + " with " + s +
                                    "\n   receive 22 days holiday");
                        }
                    }
                    if (d.equals("Management Department")) {
                        if (s.equals(" 1 year")) {
                            textArea1.setText("\n   Employee " + employeeName + " " + ps + " " + ms +
                                    "\n   working in  " + d + " with " + s +
                                    "\n   receive 10 days holiday");
                        }
                        if (s.equals(" 2 to 6 years")) {
                            textArea1.setText("\n   Employee " + employeeName + " " + ps + " " + ms +
                                    "\n   working in  " + d + " with " + s +
                                    "\n   receive 20 days holiday");
                        }
                        if (s.equals(" 7 or more years")) {
                            textArea1.setText("\n   Employee " + employeeName + " " + ps + " " + ms +
                                    "\n   working in  " + d + " with " + s +
                                    "\n   receive 30 days holiday");
                        }


                    }
                }

            }

                if (e.getSource() == miRed) {
                    getContentPane().setBackground(new Color(178, 13, 13));
                }
                if (e.getSource() == miBlack) {
                    getContentPane().setBackground(new Color(51, 48, 48));
                }
                if (e.getSource() == miViolet) {
                    getContentPane().setBackground(new Color(132, 91, 166));
                }
                if (e.getSource() == miNew) {
                txtEmployeeName.setText("");
                txtPaternalEmployeeSurname.setText("");
                txtMaternalEmployeeSurname.setText("");
                comboSeniority.setSelectedIndex(0);
                textArea1.setText("(*)Mandatory"+"\n\n Calculation Reuslt");

                }
                if (e.getSource() == miExit) {
                    Welcome windowWelcome = new Welcome();
                    windowWelcome.setBounds(0, 0, 350, 450);
                    windowWelcome.setVisible(true);
                    windowWelcome.setResizable(false);
                    windowWelcome.setLocationRelativeTo(null);
                    this.setVisible(false);
                }
                if (e.getSource() == miAutor) {
                JOptionPane.showMessageDialog(null, "Developed by Camila Siquila\n" + "siquilacamila@gmail.com");
                }
            }

            public static void main (String[]args){
                Main mainWindow = new Main();
                mainWindow.setBounds(0, 0, 650, 635);
                mainWindow.setVisible(true);
                mainWindow.setResizable(false);
                mainWindow.setLocationRelativeTo(null);
            }
        }
