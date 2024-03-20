package padroesestruturais.composite;

import org.junit.jupiter.api.Test;
import padroesestruturais.composite.exemplo2.Directory;
import padroesestruturais.composite.exemplo2.File;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class FileSystemTest {

    @Test
    void testarFileSystem() {
        Directory root = new Directory("root");
        Directory home = new Directory("home");
        Directory user = new Directory("user");

        File file1 = new File("MM.txt");
        File file2 = new File("MM2.xls");
        File file3 = new File("MM3.json");

        root.add(home);
        home.add(user);

        user.add(file1);
        user.add(file2);

        root.add(file3);

        root.print("");

        assertNotNull(root);

    }

}
