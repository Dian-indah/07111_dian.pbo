package PakageMain;

import Entity.*;
import Model.*;
import java.util.Scanner;

public class Dian07111_Main {
    private Scanner input = new Scanner(System.in);
    Dian07111_PetugasModel petugas = new Dian07111_PetugasModel();
    Dian07111_BukuModel buku = new Dian07111_BukuModel();
    
    public static void main(String args[]) {
        Scanner input1 = new Scanner(System.in);
        Dian07111_Main main = new Dian07111_Main();
        System.out.println("  SELAMAT DATANG DI PERPUSTAKAAN !! ");
        int pilih;
        do{
            System.out.println("");
           System.out.println("----- MENU -----");
           System.out.println("1. Daftar Petugas");
           System.out.println("2. Login");
           System.out.println("3. Exit");
           System.out.println("Pilihan = ");
           pilih= input1.nextInt();
           switch(pilih){
               case 1:
                    main.daftarPetugas();
                    break;
               case 2:
                   System.out.println("No Identitas = ");
                   String id = input1.next();
                   System.out.println("Password = ");
                   String password = input1.next();
                   main.login(id,password);
           }
        }while(pilih != 3);
    }
    
    void daftarPetugas(){
        System.out.println("Input ID = ");
        String no_id = input.next();
        System.out.println("Input Nama = ");
        String nama = input.next();
        System.out.println("Input Password = ");
        String password = input.next();
        System.out.println("Input Alamat = ");
        String alamat = input.next();
        System.out.println("Input No Telepon = ");
        String notelp = input.next();
        
        petugas.insert(new Dian07111_Petugas(no_id,nama,alamat,password));
        System.out.print("Data Petugas Berhasil Di Simpan !!\n");
           }
    
    void login(String id, String password){
        boolean cekLogin = false;
        int i;
        for(i=0;i<petugas.DataPetugas.size();i++){
            //mengecek pass & id
         if(id.equals(petugas.DataPetugas.get(i).getNo_id()) && 
                 password.equals(petugas.DataPetugas.get(i).getPassword())){
             cekLogin = true;
             break;
        }else{
             cekLogin = false;
            }
        }
        
        if(cekLogin){
            System.out.println("");
            System.out.println("Hallo "+petugas.DataPetugas.get(i).getNama()+
                    " Selamat Datang di Perpustakaan!!");
            menuBuku();
        }else{
            System.out.print("Maaf Password atau ID SALAH!!");
        }
    }
    
    void menuBuku(){
       int pilihan;
           do{
               System.out.println("");
                System.out.println("===== MENU =====");
                System.out.println("1. Tambah Buku");
                System.out.println("2. Lihat Buku");
                System.out.println("3. Ubah Buku");
                System.out.println("4. Hapus Buku");
                System.out.println("5. Keluar");
                System.out.println("Pilih : ");
                pilihan = input.nextInt();

                switch(pilihan){
                   case 1 :
                           insert();
                       break;
                   case 2 : 
                           view();
                       break;
                   case 3 : 
                           update();
                       break;
                   case 4 : 
                           delete();
                       break;
                   }  
                }while(pilihan != 5); 
    }
    public void view(){
        if(buku.getDataBuku().size()>0){
            int dian07111_noUrut = 0;
            for (int i = 0; i < buku.getDataBuku().size(); i++) {
                dian07111_noUrut++;
                System.out.println("");
                System.out.println("[BUKU " + dian07111_noUrut + "]");
                System.out.println("Kode Buku      : "+buku.getDataBuku().get(i).getKodeBuku());
                System.out.println("Judul Buku     : "+buku.getDataBuku().get(i).getJudul());
                System.out.println("Pengarang Buku : "+buku.getDataBuku().get(i).getPengarang());
                System.out.println("Tahun Terbit   : "+buku.getDataBuku().get(i).getTahunTerbit());
                System.out.println("Jumlah Stok    : "+buku.getDataBuku().get(i).getJumlah());
            }
        }else{
            System.out.println("Data Buku Kosong!!");
        }
    }
    public void insert() {
        
       System.out.println("Masukkan Kode Buku :  ");
        String KodeBuku = input.next();
        
        System.out.println("Masukkan Judul Buku : ");
        String JudulBuku = input.next();
        
        System.out.println("Masukkan Nama Pengarang : ");
        String Pengarang = input.next();
        
        System.out.println("Masukkan Tahun Terbit Buku : ");
        String TahunTerbit = input.next();
        
        System.out.println("Jumlah Buku : ");
        int Jumlah = input.nextInt();
        
        buku.insert(new Dian07111_Buku(KodeBuku,JudulBuku, Pengarang, TahunTerbit, Jumlah));
        System.out.println("Data Buku Berhasil Disimpan !!\n");
    }

    public void update() {
        if(buku.getDataBuku().size()>0){
            for (int dian07111_i = 0; dian07111_i < buku.getDataBuku().size(); dian07111_i++) {
                System.out.println("["+dian07111_i+"] "+buku.getDataBuku().get(dian07111_i).getJudul());
            }
             
            System.out.println("Pilih Index Buku : ");
            int selectIndex = input.nextInt();
            
            // Update            
            System.out.println("Masukkan Kode Buku : ");
            String KodeBuku = input.next();

            System.out.println("Masukkan Judul : ");
            String JudulBuku = input.next();

            System.out.println("Masukkan Pengarang : ");
            String Pengarang = input.next();

            System.out.println("Masukkan Tahun Terbit : ");
            String TahunTerbit = input.next();
            
            System.out.println("Jumlah Buku : ");
            int Jumlah = input.nextInt();

            buku.update(selectIndex, new Dian07111_Buku(KodeBuku, JudulBuku,
                    Pengarang, TahunTerbit, Jumlah));
            System.out.println("Data Buku Berhasil Diubah !!\n");
        }else{
            System.out.println("Data Buku Kosong\n");
        }
    }

    public void delete() {
        if(buku.getDataBuku().size()>0){
            for (int dian07111_i = 0; dian07111_i < buku.getDataBuku().size(); dian07111_i++) {
                System.out.println("["+dian07111_i+"] "+buku.getDataBuku().get(dian07111_i).getJudul());
            }
            
            System.out.println("Pilih Index Buku : ");
            int selectIndex = input.nextInt();
            
            buku.getDataBuku().remove(selectIndex);
            System.out.print("Data Buku Berhasil Dihapus !!\n");
        }else{
            System.out.println("Data Buku Kosong\n");
        }
    }
}
