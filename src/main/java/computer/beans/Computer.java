/**
 * @author NAE (Noah Ertz) - naertz
 * CIS-175 - Fall 2021
 * Oct 23, 2021
 */

package computer.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Autowired;

@Entity
public class Computer {
	@Id
	@GeneratedValue
	private long id;
	private String hostname;
	private int ram;
	private double value;
	private Boolean isWaterCooled;
	@Autowired
	private Cpu cpu;
	
	/****************/
	/* Constructors */
	/****************/
	
	public Computer() {
		super();
		this.isWaterCooled = false;
	}
	
	public Computer(String hostname) {
		super();
		this.hostname = hostname;
	}
	
	public Computer(String hostname, int ram, double value, Boolean isWaterCooled) {
		super();
		this.hostname = hostname;
		this.ram = ram;
		this.value = value;
		this.isWaterCooled = isWaterCooled;
	}
	
	public Computer(long id, String hostname, int ram, double value, Boolean isWaterCooled) {
		super();
		this.id = id;
		this.hostname = hostname;
		this.ram = ram;
		this.value = value;
		this.isWaterCooled = isWaterCooled;
	}
	
	/***********/
	/* Setters */
	/***********/
	
	public void setId(long id) {
		this.id = id;
	}
	
	public void setHostname(String hostname) {
		this.hostname = hostname;
	}
	
	public void setRam(int ram) {
		this.ram = ram;
	}
	
	public void setValue(double value) {
		this.value = value;
	}
	
	public void setIsWaterCooled(Boolean isWaterCooled) {
		this.isWaterCooled = isWaterCooled;
	}
	
	public void setCpu(Cpu cpu) {
		this.cpu = cpu;
	}
	
	/***********/
	/* Getters */
	/***********/
	
	public long getId() {
		return id;
	}
	
	public String getHostname() {
		return hostname;
	}
	
	public int getRam() {
		return ram;
	}
	
	public double getValue() {
		return value;
	}
	
	public Boolean getIsWaterCooled() {
		return isWaterCooled;
	}
	
	public Cpu getCpu() {
		return cpu;
	}
	
	/***********/
	/* Methods */
	/***********/
	
	public String toString() {
		return "Computer [id=" + id + ", hostname=" + hostname + ", ram=" + ram + ", value=" + value + ", isWaterCooled=" + isWaterCooled + ", cpu=" + cpu + "]";
	}
}
