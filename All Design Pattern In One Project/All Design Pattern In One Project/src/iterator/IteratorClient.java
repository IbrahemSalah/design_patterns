package iterator;

import java.util.Iterator;

public class IteratorClient {

    CustomIterable customIterable = new CustomIterable();

    public IteratorClient() {
        customIterable.addElement("a");
        customIterable.addElement("bb");
        customIterable.addElement("ccc");
        customIterable.addElement("dddd");
        customIterable.addElement("eeeee");
        customIterable.addElement("ffffff");

        Iterator externalIterator = customIterable.getExternalIterator();

        while (externalIterator.hasNext()){
            System.out.println(externalIterator.next());
        }
    }

    public void IterateUsingInternalIterator(){
        Iterator internalIterator= customIterable.getInternalIterator();

        while (internalIterator.hasNext()){
            System.out.println(internalIterator.next());
        }
    }
}
