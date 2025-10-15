package pckg_s_fst;

import java.util.List;

public abstract class Sorter<E> {

    protected List<E> lst;
    protected SortPrinciple sortPrinciple;

    protected Sorter(List<E> someLst, sortPrinciple sortPrinciple){
        this.lst = someLst;
    }

    protected void setListToSort(List<E> lst){
        this.lst = lst;
    }
    protected abstract void performSorting();
}
