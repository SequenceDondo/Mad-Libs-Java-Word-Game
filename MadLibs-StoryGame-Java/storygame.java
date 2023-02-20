public class MadLibs {
  /*
  Mad Libs story game, a short story with blank spaces that a player can fill in. 
  Author: SequenceD
  Date: 20/02/2023
  */
  	public static void main(String[] args){
			
			//Assignment Variables
			String name1 = "";
      String adjective1 = "";
      String adjective2 = "";
      String adjective3 = ""; 
      String verb1 = "";
      String noun1 = "";
      String noun2 = "";
      String noun3 = "";
      String noun4 = "";
      String noun5 = "";
      String noun6 = "";
      String name2 = "";
      int number = 0;
      String place1 = "";

      
      //The template for the story
      String story = "This morning "+name1+" woke up feeling "+adjective1+". 'It is going to be a "+adjective2+" day!' Outside, a bunch of "+noun1+"s were protesting to keep "+noun2+" in stores. They began to "+verb1+" to the rhythm of the "+noun3+", which made all the "+noun4+"s very "+adjective3+". Concerned, "+name1+" texted "+name2+", who flew "+name1+" to "+place1+" and dropped "+name1+" in a puddle of frozen "+noun5+". "+name1+" woke up in the year "+number+", in a world where "+noun6+"s ruled the world.";

			//Print the story
      System.out.println(story);
    }       
}
