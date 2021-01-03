package Controller;
import Entity.Dian07111_Buku;
import Model.Dian07111_BukuModel;
import java.util.ArrayList;

public class Dian07111_BukuController {
    public Dian07111_BukuModel buku_m = new Dian07111_BukuModel();

    public Dian07111_BukuController(){
        
    }
    public ArrayList<Dian07111_Buku> view(){
        return buku_m.getDataBuku();
        }

    public void insert(Dian07111_Buku buku){
        buku_m.insert(buku);
    }

    public void update(int index,Dian07111_Buku buku){
        buku_m.update(index,buku);
    }

    public void delete(int index){
        buku_m.delete(index);
    }
    
    public int cekBuku(String idBuku){
    int keterangan = -1;
        if(buku_m.getDataBuku().size()>0){
            for(int i=0;i<buku_m.getDataBuku().size();i++){
             if(idBuku.equals(buku_m.getDataBuku().get(i).getKodeBuku())){
                 keterangan = i;
                 break;
             }else{
                 keterangan = -1;
             }
            }
        }
        return keterangan;
    }
    public Dian07111_Buku showDaftarBuku(int index){
        return buku_m.getDataBuku().get(index);
    }
}
