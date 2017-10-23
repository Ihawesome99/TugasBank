/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data.isian.laundry;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

/**
 *
 * @author IRFANHI_
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label label;
    @FXML
    private Label nama;
    @FXML
    private Label alamat;
    @FXML
    private Label berat;
    @FXML
    private Label nomor;
    @FXML
    private Label paket;
    @FXML
    private TextField edit_nama;
    @FXML
    private TextField edit_alamat;
    @FXML
    private TextField edit_berat;
    @FXML
    private TextField edit_nomor;
    @FXML
    private RadioButton pkt1;
    @FXML
    private RadioButton pkt2;
    @FXML
    private RadioButton pkt3;
    @FXML
    private Label tanggal;
    @FXML
    private TextField edit_tanggal;
    @FXML
    private Button oke;
    @FXML
    private Button hapus;
    @FXML
    private TextArea hasil;
    
  
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void proses(ActionEvent event) {
        String nama = edit_nama.getText();
        String alamat = edit_alamat.getText();    
        String berat = edit_berat.getText();
        int nomor = Integer.parseInt(edit_nomor.getText());
        
             String Paket = "";        
        if (pkt1.isSelected())
            Paket = "Cuci Kering";
        else if (pkt2.isSelected())
            Paket = "Cuci Kering Setrika";
        else if (pkt3.isSelected())
            Paket = "Setrika";
        else
            Paket = "";
        String tanggal = edit_tanggal.getText();
        
        int harga = 0;
        int hitung = Integer.parseInt(edit_berat.getText());
        if(pkt1.isSelected());
            harga = hitung*5000;
        if(pkt2.isSelected());
            harga = hitung*8000;
        if(pkt3.isSelected());
            harga = hitung*4000;
            
        hasil.setText("Nama Pelanggan : "+nama+"\nAlamat Pelanggan : "+alamat+"\nBerat Cucian : "+berat+"\nNomor Telepon : "+nomor+
                "\nPilihan Paket Laundry : "+Paket+"\nTanggal Pengembalian : "+tanggal+"\nHarga: RP."+harga );
        
        

        
    }
    

    @FXML
    private void hapus(ActionEvent event) {
        
        hasil.setText("");
        edit_nama.setText("");
        edit_alamat.setText("");
        edit_berat.setText("");
        edit_nomor.setText("");
        pkt1.setSelected(false);
        pkt2.setSelected(false);
        pkt3.setSelected(false);
        edit_tanggal.setText("");
    }
    
}
