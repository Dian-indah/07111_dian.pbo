package view;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import Controller.*;
import Entity.Dian07111_JenisAnggota;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.table.DefaultTableModel;
import java.text.SimpleDateFormat;  
import java.util.Calendar;
import java.util.Date; 
/**
 *
 * @author dian
 */
public class Dian07111_PeminjamanGUI {
    private static Dian07111_PeminjamanController peminjaman_c = new Dian07111_PeminjamanController();
    private static Dian07111_JenisAnggota jenisanggota = new Dian07111_JenisAnggota();
    private static String [] statusPeminjaman = {"Belum Dikembalikan", "Dikembalikan"};
    
    JFrame Peminjaman = new JFrame();
    JLabel top,labelidpeminjam,labelidbuku;
    JTable tabelpeminjaman = new JTable();
    JScrollPane scrolpeminjaman = new JScrollPane();
    JButton btnback;
    
    public Dian07111_PeminjamanGUI(){
        Peminjaman.setSize(900,700);
        Peminjaman.setLayout(null);
        Peminjaman.getContentPane().setBackground(Color.LIGHT_GRAY);
        top = new JLabel("DATA PEMINJAMAN");
        top.setBounds(130,10,600,50);
        top.setFont(new Font("Times New Roman", Font.BOLD,40));
        Peminjaman.add(top);
            
        scrolpeminjaman.setBounds(100,180,650,270);
        tabelpeminjaman.setModel(peminjaman_c.listpinjaman());
        Peminjaman.add(scrolpeminjaman);
        
        labelidpeminjam = new JLabel();
        labelidpeminjam.setBounds(30,250,100,30);
        Peminjaman.add(labelidpeminjam);
        
        btnback = new JButton("back");
        btnback.setBounds(30, 600, 100, 30);
        btnback.setBackground(Color.red);
        Peminjaman.add(btnback);
               
        Peminjaman.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Peminjaman.setVisible(true);
        Peminjaman.setLocationRelativeTo(null);
        
        btnback.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Peminjaman.dispose();
                Dian07111_PetugasGUI petugas = new Dian07111_PetugasGUI();
            }
        });
    }
}
