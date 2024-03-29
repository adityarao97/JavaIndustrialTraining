package com.aditya;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReaderDemo {
    public static void main(String[] args) {
        try(FileReader fr = new FileReader("states.txt");BufferedReader br = new BufferedReader(fr))
        {
           String line = br.readLine();
            while(line!=null) {
                System.out.println(line);
                line = br.readLine();
            }
        }
        catch(FileNotFoundException e){
        e.printStackTrace();
        }
        catch(IOException e) {
            e.printStackTrace();
        }
    }
}
