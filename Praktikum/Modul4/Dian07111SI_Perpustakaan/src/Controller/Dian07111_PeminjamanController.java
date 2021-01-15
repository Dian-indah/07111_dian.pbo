package Controller;

import Entity.Dian07111_Anggota;
import Entity.Dian07111_Buku;
import Entity.Dian07111_Peminjaman;
import Model.Dian07111_PeminjamanModel;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.table.DefaultTableModel;
import view.Dian07111_allobjcontroller;

public class Dian07111_PeminjamanController {
    Dian07111_PeminjamanModel peminjaman_m  = new Dian07111_PeminjamanModel();
    
    public Dian07111_PeminjamanController(){
    
    }
    public ArrayList<Dian07111_Peminjaman> view(){
        return peminjaman_m.getDataPeminjaman();
    }
    
    public void insert(String status,Dian07111_Anggota anggota,Dian07111_Buku buku,int noPinjam,
            int jumlah,Date tglPinjam, Date tglKembali){
        Dian07111_Peminjaman peminjaman = new Dian07111_Peminjaman();
        peminjaman.setStatus(status);
        peminjaman.setAnggota(anggota);
        peminjaman.setBuku(buku);
        peminjaman.setNoPinjam(noPinjam);
        peminjaman.setJumlah(jumlah);
        peminjaman.setTglPinjam(tglPinjam);
        peminjaman.setTglKembali(tglKembali);
        peminjaman_m.insertPeminjaman(peminjaman);
    }
    
    public DefaultTableModel listpinjaman(){
    DefaultTableModel dtmlistpeminjaman = new DefaultTableModel();
    Object[] kolom ={"No Pinjaman","Nama","Buku","Jumlah","Tgl Pinjam","Tgl Kembali","Status"};
    dtmlistpeminjaman.setColumnIdentifiers(kolom);
    
    int size = Dian07111_allobjcontroller.peminjaman.view().size();
    for (int i=0; i<size; i++){
        Object [] peminjaman =new Object[10];
        peminjaman[0] = Dian07111_allobjcontroller.peminjaman.view().get(i).getNoPinjam();
        peminjaman[1] = Dian07111_allobjcontroller.peminjaman.view().get(i).getAnggota();
        peminjaman[2] = Dian07111_allobjcontroller.peminjaman.view().get(i).getBuku();
        peminjaman[3] = Dian07111_allobjcontroller.peminjaman.view().get(i).getJumlah();
        peminjaman[4] = Dian07111_allobjcontroller.peminjaman.view().get(i).getNoPinjam();
        peminjaman[5] = Dian07111_allobjcontroller.peminjaman.view().get(i).getTglKembali();
        peminjaman[6] = Dian07111_allobjcontroller.peminjaman.view().get(i).getStatus();
        dtmlistpeminjaman.addRow(peminjaman);
    }
    return dtmlistpeminjaman;
    }
    
    public int cekPeminjaman(String idpeminjam){
    int keterangan = -1;
        if(peminjaman_m.getDataPeminjaman().size()>0){
            for(int i=0;i<peminjaman_m.getDataPeminjaman().size();i++){
             if(idpeminjam.equals(peminjaman_m.getDataPeminjaman().get(i).getNoPinjam())){
                 keterangan = i;
                 break;
             }else{
                 keterangan = -1;
             }
            }
        }
        return keterangan;
    }
    
    public Dian07111_Peminjaman showDaftarpeminjam(int index){
        return peminjaman_m.getDataPeminjaman().get(index);
    }
}
