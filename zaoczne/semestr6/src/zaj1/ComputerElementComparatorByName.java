package zaj1;

import java.util.Comparator;

/**
 * Created by Krzysztof Podlaski on 16.02.2019.
 */
public class ComputerElementComparatorByName
        implements Comparator<ComputerElement> {

    @Override
    public int compare(ComputerElement a, ComputerElement b) {
        return a.getName().compareToIgnoreCase(b.getName());
    }
}
