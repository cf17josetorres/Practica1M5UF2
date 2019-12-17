import java.io.*;

public class ex2for {
	
	public static void main (String[] args) throws IOException {
		System.out.print("Introducir el nombre: ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String nom = reader.readLine();
        System.out.print("Introducir las veces q quieras: ");
        String veces = reader.readLine();
        int num = Integer.parseInt(veces);
        
        for (int i = 0; i < num; i++) { //i=i+1
			System.out.print(nom+" ");
		}	
	}
}

