package Model;

import Entity.Dian07111_Buku;
import java.util.ArrayList;
import java.util.Scanner;

public class Dian07111_BukuModel implements Dian07111_ModelInterfaces{
    private ArrayList<Dian07111_Buku> DataBuku;
    private Scanner input = new Scanner(System.in);
    
    public Dian07111_BukuModel(){
        DataBuku = new ArrayList<>();
        }
    public ArrayList<Dian07111_Buku> getDataBuku(){
        return DataBuku;
        }
    
    @Override
    public void view(){
    
    }
    
    @Override
    public void insert(Object x){
        DataBuku.add((Dian07111_Buku) x);
    }
    
    @Override
    public void update(int index, Object x){
        DataBuku.set(index ,(Dian07111_Buku) x);
    }
    
    @Override
    public void delete(int index){
        DataBuku.remove(index);
    }
    
    @Override
    public void get_where(int index){
        DataBuku.get(index);
    }
        
}  