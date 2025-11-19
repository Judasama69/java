

public class GameChars {
    String name;         
    String nickname;     
    String role;        
    String specialty;    
    String lane;        
    int price;       

    
    public GameChars(String name, String nickname, String role, String specialty, String lane, int price) {
        this.name = name;
        this.nickname = nickname;
        this.role = role;
        this.specialty = specialty;
        this.lane = lane;
        this.price = price;
    }

    public void IntroduceHero() {
        // Updated Greeting: "Summoner!"
        System.out.println("Summoner! I am " + name + ", the " + nickname + ".");
        System.out.println("My primary role in the Rift is " + role + ". I deal " + specialty + " damage, and I excel in the " + lane + " lane.");
        System.out.println("Current Cost: " + price + " Blue Essence");
        System.out.println(" ");
    }
}