/*
Created by Adrian Rupala 2018
@author Adrixop95
 */

import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.PrintStream;
import java.time.Duration;
import java.time.Instant;
import java.util.Arrays;


public class gui_pp extends javax.swing.JFrame {

    public gui_pp() {
        initComponents();
        setResizable(false); //okno bez możliwości zmiany wielkości
        setTitle("Projekt - Optymalizacja kodu"); //nazwa okna
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize(); //pozyskanie rozdzielczosci ekranu
        setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2); //otworz okno na środku ekranu
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        panel_1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        output_pnl_1 = new javax.swing.JTextArea();
        exec_pnl_1 = new javax.swing.JButton();
        clr_pnl_1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        alg_choose_p1 = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        number_cnt_p1 = new javax.swing.JTextField();
        panel_2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        output_pnl_2 = new javax.swing.JTextArea();
        exec_pnl_2 = new javax.swing.JButton();
        clr_pnl_2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        get_A = new javax.swing.JTextField();
        get_B = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        get_Z = new javax.swing.JTextField();
        var_choose_p2 = new javax.swing.JComboBox<>();
        panel_3 = new javax.swing.JPanel();
        exec_pnl_3 = new javax.swing.JButton();
        clr_pnl_3 = new javax.swing.JButton();
        gencount_label_p3 = new javax.swing.JLabel();
        title_p3 = new javax.swing.JLabel();
        subtitle_p3 = new javax.swing.JLabel();
        generation_number_p3 = new javax.swing.JTextField();
        alg_choose_p3 = new javax.swing.JComboBox<>();
        alg_label_p3 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        output_pnl_3 = new javax.swing.JTextArea();
        panel_4 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        output_pnl_4 = new javax.swing.JTextArea();
        exec_pnl4 = new javax.swing.JButton();
        clr_pnl_4 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        alg_choose_p4 = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        number_cnt_p4 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        output_pnl_1.setColumns(20);
        output_pnl_1.setRows(5);
        jScrollPane1.setViewportView(output_pnl_1);

