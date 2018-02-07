/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author Joseph
 */
public class Ex10VAT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
//  int price, quantity, deliveryCharge, total;
        
    System.out.print("Enter price: ");
    int price = kb.nextInt();
    
    System.out.print("Enter Quantity: ");
    int quantity = kb.nextInt();
    
    int total = price * quantity;
    double VAT = 0.175 * total;
    
    double deliveryCharge = 1.5 * quantity;
            
    System.out.print("The total is: " + total);
    
    double finalBill = total + VAT + deliveryCharge;
    System.out.print("The final bill is: " + finalBill);        
    }
    
}
