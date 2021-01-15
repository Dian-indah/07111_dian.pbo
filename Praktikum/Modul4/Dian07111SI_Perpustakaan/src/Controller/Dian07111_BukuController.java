package Controller;
import Entity.Dian07111_Buku;
import Model.Dian07111_BukuModel;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import view.Dian07111_allobjcontroller;

public class Dian07111_BukuController {
    public Dian07111_BukuModel buku_m = new Dian07111_BukuModel();

    public Dian07111_BukuController(){
        
    }
    public ArrayList<Dian07111_Buku> view(){
        return buku_m.getDataBuku();
        }

    public void insert(String kodebuku, String judul, String pengarang, String tahun, int jumlah){
        Dian07111_Buku buku = new Dian07111_Buku();
        buku.setKode_buku(kodebuku);
        buku.setJudul_buku(judul);
        buku.setPengarang(pengarang);
        buku.setPengarang(pengarang);
        buku.setTahun_terbit(tahun);
        buku.setJumlah(jumlah);
        buku_m.insert(buku);
    }
    public void update(int index,String kodebuku, String judul, String pengarang, String tahun, int jumlah){
        Dian07111_Buku buku = new Dian07111_Buku();
        buku.setKode_buku(kodebuku);
        buku.setJudul_buku(judul);
        buku.setPengarang(pengarang);
        buku.setPengarang(pengarang);
        buku.setTahun_terbit(tahun);
        buku.setJumlah(jumlah);
        buku_m.update(index,buku);
    }
    public void delete(int index){
        buku_m.delete(index);
    }    
    public DefaultTableModel listbuku(){
    DefaultTableModel dtmlistbuku = new DefaultTableModel();
    Object[] kolom ={"Kode Buku","Judul","Pengarang","Tahun Terbit","Jumlah"};
    dtmlistbuku.setColumnIdentifiers(kolom);
    int size = Dian07111_allobjcontroller.buku.view().size();
    for (int i=0; i<size; i++){
        Object [] buku =new Object[7];
        buku[0] = Dian07111_allobjcontroller.buku.view().get(i).getKodeBuku();
        buku[1] = Dian07111_allobjcontroller.buku.view().get(i).getJudul();
        buku[2] = Dian07111_allobjcontroller.buku.view().get(i).getPengarang();
        buku[3] = Dian07111_allobjcontroller.buku.view().get(i).getTahunTerbit();
        buku[4] = Dian07111_allobjcontroller.buku.view().get(i).getJumlah();
        dtmlistbuku.addRow(buku);
    }
    return dtmlistbuku;
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
