/*
 * Stat.java
 * Author: Nicole Mistry
 * Submission Date: April 22, 2019
 * 
 * Purpose: Method class that holds constructors for stat objects which store arrays. Methods to calculate
 * statistics for these arrays are housed here as well such as finding the min, max, mean, mode. There are
 * also getter and setter methods for the data arrays and a toString method for the array as well. //ADDITIONALLY,
 * there are also robust methods to append the arrays, determine how many times a number occurs in an array, check
 * if the array is empty, reset an array, and set the data array.
 * 
 * Statement of Academic Honesty: 
 * The following code represents my own work. I have neither received nor given inappropriate assistance. 
 * I have not copied or modified code from any source other than the course webpage or the course textbook. 
 * I recognize that any unauthorized assistance or plagiarism will be handled in accordance with the University 
 * of Georgia's Academic Honesty Policy and the policies of this course. I recognize that my work is on an 
 * assignment created by the Department of Computer Science at the University of Georgia. Any publishing or 
 * posting of source code for this project is strictly prohibited unless you have written consent from the 
 * Department of Computer Science at the University of Georgia. 
 */
public class Stat {
	
	//instance variables
	private double[] data;
	
	//(1)default constructor 
	public Stat() {
		double[] d1 = new double[] {};
		data = d1;
	}
	
	//(2)constructor with double array parameter
	public Stat(double[] d) {
		double[] d2 = new double[d.length];
		for (int i = 0; i < d.length; i++) {
			d2[i] = d[i];
		}
		data = d2;
	}
	
	//(3)constructor with float array parameter
	public Stat(float[] f) {
		double[] d3 = new double[f.length];
		for (int i = 0; i < f.length; i++) {
			d3[i] = f[i];
		}
		data = d3;
	}
	
	//(4)constructor with int array parameter
	public Stat(int[] i) {
		double[] d4 = new double[i.length];
		for (int n = 0; n < i.length; n++) {
			d4[n] = i[n];
		}
		data = d4;
	}
	
	//(5)constructor with long array parameter
	public Stat(long[] l) {
		double[] d5 = new double[l.length];
		for (int i = 0; i < l.length; i++) {
			d5[i] = l[i];
		}
		data = d5;
	}
	
	//(6)sets data array of the calling object to the value of the float array parameter f
	//and assigns the values of d to data (not just the reference address)
	public void setData(float[] f) {
		double[] d6;
		if(f == null)
			d6 = new double[] {};
		else {
			d6 = new double[f.length];
			for (int i = 0; i < f.length; i++) {
				d6[i] = f[i];
			}
		}
		data = d6;
	}
	
	//(7)sets data array of the calling object to the value of the double array parameter 
	//d and assigns the values of d to data (not just the reference address)
	public void setData(double[] d) {
		double[] d7;
		if(d == null)
			d7 = new double[] {};
		else {
			d7 = new double[d.length];
			for (int i = 0; i < d.length; i++) {
				d7[i] = d[i];
			}
		}
		data = d7;
	}
	
	//(8)sets data array of the calling object to the value of the int array parameter 
	//i and assigns the values of d to data (not just the reference address)
	public void setData(int[] i) {
		double[] d8 = new double[i.length];
		if(i == null)
			d8 = new double[] {};
		else {
			d8 = new double[i.length];
			for (int n = 0; n < i.length; n++) {
				d8[n] = i[n];
			}
		}
		data = d8;
	}
	
	//(9)sets data array of the calling object to the value of the double array parameter 
	//d and assigns the values of d to data (not just the reference address)
	public void setData(long[] l) {
		double[] d9;
		if(l == null)
			d9 = new double[] {};
		else {
			d9 = new double[l.length];
			for (int i = 0; i < l.length; i++) {
				d9[i] = l[i];
			}
		}
		data = d9;
	}
	
	//(10)returns a copy of the data array for the calling stat object, not the reference address
	public double[] getData() {
		double[] d10 = new double[data.length];
		for (int i = 0; i < data.length; i++) {
			d10[i] = data[i];
		}
		return d10;
	}
	
	//(11)returns true if the data arrays of both stat objects are the same/equal
	//(the same numbers are in the same order in both)
	public boolean equals(Stat s) {
		final double THRESHOLD = 0.000001;
		if(this == null || s == null) {
			if(this == null && s == null)
				return true;
			else 
				return false;
		}
		else {
			if (this.data.length == s.data.length) {
				int counter = 0;
				for (int i = 0; i < this.getData().length; i++) {
					if (Math.abs(this.data[i] - s.data[i]) < THRESHOLD) 
						counter++;
				}
				if (counter == this.data.length)
					return true;
				else 
					return false;
			}
			else 
				return false;
		}
	
	}
	
	//(12)clears the data array by creating a new, empty data array and assigning it to data
	public void reset() {
		double[] d12 = new double[0];
		data = d12;
	}
	
