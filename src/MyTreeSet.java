

import java.util.ArrayList;
import java.util.function.Consumer;

public interface MyTreeSet {
    /*Eleman ekle*/

    /*Eleman var mi diye kontrol et*/
    public boolean contains(int el);

    /*Eleman sil başarılıysa true dön eleman bulunamadıysa false dön*/

    public void traverse(final Consumer<Integer> traversal);

    public MyTreeSet getRightChild();

    public void setRightChild(final MyTreeSet rightChild);

    public MyTreeSet getLeftChild();

    public void setLeftChild(final MyTreeSet leftChild);

    public void updateValue(int el, int el2);

    /*Boyutunu dön*/
    public int size();

    /*Elemanları ArrayList'e topla dön*/
    public ArrayList<Integer> toArray();

    public boolean getRoot();

	//düğümün değerini al
    public int getValue();
	
	// düğümün değerini değiştir.
    public void setValue(int value);

    /*Virgül seperatörü kullanarak her bir elemanı yaz örn: 1,2,357,2123,6,7*/
    @Override
    public String toString();
	
	
	//Ağaca elememan eklemek için kullanılacak fonksiyon
    void add(int value);

    void setStrategy(String strategy);

}
