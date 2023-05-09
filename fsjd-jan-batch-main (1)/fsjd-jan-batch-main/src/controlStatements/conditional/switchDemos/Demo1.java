package controlStatements.conditional.switchDemos;

import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) {
        //if-else: if no. of comparisons are less than or equal to 3
        // file type : 10
       /* String file = "excel";
        if(file=="excel"){

        } else if(file ==" pdf"){

        } else if(file=="txt")*/

        //switch : when we want to compare single value across multiple values
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the file type");
        String value = scanner.next();//PDF, txt, csv, excel, json, xml....
        //type of value : String, byte, short, int, char, wrapper classes[Byte, Character, Integer, Short,enum,
        // value  can be expression, variable, direct value, function call
        switch (value) {
            case "pdf":
                System.out.println("reading pdf");
                break;
            case "txt":
                System.out.println("reading txt");
                break;
            case "csv":
                System.out.println("reading csv");
                break;
            case "excel":
                System.out.println("reading excel");
                break;
            case "json":
                System.out.println("reading json");
                break;
            default:
                System.out.println("invalid file type");
                break;
        }
    }
}
