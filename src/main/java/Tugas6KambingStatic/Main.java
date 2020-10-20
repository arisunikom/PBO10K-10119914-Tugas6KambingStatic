/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas6KambingStatic;

/**
 *
 * @author Aris Prabowo
 * IF10K
 * 10119914
 */

public class Main {

    /**
     * @param args the command line arguments
     */
    public static final String NAMA_KAMBING = "Midun";
    
    public static void main(String[] args) {
        // TODO code application logic here
        Mamalia.jumlahKambing = 485000;
        System.out.println(NAMA_KAMBING + " memiliki kambing sebanyak : " + Mamalia.jumlahKambing);
    }
    
}
