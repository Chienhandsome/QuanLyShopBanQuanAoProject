package dao;

import entity.ChiTietDonDatHang;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

public interface  ChiTietDonDatHangDao extends Remote{
	 ArrayList<ChiTietDonDatHang> getListDonDatHang()  throws RemoteException;
     ArrayList<ChiTietDonDatHang> getListDonDatHangTheoMaDDH(String maDDH)  throws RemoteException;
     boolean themDDH(ChiTietDonDatHang ddh)  throws RemoteException;
	
}
