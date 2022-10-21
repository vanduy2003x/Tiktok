package View;

import java.util.ArrayList;
import java.util.Scanner;

public class Idolview {
    FollwerView follwerView = new FollwerView();
    public Idol inputIdol(Scanner scanner){
        System.out.println("Tên IDOL");
        String nameidol= scanner.nextLine();
        System.out.println("Số ID");
        int soid =scanner.nextInt();
        scanner.nextLine();
        System.out.println("Email");
        String email=scanner.nextLine();
        Follower follower1 = follwerView.inputFollwer(scanner);
        Idol idol = new Idol(nameidol,soid,email,follower1);
        return idol;

    }
}
