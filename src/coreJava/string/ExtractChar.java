package coreJava.string;

public class ExtractChar {
 public static void extractChar( char [] arr){

 for(char ch :arr){
  if(Character.isLetter(ch)){
   System.out.println(ch);
  }
 }

 }

 public static void main(String[] args) {
  char [] arr={'a','9','8','z','b','$','c'};
  extractChar(arr);
 }

}
