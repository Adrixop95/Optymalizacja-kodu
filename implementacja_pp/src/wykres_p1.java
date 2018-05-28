/*
Created by Adrian Rupala 2018
@author Adrixop95
 */

import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.xy.XYDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;


public class wykres_p1 extends JFrame {

    public wykres_p1(String title1) {
        super(title1);

        // Tworzenie zbioru danych
        XYDataset dataset1 = createDataset1();

        // Tworzenie wykresu
        JFreeChart chart1 = ChartFactory.createXYLineChart(
            " ",
            "Ilość iteracji",
            "Czas działania",
            dataset1,
            PlotOrientation.VERTICAL,
            true, true, false);

        // Tworzenie panelu
        ChartPanel panel1 = new ChartPanel(chart1);
        setContentPane(panel1);
    }
  
    // Nowy zbiór danych zawierający dane z różnych serii
    private XYDataset createDataset1() {
        XYSeriesCollection dataset1 = new XYSeriesCollection();

        XYSeries series6 = new XYSeries("O(nlogn)");
        XYSeries series7 = new XYSeries("O(n^2)");
        XYSeries series8 = new XYSeries("O(n^3)");

        series6.add(1, gui_pp.p1_onlogn());
        series6.add(2, gui_pp.p1_onlogn());
        series6.add(3, gui_pp.p1_onlogn());
        series6.add(4, gui_pp.p1_onlogn());
        series6.add(5, gui_pp.p1_onlogn());
        series6.add(6, gui_pp.p1_onlogn());
        series6.add(7, gui_pp.p1_onlogn());
                
        series7.add(1, gui_pp.p1_on2());
        series7.add(2, gui_pp.p1_on2());
        series7.add(3, gui_pp.p1_on2());
        series7.add(4, gui_pp.p1_on2());
        series7.add(5, gui_pp.p1_on2());
        series7.add(6, gui_pp.p1_on2());
        series7.add(7, gui_pp.p1_on2());
        
        series8.add(1, gui_pp.p1_on3());
        series8.add(2, gui_pp.p1_on3());
        series8.add(3, gui_pp.p1_on3());
        series8.add(4, gui_pp.p1_on3());
        series8.add(5, gui_pp.p1_on3());
        series8.add(6, gui_pp.p1_on3());
        series8.add(7, gui_pp.p1_on3());


        //Dodanie danych do wykresu
        dataset1.addSeries(series6);
        dataset1.addSeries(series7);
        dataset1.addSeries(series8);
        return dataset1;
    }

    public static void main() {
        SwingUtilities.invokeLater(() -> {
            wykres_p1 example1 = new wykres_p1("Wykres pętle");
            example1.setSize(800, 400);
            example1.setLocationRelativeTo(null);
            example1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            example1.setVisible(true);
      });
    }
}