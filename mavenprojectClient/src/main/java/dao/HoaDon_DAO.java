/*
	@ (#) HoaDon_DAO.java		Apr 12, 2024
*/
package dao;

import entity.HoaDon;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

/*
@author: Đào Thanh Phú
@date: Apr 12, 2024
*/
public interface HoaDon_DAO extends Remote{
	public ArrayList<HoaDon> getListHoaDon() throws RemoteException;
	public boolean themHD(HoaDon hd) throws RemoteException;
	public double tinhTongTienTheoMaHoaDon(String maHoaDon) throws RemoteException;
	public ArrayList<HoaDon> timKiemHoaDon(String ma, String ngayTu,String ngayDen, String maKh, String maNV, double tongTienTu, double tongTienDen) throws RemoteException;
}
