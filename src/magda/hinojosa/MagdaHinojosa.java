/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package magda.hinojosa;

/**
 *
 * @author T-
 */
public class MagdaHinojosa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Hola Mundo cruel");
        
        // probaremos nuestra solucion
        //crear un usuario hipotetico
        Usuario u=new Usuario();
        //le asignamos valores
        u.altura = 1.68f;
        u.peso = 73f;
        
        //generamos el modelo
        
        Imc imc=new Imc();
        
        
        System.out.println("El valor del imc es: "+imc.calcular(u));
        
    }
    
}
