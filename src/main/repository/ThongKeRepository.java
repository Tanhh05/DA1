/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import main.config.DBConnect;
import main.entity.ThongKe;

/**
 *
 * @author admin
 */
public class ThongKeRepository {

    public ArrayList<ThongKe> getAllThongKe() {
        // B1: Tao cau SQL 
        String sql = "SELECT \n"
                + "    (SELECT SUM(tong_tien) FROM HoaDon) AS tong_tien,\n"
                + "    (SELECT COUNT(*) FROM HoaDon) AS so_luong_hoa_don,\n"
                + "    (SELECT COUNT(*) FROM HoaDon WHERE trang_thai = 0) AS so_luong_hoa_don_bi_huy,\n"
                + "    (SELECT COUNT(*) FROM KhachHang) AS so_luong_khach_hang;";

        ArrayList<ThongKe> lists = new ArrayList<>();
        // B2: Mo cong ket noi 
        // try...with..resource => Tu dong cong ket noi sql
        try (Connection con = DBConnect.getConnection(); PreparedStatement ps = con.prepareStatement(sql)) {
            // table => ResultSet
            ResultSet rs = ps.executeQuery();
            // Doi vs cac cau SQL 
            // su dung excuteQuery => tra ve 1 bang(resultset)

            while (rs.next()) {
                lists.add(new ThongKe(rs.getDouble(1), rs.getString(2), rs.getString(3), rs.getString(4)));
            }

        } catch (Exception e) {
            // loi => nhay vao catch
            e.printStackTrace(System.out);
        }
        return lists;
    }

    public ArrayList<ThongKe> searchNam() {
        String sql = "public ArrayList<KhachHang> searchGioiTinhNam() {\n"
                + "        String sql = \"select id,ma_khach_hang,ho_ten,ngay_sinh,gioi_tinh,dia_chi,email,so_dien_thoai,ngay_tao from KhachHang\\n\"\n"
                + "                + \"where gioi_tinh=1\\n\"\n"
                + "                + \"and trang_thai =1\";\n"
                + "        ArrayList<KhachHang> lists = new ArrayList<>();\n"
                + "        try (Connection con = DBConnect.getConnection(); PreparedStatement ps = con.prepareStatement(sql)) {\n"
                + "            ResultSet rs = ps.executeQuery();\n"
                + "            while (rs.next()) {\n"
                + "                lists.add(new KhachHang(\n"
                + "                        rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getBoolean(5), rs.getString(6),\n"
                + "                        rs.getString(7), rs.getString(8), rs.getString(9)\n"
                + "                ));\n"
                + "            }\n"
                + "        } catch (Exception e) {\n"
                + "            e.printStackTrace(System.out); // nem loi khi xay ra \n"
                + "        }\n"
                + "        return lists;\n"
                + "    }";
        ArrayList<ThongKe> lists = new ArrayList<>();
        try (Connection con = DBConnect.getConnection(); PreparedStatement ps = con.prepareStatement(sql)) {
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                lists.add(new ThongKe(
                        rs.getDouble(1),rs.getString(2),rs.getString(3),rs.getString(4)
                ));
            }
        } catch (Exception e) {
            e.printStackTrace(System.out); // nem loi khi xay ra 
        }
        return lists;
    }
}
