package com.example.trungnguyenhau.shoponline.Adapter;

import android.content.Context;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.trungnguyenhau.shoponline.Model.GerneralModel.DienTu;
import com.example.trungnguyenhau.shoponline.R;


import java.util.List;

/**
 * Created by NguyenTrungHau on 8/13/2017.
 */

public class AdapterDienTu extends RecyclerView.Adapter<AdapterDienTu.ViewHolderDienTu> {

    Context context;
    List<DienTu> dienTuList;

    public  AdapterDienTu(Context context, List<DienTu> dienTuList){
        this.context = context;
        this.dienTuList = dienTuList;
    }

    public class ViewHolderDienTu extends RecyclerView.ViewHolder {
        ImageView imHinhKhuyenMaiDienTu;
        RecyclerView recyclerViewThuongHieuLon,recyclerViewTopSanPham;
        TextView txtTieuDeSanPhamNoiBat,txtTopSanPhamNoiBat;

        public ViewHolderDienTu(View itemView) {
            super(itemView);

            recyclerViewThuongHieuLon = (RecyclerView) itemView.findViewById(R.id.recyclerThuongHieuLon);
            recyclerViewTopSanPham = (RecyclerView) itemView.findViewById(R.id.recyclerTopDienThoaiMayTinhBang);
            imHinhKhuyenMaiDienTu = (ImageView) itemView.findViewById(R.id.imKhuyenMaiDienTu);
            txtTopSanPhamNoiBat = (TextView) itemView.findViewById(R.id.txtTenSanPhamNoiBat);
            txtTieuDeSanPhamNoiBat = (TextView) itemView.findViewById(R.id.txtTenTopSanPhamNoiBat);
        }
    }

    @Override
    public ViewHolderDienTu onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.custom_layout_recyclerview_dientu,parent,false);

        ViewHolderDienTu viewHolderDienTu = new ViewHolderDienTu(view);

        return viewHolderDienTu;
    }

    @Override
    public void onBindViewHolder(ViewHolderDienTu holder, int position) {
        DienTu dienTu = dienTuList.get(position);

        holder.txtTieuDeSanPhamNoiBat.setText(dienTu.getTennoibat().toString());
        holder.txtTopSanPhamNoiBat.setText(dienTu.getTentopnoibat().toString());

        //Xử lý hiển thị danh sách thương hiệu lớn (RecyclerView Thương Hiệu Lớn )
        AdapterThuongHieuLon adapterThuongHieuLon = new AdapterThuongHieuLon(context,dienTu.getThuongHieu(),dienTu.isThuonghieu());

        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(context,3, GridLayoutManager.HORIZONTAL,false);

        holder.recyclerViewThuongHieuLon.setLayoutManager(layoutManager);
        holder.recyclerViewThuongHieuLon.setAdapter(adapterThuongHieuLon);
        adapterThuongHieuLon.notifyDataSetChanged();

        //Xử lý hiển thị danh sách top sản phẩm (RecyclerView Top sản phẩm )
        AdapterTopDienThoaiDienTu adapterTopDienThoaiDienTu = new AdapterTopDienThoaiDienTu(context,R.layout.custom_layout_topdienthoaivamaytinhbang,dienTu.getSanPham());

        RecyclerView.LayoutManager layoutManagerTop = new LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL,false);

        holder.recyclerViewTopSanPham.setLayoutManager(layoutManagerTop);
        holder.recyclerViewTopSanPham.setAdapter(adapterTopDienThoaiDienTu);
    }

    @Override
    public int getItemCount() {
        return dienTuList.size();
    }


}

