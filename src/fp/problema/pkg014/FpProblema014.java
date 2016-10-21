/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fp.problema.pkg014;


public class FpProblema014 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      int arr[][];
       arr=new int [7][7];
       
       int v;
            for(int i=0;i<7;i++){ 
                for(int j=0;j<7;j++){
                     if(i==j){ 
                         v=1;
                     }else{
                         v=0;
                }
                       System.out.print(v +"\t");
            }
                       System.out.println("\n");
        }
    }
}

