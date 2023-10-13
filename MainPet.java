import javax.swing.*;

class MainPet {
  public static void main(String[] args) {
    VirtualPet p= new VirtualPet();

    while (1 == 1){
      String s = (String)JOptionPane.showInputDialog(
                      new JFrame(),
                      "enter command?",
                      "Choose your Adventure",
                      JOptionPane.PLAIN_MESSAGE
      );
      System.out.println(s);
      if(s.equals("eat"))
        p.feed();
      if(s.equals("run"))
        p.exercise();
      if(s.equals("pet"))
        p.pet();
      if(s.equals("forceFeedGasoline"))
        p.forceFeedGasoline();
      if(s.equals("dropInAcid"))
        p.dropInAcid();
      if(s.equals("forceFeedCovid"))
        p.forceFeedCovid();
    }
  }
    

  
}