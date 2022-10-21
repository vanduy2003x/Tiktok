package model;

public class Thanhvien {
    private String hoten;
    private int ngay;
    private String nghenghiep;

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public int getNgay() {
        return ngay;
    }

    public void setNgay(int ngay) {
        this.ngay = ngay;
    }

    public String getNghenghiep() {
        return nghenghiep;
    }

    public void setNghenghiep(String nghenghiep) {
        this.nghenghiep = nghenghiep;
    }

    public Thanhvien() {
    }

    @Override
    public String toString() {
        return "Thanhvien{" +
                "hoten='" + hoten + '\'' +
                ", ngay=" + ngay +
                ", nghenghiep='" + nghenghiep + '\'' +
                '}';
    }
}
