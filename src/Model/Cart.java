/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Asus
 */
public class Cart {
    private String productName;
    private float Price;
    private int quantity;

    public Cart(String productName, float Price, int quantity) {
        this.productName = productName;
        this.Price = Price;
        this.quantity = quantity;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public float getPrice() {
        return Price;
    }

    public void setPrice(float Price) {
        this.Price = Price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
      public double getTotalAmount()
    {
        return (Price * quantity);
    }

    @Override
    public String toString() {
        return "Cart{" + "productName=" + productName + ", Price=" + Price + ", quantity=" + quantity + '}';
    }
    
    
    
}
