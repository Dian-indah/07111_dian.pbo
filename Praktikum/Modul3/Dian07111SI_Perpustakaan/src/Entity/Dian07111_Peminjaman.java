package Entity;
import java.util.Date;

public class Dian07111_Peminjaman {
    private Dian07111_Anggota anggota;
    private Dian07111_Buku buku;
    private int noPinjam;
    private Date tglPinjam,tglKembali;
    
    public Dian07111_Peminjaman( Dian07111_Anggota anggota,Dian07111_Buku buku,int noPinjam,Date tglPinjam, Date tglKembali){
        this.anggota=anggota;
        this.tglPinjam=tglPinjam;
        this.buku = buku;
        this.noPinjam = noPinjam;
        this.tglPinjam= tglPinjam;
        this.tglKembali = tglKembali;
        
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
