package Model;

import Entity.Dian07111_Petugas;
import java.util.ArrayList;

public class Dian07111_PetugasModel implements Dian07111_ModelInterfaces{
    public ArrayList<Dian07111_Petugas> DataPetugas;
    
    public Dian07111_PetugasModel(){
        DataPetugas = new ArrayList<>();
    }
    public ArrayList<Dian07111_Petugas> getDataPetugas(){
        return DataPetugas;
    }
   @Override
    public void view(){
    
    }
    @Override
    public void insert(Object x){
        DataPetugas.add((Dian07111_Petugas) x);
    }
    @Override
    public void update(int index, Object x){
        DataPetugas.set(index ,(Dian07111_Petugas) x);
    }
    @Override
    public void delete(int index){
        DataPetugas.remove(index);
    }
    
    public Dian07111_Petugas showDataPetugas(int index){
        return DataPetugas.get(index);
    }

    public int cekPetugas(String id, String password){
        int loop = 0;
        for(Dian07111_Petugas petugasEntity : getDataPetugas()){
            if(petugasEntity.getNo_id().equals(id) && petugasEntity.getPassword().equals(password)){
                break;
            }else{
                  loop++;
            }
        }
        return loop;
    };
}
