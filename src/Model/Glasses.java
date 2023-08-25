/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author user
 */
public class Glasses {
    private int productId;
    private String Frametype;
    private String Lenstype;
    private String Quantity;

    public Glasses(int productId, String Frametype, String Lenstype, String Quantity) {
        this.productId = productId;
        this.Frametype = Frametype;
        this.Lenstype = Lenstype;
        this.Quantity = Quantity;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getFrametype() {
        return Frametype;
    }

    public void setFrametype(String Frametype) {
        this.Frametype = Frametype;
    }

    public String getLenstype() {
        return Lenstype;
    }

    public void setLenstype(String Lenstype) {
        this.Lenstype = Lenstype;
    }

    public String getQuantity() {
        return Quantity;
    }

    public void setQuantity(String Quantity) {
        this.Quantity = Quantity;
    }

    @Override
    public String toString() {
        return "Glasses{" + "productId=" + productId + ", Frametype=" + Frametype + ", Lenstype=" + Lenstype + ", Quantity=" + Quantity + '}';
    }
    
    
    
}
