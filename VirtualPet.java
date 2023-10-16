/* Virtual Pet, version 2
 * 
 * @author Ratchet
 * @author ?
 */

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class VirtualPet {
    
    VirtualPetFace face;
    int hunger = 0;   // how hungry the pet is.
    int tiredness = 0;
    int mood = 0;
    int health = 100;
    
    // constructor
    public VirtualPet() {
        face = new VirtualPetFace();
        face.setImage("normal");
        face.setMessage("Hello.");
    }
    
    public void feed() {
        if (hunger > 10) {
            hunger = hunger - 10;
        } else {
            hunger = 0;
        }
        tiredness = tiredness + 22;
        if (tiredness > 15) {
            face.setMessage("I'm... too... sleepy...");
            sleep();
        } else {
            face.setMessage("Yum, thanks");
            face.setImage("normal");
        }
    }
    
    public void exercise() {
        hunger = hunger + 3;
        tiredness = tiredness + 1;
        if (tiredness > 15) {
            face.setMessage("I'm... too... sleepy...");
        }
        else if (hunger > 12) {
            face.setMessage("urk, I'm too hungry!");
            face.setImage("dead");
        } else {   
            face.setMessage("1, 2, 3, jump.  Whew.");
            face.setImage("tired");
        }
    }
    
    public void sleep() {
        hunger = hunger + 1;
        tiredness = 10;
        if (tiredness > 12) {
            face.setMessage("zzzzzzzzzz");
            face.setImage("asleep");
            try {
                Thread.sleep(1000); //milliseconds
            } catch(Exception e){
                face.setMessage("awww, I got too hungry!");
                face.setImage("dead");
            }
        } else {
            face.setMessage("zzzzzzzzzz");
            face.setImage("asleep");
        }
    
    }

    public void pet() {
        mood = mood + 1;
        if (mood >= 0) {
            face.setImage("love");
        } else {
            face.setImage("verysad");
        }
    }

    public void forceFeedGasoline() {
        if (health > 60) {
            mood = mood - 100;
            hunger = 0;
            health = health - 40;
            face.setMessage("What is wrong with you");
            face.setImage("sick");
        } else if (health > 40) {
            mood = mood - 100;
            hunger = 0;
            health = health - 40;
            face.setImage("dead");
            health = 0;
        } else {
            face.setImage("maxresdefault");
        }
    }




    public void dropInAcid() {
        face.setMessage("- - - - ----------");
        face.setImage("skeleton");
    }

    public void forceFeedCovid() {
        tiredness = tiredness + 19;
        face.setMessage("I feel sick");
        face.setImage("verysick");
    }


    public void coffinDance() {
        face.setImage("maxresdefault");
    }

    public void guessNumber1to10() {
        int value = (int)(Math.random()*11);
        face.setImage("happy");
        face.setMessage("I am guessing " + value);
        String ans = (String)JOptionPane.showInputDialog(
                    new JFrame(),
                    "Am I correct?",
                    "Ask",
                    JOptionPane.PLAIN_MESSAGE);
        System.out.println(ans);
        if(ans.equals("yes"))
            face.setImage("ecstatic");
        if(ans.equals("yes"))
            face.setMessage("Yay");
        if(ans.equals("no"))
            face.setImage("sad");
        if(ans.equals("no"))
            face.setMessage("Damn it");
        }
    }



 // end Virtual Pet
