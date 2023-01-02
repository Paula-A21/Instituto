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

public class TercerDiaDeInscripciones {
	
	public void tercerDiaDeInscripción(Consola consola, Alumno[] listaAlumnos, Escritorio[] listaEscritorios,
			Profesor[] listaProfesores, Pizarron[] listaPizarrones, Silla[] listaSillas, Computadora[] listaComputadoras,Curso ingles, 
			Curso programacion1, Curso disenioGrafico, Curso economia, Curso cienciasPoliticas, Instituto instituto){

				consola.imprimeNumeroDeDiaDeInscripcion(3);
				
				Aula[] listaAulas = instituto.getAulasAsignadas();
				Aula aula1 = listaAulas[0];
				Aula aula2 = listaAulas[1];
				Aula aula3 = listaAulas[2];
				Aula aula4 = listaAulas[3];

				// Materia: Inglés
				// ---------------------------------------------------
				instituto.registrarAlumno(listaAlumnos[10], ingles);
				instituto.asignarSillaAlAula(listaSillas[13], aula1);

				// Materia: Programación I
				// ---------------------------------------------------
				instituto.registrarAlumno(listaAlumnos[10], programacion1);
				instituto.asignarEscritorioAlAula(listaEscritorios[22], aula2);
				instituto.asignarSillaAlAula(listaSillas[61], aula2);
				instituto.asignarComputadoraAlAula(listaComputadoras[6], aula2);

				instituto.registrarAlumno(listaAlumnos[11], programacion1);
				instituto.asignarEscritorioAlAula(listaEscritorios[22], aula2);
				instituto.asignarSillaAlAula(listaSillas[62], aula2);
				instituto.asignarComputadoraAlAula(listaComputadoras[7], aula2);

				instituto.registrarAlumno(listaAlumnos[12], programacion1);
				instituto.asignarEscritorioAlAula(listaEscritorios[23], aula2);
				instituto.asignarSillaAlAula(listaSillas[63], aula2);
				instituto.asignarComputadoraAlAula(listaComputadoras[8], aula2);

				instituto.registrarAlumno(listaAlumnos[13], programacion1);
				instituto.asignarEscritorioAlAula(listaEscritorios[24], aula2);
				instituto.asignarSillaAlAula(listaSillas[64], aula2);
				instituto.asignarComputadoraAlAula(listaComputadoras[9], aula2);

				instituto.registrarAlumno(listaAlumnos[14], programacion1);
				instituto.asignarEscritorioAlAula(listaEscritorios[25], aula2);
				instituto.asignarSillaAlAula(listaSillas[65], aula2);
				instituto.asignarComputadoraAlAula(listaComputadoras[10], aula2);

				// Materia: Diseño Gráfico
				// ---------------------------------------------------
				instituto.registrarAlumno(listaAlumnos[14], disenioGrafico);
				instituto.asignarEscritorioAlAula(listaEscritorios[27], aula4);
				instituto.asignarSillaAlAula(listaSillas[65], aula4);
				instituto.asignarComputadoraAlAula(listaComputadoras[33], aula4);

				instituto.registrarAlumno(listaAlumnos[18], disenioGrafico);
				instituto.asignarEscritorioAlAula(listaEscritorios[28], aula4);
				instituto.asignarSillaAlAula(listaSillas[65], aula4);
				instituto.asignarComputadoraAlAula(listaComputadoras[34], aula4);

				// Materia: Economía
				// ---------------------------------------------------
				instituto.registrarAlumno(listaAlumnos[14], economia);
				instituto.asignarSillaAlAula(listaSillas[13], aula3);

				instituto.registrarAlumno(listaAlumnos[15], economia);
				instituto.asignarSillaAlAula(listaSillas[14], aula3);

				instituto.registrarAlumno(listaAlumnos[16], economia);
				instituto.asignarSillaAlAula(listaSillas[15], aula3);

				instituto.registrarAlumno(listaAlumnos[2], economia);
				instituto.asignarSillaAlAula(listaSillas[16], aula3);
			}
			

}



