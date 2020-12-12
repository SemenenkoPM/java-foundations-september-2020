package ru.itsjava.collection.list.mylinkedlist;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Node {

    private Object value;
    private Node next;

}
