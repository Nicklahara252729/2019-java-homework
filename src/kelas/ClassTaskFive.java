/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kelas;

public class ClassTaskFive {

    public Object tampil(int tinggi1, int jari1) {
        double Volume, Alas, Tutup, Selimut, Luas;
        String show ;
        Volume = 3.14 * jari1 * jari1 * tinggi1;
        Alas = 3.14 * jari1 * jari1;
        Tutup = 3.14 * jari1 * jari1;
        Selimut = 2 * 3.14 * jari1 * tinggi1;
        Luas = ((2) * ( 3.14 * jari1 * jari1)) + (2*3.14 * jari1 * tinggi1);
        show = "Volume : "+Volume+"\n"+
               "Alas : "+Alas+"\n"+
               "Tutup : "+Tutup+"\n"+
                "Selimut : "+Selimut+"\n"+
                "Luas : "+Luas+"\n";
        return show;
    }
    
}
