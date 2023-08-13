/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package pos.layerd.view;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import pos.layerd.controller.ItemController;
import pos.layerd.dto.ItemDto;

/**
 *
 * @author DELL i5
 */
public class ItemPanel extends javax.swing.JPanel {

    private ItemController itemController;

    /**
     * Creates new form ItemPanel
     */
    public ItemPanel() {
        itemController = new ItemController();
        initComponents();
        loadAllItems();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        basePanel = new javax.swing.JPanel();
        headerPanel = new javax.swing.JPanel();
        headerLabel = new javax.swing.JLabel();
        formPanel = new javax.swing.JPanel();
        itemCodeLabel = new javax.swing.JLabel();
        itemCodeText = new javax.swing.JTextField();
        descriptionLabel = new javax.swing.JLabel();
        descriptionText = new javax.swing.JTextField();
        packSizeLabel = new javax.swing.JLabel();
        unitPriceText = new javax.swing.JTextField();
        unitePriceLabel = new javax.swing.JLabel();
        qohLabel = new javax.swing.JLabel();
        qohText = new javax.swing.JTextField();
        packSizeText = new javax.swing.JTextField();
        updateButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        addButton = new javax.swing.JButton();
        tablePanel = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        itemTable = new javax.swing.JTable();

        headerLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        headerLabel.setText("  Manage  Item");

        javax.swing.GroupLayout headerPanelLayout = new javax.swing.GroupLayout(headerPanel);
        headerPanel.setLayout(headerPanelLayout);
        headerPanelLayout.setHorizontalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(headerLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        headerPanelLayout.setVerticalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(headerLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        itemCodeLabel.setText("Item Code");

        descriptionLabel.setText("Description");

        descriptionText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                descriptionTextActionPerformed(evt);
            }
        });

        packSizeLabel.setText("Pack Size");

