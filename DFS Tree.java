package dfs;

import java.util.*;

public class DFS {
static class Node
{
    char key;
    ArrayList<Node> child_node = new ArrayList<>();;
 
    public Node(char key)
    {
        this.key = key;
    }
};
 
static void DFS_Node_Visit(Node root)
{
     
    Stack<Node> nodes = new Stack<>();

    nodes.push(root);
 
    while (!nodes.isEmpty())
    {
        Node current_node = nodes.pop();

        if (current_node != null)
        {
            System.out.print(current_node.key + " ");
 
            for(int i = current_node.child_node.size() - 1; i >= 0; i--)
            {
                nodes.add(current_node.child_node.get(i));
            }
        }
    }
}
 
public static void main(String[] args)
{
 
    Node root = new Node('A');
    (root.child_node).add(new Node('B'));
    (root.child_node).add(new Node('C'));
    (root.child_node).add(new Node('D'));
    (root.child_node.get(0).child_node).add(new Node('E'));
    (root.child_node.get(1).child_node).add(new Node('F'));
    (root.child_node.get(1).child_node).add(new Node('G'));
    (root.child_node.get(2).child_node).add(new Node('H'));
    (root.child_node.get(2).child_node.get(0).child_node).add(new Node('I'));
    System.out.print("DFS Tree is:");
    DFS_Node_Visit(root);
    System.out.println("");
}
}
