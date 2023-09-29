package Iterator.src;
public class MenuTestDive{
    public static void main(String[] args){
        Menu[] menus = new Menu[5];

        menus[0] = new DinerMenu();
        menus[1] = new PancakeHouseMenu();
        menus[2] = new PancakeHouseMenu();
        menus[3] = new DinerMenu();
        menus[4] = new DinerMenu();

        Waitress waitress = new Waitress(menus); 
        waitress.printMenus();
        
    }
}
    
