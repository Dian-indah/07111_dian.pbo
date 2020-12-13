package Entity;

public class Dian07111_Guru extends Dian07111_Anggota{
    private int denda_guru;
    
    public Dian07111_Guru(String no_id, String nama, String alamat, String no_telp, int denda_guru){
        super(no_id, nama,alamat,no_telp);
        this.denda_guru = denda_guru;
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
    @Override
    public String getNo_Telp(){
        return this.no_telp;
    }
    public int getDendaSiswa(){
        return this.denda_guru;
    }
}
