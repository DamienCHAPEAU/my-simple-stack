package deqo.dcha.mysimplestack;

public class Item {

    int number;

    public Item getItem(Item item){
        return item;
    }

    public void setItem(Item item, int nItem){
        item.number = nItem;
    }

    //Test si Item est vide
    public boolean isEmpty(Item item){
        if(item!=null){
            return false;
        }
        else {
            return true;
        }
    }
}
