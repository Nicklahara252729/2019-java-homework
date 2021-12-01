/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utsintanmahasiswa;

public class UtsIntanMahasiswa {
    public void Identitas(String nama_penduduk, String tempat_tgl_lahir, String alamat, String nama_orangtua, String pekerjaan, int penghasilan){
        
        System.out.println("Nama Penduduk : " +nama_penduduk); 
        System.out.println("Tempat / Tanggal Lahir : " + tempat_tgl_lahir);
        System. out. println("Alamat Rumah : " + alamat); 
        System. out.println("Nama  Orang Tua : " +nama_orangtua); 
        System. out.println("Penghasilan Bersih Perbulan : Rp. " +penghasilan); 
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        UtsIntanMahasiswa penduduk = new UtsIntanMahasiswa(); 
        penduduk.Identitas("Ruby","Gorontalo / 01 Januari 1990","Jl. Cempaka No. 5 Gorontalo","Wiryana","Wiraswasta",500000);
    }

    

   
    
}
