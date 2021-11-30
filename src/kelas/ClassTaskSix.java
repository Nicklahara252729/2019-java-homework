/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kelas;

public class ClassTaskSix {

    public Object tampil(int nilai1) {
        String huruf = null;
        if(nilai1 >= 90 && nilai1<= 100){
            huruf="Grade A";
        }else if(nilai1 >= 70 && nilai1<= 89){
            huruf="Grade B";
        }else if(nilai1 >= 60 && nilai1<= 79){
            huruf="Grade C";
        }else if(nilai1 >= 60 && nilai1<= 79){
            huruf="Grade D";
        }else{
            huruf="Grade E";
        }
        return huruf;
    }
    
}
