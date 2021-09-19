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
public class ClasePrincipal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Producto objProducto;
        objProducto = new Producto(1, "Coca-cola", 50, 5000, "Disponible", "Bebidas");
        //objProducto.crearProducto();
        //objProducto.modificarProducto();
        objProducto.mostrarProducto();
        
        Producto objProducto2;
        objProducto2 = new Producto(2, "Detergente Fab", 0, 9000, "Agotado", "Aseo");
        objProducto2.mostrarProducto();
        
        
        
        
    }
    
}
