package sample;

public class multiArray {

    public static void main(String[] args) {
        var multiArray = new int[4][3];
        
        for (var i = 0; i < multiArray.length; i++) {
             for (var j = 2; j < multiArray[i].length; j++) {
                    multiArray[i][j] =i+j ;
             }
        }

             for (var i = 0; i < multiArray.length; i++) {
                 for (var j = 2; j == 2; j++) {
                     System.out.println(multiArray[i][j] + " ");
                     
                     
                 }
                 System.out.println();
        }
       }
   }
   
