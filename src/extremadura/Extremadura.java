/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extremadura;

import java.util.ArrayList;

/**
 *
 * @author usuario
 */
public class Extremadura {

    //static Provincia[] provincia=new Provincia[2];
    public static ArrayList<Provincia> provincias = new ArrayList<>();

    public static void rellenarDatos() {

        Provincia p = new Provincia();
        p.setNombre("Badajoz");
        p.setExtension(120000);
        provincias.add(p);

        p = new Provincia();
        p.setNombre("Merida");
        p.setExtension(120000);
        provincias.add(p);

        ArrayList<Localidad> aux1 = new ArrayList<Localidad>();
        ArrayList<Localidad> aux2 = new ArrayList<Localidad>();

        Localidad loc;
        for (int i = 0; i < 250; i++) {
            loc = new Localidad();
            loc.setNombre("Cachorrilla" + i);
            aux1.add(loc);

            loc = new Localidad();
            loc.setNombre("Malpartida" + i);
            aux2.add(loc);
        }
        provincias.get(0).setLocalidades(aux1);
        provincias.get(1).setLocalidades(aux2);
    }

    public static void ejercicio01() {
        //1º) Mostrar nombre de las Provincias
        for (int i = 0; i < provincias.size(); i++) {
            System.out.println(provincias.get(i).getNombre());
        }
    }

    public static void ejercicio02() {
        //2º) Mostrar Localidades
        for (Provincia pr : provincias) {
            for (Localidad loca : pr.getLocalidades()) {
                System.out.println(loca.getNombre());
            }
        }
    }

    public static void main(String[] args) {

        rellenarDatos();
        //ejercicio01();
        //ejercicio02();
    }
}
