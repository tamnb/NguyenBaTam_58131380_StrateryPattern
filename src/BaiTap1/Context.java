/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap1;

/**
 *
 * @author Trang Nguyen
 */
public class Context {
    ITinh tinhToan;

    public void setTinhToan(ITinh tinhToan) {
        this.tinhToan = tinhToan;
    }
    
    
    public float tinh(float a, float b)
    {
        return tinhToan.Tinh(a, b);
    }
}
