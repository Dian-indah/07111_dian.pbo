package DianSI_Perpustakaan;
import java.util.ArrayList;
import java.util.Scanner;

public class Dian07111_MainSIPerpustakaan {
    static ArrayList <Dian07111_DataBuku> dian07111_dataBuku = new ArrayList();
    static ArrayList <Dian07111_PetugasPerpustakaan> dian07111_dataPetugas = new ArrayList();
    static Scanner dian07111_input = new Scanner(System.in);
    
    public static void main(String args[]) {
        System.out.println("  SELAMAT DATANG DI PERPUSTAKAAN !! ");
        int dian07111_pil;
        do{
            System.out.println("");
           System.out.println("----- MENU -----");
           System.out.println("1. Daftar Petugas");
           System.out.println("2. Login");
           System.out.println("3. Exit");
           System.out.println("Pilihan = ");
           dian07111_pil= dian07111_input.nextInt();
           switch(dian07111_pil){
               case 1:
                    dian07111_Daftar();
                    break;
               case 2:
                   System.out.println("No Identitas = ");
                   String dian07111_id = dian07111_input.next();
                   System.out.println("Password = ");
                   String dian07111_password = dian07111_input.next();
                   dian07111_Login(dian07111_id,dian07111_password);
           }
        }while(dian07111_pil != 3);
    }
    
    static void dian07111_Daftar(){
        System.out.println("Input ID = ");
        String dian07111_id = dian07111_input.next();
        System.out.println("Input Nama = ");
        String dian07111_nama = dian07111_input.next();
        System.out.println("Input Password = ");
        String dian07111_password = dian07111_input.next();
        System.out.println("Input Alamat = ");
        String dian07111_alamat = dian07111_input.next();
        System.out.println("Input No Telepon = ");
        String dian07111_notelp = dian07111_input.next();
        
        dian07111_dataPetugas.add(new Dian07111_PetugasPerpustakaan(dian07111_id,dian07111_nama,dian07111_password,dian07111_alamat,dian07111_notelp));
        System.out.print("Data Petugas Berhasil Di Simpan !!\n");
    }
    
    static void dian07111_Login(String dian07111_id, String dian07111_password){
        boolean dian07111_cekLogin = false;
        int dian07111_i;
        
        for(dian07111_i=0;dian07111_i<dian07111_dataPetugas.size();dian07111_i++){
            //mengecek pass & id
         if(dian07111_id.equals(dian07111_dataPetugas.get(dian07111_i).dian07111_getId()) && dian07111_password.equals(dian07111_dataPetugas.get(dian07111_i).dian07111_getPassword())){
             dian07111_cekLogin = true;
             break;
        }else{
             dian07111_cekLogin = true;
             break;
            }
        }
        
        if(dian07111_cekLogin){
            System.out.println("");
            System.out.println("Hallo "+dian07111_dataPetugas.get(dian07111_i).dian07111_getNama()+" Selamat Datang di Perpustakaan!!");
            Dian07111_MenuBuku();
        }else{
            System.out.print("Maaf Password atau ID SALAH!!");
        }
    }
    
    static void Dian07111_MenuBuku(){
        int dian07111_pilih;
        do{
            System.out.println("");
             System.out.println("===== MENU =====");
             System.out.println("1. Tambah Buku");
             System.out.println("2. Lihat Buku");
             System.out.println("3. Ubah Buku");
             System.out.println("4. Hapus Buku");
             System.out.println("5. Keluar");
             System.out.println("Pilih : ");
             dian07111_pilih = dian07111_input.nextInt();
             
             switch(dian07111_pilih){
                case 1 :
                    Dian07111_TambahBuku();
                    break;
                case 2 : 
                    Dian07111_LihatDataBuku();
                    break;
                case 3 : 
                    Dian07111_UbahBuku();
                    break;
                case 4 : 
                    Dian07111_HapusBuku();
                    break;
                }  
             }while(dian07111_pilih != 5);

    }
    static void Dian07111_TambahBuku(){
        System.out.println("Masukkan Kode Buku :  ");
        String dian07111_KodeBuku = dian07111_input.next();
        
        System.out.println("Masukkan Judul Buku : ");
        String dian07111_JudulBuku = dian07111_input.next();
        
        System.out.println("Masukkan Nama Pengarang : ");
        String dian07111_Pengarang = dian07111_input.next();
        
        System.out.println("Masukkan Tahun Terbit Buku : ");
        String dian07111_TahunTerbit = dian07111_input.next();
        
        dian07111_dataBuku.add(new Dian07111_DataBuku(dian07111_KodeBuku, dian07111_JudulBuku, dian07111_Pengarang, dian07111_TahunTerbit));
        System.out.println("Data Buku Berhasil Disimpan !!\n");
    }
    
    static void Dian07111_LihatDataBuku(){
        if(dian07111_dataBuku.size()>0){
            int dian07111_noUrut = 0;
            for (int i = 0; i < dian07111_dataBuku.size(); i++) {
                dian07111_noUrut++;
                System.out.println("");
                System.out.println("[BUKU " + dian07111_noUrut + "]");
                System.out.println("Kode Buku      : "+dian07111_dataBuku.get(i).dian07111_getKodeBuku());
                System.out.println("Judul Buku     : "+dian07111_dataBuku.get(i).dian07111_getJudul());
                System.out.println("Pengarang Buku : "+dian07111_dataBuku.get(i).dian07111_getPengarang());
                System.out.println("Tahun Terbit   : "+dian07111_dataBuku.get(i).dian07111_getTahunTerbit());
            }
        }else{
            System.out.println("Data Buku Kosong!!");
        }
    }
    static void Dian07111_UbahBuku(){
        if(dian07111_dataBuku.size()>0){
            for (int dian07111_i = 0; dian07111_i < dian07111_dataBuku.size(); dian07111_i++) {
                System.out.println("["+dian07111_i+"] "+dian07111_dataBuku.get(dian07111_i).dian07111_getJudul());
            }
             
            System.out.println("Pilih Index Buku : ");
            int selectIndex = dian07111_input.nextInt();
            
            // Update            
            System.out.println("Masukkan Kode Buku : ");
            String dian07111_KodeBuku = dian07111_input.next();

            System.out.println("Masukkan Judul : ");
            String dian07111_JudulBuku = dian07111_input.next();

            System.out.println("Masukkan Pengarang : ");
            String dian07111_Pengarang = dian07111_input.next();

            System.out.println("Masukkan Tahun Terbit : ");
            String dian07111_TahunTerbit = dian07111_input.next();

            dian07111_dataBuku.set(selectIndex, new Dian07111_DataBuku(dian07111_KodeBuku, dian07111_JudulBuku, dian07111_Pengarang, dian07111_TahunTerbit));
            System.out.println("Data Buku Berhasil Diubah !!\n");
        }else{
            System.out.println("Data Buku Kosong\n");
        }
    }
    static void Dian07111_HapusBuku(){
        if(dian07111_dataBuku.size()>0){
            for (int dian07111_i = 0; dian07111_i < dian07111_dataBuku.size(); dian07111_i++) {
                System.out.println("["+dian07111_i+"] "+dian07111_dataBuku.get(dian07111_i).dian07111_getJudul());
            }
            
            System.out.println("Pilih Index Buku : ");
            int selectIndex = dian07111_input.nextInt();
            
            dian07111_dataBuku.remove(selectIndex);
            System.out.print("Data Buku Berhasil Dihapus !!\n");
        }else{
            System.out.println("Data Buku Kosong\n");
        }
    }
}
