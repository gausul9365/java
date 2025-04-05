import java.io.*;

// 💀 This class can be Serialized
class Player implements Serializable {
    private static final long serialVersionUID = 1L;

    String name;
    int level;
    transient int secretPower; // ❌ Won't be saved

    Player(String name, int level, int secretPower) {
        this.name = name;
        this.level = level;
        this.secretPower = secretPower;
    }

    void display() {
        System.out.println("Name: " + name + ", Level: " + level + ", SecretPower: " + secretPower);
    }
}

public class GameSave {

    public static void main(String[] args) {
        String filePath = "playerData.ser";

        // ⚙️ 1. Create a Player object
        Player p1 = new Player("GhostRider", 99, 999);

        // 💾 2. SERIALIZATION - Save object to file
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filePath))) {
            oos.writeObject(p1);
            System.out.println("🔥 Player data saved to file.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Before Deserialization:");
        p1.display();

        // 🧟 3. DESERIALIZATION - Read object back from file
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filePath))) {
            Player loaded = (Player) ois.readObject();

            System.out.println("\n⚡ After Deserialization:");
            loaded.display(); // Notice: secretPower will be 0 (transient ignored)
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
