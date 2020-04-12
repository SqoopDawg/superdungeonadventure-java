/*
import Character.*;
import Dialogue.*;
import Item.*;
public class tester {

	public static void main(String[] args) throws InterruptedException {
		
		PlayerCharacter player = new PlayerCharacter();
		String backstory = "";
		String bartenderText = "";
		
		backstory = "A trading route runs through those lands. It is considered the fastest route from the northern kingdoms to the southern kingdoms.\n"
					+ "But almost no trader dares to travel on that route. Some still do but most take the longer roads to avoid passing through there.\n"
					+ "Those lands have been abandoned; barren; unoccupied.\nWhichever you prefer, but not many live there.\n"
					+ "There is a tavern that sits on the edge between those mysterious lands and the north.\n"
					+ "You come in from the...";
		DialogueTest.slowText(backstory,50);
		String directionChoice = "1) North\n"
				+"2) East\n"
				+"3) South\n"
				+"4) West\n";
		String[] directionResponse = {"...northern kingdoms.",
									  "...eastern mountains.",
									  "...southern deserts.",
									  "...western beaches."};
		DialogueTest.responseToPlayerChoice(directionChoice, directionResponse);
		backstory = "It's...";
		DialogueTest.slowText(backstory,50);
		String dayChoice = "1) Monday\n"
				+"2) Tuesday\n"
				+"3) Wednesday\n"
				+"4) Thursday\n"
				+"5) Friday\n"
				+"6) Saturday\n"
				+"7) Sunday\n";
		String[] dayResponse = {"...Monday...",
								  "...Tuesday...",
								  "...Wednesday...",
								  "...Thursday...",
								  "...Friday...",
								  "...Saturday...",
								  "...Sunday..."};
		DialogueTest.responseToPlayerChoice(dayChoice, dayResponse);
		String timeChoice = "1) Morning\n"
							+"2) Afternon\n"
							+"3) Night\n";
		String[] timeResponse = {"...in the morning.",
								"...during the afternoon.",
								"...at night."};
		DialogueTest.responseToPlayerChoice(timeChoice, timeResponse);
		backstory = "You open the door to the tavern. A fire roars in the fireplace even though it's still daylight outside.\n"
				 + "There aren't many windows so the fireplace and candles offer the only source of light.\n"
				 + "Even so, the lack of natural light offers a sort of barrier from the outside world.\n"
				 + "The smell of oaken furniture fills your nostrils.\n"
				 + "The tavern feels warm.\n"
				 + "It feels comfortable.\n"
				 + "It feels...safe.\n";
		DialogueTest.slowText(backstory,50);
		bartenderText = "You sit at the bar of the tavern. The sounds of conversations surround you as the bartender walks up to you.";
        DialogueTest.slowText(bartenderText,50);
        bartenderText = "\"What'll ya 'ave?\", he asks";
        DialogueTest.slowText(bartenderText,50);
        String drinkChoice = "1) I need an ale!\n"
        		+"2) The strongest spirit you can find.\n"
        		+"3) A glass of your finest wine, please.\n"
        		+"4) Just water.\n"
        		+"5) I'm not thirsty...\n";
        String[] barResponse = {"\"Never can go wrong with a cold one!\", says the bartender cheerfully.",
        						"\"Not much of a selection but I'll see what I can find\", the bartender says as "
        						+"he walks to the back. He returns with a delicate bottle.",
        						"\"Ah. A connoisseur\", the bartender quips as he uncorks a bottle.",
        						"The bartender grabs a glass. \"Not a drinker, huh?\", he comments.",
        						"\"Suit yourself\", says the bartender."};
        DialogueTest.responseToPlayerChoice(drinkChoice, barResponse);
        
        bartenderText = "\"So\", continues the bartender as he pours, \"what is it you do?\"";
        DialogueTest.slowText(bartenderText,50);
        String classChoice = "1) I'm a warrior off to meet someone. (Strength)\n"
        		+"2) I'm a student at the Mage's Academy conducting research. (Magic)\n"
        		+"3) I'm a rover wandering the lands for work. (Dexterity)\n";
        String[] classResponse = {"\"We've had quite a few of your kind passing through here!\", comments the bartender.",
        						  "\"Ohhh. A student eh?\", the bartender says in awe.",
        						  "\"When I was your age I did the same\", reminisces the bartender."};
        int r = DialogueTest.getResponseToPlayerChoice(classChoice, classResponse);
        if (r == 1) {
        	bartenderText = "\"Who is it you're plannin' on meetin'?\"";
        	DialogueTest.slowText(bartenderText,50);
        	String tierChoice = "1) My lord. He awaits at a kingdom far away. (Knight)\n"
            		+"2) A general. He sent out a contract. (Mercenary)\n"
            		+"3) The monks who live in the mountains close to here. (Paladin)\n";
        	String[] tierResponse = {"\"A lord you say? I never would've guessed you fer a knight!\", exclaims the bartender.",
					  "\"Another hired hand off to war eh?\", comments the bartender.",
					  "\"Really? Them monks still trainin' paladins?\", asks the bartender."};
        	int rr = DialogueTest.getResponseToPlayerChoice(tierChoice, tierResponse);
        	switch(rr) {
        	case(0) : player.setPlayerClass("Knight"); break;
        	
        	case(1) : player.setPlayerClass("Mercenary"); break;
        	
        	case(2) : player.setPlayerClass("Paladin"); break;
        	};
        }
        else if (r == 2) {
        	bartenderText = "\"What is it yer researchin'?\"";
        	DialogueTest.slowText(bartenderText,50);
        	String tierChoice = "1) I'm trying to get my hands on a dragons fire gland. (Pyromancer)\n"
            		+"2) Our perception on reality and how to manipulate it. (Illusionist)\n"
            		+"3) The medicinal properties of certain herbs. (Cleric)\n";
        	String[] tierResponse = {"\"You don't say? What more about fire do you mages want to learn?\", asks the bartender.",
					  "\"Complex stuff that is. Hope ye don't lose yer grasp on what's real while yer at it!\", the bartender jokes.",
					  "\"There hasn't been a doctor out these parts fer years.\", quips the bartender."};
        	int rr = DialogueTest.getResponseToPlayerChoice(tierChoice, tierResponse);
        	switch(rr) {
        	case(1) : player.setPlayerClass("Pyromancer"); break;
        	
        	case(2) : player.setPlayerClass("Illusionist"); break;
        	
        	case(3) : player.setPlayerClass("Cleric"); break;
        	};
        }
        else if (r == 3) {
        	bartenderText = "\"Where is it yer plannin' on goin'?\"";
        	DialogueTest.slowText(bartenderText,50);
        	String tierChoice = "1) Wherever my next target is. (Assassin)\n"
            		+"2) Somewhere where there's woods. Maybe closer to home. (Ranger)\n"
            		+"3) To whoever has the most money for me to take. (Thief)\n";
        	String[] tierResponse = {"\"....oh. Ye, uh, ye don't say.\", the bartender says nervously.",
					  "\"Haha! You really do remind me of meself when I was younger!\", the bartender glees.",
					  "\"Word of advise youngin': Get outta that line a work while ye can.\", the bartender lectures."};
        	int rr = DialogueTest.getResponseToPlayerChoice(tierChoice, tierResponse);
        	switch(rr) {
        	case(1): player.setPlayerClass("Assassin"); break;
        	
        	case(2): player.setPlayerClass("Ranger"); break;
        	
        	case(3): player.setPlayerClass("Thief"); break;
        	};
        }
        bartenderText = "\"What do they call you?\"";
        DialogueTest.slowText(bartenderText,50);
        player.setName();
        bartenderText = "\"" + player.getName() + " ya say?\"";
       	DialogueTest.slowText(bartenderText, 50);
       	bartenderText = "The bartender looks off in the distance before drawing his attention back at you.\n"
       					+ "\"Say\", starts the bartender, \"are ye familiar with that rumor goin' on 'round 'ere?\"";
       	DialogueTest.slowText(bartenderText, 50);
        
        
	}

}
*/
