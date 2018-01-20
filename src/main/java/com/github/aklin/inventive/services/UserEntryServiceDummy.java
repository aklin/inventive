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

		users.put((long) 1, new User(1, "Jorey", "Vaan"));
		users.put((long) 2, new User(2, "Estelle", "McCraine"));
		users.put((long) 3, new User(3, "Fred", "Patrick"));
		users.put((long) 4, new User(4, "Graehme", "Perello"));
		users.put((long) 5, new User(5, "Kayla", "Charville"));
		users.put((long) 6, new User(6, "Filide", "Wooller"));
		users.put((long) 7, new User(7, "Nonah", "Bruyett"));
		users.put((long) 8, new User(8, "Sonia", "Leach"));
		users.put((long) 9, new User(9, "Doreen", "McConnel"));
		users.put((long) 10, new User(10, "Agustin", "Dielhenn"));
		users.put((long) 11, new User(11, "Carri", "Talby"));
		users.put((long) 12, new User(12, "Mark", "Roos"));
		users.put((long) 13, new User(13, "Loreen", "Risen"));
		users.put((long) 14, new User(14, "Gweneth", "Bugbee"));
		users.put((long) 15, new User(15, "Aurlie", "Stanworth"));
		users.put((long) 16, new User(16, "Cami", "Sporner"));
		users.put((long) 17, new User(17, "Jonis", "Mum"));
		users.put((long) 18, new User(18, "Kippy", "Poncet"));
		users.put((long) 19, new User(19, "Addia", "Hanne"));
		users.put((long) 20, new User(20, "Prinz", "Emburey"));
		users.put((long) 21, new User(21, "Brewer", "Adamowicz"));
		users.put((long) 22, new User(22, "Courtnay", "Kobke"));
		users.put((long) 23, new User(23, "Dwain", "Lamming"));
		users.put((long) 24, new User(24, "Zabrina", "Alston"));
		users.put((long) 25, new User(25, "Saunders", "MacLardie"));
		users.put((long) 26, new User(26, "Huey", "Udie"));
		users.put((long) 27, new User(27, "Lory", "Howells"));
		users.put((long) 28, new User(28, "Georgine", "Durnell"));
		users.put((long) 29, new User(29, "Letti", "Knowlden"));
		users.put((long) 30, new User(30, "Vanni", "Warboys"));


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
