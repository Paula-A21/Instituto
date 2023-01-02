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

public class PrimerDiaDeInscripciones {
	
	public void primerDiaDeInscripción(Consola consola, Alumno[] listaAlumnos, Escritorio[] listaEscritorios,
	Profesor[] listaProfesores, Pizarron[] listaPizarrones, Silla[] listaSillas, Computadora[] listaComputadoras,Curso ingles, 
	Curso programacion1, Curso disenioGrafico, Curso economia, Curso cienciasPoliticas, Instituto instituto){
		
		consola.imprimeAperturaDeInscripcion(consola);
		consola.imprimeNumeroDeDiaDeInscripcion(1);
		
		// Materia: Inglés
		// ---------------------------------------------------
		instituto.registrarAlumno(listaAlumnos[0], ingles);
		instituto.registrarAlumno(listaAlumnos[1], ingles);
		instituto.registrarAlumno(listaAlumnos[2], ingles);
		
		// Como tiene 3 inscriptos, se abre el curso
		
		instituto.abrirCurso(ingles);
		
		
		// Asignar profesor
		instituto.asignarProfesor(listaProfesores[0], ingles);

		Aula aula1 = new Aula(1, 30, false, true, ingles);
		instituto.asignarAulaCurso(ingles, aula1);

		instituto.asignarPizarronAlAula(listaPizarrones[0], aula1);
		// Sólo se asigna un escritorio para el profesor
		instituto.asignarEscritorioAlAula(listaEscritorios[0], aula1);
		instituto.asignarSillaAlAula(listaSillas[0], aula1);
		instituto.asignarSillaAlAula(listaSillas[1], aula1);
		instituto.asignarSillaAlAula(listaSillas[2], aula1);
		consola.imprimeAperturaDeCurso(ingles);

		// Materia: Programación I
		// ---------------------------------------------------
		instituto.registrarAlumno(listaAlumnos[2], programacion1);
		instituto.registrarAlumno(listaAlumnos[3], programacion1);
		instituto.registrarAlumno(listaAlumnos[6], programacion1);
		// Como tiene 3 inscriptos, se abre el curso
		instituto.abrirCurso(programacion1);
		// Asignar profesores
		instituto.asignarProfesor(listaProfesores[1], programacion1);
		instituto.asignarProfesor(listaProfesores[2], programacion1);
		instituto.asignarProfesor(listaProfesores[3], programacion1);

		Aula aula2 = new Aula(2, 30, true, true, programacion1);
		instituto.asignarAulaCurso(programacion1, aula2);
		
		instituto.asignarPizarronAlAula(listaPizarrones[4], aula2);
		// El escritorio y la silla del profesor.
		// El profesor tiene el servidor en su escritorio
		instituto.asignarEscritorioAlAula(listaEscritorios[9], aula2);
		instituto.asignarSillaAlAula(listaSillas[49], aula2);
		instituto.asignarComputadoraAlAula(listaComputadoras[25], aula2);

		// Los escritorios, las sillas y las computadoras de los alumnos
		instituto.asignarEscritorioAlAula(listaEscritorios[10], aula2);
		instituto.asignarEscritorioAlAula(listaEscritorios[11], aula2);
		instituto.asignarEscritorioAlAula(listaEscritorios[12], aula2);
		instituto.asignarSillaAlAula(listaSillas[50], aula1);
		instituto.asignarSillaAlAula(listaSillas[51], aula1);
		instituto.asignarSillaAlAula(listaSillas[52], aula1);
		instituto.asignarComputadoraAlAula(listaComputadoras[0], aula2);
		instituto.asignarComputadoraAlAula(listaComputadoras[1], aula2);
		instituto.asignarComputadoraAlAula(listaComputadoras[2], aula2);

		// Continúan inscribiéndose alumnos en el mismo curso
		instituto.registrarAlumno(listaAlumnos[8], programacion1);
		instituto.asignarEscritorioAlAula(listaEscritorios[13], aula2);
		instituto.asignarSillaAlAula(listaSillas[53], aula2);
		instituto.asignarComputadoraAlAula(listaComputadoras[3], aula2);

		instituto.registrarAlumno(listaAlumnos[9], programacion1);
		instituto.asignarEscritorioAlAula(listaEscritorios[14], aula2);
		instituto.asignarSillaAlAula(listaSillas[54], aula2);
		instituto.asignarComputadoraAlAula(listaComputadoras[4], aula2);

		consola.imprimeAperturaDeCurso(programacion1);

		// Materia: Diseño Gráfico
		// ---------------------------------------------------
		instituto.registrarAlumno(listaAlumnos[3], disenioGrafico);
		instituto.registrarAlumno(listaAlumnos[5], disenioGrafico);

		// Materia: Economía
		// ---------------------------------------------------
		instituto.registrarAlumno(listaAlumnos[5], economia);
		instituto.registrarAlumno(listaAlumnos[7], economia);
		instituto.registrarAlumno(listaAlumnos[10], economia);

		// Como tiene 3 inscriptos, se abre el curso
		instituto.abrirCurso(economia);
		// Asignar profesor
		instituto.asignarProfesor(listaProfesores[4], economia);

		Aula aula3 = new Aula(3, 30, false, true, economia);

		instituto.asignarAulaCurso(economia, aula3);
		instituto.asignarPizarronAlAula(listaPizarrones[1], aula3);
		// El escritorio y la silla del profesor
		instituto.asignarEscritorioAlAula(listaEscritorios[1], aula3);
		instituto.asignarSillaAlAula(listaSillas[49], aula3);

		// Las sillas pupitre de los alumnos
		instituto.asignarSillaAlAula(listaSillas[3], aula3);
		instituto.asignarSillaAlAula(listaSillas[4], aula3);
		instituto.asignarSillaAlAula(listaSillas[5], aula3);

		consola.imprimeAperturaDeCurso(economia);

		// Materia: Ciencias Políticas
		// ---------------------------------------------------
		instituto.registrarAlumno(listaAlumnos[3], cienciasPoliticas);
		
	}

}
