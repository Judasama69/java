package game;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        GameChars[] myHero = new GameChars[1];
        
        System.out.println("--- WELCOME TO THE CHAMPION CREATION PORTAL ---");
        
        for (int i = 0; i < myHero.length; i++) {
            System.out.println("------------------------------------");
            System.out.println("--- ENTERING CHAMPION DATA " + (i + 1) + " of 5 ---"); 
            
            System.out.print("Enter Champion Name: ");
            String name = scanner.nextLine();
            
            System.out.print("Enter Champion Title (Nickname): ");
            String nickname = scanner.nextLine();
            
            System.out.print("Enter Role (e.g., Mid, Support, ADC): ");
            String role = scanner.nextLine();
            
            System.out.print("Enter Specialty Damage Type (AD, AP, or Hybrid): ");
            String specialty = scanner.nextLine();
            
            System.out.print("Enter Recommended Lane: ");
            String lane = scanner.nextLine();
            
            System.out.print("Enter Blue Essence Cost: ");
            int price = scanner.nextInt();
            
            scanner.nextLine(); 
            
            myHero[i] = new GameChars(name, nickname, role, specialty, lane, price);
            
            System.out.println("\nChampion '" + name + "' registered successfully.");
        }
        
        scanner.close(); 
        
        System.out.println("\n====================================");
        System.out.println("      CHAMPION ROSTER DISPLAY");
        System.out.println("====================================\n");
        
        for (GameChars myChars : myHero) {
            myChars.IntroduceHero();
        }
    }
}