import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner ningresado = new Scanner(System.in);
        Mascota objMascotan1 = new Mascota();
        objMascotan1.crearMascota("Wanda", "Xoloitzcuintli", 5, 5.5,  true);
        Mascota objMascotan2 = new Mascota();
        objMascotan2.crearMascota("Ronnie", "Xoloitzcuintli", 3, 3.5, true);


        while (true){
            System.out.println("Menu / Modificar");
            System.out.println("1. Edad ");
            System.out.println("2. Peso");
            System.out.println("3. Estado de salud");
            System.out.println("4. Informacion");
            System.out.println("Ingresa el numero segun la accion deseada");
            int opcion = ningresado.nextInt();

            switch (opcion){

                case 1:
                    System.out.println("----CAMBIO DE EDAD");
                    System.out.println("elige el perro");
                    int opcionedadperro = ningresado.nextInt();
                    switch (opcionedadperro){
                        case 1:
                            System.out.println("edad actual: " + objMascotan1.getEdad());
                            System.out.println("ingresa cuantos años deseas sumarle al perro");
                            int nuevaEdadPerro = ningresado.nextInt();
                            objMascotan1.setEdad(objMascotan1.getEdad() + nuevaEdadPerro);
                            System.out.println("---Actualizado---");
                            System.out.println("edad actual: " + objMascotan1.getEdad());
                            System.out.println("ingresa cualquier numero para volver al menu");
                            ningresado.nextInt();
                            break;
                        case 2:
                            System.out.println("ingresa la nueva edad del perro");
                            int nuevaEdadPerro2 = ningresado.nextInt();
                            objMascotan2.setEdad(objMascotan2.getEdad() - nuevaEdadPerro2);
                            System.out.println("---Actualizado---");
                            System.out.println("ingresa cualquier numero para volver al menu");
                            int saltar = ningresado.nextInt();
                            break;

                    }

                case 2:
                    System.out.println("----CAMBIO DE PESO   ");
                    System.out.println("elige el perro");
                    int opcionpesoperro = ningresado.nextInt();
                    switch (opcionpesoperro){
                        case 1:
                            System.out.println("ingresa el nuevo peso del perro");
                            int nuevoPesoPerro = ningresado.nextInt();
                            objMascotan1.setEdad(objMascotan1.getEdad() - nuevoPesoPerro);
                            System.out.println("---Actualizado---");
                            System.out.println("ingresa cualquier numero para volver al menu");
                            ningresado.nextInt();
                            break;
                        case 2:
                            System.out.println("ingresa nuevo peso del perro");
                            int nuevaEdadPerro2 = ningresado.nextInt();
                            objMascotan2.setEdad(objMascotan2.getEdad() - nuevaEdadPerro2);
                            System.out.println("---Actualizado---");
                            System.out.println("ingresa cualquier numero para volver al menu");
                            ningresado.nextInt();
                            break;














                    }



            }





        }














    }
}