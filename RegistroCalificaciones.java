import java.util.*;

public class RegistroCalificaciones{

	public static void main(String args[]){
        String opcion="", nummat="";
        Alumno a1 = new Alumno();
	    do{
            System.out.println("\n\t.: Menu :.\n1.Capturar Datos del Alumno\n2.Mostrar Datos del Alumno\n3.Capturar Calificaciones\n4.Calcular Promedio\n5.Ver Calificacion mas Alta\n6.Ver Calificacion mas Baja\n0.Salir");
            do{
                opcion = CapturaEntrada.capturarCadena("Opcion");
            }while(!Validacion.validarNumero(opcion));

            if(Integer.parseInt(opcion)>6)
                System.out.println("\nIntroduzca una opcion numerica entre 0 y 6");

            switch(Integer.parseInt(opcion)){
            case 1:
                System.out.println("\n");
                a1.setNombre( CapturaEntrada.capturarCadena("Nombre") );
                a1.setMatricula( CapturaEntrada.capturarCadena("Matricula") );
                a1.setCorreo( CapturaEntrada.capturarCadena("Correo") );
                break;
            case 2:
                System.out.println("\nEstudiante "+a1.getNombre()+" ("+a1.getMatricula()+")\nContacto al "+a1.getCorreo());
                break;
            case 3:
                System.out.println("\n");
                do{
                    nummat = CapturaEntrada.capturarCadena("Numero de Materias a Capturar");
                }while(!Validacion.validarNumero(nummat));
                a1.setCalificaciones(Integer.parseInt(nummat));
                break;
            case 4:
                System.out.println("\n");
                a1.getCalificaciones();
                a1.setPromedio( OperacionCalificaciones.calcularPromedio(a1) );
                System.out.println("Promedio de Calificaciones: " + a1.getPromedio());
                break;
            case 5:
                System.out.println("\n");
                a1.getCalificaciones();
                System.out.println("Calificacion Mayor: " + OperacionCalificaciones.calcularCalificacionMayor(a1));
                break;
            case 6:
                System.out.println("\n");
                a1.getCalificaciones();
                System.out.println("Calificacion Menor: " + OperacionCalificaciones.calcularCalificacionMenor(a1));
                break;
            }
	    }while(Integer.parseInt(opcion)!=0);
	}
}
