package model;

import java.util.Scanner;

public class ThanhvienModel {
    public Thanhvien inputThanhvien(){
        Thanhvien thanhvien=new Thanhvien();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Mời bạn nhập tên");
        String name=scanner.nextLine();
        System.out.println("Mời bạn nhập nghề");
        String nghe=scanner.nextLine();
        System.out.println("Mời bạn nhập tuổi");
       int tuoi =scanner.nextInt();
        thanhvien.setNgay(tuoi);
        thanhvien.setHoten(name);
        thanhvien.setNghenghiep(nghe);
        return thanhvien;
    }

}
