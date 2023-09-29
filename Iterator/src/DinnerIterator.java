
public class DinnerIterator implements MyIterator{

    int current = 0;
    MenuItem[] items;

    public DinnerIterator(MenuItem[] items){
        this.items = items;
    }

    public boolean hasNext(){
        if(current < items.length && items[current] != null){
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