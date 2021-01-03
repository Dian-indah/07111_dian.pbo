package Model;

import Entity.Dian07111_Peminjaman;
import java.util.ArrayList;

public class Dian07111_PeminjamanModel {
    private ArrayList<Dian07111_Peminjaman> DataPeminjaman;
    
    public Dian07111_PeminjamanModel(){
        DataPeminjaman = new ArrayList<>();
    }
    
    public ArrayList<Dian07111_Peminjaman> getDataPeminjaman(){
        return DataPeminjaman;
        }
    
    public void insertDataPeminjaman(Dian07111_Peminjaman peminjam){
        DataPeminjaman.add(peminjam);
    }
}
