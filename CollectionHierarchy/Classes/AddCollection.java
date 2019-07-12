package CollectionHierarchy.Classes;

import CollectionHierarchy.Interfaces.Addable;


public class AddCollection extends Collection implements Addable {

    public AddCollection() {
        super();
    }


    @Override
    public int add(String string) {
        if (Validator.collectionSize(super.getCollectionSize())) {

            super.getItems().add(string);
            return super.getCollectionSize()-1;

        } else {
            throw new IllegalArgumentException("" +
                    "Fuck this shit!");
        }
    }
}



