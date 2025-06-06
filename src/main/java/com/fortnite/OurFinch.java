package com.fortnite;

import com.birdbrain.Finch;

public class OurFinch {
    public static void main(String[] args) {
        Finch bird = new Finch();


        bird.print("HELLO WORLD");
        bird.pause(4);

        // lights up beak red, then moves finch forward then back the same distance
        bird.setBeak(100, 0, 0);
        bird.setMove("F", 25, 100);
        bird.setMove("B", 25, 30);
        bird.pause(1);
        bird.setBeak(0, 0, 0);
        bird.pause(0.5);

        // sets the beak green then finch spins left
        // then sets beak purple and finch spins right
        bird.setBeak(0, 100, 0);
        bird.setTurn("L", 360, 50);
        bird.setBeak(100, 15, 80);
        bird.setTurn("R", 360, 50);
        bird.setBeak(0, 0, 0);

        // finch shakes left and right three times
        bird.setTail ("all", 0, 0, 100);
        int i = 0;
        while (i <= 3){
        bird.setTurn("L", 25, 100);
        bird.setTurn("R", 25, 100);
        i++;
        }

        bird.setTurn("R", 180, 100);

        // finch flashes tail lights in ranbow colors three times
        int x = 0;
        while ( x <= 3){
        bird.setTail (1, 100, 0, 0);
        bird.setTail (2, 0, 100, 0);
        bird.setTail (3, 0, 0, 100);
        bird.setTail (4, 100, 100, 100);
        bird.pause(0.5);
        bird.setTail ("all", 0, 0, 0);
        bird.pause(0.5);
        x++;
        }

        bird.setTurn("R", 180, 100);

        // displays a smiley face on the microbit display
        // then prints "BYE" on the microbit display
        int[] picture = { 0, 0, 0, 0, 0,
        0, 1, 0, 1, 0,
        0, 0, 0, 0, 0,
        1, 0, 0, 0, 1,
        0, 1, 1, 1, 0};
        bird.setDisplay(picture);
        bird.pause(3.5);
        bird.print("BYE");
        bird.pause(2);


        // stops and disconnects the finch
        bird.stopAll();
        bird.stop();
        bird.disconnect();
    }
}