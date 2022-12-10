

public class Main {
    void decode(String S, Node root) {
        String output = "";
        if (root == null) {
            return;
        }
        Node current = root;

        for (int i = 0; i < S.length(); i++) {
            char c = S.charAt(i);
            if (c == '0') {
                //left
                if (current.left != null) {
                    current = current.left;
                    if (current.left == null && current.right == null) {
                        output += current.data;
                        current = root;
                    }
                } else {
                    output += current.data;
                    current = root;
                }
            } else if (c == '1') {
                //right
                if (current.right != null) {
                    current = current.right;
                    if (current.left == null && current.right == null) {
                        output += current.data;
                        current = root;
                    }
                } else {
                    output += current.data;
                    current = root;
                }
            }

        }

        System.out.print(output);


    }
}