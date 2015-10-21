package com.github.mylibrary.module;

/**
 * Created by x3mib_000 on 21.10.2015.
 */
public class ArrayObject {

    private Object[] arrObject = new Object[0];
    private int lengthArray = 0;
    private int lastIndex = 0;

    private void reSize(int size) {
        Object[] newArr = new Object[lengthArray + size];
        if (size > 0) {
            for (int i = 0; i < lengthArray; i++) {
                newArr[i] = arrObject[i];
                lastIndex = i + 1;
            }
        } else {
            for (int i = 0; i < lengthArray + size; i++) {
                newArr[i] = arrObject[i];
            }
        }

        //lastIndex += 1;
        arrObject = newArr;
        lengthArray += size;
    }

    public void addElem(int elem){
        reSize(1);

        arrObject[lastIndex] = elem;
    }

    public void addElem(String elem){
        reSize(1);

        arrObject[lastIndex] = elem;
    }

    public void addElem(ArrayObject elem){
        reSize(1);

        arrObject[lastIndex] = elem;
    }

    public Object getArrObject(int index) {
        return arrObject[index];
    }

}
