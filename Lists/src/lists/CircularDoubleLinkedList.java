/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lists;

/**
 *
 * @author samaniw
 */
public class CircularDoubleLinkedList<T extends Number & Comparable> implements Ilist<T> {
    
    DoubleNode<T> head;
    
    public CircularDoubleLinkedList() {
        head = null;
    }
    
    @Override
    public boolean isEmpty() {
        return head == null;
    }
    
    
    private DoubleNode<T> addNode(T d){
        DoubleNode<T> newNode = new DoubleNode<>(d);
        if (isEmpty()) {
            head = newNode;
            newNode.setNextNode(newNode);
            newNode.setPreviousNode(newNode);
        } else {
            newNode.setPreviousNode(head.getPreviousNode());
            newNode.setNextNode(head); 
            head.getPreviousNode().setNextNode(newNode);
            head.setPreviousNode(newNode);    
        }
        return newNode;
    }
    
    
    @Override
    public void add(T d) {
        head = addNode(d);
    }
    
    @Override
    public void addLast(T d) {
        addNode(d);
    }
    
    @Override
    public void addOrdered(T d) {
        if (isEmpty()) {
            add(d); 
        }else if(head.getData().compareTo(d) > 0){
            add(d);
        }else{
            DoubleNode<T> current = head;
            while (current.getNextNode() != head && 
                    current.getNextNode().getData().compareTo(d) < 0) {
                current = current.getNextNode();
            }
            DoubleNode<T> newNode = new DoubleNode<>(d);
            newNode.setNextNode(current.getNextNode());
            if(current.getNextNode() == current.getPreviousNode()){
                newNode.setPreviousNode(current);
                current.getNextNode().setPreviousNode(newNode);
                current.setNextNode(newNode);
                
            }else{
                DoubleNode<T> anterior = current.getPreviousNode();
                newNode.setPreviousNode(anterior);
                anterior.setNextNode(newNode);
                current.getNextNode().setPreviousNode(newNode);
            }         
        }
        
        //Agregar datos ordenados sin repetir valor
        //(si el dato ya se encuentra en la lista, no ingresarlo y mostrar advertencia).
    }
    
    @Override
    public void delete() {
        if (isEmpty()) {
            System.out.println("Lista vacia");
        } else {
            head.getPreviousNode().setNextNode(head.getNextNode());
            head.getNextNode().setPreviousNode(head.getPreviousNode());
            head = head.getNextNode();            
        }

        //Eliminar el primer dato.
    }
    
    @Override
    public void deleteLast() {
        head.getPreviousNode().getPreviousNode().setNextNode(head);
        head.setPreviousNode(head.getPreviousNode().getPreviousNode());

        //Eliminar el último dato.
    }

    /**
     * Mostrar los datos de forma descendente.
     *
     * @return LIsta de datos en orden descendente
     */
    public String showDataDesc() {
        if (isEmpty()) {
            return "Lista vacia";
        } else {
            String data = "";
            DoubleNode<T> tail = head.getPreviousNode();
            for (DoubleNode<T> i = tail; i != head; i = i.getPreviousNode()) {
                data += i.getData() + " ";
            }
            return data += head.getData();
            
        }
    }
    
    @Override
    public String showData() {
        if (isEmpty()) {
            return "Lista vacia";
        } else {
            String data = "";
            DoubleNode<T> tail = head.getPreviousNode();
            for (DoubleNode<T> i = head; i != tail; i = i.getNextNode()) {
                data += i.getData() + " ";
            }
            return data += tail.getData();
            
        }
    }
    
}
