/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moduleuts;

/**
 *
 * @author dell
 */
public class CPU  {

    private final String nama;
    private final int kecepatan;

    CPU(String nama, int kecepatan) {
        this.nama = nama;
        this.kecepatan = kecepatan;
    }

    public String getCPUData() {
        return nama + " " + kecepatan + "GHz";
    }
}
