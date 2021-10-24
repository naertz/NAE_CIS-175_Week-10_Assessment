/**
 * @author NAE (Noah Ertz) - naertz
 * CIS-175 - Fall 2021
 * Oct 23, 2021
 */

package computer.beans;

import javax.persistence.Embeddable;

@Embeddable
public class Cpu {
    // Instance Variable(s) =======================
    private String brand;        // Brand
    private String productLine;  // Product Line
    private String model;        // Model
    private int cores;           // Number Of Cores
    // ============================================
    
    // Constructor(s) =====================================================
    // Default
    public Cpu() {
        super();
    }
    
    // Main
    public Cpu(String brand, String productLine, String model, int cores) {
        super();
        this.brand = brand;
        this.productLine = productLine;
        this.model = model;
        this.cores = cores;
    }
    // ====================================================================
    
    // Setter(s) ===================================
    // Brand
    public void setBrand(String brand) {
        this.brand = brand;
    }
    
    // Product Line
    public void setProductLine(String productLine) {
        this.productLine = productLine;
    }
    
    // Model
    public void setModel(String model) {
        this.model = model;
    }
    
    // Number Of Cores
    public void setCores(int cores) {
        this.cores = cores;
    }
    // =============================================
    
    // Getter(s) ===================
    // Brand
    public String getBrand() {
        return brand;
    }
    
    // Product Line
    public String getProductLine() {
        return productLine;
    }
    
    // Model
    public String getModel() {
        return model;
    }
    
    // Number Of Cores
    public int getCores() {
        return cores;
    }
    // =============================
    
    // Method(s) =====================================================================================================
    // toString Override
    @Override
    public String toString() {
        return "Cpu [brand=" + brand + ", productLine=" + productLine + ", model=" + model + ", cores=" + cores + "]";
    }
    // ===============================================================================================================
}
