package Controller;

import Entity.Dian07111_Anggota;
import Model.Dian07111_AnggotaModel;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import view.*;

public class Dian07111_AnggotaController {
        public Dian07111_AnggotaModel anggota_m = new Dian07111_AnggotaModel();

    public Dian07111_AnggotaController(){
        
    }
        
    public ArrayList<Dian07111_Anggota> view(){
        return anggota_m.getDataAnggota();
        }

    public void insert(String id,String nama,String alamat,String notelp){
            Dian07111_Anggota anggota = new Dian07111_Anggota();
            anggota.setNo_id(id);
            anggota.setNama(nama);
            anggota.setAlamat(alamat);
            anggota.setNo_telp(notelp);
            anggota_m.insert(anggota);
    }

    public void delete(int index){
        anggota_m.delete(index);
    }
    
    public DefaultTableModel listanggota(){
        DefaultTableModel dtmdaftaranggota = new DefaultTableModel();
        Object[] kolom = {"No ID","Nama","Alamat","No Telepon"};
        dtmdaftaranggota.setColumnIdentifiers(kolom);
        
        int size = Dian07111_allobjcontroller.anggota.view().size();
         for (int i=0; i<size; i++){
             Object [] data = new Object[8];
            data[0] = Dian07111_allobjcontroller.anggota.view().get(i).getNo_id();
                data[1] = Dian07111_allobjcontroller.anggota.view().get(i).getNama();
                data[2] = Dian07111_allobjcontroller.anggota.view().get(i).getAlamat();
                data[3] = Dian07111_allobjcontroller.anggota.view().get(i).getNo_Telp();

                dtmdaftaranggota.addRow(data);

         }
            return dtmdaftaranggota;
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
