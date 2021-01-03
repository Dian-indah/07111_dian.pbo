package Controller;

import Entity.Dian07111_Peminjaman;
import Model.Dian07111_PeminjamanModel;
import java.util.ArrayList;

public class Dian07111_PeminjamanController {
    Dian07111_PeminjamanModel peminjaman_m  = new Dian07111_PeminjamanModel();
    
    public Dian07111_PeminjamanController(){
    
    }
    public ArrayList<Dian07111_Peminjaman> view(){
        return peminjaman_m.getDataPeminjaman();
    }
}
