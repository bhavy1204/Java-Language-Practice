
import java.io.*;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Password {

    private static final String FILE_NAME = "admin_password.txt";

    // Hash the password using SHA-256
    public static String hashPassword(String password) {
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            byte[] hashedBytes = md.digest(password.getBytes());

            StringBuilder hexString = new StringBuilder();
            for (byte b : hashedBytes) {
                hexString.append(String.format("%02x", b));
            }
            return hexString.toString();
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException("Error hashing password", e);
        }
    }

    // Save hashed password to a file
    public static void savePassword(String hashedPassword) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME))) {
            writer.write(hashedPassword);
        } catch (IOException e) {
            System.out.println("Error saving password: " + e.getMessage());
        }
    }

    // Read hashed password from the file
    public static String getStoredPassword() {
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
            return reader.readLine();
        } catch (IOException e) {
            System.out.println("Error reading password file: " + e.getMessage());
            return null;
        }
    }
}
