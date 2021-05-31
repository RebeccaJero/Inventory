/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inventory;

import Classes.Fruit;
import Classes.Inventoriable;
import Classes.Vegetables;
import Inventory.Main;
import static Inventory.Main.inventory;
import static Inventory.Main.putItemsToTree;
import static com.sun.xml.internal.fastinfoset.alphabet.BuiltInRestrictedAlphabets.table;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import src.AVLTreeMap;
import src.LinkedQueue;

/**
 *
 * @author Becky
 */
public class InventoryJFrame extends javax.swing.JFrame {

    /**
     * Creates new form InventoryJFrame
     */
       // st
  
    public InventoryJFrame() {
        initComponents();

      
    
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        popupMenu1 = new java.awt.PopupMenu();
        sortByCategory = new java.awt.CheckboxMenuItem();
        popupMenu2 = new java.awt.PopupMenu();
        popupMenu3 = new java.awt.PopupMenu();
        jButton1 = new javax.swing.JButton();
        textField = new javax.swing.JTextField();
        submitButton = new javax.swing.JButton();
        itemTypeButton = new javax.swing.JButton();
        itemTypeText = new javax.swing.JTextField();
        listButton = new javax.swing.JButton();
        displayNumberLabel = new javax.swing.JLabel();
        numberListLabel = new javax.swing.JLabel();
        barcodeButton = new javax.swing.JButton();
        barcodeText = new javax.swing.JTextField();
        lookUpButton = new javax.swing.JButton();
        descriptionText = new javax.swing.JTextField();
        sortCategoryButton = new javax.swing.JButton();
        sortByTypeButton = new javax.swing.JButton();
        sortByBarcodeButton = new javax.swing.JButton();
        sortByDescriptionButton = new javax.swing.JButton();
        sortByPriceButton = new javax.swing.JButton();
        sortByWeightButon = new javax.swing.JButton();
        priceRangeButton = new javax.swing.JButton();
        priceRange1Text = new javax.swing.JTextField();
        toLabel = new javax.swing.JLabel();
        priceRange2Text = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        displayLabel = new javax.swing.JLabel();

        popupMenu1.setLabel("popupMenu1");

        sortByCategory.setLabel("checkboxMenuItem1");
        popupMenu1.add(sortByCategory);

        popupMenu2.setLabel("popupMenu2");

        popupMenu3.setLabel("popupMenu3");

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        textField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldActionPerformed(evt);
            }
        });

        submitButton.setText("Get Category");
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });

        itemTypeButton.setText("Look Up Item Type");
        itemTypeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemTypeButtonActionPerformed(evt);
            }
        });

        listButton.setText("Store List");
        listButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listButtonActionPerformed(evt);
            }
        });

        displayNumberLabel.setText("Number Of Items in the Store");

        barcodeButton.setText("Enter Barcode ");
        barcodeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                barcodeButtonActionPerformed(evt);
            }
        });

        lookUpButton.setText("Look Up Description");
        lookUpButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lookUpButtonActionPerformed(evt);
            }
        });

        sortCategoryButton.setText("Sort By Category");
        sortCategoryButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sortCategoryButtonActionPerformed(evt);
            }
        });

        sortByTypeButton.setText("Sort By Type Of Item");
        sortByTypeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sortByTypeButtonActionPerformed(evt);
            }
        });

        sortByBarcodeButton.setText("Sort By Barcode");
        sortByBarcodeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sortByBarcodeButtonActionPerformed(evt);
            }
        });

        sortByDescriptionButton.setText("Sort By Description");
        sortByDescriptionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sortByDescriptionButtonActionPerformed(evt);
            }
        });

        sortByPriceButton.setText("Sort By Price");
        sortByPriceButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sortByPriceButtonActionPerformed(evt);
            }
        });

        sortByWeightButon.setText("Sort By Weight");
        sortByWeightButon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sortByWeightButonActionPerformed(evt);
            }
        });

        priceRangeButton.setText("Price Range");
        priceRangeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                priceRangeButtonActionPerformed(evt);
            }
        });

        toLabel.setText("to");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Category", "Item Type", "Barcode Number", "Item Description", "Item Price", "Item weight"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1097, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 119, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(listButton)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(displayNumberLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(numberListLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(280, 280, 280))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(submitButton)
                            .addComponent(barcodeButton))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(textField, javax.swing.GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE)
                            .addComponent(barcodeText)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(priceRangeButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(lookUpButton)
                            .addComponent(itemTypeButton))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(itemTypeText, javax.swing.GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE)
                                .addComponent(descriptionText, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(priceRange1Text, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(toLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(priceRange2Text, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(sortCategoryButton)
                        .addGap(18, 18, 18)
                        .addComponent(sortByTypeButton)
                        .addGap(26, 26, 26)
                        .addComponent(sortByBarcodeButton)
                        .addGap(18, 18, 18)
                        .addComponent(sortByDescriptionButton)
                        .addGap(18, 18, 18)
                        .addComponent(sortByPriceButton)
                        .addGap(18, 18, 18)
                        .addComponent(sortByWeightButon))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(displayLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 1199, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(listButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(numberListLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(displayNumberLabel))
                        .addGap(797, 797, 797))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 744, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)))
                .addComponent(displayLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sortCategoryButton)
                    .addComponent(sortByTypeButton)
                    .addComponent(sortByBarcodeButton)
                    .addComponent(sortByDescriptionButton)
                    .addComponent(sortByPriceButton)
                    .addComponent(sortByWeightButon))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(priceRangeButton)
                    .addComponent(priceRange1Text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(toLabel)
                    .addComponent(priceRange2Text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lookUpButton)
                    .addComponent(descriptionText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(itemTypeButton)
                    .addComponent(itemTypeText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(submitButton))
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(barcodeButton)
                    .addComponent(barcodeText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed
        // TODO add your handling code here:
        String text=textField.getText();
       // textArea.setText(Main.printItemsfromCategory(text));
       
         jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Category", "Item Type", "Item Barcode", "Item Description", "Item Price", "Item Size"
            }));
        
        
        
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel(); 
        ArrayList<Inventoriable> list=Main.printItemsfromCategory(text);
       
      Object[] row= new Object [5]; 
          for(int i=0;i<list.size();i++)
        {
           
            model.setValueAt(list.get(i).getCategory(), i, 0);
            model.setValueAt(list.get(i).getItemType(), i, 1);
            model.setValueAt(list.get(i).getBarcode(), i, 2);
            model.setValueAt(list.get(i).getDescription(), i, 3);
            model.setValueAt(list.get(i).getPrice(), i, 4);
            model.setValueAt(list.get(i).getSize(), i, 5);
            model.addRow(row);
  
        }
    
       

         
    
    }//GEN-LAST:event_submitButtonActionPerformed

    private void textFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldActionPerformed

    private void itemTypeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemTypeButtonActionPerformed
        // TODO add your handling code here:
           jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Item Type", "Item Price", "Item Barcode", "Item Description", "Item Category", "Item Size"
            }));
       DefaultTableModel model = (DefaultTableModel) jTable1.getModel(); 
        
        String itemType=itemTypeText.getText();
       ArrayList<Inventoriable> list=Main.printItemType(itemType);
       
      Object[] row= new Object [5]; 
          for(int i=0;i<list.size();i++)
        {
           
            model.setValueAt(list.get(i).getItemType(), i, 0);
            model.setValueAt(list.get(i).getPrice(), i, 1);
            model.setValueAt(list.get(i).getBarcode(), i, 2);
            model.setValueAt(list.get(i).getDescription(), i, 3);
            model.setValueAt(list.get(i).getCategory(), i, 4);
            model.setValueAt(list.get(i).getSize(), i, 5);
            model.addRow(row);
  
        }
    
        
    }//GEN-LAST:event_itemTypeButtonActionPerformed

    private void listButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listButtonActionPerformed
        // TODO add your handling code here:
        
          jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Category", "Item Type", "Item Barcode", "Item Description", "Item Price", "Item Size"
            }));
        
        
        
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel(); 
       
        Inventoriable[] list=Main.collectItems();
        String text="";
        for(int i=0;i<list.length;i++)
        {
            text+=list[i].toString()+"\n";
            // textArea.setText(text);
        }
       
         numberListLabel.setText(String.valueOf(list.length-2));
         Object[] row= new Object[5];
         
       
         
          for(int i=0;i<list.length;i++)
        {
           
            model.setValueAt(list[i].getCategory(), i, 0);
            model.setValueAt(list[i].getItemType(), i, 1);
            model.setValueAt(list[i].getBarcode(), i, 2);
            model.setValueAt(list[i].getDescription(), i, 3);
            model.setValueAt(list[i].getPrice(), i, 4);
            model.setValueAt(list[i].getSize(), i, 5);
            model.addRow(row);
  
        }
         
     
    }//GEN-LAST:event_listButtonActionPerformed

    private void barcodeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_barcodeButtonActionPerformed
        // TODO add your handling code here:
        String barcodeNumber=barcodeText.getText();
        int convertNumber=Integer.parseInt(barcodeNumber);
        displayLabel.setText(Main.getBarcodeFromList(convertNumber));
    }//GEN-LAST:event_barcodeButtonActionPerformed

    private void lookUpButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lookUpButtonActionPerformed
        // TODO add your handling code here:
          String description=descriptionText.getText();
        ArrayList<Inventoriable> list=Main.getDescriptionOfItem(description);
         jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Description", "Category", "Item Type", "Item Barcode", "Item Price", "Item Size"
            }));
      DefaultTableModel model = (DefaultTableModel) jTable1.getModel(); 
     
       // String description=descriptionText.getText();
       // ArrayList<Inventoriable> list=Main.getDescriptionOfItem(description);
        Object[] row= new Object [5]; 
          for(int i=0;i<list.size();i++)
        {
           
            model.setValueAt(list.get(i).getDescription(), i, 0);
            model.setValueAt(list.get(i).getCategory(), i, 1);
            model.setValueAt(list.get(i).getItemType(), i, 2);
            model.setValueAt(list.get(i).getBarcode(), i, 3);
            model.setValueAt(list.get(i).getPrice(), i, 4);
            model.setValueAt(list.get(i).getSize(), i, 5);
            model.addRow(row);
  
        }
             
    }//GEN-LAST:event_lookUpButtonActionPerformed

    private void sortCategoryButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sortCategoryButtonActionPerformed
        // TODO add your handling code here:
       ArrayList<Inventoriable> list=Main.sortByCategory();
       
       jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Category", "Description", "Item Type", "Item Barcode", "Item Price", "Item Size"
            }));
      DefaultTableModel model = (DefaultTableModel) jTable1.getModel(); 
     
       // String description=descriptionText.getText();
       // ArrayList<Inventoriable> list=Main.getDescriptionOfItem(description);
        Object[] row= new Object [5]; 
          for(int i=0;i<list.size();i++)
        {
           
            model.setValueAt(list.get(i).getCategory(), i, 0);
            model.setValueAt(list.get(i).getDescription(), i, 1);
            model.setValueAt(list.get(i).getItemType(), i, 2);
            model.setValueAt(list.get(i).getBarcode(), i, 3);
            model.setValueAt(list.get(i).getPrice(), i, 4);
            model.setValueAt(list.get(i).getSize(), i, 5);
            model.addRow(row);
  
        }
             
       
       
       
       
    }//GEN-LAST:event_sortCategoryButtonActionPerformed

    private void sortByTypeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sortByTypeButtonActionPerformed
        // TODO add your handling code here:
       
         ArrayList<Inventoriable> list=Main.sortByItemType();
       
       jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Item Type", "Description", "Category", "Item Barcode", "Item Price", "Item Size"
            }));
      DefaultTableModel model = (DefaultTableModel) jTable1.getModel(); 
     
       // String description=descriptionText.getText();
       // ArrayList<Inventoriable> list=Main.getDescriptionOfItem(description);
        Object[] row= new Object [5]; 
          for(int i=0;i<list.size();i++)
        {
           
            model.setValueAt(list.get(i).getItemType(), i, 0);
            model.setValueAt(list.get(i).getDescription(), i, 1);
            model.setValueAt(list.get(i).getCategory(), i, 2);
            model.setValueAt(list.get(i).getBarcode(), i, 3);
            model.setValueAt(list.get(i).getPrice(), i, 4);
            model.setValueAt(list.get(i).getSize(), i, 5);
            model.addRow(row);
  
        }
        
        
        
        
    }//GEN-LAST:event_sortByTypeButtonActionPerformed

    private void sortByBarcodeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sortByBarcodeButtonActionPerformed
        // TODO add your handling code here:
          ArrayList<Inventoriable> list=Main.sortByBarcode();
       
       jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Item Barcode", "Item Price", "Category", "Item Type", "Item Description", "Item Size"
            }));
      DefaultTableModel model = (DefaultTableModel) jTable1.getModel(); 
     
       // String description=descriptionText.getText();
       // ArrayList<Inventoriable> list=Main.getDescriptionOfItem(description);
        Object[] row= new Object [5]; 
          for(int i=0;i<list.size();i++)
        {
           
            model.setValueAt(list.get(i).getBarcode(), i, 0);
            model.setValueAt(list.get(i).getPrice(), i, 1);
            model.setValueAt(list.get(i).getCategory(), i, 2);
            model.setValueAt(list.get(i).getItemType(), i, 3);
            model.setValueAt(list.get(i).getDescription(), i, 4);
            model.setValueAt(list.get(i).getSize(), i, 5);
            model.addRow(row);
  
        }
        
        
    }//GEN-LAST:event_sortByBarcodeButtonActionPerformed

    private void sortByDescriptionButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sortByDescriptionButtonActionPerformed
        // TODO add your handling code here:
       
        
          ArrayList<Inventoriable> list=Main.sortByDescription();
       
       jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Item Description", "Item Price", "Category", "Item Barcode", "Item Type", "Item Size"
            }));
      DefaultTableModel model = (DefaultTableModel) jTable1.getModel(); 
     
       // String description=descriptionText.getText();
       // ArrayList<Inventoriable> list=Main.getDescriptionOfItem(description);
        Object[] row= new Object [5]; 
          for(int i=0;i<list.size();i++)
        {
           
            model.setValueAt(list.get(i).getDescription(), i, 0);
            model.setValueAt(list.get(i).getPrice(), i, 1);
            model.setValueAt(list.get(i).getCategory(), i, 2);
            model.setValueAt(list.get(i).getBarcode(), i, 3);
            model.setValueAt(list.get(i).getItemType(), i, 4);
            model.setValueAt(list.get(i).getSize(), i, 5);
            model.addRow(row);
  
        }
        
    }//GEN-LAST:event_sortByDescriptionButtonActionPerformed

    private void sortByPriceButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sortByPriceButtonActionPerformed
        // TODO add your handling code here:
          ArrayList<Inventoriable> list=Main.sortByPrice();
       
       jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Item Price", "Description", "Category", "Item Barcode", "Item Type", "Item Size"
            }));
      DefaultTableModel model = (DefaultTableModel) jTable1.getModel(); 
     
       // String description=descriptionText.getText();
       // ArrayList<Inventoriable> list=Main.getDescriptionOfItem(description);
        Object[] row= new Object [5]; 
          for(int i=0;i<list.size();i++)
        {
           
            model.setValueAt(list.get(i).getPrice(), i, 0);
            model.setValueAt(list.get(i).getDescription(), i, 1);
            model.setValueAt(list.get(i).getCategory(), i, 2);
            model.setValueAt(list.get(i).getBarcode(), i, 3);
            model.setValueAt(list.get(i).getItemType(), i, 4);
            model.setValueAt(list.get(i).getSize(), i, 5);
            model.addRow(row);
  
        }
        
    }//GEN-LAST:event_sortByPriceButtonActionPerformed

    private void sortByWeightButonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sortByWeightButonActionPerformed
        // TODO add your handling code here:
         ArrayList<Inventoriable> list=Main.sortByWeight();
       
       jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Item Size", "Item Price", "Category", "Item Barcode", "Item Description", "Item Type"
            }));
      DefaultTableModel model = (DefaultTableModel) jTable1.getModel(); 
     
       // String description=descriptionText.getText();
       // ArrayList<Inventoriable> list=Main.getDescriptionOfItem(description);
        Object[] row= new Object [5]; 
          for(int i=0;i<list.size();i++)
        {
           
            model.setValueAt(list.get(i).getSize(), i, 0);
            model.setValueAt(list.get(i).getPrice(), i, 1);
            model.setValueAt(list.get(i).getCategory(), i, 2);
            model.setValueAt(list.get(i).getBarcode(), i, 3);
            model.setValueAt(list.get(i).getDescription(), i, 4);
            model.setValueAt(list.get(i).getItemType(), i, 5);
            model.addRow(row);
  
        }
        
        
        
    }//GEN-LAST:event_sortByWeightButonActionPerformed

    private void priceRangeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_priceRangeButtonActionPerformed
        // TODO add your handling code here:
        
          jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Item Price", "Item Type", "Item Barcode", "Item Description", "Item Category", "Item Size"
            }));
      
        int number1,number2;
        ArrayList<Inventoriable> list=new ArrayList();
        try
        {
            number1=Integer.parseInt(priceRange1Text.getText());
            number2=Integer.parseInt(priceRange2Text.getText());
            
            list=Main.getPriceRange(number1,number2);
            
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(this, "Please Enter A Valid Number");
        }
        
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        Object[] row= new Object[5];
        
           for(int i=0;i<list.size();i++)
        {
           
            model.setValueAt(list.get(i).getPrice(), i, 0);
            model.setValueAt(list.get(i).getItemType(), i, 1);
            model.setValueAt(list.get(i).getBarcode(), i, 2);
            model.setValueAt(list.get(i).getDescription(), i, 3);
            model.setValueAt(list.get(i).getCategory(), i, 4);
            model.setValueAt(list.get(i).getSize(), i, 5);
            model.addRow(row);
  
        }
        
        
       
        
    }//GEN-LAST:event_priceRangeButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        
    
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(InventoryJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InventoryJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InventoryJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InventoryJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
      
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InventoryJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton barcodeButton;
    private javax.swing.JTextField barcodeText;
    private javax.swing.JTextField descriptionText;
    private javax.swing.JLabel displayLabel;
    private javax.swing.JLabel displayNumberLabel;
    private javax.swing.JButton itemTypeButton;
    private javax.swing.JTextField itemTypeText;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton listButton;
    private javax.swing.JButton lookUpButton;
    private javax.swing.JLabel numberListLabel;
    private java.awt.PopupMenu popupMenu1;
    private java.awt.PopupMenu popupMenu2;
    private java.awt.PopupMenu popupMenu3;
    private javax.swing.JTextField priceRange1Text;
    private javax.swing.JTextField priceRange2Text;
    private javax.swing.JButton priceRangeButton;
    private javax.swing.JButton sortByBarcodeButton;
    private java.awt.CheckboxMenuItem sortByCategory;
    private javax.swing.JButton sortByDescriptionButton;
    private javax.swing.JButton sortByPriceButton;
    private javax.swing.JButton sortByTypeButton;
    private javax.swing.JButton sortByWeightButon;
    private javax.swing.JButton sortCategoryButton;
    private javax.swing.JButton submitButton;
    private javax.swing.JTextField textField;
    private javax.swing.JLabel toLabel;
    // End of variables declaration//GEN-END:variables
}