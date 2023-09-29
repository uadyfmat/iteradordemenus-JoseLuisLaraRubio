package Iterator.src;

public class Waitress{
    Menu[] menus;

    public Waitress(Menu[] menus){
        this.menus = menus;
    }  

    public void printMenus(){

        for (int i = 0; i < menus.length; i++) {
            MyIterator currentIterator = menus[i].createMyIterator();
            currentIterator.SetItemsList(menus[i].getMenuItems());

            System.out.println("MENU " + i);
            printMenu(iterator);
          
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