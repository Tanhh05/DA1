/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.entity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
/**
 *
 * @author admin
 */
@AllArgsConstructor  // contructor full tham so 
@NoArgsConstructor // contructor k tham so 
@Getter
@Setter 
@ToString
@Builder
public class ThongKe {
    private double tongTien;
    private String so_luong_hoa_don;
    private String so_luong_hoa_don_bi_huy;
    private String so_luong_khach_hang;
}
