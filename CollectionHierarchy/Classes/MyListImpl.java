package CollectionHierarchy.Classes;

import CollectionHierarchy.Interfaces.AddRemovable;
import CollectionHierarchy.Interfaces.Addable;
import CollectionHierarchy.Interfaces.MyList;


public class MyListImpl extends Collection implements MyList, AddRemovable, Addable {


    public MyListImpl() {
        super();
    }

    @Override
    public int getUsed() {
        return super.getCollectionSize();
    }

    @Override
    public String remove() {
        if ((super.getCollectionSize())> 0) {
            String firstItem = super.getItems().get(0);

            if (super.getItems().size() > 0) {
                super.getItems().remove(0);
            } else
                return null;

            return firstItem;
        }else {
            throw new IllegalArgumentException("" +
                    "Fuck this shit!");
        }
    }


    @Override
    public int add(String string) {
        if (Validator.collectionSize(super.getCollectionSize())) {
            super.getItems().add(0, string);
            return 0;

        } else {
            throw new IllegalArgumentException("" +
                    "Fuck this shit!");
        }


    }
}
