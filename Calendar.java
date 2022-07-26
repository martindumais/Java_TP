public class Calendar{
public static void main(String[]args){
  String c="\nJe suis un calendrier";
  String c1="inachevé";
  String c2= "\n Au  revoir          Utilisateur  !  ";
System.out.println(c);
CalendarMonth jan=new CalendarMonth(4);
System.out.println(("\nAttention:").concat(c.replace("un calendrier","").trim()).concat(" ").concat(c1.toUpperCase()).concat("."));
System.out.println(("\nAttention:").concat(c.replace("un calendrier","").trim()).concat(" ").concat(c1).concat(".").length()+" caractères dans la chaine.");
System.out.println(c2.toUpperCase());System.out.println(c2.toLowerCase());System.out.println(c2.trim());
System.out.println(("\nLe caractère 28 de la chaines est: ")+("Attention: ").concat(c.replace("un calendrier","").trim()).concat(" ").concat(c1).concat(".").charAt(27));
System.out.println(c2.substring(22,33));//substring -> (noDebut-1,noFin)=>par rapport au curseur. \n -> est considéré comme un caractère!
System.out.println(c1.substring(1,1));System.out.println(c1.substring(1,2));System.out.println(c1.substring(1,3));
System.out.println(c1==c2);System.out.println(c1.equals(c2));
System.out.println(c1.compareTo(c2));System.out.println(c1.compareTo("inachevé"));
}


}
