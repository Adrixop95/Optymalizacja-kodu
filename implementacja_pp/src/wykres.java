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
            "Ilość iteracji",
            "Czas działania",
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

        XYSeries series = new XYSeries("SelectionSort");
        XYSeries series2 = new XYSeries("QuickSort");
        XYSeries series3 = new XYSeries("BubbleSort");
        XYSeries series4 = new XYSeries("InsertionSortRecursive");

        for (int i = 1; i < 11; i++){
            series.add(i, gui_pp.pass_data_selectionSort());
        }
        
        for (int i = 1; i < 11; i++){
            series2.add(i, gui_pp.quicksort_data());
        }
                
        for (int i = 1; i < 11; i++){
            series3.add(i, gui_pp.pass_data_bubbleSort());
        }
        
        for (int i = 1; i < 11; i++){
            series4.add(i, gui_pp.pass_data_InsertionSortRecursive());
        }

        //Dodanie danych do wykresu
        dataset.addSeries(series);
        dataset.addSeries(series2);
        dataset.addSeries(series3);
        dataset.addSeries(series4); 
        return dataset;
    }

    public static void main() {
        SwingUtilities.invokeLater(() -> {
            wykres example = new wykres("Wykres sortowania");
            example.setSize(800, 400);
            example.setLocationRelativeTo(null);
            example.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            example.setVisible(true);
      });
    }
}