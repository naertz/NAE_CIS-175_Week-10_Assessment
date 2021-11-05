/**
 * @author NAE (Noah Ertz) - naertz
 * CIS-175 - Fall 2021
 * Oct 23, 2021
 */

package computer.beans;

import javax.persistence.Embeddable;

@Embeddable
public class Cpu {
	private String brand;
	private String productLine;
	private String model;
	private int cores;
	
	/****************/
	/* Constructors */
	/****************/
	
	public Cpu() {
		super();
	}
	
	public Cpu(String brand, String productLine, String model, int cores) {
		super();
		this.brand = brand;
		this.productLine = productLine;
		this.model = model;
		this.cores = cores;
	}
	
	/***********/
	/* Setters */
	/***********/
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public void setProductLine(String productLine) {
		this.productLine = productLine;
	}
	
	public void setModel(String model) {
		this.model = model;
	}
	
	public void setCores(int cores) {
		this.cores = cores;
	}
	
	/***********/
	/* Getters */
	/***********/
	
	public String getBrand() {
		return brand;
	}
	
	public String getProductLine() {
		return productLine;
	}
	
	public String getModel() {
		return model;
	}
	
	public int getCores() {
		return cores;
	}
	
	/***********/
	/* Methods */
	/***********/
	
	@Override
	public String toString() {
		return "Cpu [brand=" + brand + ", productLine=" + productLine + ", model=" + model + ", cores=" + cores + "]";
	}
}
