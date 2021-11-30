/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kelas;

public class ClassTaskSeven {

    public Object tampil(int uas1, int uts1) {
        String huruf = null;
        int hitung = (int) ((0.4 * uts1) + (0.6 * uas1));
        if(hitung >= 80){
            huruf="Grade A dengan nilai "+hitung;
        }else if(hitung >= 70){
            huruf="Grade B dengan nilai "+hitung;
        }else if(hitung >= 50){
            huruf="Grade C dengan nilai "+hitung;
        }else{
            huruf="Grade D dengan nilai "+hitung;
        }
        return huruf;
    }
    
}
