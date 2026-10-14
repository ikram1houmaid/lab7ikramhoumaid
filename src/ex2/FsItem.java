package ex2;

public abstract class FsItem {
    protected String name;

    public FsItem(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    /** Retourne la taille en octets */
    public abstract long getSize();

    @Override
    public String toString() {
        return name + " (" + getSize() + " B)";
    }
}