/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kelas;

public class ClassTaskTwo {
    
    public Object tampil(String txtnama1, String txtnpm1, String txtlahir1, String txtalamat1, String txtnohp1, String pilih) {
        String isi;
        isi = "Nama : "+txtnama1+"\n"+
               "NPM : "+txtnpm1+"\n"+
               "Tempat / Tanggal Lahir : "+txtlahir1+"\n"+
                "Jenis kelamin : "+pilih+"\n"+
                "Alamat : "+txtalamat1+"\n"+
                "No HP : "+txtnohp1;
        return isi;
        
    }

    public String combo(int jComboBox11) {
        String pilihan = null;
        switch (jComboBox11) {
            case 0:
                pilihan = "laki - laki";
            break;
            case 1:
                pilihan = "perempuan";
            break;
        }
        return pilihan;
    }
    
}
