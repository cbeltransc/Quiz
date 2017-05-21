/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Point1;

/**
 *
 * @author USUARIO
 */
public class Codigo {
    private String cifrado;

    public Codigo() {
        this.cifrado = cifrado;
    }
    
    public String descifrar(String cifrado) {
        char p[]=cifrado.toCharArray();
        
        for (int i = 0; i < p.length; i++) {
            if(p[i]>=68&&p[i]<=90){
                p[i]=(char)(((int)(p[i]-65-3)%26)+65);
            }else if(p[i]>64&&p[i]<68){
                p[i]=(char)(((int)(p[i]+26-65-3)%26)+65);
            }else
                System.out.println("-");
        }
           String s= String.valueOf(p);
        return s;
    
}
}
