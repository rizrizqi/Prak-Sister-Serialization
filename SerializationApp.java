/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mypkg;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author LAB_TI
 */
public class SerializationApp {

    public static void main(String[] args) {
        List<Participant> participants = new ArrayList<Participant>();
        participants.add(new Participant("Dee", "aja", 22));
        participants.add(new Participant("Ucil", "Tok", 19));
        participants.add(new Participant("Emak", "Astri", 20));
        participants.add(new Participant("Tante", "Kiki", 20));

        System.out.println("Participants : " + participants);

        SerializationDemo demo = new SerializationDemo();
        demo.serialize(participants, "participantData.ser");
        System.out.println("serialization is done");

        System.out.println("Deserialization Object...");
        List<Participant> newList = demo.deserialize("participantData.ser");
        System.out.println("New List: "+ newList);

    }
}
