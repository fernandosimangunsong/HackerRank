/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package countingvalley;

import java.util.Scanner;

/**
 *
 * @author fernandosimangunsong
 */

public class CountingValley {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextByte();
        String str = sc.next(); 
        System.out.println(solution(n, str));
        sc.close();
    }
    
    static int solution(int n, String str){
        //U = +1; D = -1;
        int valleyCounter = 0 , altitude = 0;
        for (int i = 0; i < n; i++) {
            //proses cacah string
            char ch = str.charAt(i);
            if(ch == 'U'){
                altitude++;
                if(altitude == 0){
                    valleyCounter++;
                }
            }else{
                altitude--;
                if(altitude == 0){
                    valleyCounter++;
                }
            }
        }
        return valleyCounter;
    }
    
}
