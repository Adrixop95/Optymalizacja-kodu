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


public class wykres extends JFrame {

    public wykres(String title) {
        super(title);

        // Tworzenie zbioru danych
        XYDataset dataset = createDataset();

        // Tworzenie wykresu
        JFreeChart chart = ChartFactory.createXYLineChart(
            " ",
            "Czas działania",
            "Ilość wywołań",
            dataset,
            PlotOrientation.VERTICAL,
            true, true, false);

        // Tworzenie panelu
        ChartPanel panel = new ChartPanel(chart);
        setContentPane(panel);
    }
  
    // Nowy zbiór danych zawierający dane z różnych serii
    private XYDataset createDataset() {
        XYSeriesCollection dataset = new XYSeriesCollection();

        XYSeries series = new XYSeries("Czas działania");
        XYSeries series2 = new XYSeries("Test");

        series.add(1, 4);
        series.add(2, 10);
        series.add(3, 12);
        series.add(4, 15);
        series.add(5, 12);
        series.add(6, 20);
        series.add(7, 23);

        series2.add(5,16);
        series2.add(1,18);
        series2.add(9,19);

        //Dodanie danych do wykresu
        dataset.addSeries(series);
        dataset.addSeries(series2);

          return dataset;
    }

    public static void main() {
        SwingUtilities.invokeLater(() -> {
            wykres example = new wykres("Wykres");
            example.setSize(800, 400);
            example.setLocationRelativeTo(null);
            example.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            example.setVisible(true);
      });
    }
}