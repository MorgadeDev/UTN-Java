import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        System.out.println("Ingrese ejercicio: ");
        Scanner teclado = new Scanner(System.in);
        int op=teclado.nextInt();

        switch(op)
        {
            case 1:
                Cilindro cilix = new Cilindro();

                System.out.println(cilix.imprimirCilindro());

                Cilindro ci2 = new Cilindro(10,4,"Violeta");

                System.out.println(ci2.imprimirCilindro());

                System.out.println("El resultado del area del cilindro 2 es: "+ ci2.calcularArea());

            case 2:

                Persona eUno = new Estudiante(2019,15000,"Ing.Informatica","Wizard",44242233,"XI","Indep 4320","carlitos@unmdp.com");
                Persona eDos = new Estudiante(2020,19000,"Tenico superior en Papas","Jefferson",45423447,"Airplane","Verduleria","tuverdurita@peru.com");
                Persona eTres = new Estudiante(2021,20000,"Prof.Matematicas","Tomas",27898765,"Rosas","Villa 11/14","tomi11@unmdp.com");
                Persona eCuatri = new Estudiante(2022,25000,"Veterinario","Male",14253201,"Vridi","UTN","male7engache@unmdp.com");


                Persona sUno = new Staff(100000,"M","Juan",20330318,"Carlos","Av.Colon 2210","juanPortero@gmail.com");
                Persona sDos = new Staff(100000,"T","Tomas",19453729,"Chuti","Dorrego 1723","tomaschuti@gmail.com");
                Persona sTres = new Staff(150000,"M","Martina",18293812,"Melaso","Alberti 5612","martinamelaso@gmail.com");
                Persona sCuatro = new Staff(150000,"T","Fernando",21203012,"Di Marco","Almafuerte 4123","fernandoDimarco@gmail.com");


                System.out.println(eUno);

                Persona[] arrePersonal;
                arrePersonal = new Persona[8];

                arrePersonal[0]=eUno;
                arrePersonal[1]=eDos;
                arrePersonal[2]=eTres;
                arrePersonal[3]=eCuatri;
                arrePersonal[4]=sUno;
                arrePersonal[5]=sDos;
                arrePersonal[6]=sTres;
                arrePersonal[7]=sCuatro;

                ///String prueba ="jorge";
                ///boolean resu= prueba instanceof String;

                ///System.out.println("EL resutado del instanceof es: "+resu);
                System.out.println();

                int mStaff=0;
                int mEstudiantes=0;
                int ingresoTotal=0;

                ///Ejemplo de for earch
                /*for(Persona arreglo: arrePersonal)
                {
                    boolean resu1= arreglo instanceof Staff;
                    if(resu1)
                    {
                        mStaff=mStaff+1;
                    }else {
                        ingresoTotal=ingresoTotal+arreglo;
                        mEstudiantes=mEstudiantes+1;
                    }
                    System.out.println(arreglo.nombre +"->"+arreglo.apellido);

                }
                 */

                for(int i=0;i<8;i++)
                {
                    if( arrePersonal[i] instanceof Staff)
                    {
                        mStaff=mStaff+1;
                    }else {
                        ingresoTotal+=((Estudiante)arrePersonal[i]).getCuota();
                        mEstudiantes=mEstudiantes+1;
                    }

                }

                System.out.println("Tenemos: "+mStaff+" miembros del staff y "+mEstudiantes+" estudiantes");

                System.out.println("La cantidad de dinero total es: "+ingresoTotal);

                break;
            default:
                throw new IllegalStateException("Unexpected value: " + op);
        }



    }
}