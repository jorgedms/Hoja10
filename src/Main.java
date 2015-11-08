
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

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

	public static void main(String[] args) {
	
		Graph g = new Graph();
		Vertex v = new Vertex();
		Vertex v2 = new Vertex();
		
		int n = 0;
		// TODO Auto-generated method stub
		try{
        	BufferedReader in = new BufferedReader(new FileReader("C:/Users/MS/Documents/Java 2/HDT 10/src/datos.txt"));
        	
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
        	
        	
        	
        	while((d = in.readLine()) != null){
        		System.out.println(d);
        		String[] arr = d.split(" ");
            	System.out.println(arr[0]);
            	v = new Vertex(arr[0]);
            	g.addVertex(v);
            	System.out.println(arr[1]);
            	v2 = new Vertex(arr[1]);
            	g.addVertex(v2);
            	System.out.println(arr[2]);
            	n = Integer.parseInt(arr[2]);
            	g.addEdge(v, v2, n);
            	
        	}/**/
        	
        	System.out.println(g.getVerticies());
        	System.out.println("######"+"---->");
        	
        } catch (IOException e){
        	
        	//Mensaje de error si no se encuentra el archivo
        	System.out.println("Error de lectura");
        }
	}

}
