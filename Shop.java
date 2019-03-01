import java.util.*;

public class Shop {

  private ArrayList<IPlay> myInstruments;
  private String shopName;

  public Shop(String name){
    this.shopName = name;
    this.myInstruments = new ArrayList<IPlay>();
  }

  public void addInstrument(IPlay instrument) {
    this.myInstruments.add(instrument);
  }

  public ArrayList<IPlay> getInstruments(){
    return this.myInstruments;
  }

  public static void main(String[] args){
    Shop theMusicShop = new Shop("The Music Shop");

    Violin v = new Violin();
    Piano p = new Piano();

    theMusicShop.addInstrument(v);
    theMusicShop.addInstrument(p);

    for (int i=0; i<theMusicShop.getInstruments().size(); i++ ) {
      System.out.println(theMusicShop.getInstruments().get(i).playNote());
    }
  }
}
