package ex2;

public class FileItem extends FsItem {
    private long size; // en octets

    public FileItem(String name, long size) {
        super(name);
        this.size = size;
    }

    @Override
    public long getSize() {
        return size;
    }
}