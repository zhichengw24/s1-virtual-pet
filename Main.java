import javax.swing.*;

class Main {
  public static void main(String[] args) {
    VirtualPet p= new VirtualPet();

    String s = (String)JOptionPane.showInputDialog(
                    new JFrame(),
                    "eat or run?",
                    "Choose your Adventure",
                    JOptionPane.PLAIN_MESSAGE
    );
    System.out.println(s);
    if(s.equals("eat"))
      p.feed();
    if(s.equals("run"))
      p.exercise();
    

  }
}