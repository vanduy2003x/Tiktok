package View;

import java.util.ArrayList;
import java.util.Scanner;

public class Tiktoks {
    Idolview idolview = new Idolview();
    Songview songview = new Songview();
public void inputTiktok(Scanner scanner){
    Idol idol =idolview.inputIdol(scanner);
    Song song = songview.inputSong(scanner);
    TIktok tIktok = new TIktok(idol,song);
    System.out.println(tIktok.toString());

}
}
