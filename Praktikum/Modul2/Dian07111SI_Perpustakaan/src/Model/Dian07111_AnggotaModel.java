package Model;

import Entity.Dian07111_Anggota;
import java.util.ArrayList;

public class Dian07111_AnggotaModel implements Dian07111_ModelInterfaces{
    private ArrayList<Dian07111_Anggota> DataAnggota;
    
    public Dian07111_AnggotaModel(){
        DataAnggota = new ArrayList<>();
    }
    public ArrayList<Dian07111_Anggota> getDataAnggota(){
        return DataAnggota;
    }
    
    @Override
    public void view(){
    
    }
    
    @Override
    public void insert(Object x){
        DataAnggota.add((Dian07111_Anggota) x);
    }
    
    @Override
    public void update(int index, Object x){
        DataAnggota.set(index ,(Dian07111_Anggota) x);
    }
    
    @Override
    public void delete(int index){
        DataAnggota.remove(index);
    }
    
    @Override
    public void get_where(int index){
        DataAnggota.get(index);
    }
}
