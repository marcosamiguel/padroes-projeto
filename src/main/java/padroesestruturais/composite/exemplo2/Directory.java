package padroesestruturais.composite.exemplo2;

import java.util.ArrayList;
import java.util.List;

public class Directory extends FileSystemItem{
    private String name;
    private List<FileSystemItem> children = new ArrayList<>();

    public Directory(String name) {
        this.name = name;
    }

    public void add(FileSystemItem item) {
        children.add(item);
    }

    public void remove(FileSystemItem item){
        children.remove(item);
    }

    @Override
    public void print(String indentation) {
        System.out.println(indentation + "Directory: " + name);
        for (FileSystemItem item : children) {
            item.print(indentation + "  ");
        }
    }
}
