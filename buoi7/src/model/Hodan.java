package model;

import java.util.ArrayList;

public class Hodan {
    private int id;
    private String sonha;
    private ArrayList<Thanhvien>thanhvien1;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSonha() {
        return sonha;
    }

    public void setSonha(String sonha) {
        this.sonha = sonha;
    }

    public ArrayList<Thanhvien> getThanhvien1() {
        return thanhvien1;
    }

    public void setThanhvien1(ArrayList<Thanhvien> thanhvien1) {
        this.thanhvien1 = thanhvien1;
    }

    @Override
    public String toString() {
        return "Hodan{" +
                "id=" + id +
                ", sonha='" + sonha + '\'' +
                ", thanhvien1=" + thanhvien1 +
                '}';
    }

    public Hodan() {
    }
}