        unitPriceText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unitPriceTextActionPerformed(evt);
            }
        });

        unitePriceLabel.setText("Unit Price");

        qohLabel.setText("Qty On Hand");

        packSizeText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                packSizeTextActionPerformed(evt);
            }
        });

        updateButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        updateButton.setText("Update Item");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });

        deleteButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        deleteButton.setText("Delete Item");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        addButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        addButton.setText("Save Item");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout formPanelLayout = new javax.swing.GroupLayout(formPanel);
        formPanel.setLayout(formPanelLayout);
        formPanelLayout.setHorizontalGroup(
            formPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(formPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(packSizeLabel)
                    .addComponent(unitePriceLabel)
                    .addComponent(qohLabel)
                    .addComponent(itemCodeLabel)
                    .addGroup(formPanelLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(descriptionLabel)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(formPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(formPanelLayout.createSequentialGroup()
                        .addGroup(formPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(unitPriceText, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(qohText, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(descriptionText, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(packSizeText, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(formPanelLayout.createSequentialGroup()
                        .addComponent(itemCodeText, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, formPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(deleteButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(updateButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        formPanelLayout.setVerticalGroup(
            formPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(formPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(itemCodeLabel)
                    .addComponent(itemCodeText, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(formPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(descriptionLabel)
                    .addComponent(descriptionText, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(formPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(packSizeLabel)
                    .addComponent(packSizeText, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(formPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(unitPriceText, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(unitePriceLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(formPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(qohText, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(qohLabel))
                .addGap(14, 14, 14)
                .addGroup(formPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        itemTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        itemTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                itemTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(itemTable);

        javax.swing.GroupLayout tablePanelLayout = new javax.swing.GroupLayout(tablePanel);
        tablePanel.setLayout(tablePanelLayout);
        tablePanelLayout.setHorizontalGroup(
            tablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tablePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 698, Short.MAX_VALUE)
                .addContainerGap())
        );
        tablePanelLayout.setVerticalGroup(
            tablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tablePanelLayout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout basePanelLayout = new javax.swing.GroupLayout(basePanel);
        basePanel.setLayout(basePanelLayout);
        basePanelLayout.setHorizontalGroup(
            basePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(headerPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(formPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(tablePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        basePanelLayout.setVerticalGroup(
            basePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(basePanelLayout.createSequentialGroup()
                .addComponent(headerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(formPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tablePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(basePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(basePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void descriptionTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_descriptionTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_descriptionTextActionPerformed

    private void unitPriceTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unitPriceTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_unitPriceTextActionPerformed

    private void packSizeTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_packSizeTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_packSizeTextActionPerformed

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        updateItem();
    }//GEN-LAST:event_updateButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        deleteItem();
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        saveItem();
    }//GEN-LAST:event_addButtonActionPerformed

    private void itemTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_itemTableMouseClicked
        searchItem();
    }//GEN-LAST:event_itemTableMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JPanel basePanel;
    private javax.swing.JButton deleteButton;
    private javax.swing.JLabel descriptionLabel;
    private javax.swing.JTextField descriptionText;
    private javax.swing.JPanel formPanel;
    private javax.swing.JLabel headerLabel;
    private javax.swing.JPanel headerPanel;
    private javax.swing.JLabel itemCodeLabel;
    private javax.swing.JTextField itemCodeText;
    private javax.swing.JTable itemTable;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel packSizeLabel;
    private javax.swing.JTextField packSizeText;
    private javax.swing.JLabel qohLabel;
    private javax.swing.JTextField qohText;
    private javax.swing.JPanel tablePanel;
    private javax.swing.JTextField unitPriceText;
    private javax.swing.JLabel unitePriceLabel;
    private javax.swing.JButton updateButton;
    // End of variables declaration//GEN-END:variables

    private void loadAllItems() {
        try {
            String[] collumns = {"Code", "Description", "Pack Size", "Unit Price", "QTY On Hand"};
            DefaultTableModel dtm = new DefaultTableModel(collumns, 0) {
                @Override
                public boolean isCellEditable(int row, int column) {
                    return false;
                }
            };
            itemTable.setModel(dtm);

            ArrayList<ItemDto> itemDtos = itemController.getAllItem();
            for (ItemDto item : itemDtos) {
                Object[] row = {item.getId(), item.getDescription(), item.getPackSize(), item.getUnitPrice(), item.getQoh()};
                dtm.addRow(row);
            }
        } catch (Exception ex) {
            Logger.getLogger(ItemPanel.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }

    }

    private void searchItem() {
        try {
            String itemId = itemTable.getValueAt(itemTable.getSelectedRow(), 0).toString();
            ItemDto itemDto = itemController.getItem(itemId);

            if (itemDto != null) {
                itemCodeText.setText(itemDto.getId());
                descriptionText.setText(itemDto.getDescription());
                packSizeText.setText(itemDto.getPackSize());
                unitPriceText.setText(Double.toString(itemDto.getUnitPrice()));
                qohText.setText(Integer.toString(itemDto.getQoh()));
            } else {
                JOptionPane.showMessageDialog(this, "Item Not Found");
            }

        } catch (Exception ex) {
            Logger.getLogger(ItemPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void saveItem() {
        if (checkUnitPrice(unitPriceText.getText())) {

            if (checkQTYonHand(qohText.getText())) {

                try {
                    ItemDto itemDto = new ItemDto(
                            itemCodeText.getText(),
                            descriptionText.getText(),
                            packSizeText.getText(),
                            Double.parseDouble(unitPriceText.getText()),
                            Integer.parseInt(qohText.getText()));

                    String result = itemController.addItem(itemDto);
                    JOptionPane.showMessageDialog(this, result);
                    clear();
                    loadAllItems();
                } catch (Exception ex) {
                    Logger.getLogger(ItemPanel.class.getName()).log(Level.SEVERE, null, ex);
                    JOptionPane.showMessageDialog(this, ex.getMessage());
                }

            } else {
                JOptionPane.showMessageDialog(this, "Please enter 'Qty On Hand' to Integer Value");
                qohText.setText("");
            }

        } else {
            JOptionPane.showMessageDialog(this, "Please enter 'Unit Price' to Integer or Double Value");
            unitPriceText.setText("");
        }
    }

    private void updateItem() {
        if (checkUnitPrice(unitPriceText.getText())) {

            if (checkQTYonHand(qohText.getText())) {

                try {
                    ItemDto itemDto = new ItemDto(
                            itemCodeText.getText(),
                            descriptionText.getText(),
                            packSizeText.getText(),
                            Double.parseDouble(unitPriceText.getText()),
                            Integer.parseInt(qohText.getText()));

                    String result = itemController.updateItem(itemDto);
                    JOptionPane.showMessageDialog(this, result);
                    clear();
                    loadAllItems();
                } catch (Exception ex) {
                    Logger.getLogger(ItemPanel.class.getName()).log(Level.SEVERE, null, ex);
                    JOptionPane.showMessageDialog(this, ex.getMessage());
                }

            } else {
                JOptionPane.showMessageDialog(this, "Please enter 'Qty On Hand' to Integer Value");
                qohText.setText("");
            }

        } else {
            JOptionPane.showMessageDialog(this, "Please enter 'Unit Price' to Integer or Double Value");
            unitPriceText.setText("");
        }
    }

    private void deleteItem() {
        try {
            String result = itemController.deleteItem(itemCodeText.getText());
            JOptionPane.showMessageDialog(this, result);
            clear();
            loadAllItems();
        } catch (Exception ex) {
            Logger.getLogger(CustomerPanel.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }

    private boolean checkUnitPrice(String price) {
        try {
            int number = Integer.parseInt(price);
            return true;
        } catch (NumberFormatException e1) {
            try {
                double number = Double.parseDouble(price);
                return true;
            } catch (NumberFormatException e2) {
                return false;
            }
        }
    }

    private boolean checkQTYonHand(String qty) {
        try {
            int number = Integer.parseInt(qty);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private void clear() {
        itemCodeText.setText("");
        descriptionText.setText("");
        packSizeText.setText("");
        unitPriceText.setText("");
        qohText.setText("");
    }
}