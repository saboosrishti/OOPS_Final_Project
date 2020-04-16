/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface;

import java.awt.CardLayout;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Name
 */
public class ViewDoctors extends javax.swing.JPanel {

    JPanel container;

    ViewDoctors(JPanel container) {
        initComponents();
        this.container = container;
//        List<String> listOfDoctors = new ArrayList<>();
        populateTable();
    }

    private void populateTable() {
        List<String> listOfDoctors = new ArrayList<>();
        BufferedReader br;
        try {
            br = new BufferedReader(new FileReader("src/assests/doctorRecord.csv"));
            String line;
            while ((line = br.readLine()) != null) {
                // use comma as separator
                String[] cols = line.split(",");
                listOfDoctors.add(cols[0] + "," + cols[1] + "," + cols[2]+","+cols[5]);
            }
            sortTable(listOfDoctors.stream().sorted(String.CASE_INSENSITIVE_ORDER).collect(Collectors.toList()));

        } catch (FileNotFoundException ex) {
            Logger.getLogger(PatientRegistrationForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(PatientRegistrationForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void sortTable(List<String> listOfDoctors) {
        System.out.println(listOfDoctors);
         DefaultTableModel dm = (DefaultTableModel) doctorJTable.getModel();
        dm.setRowCount(0);
        enableSorter(dm);
        listOfDoctors.stream().map((list) -> list.split(",")).map((cols) -> {
            Object[] row = new Object[7];
            row[0] = cols[0];
            row[1] = cols[1];
            row[2] = cols[2];
            row[3] = cols[3];
            return row;
        }).forEachOrdered((row) -> {
            dm.addRow(row);
        });
    }
        private void enableSorter(DefaultTableModel dm) {
        TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>(dm);
        doctorJTable.setRowSorter(sorter);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        doctorJTable = new javax.swing.JTable();
        enterpriseLabel = new javax.swing.JLabel();
        backjButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 153, 153));

        doctorJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "First Name", "Last Name", "User Name", "Department"
            }
        ));
        jScrollPane1.setViewportView(doctorJTable);

        enterpriseLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        enterpriseLabel.setText("List of Doctors");

        backjButton.setText("<<Back");
        backjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backjButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 651, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(enterpriseLabel)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(backjButton)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(enterpriseLabel)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(backjButton)
                .addContainerGap(233, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backjButtonActionPerformed

        container.remove(this);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.previous(container);
    }//GEN-LAST:event_backjButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backjButton;
    private javax.swing.JTable doctorJTable;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
