/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kelas;

public class ClassTaskFour {
    public String combo(int jComboBox11) {
        String pilihan = null;
        switch (jComboBox11) {
            case 0:
                pilihan = "7500000";
            break;
            case 1:
                pilihan = "5000000";
            break;
            case 2:
                pilihan = "3000000";
            break;
            case 3:
                pilihan = "2000000";
            break;
            case 4:
                pilihan = "1200000";
            break;
            case 5:
                pilihan = "750000";
            break;
        }
        return pilihan;
    }

    public int tanak(int gajipokok, int jumlahanak) {
        int tunjangananak;
        if(jumlahanak <= 2) {
                tunjangananak= ((15*gajipokok)/100) * jumlahanak;
            }else if(jumlahanak > 2){
                tunjangananak= ((15*gajipokok)/100) * 2;
            }else{
                tunjangananak=0;
            }
        return tunjangananak;
    }

    public Object tistri(int gajipokok) {
        int tunjanganistri=(20*gajipokok)/100;
        return tunjanganistri;
    }
}
