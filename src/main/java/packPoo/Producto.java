/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package packPoo;

/**
 *
 * @author USUARIO
 */
public class Producto {
    //ATRIBUTOS
    private int idProducto;
    private String descripcionProducto;
    private int stockProducto;
    private double precioProducto;
    private String estadoProducto;
    private String categoriaProducto;
    
    
    //METODO CONSTRUCTOR
    public Producto(int idProductoIn, String descripcionProductoIn, int stockProductoIn, 
            double precioProductoIn, String estadoProductoIn, String categoriaProductoIn ){
        this.idProducto = idProductoIn;
        this.descripcionProducto = descripcionProductoIn;
        this.stockProducto = stockProductoIn;
        this.precioProducto = precioProductoIn;
        this.estadoProducto = estadoProductoIn;
        this.categoriaProducto = categoriaProductoIn;
    }
    
    
    //METODOS
    public void crearProducto(){
        System.out.println("Estoy creando un producto"); 
    }
    
    public void modificarProducto(){
        System.out.println("Estoy modificando un producto");
    }
    
    public void mostrarProducto(){
        System.out.println(this.idProducto);
        System.out.println(this.descripcionProducto);
        System.out.println(this.stockProducto);
        System.out.println(this.precioProducto);
        System.out.println(this.estadoProducto);
        System.out.println(this.categoriaProducto);
    }
}
