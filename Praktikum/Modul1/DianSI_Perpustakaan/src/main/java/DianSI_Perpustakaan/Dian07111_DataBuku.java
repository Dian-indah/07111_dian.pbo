package DianSI_Perpustakaan;

public class Dian07111_DataBuku {
    String dian07111_KodeBuku, dian07111_JudulBuku, dian07111_Pengarang, dian07111_TahunTerbit;
    
    public Dian07111_DataBuku(String dian07111_KodeBuku, String dian07111_JudulBuku, String dian07111_Pengarang, String dian07111_TahunTerbit){
        this.dian07111_KodeBuku = dian07111_KodeBuku;
        this.dian07111_JudulBuku = dian07111_JudulBuku;
        this.dian07111_Pengarang = dian07111_Pengarang;
        this.dian07111_TahunTerbit = dian07111_TahunTerbit;
    }
    //mengembalikan nilai atribut
    
    String dian07111_getKodeBuku(){
        return this.dian07111_KodeBuku;
    }
    String dian07111_getJudul(){
        return this.dian07111_JudulBuku;
    }
    String dian07111_getPengarang(){
        return this.dian07111_Pengarang;
    }
    String dian07111_getTahunTerbit(){
        return this.dian07111_TahunTerbit;
    }
  
}
