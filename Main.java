import java.util.ArrayList;
import java.util.List;
import java.util.Stack;


class TreeNode {
    int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
     TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }
/*----------------------------Main---------------------------- */
class Solution {
    public List<Integer> inorderTraversal(TreeNode root){
        List<Integer> result = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode current = root;
        while (current!=null || !stack.isEmpty()) {
            while (current!=null) {
                stack.push(current);
                current = current.left;
            }
            current = stack.pop();
            result.add(current.val);
            current = current.right;
        }

        return result;
    }  
}
/*----------------------------Main---------------------------- */


public class Main {
    public static void main(String[] args) {
        Integer[] arr = {1, 2, 3, 4, 5, null, 8, null, null, 6, 7, 9};
        TreeNode root = createBinaryTree(arr, 0);
        Solution solution = new Solution();
        List<Integer> result = solution.inorderTraversal(root);
        System.out.println(result);
    }

    public static TreeNode createBinaryTree(Integer[] arr, int index) {
        if (index >= arr.length || arr[index] == null) {
            return null;
        }
        TreeNode node = new TreeNode(arr[index]);
        node.left = createBinaryTree(arr, 2 * index + 1);
        node.right = createBinaryTree(arr, 2 * index + 2);
        return node;
    }
}

