package lukaszse;

import java.io.*;
import java.util.Scanner;

public class Palindrom {

    private StringBuffer text;
    private Scanner sc = new Scanner(System.in);
    private PrintWriter pw = null;

    public Palindrom() {
        this.text = this.enterText();
        this.saveTofile("plik.txt");
    }


    public boolean isPalindrome(){
        StringBuffer temp = (new StringBuffer(text)).reverse();
        if(this.text.toString().equals(temp.toString()))
            return true;
        else
            return false;
        }

    public StringBuffer enterText(){
        System.out.println("\nPodaj jakiś tekst, następnie naciśnij enter aby zatwierdzić: ");
        StringBuffer temp = new StringBuffer(sc.nextLine());
        return temp;
    }


    public void saveTofile(String fileName){
        try{
            this.pw = new PrintWriter(
                            new FileWriter(fileName, true));

            if(isPalindrome())
                this.pw.println(text+": PALINDROM");
            else
                this.pw.println(text+": NIE PALINDROM");
        } catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        } catch (IOException e){
            System.out.println(e.getMessage());
        } finally {
            if(pw != null)
                pw.close();
        }
    }
}
