package Entity;

public class Dian07111_Petugas extends Dian07111_WargaPerpus{   
    private String password;
    
    public Dian07111_Petugas(String no_id, String nama, String alamat, String password){
        super(no_id, nama, alamat);
        this.password = password;
    }
   
    @Override 
    public String getNo_id(){
        return no_id;
    }
    @Override 
    public String getNama(){
        return nama;
    }
    @Override 
    public String getAlamat(){
        return alamat;
    }
    public String getPassword(){
        return this.password;
    } 
}
