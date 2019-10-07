package com.scp.java.business.logic;

import java.io.File;
import java.io.IOException;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;

public class ReportGen {

		public static void main(String[] args){
			//generatePieChart(12, 22, 23);
		
		}
	
		public static void generatePieChart(int pass,int fail,int skip) throws IOException {	
		
		 DefaultPieDataset dataset = new DefaultPieDataset( );
	      dataset.setValue("Pass", new Double(pass) );
	      dataset.setValue("Fail", new Double(fail) );
	      dataset.setValue("Skip", new Double(skip) );

	      JFreeChart chart = ChartFactory.createPieChart(
	         "ScpTestReport",   // chart title
	         dataset,          // data
	         true,             // include legend
	         true,
	         false);
	         
	      int width = 640;   /* Width of the image */
	      int height = 480;  /* Height of the image */ 
	      File pieChart = new File( "PieChart.jpeg" ); 
	      ChartUtilities.saveChartAsJPEG( pieChart , chart , width , height );
	}
	
}
