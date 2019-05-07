/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sockmerchant;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

/**
 *
 * @author fernandosimangunsong
 */

public class SockMerchant {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int[] Arr = {10,20,20,10,10,30,50,10,20}; //expected result 3 pair
//         int[] Arr = {1, 1, 3, 1, 2, 1, 3, 3, 3, 3,}; //expected result 4 pair 
         int n = Arr.length;
         int result = solution1(n, Arr);
         System.out.print(result);
    }
    
    static int solution1(int n, int ar[]){
        // menggunakan HashSet untuk memeriksa apakah item merupakan item unik pada element set.
        HashSet<Integer> set = new HashSet<Integer>();
        int count=0;
        for(int i=0; i<n; i++){
            int element = ar[i];
            if(set.contains(element)){
                set.remove(element);
                count++;
            }else{
                set.add(element);
            }
        }
        System.out.print(set);
        return count;
    }
    
    static int solution2(int n, int Arr[]){
        // solusi 2 menggunakan list, ketika item ditemukan, maka item tersebut dihapus.
        int result = 0;
        ArrayList<Integer> arrInt = new ArrayList<Integer>();
        
        for(int i=0; i<Arr.length;i++){
            arrInt.add(Arr[i]);
        }
        System.out.println(arrInt);
        for (int i = 0; i < arrInt.size(); i++) {
            for (int j = i+1; j < arrInt.size(); j++) {
                if(arrInt.get(i) == arrInt.get(j)){
                    result = result + 1;
                    arrInt.remove(j);
                    arrInt.remove(i);
                    System.out.println(arrInt);
                }
            }
        }
        return result;
    }

    
}
