package Controller;

import Entity.Dian07111_Anggota;
import Model.Dian07111_AnggotaModel;
import java.util.ArrayList;

public class Dian07111_AnggotaController {
        public Dian07111_AnggotaModel anggota_m = new Dian07111_AnggotaModel();

    public Dian07111_AnggotaController(){
        
    }
        
    public ArrayList<Dian07111_Anggota> view(){
        return anggota_m.getDataAnggota();
        }

        public void insert(Dian07111_Anggota anggota){
        anggota_m.insert(anggota);
    }

    public void delete(int index){
        anggota_m.delete(index);
    }
    
    public int cekAnggota(String idAnggota){
        int keterangan = -1;
        if(anggota_m.getDataAnggota().size()>0){
            for(int i=0;i<anggota_m.getDataAnggota().size();i++){
             if(idAnggota.equals(anggota_m.getDataAnggota().get(i).getNo_id())){
                 keterangan = i;
                 break;
             }else{
                 keterangan = -1;
             }
            }
        }
        return keterangan;
    }
    public Dian07111_Anggota showDaftarAnggota(int index){
        return anggota_m.getDataAnggota().get(index);
    }
}
