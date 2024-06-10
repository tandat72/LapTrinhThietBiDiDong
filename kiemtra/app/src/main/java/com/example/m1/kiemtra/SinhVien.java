package com.example.m1.kiemtra;

/**
 * Created by M1 on 15/03/2023.
 */
public class SinhVien {
    private String tenSV;
    private int sltc;
    private boolean nam;
    private boolean nu;
    private boolean caodang;

    public SinhVien() {
    }

    public SinhVien(String tenSV, int sltc, boolean nam, boolean nu, boolean caodang) {
        this.tenSV = tenSV;
        this.sltc = sltc;
        this.nam = nam;
        this.nu = nu;
        this.caodang = caodang;
    }

    public String getTenSV() {
        return tenSV;
    }

    public void setTenSV(String tenSV) {
        this.tenSV = tenSV;
    }

    public int getSltc() {
        return sltc;
    }

    public void setSltc(int sltc) {
        this.sltc = sltc;
    }

    public boolean isNam() {
        return nam;
    }

    public void setNam(boolean nam) {
        this.nam = nam;
    }

    public boolean isNu() {
        return nu;
    }

    public void setNu(boolean nu) {
        this.nu = nu;
    }

    public boolean isCaodang() {
        return caodang;
    }

    public void setCaodang(boolean caodang) {
        this.caodang = caodang;
    }

    @Override
    public String toString() {
        return "SinhVien{" +
                "tenSV='" + tenSV + '\'' +
                ", sltc=" + sltc +
                ", nam=" + nam +
                ", nu=" + nu +
                ", caodang=" + caodang +
                '}';
    }
    public double tinhtien(){
        if(caodang)
            return sltc * 200;
        else
            return sltc * 350;
    }
}
