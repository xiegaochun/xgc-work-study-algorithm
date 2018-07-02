package com.xgc.work.study.algorithm;

/**
 * Created by xiegaochun on 2018/7/2.
 */
public class MergeTwoBinaryTrees {



    public static TreeNode mergeTrees(TreeNode t1, TreeNode t2) {

        if(t1 == null && t2 == null)
            return null;
        else if(t1 == null)
            return t2;
        else if(t2 == null)
            return t1;
        TreeNode treeNode =new TreeNode(t1.val+t2.val);
        treeNode.left= mergeTrees(t1.left,t2.left);
        treeNode.right=mergeTrees(t1.right,t2.right);

        return treeNode;
    }


//    public static TreeNode mergeTrees(TreeNode t1, TreeNode t2){
//
//        if(t1==null){
//            return t2;
//        }
//        if(t2==null){
//            return t1;
//        }
//        t1.val += t2.val;
//        t1.left = mergeTrees(t1.left,t2.left);
//        t1.right = mergeTrees(t1.right,t2.right);
//        return t1;
//    }



    public static void main(String[] args) {
        // TODO Auto-generated method stub
        //构造Tree 1
        TreeNode t1 = new TreeNode(1);
        t1.left = new TreeNode(3);
        t1.right = new TreeNode(2);
        t1.left.left = new TreeNode(5);

        //构造Tree 2
        TreeNode t2 = new TreeNode(2);
        t2.left = new TreeNode(1);
        t2.right = new TreeNode(3);
        t2.left.right = new TreeNode(4);
        t2.right.left = new TreeNode(7);

        mergeTrees(t1, t2);
        printTree(t1);
        //System.out.println(t1.val);


    }

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public static void printTree(TreeNode t){
        if(t != null){
            System.out.print(t.val+" ");
            printTree(t.left);
            printTree(t.right);
        }
    }
}
