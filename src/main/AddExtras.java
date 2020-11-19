
        import java.util.Scanner;

public class AddExtras {
    Extra extra1, extra2, extra3, extra4;

    public AddExtras(Extra choice1, AddExtras choice2, AddExtras choice3, AddExtras choice4) {
        this.extra1 = choice1;
        this.extra2 = choice2;
        this.extra3 = choice3;
        this.extra4 = choice4;
    }
    public boolean Extras(Extra add){
        System.out.println("Would you like: " + add.getExtras() + " price: " + add.getPrice());
        Scanner reader = new Scanner(System.in);
        String reply = reader.nextLine();
        if(reply.equals("yes")) {
            return true;
        } else {
            return false;
        }
    }
}