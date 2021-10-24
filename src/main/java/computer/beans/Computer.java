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
    // Instance Variable(s) =======================
    @Id
    @GeneratedValue
    private long id;                // ID
    private String hostname;        // Hostname
    private int ram;                // RAM
    private double value;           // Value
    private Boolean isWaterCooled;  // Cooling Type
    @Autowired
    private Cpu cpu;                // CPU
    // ============================================
    
    // Constructor(s) =======================================================================
    // Default
    public Computer() {
        super();
        this.isWaterCooled = false;
    }
    
    // Hostname
    public Computer(String hostname) {
        super();
        this.hostname = hostname;
    }
    
    // Hostname, RAM, Value, Cooling Type
    public Computer(String hostname, int ram, double value, Boolean isWaterCooled) {
        super();
        this.hostname = hostname;
        this.ram = ram;
        this.value = value;
        this.isWaterCooled = isWaterCooled;
    }
    
    // Main
    public Computer(long id, String hostname, int ram, double value, Boolean isWaterCooled) {
        super();
        this.id = id;
        this.hostname = hostname;
        this.ram = ram;
        this.value = value;
        this.isWaterCooled = isWaterCooled;
    }
    // ======================================================================================
    
    // Setter(s) ========================================
    // ID
    public void setId(long id) {
        this.id = id;
    }
    
    // Hostname
    public void setHostname(String hostname) {
        this.hostname = hostname;
    }
    
    // RAM
    public void setRam(int ram) {
        this.ram = ram;
    }
    
    // Value
    public void setValue(double value) {
        this.value = value;
    }
    
    // Cooling Type
    public void setIsWaterCooled(Boolean isWaterCooled) {
        this.isWaterCooled = isWaterCooled;
    }
    
    // CPU
    public void setCpu(Cpu cpu) {
        this.cpu = cpu;
    }
    // ==================================================
    
    // Getter(s) ======================
    // ID
    public long getId() {
        return id;
    }
    
    // Hostname
    public String getHostname() {
        return hostname;
    }
    
    // RAM
    public int getRam() {
        return ram;
    }
    
    // Value
    public double getValue() {
        return value;
    }
    
    // Cooling Type
    public Boolean getIsWaterCooled() {
        return isWaterCooled;
    }
    
    // CPU
    public Cpu getCpu() {
        return cpu;
    }
    // ================================
    
    // Method(s) ================================================================================================================================================
    // toString Override
    @Override
    public String toString() {
        return "Computer [id=" + id + ", hostname=" + hostname + ", ram=" + ram + ", value=" + value + ", isWaterCooled=" + isWaterCooled + ", cpu=" + cpu + "]";
    }
    // ==========================================================================================================================================================
}
