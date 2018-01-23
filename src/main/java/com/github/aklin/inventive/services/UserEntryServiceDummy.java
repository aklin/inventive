package com.github.aklin.inventive.services;

import com.github.aklin.inventive.domain.concrete.users.User;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class UserEntryServiceDummy implements IUserEntryService {
	private final Map<Long, User> users;
	private final long currentUser;

	public UserEntryServiceDummy() {
		users = new HashMap<>();

		users.put((long) 1, new User(1, "JoreyVaan", "Jorey", "Vaan"));
		users.put((long) 2, new User(2, "EstelleMcCraine", "Estelle", "McCraine"));
		users.put((long) 3, new User(3, "FredPatrick", "Fred", "Patrick"));
		users.put((long) 4, new User(4, "GraehmePerello", "Graehme", "Perello"));
		users.put((long) 5, new User(5, "KaylaCharville", "Kayla", "Charville"));
		users.put((long) 6, new User(6, "FilideWooller", "Filide", "Wooller"));
		users.put((long) 7, new User(7, "NonahBruyett", "Nonah", "Bruyett"));
		users.put((long) 8, new User(8, "SoniaLeach", "Sonia", "Leach"));
		users.put((long) 9, new User(9, "DoreenMcConnel", "Doreen", "McConnel"));
		users.put((long) 10, new User(10, "AgustinDielhenn", "Agustin", "Dielhenn"));
		users.put((long) 11, new User(11, "CarriTalby", "Carri", "Talby"));
		users.put((long) 12, new User(12, "MarkRoos", "Mark", "Roos"));
		users.put((long) 13, new User(13, "LoreenRisen", "Loreen", "Risen"));
		users.put((long) 14, new User(14, "GwenethBugbee", "Gweneth", "Bugbee"));
		users.put((long) 15, new User(15, "AurlieStanworth", "Aurlie", "Stanworth"));
		users.put((long) 16, new User(16, "CamiSporner", "Cami", "Sporner"));
		users.put((long) 17, new User(17, "JonisMum", "Jonis", "Mum"));
		users.put((long) 18, new User(18, "KippyPoncet", "Kippy", "Poncet"));
		users.put((long) 19, new User(19, "AddiaHanne", "Addia", "Hanne"));
		users.put((long) 20, new User(20, "PrinzEmburey", "Prinz", "Emburey"));
		users.put((long) 21, new User(21, "BrewerAdamowicz", "Brewer", "Adamowicz"));
		users.put((long) 22, new User(22, "CourtnayKobke", "Courtnay", "Kobke"));
		users.put((long) 23, new User(23, "DwainLamming", "Dwain", "Lamming"));
		users.put((long) 24, new User(24, "ZabrinaAlston", "Zabrina", "Alston"));
		users.put((long) 25, new User(25, "SaundersMacLardie", "Saunders", "MacLardie"));
		users.put((long) 26, new User(26, "HueyUdie", "Huey", "Udie"));
		users.put((long) 27, new User(27, "LoryHowells", "Lory", "Howells"));
		users.put((long) 28, new User(28, "GeorgineDurnell", "Georgine", "Durnell"));
		users.put((long) 29, new User(29, "LettiKnowlden", "Letti", "Knowlden"));
		users.put((long) 30, new User(30, "VanniWarboys", "Vanni", "Warboys"));


		currentUser = new Random().nextInt(users.size());

	}

	@Override
	public List<User> listAll() {
		return new ArrayList<>(users.values());
	}

	@Override
	public User get(long id) {
		return users.get(id);
	}

	@Override
	public User getCurrentlyLoggedIn() {
		return users.get(currentUser);
	}

}
