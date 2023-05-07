package i.bad;

/**
 * This is a violation of interface segregation principle. Because if any class implements UserDetails interface, it has to implement all methods of interface.
 * @author caci
 */

public interface UserDetails {
    User loadByUserName(String username);
    boolean addUser();
    boolean deleteUser(String username);
    boolean revokeUser(String username);
}
class User {
    String username;
}

