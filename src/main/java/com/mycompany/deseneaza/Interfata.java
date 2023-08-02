package com.mycompany.deseneaza;

import java.awt.Color;
import java.awt.Graphics;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JColorChooser;
import javax.swing.SwingUtilities;

public class Interfata extends javax.swing.JFrame {

    public static Graphics gr, ex;
    public int r = 0, g = 0, b = 0, rad = 10, x = 0, y = 0, xm = 0, ym = 0, xp = 0, yp = 0, tip = 3, polyn=0;
    public Color c = new Color(r, g, b);
    public boolean plin = false, sel = true;
    Figura fgr;
    ArrayList<Figura> figuri = new ArrayList<>();
    int np = 0;

    private void deseneazaEx() {
        ex = jPanel1.getGraphics();
        c = new Color(r, g, b);
        ex.setColor(c);
        ex.clearRect(0, 0, jPanel1.getWidth(), jPanel1.getHeight());
        switch (tip) {
            case 1 -> {
                ex.drawOval(jPanel1.getWidth() / 2 - 50, jPanel1.getHeight() / 2 - 50, 100, 100);
                if (plin) {
                    ex.fillOval(jPanel1.getWidth() / 2 - 50, jPanel1.getHeight() / 2 - 50, 100, 100);
                }
            }
            case 2 -> {
                ex.drawRect(jPanel1.getWidth() / 2 - 50, jPanel1.getHeight() / 2 - 50, 100, 100);
                if (plin) {
                    ex.fillRect(jPanel1.getWidth() / 2 - 50, jPanel1.getHeight() / 2 - 50, 100, 100);
                }
            }
            case 3 -> ex.fillOval(jPanel1.getWidth() / 2 - 50, jPanel1.getHeight() / 2 - 50, 100, 100);
            case 4 -> {
                ex.drawOval(jPanel1.getWidth() / 2 - 25, jPanel1.getHeight() / 2 - 50, 50, 100);
                if (plin) {
                    ex.fillOval(jPanel1.getWidth() / 2 - 25, jPanel1.getHeight() / 2 - 50, 50, 100);
                }
            }
            case 5 -> {
                ex.drawRect(jPanel1.getWidth() / 2 - 50, jPanel1.getHeight() / 2 - 25, 100, 50);
                if (plin) {
                    ex.fillRect(jPanel1.getWidth() / 2 - 50, jPanel1.getHeight() / 2 - 25, 100, 50);
                }
            }
            case 6 -> ex.fillOval(jPanel1.getWidth() / 2 - 50, jPanel1.getHeight() / 2 - 50, 100, 100);
            default -> {
            }
        }
    }

    public void redeseneaza() {
        for (Figura f : figuri) {
            f.deseneaza();
        }
    }

