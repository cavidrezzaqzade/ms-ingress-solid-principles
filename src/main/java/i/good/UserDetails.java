package i.good;

/**
 * @author caci
 */

public interface UserDetails {
    User loadByUserName(String username);
}
interface UserDetailsManager {
    boolean addUser();
    boolean deleteUser(String username);
    boolean revokeUser(String username);
}
class User {
    String username;
}
