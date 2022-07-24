import business.concretes.UserManager;
import business.ui.Login;
import core.utilities.adapter.GoogleAdapter;
import core.utilities.patterns.RegexMatches;
import dataAccess.concretes.UserRepository;
import entities.concretes.User;

public class Main {
    public static void main(String[] args) {


        User user1 = new User();
        user1.setId(1);
        user1.setFirstName("Ali Gökberk");
        user1.setLastName("Uğuz");
        user1.setEmail("aligokberkuguz94@gmail.com");
        user1.setPassword("1112223334");

        UserManager userManagerOptional = new UserManager(new RegexMatches(),new UserRepository(),new GoogleAdapter());
        userManagerOptional.loginWithGoogle(user1.getEmail());



        UserManager userManager = new UserManager(new RegexMatches(),new UserRepository());
        userManager.add(user1);

        userManagerOptional.loginWithGoogle("aligo@yahoo.com");

        UserManager userManager1 = new UserManager(new RegexMatches(),new UserRepository());
        Login login = new Login(userManager1);
        login.login(user1.getEmail(),user1.getPassword());

    }
}