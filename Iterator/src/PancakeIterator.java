import java.util.ArrayList;

public class PancakeIterator implements MyIterator{

    int current = 0;
    ArrayList<MenuItem> items;

    public PancakeIterator(ArrayList<MenuItem> items){
        this.items = items;
    }

    public boolean hasNext(){
        if(current < items.size()){
            return true;
        }
        return false;
    }

    public MenuItem next(){
        MenuItem nexItem = items.get(current);
        current++;
        return nexItem;
    }

}
