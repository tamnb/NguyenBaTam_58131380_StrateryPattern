/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap2;

import java.util.ArrayList;

/**
 *
 * @author Trang Nguyen
 */
public class GioHang {

    IThanhToan hinhthucTT;
    ArrayList<HangHoa> dsHangHoa;

    public void setHinhthucTT(IThanhToan hinhthucTT) {
        this.hinhthucTT = hinhthucTT;
    }
    
    
    
    public double thanhToan(int tienHang) {
        return hinhthucTT.thanhToan(tienHang);
    }
    
    public void xuat (ArrayList<HangHoa> sp)
    {
        for (int i = 0; i < sp.size(); i++)
        {
            sp.get(i).display();
            System.out.println("Gia phai tra la:" + thanhToan(sp.get(i).gia)+"\n");
            System.out.println("--------------------------------------------");
        }
        
    }
}
