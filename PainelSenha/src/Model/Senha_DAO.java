
package Model;

import java.util.Random;

/**
 *
 * @author JEFFERSON
 */
public class Senha_DAO {
    
    public static Random senha = new Random();
    public static Random guiche = new Random();
    public static int c = 0;
    public static int j =0;
    public static String total = "";
    public static String total02 = "";
    public static String atendente = "";
    public static String atendente02 = "";
   
    
    
    
    public static void SenhaConvencional(){
        for (c = 0; c<100; c++){
            int valor = senha.nextInt(100);
            int recep = guiche.nextInt(20);
            total = valor + "" ;
            atendente = recep + "";
            if(c == 0){
                total = "\n" + valor ;
            }
            
        }
        
    }
    
    public static void SenhaPreferencial(){
        for (j = 0; j<100; j++){
            int valor = senha.nextInt(100);
            int recep = guiche.nextInt(20);
            total02 = valor + "" ;
            atendente02 = recep + "";
            
        }
        
    }
    
     
   
        
        
}

