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
    }
