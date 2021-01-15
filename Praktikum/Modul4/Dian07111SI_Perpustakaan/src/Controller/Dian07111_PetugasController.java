package Controller;

import Model.Dian07111_PetugasModel;
import Entity.Dian07111_Petugas;
import java.util.ArrayList;

public class Dian07111_PetugasController {
    public Dian07111_PetugasModel petugas_m = new Dian07111_PetugasModel();
    int loginPetugas = 0;
     
    public Dian07111_PetugasController(){
    
    }
    
    public ArrayList<Dian07111_Petugas> view(){
        return petugas_m.getDataPetugas();
        }
  
    public void insert(Dian07111_Petugas petugas){
        petugas_m.insert(petugas);
    }

    public void update(int index, Dian07111_Petugas petugas){
        petugas_m.update(index, petugas);
    }

    public void delete(int index){
        petugas_m.delete(index);
    }
    
     public void dataPetugas(){
        String no_id [] = {"001","002","003"};
        String nama [] = {"Dian","Indah","Kumala"};
        String alamat [] = {"Kediri","Sidoarjo","Surabaya"};
        String password [] = {"001","002","003"};
       
        for(int i = 0; i<nama.length; i++){
        petugas_m.insert(new Dian07111_Petugas(no_id[i],nama[i],alamat[i],
                password[i]));
        }
    }
     
     public void cekPetugas(String id, String password) {
        loginPetugas = petugas_m.cekPetugas(id,password);
     }
     
     public Dian07111_Petugas petugasEntity(){
        return petugas_m.showDataPetugas(loginPetugas);
    }
//     public Dian07111_Petugas petugasEntity(){
//        return petugas_m.showDataAslab(indexLogin);
//    }
}

