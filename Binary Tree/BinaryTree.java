
import java.util.*;

class Node {

    int val;
    Node left, right;

    Node(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}

class BinaryTree {

    private static Node buildTree(Scanner sc) {
        int val = sc.nextInt();
        if (val == -1) {
            return null;
        }

        Node root = new Node(val);
        root.left = buildTree(sc);
        root.right = buildTree(sc);

        return root;
    }

    private static void inOrder(Node root) {
        if (root == null) {
            return;
        }
        inOrder(root.left);
        System.out.print(root.val + " ");
        inOrder(root.right);
    }

    private static void postOrder(Node root) {
        if (root == null) {
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.val + " ");
    }

    private static void printTree(Node root) {
        List<List<String>> levels = new ArrayList<>();
        getLevels(root, 0, levels);

        System.out.println("\nTree Structure:");
        for (int i = 0; i < levels.size(); i++) {
            System.out.printf("Level %d: %s%n", i, levels.get(i));
        }
    }

    private static void getLevels(Node node, int level, List<List<String>> levels) {
        if (node == null) {
            return;
        }

        if (levels.size() <= level) {
            levels.add(new ArrayList<>());
        }

        levels.get(level).add(String.valueOf(node.val));
        getLevels(node.left, level + 1, levels);
        getLevels(node.right, level + 1, levels);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Build the tree using pre-order:");
        System.out.print("Enter value (-1 for null): ");
        Node root = buildTree(sc);

        while (true) {
            System.out.println("\nChoose an option: ");
            System.out.println("1. In-Order");
            System.out.println("2. Post-Order");
            System.out.println("3. Print Tree");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            System.out.println("\nResult:");
            switch (choice) {
                case 1 -> {
                    inOrder(root);
                    System.out.println();
                }
                case 2 -> {
                    postOrder(root);
                    System.out.println();
                }
                case 3 -> {
                    printTree(root);
                }
                case 4 -> {
                    System.out.println("Exiting... Goodbye!");
                    sc.close();
                    return;
                }
                default ->
                    System.out.println("Invalid choice! Try again.");
            }
        }
    }
}
