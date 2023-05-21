/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RestaurantManagementSystem;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Naveen
 */
public class SuperClass_Parent {
    
    public double Filet_O_Fish;
    public double ChickenBurger;
    public double ChickenLegend;
    public double ChickenBurgerM;
    public double BaconCheeseBurger;
    
    public double MilkShake;
    public double VanillaCone;
    public double ClasVanilla;
    public double VanMilkShake;
    public double ChocMilkShake;
    
    public double Meals;
    public double Drinks;
    public double TotalofMD;
    
    public double AllTotalofMD;
    
    
    
    
    public double GetAmount(){
        Meals = Filet_O_Fish + ChickenBurger + ChickenLegend + ChickenBurgerM + BaconCheeseBurger;
        Drinks = MilkShake + VanillaCone + ClasVanilla + VanMilkShake + ChocMilkShake;
        TotalofMD = Meals + Drinks;
        AllTotalofMD = TotalofMD;
        return AllTotalofMD;
    }
    
    private JFrame frame;
    
    public void iExitSystem(){
        frame = new JFrame("Exit");
        
        if(JOptionPane.showConfirmDialog(frame, "Confirm If you want", "Restaurant Management Systems", 
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION){
            System.exit(0);
        }
    }
    
    //==========================================Price====================================================
    
    public double pFilet_O_Fish = 3.56;
    public double pChickenBurger = 2.95;
    public double pChickenLegend = 3.98;
    public double pChickenBurgerM = 2.65;
    public double pBaconCheeseBurger = 3.64;
    
    public double pMilkShake = 2.10;
    public double pVanillaCone = 2.20;
    public double pClasVanilla = 2.50;
    public double pVanMilkShake = 1.95;
    public double pChocMilkShake = 2.37;
    
    //===================================================================================================
    
    public double mcTax = 0.90;
    
    public double cFindTax(double cAmount){
        double FindTax = cAmount - (cAmount * mcTax);
        return FindTax;
    }
    
    //===================================================================================================






}
