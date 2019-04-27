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
public class Komputer {

    private CPU cpu;

    Komputer(CPU cpu) {
        this.cpu = cpu;
    }

    Komputer() {
    }

    public void memasang(CPU cpu) {
        this.cpu = cpu;

        System.out.println("CPU : " + cpu.getCPUData() + "dipasang");
    }

    public void mencabut(CPU cpu) {
        System.out.println("CPU : " + cpu.getCPUData() + "dicabut");
        this.cpu = null;
    }

    public void cetakInfo(CPU cpu) {
        System.out.println("Spesifikasi : " + cpu.getCPUData());
    }
}
