package ihm;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.xy.XYDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

public class Courbe {
	
	private ChartPanel chartPanel;
	private String titre, x, y;
	
	public Courbe(String titre, String x, String y) {
		setTitre(titre);
		setX(x);
		setY(y);
		XYDataset dataset = createDataset();
		JFreeChart chart = createChart(dataset);
		chartPanel = new ChartPanel(chart);
	}

	public ChartPanel getChartPanel() {
		return chartPanel;
	}

	public void setChartPanel(ChartPanel chartPanel) {
		this.chartPanel = chartPanel;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getX() {
		return x;
	}

	public void setX(String x) {
		this.x = x;
	}

	public String getY() {
		return y;
	}

	public void setY(String y) {
		this.y = y;
	}

	private XYDataset createDataset() {
		
		XYSeriesCollection dataset = new XYSeriesCollection();
		
		if (Apnee.data != null) {
			XYSeries series = new XYSeries("Vous");
			for (int i=0 ; i < Apnee.data.size() ; i++) {
				series.add(i+1,Apnee.data.get(i));
			}
			dataset.addSeries(series);
		}
		
		if (Apnee.data2 != null) {
			XYSeries series = new XYSeries("Ami 1");
			for (int i=0 ; i < Apnee.data2.size() ; i++) {
				series.add(i+1,Apnee.data2.get(i));
			}
			dataset.addSeries(series);
		}

		return dataset;
	}

	private JFreeChart createChart(XYDataset dataset) {
		return ChartFactory.createXYLineChart(titre, x, y, dataset, PlotOrientation.VERTICAL, true, true, false);
	}

}
