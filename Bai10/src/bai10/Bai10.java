/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bai10;
import java.util.Scanner;
import Class.QuanLy;
public class Bai10 {
    public static void main(String[] args) {
      		Scanner sc = new Scanner(System.in);
		QuanLy ql = new QuanLy();
		ql.nhapDanhSach(sc);
		System.out.println("Danh sach bien lai cua cac ho gia dinh la:");
		ql.hienThiDanhSach();
		sc.close();
	}
    }
   