/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package MoneyBox;

/**
 *
 * @author susmi
 */
public class MoneyBoxApp {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MoneyBox alice = new MoneyBox(1, 50, "Alice");
        MoneyBox bob = new MoneyBox("Bob");
        bob.addKoruna(2);
        bob.addDvoukoruna(3);
        bob.addMoney(5, 10);
        System.out.println(alice.moneySum());
        System.out.println(bob.moneySum());
        System.out.println(alice);
        System.out.println(bob);
        
        if(alice.canBuy(39)==true){
            System.out.println("Alice si může koupit hamburger");
        }else{
            System.out.println("Alice nemá peníze na hamburger");
        }
        if(bob.canBuy(39)==true){
            System.out.println("Bob si může koupit hamburger");
        }else{
            System.out.println("Bob nemá peníze na hamburger");
        }
        
        if(bob.moneySum()<alice.moneySum()){
            System.out.println("Alice má víc peněz");
        }else{
            System.out.println("Bob má více peněz");
        }
        bob.transferMoney(alice, bob.getKoruna(), bob.getDvoukoruna());
        System.out.println(alice);
        System.out.println(bob);
        
    }
    
}