        exec_pnl_1.setText("Wykonaj kod");
        exec_pnl_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exec_pnl_1ActionPerformed(evt);
            }
        });

        clr_pnl_1.setText("Wyczyść");
        clr_pnl_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clr_pnl_1ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Optymalizacja kodu związana z pętlami.");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Wpływ złożoności obliczeniowej na opracje (łączenie pętli, spłaszczanie pętli).");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Wybierz rodzaj testów:");
        jLabel6.setPreferredSize(new java.awt.Dimension(183, 17));

        alg_choose_p1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Wszystkie", "O(n3)+O(n2)", "O(n3)+O(nlogn)", "O(n2)+O(nlogn)", "Laczenie petli" }));
        alg_choose_p1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alg_choose_p1ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Ile liczb chcesz wygenerwać?");
        jLabel7.setPreferredSize(new java.awt.Dimension(183, 17));

        number_cnt_p1.setText("10");
        number_cnt_p1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                number_cnt_p1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_1Layout = new javax.swing.GroupLayout(panel_1);
        panel_1.setLayout(panel_1Layout);
        panel_1Layout.setHorizontalGroup(
            panel_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panel_1Layout.createSequentialGroup()
                        .addGroup(panel_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(panel_1Layout.createSequentialGroup()
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(alg_choose_p1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(panel_1Layout.createSequentialGroup()
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(number_cnt_p1)))
                            .addGroup(panel_1Layout.createSequentialGroup()
                                .addComponent(exec_pnl_1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(clr_pnl_1)))
                        .addGap(0, 433, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panel_1Layout.setVerticalGroup(
            panel_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addGroup(panel_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(alg_choose_p1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(number_cnt_p1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 237, Short.MAX_VALUE)
                .addGroup(panel_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(exec_pnl_1)
                    .addComponent(clr_pnl_1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Pętle", panel_1);

        output_pnl_2.setColumns(20);
        output_pnl_2.setRows(5);
        jScrollPane2.setViewportView(output_pnl_2);

        exec_pnl_2.setText("Wykonaj kod");
        exec_pnl_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exec_pnl_2ActionPerformed(evt);
            }
        });

        clr_pnl_2.setText("Wyczyść");
        clr_pnl_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clr_pnl_2ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Nieużywany kod.");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Jak duży wpływ ma nieużywany kod na aplikację?");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Wybierz rodzaj testów:");
        jLabel3.setPreferredSize(new java.awt.Dimension(183, 17));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Podaj liczbę A:");
        jLabel8.setPreferredSize(new java.awt.Dimension(183, 17));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Podaj liczbę B:");
        jLabel9.setPreferredSize(new java.awt.Dimension(183, 17));

        get_A.setText("1");

        get_B.setText("1");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Podaj liczbę Z:");
        jLabel10.setPreferredSize(new java.awt.Dimension(183, 17));

        get_Z.setText("10");

        var_choose_p2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dodawanie 2 liczb", "Mnozenie 2 liczb", "Operacje lacznie tablic", "Malware" }));

        javax.swing.GroupLayout panel_2Layout = new javax.swing.GroupLayout(panel_2);
        panel_2.setLayout(panel_2Layout);
        panel_2Layout.setHorizontalGroup(
            panel_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 775, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panel_2Layout.createSequentialGroup()
                        .addGroup(panel_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(panel_2Layout.createSequentialGroup()
                                .addComponent(exec_pnl_2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(clr_pnl_2))
                            .addGroup(panel_2Layout.createSequentialGroup()
                                .addGroup(panel_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(panel_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panel_2Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(get_A))
                                    .addGroup(panel_2Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(var_choose_p2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addGroup(panel_2Layout.createSequentialGroup()
                                .addGroup(panel_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(panel_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panel_2Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(get_B))
                                    .addGroup(panel_2Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(get_Z, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panel_2Layout.setVerticalGroup(
            panel_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(panel_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(var_choose_p2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(panel_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(get_A, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(get_B, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(get_Z, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 185, Short.MAX_VALUE)
                .addGroup(panel_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(exec_pnl_2)
                    .addComponent(clr_pnl_2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Nieużywany kod", panel_2);

        exec_pnl_3.setText("Wykonaj kod");
        exec_pnl_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exec_pnl_3ActionPerformed(evt);
            }
        });

        clr_pnl_3.setText("Wyczyść");
        clr_pnl_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clr_pnl_3ActionPerformed(evt);
            }
        });

        gencount_label_p3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        gencount_label_p3.setText("Ile liczb chcesz wygenerować?");

        title_p3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        title_p3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title_p3.setText("Ta część aplikacji porównuje dwa algorytmy sortowania.");

        subtitle_p3.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        subtitle_p3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        subtitle_p3.setText("Porównanie wybranego algorytmu sortowania oraz wbudowanego algorytmu quicksort.");

        generation_number_p3.setText("10");
        generation_number_p3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generation_number_p3ActionPerformed(evt);
            }
        });

        alg_choose_p3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selection", "Bubble", "Insertion" }));
        alg_choose_p3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alg_choose_p3ActionPerformed(evt);
            }
        });

        alg_label_p3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        alg_label_p3.setText("Jaki algorytm sortowania wybierasz?");

        output_pnl_3.setColumns(20);
        output_pnl_3.setRows(5);
        jScrollPane3.setViewportView(output_pnl_3);

        javax.swing.GroupLayout panel_3Layout = new javax.swing.GroupLayout(panel_3);
        panel_3.setLayout(panel_3Layout);
        panel_3Layout.setHorizontalGroup(
            panel_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_3Layout.createSequentialGroup()
                        .addComponent(exec_pnl_3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(clr_pnl_3)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(panel_3Layout.createSequentialGroup()
                        .addGroup(panel_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3)
                            .addComponent(title_p3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(subtitle_p3, javax.swing.GroupLayout.DEFAULT_SIZE, 775, Short.MAX_VALUE)
                            .addGroup(panel_3Layout.createSequentialGroup()
                                .addGroup(panel_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(alg_label_p3, javax.swing.GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE)
                                    .addComponent(gencount_label_p3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(panel_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(generation_number_p3, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
                                    .addComponent(alg_choose_p3, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        panel_3Layout.setVerticalGroup(
            panel_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(title_p3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(subtitle_p3)
                .addGap(18, 18, 18)
                .addGroup(panel_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(alg_label_p3)
                    .addComponent(alg_choose_p3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(gencount_label_p3)
                    .addComponent(generation_number_p3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 237, Short.MAX_VALUE)
                .addGroup(panel_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(exec_pnl_3)
                    .addComponent(clr_pnl_3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Sortowania", panel_3);

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Unikanie niepotrzebnych czynności. ");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Unikanie mnożenia, definiowania, niepotrzebnych struktur i czynności.");

        output_pnl_4.setColumns(20);
        output_pnl_4.setRows(5);
        jScrollPane4.setViewportView(output_pnl_4);

        exec_pnl4.setText("Wykonaj kod");
        exec_pnl4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exec_pnl4ActionPerformed(evt);
            }
        });

        clr_pnl_4.setText("Wyczyść");
        clr_pnl_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clr_pnl_4ActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setText("Wybierz rodzaj testów:");

        alg_choose_p4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Roznice skonczone", "Petle for/do-while" }));

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setText("Podaj liczbę:");

        number_cnt_p4.setText("10");

        javax.swing.GroupLayout panel_4Layout = new javax.swing.GroupLayout(panel_4);
        panel_4.setLayout(panel_4Layout);
        panel_4Layout.setHorizontalGroup(
            panel_4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 775, Short.MAX_VALUE)
                    .addComponent(jScrollPane4)
                    .addGroup(panel_4Layout.createSequentialGroup()
                        .addGroup(panel_4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(panel_4Layout.createSequentialGroup()
                                .addComponent(exec_pnl4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(clr_pnl_4)))
                        .addGap(18, 18, 18)
                        .addGroup(panel_4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(alg_choose_p4, 0, 141, Short.MAX_VALUE)
                            .addComponent(number_cnt_p4))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panel_4Layout.setVerticalGroup(
            panel_4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12)
                .addGap(18, 18, 18)
                .addGroup(panel_4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(alg_choose_p4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(number_cnt_p4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 237, Short.MAX_VALUE)
                .addGroup(panel_4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(exec_pnl4)
                    .addComponent(clr_pnl_4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Unikanie", panel_4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void alg_choose_p3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alg_choose_p3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_alg_choose_p3ActionPerformed

    private void generation_number_p3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generation_number_p3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_generation_number_p3ActionPerformed

    private void clr_pnl_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clr_pnl_3ActionPerformed

        // Czyszczenie outputu panelu 3 (sortowania)
        output_pnl_3.setText("");
    }//GEN-LAST:event_clr_pnl_3ActionPerformed

    private void exec_pnl_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exec_pnl_3ActionPerformed

        //Wygenerowane tablicy number elementowej z randomowymi liczbami z zakresu od -999 do 999
        //Oraz sklonowanie tablicy do 2 identycznej
        java.util.Random r = new java.util.Random();
        int number = Integer.parseInt(generation_number_p3.getText());
        int[] firstArray = r.ints(-999, 999).limit(number).toArray();
        int[] seccondArray = Arrays.copyOf(firstArray, firstArray.length);

        //Przekierowane outputu na panel 3 (JTextArea Panel 3)
        PrintStream out = new PrintStream (new TextAreaOutputStream(output_pnl_3));
        System.setOut(out);
        System.setErr(out);

        //Wypisanie tablicy przed sortowaniem
        System.out.println("\nTablica przed sortowaniem: " + Arrays.toString(firstArray) + "\n");

        //Wybieranie alg. sortowania
        String sortowanie = alg_choose_p3.getSelectedItem().toString();
        if(sortowanie == "Selection"){
            sortowanie_test.exec_selectionSort(firstArray);
        } else if(sortowanie == "Bubble"){
            sortowanie_test.exec_bubbleSort(firstArray);
        } else if(sortowanie == "Insertion") {
            sortowanie_test.exec_insertionSortRecursive(firstArray);
        }

        //Sortowanie wbudowaną funkcją sortowania, obliczanie czasu
        Instant start2 = Instant.now();
        Arrays.sort(seccondArray);
        System.out.println("\n Sortowanie wbudowanym algorytmem Quick Sort: " + Arrays.toString(seccondArray));
        Instant end2 = Instant.now();
        System.out.println("Czas sortowania: " + Duration.between(start2, end2));
    }//GEN-LAST:event_exec_pnl_3ActionPerformed

    private void clr_pnl_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clr_pnl_2ActionPerformed
        
        // Czyszczenie panelu 2
        output_pnl_2.setText("");
    }//GEN-LAST:event_clr_pnl_2ActionPerformed

    private void exec_pnl_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exec_pnl_2ActionPerformed
        // pobranie liczb i wygenerowanie tablic
        java.util.Random r = new java.util.Random();

        int a = Integer.parseInt(get_A.getText());
        int b = Integer.parseInt(get_B.getText());
        int z = Integer.parseInt(get_Z.getText());

        int[] firstArray = r.ints(-999, 999).limit(a).toArray();
        int[] seccondArray = r.ints(-999, 999).limit(b).toArray();
        int[] thirdArray = r.ints(-999, 999).limit(z).toArray();

        //Przekierowanie outputu na panel 2
        PrintStream out = new PrintStream (new TextAreaOutputStream(output_pnl_2));
        System.setOut(out);
        System.setErr(out);

        // Wybierz opcje
        String vars = var_choose_p2.getSelectedItem().toString();

        if ( vars == "Malware" ){
            nieuzywany.exec_dirty_fun(firstArray,firstArray);
            nieuzywany.exec_fun();
        } else if ( vars == "Dodawanie 2 liczb" ) {
            nieuzywany.exec_dirty_code_sum(a, b);
            nieuzywany.exec_code_sum(a, b);
        } else if ( vars == "Operacje lacznie tablic") {
            nieuzywany.exec_dirty_merge(firstArray, seccondArray);
            nieuzywany.exec_merge(firstArray, seccondArray);
        } else if( vars == "Mnozenie 2 liczb"){
            nieuzywany.exec_dirty_multiply_sum(a,b, z);
            nieuzywany.exec_multiply_sum(a, b, z);
        }
    }//GEN-LAST:event_exec_pnl_2ActionPerformed

    private void number_cnt_p1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_number_cnt_p1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_number_cnt_p1ActionPerformed

    private void alg_choose_p1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alg_choose_p1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_alg_choose_p1ActionPerformed

    private void clr_pnl_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clr_pnl_1ActionPerformed

        //Czyszczenie panelu outputu z panelu 1
        output_pnl_1.setText("");
    }//GEN-LAST:event_clr_pnl_1ActionPerformed

    private void exec_pnl_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exec_pnl_1ActionPerformed

        // Wygenerowane tablicy number elementowej z randomowymi liczbami z zakresu od -999 do 999
        // Oraz sklonowanie tablicy do 2 identycznej
        java.util.Random r = new java.util.Random();
        int number = Integer.parseInt(number_cnt_p1.getText());
        int[] firstArray = r.ints(-999, 999).limit(number).toArray();
        int[] seccondArray = Arrays.copyOf(firstArray, firstArray.length);
        int[] thirdArray = Arrays.copyOf(firstArray, firstArray.length);

        // Przekierowane outputu na panel 1
        PrintStream out = new PrintStream (new TextAreaOutputStream(output_pnl_1));
        System.setOut(out);
        System.setErr(out);

        // Wypisanie tablicy
        System.out.print("\n Wygenerowana lista: " + Arrays.toString(firstArray));

        // Wybór i wywołanie funkcji w zależności od funkcjonalności
        String lops = alg_choose_p1.getSelectedItem().toString();
        if ( lops == "Wszystkie" ) {

            petle.wyw_loops_On3(thirdArray);
            petle.wyw_loops_On2(seccondArray);
            petle.wyw_loops_On(firstArray);

        } else if ( lops == "O(n3)+O(n2)") {

            petle.wyw_loops_On3(thirdArray);
            petle.wyw_loops_On2(seccondArray);

        } else if ( lops == "O(n3)+O(nlogn)") {

            petle.wyw_loops_On3(thirdArray);
            petle.wyw_loops_On(firstArray);

        } else if (lops == "O(n2)+O(nlogn)") {

            petle.wyw_loops_On2(seccondArray);
            petle.wyw_loops_On(firstArray);

        } else if (lops == "Laczenie petli") {

            petle.not_combine_loop(seccondArray);
            petle.combine_loop(firstArray);

        }
    }//GEN-LAST:event_exec_pnl_1ActionPerformed

    private void clr_pnl_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clr_pnl_4ActionPerformed
       
        // Czyszczenie outputu panelu 4
        output_pnl_4.setText("");
    }//GEN-LAST:event_clr_pnl_4ActionPerformed

    private void exec_pnl4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exec_pnl4ActionPerformed
        
        // Wygenerowanie randomowej tablicy, pobranie liczby
        java.util.Random r = new java.util.Random();
        int number = Integer.parseInt(number_cnt_p4.getText());
        int[] firstArray = r.ints(-999, 999).limit(number).toArray();                
        
        // Przekierowane outputu na panel 1
        PrintStream out = new PrintStream (new TextAreaOutputStream(output_pnl_4));
        System.setOut(out);
        System.setErr(out);

        
        String test = alg_choose_p4.getSelectedItem().toString();
        if (test == "Roznice skonczone"){
            unikanie.exec_dirty_avoid_multiplies(number);
            unikanie.exec_avoid_multiplies(number);
        } else if (test == "Petle for/do-while") { 
            unikanie.exec_dirty_loop_overhead(firstArray);
            unikanie.exec_loop_overhead(firstArray);
        }
    }//GEN-LAST:event_exec_pnl4ActionPerformed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(gui_pp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(gui_pp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(gui_pp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(gui_pp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new gui_pp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> alg_choose_p1;
    private javax.swing.JComboBox<String> alg_choose_p3;
    private javax.swing.JComboBox<String> alg_choose_p4;
    private javax.swing.JLabel alg_label_p3;
    private javax.swing.JButton clr_pnl_1;
    private javax.swing.JButton clr_pnl_2;
    private javax.swing.JButton clr_pnl_3;
    private javax.swing.JButton clr_pnl_4;
    private javax.swing.JButton exec_pnl4;
    private javax.swing.JButton exec_pnl_1;
    private javax.swing.JButton exec_pnl_2;
    private javax.swing.JButton exec_pnl_3;
    private javax.swing.JLabel gencount_label_p3;
    private javax.swing.JTextField generation_number_p3;
    private javax.swing.JTextField get_A;
    private javax.swing.JTextField get_B;
    private javax.swing.JTextField get_Z;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField number_cnt_p1;
    private javax.swing.JTextField number_cnt_p4;
    private javax.swing.JTextArea output_pnl_1;
    private javax.swing.JTextArea output_pnl_2;
    private javax.swing.JTextArea output_pnl_3;
    private javax.swing.JTextArea output_pnl_4;
    private javax.swing.JPanel panel_1;
    private javax.swing.JPanel panel_2;
    private javax.swing.JPanel panel_3;
    private javax.swing.JPanel panel_4;
    private javax.swing.JLabel subtitle_p3;
    private javax.swing.JLabel title_p3;
    private javax.swing.JComboBox<String> var_choose_p2;
    // End of variables declaration//GEN-END:variables
}
