import Exeptions.LoginException;
import Exeptions.PasswordException;


public class Main {
    public static void main(String[] args) {
        try {
            signUp("java_skypro_go", "D_1hWiKjjP_9", "D_1hWiKjjP_9");
        } catch (LoginException e) {
            System.out.println(e.getMessage());
        } catch (PasswordException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Method done!");
        }
    }

    public static void signUp(String login, String password, String confirmPassword) throws LoginException, PasswordException {
        if (!login.matches("[a-zA-Z0-9_]+")) {
            throw new LoginException("Invalid symbols in login");
        }
        if (login.length() > 20) {
            throw new LoginException("Login is too long");
        }
        if (!password.matches("[a-zA-Z0-9_]+")) {
            throw new PasswordException("Invalid symbols in password");
        }
        if (password.length() >= 20) {
            throw new PasswordException("Password is too long");
        }
        if (!password.equals(confirmPassword)) {
            throw new PasswordException("Invalid password");
        }
    }
}