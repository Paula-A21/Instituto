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

public class SegndoDiaDeInscripciones {
	public void segundoDiaDeInscripción(Consola consola, Alumno[] listaAlumnos, Escritorio[] listaEscritorios,
			Profesor[] listaProfesores, Pizarron[] listaPizarrones, Silla[] listaSillas, Computadora[] listaComputadoras,Curso ingles, 
			Curso programacion1, Curso disenioGrafico, Curso economia, Curso cienciasPoliticas, Instituto instituto){

				consola.imprimeNumeroDeDiaDeInscripcion(2);
				
				Aula[] listaAulas = instituto.getAulasAsignadas();
				Aula aula1 = listaAulas[0];
				Aula aula2 = listaAulas[1];
				Aula aula3 = listaAulas[2];
				
			// Materia: Inglés
			// ---------------------------------------------------
			instituto.registrarAlumno(listaAlumnos[9], ingles);
			instituto.asignarSillaAlAula(listaSillas[6], aula1);

			instituto.registrarAlumno(listaAlumnos[11], ingles);
			instituto.asignarSillaAlAula(listaSillas[7], aula1);

			instituto.registrarAlumno(listaAlumnos[12], ingles);
			instituto.asignarSillaAlAula(listaSillas[8], aula1);

			instituto.registrarAlumno(listaAlumnos[17], ingles);
			instituto.asignarSillaAlAula(listaSillas[9], aula1);

			instituto.registrarAlumno(listaAlumnos[4], ingles);
			instituto.asignarSillaAlAula(listaSillas[10], aula1);

			// Materia: Programación I
			// ---------------------------------------------------
			instituto.registrarAlumno(listaAlumnos[7], programacion1);
			instituto.asignarEscritorioAlAula(listaEscritorios[15], aula2);
			instituto.asignarSillaAlAula(listaSillas[55], aula2);
			instituto.asignarComputadoraAlAula(listaComputadoras[5], aula2);

			// Materia: Diseño Gráfico
			// ---------------------------------------------------
			instituto.registrarAlumno(listaAlumnos[7], disenioGrafico);

			// Como tiene 3 inscriptos, se abre el curso
			instituto.abrirCurso(disenioGrafico);
			// Asignar profesores
			instituto.asignarProfesor(listaProfesores[1], disenioGrafico);
			instituto.asignarProfesor(listaProfesores[2], disenioGrafico);
			instituto.asignarProfesor(listaProfesores[3], disenioGrafico);

			Aula aula4 = new Aula(4, 30, true, true, disenioGrafico);
			
			instituto.asignarAulaCurso(disenioGrafico, aula4);
			instituto.asignarPizarronAlAula(listaPizarrones[5], aula4);
			// El escritorio y la silla del profesor.
			// El profesor tiene el servidor en su escritorio
			instituto.asignarEscritorioAlAula(listaEscritorios[16], aula4);
			instituto.asignarSillaAlAula(listaSillas[56], aula4);
			instituto.asignarComputadoraAlAula(listaComputadoras[27], aula4);

			// Hay que asignar los recursos de los alumnos que se inscribieron
			// el día anterior. En diseño gráfico se usan notebooks
			instituto.asignarEscritorioAlAula(listaEscritorios[17], aula4);
			instituto.asignarEscritorioAlAula(listaEscritorios[18], aula4);
			instituto.asignarEscritorioAlAula(listaEscritorios[19], aula4);
			instituto.asignarSillaAlAula(listaSillas[57], aula4);
			instituto.asignarSillaAlAula(listaSillas[58], aula4);
			instituto.asignarSillaAlAula(listaSillas[59], aula4);
			instituto.asignarComputadoraAlAula(listaComputadoras[29], aula4);
			instituto.asignarComputadoraAlAula(listaComputadoras[30], aula4);
			instituto.asignarComputadoraAlAula(listaComputadoras[31], aula4);

			instituto.registrarAlumno(listaAlumnos[8], disenioGrafico);
			instituto.asignarEscritorioAlAula(listaEscritorios[20], aula4);
			instituto.asignarSillaAlAula(listaSillas[60], aula4);
			instituto.asignarComputadoraAlAula(listaComputadoras[32], aula4);
			
			consola.imprimeAperturaDeCurso(disenioGrafico);

			// Materia: Economía
			// ---------------------------------------------------
			instituto.registrarAlumno(listaAlumnos[18], economia);
			instituto.asignarSillaAlAula(listaSillas[11], aula3);
			instituto.registrarAlumno(listaAlumnos[19], economia);
			instituto.asignarSillaAlAula(listaSillas[12], aula3);
			}

}