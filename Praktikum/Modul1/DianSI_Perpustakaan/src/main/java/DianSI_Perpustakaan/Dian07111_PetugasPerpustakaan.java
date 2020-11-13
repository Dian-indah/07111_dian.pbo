package DianSI_Perpustakaan;

public class Dian07111_PetugasPerpustakaan {
    String dian07111_id,dian07111_nama,dian07111_alamat,dian07111_password,dian07111_notelp;
    
    public Dian07111_PetugasPerpustakaan(String dian07111_id, String dian07111_nama, String dian07111_alamat,
            String dian07111_password, String dian07111_notelp){
        this.dian07111_id = dian07111_id;
        this.dian07111_nama = dian07111_nama;
        this.dian07111_alamat = dian07111_alamat;
        this.dian07111_password = dian07111_password;
        this.dian07111_notelp = dian07111_notelp;
    }
    String dian07111_getId(){
        return this.dian07111_id;
    }
    String dian07111_getNama(){
        return this.dian07111_nama;
    }
    String dian07111_getAlamat(){
        return this.dian07111_alamat;
    }
    String dian07111_getPassword(){
        return this.dian07111_password;
    }
    String dian07111_getNoTelp(){
        return this.dian07111_notelp;
    }
}
