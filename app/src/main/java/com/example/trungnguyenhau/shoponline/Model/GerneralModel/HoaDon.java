package com.example.trungnguyenhau.shoponline.Model.GerneralModel;

import java.util.List;

/**
 * Created by NguyenTrungHau on 8/13/2017.
 */

public class HoaDon {
    private int MaHD,ChuyenKhoan;
    private String NgayMua,NgayGiao,TrangThai,TenNguoiNhan,SoDT,DiaChi,MaChuyenKhoan;
    private List<ChiTietHoaDon> chiTietHoaDonList;

    public int getMaHD() {
        return MaHD;
    }

    public void setMaHD(int maHD) {
        MaHD = maHD;
    }

    public int getChuyenKhoan() {
        return ChuyenKhoan;
    }

    public void setChuyenKhoan(int chuyenKhoan) {
        ChuyenKhoan = chuyenKhoan;
    }

    public String getNgayMua() {
        return NgayMua;
    }

    public void setNgayMua(String ngayMua) {
        NgayMua = ngayMua;
    }

    public String getNgayGiao() {
        return NgayGiao;
    }

    public void setNgayGiao(String ngayGiao) {
        NgayGiao = ngayGiao;
    }

    public String getTrangThai() {
        return TrangThai;
    }

    public void setTrangThai(String trangThai) {
        TrangThai = trangThai;
    }

    public String getTenNguoiNhan() {
        return TenNguoiNhan;
    }

    public void setTenNguoiNhan(String tenNguoiNhan) {
        TenNguoiNhan = tenNguoiNhan;
    }

    public String getSoDT() {
        return SoDT;
    }

    public void setSoDT(String soDT) {
        SoDT = soDT;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String diaChi) {
        DiaChi = diaChi;
    }

    public String getMaChuyenKhoan() {
        return MaChuyenKhoan;
    }

    public void setMaChuyenKhoan(String maChuyenKhoan) {
        MaChuyenKhoan = maChuyenKhoan;
    }

    public List<ChiTietHoaDon> getChiTietHoaDonList() {
        return chiTietHoaDonList;
    }

    public void setChiTietHoaDonList(List<ChiTietHoaDon> chiTietHoaDonList) {
        this.chiTietHoaDonList = chiTietHoaDonList;
    }

}