	//(13)creates a new double array containing data followed by those in the int array passed
	//as a parameter
	public void append(int[] i) {
		if(i != null) {
			double[] d13 = new double[i.length + data.length];
			for (int m = 0; m < d13.length; m++) {
				if(m < data.length) 
					d13[m] = data[m];
				else if (m >= data.length) 
					for(int n = 0; n < i.length; n++, m++) {
						d13[m] = i[n];
					}
			}
			data = d13;
		}
	}
	
	//(14)creates a new double array containing data followed by those in the float array passed
	//as a parameter
	public void append(float[] f) {
		if(f != null) {
			double[] d14 = new double[f.length + data.length];
			for (int i = 0; i < d14.length; i++) {
				if(i < data.length) 
					d14[i] = data[i];
				else if (i >= data.length) 
					for(int n = 0; n < f.length; n++, i++) {
						d14[i] = f[n];
					}
			}
			data = d14;
		}
	}
	
	//(15)creates a new double array containing data followed by those in the long array passed
	//as a parameter 
	public void append(long[] l) {
		if(l != null) {
			double[] d15 = new double[l.length + data.length];
			for (int i = 0; i < d15.length; i++) {
				if(i < data.length) 
					d15[i] = data[i];
				else if (i >= data.length) 
					for(int n = 0; n < l.length; n++, i++) {
						d15[i] = l[n];
					}
			}
			data = d15;
		}
	}
	
	//(16)creates a new double array containing data followed by those in the double array passed
	//as a parameter
	public void append(double[] d) {
		if(d != null) {
			double[] d16 = new double[d.length + data.length];
			for (int i = 0; i < d16.length; i++) {
				if(i < data.length) 
					d16[i] = data[i];
				else if (i >= data.length) 
					for(int n = 0; n < d.length; n++, i++) {
						d16[i] = d[n];
					}
			}
			data = d16;
		}
	}
	
	//(17)returns true if the data object is empty and false if it is not
	public boolean isEmpty() {
		if(data.length == 0) 
			return true;
		else 
			return false;
	}
	
	//(18)prints out the data array of the calling stat object in a [0,1,2] format
	public String toString() {
		String print = "[";
		for (int i = 0; i < this.data.length; i++) {
			if(i < this.data.length - 1)
			print += this.data[i] + ", ";
			else 
				print += this.data[i];
		}
		print += "]";
		return print;
	}
	
	//(19)returns the maximum value in the data array of the stat object
	public double max() {
		
		if (data.length == 0)
			return Double.NaN;
		else {
			double maxValue = this.data[0];
			for(int i = 1; i < this.data.length; i++){
			    if(this.data[i] > maxValue) {
				  maxValue = this.data[i];
				}
			}
			return maxValue;
		}
	}
	
	//(20)returns the minimum value in the data array of the stat object
	public double min() {
		
		if(data.length == 0)
			return Double.NaN;
		else {
			double minValue = this.data[0];
			for(int i = 1; i < this.data.length; i++){
			    if(this.data[i] < minValue) {
				  minValue = this.data[i];
				}
			}
			return minValue;
		}
	}
	
	//(21)returns the average of all of the values in the array
	public double average() {
		if(data.length == 0)
			return Double.NaN;
		else {
			double sum = 0;
			double average = 0;
			for(int i = 0; i < this.data.length; i++){
			    sum += this.data[i];
			}
			average = sum / this.data.length;
			return average;
		}
	}
	
	//(22)returns the number that occurs the most times in the array (or NaN)
	public double mode() {
		
		if(data.length == 0)
			return Double.NaN;
		else {
			double THRESHOLD = 0.000001;
			double maxValue = -1;
			int maxCount = 0;
			for (int i = 0; i < data.length; ++i) {
			    double currentValue = this.data[i];
			    int currentCount = 1;
			    for (int n = i + 1; n < this.data.length; n++) {
			        if (Math.abs(this.data[n] - currentValue) < THRESHOLD) {
			            currentCount++;
			        } 
			    }
			    if (currentCount > maxCount) {
			        maxCount = currentCount;
			        maxValue = currentValue;
			    } else if (currentCount == maxCount) {
			        maxValue = Double.NaN;
			    }
			}
			return maxValue;
		}
	}

	//(23)returns the amount of times the double value is in the array
	private int occursNumberOfTimes(double value) {
		
		double THRESHOLD = 0.000001;
		int count = 0;
		for (int i = 0; i < data.length; ++i) {
		    if((Math.abs(data[i] - value)) < THRESHOLD)
		    	count++;
		}
		return count;
	}
	
	//(24)returns the variance of the values in the data array of the calling object if it is not empty
	public double variance() {
		double squaredDist = 0;
		double variance = 0;
		if(data.length == 0)
			return Double.NaN;
		else {
			for(int i = 0; i < data.length; i++) {
				squaredDist += Math.pow((Math.abs(this.average() - data[i])), 2);
			}
			variance = squaredDist / data.length;
			return variance;
		}
	}
	
	//(25)returns the standard deviation of the values in the data array of the calling object if it is not empty
	public double standardDeviation() {
		if (data.length == 0)
			return Double.NaN;
		else {
			double stdDev = 0;
			stdDev = Math.pow(this.variance(), 0.5);
			return stdDev;
		}
	}
	
	
	//class ending bracket
}
