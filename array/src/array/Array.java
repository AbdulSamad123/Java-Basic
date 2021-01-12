/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;

/**
 *
 * @author mota bhai
 */
public class Array {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        int arr[]={2,3,3,4,5,4,3,2,3,4,5,4,4,23,2,2,2,2,3,4,5,6,7,8};
        int arr1[] = new int[5];
        arr1[0]=10;
        arr1[1]=20;
        arr1[2]=30;
        arr1[3]=40;
        arr1[4]=50;
        for(int i=0; i<arr.length; i++)
        {
            System.out.print(arr[i]);
        }
}
}