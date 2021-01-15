package view;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import javax.swing.*;

public class Dian07111_PetugasGUI {
    JFrame LogReg = new JFrame();
    JLabel top;
    JButton btnbuku,btnanggota,btnpeminjaman,btnback,btnpengembalian;
    
    public Dian07111_PetugasGUI(){
        LogReg.setSize(900,700);
        LogReg.setLayout(null);
        LogReg.getContentPane().setBackground(Color.LIGHT_GRAY);
        top = new JLabel("=MENU UTAMA=");
        top.setBounds(270,10,700,40);
        top.setFont(new Font("Times New Roman", Font.BOLD,40));
        LogReg.add(top);
         
        btnbuku = new JButton("Data Buku");
        btnbuku.setBounds(270,150,300,50);
        btnbuku.setBackground(Color.CYAN);
        LogReg.add(btnbuku);
        
        //====== ANGGOTA =========        
        btnanggota = new JButton("Data Anggota");
        btnanggota.setBounds(270,250,300,50);
        btnanggota.setBackground(Color.CYAN);
        LogReg.add(btnanggota);
        
        //====== PEMINJAM =========
        btnpeminjaman = new JButton("Data Peminjaman");
        btnpeminjaman.setBounds(270,350,300,50);
        btnpeminjaman.setBackground(Color.CYAN);
        LogReg.add(btnpeminjaman);
        
        //====== PENGEMBALIAN =======
        btnpengembalian = new JButton("Data Pengembalian");
        btnpengembalian.setBounds(270,450,300,50);
        btnpengembalian.setBackground(Color.CYAN);
        LogReg.add(btnpengembalian);
        
        //===== EXIT =====
        btnback = new JButton("EXIT");
        btnback.setBounds(30, 600, 100, 30);
        btnback.setBackground(Color.red);
        LogReg.add(btnback);
        
        LogReg.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        LogReg.setVisible(true);
        LogReg.setLocationRelativeTo(null);
        
        btnback.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                LogReg.dispose();
                Dian07111_GUILogin gui = new Dian07111_GUILogin();
            }
        });
        btnbuku.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Dian07111_BukuGUI bukugui = new Dian07111_BukuGUI();
            }
        });
        
        btnanggota.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Dian07111_AnggotaGUI anggotagui = new Dian07111_AnggotaGUI();
            }
        });
        
    }
}
