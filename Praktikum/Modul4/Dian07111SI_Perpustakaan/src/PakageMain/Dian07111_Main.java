package PakageMain;

import Entity.*;
import Controller.*;
import java.util.Scanner;

import view.*;

public class Dian07111_Main {
//    Scanner input = new Scanner(System.in);
//    public Dian07111_AnggotaController anggota = new Dian07111_AnggotaController();
//    public Dian07111_BukuController buku = new Dian07111_BukuController();
//    public Dian07111_PetugasController petugas = new Dian07111_PetugasController();
    
    public static void main(String args[]) {
        //Dian07111_GUILogin main = new Dian07111_GUILogin();
        Dian07111_PeminjamanGUI peminjam = new Dian07111_PeminjamanGUI();
        
    }
//        Scanner input1 = new Scanner(System.in);
//        Dian07111_Main main = new Dian07111_Main();
//        main.petugas.dataPetugas();
//        System.out.println("SELAMAT DATANG DI PERPUSTAKAAN !! ");
//        
//        int pil;
//        do{
//            System.out.println("\n"
//            +"1. Login petugas"+"\n"
//            +"0. Exit"+"\n"
//            +"Pilih : ");
//            pil = input1.nextInt();
//        
//            switch(pil){
//                case 1:
//                    
//                System.out.print("No.Id Petugas = ");
//                String id = input1.next();
//                System.out.print("Password = ");
//                String password = input1.next();
//                main.login(id,password); 
//            }
//            
//        }while(pil != 0);
//    }
//   
//    void login(String id, String password){
//        boolean cekLogin = false;
//        int i;
//        for(i=0;i<petugas.petugas_m.getDataPetugas().size();i++){
//            //mengecek pass & id
//         try{
//         if(id.equals(petugas.petugas_m.getDataPetugas().get(i).getNo_id()) && 
//                 password.equals(petugas.petugas_m.getDataPetugas().get(i).getPassword())){
//             cekLogin = true;
//             break;
//         }
//         }catch(Exception e){
//             cekLogin = false;
//        }  
//    }
//        
//        if(cekLogin){
//            System.out.println("\n"+"Hallo "+petugas.petugas_m.getDataPetugas().get(i).
//                    getNama()+" Selamat Datang di Perpustakaan!!");
//            menuUtama();
//        }else{
//            System.out.println("Maaf Password atau ID SALAH!!");
//        }
//    }
//    //======================= MENU UTAMA =======================
//    void menuUtama(){
//        int pilih;
//        do{
//            System.out.println("\n"
//            +" == Menu Utama == "+"\n"
//            +"1. Data Buku"+"\n"
//            +"2. Data Anggota"+"\n"
//            +"3. Data Peminjam"+"\n"
//            +"0.Exit"+"\n"
//            +"Pilih : ");
//            pilih = input.nextInt();
//            
//            switch(pilih){
//                case 1:
//                    menuBuku();
//                    break;
//                case 2:
//                    menuAnggota();
//                    break;
//                case 3:
//                    dataPeminjam();
//                    break;
//            }
//        }while(pilih != 0);
//    }
//    
//    //======================= MENU BUKU =======================
//    void menuBuku(){
//       int pilihan;
//           do{
//                System.out.println("\n"
//                +"===== MENU Buku ====="+"\n"
//                +"1. Tambah Buku"+"\n"
//                +"2. Lihat Buku"+"\n"
//                +"3. Ubah Buku"+"\n"
//                +"4. Hapus Buku"+"\n"
//                +"0. Keluar"+"\n"
//                +"Pilih : ");
//                pilihan = input.nextInt();
//
//                switch(pilihan){
//                   case 1 :
//                           insert();
//                       break;
//                   case 2 : 
//                           view();
//                       break;
//                   case 3 : 
//                           update();
//                       break;
//                   case 4 : 
//                           delete();
//                       break;
//                   }  
//                }while(pilihan != 0); 
//    }
//    
//     void view(){
//        if(buku.buku_m.getDataBuku().size()>0){
//            int dian07111_noUrut = 0;
//            for (int i = 0; i < buku.buku_m.getDataBuku().size(); i++) {
//                dian07111_noUrut++;
//                System.out.println("\n"
//                +"[BUKU " + dian07111_noUrut + "]"+"\n"
//                +"Kode Buku      : "+buku.buku_m.getDataBuku().get(i).getKodeBuku()+"\n"
//                +"Judul Buku     : "+buku.buku_m.getDataBuku().get(i).getJudul()+"\n"
//                +"Pengarang Buku : "+buku.buku_m.getDataBuku().get(i).getPengarang()+"\n"
//                +"Tahun Terbit   : "+buku.buku_m.getDataBuku().get(i).getTahunTerbit()+"\n"
//                +"Jumlah Stok    : "+buku.buku_m.getDataBuku().get(i).getJumlah());
//            }
//        }else{
//            System.out.println("Data Buku Kosong!!");
//        }
//    }
//     void insert() {
//        
//        System.out.println("Masukkan Kode Buku :  ");
//        String KodeBuku = input.next();
//        
//        System.out.println("Masukkan Judul Buku : ");
//        String JudulBuku = input.next();
//        
//        System.out.println("Masukkan Nama Pengarang : ");
//        String Pengarang = input.next();
//        
//        System.out.println("Masukkan Tahun Terbit Buku : ");
//        String TahunTerbit = input.next();
//        
//        System.out.println("Jumlah Buku : ");
//        int Jumlah = input.nextInt();
//        
//        buku.insert(new Dian07111_Buku(KodeBuku,JudulBuku, Pengarang, TahunTerbit, Jumlah));
//        System.out.println("Data Buku Berhasil Disimpan !!\n");
//    }
//
//     void update() {
//        if(buku.buku_m.getDataBuku().size()>0){
//            for (int dian07111_i = 0; dian07111_i < buku.buku_m.getDataBuku().size(); dian07111_i++) {
//                System.out.println("["+dian07111_i+"] "+buku.buku_m.getDataBuku().get(dian07111_i).getJudul());
//            }
//             
//            System.out.println("Pilih Index Buku : ");
//            int selectIndex = input.nextInt();
//                        
//            System.out.println("Masukkan Kode Buku : ");
//            String KodeBuku = input.next();
//
//            System.out.println("Masukkan Judul : ");
//            String JudulBuku = input.next();
//
//            System.out.println("Masukkan Pengarang : ");
//            String Pengarang = input.next();
//
//            System.out.println("Masukkan Tahun Terbit : ");
//            String TahunTerbit = input.next();
//            
//            System.out.println("Jumlah Buku : ");
//            int Jumlah = input.nextInt();
//
//            buku.update(selectIndex, new Dian07111_Buku(KodeBuku, JudulBuku,
//                    Pengarang, TahunTerbit, Jumlah));
//            System.out.println("Data Buku Berhasil Diubah !!\n");
//        }else{
//            System.out.println("Data Buku Kosong\n");
//        }
//    }
//
//     void delete() {
//        if(buku.buku_m.getDataBuku().size()>0){
//            for (int dian07111_i = 0; dian07111_i < buku.buku_m.getDataBuku().size(); dian07111_i++) {
//                System.out.println("["+dian07111_i+"] "+buku.buku_m.getDataBuku().get(dian07111_i).getJudul());
//            }
//            
//            System.out.println("Pilih Index Buku : ");
//            int selectIndex = input.nextInt();
//            
//            buku.buku_m.getDataBuku().remove(selectIndex);
//            System.out.print("Data Buku Berhasil Dihapus !!\n");
//        }else{
//            System.out.println("Data Buku Kosong\n");
//        }
//    }
//     
//     //======================= MENU ANGGOTA =======================
//    void menuAnggota(){
//        int pilihan;
//        do{
//                System.out.println("");
//                System.out.println("===== MENU Anggota =====");
//                System.out.println("1. Tambah Anggota");
//                System.out.println("2. Lihat Anggota");
//                System.out.println("3. Hapus Anggota");
//                System.out.println("0. Keluar");
//                System.out.println("Pilih : ");
//                pilihan = input.nextInt();
//                switch(pilihan){
//                   case 1 :
//                           insertAnggota();
//                       break;
//                   case 2 : 
//                           viewAnggota();
//                       break;
//                   case 3 : 
//                           deleteAnggota();
//                       break;
//
//                   }  
//        }while(pilihan!=0);
//    }
//    
//    void insertAnggota(){
//   
//        System.out.println("Masukkan No ID :  ");
//        String no_id = input.next();
//        
//        System.out.println("Masukkan Nama : ");
//        String nama = input.next();
//        
//        System.out.println("Masukkan Alamat : ");
//        String alamat = input.next();
//        
//        System.out.println("Masukkan Telepon : ");
//        String no_telp = input.next();
//        
//        anggota.insert(new Dian07111_Anggota(no_id, nama, alamat, no_telp));
//        System.out.println("Data Anggota Berhasil Disimpan !!\n");
//    }
//    
//    void viewAnggota(){
//        if(anggota.anggota_m.getDataAnggota().size()>0){
//            int dian07111_noUrut = 0;
//            for (int i = 0; i < anggota.anggota_m.getDataAnggota().size(); i++) {
//                dian07111_noUrut++;
//                System.out.println("\n"
//                +"[Anggota " + dian07111_noUrut + "]" + "\n"
//                +"No ID      : "+anggota.anggota_m.getDataAnggota().get(i).getNo_id()+ "\n"
//                +"Nama       : "+anggota.anggota_m.getDataAnggota().get(i).getNama()+ "\n"
//                +"Alamat     : "+anggota.anggota_m.getDataAnggota().get(i).getAlamat()+ "\n"
//                +"No Telepon : "+anggota.anggota_m.getDataAnggota().get(i).getNo_Telp());
//            }
//        }else{
//            System.out.println("Data Kosong!!");
//        }
//    }
//    
//    void deleteAnggota(){
//        if(anggota.anggota_m.getDataAnggota().size()>0){
//            for (int dian07111_i = 0; dian07111_i < anggota.anggota_m.getDataAnggota().size(); dian07111_i++) {
//                System.out.println("["+dian07111_i+"] "+anggota.anggota_m.getDataAnggota().get(dian07111_i).getNama());
//            }
//            
//            System.out.println("Pilih Index Nama : ");
//            int selectIndex = input.nextInt();
//            
//            anggota.anggota_m.getDataAnggota().remove(selectIndex);
//            System.out.print("Data Anggota Berhasil Dihapus !!\n");
//        }else{
//            System.out.println("Data Anggota Kosong\n");
//        }
//    }
//    //======================= MENU PEMINJAMAN =======================
//    void dataPeminjam(){
//        int pilihan;
//        do{
//        System.out.println("\n"
//        +"===== MENU PEMINJAMAN ====="+ "\n"
//        +"1. Peminjaman"+ "\n"
//        +"2. List Peminjam"+ "\n"
//        +"0. Keluar"+ "\n"
//        +"Pilih : ");
//        pilihan = input.nextInt();
//        switch(pilihan){
//            case 1 :
//                peminjaman();
//                break;
//            case 2 : 
//                viewPeminjaman();
//                break;
//            }  
//        }while(pilihan!=0);
//    }
//    
//    void peminjaman(){
//        if(anggota.anggota_m.getDataAnggota().size()>0 && buku.buku_m.getDataBuku().size()>0){
//            String KodeAnggota;
//            String KodeBuku;
//            String pilih="";
//            System.out.print("Masukkan kode anggota = ");
//            KodeAnggota = input.next();
//            int indexAnggota = anggota.cekAnggota(KodeAnggota);
//            anggota.cekAnggota(KodeAnggota);
//            if(anggota.cekAnggota(KodeAnggota) == -1){
//                System.out.println("Data Tidak Ada");
//            }else{
//                do{
//                System.out.print("Masukkan kode Buku = ");
//                KodeBuku = input.next();
//                int indexBuku = buku.cekBuku(KodeBuku);
//                
//                if(buku.cekBuku(KodeBuku) == -1){
//                     System.out.print("Kode Tersebut Tidak Ada"+"\n"+
//                     "Memilih kode buku lagi? (y/t)");
//                     pilih = input.next();
//                }
//                else{
//                    System.out.println("\n ***** Data Peminjam ***** ");
//                     System.out.println("Judul Buku : "+buku.showDaftarBuku(indexBuku).getJudul());
//                     //output lengkap
//                     System.out.println("Nama Peminjam : "+anggota.showDaftarAnggota(indexAnggota).getNama());
//                     
//                    }
//                }while(pilih == "y");
//                //if, jika cek kode bku != -1 ==> isi menginputkan tanggan dan jumlah, lalu simpan/tidak
//            }
//        }
//        else{
//           System.out.println("Data Anggota atau Buku Kosong"); 
//        }
//    }
//
//    
//    void viewPeminjaman(){
//        //belum diisi
//    }
}
