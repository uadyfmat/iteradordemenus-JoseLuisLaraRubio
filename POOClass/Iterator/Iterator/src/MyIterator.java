package Iterator.src;

public interface MyIterator {
    public <T> void SetItemsList(T list);
    public boolean hasNext();
    public MenuItem next();
}