import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        double precios;
        String libro1;

        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        Libros obj = new Libros();

        System.out.println("Ingrese el libro escogido");
        libro1 = br.readLine();

        System.out.println("Ingrese el precio del libro");
        precios = Integer.parseInt(br.readLine());

        obj.setLibros(libro1);
        obj.setPrecio(precios);
        obj.comprar();
        obj.vender();
        obj.precio();
    }
}