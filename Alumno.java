public class Alumno {
 String nombre, matricula, correo;
 Calificaciones califs[];
 float promedio;

	public void setNombre(String nom){
	  nombre = nom;
	}

	public void setCorreo(String cor){
	  correo = cor;
	}

	public void setMatricula(String mat){
	  matricula = mat;
	}

	public void setPromedio(float prom){
	  promedio = prom;
	}

	public void setCalificaciones(int nummat){
	  califs = new Calificaciones[nummat];

	  for (int i = 0; i < nummat; i++){
		  califs[i] = new Calificaciones();
		  califs[i].materia = CapturaEntrada.capturarCadena("Nombre de materia");
		  califs[i].calificacion = CapturaEntrada.capturarEntero("Calificacion");
	  }
	}

	public String getNombre(){
	  return nombre;
	}

	public String getCorreo(){
	  return correo;
	}

	public String getMatricula(){
	  return matricula;
	}

	public float getPromedio(){
	  return promedio;
	}

	public void getCalificaciones(){
        for (int i = 0; i < califs.length; i++){
		  System.out.println(califs[i].getCalificacion()+"\t"+califs[i].getMateria());
	  }
	}

}
