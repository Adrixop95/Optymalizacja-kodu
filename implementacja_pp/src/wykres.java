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


        series.add(1, gui_pp.pass_data_selectionSort());
        series.add(2, gui_pp.pass_data_selectionSort());
        series.add(3, gui_pp.pass_data_selectionSort());
        series.add(4, gui_pp.pass_data_selectionSort());
        series.add(5, gui_pp.pass_data_selectionSort());
        series.add(6, gui_pp.pass_data_selectionSort());
        series.add(7, gui_pp.pass_data_selectionSort());

        series2.add(1, gui_pp.quicksort_data());
        series2.add(2, gui_pp.quicksort_data());
        series2.add(3, gui_pp.quicksort_data());
        series2.add(4, gui_pp.quicksort_data());
        series2.add(5, gui_pp.quicksort_data());
        series2.add(6, gui_pp.quicksort_data());
        series2.add(7, gui_pp.quicksort_data());
        
        series3.add(1, gui_pp.pass_data_bubbleSort());
        series3.add(2, gui_pp.pass_data_bubbleSort());
        series3.add(3, gui_pp.pass_data_bubbleSort());
        series3.add(4, gui_pp.pass_data_bubbleSort());
        series3.add(5, gui_pp.pass_data_bubbleSort());
        series3.add(6, gui_pp.pass_data_bubbleSort());
        series3.add(7, gui_pp.pass_data_bubbleSort());
        
        series4.add(1, gui_pp.pass_data_InsertionSortRecursive());
        series4.add(2, gui_pp.pass_data_InsertionSortRecursive());
        series4.add(3, gui_pp.pass_data_InsertionSortRecursive());
        series4.add(4, gui_pp.pass_data_InsertionSortRecursive());
        series4.add(5, gui_pp.pass_data_InsertionSortRecursive());
        series4.add(6, gui_pp.pass_data_InsertionSortRecursive());
        series4.add(7, gui_pp.pass_data_InsertionSortRecursive());

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