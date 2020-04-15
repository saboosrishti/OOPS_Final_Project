package UserInterface;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import Business.DoctorEmployee;
import java.awt.CardLayout;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Name
 */
public class PatientRegistrationForm extends javax.swing.JPanel {

    /**
     * Creates new form PatientRegistrationForm
     */
    private JPanel container;

    public PatientRegistrationForm(JPanel container) {
        initComponents();
        this.container = container;
        medicalDepartment.addItem(DoctorEmployee.MedicalDepartment.Cardiologist.getValue());
        medicalDepartment.addItem(DoctorEmployee.MedicalDepartment.Neurologist.getValue());
        medicalDepartment.addItem(DoctorEmployee.MedicalDepartment.Orthologist.getValue());
        medicalDepartment.addItem(DoctorEmployee.MedicalDepartment.Pediatrician.getValue());
        String[] years = new String[]{"1990", "1991",
            "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001",
            "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011",
            "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020", "2021"};
        
        yearComboBox.addItem("1991");
        yearComboBox.addItem("1992");
        yearComboBox.addItem("1993");

        ButtonGroup group = new ButtonGroup();
        group.add(maleRadioButton);
        group.add(femaleRadioBtn);
        add(maleRadioButton);
        add(femaleRadioBtn);

        addBirthdate();
    }

