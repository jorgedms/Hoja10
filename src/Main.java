
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/*
 * Universidad del Valle de Guatemala
 * Algoritmos y estructura de datos
 * Sección 10
 * 
 * Jorge Manrique 13600
 * 
 * Christopher Ajú 13171
 * 
 * Hoja de trabajo 10
 * */

public class Main {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
	
		Graph g = new Graph();
		Vertex v = new Vertex();
		Vertex v2 = new Vertex();
		
		//ingreso de teclado
		Scanner getKey = new Scanner(System.in);
		
		int n = 0;
		// TODO Auto-generated method stub
		try{
        	BufferedReader in = new BufferedReader(new FileReader("C:/Users/Chris/Documents/GitHub/Hoja10/src/datos.txt"));
        	
        	//Se separan los datos de ciudad1, ciudad2 y distancia(KM)
        	String d;
        	d = in.readLine();
        	String[] ar = d.split(" ");
        	System.out.println(d);
        	System.out.println(ar[0]);
        	
        	v = new Vertex(ar[0]);
        	g.addVertex(v);
        	
        	System.out.println(ar[1]);
        	v2 = new Vertex(ar[1]);
        	g.addVertex(v2);
        	
        	System.out.println(ar[2]);
        	n = Integer.parseInt(ar[2]);
        	g.addEdge(v, v2, n);
        	
        	
        	//arcos
        	while((d = in.readLine()) != null){
        		System.out.println("linea: " + d);
        		String[] arr = d.split(" ");
            	System.out.println("punto a: " + arr[0]);
            	v = new Vertex(arr[0]);
            	g.addVertex(v);
            	System.out.println("punto b: " + arr[1]);
            	v2 = new Vertex(arr[1]);
            	g.addVertex(v2);
            	System.out.println("distancia: " + arr[2]);
            	n = Integer.parseInt(arr[2]);
            	g.addEdge(v, v2, n);
            	
        	}/**/
        	
        	//System.out.println(g.getVerticies());
        	System.out.println("######"+"---->");
        	
        } catch (IOException e){
        	
        	//Mensaje de error si no se encuentra el archivo
        	System.out.println("Error de lectura");
        }
		
		boolean menu = true;
		
		while (menu == true){
			System.out.println("Menu de Programa");
			System.out.println("	1 --> agregar nodo \n	2 --> agregar arco"
					+ "\n	3 --> eliminar arco \n	4 --> encontrar ruta"
					+ "\n	5 --> mostrar arcos \n	6 --> mostrar nodos");
			System.out.println("Elija numero de opcion: ");
			
			int a = getKey.nextInt();
			
			//limpia caracteres en memoria
			//no eliminar
			getKey.nextLine();
			
			
			//logica de menus
			if (a == 1){
				System.out.println("ingreso opcion: 1 ---> agregar nodo");
				//entradas
				System.out.println("Nombre de la cuidad: ");
				v = new Vertex (getKey.nextLine());
				g.addVertex(v);
			}
			
			if (a == 2){
				//datos de trayectoria y distancia
				System.out.println("ingreso opcion: 2 ---> agregar arco");
				System.out.println("Punto inicial: ");
				v = new Vertex(getKey.nextLine());
				//g.addVertex(v);
				System.out.println("Punto final: ");
				v2 = new Vertex(getKey.nextLine());
				//g.addVertex(v2);
				System.out.println("Distancia: ");
				n = getKey.nextInt();
				
				//se agrega el arco
				g.addEdge(v, v2, n);
			}
			
			if (a == 3){
				System.out.println("ingreso opcion: 3 ---> eliminar arco");
				
				System.out.println("Punto inicial: ");
				v = new Vertex(getKey.nextLine());
				
				System.out.println("Punto final: ");
				v2 = new Vertex(getKey.nextLine());
				
				System.out.println(g.removeEdge(v, v2));
			}
			
			if (a == 4){
				System.out.println("ingreso opcion: 4 ---> encontrar ruta");
			}
			
			if (a == 5){
				System.out.println("ingreso opcion: 5 ---> mostrar arcos");
				System.out.println(g.getEdges());
			}
			
			if (a == 6){
				System.out.println("ingreso opcion: 6 ---> mostrar nodos");
				System.out.println(g.getVerticies());
			}
			
			if (a<1 || a>6){
				System.out.println("ingreso opcion:" + a);
				//prueba
				String name = getKey.nextLine();
				System.out.println(g.findVertexByName(name));
				System.out.println("!!!!!!!!!ingreso un caracter invalido!!!!!!");
			}
			//menu = false;
		}
	}

}
