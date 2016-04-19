/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tree;

/**
 *
 * @author MARIAJOSE
 */
public class Tree {

    private Node root;

    public Tree() {

        root = null;

    }

    public void add(int d) {

        Node n = new Node(d);

        if (root == null) {
            root = n;
        } else {
            Node aux = root, p = null;

            while (aux != null) {
                p = aux;

                if (d > aux.data) {
                    aux = aux.rigth;
                } else if (d < aux.data) {
                    aux = aux.left;
                } else {
                    return;
                }
            }

            if (d > p.data) {
                p.rigth = n;
            } else {
                p.left = n;
            }
        }

    }
    
    public void printPath(int d) {

        Node aux = root;

        while (aux != null) {

            System.out.print(" " + aux.data); //
            if (d == aux.data) {
                System.out.println();
                return;
            }

            if (d > aux.data) {
                aux = aux.rigth;
            } else {
                aux = aux.left;
            }
        }
        System.out.println(" No Encontrado! ");
    }
    
    public boolean isLeaf(int d) {

        Node aux = root;
        
        while (aux.left != null && aux.rigth != null) {
            if (d > aux.data) {
                aux = aux.rigth;
            } else {
                aux = aux.left;
            }
        }
        if (aux.rigth == null && aux.left == null) {
            return true;
        }
        return false;
    }
    
}
