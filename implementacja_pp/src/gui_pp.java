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
        jComboBox2 = new javax.swing.JComboBox<>();
        panel_2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        output_pnl_2 = new javax.swing.JTextArea();
        exec_pnl_2 = new javax.swing.JButton();
        clr_pnl_2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        panel_3 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        output_pnl_3 = new javax.swing.JTextArea();
        exec_pnl_3 = new javax.swing.JButton();
        clr_pnl_3 = new javax.swing.JButton();
        gencount_label_p3 = new javax.swing.JLabel();
        title_p3 = new javax.swing.JLabel();
        subtitle_p3 = new javax.swing.JLabel();
        generation_number_p3 = new javax.swing.JTextField();
        alg_choose_p3 = new javax.swing.JComboBox<>();
        alg_label_p3 = new javax.swing.JLabel();

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
        jLabel4.setText("Pętle");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Jak różne pętle wpływają na nasz kod?");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Wybierz rodzaj testów:");
        jLabel6.setPreferredSize(new java.awt.Dimension(183, 17));

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
                            .addGroup(panel_1Layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panel_1Layout.createSequentialGroup()
                                .addComponent(exec_pnl_1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(clr_pnl_1)))
                        .addGap(0, 413, Short.MAX_VALUE)))
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
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 266, Short.MAX_VALUE)
                .addGroup(panel_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(exec_pnl_1)
                    .addComponent(clr_pnl_1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Pętle", panel_1);

        output_pnl_2.setColumns(20);
        output_pnl_2.setRows(5);
        jScrollPane2.setViewportView(output_pnl_2);

        exec_pnl_2.setText("Wykonaj kod");

        clr_pnl_2.setText("Wyczyść");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Zmienne");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Redukcje operatorów, zmiana deklaracji zmiennych, usuwanie nieużywanego kodu.");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Wybierz test:");
        jLabel3.setPreferredSize(new java.awt.Dimension(183, 17));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox1.setPreferredSize(new java.awt.Dimension(68, 20));

        javax.swing.GroupLayout panel_2Layout = new javax.swing.GroupLayout(panel_2);
        panel_2.setLayout(panel_2Layout);
        panel_2Layout.setHorizontalGroup(
            panel_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 755, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panel_2Layout.createSequentialGroup()
                        .addGroup(panel_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel_2Layout.createSequentialGroup()
                                .addComponent(exec_pnl_2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(clr_pnl_2))
                            .addGroup(panel_2Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 328, Short.MAX_VALUE)
                .addGroup(panel_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(exec_pnl_2)
                    .addComponent(clr_pnl_2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Zmienne", panel_2);

        output_pnl_3.setColumns(20);
        output_pnl_3.setRows(5);
        output_pnl_3.setPreferredSize(new java.awt.Dimension(159, 64));
        jScrollPane3.setViewportView(output_pnl_3);

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
        title_p3.setText("Ta część aplikacji porównuje dwa sortowania.");

        subtitle_p3.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        subtitle_p3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        subtitle_p3.setText("Porównanie wybranego algorytmu sortowania oraz wbudowanego algorytmu Arrays.sort (quicksort).");

        generation_number_p3.setText("10");
        generation_number_p3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generation_number_p3ActionPerformed(evt);
            }
        });

        alg_choose_p3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selection", "Bubble" }));
        alg_choose_p3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alg_choose_p3ActionPerformed(evt);
            }
        });

        alg_label_p3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        alg_label_p3.setText("Jaki algorytm wybierasz?");

        javax.swing.GroupLayout panel_3Layout = new javax.swing.GroupLayout(panel_3);
        panel_3.setLayout(panel_3Layout);
        panel_3Layout.setHorizontalGroup(
            panel_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 755, Short.MAX_VALUE)
                    .addComponent(title_p3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(subtitle_p3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panel_3Layout.createSequentialGroup()
                        .addGroup(panel_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel_3Layout.createSequentialGroup()
                                .addGroup(panel_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(gencount_label_p3)
                                    .addComponent(alg_label_p3))
                                .addGap(18, 18, 18)
                                .addGroup(panel_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(generation_number_p3)
                                    .addComponent(alg_choose_p3, 0, 141, Short.MAX_VALUE)))
                            .addGroup(panel_3Layout.createSequentialGroup()
                                .addComponent(exec_pnl_3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(clr_pnl_3)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
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
                    .addComponent(gencount_label_p3)
                    .addComponent(generation_number_p3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(alg_label_p3)
                    .addComponent(alg_choose_p3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 240, Short.MAX_VALUE)
                .addGroup(panel_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(exec_pnl_3)
                    .addComponent(clr_pnl_3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Sortowania", panel_3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
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

    private void exec_pnl_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exec_pnl_3ActionPerformed
        
        //Wygenerowane tablicy number elementowej z randomowymi liczbami z zakresu od -999 do 999
        //Oraz sklonowanie tablicy do 2 identycznej
        java.util.Random r = new java.util.Random();
        int number = Integer.parseInt(generation_number_p3.getText());
        int[] firstArray = r.ints(-999, 999).limit(number).toArray();
        int[] seccondArray = firstArray.clone();
        
        //Przekierowane outputu na panel 3 (JTextArea Panel 3)
        PrintStream out = new PrintStream (new TextAreaOutputStream(output_pnl_3));
        System.setOut(out);
        System.setErr(out);
        
        //Wypisanie tablicy przed sortowaniem
        System.out.println("\nTablica przed sortowaniem: " + Arrays.toString(firstArray) + "\n");
        
        //Sortowanie selection sort, obliczanie czasu
        //Instant start = Instant.now();
        //System.out.println("Sortowanie metoda selection sort (O (n^2)): " + Arrays.toString(sortowanie_test.selectionSort(firstArray)));
        //System.out.println(Arrays.toString(sortowanie_test.bubbleSort(firstArray)));
        
        //Wybieranie alg. sortowania
        String sortowanie = alg_choose_p3.getSelectedItem().toString();
        if(sortowanie == "Selection"){
            Instant start = Instant.now();
            System.out.println("Sortowanie metoda selection sort (O (n^2)): " + Arrays.toString(sortowanie_test.selectionSort(firstArray)));
            Instant end = Instant.now();
        System.out.println(Duration.between(start, end));
        } else if(sortowanie == "Bubble"){
            Instant start = Instant.now();
            System.out.println("Sortowanie metoda bubble sort (O (n^2)): " + Arrays.toString(sortowanie_test.bubbleSort(firstArray)));
            Instant end = Instant.now();
            System.out.println(Duration.between(start, end));
        }
        
        //Instant end = Instant.now();
        //System.out.println(Duration.between(start, end));
        
        //Sortowanie wbudowaną funkcją sortowania, obliczanie czasu
        Instant start2 = Instant.now();
        Arrays.sort(seccondArray);
        System.out.println("Sortowanie wbudowana funkcja sortowania Quicksort (O (nlogn)): " + Arrays.toString(seccondArray));
        Instant end2 = Instant.now();
        System.out.println(Duration.between(start2, end2));
    }//GEN-LAST:event_exec_pnl_3ActionPerformed

    private void generation_number_p3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generation_number_p3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_generation_number_p3ActionPerformed

    private void alg_choose_p3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alg_choose_p3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_alg_choose_p3ActionPerformed

    private void clr_pnl_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clr_pnl_3ActionPerformed
        
        // Czyszczenie outputu panelu 3 (sortowania)
        output_pnl_3.setText("");
    }//GEN-LAST:event_clr_pnl_3ActionPerformed

    private void exec_pnl_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exec_pnl_1ActionPerformed
        
        //Wygenerowane tablicy number elementowej z randomowymi liczbami z zakresu od -999 do 999
        //Oraz sklonowanie tablicy do 2 identycznej
        java.util.Random r = new java.util.Random();
        int number = Integer.parseInt(generation_number_p3.getText());
        int[] firstArray = r.ints(-999, 999).limit(2137).toArray();
        int[] seccondArray = firstArray.clone();
        int[] thirdArray = firstArray.clone();
        
        // Przekierowane outputu na panel 1
        PrintStream out = new PrintStream (new TextAreaOutputStream(output_pnl_1));
        System.setOut(out);
        System.setErr(out);
        
        Instant start2 = Instant.now();
        petle.loops_On3(thirdArray);
        Instant end2 = Instant.now();
        System.out.println("\n"+ "O(n3)" + Duration.between(start2, end2));
                
        Instant start1 = Instant.now();
        petle.loops_On2(seccondArray);
        Instant end1 = Instant.now();
        System.out.println("\n"+ "O(n2)" + Duration.between(start1, end1));
        
        Instant start0 = Instant.now();
        petle.loops_On(firstArray);
        Instant end0 = Instant.now();
        System.out.println("\n" + "O(n)" + Duration.between(start0, end0));
                       

    }//GEN-LAST:event_exec_pnl_1ActionPerformed

    private void clr_pnl_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clr_pnl_1ActionPerformed
        output_pnl_1.setText("");
    }//GEN-LAST:event_clr_pnl_1ActionPerformed

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
    private javax.swing.JComboBox<String> alg_choose_p3;
    private javax.swing.JLabel alg_label_p3;
    private javax.swing.JButton clr_pnl_1;
    private javax.swing.JButton clr_pnl_2;
    private javax.swing.JButton clr_pnl_3;
    private javax.swing.JButton exec_pnl_1;
    private javax.swing.JButton exec_pnl_2;
    private javax.swing.JButton exec_pnl_3;
    private javax.swing.JLabel gencount_label_p3;
    private javax.swing.JTextField generation_number_p3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextArea output_pnl_1;
    private javax.swing.JTextArea output_pnl_2;
    private javax.swing.JTextArea output_pnl_3;
    private javax.swing.JPanel panel_1;
    private javax.swing.JPanel panel_2;
    private javax.swing.JPanel panel_3;
    private javax.swing.JLabel subtitle_p3;
    private javax.swing.JLabel title_p3;
    // End of variables declaration//GEN-END:variables
}
