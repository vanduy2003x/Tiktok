package model;

import java.util.Scanner;

public class HodanModel {
    public Hodan inputHodan(){
        Hodan hodan = new Hodan();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Mời bạn nhập số nhà");
        String house=scanner.nextLine();
        hodan.setSonha(house);
        return hodan;
    }
}
