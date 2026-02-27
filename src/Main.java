import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {



        Scanner teclado = new Scanner((System.in));

        List<Mascota> lstList = new ArrayList<>();
        System.out.println("EL TAMANNIO DE LA LISTA ES:" + lstList.size());

        System.out.println(lstList.toString());





    //menu interaccion

        int op;
        do {

            System.out.println("1. CREAR OBJETO");
            System.out.println("2. MOSTRAR LA LISTA");
            System.out.println("3. BUSCAR MASCOTA");
            System.out.println("SELECCIONA UN OPCION");
            op = teclado.nextInt();
            switch (op){

                case 1:
                    System.out.println("1. CREAR OBJETO");

                    System.out.println("INGRESE EL NOMBRE DE LA MASCOTA");
                    String nombre = teclado.next();

                    System.out.println("INGRESE LA ESPECIE DE LA MASCOTA");
                    String especie = teclado.next();

                    System.out.println("INGRESE LA EDAD DE LA MASCOTA");
                    int edad = teclado.nextInt();

                    System.out.println("INGRESE EL PESO DE LA MASCOTA");
                    double peso = teclado.nextDouble();

                    System.out.println("INGRESE TRUE SI LA MASCOTA ESTA SALUDABLE O FALSE SI NO ");
                    boolean saludable = teclado.nextBoolean();

                    Mascota p1 = new Mascota(nombre, especie, edad, peso, saludable);
                    lstList.add(p1);

                    break;

                case 2:
                    for (Mascota p : lstList){

                        System.out.println(p);

                    }
                    break;

                case 3:
                    String mascota1;
                    System.out.println("INGRESE EL NOMBRE DE LA MASCOTA");
                    mascota1 = teclado.next();

                    if (lstList.isEmpty()) {

                        System.out.println("SU MASCOTA NO EXISTE");

                    }

                    Mascota m1 = null;

                    for (Mascota p: lstList){
                        if (p.getNombre().equalsIgnoreCase(mascota1)){
                            m1 = p;
                            System.out.println(m1.toString());

                        }


                    }


            }






        } while (op !=3);



    }
}