/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface;

import Business.Employee;
import Business.Patient;
import java.awt.CardLayout;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Name
 */
public class DoctorsView extends javax.swing.JPanel {

    /**
     * Creates new form AdminView
     */
    private JPanel container;
    Employee employeeObject;
    List<Patient> patientList;

    DoctorsView(JPanel container, Employee employeeObject) {
        this.container = container;
        this.employeeObject = employeeObject;
        patientList = new ArrayList<>();
        cachePatientData(patientList);
        initComponents();
        populateData();
    }

    public void cachePatientData(List<Patient> patientList) {

    }

    public void populateData() {
        List<Patient> list = new ArrayList<>();
        DefaultTableModel dm = (DefaultTableModel) patientsTable.getModel();
        dm.setRowCount(0);
        BufferedReader br;
        try {
            br = new BufferedReader(new FileReader("src/assests/patientRecord.csv"));
            String line;
            while ((line = br.readLine()) != null) {
                // use comma as separator
                String[] cols = line.split(",");
                if (cols[7].equals(employeeObject.getEmployeeDepartment())) {
                    Object[] row = new Object[7];
                    row[0] = cols[0] + " " + cols[1];
                    row[1] = cols[2];
                    row[2] = cols[5];
                    row[3] = cols[8];
                    dm.addRow(row);
                }
//              row[3] = cols[8];
//                Patient p = new Patient();
//                p.setPatientFName(cols[0]);
//                p.setPatientLName(cols[1]);
//                p.setDob(cols[4]);
//                p.setGender(cols[5]);
//                p.setStatus(cols[8]);
//                list.add(p);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(PatientRegistrationForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(PatientRegistrationForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        sort(dm);
    }

    private void sort(DefaultTableModel dm) {
        TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>(dm);
        patientsTable.setRowSorter(sorter);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jColorChooser1 = new javax.swing.JColorChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        patientsTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        backjButton = new javax.swing.JButton();
        assignPatientToMe = new javax.swing.JButton();
        treatPatient = new javax.swing.JButton();

        jColorChooser1.setBackground(new java.awt.Color(0, 153, 153));

        setBackground(new java.awt.Color(0, 153, 153));

        patientsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Patient Name", "User Name", "Sex", "Status"
            }
        ));
        jScrollPane1.setViewportView(patientsTable);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setText("Hospital Patient List");

        backjButton.setText("<<Back");
        backjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backjButtonActionPerformed(evt);
            }
        });

        assignPatientToMe.setText("Assign");
        assignPatientToMe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignPatientToMeActionPerformed(evt);
            }
        });

        treatPatient.setText("Treat Patient");
        treatPatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                treatPatientActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(159, 159, 159))
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 631, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(backjButton)
                        .addGap(18, 18, 18)
                        .addComponent(assignPatientToMe, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(treatPatient)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backjButton)
                    .addComponent(treatPatient)
                    .addComponent(assignPatientToMe))
                .addContainerGap(240, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backjButtonActionPerformed

        container.remove(this);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.previous(container);
    }//GEN-LAST:event_backjButtonActionPerformed

    private void assignPatientToMeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignPatientToMeActionPerformed
        int selectedRow = patientsTable.getSelectedRow();
        int selectedColumn = 3;
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row");
            return;
        } else {
            BufferedReader br;
            try {
                br = new BufferedReader(new FileReader("src/assests/patientRecord.csv"));
                String line;
                while ((line = br.readLine()) != null) {
                    // use comma as separator
                    String[] cols = line.split(",");
                    if (cols[2].equalsIgnoreCase((String) patientsTable.getValueAt(selectedRow, 1))) {
                        cols[8] = "Doctor Assigned";
                        patientsTable.setValueAt(cols[8], selectedRow, selectedColumn);
                    }
                }
            } catch (FileNotFoundException ex) {
                Logger.getLogger(PatientRegistrationForm.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(PatientRegistrationForm.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }//GEN-LAST:event_assignPatientToMeActionPerformed

    private void treatPatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_treatPatientActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_treatPatientActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton assignPatientToMe;
    private javax.swing.JButton backjButton;
    private javax.swing.JColorChooser jColorChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable patientsTable;
    private javax.swing.JButton treatPatient;
    // End of variables declaration//GEN-END:variables
}