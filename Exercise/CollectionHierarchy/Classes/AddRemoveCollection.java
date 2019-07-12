package Exercise.CollectionHierarchy.Classes;

import Exercise.CollectionHierarchy.Interfaces.AddRemovable;
import Exercise.CollectionHierarchy.Interfaces.Addable;


public class AddRemoveCollection extends Collection implements Addable, AddRemovable {

    public AddRemoveCollection() {
        super();
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


    @Override
    public String remove() {

        if (super.getCollectionSize() >0) {

            String lastItem = super.getItems().get(super.getCollectionSize() - 1);

            if (lastItem != null) {
                super.getItems().remove(super.getCollectionSize() - 1);
            }
            return lastItem;

        } else {
            throw new IllegalArgumentException("" +
                    "Fuck this shit!");
        }


    }
}
