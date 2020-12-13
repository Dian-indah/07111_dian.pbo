package Entity;

public class Dian07111_Anggota extends Dian07111_WargaPerpus{
     protected String no_telp;
    
    public Dian07111_Anggota(String no_id, String nama, String alamat, String no_telp){
        super(no_id, nama, alamat);
        this.no_telp = no_telp;
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
    public String getNo_Telp(){
        return this.no_telp;
    }
}
