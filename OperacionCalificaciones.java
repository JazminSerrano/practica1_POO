public class OperacionCalificaciones{

    public static float calcularPromedio(Alumno a1){
        float suma=0;
        for(int i=0; i<a1.califs.length; i++)
            suma += a1.califs[i].calificacion;
        return (suma / a1.califs.length);
    }

    public static float calcularCalificacionMayor(Alumno a1){
        float mayor=0;
        for(int i=0; i<a1.califs.length; i++){
            if (a1.califs[i].calificacion>mayor)
                mayor = a1.califs[i].calificacion;
        }
        return mayor;
    }

    public static float calcularCalificacionMenor(Alumno a1){
        float menor=100;
        for(int i=0; i<a1.califs.length; i++){
            if (a1.califs[i].calificacion<menor)
                menor = a1.califs[i].calificacion;
        }
        return menor;
    }
}

