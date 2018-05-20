import java.io.PrintStream;
import java.util.Arrays;


public class gui_pp extends javax.swing.JFrame {

    public gui_pp() {
        initComponents();
        setResizable(false);
        setTitle("Projekt - Optymalizacja kodu\"");
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
        panel_2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        output_pnl_2 = new javax.swing.JTextArea();
        exec_pnl_2 = new javax.swing.JButton();
        clr_pnl_2 = new javax.swing.JButton();
        panel_3 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        output_pnl_3 = new javax.swing.JTextArea();
        exec_pnl_3 = new javax.swing.JButton();
        clr_pnl_3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(800, 600));

        output_pnl_1.setColumns(20);
        output_pnl_1.setRows(5);
        jScrollPane1.setViewportView(output_pnl_1);

        exec_pnl_1.setText("Wykonaj kod");

        clr_pnl_1.setText("Wyczyść");

        javax.swing.GroupLayout panel_1Layout = new javax.swing.GroupLayout(panel_1);
        panel_1.setLayout(panel_1Layout);
        panel_1Layout.setHorizontalGroup(
            panel_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(panel_1Layout.createSequentialGroup()
                        .addComponent(exec_pnl_1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(clr_pnl_1)
                        .addGap(0, 439, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panel_1Layout.setVerticalGroup(
            panel_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_1Layout.createSequentialGroup()
                .addContainerGap(277, Short.MAX_VALUE)
                .addGroup(panel_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(exec_pnl_1)
                    .addComponent(clr_pnl_1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Test1", panel_1);

        output_pnl_2.setColumns(20);
        output_pnl_2.setRows(5);
        jScrollPane2.setViewportView(output_pnl_2);

        exec_pnl_2.setText("Wykonaj kod");

        clr_pnl_2.setText("Wyczyść");

        javax.swing.GroupLayout panel_2Layout = new javax.swing.GroupLayout(panel_2);
        panel_2.setLayout(panel_2Layout);
        panel_2Layout.setHorizontalGroup(
            panel_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 615, Short.MAX_VALUE)
                    .addGroup(panel_2Layout.createSequentialGroup()
                        .addComponent(exec_pnl_2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(clr_pnl_2)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panel_2Layout.setVerticalGroup(
            panel_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_2Layout.createSequentialGroup()
                .addContainerGap(277, Short.MAX_VALUE)
                .addGroup(panel_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(exec_pnl_2)
                    .addComponent(clr_pnl_2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Test2", panel_2);

        output_pnl_3.setColumns(20);
        output_pnl_3.setRows(5);
        jScrollPane3.setViewportView(output_pnl_3);

        exec_pnl_3.setText("Wykonaj kod");
        exec_pnl_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exec_pnl_3ActionPerformed(evt);
            }
        });

        clr_pnl_3.setText("Wyczyść");

        javax.swing.GroupLayout panel_3Layout = new javax.swing.GroupLayout(panel_3);
        panel_3.setLayout(panel_3Layout);
        panel_3Layout.setHorizontalGroup(
            panel_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 615, Short.MAX_VALUE)
                    .addGroup(panel_3Layout.createSequentialGroup()
                        .addComponent(exec_pnl_3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(clr_pnl_3)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panel_3Layout.setVerticalGroup(
            panel_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_3Layout.createSequentialGroup()
                .addContainerGap(277, Short.MAX_VALUE)
                .addGroup(panel_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(exec_pnl_3)
                    .addComponent(clr_pnl_3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Test3", panel_3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exec_pnl_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exec_pnl_3ActionPerformed
        java.util.Random r = new java.util.Random();
        int[] myIntArray = r.ints(0, 10).limit(5).toArray();
        
        PrintStream out = new PrintStream (new TextAreaOutputStream(output_pnl_3));
        System.setOut(out);
        System.setErr(out);
        System.out.println("Przed sortowaniem: " + Arrays.toString(myIntArray));
        System.out.println("Po sortowaniu: " + Arrays.toString(sortowanie_test.selectionSort(myIntArray)));
   
    }//GEN-LAST:event_exec_pnl_3ActionPerformed

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
    private javax.swing.JButton clr_pnl_1;
    private javax.swing.JButton clr_pnl_2;
    private javax.swing.JButton clr_pnl_3;
    private javax.swing.JButton exec_pnl_1;
    private javax.swing.JButton exec_pnl_2;
    private javax.swing.JButton exec_pnl_3;
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
    // End of variables declaration//GEN-END:variables
}
