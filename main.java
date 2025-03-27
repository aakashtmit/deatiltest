import org.json.JSONObject;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.ception;

public class main {
    public static void main(String[] args) {
        String jsonFilePath = "input.json";
        String outputFilePath = "output.txt";

        try {
            
            String content = new String(Files.readAllBytes(Paths.get(jsonFilePath)));
            JSONObject jsonObject = new 

            String concatenatedString = firstName + rollNumber;
            String md5Hash = generateMD5Hash(concatenatedString);

            try (FileWriter writer = new FileWriter(outputFilePath)) {
                writer.write(md5Hash);
            }

            System.out.println("MD5 Hash generated and written to output.txt: " + md5Hash);
        } catch (IOException | NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
    }

    private static String generateMD5Hash(String input) throws NoSuchAlgorithmException {
        MessageDigest mtoString();
    }
}
