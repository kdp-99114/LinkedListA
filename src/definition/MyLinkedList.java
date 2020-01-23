package definition;

import adt.LinkedListADT;

public class MyLinkedList<E> implements LinkedListADT<E> {

    private Node<E> head = null;
    private int size = 0;

    @Override
    public void add(int index, E item) {

    }

    private static class Node<E> {
        private E data;
        private Node<E> next;

        private Node(E data) {
            this.data = data;
        }

        private Node(E data, Node<E> next) {
            this.data = data;
            this.next = next;
        }

        private E getData() {
            return data;
        }

        private Node<E> getNext() {
            return next;
        }
    }
}
