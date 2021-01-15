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
    
    public void insertPeminjaman(Object x){
        DataPeminjaman.add((Dian07111_Peminjaman) x);
    }

    public void updatePeminjaman(int index, Dian07111_Peminjaman peminjam){
        DataPeminjaman.set(index, peminjam);
    }
            
}
