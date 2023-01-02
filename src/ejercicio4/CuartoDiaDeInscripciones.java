package ejercicio4;

import Materiales.Aula;
import Materiales.Computadora;
import Materiales.Escritorio;
import Materiales.Pizarron;
import Materiales.Silla;
import entidades.Alumno;
import entidades.Profesor;
import gestion.Consola;
import gestion.Curso;
import gestion.Instituto;

public class CuartoDiaDeInscripciones {
	
	public void cuartoDiaDeInscripción(Consola consola, Alumno[] listaAlumnos, Escritorio[] listaEscritorios,
			Profesor[] listaProfesores, Pizarron[] listaPizarrones, Silla[] listaSillas, Computadora[] listaComputadoras,Curso ingles, 
			Curso programacion1, Curso disenioGrafico, Curso economia, Curso cienciasPoliticas, Instituto instituto){

		consola.imprimeNumeroDeDiaDeInscripcion(4);
		
		Aula[] listaAulas = instituto.getAulasAsignadas();
		Aula aula2 = listaAulas[1];
		Aula aula3 = listaAulas[2];

		// Materia: Programación I
		// ---------------------------------------------------
		instituto.registrarAlumno(listaAlumnos[15], programacion1);
		instituto.asignarEscritorioAlAula(listaEscritorios[29], aula2);
		instituto.asignarSillaAlAula(listaSillas[66], aula2);
		instituto.asignarComputadoraAlAula(listaComputadoras[9], aula2);

		instituto.registrarAlumno(listaAlumnos[16], programacion1);
		instituto.asignarEscritorioAlAula(listaEscritorios[30], aula2);
		instituto.asignarSillaAlAula(listaSillas[67], aula2);
		instituto.asignarComputadoraAlAula(listaComputadoras[10], aula2);

		// Materia: Economía
		// ---------------------------------------------------
		instituto.registrarAlumno(listaAlumnos[18], economia);
		instituto.asignarSillaAlAula(listaSillas[17], aula3);
	}

	/*
	 * Quinto día de inscripción
	 */
	public void quintoDiaDeInscripcion (Consola consola, Alumno[] listaAlumnos, Escritorio[] listaEscritorios,
	Profesor[] listaProfesores, Pizarron[] listaPizarrones, Silla[] listaSillas, Computadora[] listaComputadoras,Curso ingles, 
	Curso programacion1, Curso disenioGrafico, Curso economia, Curso cienciasPoliticas, Instituto instituto) {
		
		consola.imprimeNumeroDeDiaDeInscripcion(5);
		
		Aula[] listaAulas = instituto.getAulasAsignadas();
		Aula aula1 = listaAulas[0];
		Aula aula3 = listaAulas[2];
		Aula aula4 = listaAulas[3];

		// Materia: Inglés
		// ---------------------------------------------------
		instituto.registrarAlumno(listaAlumnos[15], ingles);
		instituto.asignarSillaAlAula(listaSillas[17], aula1);

		// Materia: Diseño Gráfico
		// ---------------------------------------------------
		instituto.registrarAlumno(listaAlumnos[14], disenioGrafico);
		instituto.asignarEscritorioAlAula(listaEscritorios[31], aula4);
		instituto.asignarSillaAlAula(listaSillas[68], aula4);
		instituto.asignarComputadoraAlAula(listaComputadoras[35], aula4);

		instituto.registrarAlumno(listaAlumnos[15], disenioGrafico);
		instituto.asignarEscritorioAlAula(listaEscritorios[32], aula4);
		instituto.asignarSillaAlAula(listaSillas[69], aula4);
		instituto.asignarComputadoraAlAula(listaComputadoras[36], aula4);

		instituto.registrarAlumno(listaAlumnos[14], disenioGrafico);
		instituto.asignarEscritorioAlAula(listaEscritorios[33], aula4);
		instituto.asignarSillaAlAula(listaSillas[70], aula4);
		instituto.asignarComputadoraAlAula(listaComputadoras[37], aula4);

		instituto.registrarAlumno(listaAlumnos[19], disenioGrafico);
		instituto.asignarEscritorioAlAula(listaEscritorios[34], aula4);
		instituto.asignarSillaAlAula(listaSillas[71], aula4);
		instituto.asignarComputadoraAlAula(listaComputadoras[38], aula4);

		// Materia: Economía
		// ---------------------------------------------------
		instituto.registrarAlumno(listaAlumnos[17], economia);
		instituto.asignarSillaAlAula(listaSillas[18], aula3);

		instituto.registrarAlumno(listaAlumnos[0], economia);
		instituto.asignarSillaAlAula(listaSillas[19], aula3);

		// Materia: Ciencias Políticas
		// ---------------------------------------------------
		instituto.registrarAlumno(listaAlumnos[6], cienciasPoliticas);

		consola.imprimeCierreDeInscripcion(instituto);
	
	
}

}
