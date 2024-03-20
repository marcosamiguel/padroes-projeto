package padroesestruturais.composite.exemplo2;

public class File extends FileSystemItem {

    private String name;

    public File(String name) {
        this.name = name;
    }

    @Override
    public void print(String indentation) {
        System.out.println(indentation + "File: " + name);
    }
}
