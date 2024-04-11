package clases;
import java.util.Scanner;

public class Parqueo {
	private static  Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		Matriz parqueo = new Matriz(10, 10);
		int opcion;
		int numeroParqueo;
    	int fila;
    	int columna;
    	Nodo nodo;
    	
		//LLENAMOS TODAS LAS POSICIONES VACIAS
		for (int i = 0; i < 10; i++) {
		    for (int j = 0; j < 10; j++) {
		    	String espacio = Integer.toString(i) + Integer.toString(j); 
		        parqueo.insertar(i, j, new Nodo(Integer.parseInt(espacio) + 1 , "Espacio Vacio", "", "", "", ""));
		    }
		}
		
		//MOSTRAMOS MENU
        do {
        	System.out.println("\n");
            System.out.println("**Menú de opciones**");
            System.out.println("1. Insertar Parqueo");
            System.out.println("2. Buscar Parqueo");
            System.out.println("3. Eliminar Parqueo");
            System.out.println("4. Ver Todo el  Parqueo");
            System.out.println("5. Salir");

            System.out.print("Introduzca una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                	System.out.println("\n");
                	String placa;
                	String color;
                	String linea;
                	String modelo;
                	String propietario;
                	
                	do {
                		System.out.print("Introduzca el número de parqueo (1 al 100): ");
                		numeroParqueo = scanner.nextInt();
                	}while (numeroParqueo < 1 || numeroParqueo > 100);
                	numeroParqueo--;
                	
                	do {
                		System.out.print("Introduzca la placa del vehículo: ");
                        placa = scanner.next();
                	}while (placa == "");
                	
                	do {
                		System.out.print("Introduzca el color del vehículo: "	);
                        color = scanner.next();
                	}while (color == "");
                	
                	do {
                		System.out.print("Introduzca la linea del vehículo: ");
                        linea = scanner.next();
                	}while (linea == "");
                	
                	do {
                		System.out.print("Introduzca el modelo del vehículo: ");
                		modelo = scanner.next();
                	}while (modelo == "");
                	
                	do {
                		System.out.print("Introduzca el nombre del propietario: ");
                        propietario = scanner.next();
                	}while (propietario == "");
                    
                	if(numeroParqueo < 10) {
                		fila = 0;
                		columna = numeroParqueo;
                	}else {
                		fila = numeroParqueo/10;
                		columna = numeroParqueo%10;
                	}
                	
                	parqueo.eliminar(fila, columna);
                	parqueo.insertar(fila, columna, new Nodo(numeroParqueo + 1, placa, color, linea, modelo, propietario));
                	nodo = parqueo.buscar(fila, columna);
                	System.out.println("Carro ingresado: " + nodo.toString());
                    break;
                    
                case 2:
                	System.out.println("\n");
                	System.out.println("Buscar Parqueo");
                	do {
                		System.out.print("Introduzca el número de parqueo a buscar (1 al 100): ");
                		numeroParqueo = scanner.nextInt();
                	}while (numeroParqueo < 1 || numeroParqueo > 100);
                	numeroParqueo--;
                	
                	if(numeroParqueo < 10) {
                		fila = 0;
                		columna = numeroParqueo;
                	}else {
                		fila = numeroParqueo/10;
                		columna = numeroParqueo%10;
                	}
                	
                	nodo = parqueo.buscar(fila, columna);
                	System.out.println("Resultado: " + nodo.toString());
                    break;
                    
                case 3:
                	System.out.println("\n");
                    System.out.println("Eliminar Parqueo");
                    do {
                		System.out.print("Introduzca el número de parqueo que desea eliminar (1 al 100): ");
                		numeroParqueo = scanner.nextInt();
                	}while (numeroParqueo < 1 || numeroParqueo > 100);
                    numeroParqueo--;
                    
                	if(numeroParqueo < 10) {
                		fila = 0;
                		columna = numeroParqueo;
                	}else {
                		fila = numeroParqueo/10;
                		columna = numeroParqueo%10;
                	}
                	
                	parqueo.eliminar(fila, columna);
                	
                	String espacio = Integer.toString(fila) + Integer.toString(columna); 
                	parqueo.insertar(fila, columna, new Nodo(Integer.parseInt(espacio) + 1, "Espacio Vacio", "", "", "", ""));
                	
                	nodo = parqueo.buscar(fila, columna);
                	System.out.println("Parqueo eliminado: " + nodo.toString());
                    break;
                    
                case 4:
                	System.out.println("\n");
                	parqueo.imprimir();
                    break;
                    
                case 5:
                	System.out.println("\n");
                    System.out.println("Saliendo...");
                    break;
                    
                default:
                    System.out.println("Opción no válida");
            }
        } while (opcion != 5);
	}
}
