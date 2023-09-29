import java.util.ArrayList;

public class MenuTestDive{
    public static void main(String[] args){
        ArrayList<Menu> menus = new ArrayList<Menu>();

        menus.add(new DinerMenu());
        menus.add(new PancakeHouseMenu());
        menus.add(new DinerMenu());
        menus.add(new PancakeHouseMenu());
        menus.add(new DinerMenu());

        Waitress waitress = new Waitress(menus); 
        waitress.printMenus();
        
    }
}
    
