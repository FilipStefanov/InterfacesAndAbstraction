package Exercise.CollectionHierarchy.Classes;

import java.util.ArrayList;
import java.util.List;

public abstract class Collection {
    private static final int maxSize = 100;
    private List<String> items;

    protected Collection() {
        this.items = new ArrayList<>(maxSize);
    }

    protected int getMaxSize() {
        return maxSize;
    }

    protected int getCollectionSize() {
        return this.items.size();
    }

    protected List<String> getItems() {
        return this.items;
    }
}
