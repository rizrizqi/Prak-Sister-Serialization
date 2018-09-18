/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package mypkg;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author LAB_TI
 */
public class PraktikumNo3 {
    public static void main(String[] args) throws IOException{
        List<Participant> participants = new ArrayList<Participant>();
        SerializationDemo demo = new SerializationDemo();
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));

        for (;;){
            System.out.println("Masukkan nama depan: ");
            String c = buf.readLine();
            System.out.println("Masukkan Nama Belakang : ");
            String d = buf.readLine();
            System.out.println("Masukan Umur");
            int e = Integer.parseInt(buf.readLine());
            if(c.equalsIgnoreCase("exit")|| d.equalsIgnoreCase("exit")|| e == 0){
                System.out.println("System close!");
                break;
            } else {
                participants.add(new Participant(c, d, e));
                System.out.println("Participant : "+participants);
                demo.serialize(participants, "PraktikumNo3.ser");
                System.out.println("Serialization is done");
            }
        }

        System.out.println("Deserialize Object");
        List<Participant> newList = demo.deserialize("PraktikumNo3.ser");
        System.out.println("New List : "+newList);
    }

}
