public class Libros  extends Autores{
    private String libros;
    private double precio;


    public void setLibros(String libros) {
        this.libros = libros;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }


    @Override
    public void comprar() {
        System.out.println("Precio del libro escogido: " + precio + "$");


    }

    @Override
    public void vender(){
        System.out.println("Nombre del Libro: " + libros  );

    }
    @Override
    public void precio(){
        precio = precio * 0.15;
        System.out.println("Precio total del libro: " + precio + "$" );
    }
}
