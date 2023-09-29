import java.util.ArrayList;

public class Waitress{
    ArrayList<Menu> menus;

    public Waitress(ArrayList<Menu> menus){
        this.menus = menus;
    }  

    public void printMenus(){

        for (int i = 0; i < menus.size(); i++) {
            MyIterator currentIterator = menus.get(i).createMyIterator();

            System.out.println("MENU " + i);
            printMenu(currentIterator);   
            System.out.println("\n");   
        }
    }   

    private void printMenu(MyIterator MyIterator){
        while(MyIterator.hasNext()){
            MenuItem menuItem = (MenuItem)MyIterator.next();
            System.out.print(menuItem.getName() + ", ");
            System.out.print(menuItem.getPrice() + " -- ");
            System.out.println(menuItem.getDescription());
        }
    }
}