    public Interfata() {
        initComponents();
        gr = jPanel2.getGraphics();
        ex = jPanel1.getGraphics();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        buttonGroup5 = new javax.swing.ButtonGroup();
        buttonGroup6 = new javax.swing.ButtonGroup();
        buttonGroup7 = new javax.swing.ButtonGroup();
        buttonGroup8 = new javax.swing.ButtonGroup();
        buttonGroup9 = new javax.swing.ButtonGroup();
        jButton2 = new javax.swing.JButton();
        jCheckBox1 = new javax.swing.JCheckBox();
        jSlider1 = new javax.swing.JSlider();
        jSlider2 = new javax.swing.JSlider();
        jSlider3 = new javax.swing.JSlider();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jRadioButton5 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jRadioButton6 = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton2.setText("Sterge");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jCheckBox1.setText("Umple");
        jCheckBox1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jCheckBox1StateChanged(evt);
            }
        });

        jSlider1.setForeground(new java.awt.Color(255, 0, 0));
        jSlider1.setMaximum(255);
        jSlider1.setPaintLabels(true);
        jSlider1.setValue(0);
        jSlider1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSlider1StateChanged(evt);
            }
        });

        jSlider2.setForeground(new java.awt.Color(0, 255, 0));
        jSlider2.setMaximum(255);
        jSlider2.setPaintLabels(true);
        jSlider2.setValue(0);
        jSlider2.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSlider2StateChanged(evt);
            }
        });

        jSlider3.setForeground(new java.awt.Color(0, 0, 255));
        jSlider3.setMaximum(255);
        jSlider3.setPaintLabels(true);
        jSlider3.setValue(0);
        jSlider3.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSlider3StateChanged(evt);
            }
        });

        jPanel1.setMinimumSize(new java.awt.Dimension(200, 200));
        jPanel1.setPreferredSize(new java.awt.Dimension(200, 200));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("0");
        jLabel1.setMaximumSize(new java.awt.Dimension(19, 16));
        jLabel1.setMinimumSize(new java.awt.Dimension(19, 16));
        jLabel1.setPreferredSize(new java.awt.Dimension(19, 16));

        jLabel2.setForeground(new java.awt.Color(0, 255, 0));
        jLabel2.setText("0");
        jLabel2.setMaximumSize(new java.awt.Dimension(19, 16));
        jLabel2.setMinimumSize(new java.awt.Dimension(19, 16));
        jLabel2.setPreferredSize(new java.awt.Dimension(19, 16));

        jLabel3.setForeground(new java.awt.Color(0, 0, 255));
        jLabel3.setText("0");
        jLabel3.setToolTipText("");
        jLabel3.setMaximumSize(new java.awt.Dimension(19, 16));
        jLabel3.setMinimumSize(new java.awt.Dimension(19, 16));
        jLabel3.setPreferredSize(new java.awt.Dimension(19, 16));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel2.setMinimumSize(new java.awt.Dimension(500, 200));
        jPanel2.setPreferredSize(new java.awt.Dimension(500, 200));
        jPanel2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel2MouseDragged(evt);
            }
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jPanel2MouseMoved(evt);
            }
        });
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel2MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel2MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jPanel2MouseReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 415, Short.MAX_VALUE)
        );

        jLabel5.setForeground(new java.awt.Color(255, 0, 0));
        jLabel5.setText("R");

        jLabel6.setForeground(new java.awt.Color(0, 255, 0));
        jLabel6.setText("G");

        jLabel7.setForeground(new java.awt.Color(0, 0, 255));
        jLabel7.setText("B");

        jButton1.setText("Culoare");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("Cerc");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("Patrat");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton4);
        jRadioButton4.setText("Oval");
        jRadioButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton4ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton5);
        jRadioButton5.setText("Dreptunghi");
        jRadioButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton5ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton3);
        jRadioButton3.setSelected(true);
        jRadioButton3.setText("Deseneaza");
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });

        jButton3.setText("Salveaza1");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Citeste1");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton6.setText("Citeste2");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton5.setText("Salveaza2");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton7.setText("Salveaza3");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setText("Citeste3");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setText("StergeTot");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton6);
        jRadioButton6.setText("Polygon");
        jRadioButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox1))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSlider3, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSlider1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSlider2, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 592, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(jButton2)
                            .addComponent(jButton9)
                            .addComponent(jCheckBox1))
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jSlider1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jRadioButton1)
                            .addComponent(jRadioButton2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jSlider2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jRadioButton4)
                            .addComponent(jRadioButton5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jSlider3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jRadioButton3)
                            .addComponent(jRadioButton6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton4)
                            .addComponent(jButton6)
                            .addComponent(jButton8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton3)
                            .addComponent(jButton5)
                            .addComponent(jButton7))
                        .addGap(29, 29, 29))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 415, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        figuri.remove(fgr);
        fgr=null;
        gr.setColor(Color.white);
        gr.fillRect(0, 0, jPanel2.getWidth(), jPanel2.getHeight());
        for (Figura f : figuri) {
            f.afiseaza();
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jCheckBox1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jCheckBox1StateChanged
        gr = jPanel2.getGraphics();
        gr.setColor(Color.white);
        gr.fillRect(0, 0, jPanel2.getWidth(), jPanel2.getHeight());
        plin = jCheckBox1.isSelected();
        deseneazaEx();
        if (fgr != null) {
            fgr.u = plin;
        }
        gr.setColor(c);
        for (Figura f : figuri) {
            f.afiseaza();
        }
    }//GEN-LAST:event_jCheckBox1StateChanged

    private void jSlider1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSlider1StateChanged
        gr.setColor(Color.white);
        gr.fillRect(0, 0, jPanel2.getWidth(), jPanel2.getHeight());
        jLabel1.setText("");
        r = jSlider1.getValue();
        c = new Color(r, g, b);
        String s = String.valueOf(r);
        jLabel1.setText(s);
        deseneazaEx();
        fgr.c = c;
        for (Figura f : figuri) {
            f.afiseaza();
        }
    }//GEN-LAST:event_jSlider1StateChanged

    private void jSlider2StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSlider2StateChanged
        gr.setColor(Color.white);
        gr.fillRect(0, 0, jPanel2.getWidth(), jPanel2.getHeight());
        jLabel2.setText("");
        g = jSlider2.getValue();
        c = new Color(r, g, b);
        String s = String.valueOf(g);
        jLabel2.setText(s);
        deseneazaEx();
        fgr.c = c;
        for (Figura f : figuri) {
            f.afiseaza();
        }
    }//GEN-LAST:event_jSlider2StateChanged

    private void jSlider3StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSlider3StateChanged
        gr.setColor(Color.white);
        gr.fillRect(0, 0, jPanel2.getWidth(), jPanel2.getHeight());
        jLabel3.setText("");
        b = jSlider3.getValue();
        c = new Color(r, g, b);
        String s = String.valueOf(b);
        jLabel3.setText(s);
        deseneazaEx();
        fgr.c = c;
        for (Figura f : figuri) {
            f.afiseaza();
        }
    }//GEN-LAST:event_jSlider3StateChanged

    private void jPanel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseClicked
        gr = jPanel2.getGraphics();
        ex = jPanel1.getGraphics();
        c = new Color(r, g, b);
        if (SwingUtilities.isLeftMouseButton(evt) == true) {
            x = evt.getX();
            y = evt.getY();
            switch (tip) {
                case 1 -> fgr = new Cerc(x, y, rad, c, plin, sel);
                case 2 -> fgr = new Patrat(x, y, rad, c, plin, sel);
                case 4 -> fgr = new Oval(x, y, rad, c, plin, sel);
                case 5 -> fgr = new Drept(x, y, rad, c, plin, sel);
                case 6 ->{
                    if(np==0){fgr = new Poligon(xm, ym, c, plin, sel);figuri.add(fgr);np=1;xp = xm; yp = ym;np=1;}
                    else if(xp - 5 <= x && x <= xp + 5 && yp - 5 <= y && y <= yp + 5){fgr.adauga(xp, yp);fgr.inchide();np=0;xp = 0; yp = 0;}
                    else fgr.adauga(x, y);
                }
                default -> {}
            }
        } else if (SwingUtilities.isRightMouseButton(evt) == true) {
            x = evt.getX();
            y = evt.getY();
            for (Figura f : figuri) {
                if (f.x - 5 <= xm && xm <= f.x + 5 && f.y - 5 <= ym && ym <= f.y + 5) {
                    fgr.s = false;
                    fgr = f;
                    fgr.s = true;
                }
            }
            figuri.remove(fgr);
            if(tip==6)figuri.add(fgr);
        }
        if(tip!=6)figuri.add(fgr);
        gr.setColor(Color.white);
        gr.fillRect(0, 0, jPanel2.getWidth(), jPanel2.getHeight());
        for (Figura f : figuri) {
            f.afiseaza();
        }
    }//GEN-LAST:event_jPanel2MouseClicked

    private void jPanel2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseDragged
        gr = jPanel2.getGraphics();
        ex = jPanel1.getGraphics();
        xm = evt.getX();
        ym = evt.getY();
        if (SwingUtilities.isLeftMouseButton(evt) == true) {
            if (tip == 3) {
                fgr.adauga(xm, ym);
            } else {
                fgr.redimensioneaza(xm, ym);
            }
        } else if (SwingUtilities.isRightMouseButton(evt) == true) {
            fgr.mutare(xm, ym);
        }
        gr.setColor(Color.white);
        gr.fillRect(0, 0, jPanel2.getWidth(), jPanel2.getHeight());
        for (Figura f : figuri) {
            f.afiseaza();
        }
    }//GEN-LAST:event_jPanel2MouseDragged

    private void jPanel2MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseMoved
        xm = evt.getX();
        ym = evt.getY();
        for (Figura f : figuri) {
            if(tip==6 && np == 1){
                if (xp - 5 <= xm && xm <= xp + 5 && yp - 5 <= ym && ym <= yp + 5) {
                    gr.setColor(Color.BLACK);
                    gr.drawLine(xp-5, yp, xp+5, yp);
                    gr.drawLine(xp, yp-5, xp, yp+5);
                    gr.setColor(c);
                } else {
                    gr.setColor(Color.WHITE);
                    gr.drawLine(x-5, y, x+5, y);
                    gr.drawLine(x, y-5, x, y+5);
                    gr.setColor(c);
                }
            }
            else if (f.x - 5 <= xm && xm <= f.x + 5 && f.y - 5 <= ym && ym <= f.y + 5) {
                f.s = true;
            } else if (f != fgr) {
                f.s = false;
                if (!f.u) {
                    Interfata.gr.setColor(Color.white);
                    Interfata.gr.fillOval(f.x - 9, f.y - 9, 18, 18);
                }
            }
            f.afiseaza();
        }
    }//GEN-LAST:event_jPanel2MouseMoved

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        c = JColorChooser.showDialog(null, "Alege Culoarea", Color.WHITE);
        r = c.getRed();
        g = c.getGreen();
        b = c.getBlue();
        jSlider1.setValue(r);
        jSlider2.setValue(g);
        jSlider3.setValue(b);

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        tip = 1; //cerc
        deseneazaEx();
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        tip = 2; //patrat
        deseneazaEx();
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed
        tip = 3; //linie curba
        deseneazaEx();
    }//GEN-LAST:event_jRadioButton3ActionPerformed

    private void jPanel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MousePressed
        if (SwingUtilities.isLeftMouseButton(evt) == true) {
            if (tip == 3) {
                int xm = evt.getX();
                int ym = evt.getY();
                fgr = new Linie(xm, ym, c, plin, sel);
                figuri.add(fgr);
            }
        }
    }//GEN-LAST:event_jPanel2MousePressed

    private void jPanel2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseReleased
        if (SwingUtilities.isLeftMouseButton(evt) == true) {
            if (tip == 3) {
                fgr.inchide();
            }
        }
    }//GEN-LAST:event_jPanel2MouseReleased

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try {
            //salveaza datele
            PrintStream ps = new PrintStream(new FileOutputStream("desen.txt"));
            for (Figura f : figuri) {
                f.salveaza(ps);
            }
            ps.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Interfata.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        try {
            //citeste datele
            DataInputStream dis = new DataInputStream(new FileInputStream("desen.txt"));
            for (Figura f : figuri) {
                f.sterge();
            }
            figuri.clear();
            gr.setColor(Color.white);
            gr.fillRect(0, 0, jPanel2.getWidth(), jPanel2.getHeight());
            int cod;
            Figura f = null;
            while (dis.available() > 0) {
                cod = Integer.parseInt(dis.readLine());
                switch (cod) {
                    case 1 -> f = new Cerc(dis);
                    case 2 -> f = new Patrat(dis);
                    case 3 -> f = new Linie(dis);
                    case 4 -> f = new Oval(dis);
                    case 5 -> f = new Drept(dis);
                    case 6 -> f = new Poligon(dis);
                    default -> {
                    }
                }
                figuri.add(f);
            }
            redeseneaza();
            dis.close();
        } catch (Exception ex) {
            Logger.getLogger(Interfata.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jRadioButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton4ActionPerformed
        tip = 4; //oval
        deseneazaEx();
    }//GEN-LAST:event_jRadioButton4ActionPerformed

    private void jRadioButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton5ActionPerformed
        tip = 5; //dreptunghi
        deseneazaEx();
    }//GEN-LAST:event_jRadioButton5ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        try {
            //salveaza datele
            PrintStream ps = new PrintStream(new FileOutputStream("desen2.txt"));
            for (Figura f : figuri) {
                f.salveaza2(ps);
            }
            ps.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Interfata.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        try {
            //citeste datele
            DataInputStream dis = new DataInputStream(new FileInputStream("desen2.txt"));
            for (Figura f : figuri) {
                f.sterge();
            }
            figuri.clear();
            gr.setColor(Color.white);
            gr.fillRect(0, 0, jPanel2.getWidth(), jPanel2.getHeight());
            Figura f = null;
            String s;
            ArrayList<Integer> arr;
            while (dis.available() > 0) {
                s = dis.readLine();
                String[] aux = s.split("[, ]");
                arr = new ArrayList();
                for (String a : aux) {
                    if (!"".equals(a)) {
                        arr.add(Integer.parseInt(a));
                    }
                }
                switch (arr.remove(0)) {
                    case 1 -> f = new Cerc(arr);
                    case 2 -> f = new Patrat(arr);
                    case 3 -> f = new Linie(arr);
                    case 4 -> f = new Oval(arr);
                    case 5 -> f = new Drept(arr);
                    case 6 -> f = new Poligon(arr);
                    default -> {
                    }
                }
                figuri.add(f);
            }
            redeseneaza();
            dis.close();
        } catch (Exception ex) {
            Logger.getLogger(Interfata.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        try {
            try ( //salveaza datele
                    DataOutputStream dos = new DataOutputStream(new FileOutputStream("desen3.txt"))) {
                for (Figura f : figuri) {
                    f.salveaza3(dos);
                }
            }
        } catch (FileNotFoundException ex1) {
            Logger.getLogger(Interfata.class.getName()).log(Level.SEVERE, null, ex1);
        } catch (IOException ex1) {
            Logger.getLogger(Interfata.class.getName()).log(Level.SEVERE, null, ex1);
        } 
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        DataInputStream dis = null;
        try {
            dis = new DataInputStream(new FileInputStream("desen3.txt"));
        } catch (FileNotFoundException ex2) {
            Logger.getLogger(Interfata.class.getName()).log(Level.SEVERE, null, ex2);
        }
        for (Figura f : figuri) {
            f.sterge();
        }
        figuri.clear();
        gr.setColor(Color.white);
        gr.fillRect(0, 0, jPanel2.getWidth(), jPanel2.getHeight());
        int cod;
        Figura f = null;
        try {
            while (dis.available() > 0) {
                cod = dis.readInt();
                switch (cod) {
                    case 1 -> f = new Cerc(dis, false);
                    case 2 -> f = new Patrat(dis, false);
                    case 3 -> f = new Linie(dis, false);
                    case 4 -> f = new Oval(dis, false);
                    case 5 -> f = new Drept(dis, false);
                    case 6 -> f = new Poligon(dis, false);
                    default -> {
                    }
                }
                figuri.add(f);
            }
        } catch (IOException ex3) {
            Logger.getLogger(Interfata.class.getName()).log(Level.SEVERE, null, ex3);
        }
        redeseneaza();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        for (Figura f : figuri) {
            f.sterge();
        }
        figuri.clear();
        fgr=null;
        gr.setColor(Color.white);
        gr.fillRect(0, 0, jPanel2.getWidth(), jPanel2.getHeight());
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jRadioButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton6ActionPerformed
        tip = 6; //poligon
        deseneazaEx();
    }//GEN-LAST:event_jRadioButton6ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfata().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.ButtonGroup buttonGroup6;
    private javax.swing.ButtonGroup buttonGroup7;
    private javax.swing.ButtonGroup buttonGroup8;
    private javax.swing.ButtonGroup buttonGroup9;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JRadioButton jRadioButton6;
    private javax.swing.JSlider jSlider1;
    private javax.swing.JSlider jSlider2;
    private javax.swing.JSlider jSlider3;
    // End of variables declaration//GEN-END:variables
}
