public class Game{
public static void main (String[]args){
System.out.println("\nListe des joueurs:");
Gamer player1=new Gamer("Martin");
Gamer player2=new Gamer("Nadia", "Feuille");
Gamer player3= new Gamer("Marti","Feuille");
Gamer.play(player2, player3);
Gamer.play(player3, player1);
}}
