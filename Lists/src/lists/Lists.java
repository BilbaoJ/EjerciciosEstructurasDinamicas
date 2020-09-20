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
public class Lists {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        SingleLinkedList<Integer> miListaS = new SingleLinkedList<>();
        miListaS.addLast(11);
        miListaS.addLast(33);
        miListaS.addLast(22);
        miListaS.addLast(44);
        miListaS.addLast(55);
        System.out.println("El número mayor de la lista es: " + miListaS.getMaj());
        System.out.println("El número menor de la lista es: " + miListaS.getMin());
        System.out.println("Datos de la lista simple " + miListaS.showData());
        System.out.println("El promedio es: " + miListaS.getAverage());
        miListaS.deleteLast();
        System.out.println("Datos de la lista simple " + miListaS.showData());
        System.out.println("El promedio es: " + miListaS.getAverage());
        System.out.println("El número menor de la lista es: " + miListaS.getMin());
        System.out.println("El número mayor de la lista es: " +miListaS.getMaj());
        System.out.println();
        
        //pruebas de lista enlazada doble
        DoubleLinkedList<Integer> miListaD = new DoubleLinkedList<>();
        miListaD.addOrdered(1);
        miListaD.addOrdered(3);
        miListaD.addOrdered(5);
        miListaD.addOrdered(4);
        miListaD.addOrdered(2);

        System.out.println("Datos de la lista enlazada doble: "
                + miListaD.showData());
        System.out.println("Existe el número 6 en la lista? " + miListaD.exist(6));
        System.out.println("Existe el número 2 en la lista? " + miListaD.exist(2));
        miListaD.delete();
        System.out.println("Datos de la lista enlazada doble despúes de eliminar"
                + " el primer dato: "
                + miListaD.showData());
        System.out.println();
        
        CircularSingleLinkedList<Integer> circular1 = new CircularSingleLinkedList<>();
        circular1.addLast(55);
        circular1.addLast(27);
        circular1.addLast(15);
        circular1.addLast(12);
        System.out.println("Lista 1: "+ circular1.showData());
        circular1.deleteLast();
        System.out.println("Lista 1 después de borrar el último dato: "
                + circular1.showData());
        CircularSingleLinkedList<Integer> circular2 = new CircularSingleLinkedList<>();
        circular2.add(33);
        circular2.add(44);
        circular2.add(88);
        System.out.println("Lista 2: "+ circular2.showData());
        //prueba de unir listas
        circular1.joinList(circular2);
        System.out.println("Listas unidas: "+ circular1.showData());
        System.out.println("");
        
        CircularDoubleLinkedList<Integer> miListaCD = new CircularDoubleLinkedList<>();
        miListaCD.add(11);
        miListaCD.add(22);
        miListaCD.add(15);
        miListaCD.add(33);
        miListaCD.add(27);
        miListaCD.add(88);
        System.out.println("Datos de la lista circular doble: " + miListaCD.showData());
        miListaCD.deleteLast();
        miListaCD.delete();
        System.out.println("Datos de la lista circular doble después de borrar "
                + "el primer y último dato: " + miListaCD.showData());
        //miListaCD.deleteLast();
        System.out.println("Datos de la lista circular doble descendente: " + miListaCD.showDataDesc());
        System.out.println("");
    }
}
