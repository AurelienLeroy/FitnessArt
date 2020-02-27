package ihm;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;


public class Histogramme{

	private ChartPanel chartPanel;
	private String titre,x,y;

	public Histogramme(String titre, String x, String y) {
		setTitre(titre);
		setX(x);
		setY(y);
		CategoryDataset dataset = createDataset();
		JFreeChart chart = createChart(dataset);
		chartPanel = new ChartPanel(chart);
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

	public ChartPanel getChartPanel() {
		return chartPanel;
	}

	public void setChartPanel(ChartPanel chartPanel) {
		this.chartPanel = chartPanel;
	}

	private CategoryDataset createDataset() {
		
		DefaultCategoryDataset dataset = new DefaultCategoryDataset();
		
		if (Jogging.data != null) {
			for (int i=0; i < Jogging.data.size();i++) {
				dataset.addValue(Jogging.data.get(i), "Vous", getX()+(i+1));
			}
		}
		if (Jogging.data2 != null) {
			for (int i=0; i < Jogging.data2.size();i++) {
				dataset.addValue(Jogging.data2.get(i), "Ami 1", getX()+(i+1));
			}
		}
		if (Jogging.data3 != null) {
			for (int i=0; i < Jogging.data3.size();i++) {
				dataset.addValue(Jogging.data3.get(i), "Ami 2", getX()+(i+1));
			}
		}
		
		return dataset;
	}

	private JFreeChart createChart(CategoryDataset dataset) {

		JFreeChart chart = ChartFactory.createBarChart(getTitre(), getX(), getY(), dataset,
				PlotOrientation.VERTICAL, true, true, false);

		return chart;

	}
	
}
