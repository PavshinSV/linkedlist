package black_red_tree;

public class TestTree {
    public static void main(String[] args) {
        BlackRedTree<Integer> tree = new BlackRedTree();
        tree.add(15);
        System.out.println("-------------------------");
        tree.print(tree.root);
        tree.add(25);
        System.out.println("-------------------------");
        tree.print(tree.root);
        tree.add(7);
        System.out.println("-------------------------");
        tree.print(tree.root);
        tree.add(100);
        System.out.println("-------------------------");
        tree.print(tree.root);
        tree.add(10);
        System.out.println("-------------------------");
        tree.print(tree.root);
        tree.add(3);
        System.out.println("-------------------------");
        tree.print(tree.root);
        tree.add(12);
        System.out.println("-------------------------");
        tree.print(tree.root);
        System.out.println("-------------------------");
    }


}
