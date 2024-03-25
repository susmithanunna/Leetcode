/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Tuple{
    TreeNode node;
    int vertical;
    int level;
    public Tuple(TreeNode node,int vertical,int level){
        this.node=node;
        this.vertical=vertical;
        this.level=level;
    }
}

class Solution {
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        TreeMap<Integer,TreeMap<Integer,PriorityQueue<Integer>>> map=new TreeMap<>();
        Queue<Tuple> q1=new LinkedList<>();
        q1.add(new Tuple(root,0,0));
        while(!q1.isEmpty()){
            Tuple t=q1.remove();
            TreeNode temp=t.node;
            int verti=t.vertical;
            int lev=t.level;
            if(!map.containsKey(verti)){
                map.put(verti,new TreeMap<>());
            }
            if(!map.get(verti).containsKey(lev)){
                map.get(verti).put(lev,new PriorityQueue<>());
            }
            map.get(verti).get(lev).add(temp.val);
            if(temp.left!=null){
                q1.add(new Tuple(temp.left,verti-1,lev+1));
            }
            if(temp.right!=null){
                q1.add(new Tuple(temp.right,verti+1,lev+1));
            }
        }
        List<List<Integer>> ans=new ArrayList<>();
        for(TreeMap<Integer,PriorityQueue<Integer>> it1:map.values()){
            List<Integer> a1=new ArrayList<>();
            for(PriorityQueue<Integer> it2:it1.values()){
                while(!it2.isEmpty()){
                    a1.add(it2.remove());
                }
            }
            ans.add(a1);
        }
        
        return ans; 
    }
}