import View.Tiktoks;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*thanhvienModelThanhvienModel thanhvienModel=new ThanhvienModel();
        Thanhvien tv = thanhvienModel.inputThanhvien();
        System.out.println(tv.toString());

        HodanModel hodanModel=new HodanModel();
        Hodan hodan=hodanModel.inputHodan();
        System.out.println(hodan.toString());*/
        Scanner scanner = new Scanner(System.in);
        Tiktoks tiktoks = new Tiktoks();
        tiktoks.inputTiktok(scanner);
        System.out.println(tiktoks);
    }
}