package controlStatements.looping.forDemos.patterns;

public class Pattern16 {
    public static void main(String[] args) {
        //Print ASCII values and their equivalent characters. ASCII value vary from 0 to 255.
        for (int character = 0; character <=255 ; character++) {
            System.out.println(character+"\t"+ (char)character);
        }
    }
}