    public void addBirthdate() {
        yearComboBox.addItem("1994");
        yearComboBox.addItem("1995");
        yearComboBox.addItem("1996");
        yearComboBox.addItem("1997");
        yearComboBox.addItem("1998");
        yearComboBox.addItem("1999");
        yearComboBox.addItem("2000");
        yearComboBox.addItem("2001");
        yearComboBox.addItem("2002");
        yearComboBox.addItem("2003");
        yearComboBox.addItem("2004");
        yearComboBox.addItem("2005");
        yearComboBox.addItem("2006");
        yearComboBox.addItem("2007");
        yearComboBox.addItem("2008");
        yearComboBox.addItem("2009");
        yearComboBox.addItem("2010");
        yearComboBox.addItem("2011");
        yearComboBox.addItem("2012");
        yearComboBox.addItem("2013");
        yearComboBox.addItem("2014");
        yearComboBox.addItem("2015");
        yearComboBox.addItem("2016");
        yearComboBox.addItem("2017");
        yearComboBox.addItem("2018");
        yearComboBox.addItem("2019");
        yearComboBox.addItem("2020");

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPasswordField1 = new javax.swing.JPasswordField();
        enterpriseLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        customerEmailTextField = new javax.swing.JTextField();
        patientFname = new javax.swing.JTextField();
        registerCustomerjButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        customerPhoneTextField = new javax.swing.JTextField();
        backjButton = new javax.swing.JButton();
        patientLName = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        insuranceNo = new javax.swing.JTextField();
        monthComboBox = new javax.swing.JComboBox<>();
        yearComboBox = new javax.swing.JComboBox<>();
        dayComboBox = new javax.swing.JComboBox<>();
        maleRadioButton = new javax.swing.JRadioButton();
        femaleRadioBtn = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        registerCustomerjButton1 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        medicalDepartment = new javax.swing.JComboBox<>();

        jPasswordField1.setText("jPasswordField1");

        setBackground(new java.awt.Color(0, 153, 153));

        enterpriseLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        enterpriseLabel.setText("Patient Registration Form");

        jLabel1.setText("First Name:");

        jLabel2.setText("Email:");

        jLabel3.setText("DoB:");

        patientFname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patientFnameActionPerformed(evt);
            }
        });

        registerCustomerjButton.setText("Register");
        registerCustomerjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerCustomerjButtonActionPerformed(evt);
            }
        });

        jLabel4.setText("Gender:");

        jLabel5.setText("Phone No:");

        customerPhoneTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customerPhoneTextFieldActionPerformed(evt);
            }
        });

        backjButton.setText("<<Back");
        backjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backjButtonActionPerformed(evt);
            }
        });

        patientLName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patientLNameActionPerformed(evt);
            }
        });

        jLabel6.setText("Last Name:");

        jLabel7.setText("Insurance No:");

        monthComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));
        monthComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                monthComboBoxActionPerformed(evt);
            }
        });

        yearComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1990" }));
        yearComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yearComboBoxActionPerformed(evt);
            }
        });

        dayComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        dayComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dayComboBoxActionPerformed(evt);
            }
        });

        maleRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maleRadioButtonActionPerformed(evt);
            }
        });

        jLabel8.setText("Male");

        jLabel9.setText("Female");

        registerCustomerjButton1.setText("Reset");
        registerCustomerjButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerCustomerjButton1ActionPerformed(evt);
            }
        });

        jLabel10.setText("Referred Dept:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(241, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(customerEmailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel7))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(patientFname, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel6)))
                                .addGap(34, 34, 34)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(patientLName, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(insuranceNo, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(monthComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(dayComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(yearComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(maleRadioButton)
                                .addGap(9, 9, 9)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(femaleRadioBtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel9))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(registerCustomerjButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(registerCustomerjButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(customerPhoneTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(medicalDepartment, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 191, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(enterpriseLabel)
                .addGap(248, 248, 248))
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(backjButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(enterpriseLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(patientLName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(patientFname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(customerEmailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7)
                        .addComponent(insuranceNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel3)
                                .addComponent(monthComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(dayComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(yearComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel4))
                            .addComponent(femaleRadioBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(maleRadioButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel10)
                        .addComponent(medicalDepartment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(customerPhoneTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(registerCustomerjButton)
                    .addComponent(registerCustomerjButton1))
                .addGap(84, 84, 84)
                .addComponent(backjButton)
                .addContainerGap(193, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void patientFnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patientFnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_patientFnameActionPerformed

    public void clearFields() {
        patientFname.setText("");
        patientLName.setText("");
        maleRadioButton.setSelected(true);
        femaleRadioBtn.setSelected(false);
        customerEmailTextField.setText("");
        customerPhoneTextField.setText("");
    }

    private void registerCustomerjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerCustomerjButtonActionPerformed

        if (patientFname.getText().equals("") || patientLName.getText().equals("") || customerEmailTextField.getText().equals("") || insuranceNo.getText().equals("") || customerPhoneTextField.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "All fields are required!");
            return;
        }

        Set<String> emailSet = new HashSet<>();
        BufferedReader br;
        try {
            br = new BufferedReader(new FileReader("src/assests/patientRecord.csv"));
            String line;
            while ((line = br.readLine()) != null) {
                // use comma as separator
                String[] cols = line.split(",");
                emailSet.add(cols[2]);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(PatientRegistrationForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(PatientRegistrationForm.class.getName()).log(Level.SEVERE, null, ex);
        }

        String patientFName = this.patientFname.getText();
        String patientLName = this.patientLName.getText();
        String email = customerEmailTextField.getText();
        if (emailSet.contains(email)) {
            JOptionPane.showMessageDialog(null, "Patient with " + email + " already exist");
            return;
        }
        String insurance = insuranceNo.getText();
        String phone = customerPhoneTextField.getText();
        String department = (String) medicalDepartment.getSelectedItem();
        String patientStatus = "Admitted";
        String gender = "";

        if (maleRadioButton.isSelected()) {
            gender = "M";
        } else if (femaleRadioBtn.isSelected()) {
            gender = "F";
        }
        String dob = (String) monthComboBox.getSelectedItem() + "/" + (String) dayComboBox.getSelectedItem() + "/" + (String) yearComboBox.getSelectedItem();

        FileOutputStream fos;
        try {
            fos = new FileOutputStream("src/assests/patientRecord.csv", true);
            PrintWriter pw = new PrintWriter(fos);
            pw.append(patientFName + "," + patientLName + "," + email + "," + insurance + "," + dob + "," + gender + "," + phone + "," + department+","+patientStatus);
            pw.println();
            pw.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(PatientRegistrationForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        JOptionPane.showMessageDialog(null, "Patient registered successfully.");
        clearFields();
    }//GEN-LAST:event_registerCustomerjButtonActionPerformed

    private void backjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backjButtonActionPerformed
        container.remove(this);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.previous(container);
    }//GEN-LAST:event_backjButtonActionPerformed

    private void patientLNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patientLNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_patientLNameActionPerformed

    private void yearComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yearComboBoxActionPerformed

        // TODO add your handling code here:
    }//GEN-LAST:event_yearComboBoxActionPerformed

    private void registerCustomerjButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerCustomerjButton1ActionPerformed
        // TODO add your handling code here:
        clearFields();
    }//GEN-LAST:event_registerCustomerjButton1ActionPerformed

    private void customerPhoneTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customerPhoneTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_customerPhoneTextFieldActionPerformed

    private void monthComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_monthComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_monthComboBoxActionPerformed

    private void dayComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dayComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dayComboBoxActionPerformed

    private void maleRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maleRadioButtonActionPerformed
        if (femaleRadioBtn.isSelected()) {
            femaleRadioBtn.disable();
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_maleRadioButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backjButton;
    private javax.swing.JTextField customerEmailTextField;
    private javax.swing.JTextField customerPhoneTextField;
    private javax.swing.JComboBox<String> dayComboBox;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JRadioButton femaleRadioBtn;
    private javax.swing.JTextField insuranceNo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JRadioButton maleRadioButton;
    private javax.swing.JComboBox<String> medicalDepartment;
    private javax.swing.JComboBox<String> monthComboBox;
    private javax.swing.JTextField patientFname;
    private javax.swing.JTextField patientLName;
    private javax.swing.JButton registerCustomerjButton;
    private javax.swing.JButton registerCustomerjButton1;
    private javax.swing.JComboBox<String> yearComboBox;
    // End of variables declaration//GEN-END:variables
}
