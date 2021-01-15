package view;

import Controller.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Date;
import javax.swing.*;

public class Dian07111_AnggotaGUI {
    private static Dian07111_AnggotaController anggota_c = new Dian07111_AnggotaController();
    JFrame Anggota = new JFrame();
    JLabel top,labelid,labelnama,labelalamat,labelnotelp,labelidanggota;
    JTextField textid,textnama,textalamat,textnotelp,hapustext;
    JButton btnhapus,btnback,btntambahanggota; 
    JTable tabelanggota = new JTable();
    JScrollPane scrolanggota = new JScrollPane(tabelanggota);
    int index;
     
    public Dian07111_AnggotaGUI(){
        
        Anggota.setSize(900,700);
        Anggota.setLayout(null);
        Anggota.getContentPane().setBackground(Color.LIGHT_GRAY);
        top = new JLabel("DATA ANGGOTA");
        top.setBounds(130,10,600,50);
        top.setFont(new Font("Times New Roman", Font.BOLD,40));
        Anggota.add(top);
        
        // == TABEL ==
        scrolanggota.setBounds(300,180,570,270);
        tabelanggota.setModel(anggota_c.listanggota());
        Anggota.add(scrolanggota);
        
        labelid = new JLabel("ID Anggota");
        labelid.setBounds(30,150,100,30);
        Anggota.add(labelid);
        
        textid = new JTextField();
        textid.setBounds(30,180,200,30);
        Anggota.add(textid);
                
        labelnama = new JLabel("Nama");
        labelnama.setBounds(30,210,100,30);
        Anggota.add(labelnama);
        
        textnama = new JTextField();
        textnama.setBounds(30,240,200,30);
        Anggota.add(textnama);
        
        labelalamat = new JLabel("Alamat");
        labelalamat.setBounds(30,270,100,30);
        Anggota.add(labelalamat);
        
        textalamat = new JTextField();
        textalamat.setBounds(30,300,200,30);
        Anggota.add(textalamat);
        
        labelnotelp = new JLabel("No Telepon");
        labelnotelp.setBounds(30,330,200,30);
        Anggota.add(labelnotelp);
        
        textnotelp = new JTextField();
        textnotelp.setBounds(30,360,200,30);
        Anggota.add(textnotelp);
        
        btntambahanggota = new JButton("Tambah Anggota");
        btntambahanggota.setBounds(30,420,200,30);
        Anggota.add(btntambahanggota);
        
        btnhapus = new JButton("Hapus Anggota");
        btnhapus.setBounds(50,460,150,30);
        Anggota.add(btnhapus);
                               
        btnback = new JButton("back");
        btnback.setBounds(30, 570, 100, 30);
        btnback.setBackground(Color.red);
        Anggota.add(btnback);
               
        Anggota.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Anggota.setVisible(true);
        Anggota.setLocationRelativeTo(null);
        
        btnback.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Anggota.dispose();
                Dian07111_PetugasGUI petugas = new Dian07111_PetugasGUI();
            }
        });
        btntambahanggota.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                  try{
                      String id = textid.getText();
                      String nama = textnama.getText();
                      String alamat = textalamat.getText();
                      String notelp = textnotelp.getText();
                      Dian07111_allobjcontroller.anggota.insert(id, nama, alamat, notelp);
                      tabelanggota.setModel(Dian07111_allobjcontroller.anggota.listanggota());
                      JOptionPane.showMessageDialog(null,"Input Anggota Sukses","Information", JOptionPane.INFORMATION_MESSAGE);
                    reset();
                  }catch(Exception exception){
                  JOptionPane.showMessageDialog(null,"Fomat penulisan salah","Information", JOptionPane.INFORMATION_MESSAGE);
                }  
            }
        });
        tabelanggota.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int i = tabelanggota.getSelectedRow();
                index=i;
                textid.setText(Dian07111_allobjcontroller.anggota.listanggota().getValueAt(i, 0).toString());
                textnama.setText(Dian07111_allobjcontroller.anggota.listanggota().getValueAt(i, 1).toString());
                textalamat.setText(Dian07111_allobjcontroller.anggota.listanggota().getValueAt(i, 2).toString());
                textnotelp.setText(Dian07111_allobjcontroller.anggota.listanggota().getValueAt(i, 3).toString());
            }            
        });
                
        btnhapus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    
                    Dian07111_allobjcontroller.anggota.delete(index);
                    JOptionPane.showMessageDialog(null,"Hapus Anggota Sukses","Information", JOptionPane.INFORMATION_MESSAGE);
                    tabelanggota.setModel(Dian07111_allobjcontroller.anggota.listanggota());
                    reset();
                }catch(Exception exception){
                    JOptionPane.showMessageDialog(null,"Fomat penulisan salah","Information", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });
    }
    void reset(){
        textid.setText(null);
        textnama.setText(null);
        textalamat.setText(null);
        textnotelp.setText(null);
    }
}
