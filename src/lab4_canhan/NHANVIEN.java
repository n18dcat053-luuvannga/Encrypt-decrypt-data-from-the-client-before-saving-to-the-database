/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4_canhan;

/**
 *
 * @author Admin
 */
public class NHANVIEN {
    private String MANV;
    private String HOTEN;
    private String EMAIL;
    private String LUONG;
    private String TENDN;
    private String MATKHAU;
    
    public NHANVIEN(){      
    };
    
    public NHANVIEN(String MANV,String HOTEN,String EMAIL,String LUONG){
        this.MANV=MANV;
        this.HOTEN=HOTEN;
        this.EMAIL=EMAIL;
        this.LUONG=LUONG;
//        this.TENDN=TENDN;
//        this.MATKHAU=MATKHAU;
    }
   
    public String getMANV(){
        return MANV;
    }
    public void setMANV(String MANV){
        this.MANV=MANV;
    }
    
    public String getHOTEN(){
        return HOTEN;
    }
    public void setHOTEN(){
        this.HOTEN=HOTEN;
    }
    
    public String getEMAIL(){
        return EMAIL;
    }
    public void setEMAIL(String EMAIL){
        this.EMAIL=EMAIL;
    }
    
    public String getLUONG(){
        return AES256.decrypt(LUONG);
    }
    public void setLUONG(String LUONG){
        this.LUONG=LUONG;
    }
    
    public String getTENDN(){
        return TENDN;
    }
    public void setTENDN(){
        this.TENDN=TENDN;
    }
    
    public String getMATKHAU(){
        return MATKHAU;
    }
    public void setMATKHAU(){
        this.MATKHAU=MATKHAU;
    }
}
