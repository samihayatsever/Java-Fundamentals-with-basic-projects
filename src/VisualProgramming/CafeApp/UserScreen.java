/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package VisualProgramming.CafeApp;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Dictionary;
import java.util.Hashtable;
import javax.swing.ButtonGroup;

/**
 *
 * @author samih
 */
public class UserScreen extends javax.swing.JFrame {

    /**
     * Creates new form UserScreen
     */
    Cafe cafe= new Cafe();
    ArrayList<Item> items = new ArrayList<Item>();
    Order order;
    String tableSelection;
    String selectedButton;
    Table activeTable = new Table();
    
    public UserScreen() {
        initComponents();
        //jTabbedPane1.setSelectedComponent(this.pnlTableSelection);
        jTabbedPane1.setEnabledAt(0, false);
        jTabbedPane1.setEnabledAt(1, false);
        jTabbedPane1.setEnabledAt(2, true);
        ButtonGroup group = new ButtonGroup();
        group.add(rBtnIstanbul);
        group.add(rBtnEskisehir);
        group.add(rBtnIzmir);
        group.add(rBtnAnkara);
        group.add(rBtnBursa);
        group.add(rBtnZonguldak);
        group.add(rBtnErzurum);
        group.add(rBtnKars);
        group.add(rBtnAdana);
        group.add(rBtnAntalya);
        
        createAllTables();
        createMenu();
        
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        pnlMenu = new javax.swing.JPanel();
        lblCoffee = new java.awt.Label();
        lblTea = new java.awt.Label();
        lblWater = new java.awt.Label();
        lblMWater = new java.awt.Label();
        lblTeaPrice = new java.awt.Label();
        lblCoffeePrice = new java.awt.Label();
        lblWaterPrice = new java.awt.Label();
        lblMWaterPrice = new java.awt.Label();
        tfTea = new java.awt.TextField();
        btnTeaPlus = new java.awt.Button();
        btnTeaMinus = new java.awt.Button();
        btnCoffeeMinus = new java.awt.Button();
        tfCoffee = new java.awt.TextField();
        btnCoffeePlus = new java.awt.Button();
        btnWaterMinus = new java.awt.Button();
        tfWater = new java.awt.TextField();
        btnWaterPlus = new java.awt.Button();
        btnMWaterPriceMinus = new java.awt.Button();
        tfMWater = new java.awt.TextField();
        btnMWaterPricePlus = new java.awt.Button();
        btnGiveOrder = new java.awt.Button();
        btnGetBill = new java.awt.Button();
        pnlBill = new javax.swing.JPanel();
        lstOrder = new java.awt.List();
        label1 = new java.awt.Label();
        label2 = new java.awt.Label();
        lstTea = new java.awt.List();
        label3 = new java.awt.Label();
        lstCoffee = new java.awt.List();
        label4 = new java.awt.Label();
        lstWater = new java.awt.List();
        label5 = new java.awt.Label();
        lstMWater = new java.awt.List();
        lstPrice = new java.awt.List();
        label6 = new java.awt.Label();
        label7 = new java.awt.Label();
        tfTotalPrice = new java.awt.TextField();
        btnPay = new java.awt.Button();
        pnlTableSelection = new javax.swing.JPanel();
        rBtnIstanbul = new javax.swing.JRadioButton();
        btnIstanbul = new javax.swing.JButton();
        rBtnAdana = new javax.swing.JRadioButton();
        btnAdana = new javax.swing.JButton();
        rBtnErzurum = new javax.swing.JRadioButton();
        btnErzurum = new javax.swing.JButton();
        btnEskisehir = new javax.swing.JButton();
        rBtnEskisehir = new javax.swing.JRadioButton();
        rBtnBursa = new javax.swing.JRadioButton();
        btnBursa = new javax.swing.JButton();
        rBtnKars = new javax.swing.JRadioButton();
        btnKars = new javax.swing.JButton();
        btnIzmir = new javax.swing.JButton();
        rBtnIzmir = new javax.swing.JRadioButton();
        rBtnAntalya = new javax.swing.JRadioButton();
        btnAntalya = new javax.swing.JButton();
        rBtnZonguldak = new javax.swing.JRadioButton();
        btnZonguldak = new javax.swing.JButton();
        btnAnkara = new javax.swing.JButton();
        rBtnAnkara = new javax.swing.JRadioButton();
        btnSelect = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        pnlMenu.setEnabled(false);
        pnlMenu.setFocusable(false);

        lblCoffee.setText("label1");

        lblTea.setText("label1");

        lblWater.setText("label1");

        lblMWater.setText("label1");

        lblTeaPrice.setText("label1");

        lblCoffeePrice.setText("label1");

        lblWaterPrice.setText("label1");

        lblMWaterPrice.setText("label1");

        tfTea.setEditable(false);
        tfTea.setText("0");

        btnTeaPlus.setLabel("+");
        btnTeaPlus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTeaPlusActionPerformed(evt);
            }
        });

        btnTeaMinus.setLabel("-");
        btnTeaMinus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTeaMinusActionPerformed(evt);
            }
        });

        btnCoffeeMinus.setLabel("-");
        btnCoffeeMinus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCoffeeMinusActionPerformed(evt);
            }
        });

        tfCoffee.setEditable(false);
        tfCoffee.setText("0");

        btnCoffeePlus.setLabel("+");
        btnCoffeePlus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCoffeePlusActionPerformed(evt);
            }
        });

        btnWaterMinus.setLabel("-");
        btnWaterMinus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnWaterMinusActionPerformed(evt);
            }
        });

        tfWater.setEditable(false);
        tfWater.setText("0");

        btnWaterPlus.setLabel("+");
        btnWaterPlus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnWaterPlusActionPerformed(evt);
            }
        });

        btnMWaterPriceMinus.setLabel("-");
        btnMWaterPriceMinus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMWaterPriceMinusActionPerformed(evt);
            }
        });

        tfMWater.setEditable(false);
        tfMWater.setText("0");

        btnMWaterPricePlus.setLabel("+");
        btnMWaterPricePlus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMWaterPricePlusActionPerformed(evt);
            }
        });

        btnGiveOrder.setLabel("Sipariş Ver");
        btnGiveOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGiveOrderActionPerformed(evt);
            }
        });

        btnGetBill.setLabel("Hesap İste");
        btnGetBill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGetBillActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlMenuLayout = new javax.swing.GroupLayout(pnlMenu);
        pnlMenu.setLayout(pnlMenuLayout);
        pnlMenuLayout.setHorizontalGroup(
            pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMenuLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMWater, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblWater, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCoffee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTeaPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCoffeePrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblWaterPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMWaterPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pnlMenuLayout.createSequentialGroup()
                            .addComponent(btnTeaMinus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(2, 2, 2)
                            .addComponent(tfTea, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(2, 2, 2)
                            .addComponent(btnTeaPlus, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(pnlMenuLayout.createSequentialGroup()
                            .addComponent(btnCoffeeMinus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(2, 2, 2)
                            .addComponent(tfCoffee, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(2, 2, 2)
                            .addComponent(btnCoffeePlus, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(pnlMenuLayout.createSequentialGroup()
                            .addComponent(btnWaterMinus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(2, 2, 2)
                            .addComponent(tfWater, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(2, 2, 2)
                            .addComponent(btnWaterPlus, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnlMenuLayout.createSequentialGroup()
                        .addComponent(btnMWaterPriceMinus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(tfMWater, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(btnMWaterPricePlus, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(57, 57, 57)
                .addGroup(pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnGiveOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGetBill, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(284, Short.MAX_VALUE))
        );
        pnlMenuLayout.setVerticalGroup(
            pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMenuLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlMenuLayout.createSequentialGroup()
                        .addGroup(pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(pnlMenuLayout.createSequentialGroup()
                                .addGroup(pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(pnlMenuLayout.createSequentialGroup()
                                        .addGroup(pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(btnTeaMinus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblTeaPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btnTeaPlus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(tfTea, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblCoffeePrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(btnCoffeeMinus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnCoffeePlus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfCoffee, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblWaterPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnWaterMinus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnWaterPlus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfWater, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnGiveOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblMWaterPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnMWaterPriceMinus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnMWaterPricePlus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfMWater, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnGetBill, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnlMenuLayout.createSequentialGroup()
                        .addComponent(lblTea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblCoffee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblWater, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblMWater, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(159, Short.MAX_VALUE))
        );

        btnTeaPlus.getAccessibleContext().setAccessibleName("");

        jTabbedPane1.addTab("Menü", pnlMenu);

        pnlBill.setEnabled(false);
        pnlBill.setFocusable(false);

        label1.setText("Sipariş");

        label2.setText("Çay");

        label3.setText("Kahve");

        label4.setText("Su");

        label5.setText("Soda");

        label6.setText("Toplam Tutar: ");

        label7.setText("Ücret");

        tfTotalPrice.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        tfTotalPrice.setText("0000");

        btnPay.setLabel("Öde");
        btnPay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPayActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlBillLayout = new javax.swing.GroupLayout(pnlBill);
        pnlBill.setLayout(pnlBillLayout);
        pnlBillLayout.setHorizontalGroup(
            pnlBillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBillLayout.createSequentialGroup()
                .addGroup(pnlBillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlBillLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lstOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlBillLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(pnlBillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlBillLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lstTea, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlBillLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlBillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lstCoffee, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(pnlBillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lstWater, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlBillLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(pnlBillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlBillLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lstMWater, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlBillLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(label5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(pnlBillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlBillLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lstPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlBillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(label6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnPay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfTotalPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlBillLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(label7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(75, Short.MAX_VALUE))
        );
        pnlBillLayout.setVerticalGroup(
            pnlBillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBillLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(pnlBillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(pnlBillLayout.createSequentialGroup()
                        .addComponent(label7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(pnlBillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlBillLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lstPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlBillLayout.createSequentialGroup()
                                .addGap(82, 82, 82)
                                .addGroup(pnlBillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(tfTotalPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnPay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(pnlBillLayout.createSequentialGroup()
                        .addComponent(label5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lstMWater, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlBillLayout.createSequentialGroup()
                        .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lstWater, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlBillLayout.createSequentialGroup()
                        .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lstCoffee, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlBillLayout.createSequentialGroup()
                        .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lstTea, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlBillLayout.createSequentialGroup()
                        .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lstOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Hesap", pnlBill);

        rBtnIstanbul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rBtnIstanbulActionPerformed(evt);
            }
        });

        btnIstanbul.setBackground(new java.awt.Color(255, 183, 126));
        btnIstanbul.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        btnIstanbul.setText("İSTANBUL");
        btnIstanbul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIstanbulActionPerformed(evt);
            }
        });

        rBtnAdana.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rBtnAdanaActionPerformed(evt);
            }
        });

        btnAdana.setBackground(new java.awt.Color(255, 183, 126));
        btnAdana.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        btnAdana.setText("ADANA");
        btnAdana.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdanaActionPerformed(evt);
            }
        });

        rBtnErzurum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rBtnErzurumActionPerformed(evt);
            }
        });

        btnErzurum.setBackground(new java.awt.Color(255, 183, 126));
        btnErzurum.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        btnErzurum.setText("ERZURUM");
        btnErzurum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnErzurumActionPerformed(evt);
            }
        });

        btnEskisehir.setBackground(new java.awt.Color(255, 183, 126));
        btnEskisehir.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        btnEskisehir.setText("ESKİŞEHİR");
        btnEskisehir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEskisehirActionPerformed(evt);
            }
        });

        rBtnEskisehir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rBtnEskisehirActionPerformed(evt);
            }
        });

        rBtnBursa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rBtnBursaActionPerformed(evt);
            }
        });

        btnBursa.setBackground(new java.awt.Color(255, 183, 126));
        btnBursa.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        btnBursa.setText("BURSA");
        btnBursa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBursaActionPerformed(evt);
            }
        });

        rBtnKars.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rBtnKarsActionPerformed(evt);
            }
        });

        btnKars.setBackground(new java.awt.Color(255, 183, 126));
        btnKars.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        btnKars.setText("KARS");
        btnKars.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKarsActionPerformed(evt);
            }
        });

        btnIzmir.setBackground(new java.awt.Color(255, 183, 126));
        btnIzmir.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        btnIzmir.setText("İZMİR");
        btnIzmir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIzmirActionPerformed(evt);
            }
        });

        rBtnIzmir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rBtnIzmirActionPerformed(evt);
            }
        });

        rBtnAntalya.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rBtnAntalyaActionPerformed(evt);
            }
        });

        btnAntalya.setBackground(new java.awt.Color(255, 183, 126));
        btnAntalya.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        btnAntalya.setText("ANTALYA");
        btnAntalya.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAntalyaActionPerformed(evt);
            }
        });

        rBtnZonguldak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rBtnZonguldakActionPerformed(evt);
            }
        });

        btnZonguldak.setBackground(new java.awt.Color(255, 183, 126));
        btnZonguldak.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        btnZonguldak.setText("ZONGULDAK");
        btnZonguldak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnZonguldakActionPerformed(evt);
            }
        });

        btnAnkara.setBackground(new java.awt.Color(255, 183, 126));
        btnAnkara.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        btnAnkara.setText("ANKARA");
        btnAnkara.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnkaraActionPerformed(evt);
            }
        });

        rBtnAnkara.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rBtnAnkaraActionPerformed(evt);
            }
        });

        btnSelect.setBackground(new java.awt.Color(0, 204, 102));
        btnSelect.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnSelect.setText("SEÇ");
        btnSelect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelectActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlTableSelectionLayout = new javax.swing.GroupLayout(pnlTableSelection);
        pnlTableSelection.setLayout(pnlTableSelectionLayout);
        pnlTableSelectionLayout.setHorizontalGroup(
            pnlTableSelectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTableSelectionLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(pnlTableSelectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlTableSelectionLayout.createSequentialGroup()
                        .addComponent(rBtnErzurum)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnErzurum, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlTableSelectionLayout.createSequentialGroup()
                        .addComponent(rBtnAdana)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAdana, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlTableSelectionLayout.createSequentialGroup()
                        .addComponent(rBtnIstanbul)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnIstanbul, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(33, 33, 33)
                .addGroup(pnlTableSelectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlTableSelectionLayout.createSequentialGroup()
                        .addComponent(rBtnKars)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnKars, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlTableSelectionLayout.createSequentialGroup()
                        .addComponent(rBtnBursa)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBursa, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlTableSelectionLayout.createSequentialGroup()
                        .addComponent(rBtnEskisehir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEskisehir, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(32, 32, 32)
                .addGroup(pnlTableSelectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlTableSelectionLayout.createSequentialGroup()
                        .addComponent(rBtnAntalya)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAntalya, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlTableSelectionLayout.createSequentialGroup()
                        .addComponent(rBtnIzmir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnIzmir, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(pnlTableSelectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlTableSelectionLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(rBtnAnkara)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAnkara, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlTableSelectionLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(rBtnZonguldak)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlTableSelectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlTableSelectionLayout.createSequentialGroup()
                                .addComponent(btnSelect, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(8, 8, 8))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlTableSelectionLayout.createSequentialGroup()
                                .addComponent(btnZonguldak, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())))))
        );
        pnlTableSelectionLayout.setVerticalGroup(
            pnlTableSelectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTableSelectionLayout.createSequentialGroup()
                .addGroup(pnlTableSelectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlTableSelectionLayout.createSequentialGroup()
                        .addGroup(pnlTableSelectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlTableSelectionLayout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addComponent(rBtnIstanbul))
                            .addGroup(pnlTableSelectionLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(btnIstanbul, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlTableSelectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlTableSelectionLayout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(rBtnAdana))
                            .addComponent(btnAdana, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlTableSelectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlTableSelectionLayout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(rBtnErzurum))
                            .addComponent(btnErzurum, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnlTableSelectionLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pnlTableSelectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlTableSelectionLayout.createSequentialGroup()
                                .addGroup(pnlTableSelectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnlTableSelectionLayout.createSequentialGroup()
                                        .addGap(38, 38, 38)
                                        .addComponent(rBtnEskisehir))
                                    .addComponent(btnEskisehir, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(pnlTableSelectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnlTableSelectionLayout.createSequentialGroup()
                                        .addGap(38, 38, 38)
                                        .addComponent(rBtnBursa))
                                    .addComponent(btnBursa, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(pnlTableSelectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnlTableSelectionLayout.createSequentialGroup()
                                        .addGap(38, 38, 38)
                                        .addComponent(rBtnKars))
                                    .addComponent(btnKars, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(pnlTableSelectionLayout.createSequentialGroup()
                                .addGroup(pnlTableSelectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnIzmir, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnAnkara, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(pnlTableSelectionLayout.createSequentialGroup()
                                        .addGap(38, 38, 38)
                                        .addGroup(pnlTableSelectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(rBtnIzmir)
                                            .addComponent(rBtnAnkara))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(pnlTableSelectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnAntalya, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnZonguldak, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(pnlTableSelectionLayout.createSequentialGroup()
                                        .addGap(38, 38, 38)
                                        .addGroup(pnlTableSelectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(rBtnAntalya)
                                            .addComponent(rBtnZonguldak))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnSelect, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnIstanbul.getAccessibleContext().setAccessibleName("btnIstanbul");
        btnSelect.getAccessibleContext().setAccessibleName("btnSelect");

        jTabbedPane1.addTab("Masa Seçimi", pnlTableSelection);
        pnlTableSelection.getAccessibleContext().setAccessibleName("Masa Seçimi");

        jTabbedPane1.setSelectedComponent(pnlTableSelection);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        jTabbedPane1.getAccessibleContext().setAccessibleName("tab");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelectActionPerformed
        // TODO add your handling code here:
        System.out.println(cafe);
        activeTable = cafe.selectTable(tableSelection);
        System.out.println(tableSelection);
        System.out.println(activeTable);
        //Order order = new Order();
        
        setEnableButton(tableSelection);
        
        jTabbedPane1.setSelectedComponent(this.pnlMenu);
        jTabbedPane1.setEnabledAt(0, true);
        jTabbedPane1.setEnabledAt(1, false);
        jTabbedPane1.setEnabledAt(2, false);
        
        createMenu();
    }//GEN-LAST:event_btnSelectActionPerformed

    private void btnIstanbulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIstanbulActionPerformed
        rBtnIstanbul.doClick();
        btnIstanbul.setBackground(Color.red);
        btnEskisehir.setBackground(new java.awt.Color(255,183,126));
        btnIzmir.setBackground(new java.awt.Color(255,183,126));
        btnAnkara.setBackground(new java.awt.Color(255,183,126));
        btnBursa.setBackground(new java.awt.Color(255,183,126));
        btnAntalya.setBackground(new java.awt.Color(255,183,126));
        btnErzurum.setBackground(new java.awt.Color(255,183,126));
        btnAdana.setBackground(new java.awt.Color(255,183,126));
        btnZonguldak.setBackground(new java.awt.Color(255,183,126));
        btnKars.setBackground(new java.awt.Color(255,183,126));
    }//GEN-LAST:event_btnIstanbulActionPerformed

    private void btnEskisehirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEskisehirActionPerformed
        rBtnEskisehir.doClick();
        btnEskisehir.setBackground(Color.red);
        btnIstanbul.setBackground(new java.awt.Color(255,183,126));
        btnIzmir.setBackground(new java.awt.Color(255,183,126));
        btnAnkara.setBackground(new java.awt.Color(255,183,126));
        btnBursa.setBackground(new java.awt.Color(255,183,126));
        btnAntalya.setBackground(new java.awt.Color(255,183,126));
        btnErzurum.setBackground(new java.awt.Color(255,183,126));
        btnAdana.setBackground(new java.awt.Color(255,183,126));
        btnZonguldak.setBackground(new java.awt.Color(255,183,126));
        btnKars.setBackground(new java.awt.Color(255,183,126));
    }//GEN-LAST:event_btnEskisehirActionPerformed

    private void btnIzmirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIzmirActionPerformed
        rBtnIzmir.doClick();
        btnIzmir.setBackground(Color.red);
        btnIstanbul.setBackground(new java.awt.Color(255,183,126));
        btnEskisehir.setBackground(new java.awt.Color(255,183,126));
        btnAnkara.setBackground(new java.awt.Color(255,183,126));
        btnBursa.setBackground(new java.awt.Color(255,183,126));
        btnAntalya.setBackground(new java.awt.Color(255,183,126));
        btnErzurum.setBackground(new java.awt.Color(255,183,126));
        btnAdana.setBackground(new java.awt.Color(255,183,126));
        btnZonguldak.setBackground(new java.awt.Color(255,183,126));
        btnKars.setBackground(new java.awt.Color(255,183,126));
    }//GEN-LAST:event_btnIzmirActionPerformed

    private void btnAnkaraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnkaraActionPerformed
        rBtnAnkara.doClick();
        btnAnkara.setBackground(Color.red);
        btnIstanbul.setBackground(new java.awt.Color(255,183,126));
        btnEskisehir.setBackground(new java.awt.Color(255,183,126));
        btnIzmir.setBackground(new java.awt.Color(255,183,126));
        btnBursa.setBackground(new java.awt.Color(255,183,126));
        btnAntalya.setBackground(new java.awt.Color(255,183,126));
        btnErzurum.setBackground(new java.awt.Color(255,183,126));
        btnAdana.setBackground(new java.awt.Color(255,183,126));
        btnZonguldak.setBackground(new java.awt.Color(255,183,126));
        btnKars.setBackground(new java.awt.Color(255,183,126));
    }//GEN-LAST:event_btnAnkaraActionPerformed

    private void btnAdanaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdanaActionPerformed
        rBtnAdana.doClick();
        btnAdana.setBackground(Color.red);
        btnIstanbul.setBackground(new java.awt.Color(255,183,126));
        btnEskisehir.setBackground(new java.awt.Color(255,183,126));
        btnIzmir.setBackground(new java.awt.Color(255,183,126));
        btnAnkara.setBackground(new java.awt.Color(255,183,126));
        btnBursa.setBackground(new java.awt.Color(255,183,126));
        btnAntalya.setBackground(new java.awt.Color(255,183,126));
        btnErzurum.setBackground(new java.awt.Color(255,183,126));
        btnZonguldak.setBackground(new java.awt.Color(255,183,126));
        btnKars.setBackground(new java.awt.Color(255,183,126));
    }//GEN-LAST:event_btnAdanaActionPerformed

    private void btnBursaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBursaActionPerformed
        rBtnBursa.doClick();
        btnBursa.setBackground(Color.red);
        btnIstanbul.setBackground(new java.awt.Color(255,183,126));
        btnEskisehir.setBackground(new java.awt.Color(255,183,126));
        btnIzmir.setBackground(new java.awt.Color(255,183,126));
        btnAnkara.setBackground(new java.awt.Color(255,183,126));
        btnAntalya.setBackground(new java.awt.Color(255,183,126));
        btnErzurum.setBackground(new java.awt.Color(255,183,126));
        btnAdana.setBackground(new java.awt.Color(255,183,126));
        btnZonguldak.setBackground(new java.awt.Color(255,183,126));
        btnKars.setBackground(new java.awt.Color(255,183,126));
    }//GEN-LAST:event_btnBursaActionPerformed

    private void btnAntalyaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAntalyaActionPerformed
        rBtnAntalya.doClick();
        btnAntalya.setBackground(Color.red);
        btnIstanbul.setBackground(new java.awt.Color(255,183,126));
        btnEskisehir.setBackground(new java.awt.Color(255,183,126));
        btnIzmir.setBackground(new java.awt.Color(255,183,126));
        btnAnkara.setBackground(new java.awt.Color(255,183,126));
        btnBursa.setBackground(new java.awt.Color(255,183,126));
        btnErzurum.setBackground(new java.awt.Color(255,183,126));
        btnAdana.setBackground(new java.awt.Color(255,183,126));
        btnZonguldak.setBackground(new java.awt.Color(255,183,126));
        btnKars.setBackground(new java.awt.Color(255,183,126));
    }//GEN-LAST:event_btnAntalyaActionPerformed

    private void btnZonguldakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnZonguldakActionPerformed
        rBtnZonguldak.doClick();
        btnZonguldak.setBackground(Color.red);
        btnIstanbul.setBackground(new java.awt.Color(255,183,126));
        btnEskisehir.setBackground(new java.awt.Color(255,183,126));
        btnIzmir.setBackground(new java.awt.Color(255,183,126));
        btnAnkara.setBackground(new java.awt.Color(255,183,126));
        btnBursa.setBackground(new java.awt.Color(255,183,126));
        btnAntalya.setBackground(new java.awt.Color(255,183,126));
        btnErzurum.setBackground(new java.awt.Color(255,183,126));
        btnAdana.setBackground(new java.awt.Color(255,183,126));
        btnKars.setBackground(new java.awt.Color(255,183,126));
    }//GEN-LAST:event_btnZonguldakActionPerformed

    private void btnErzurumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnErzurumActionPerformed
        rBtnErzurum.doClick();
        btnErzurum.setBackground(Color.red);
        btnIstanbul.setBackground(new java.awt.Color(255,183,126));
        btnEskisehir.setBackground(new java.awt.Color(255,183,126));
        btnIzmir.setBackground(new java.awt.Color(255,183,126));
        btnAnkara.setBackground(new java.awt.Color(255,183,126));
        btnBursa.setBackground(new java.awt.Color(255,183,126));
        btnAntalya.setBackground(new java.awt.Color(255,183,126));
        btnAdana.setBackground(new java.awt.Color(255,183,126));
        btnZonguldak.setBackground(new java.awt.Color(255,183,126));
        btnKars.setBackground(new java.awt.Color(255,183,126));
    }//GEN-LAST:event_btnErzurumActionPerformed

    private void btnKarsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKarsActionPerformed
        rBtnKars.doClick();
        btnKars.setBackground(Color.red);
        btnIstanbul.setBackground(new java.awt.Color(255,183,126));
        btnEskisehir.setBackground(new java.awt.Color(255,183,126));
        btnIzmir.setBackground(new java.awt.Color(255,183,126));
        btnAnkara.setBackground(new java.awt.Color(255,183,126));
        btnBursa.setBackground(new java.awt.Color(255,183,126));
        btnAntalya.setBackground(new java.awt.Color(255,183,126));
        btnErzurum.setBackground(new java.awt.Color(255,183,126));
        btnAdana.setBackground(new java.awt.Color(255,183,126));
        btnZonguldak.setBackground(new java.awt.Color(255,183,126));        
    }//GEN-LAST:event_btnKarsActionPerformed

    public void setEnableButton(String selection){
        switch(selection){
            case "Istanbul":
                btnIstanbul.setEnabled(false);
                break;
            case "Eskisehir":
                if(!btnEskisehir.isEnabled()) btnEskisehir.setEnabled(true);
                else btnEskisehir.setEnabled(false);
                break;
            case "Izmir":
                btnIzmir.setEnabled(false);
                break;
            case "Ankara":
                btnAnkara.setEnabled(false);
                break;
            case "Bursa":
                btnBursa.setEnabled(false);
                break;
            case "Antalya":
                btnAntalya.setEnabled(false);
                break;
            case "Adana":
                btnAdana.setEnabled(false);
                break;
            case "Erzurum":
                btnErzurum.setEnabled(false);
                break;
            case "Zonguldak":
                btnZonguldak.setEnabled(false);
                break;
            case "Kars":
                btnKars.setEnabled(false);
                break;
            default:
                break;
        }
    }
    
    private void rBtnIstanbulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rBtnIstanbulActionPerformed
        tableSelection = "Istanbul";
    }//GEN-LAST:event_rBtnIstanbulActionPerformed

    private void rBtnEskisehirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rBtnEskisehirActionPerformed
        tableSelection = "Eskisehir";
    }//GEN-LAST:event_rBtnEskisehirActionPerformed

    private void rBtnIzmirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rBtnIzmirActionPerformed
        tableSelection = "Izmir";
    }//GEN-LAST:event_rBtnIzmirActionPerformed

    private void rBtnAnkaraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rBtnAnkaraActionPerformed
        tableSelection = "Ankara";
    }//GEN-LAST:event_rBtnAnkaraActionPerformed

    private void rBtnAdanaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rBtnAdanaActionPerformed
        tableSelection = "Adana";
    }//GEN-LAST:event_rBtnAdanaActionPerformed

    private void rBtnBursaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rBtnBursaActionPerformed
        tableSelection = "Bursa";
    }//GEN-LAST:event_rBtnBursaActionPerformed

    private void rBtnAntalyaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rBtnAntalyaActionPerformed
        tableSelection = "Antalya";
    }//GEN-LAST:event_rBtnAntalyaActionPerformed

    private void rBtnZonguldakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rBtnZonguldakActionPerformed
        tableSelection = "Zonguldak";
    }//GEN-LAST:event_rBtnZonguldakActionPerformed

    private void rBtnErzurumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rBtnErzurumActionPerformed
        tableSelection = "Erzurum";
    }//GEN-LAST:event_rBtnErzurumActionPerformed

    private void rBtnKarsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rBtnKarsActionPerformed
        tableSelection = "Kars";
    }//GEN-LAST:event_rBtnKarsActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowOpened

    private void btnTeaPlusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTeaPlusActionPerformed
        //Order order = new Order();
        //order.getItems().get(0).increaseCount();
        //cafe.selectedTable.addOrder(order);
        if(items.get(0).increaseCount())
            tfTea.setText(String.valueOf(Integer.parseInt(tfTea.getText()) + 1));
        //items.get(0).increaseCount();
    }//GEN-LAST:event_btnTeaPlusActionPerformed

    private void btnTeaMinusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTeaMinusActionPerformed
        if(items.get(0).decreaseCount())
            tfTea.setText(String.valueOf(Integer.parseInt(tfTea.getText()) - 1));
        //items.get(0).decreaseCount();
    }//GEN-LAST:event_btnTeaMinusActionPerformed

    private void btnCoffeeMinusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCoffeeMinusActionPerformed
        if(items.get(1).decreaseCount())
            tfCoffee.setText(String.valueOf(Integer.parseInt(tfCoffee.getText()) - 1));
        //items.get(1).decreaseCount();
    }//GEN-LAST:event_btnCoffeeMinusActionPerformed

    private void btnCoffeePlusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCoffeePlusActionPerformed
        if(items.get(1).increaseCount())
            tfCoffee.setText(String.valueOf(Integer.parseInt(tfCoffee.getText()) + 1));
        //items.get(1).increaseCount();
    }//GEN-LAST:event_btnCoffeePlusActionPerformed

    private void btnWaterMinusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnWaterMinusActionPerformed
        if(items.get(2).decreaseCount())
            tfWater.setText(String.valueOf(Integer.parseInt(tfWater.getText()) - 1));
        //items.get(2).decreaseCount();
    }//GEN-LAST:event_btnWaterMinusActionPerformed

    private void btnWaterPlusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnWaterPlusActionPerformed
        if(items.get(2).increaseCount())
            tfWater.setText(String.valueOf(Integer.parseInt(tfWater.getText()) + 1));
        //items.get(2).increaseCount();
    }//GEN-LAST:event_btnWaterPlusActionPerformed

    private void btnMWaterPriceMinusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMWaterPriceMinusActionPerformed
        if(items.get(3).decreaseCount())
            tfMWater.setText(String.valueOf(Integer.parseInt(tfMWater.getText()) - 1));
        //items.get(3).decreaseCount();
    }//GEN-LAST:event_btnMWaterPriceMinusActionPerformed

    private void btnMWaterPricePlusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMWaterPricePlusActionPerformed
        if(items.get(3).increaseCount())
            tfMWater.setText(String.valueOf(Integer.parseInt(tfMWater.getText()) + 1));
        //items.get(3).increaseCount();
    }//GEN-LAST:event_btnMWaterPricePlusActionPerformed

    private void btnGiveOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGiveOrderActionPerformed
        
        if(btnGiveOrder.getLabel().equals("Sipariş Ver")){
            order = new Order();
            
            for(Item item : items){
                order.addItem(item);
            }
            if(activeTable != null){
                activeTable.addOrder(order);
                System.out.println(activeTable.getOrders().toString());
            }
            btnGiveOrder.setLabel("Yeni Sipariş");
        }else if(btnGiveOrder.getLabel().equals("Yeni Sipariş")){
            tfTea.setText("0");
            tfCoffee.setText("0");
            tfWater.setText("0");
            tfMWater.setText("0");
            btnGiveOrder.setLabel("Sipariş Ver");
            
            createMenu();
            for(Item item : items){
               item.setCount(0);
            }
        }
    }//GEN-LAST:event_btnGiveOrderActionPerformed

    private void btnGetBillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGetBillActionPerformed
        jTabbedPane1.setSelectedComponent(this.pnlBill);
        jTabbedPane1.setEnabledAt(0, false);
        jTabbedPane1.setEnabledAt(1, true);
        jTabbedPane1.setEnabledAt(2, false);
        double totalPrice = 0;
        
        for(Order order : cafe.selectedTable.getOrders()){
            lstOrder.add(String.valueOf(order.getOrderNo()));
            lstTea.add(String.valueOf(order.getItems().get(0).getCount()));
            lstCoffee.add(String.valueOf(order.getItems().get(1).getCount()));
            lstWater.add(String.valueOf(order.getItems().get(2).getCount()));
            lstMWater.add(String.valueOf(order.getItems().get(3).getCount()));
            lstPrice.add(String.valueOf(order.getTotalOrderPrice(order)));
            totalPrice += order.getTotalOrderPrice(order);
        }
        tfTotalPrice.setText(String.valueOf(totalPrice));
    }//GEN-LAST:event_btnGetBillActionPerformed

    private void btnPayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPayActionPerformed
        jTabbedPane1.setSelectedComponent(this.pnlTableSelection);
        jTabbedPane1.setEnabledAt(0, false);
        jTabbedPane1.setEnabledAt(1, false);
        jTabbedPane1.setEnabledAt(2, true);
        
        System.out.println(tableSelection);
        setEnableButton(tableSelection);
    }//GEN-LAST:event_btnPayActionPerformed

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
            java.util.logging.Logger.getLogger(UserScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdana;
    private javax.swing.JButton btnAnkara;
    private javax.swing.JButton btnAntalya;
    private javax.swing.JButton btnBursa;
    private java.awt.Button btnCoffeeMinus;
    private java.awt.Button btnCoffeePlus;
    private javax.swing.JButton btnErzurum;
    private javax.swing.JButton btnEskisehir;
    private java.awt.Button btnGetBill;
    private java.awt.Button btnGiveOrder;
    private javax.swing.JButton btnIstanbul;
    private javax.swing.JButton btnIzmir;
    private javax.swing.JButton btnKars;
    private java.awt.Button btnMWaterPriceMinus;
    private java.awt.Button btnMWaterPricePlus;
    private java.awt.Button btnPay;
    private javax.swing.JButton btnSelect;
    private java.awt.Button btnTeaMinus;
    private java.awt.Button btnTeaPlus;
    private java.awt.Button btnWaterMinus;
    private java.awt.Button btnWaterPlus;
    private javax.swing.JButton btnZonguldak;
    private javax.swing.JTabbedPane jTabbedPane1;
    private java.awt.Label label1;
    private java.awt.Label label2;
    private java.awt.Label label3;
    private java.awt.Label label4;
    private java.awt.Label label5;
    private java.awt.Label label6;
    private java.awt.Label label7;
    private java.awt.Label lblCoffee;
    private java.awt.Label lblCoffeePrice;
    private java.awt.Label lblMWater;
    private java.awt.Label lblMWaterPrice;
    private java.awt.Label lblTea;
    private java.awt.Label lblTeaPrice;
    private java.awt.Label lblWater;
    private java.awt.Label lblWaterPrice;
    private java.awt.List lstCoffee;
    private java.awt.List lstMWater;
    private java.awt.List lstOrder;
    private java.awt.List lstPrice;
    private java.awt.List lstTea;
    private java.awt.List lstWater;
    private javax.swing.JPanel pnlBill;
    private javax.swing.JPanel pnlMenu;
    private javax.swing.JPanel pnlTableSelection;
    private javax.swing.JRadioButton rBtnAdana;
    private javax.swing.JRadioButton rBtnAnkara;
    private javax.swing.JRadioButton rBtnAntalya;
    private javax.swing.JRadioButton rBtnBursa;
    private javax.swing.JRadioButton rBtnErzurum;
    private javax.swing.JRadioButton rBtnEskisehir;
    private javax.swing.JRadioButton rBtnIstanbul;
    private javax.swing.JRadioButton rBtnIzmir;
    private javax.swing.JRadioButton rBtnKars;
    private javax.swing.JRadioButton rBtnZonguldak;
    private java.awt.TextField tfCoffee;
    private java.awt.TextField tfMWater;
    private java.awt.TextField tfTea;
    private java.awt.TextField tfTotalPrice;
    private java.awt.TextField tfWater;
    // End of variables declaration//GEN-END:variables

    private void createAllTables() {
        cafe.addTable(new Table(TableNumbers.Istanbul, false));
        cafe.addTable(new Table(TableNumbers.Eskisehir, false));
        cafe.addTable(new Table(TableNumbers.Izmir, false));
        cafe.addTable(new Table(TableNumbers.Ankara, false));
        cafe.addTable(new Table(TableNumbers.Bursa, false));
        cafe.addTable(new Table(TableNumbers.Antalya, false));
        cafe.addTable(new Table(TableNumbers.Adana, false));
        cafe.addTable(new Table(TableNumbers.Erzurum, false));
        cafe.addTable(new Table(TableNumbers.Zonguldak, false));
        cafe.addTable(new Table(TableNumbers.Kars, false));
    }

    private void createMenu() {
        items.clear();
        items.add(new Item(Name.TEA, 20.0));
        items.add(new Item(Name.COFFEE, 50.0));
        items.add(new Item(Name.WATER, 10.0));
        items.add(new Item(Name.MINERALWATER, 35.0));
        
        Dictionary<String, String> dict= new Hashtable<>();
        for(Item item : items){
            dict.put(item.getName().toString(), String.valueOf(item.getPrice()) + " ₺");
            //" ₺"
        }
        
        fillMenu(dict);
    }

    private void fillMenu(Dictionary<String, String> dict) {
        lblTea.setText("Çay :");
        lblTeaPrice.setText(dict.get("TEA"));
        
        lblCoffee.setText("Kahve :");
        lblCoffeePrice.setText(dict.get("COFFEE"));
        
        lblWater.setText("Su :");
        lblWaterPrice.setText(dict.get("WATER"));
        
        lblMWater.setText("Soda :");
        lblMWaterPrice.setText(dict.get("MINERALWATER"));
    }
}
