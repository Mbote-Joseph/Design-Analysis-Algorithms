package com.designanalysis;

/**
 * @author raphael
 * Abstract data type that is not affected when the element is deleted or inserted elsewhere(Unlike the index)
 * @param <E>
 */
public interface Position<E>{
    E getElement() throws IllegalArgumentException;
}
