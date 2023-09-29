package Iterator.src;

public class DinnerIterator implements MyIterator{

    int current = 0;
    MenuItem[] items;

    public <T> void SetItemsList(T list){
        this.items = items.getClass();
    }

    public boolean hasNext(){
        if(current < items.length){
            return true;
        }
        return false;
    }

    public MenuItem next(){
        MenuItem nexItem = items[current];
        current++;
        return nexItem;
    }
}