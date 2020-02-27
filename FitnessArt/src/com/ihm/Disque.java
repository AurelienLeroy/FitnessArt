package ihm;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.general.PieDataset;

public class Disque {
	
	private ChartPanel chartPanel;
	private String titre;
	
	public Disque(String titre) {
		setTitre(titre);
		PieDataset dataset = createDataset();
		JFreeChart chart = createChart(dataset);
		setChartPanel(new ChartPanel(chart));
	}

	private PieDataset createDataset() {
		
		DefaultPieDataset dataset = new DefaultPieDataset();
		if (Muscu.data != 0) {
			dataset.setValue("Vous", Muscu.data);
		}
		
		if (Muscu.data2 != 0) {
			dataset.setValue("Ami 1", Muscu.data2);
		}
		
		if (Muscu.data3 != 0) {
			dataset.setValue("Ami 2", Muscu.data3);
		}
		
		return dataset;
	}

	private JFreeChart createChart(PieDataset dataset) {
		return ChartFactory.createPieChart(titre, dataset, true, true, false);
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
}
