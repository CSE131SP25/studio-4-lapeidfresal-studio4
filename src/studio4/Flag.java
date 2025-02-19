package studio4;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {

	public static void main(String[] args){
		
		StdDraw.setPenColor(4, 53, 193);
		StdDraw.filledRectangle(0.5, 0.5, 0.3, 0.2);
		
		
		
		double[] x1 = {.25, .25, .4};
		double[] y1 = {.45, .55, .45};
		
		StdDraw.setPenColor(133, 14, 5);
		StdDraw.filledPolygon(x1, y1);
		
		double[] x2 = {.75, .75, .6};
		double[] y2 = {.45, .55, .45};
		
		StdDraw.filledPolygon(x2, y2);
		
		StdDraw.line(0.5, 0.5, 0.2, 0.7);
		StdDraw.line(0.5, 0.5, 0.8, 0.7);
		
		StdDraw.setPenColor(33, 107, 16);
		StdDraw.setPenRadius(0.05);
		
		StdDraw.line(0.22, 0.37, 0.78, 0.37);
		
		StdDraw.setPenColor(255, 215, 0);
		StdDraw.filledCircle(0.5, 0.475, 0.05);
		
		StdDraw.setPenColor(0, 0, 0);
		StdDraw.setPenRadius(0.02);
		StdDraw.rectangle(0.5, 0.5, 0.3, 0.2);
		
		StdDraw.show();
		
		
	}
}