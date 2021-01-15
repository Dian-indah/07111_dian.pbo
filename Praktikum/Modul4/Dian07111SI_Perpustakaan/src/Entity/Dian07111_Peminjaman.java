package Entity;
import java.util.Date;

public class Dian07111_Peminjaman {
    private String status;
    private Dian07111_Anggota anggota;
    private Dian07111_Buku buku;
    private int noPinjam,jumlah;
    private Date tglPinjam,tglKembali;
    
    public Dian07111_Peminjaman( String status,Dian07111_Anggota anggota,Dian07111_Buku buku,int noPinjam,int jumlah,Date tglPinjam, Date tglKembali){
        this.status=status;
        this.anggota=anggota;
        this.tglPinjam=tglPinjam;
        this.buku = buku;
        this.noPinjam = noPinjam;
        this.jumlah=jumlah;
        this.tglKembali = tglKembali;
        
    }

    public Dian07111_Peminjaman() {

    }

    public int getJumlah() {
        return jumlah;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Dian07111_Anggota getAnggota() {
        return anggota;
    }

    public void setAnggota(Dian07111_Anggota anggota) {
        this.anggota = anggota;
    }

    public Dian07111_Buku getBuku() {
        return buku;
    }

    public void setBuku(Dian07111_Buku buku) {
        this.buku = buku;
    }

    public int getNoPinjam() {
        return noPinjam;
    }

    public void setNoPinjam(int noPinjam) {
        this.noPinjam = noPinjam;
    }

    public Date getTglPinjam() {
        return tglPinjam;
    }

    public void setTglPinjam(Date tglPinjam) {
        this.tglPinjam = tglPinjam;
    }

    public Date getTglKembali() {
        return tglKembali;
    }

    public void setTglKembali(Date tglKembali) {
        this.tglKembali = tglKembali;
    }
     
}
