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

public class IUSTest {
	
	public static void main(String[] args) {
		
		Alumno[] listaAlumnos;
		Escritorio[] listaEscritorios;
		Profesor[] listaProfesores;
		Pizarron[] listaPizarrones;
		Silla[] listaSillas;
		Computadora[] listaComputadoras;
		Instituto instituto = new Instituto();
		Consola consola;
		
		Curso ingles = new Curso("Inglés", "05-03-2017", "30-06-2017", 'N', true);
		Curso programacion1 = new Curso("Programación I", "05-03-2017", "30-06-2017", 'T', true);
		Curso disenioGrafico = new Curso("Diseño gráfico", "05-03-2017", "30-06-2017", 'M', true);
		Curso economia = new Curso("Economía", "05-03-2017", "30-06-2017", 'N', true);
		Curso cienciasPoliticas = new Curso("Ciencias políticas", "05-03-2017", "30-06-2017", 'M', true);
	
		consola = new Consola(instituto);
		listaAlumnos = instituto.getListaAlumnos();
		listaEscritorios = instituto.getListaEscritorios();
		listaProfesores = instituto.getListaProfesores();
		listaPizarrones = instituto.getListaPizarrones();
		listaSillas = instituto.getListaSillas();
		listaComputadoras = instituto.getListaComputadoras();
		
		instituto.habilitarCurso(ingles);
		instituto.habilitarCurso(programacion1);
		instituto.habilitarCurso(disenioGrafico);
		instituto.habilitarCurso(economia);
		instituto.habilitarCurso(cienciasPoliticas);
		
		
		
		listaPizarrones = new Pizarron [8];
		
		listaPizarrones [1] = new Pizarron("P001", "Pizarrón con textura", 1.20, 1.50, false);
		listaPizarrones [2] = new Pizarron("P002", "Pizarrón con textura", 1.20, 1.50, false);
		listaPizarrones [3] = new Pizarron("P003", "Pizarrón con textura", 1.20, 1.50, false);
		listaPizarrones [4] = new Pizarron("P004", "Pizarrón con textura", 1.20, 1.50, false);
		listaPizarrones [5] = new Pizarron("P005", "Pizarrón de fórmica blanca", 1.20, 1.00, false);
		listaPizarrones [6] = new Pizarron("P006", "Pizarrón de fórmica blanca", 1.20, 1.00, false);
		listaPizarrones [7] = new Pizarron("P007", "Pizarrón de fórmica blanca", 1.20, 1.00, false);
		listaPizarrones [8] = new Pizarron("P008", "Pizarrón de fórmica blanca", 1.20, 1.00, false);
		
		listaSillas = new Silla [40];
		
		listaSillas [1] = new Silla("S0001", "Silla pupitre", false);
		listaSillas [2] = new Silla("S0001", "Silla pupitre", false);
		listaSillas [3] = new Silla("S0001", "Silla pupitre", false);
		listaSillas [4] = new Silla("S0001", "Silla pupitre", false);
		listaSillas [5] = new Silla("S0001", "Silla pupitre", false);
		listaSillas [6] = new Silla("S0001", "Silla pupitre", false);
		listaSillas [7] = new Silla("S0001", "Silla pupitre", false);
		listaSillas [8] = new Silla("S0001", "Silla pupitre", false);
		listaSillas [9] = new Silla("S0001", "Silla pupitre", false);
		listaSillas [10] = new Silla("S0001", "Silla pupitre", false);
		listaSillas [11] = new Silla("S0001", "Silla pupitre", false);
		listaSillas [12] = new Silla("S0001", "Silla pupitre", false);
		listaSillas [13] = new Silla("S0001", "Silla pupitre", false);
		listaSillas [14] = new Silla("S0001", "Silla pupitre", false);
		listaSillas [15] = new Silla("S0001", "Silla pupitre", false);
		listaSillas [16] = new Silla("S0001", "Silla pupitre", false);
		listaSillas [17] = new Silla("S0001", "Silla pupitre", false);
		listaSillas [18] = new Silla("S0001", "Silla pupitre", false);
		listaSillas [19] = new Silla("S0001", "Silla pupitre", false);
		listaSillas [20] = new Silla("S0001", "Silla pupitre", false);
		listaSillas [21] = new Silla("S0001", "Silla pupitre", false);
		listaSillas [22] = new Silla("S0001", "Silla pupitre", false);
		listaSillas [23] = new Silla("S0001", "Silla pupitre", false);
		listaSillas [24] = new Silla("S0001", "Silla pupitre", false);
		listaSillas [25] = new Silla("S0001", "Silla pupitre", false);
		listaSillas [26] = new Silla("S0001", "Silla pupitre", false);
		listaSillas [27] = new Silla("S0001", "Silla pupitre", false);
		listaSillas [28] = new Silla("S0001", "Silla pupitre", false);
		listaSillas [29] = new Silla("S0001", "Silla pupitre", false);
		listaSillas [30] = new Silla("S0001", "Silla para PC", true);
		listaSillas [31] = new Silla("S0001", "Silla para PC", true);
		listaSillas [32] = new Silla("S0001", "Silla para PC", true);
		listaSillas [33] = new Silla("S0001", "Silla para PC", true);
		listaSillas [34] = new Silla("S0001", "Silla para PC", true);
		listaSillas [35] = new Silla("S0001", "Silla para PC", true);
		listaSillas [36] = new Silla("S0001", "Silla para PC", true);
		listaSillas [37] = new Silla("S0001", "Silla para PC", true);
		listaSillas [38] = new Silla("S0001", "Silla para PC", true);
		listaSillas [39] = new Silla("S0001", "Silla para PC", true);
		listaSillas [40] = new Silla("S0001", "Silla para PC", true);

		
		listaComputadoras = new Computadora [30];
		
		listaComputadoras [1] = new Computadora("C0001", false, "INTEL CORE I5 6400 QUAD CORE S1151", "3.3 Ghz", "MEMORIA DDR3 4 GB", "1600 MHZ");
		listaComputadoras [2] = new Computadora("C0002", false, "INTEL CORE I5 6400 QUAD CORE S1151", "3.3 Ghz", "MEMORIA DDR3 4 GB", "1600 MHZ");
		listaComputadoras [3] = new Computadora("C0003", false, "INTEL CORE I5 6400 QUAD CORE S1151", "3.3 Ghz", "MEMORIA DDR3 4 GB", "1600 MHZ");
		listaComputadoras [4] = new Computadora("C0004", false, "INTEL CORE I5 6400 QUAD CORE S1151", "3.3 Ghz", "MEMORIA DDR3 4 GB", "1600 MHZ");
		listaComputadoras [5] = new Computadora("C0005", false, "INTEL CORE I5 6400 QUAD CORE S1151", "3.3 Ghz", "MEMORIA DDR3 4 GB", "1600 MHZ");
		listaComputadoras [6] = new Computadora("C0006", false, "INTEL CORE I5 6400 QUAD CORE S1151", "3.3 Ghz", "MEMORIA DDR3 4 GB", "1600 MHZ");
		listaComputadoras [7] = new Computadora("C0007", false, "INTEL CORE I5 6400 QUAD CORE S1151", "3.3 Ghz", "MEMORIA DDR3 4 GB", "1600 MHZ");
		listaComputadoras [8] = new Computadora("C0008", false, "INTEL CORE I5 6400 QUAD CORE S1151", "3.3 Ghz", "MEMORIA DDR3 4 GB", "1600 MHZ");
		listaComputadoras [9] = new Computadora("C0009", false, "INTEL CORE I5 6400 QUAD CORE S1151", "3.3 Ghz", "MEMORIA DDR3 4 GB", "1600 MHZ");
		listaComputadoras [10] = new Computadora("C00010", false, "INTEL CORE I5 6400 QUAD CORE S1151", "3.3 Ghz", "MEMORIA DDR3 4 GB", "1600 MHZ");
		listaComputadoras [11] = new Computadora("C00011", false, "INTEL CORE I5 6400 QUAD CORE S1151", "3.3 Ghz", "MEMORIA DDR3 4 GB", "1600 MHZ");
		listaComputadoras [12] = new Computadora("C00012", false, "INTEL CORE I7 6700K QUAD CORE S1151", "3.3 Ghz", "MEMORIA DDR3 16 GB", "1600 MHZ");
		listaComputadoras [13] = new Computadora("C00013", false, "INTEL CORE I7 6700K QUAD CORE S1151", "3.3 Ghz", "MEMORIA DDR3 16 GB", "1600 MHZ");
		listaComputadoras [14] = new Computadora("C00014", false, "INTEL CORE I7 6700K QUAD CORE S1151", "3.3 Ghz", "MEMORIA DDR3 16 GB", "1600 MHZ");
		listaComputadoras [15] = new Computadora("C00015", false, "INTEL CORE I7 6700K QUAD CORE S1151", "3.7 Ghz", "MEMORIA DDR3 16 GB", "1600 MHZ");
		listaComputadoras [16] = new Computadora("C00016", true, "INTEL CORE I3 6300 HQ", "3.7 Ghz", "MEMORIA DDR4 8 GB", "2400 MHZ");
		listaComputadoras [17] = new Computadora("C00017", true, "INTEL CORE I3 6300 HQ", "3.7 Ghz", "MEMORIA DDR4 8 GB", "2400 MHZ");
		listaComputadoras [18] = new Computadora("C00018", true, "INTEL CORE I3 6300 HQ", "3.7 Ghz", "MEMORIA DDR4 8 GB", "2400 MHZ");
		listaComputadoras [19] = new Computadora("C00019", true, "INTEL CORE I3 6300 HQ", "3.7 Ghz", "MEMORIA DDR4 8 GB", "2400 MHZ");
		listaComputadoras [20] = new Computadora("C00020", true, "INTEL CORE I3 6300 HQ", "3.7 Ghz", "MEMORIA DDR4 8 GB", "2400 MHZ");

		listaProfesores = new Profesor [4];
		
		listaProfesores [0] = new Profesor("Alejandra", "Camila", "Suárez", "23456789", "asuares@email.com", "4466-1288", "15-12489-6598");
		listaProfesores [1] = new Profesor("Alejandro", "Raúl", "Pérez", "18956321", "aperez@email.com", "4477-3488", "15-3489-6576");
		listaProfesores [2] = new Profesor("Juan", "Camilo", "Peralta", "24567893", "jperalta@email.com", "4488-5688", "15-5689-6554");
		listaProfesores [3] = new Profesor("Roberto", "Raúl", "Estevez", "25678934", "restevez@email.com", "4499-7888", "15-7889-6532");
		
		listaAlumnos = new Alumno [30];
		
		listaAlumnos [1] = new Alumno("Juan", "Ignacio", "Perez", "21111222", "jperez@email.com", "4555-6666", "15-2222-3333");
		listaAlumnos [2] = new Alumno("Manuel", "Ariel", "Propov", "51111225", "mpropov@email.com", "4333-6666",
				"15-1111-2222");
		listaAlumnos [3] = new Alumno("Pedro", "Alberto", "Almeida", "23222111", "palmeida@email.com", "4222-1111",
				"15-4444-3333");
		listaAlumnos [4] = new Alumno("Carlos", "Alejo", "Garcia", "21444555", "cgarcia@email.com", "4555-2222",
				"15-2222-5555");
		listaAlumnos [5] = new Alumno("Alejandro", "Sergio", "Iraola", "43333444", "airaola@email.com", "4545-2345", "15-3355-9933");
		listaAlumnos [6] = new Alumno("María", "Laura", "Noir", "44022003", "mnoir@email.com", "4411-5432", "15-6677-8866");
		listaAlumnos [7] = new Alumno("Susana", "Margarita", "Castro", "43222444", "scastro@email.com", "2345-1234", "15-8899-5432");
		listaAlumnos [8] = new Alumno("María", "Pia", "Pereira", "44123456", "mpereira@email.com", "4555-4411", "15-1234-1423");
		listaAlumnos [9] = new Alumno("Elena", "Raquel", "Lacarra", "441111111", "elacarra@email.com", "4555-2345", "15-2378-1111");
		listaAlumnos [10] = new Alumno("Miguel", "Ángel", "Mitre", "44252353", "mmitre@email.com", "4555-5678", "15-1336-2222");
		listaAlumnos [11] = new Alumno("Pedro", "Ignacio", "Mason", "44123654", "pmason@email.com", "4555-9876", "15-4040-8765");
		listaAlumnos [12] = new Alumno("Saúl", "Nair", "Ionamain", "44968423", "sionamain@email.com", "4555-2345", "15-5050-8856");
		listaAlumnos [13] = new Alumno("Jesús", "Abrahan", "Raznic", "43122112", "jraznic@email.com", "4411-5432", "15-5151-7412");
		listaAlumnos [14] = new Alumno("Lionel", "Ricardo", "Treverian", "43999888", "ltreverian@email.com", "4555-1212", "15-6161-2345");
		listaAlumnos [15] = new Alumno("Fernando", "Ariel", "García", "44252525", "fgarcia@email.com", "4555-1313", "15-2020-1122");
		listaAlumnos [16] = new Alumno("Silvina", "Claudia", "Paroni", "44555666", "aparoni@email.com", "4555-1414", "15-5098-4545");
		listaAlumnos [17] = new Alumno("Esther", "Angela", "Docal", "44555777", "edocal@email.com", "4545-2233", "15-5099-9631");
		listaAlumnos [18] = new Alumno("Ana", "María", "Sumatti", "4500001", "asumatti@email.com", "4411-3344", "15-4077-0033");
		listaAlumnos [19] = new Alumno("Estela", "Susana", "Crossetti", "43212121", "ecrossetti@email.com", "4555-5566", "15-5033-1122");
		listaAlumnos [20] = new Alumno("Fernando", "Fabio", "Pazman", "44000111", "fpazman@email.com", "4555-2345", "15-2345-4545");
		listaAlumnos [21] = new Alumno("Fabián", "Marcelo", "Cohelo", "44123654", "fcohelo@email.com", "4545-8899", "15-8796-6923");
		listaAlumnos [22] = new Alumno("Juan", "Carlos", "Caballero", "44112233", "jcaballero@email.com", "4555-9798", "15-7070-7532");
		listaAlumnos [23] = new Alumno("José", "Augusto", "Azman", "44223355", "jazman@email.com", "4411-9876", "15-8080-9512");
		listaAlumnos [24] = new Alumno("Juan", "Ramón", "Ortiz", "43556677", "jortiz@email.com", "4545-1580", "15-9090-4563");
		listaAlumnos [25] = new Alumno("Juan", "Antonio", "Oglietti", "43667788", "joglietti@email.com", "4555-0022", "15-1010-2345");
		listaAlumnos [26] = new Alumno("Esteban", "Ariel", "Acosta", "43778899", "eacosta@email.com", "4555-2345", "15-1122-1234");
		listaAlumnos [27] = new Alumno("Martín", "Iván", "Carlo", "44123122", "mcarlo@email.com", "4411-5432", "15-2333-6542");
		listaAlumnos [28] = new Alumno("Romina", "Carola", "Andrade", "44012302", "randrade@email.com", "4545-1287", "15-3467-1329");
		listaAlumnos [29] = new Alumno("Carolina", "Azuzena", "Kazmin", "44012563", "ckazmin@email.com", "4555-2345", "15-3487-7845");
		listaAlumnos [30] = new Alumno("Camila", "Augusta", "Beringuer", "44002321", "cberinguer@email.com", "4411-7698", "15-9812-2154");
	
	
		}

		/*
		 * Primer día de inscripción
		 */
	

		/*
		 * Segundo día de inscripción
		 */
		
		/*
		 * Cuarto día de inscripción
		 */
		

		

		
	}


