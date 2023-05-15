/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4_canhan;

import java.sql.Date;

public class SINHVIEN {

    protected String MASV;
    protected String HOTEN;
    protected String NGAYSINH;
    protected String DIACHI;
    protected String LOP;
    protected String TENDN;
    protected String MATKHAU;

    public SINHVIEN() {

    }

    public SINHVIEN(String MASV, String HOTEN, String NGAYSINH, String DIACHI, String LOP, String TENDN, String MATKHAU) {

        this.MASV = MASV;
        this.HOTEN = HOTEN;
        this.NGAYSINH = NGAYSINH;
        this.DIACHI = DIACHI;
        this.LOP = LOP;
        this.TENDN = TENDN;
        this.MATKHAU = MATKHAU;

    }

    public SINHVIEN(SINHVIEN sv) {
        this.MASV = sv.MASV;
        this.HOTEN = sv.HOTEN;
        this.NGAYSINH = sv.NGAYSINH;
        this.DIACHI = sv.DIACHI;
        this.LOP = sv.LOP;
        this.TENDN = sv.TENDN;
        this.MATKHAU = sv.MATKHAU;

    }

//    SINHVIEN(String string, String string0, String string1, String string2, String string3, String string4, String string5) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
    public String getMASV() {
        return MASV;
    }

    public void setMASV(String MASV) {
        this.MASV = MASV;
    }

    public String getHOTEN() {
        return HOTEN;
    }

    public void setHOTEN(String HOTEN) {
        this.HOTEN = HOTEN;
    }

    public String getNGAYSINH() {
        return NGAYSINH;
    }

    public void setNGAYSINH(String NGAYSINH) {
        this.NGAYSINH = NGAYSINH;
    }

    public String getLOP() {
        return LOP;
    }

    public void setLOP(String LOP) {
        this.LOP = LOP;
    }

    public String getDIACHI() {
        return DIACHI;
    }

    public void setDIACHI(String DIACHI) {
        this.DIACHI = DIACHI;
    }

    public String getTENDN() {
        return TENDN;
    }

    public void setTENDN(String TENDN) {
        this.TENDN = TENDN;
    }

    public String getMATKHAU() {
        return MATKHAU;
    }

    public void setMATKHAU(String MATKHAU) {
        this.MATKHAU = MATKHAU;
    }

}
