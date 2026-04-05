/*
Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    public Node cloneGraph(Node node) {
        HashMap<Node, Node> map = new HashMap<>();
        traverse(node,map);
        pass2(node, map);
        return map.get(node);
    }

    public void traverse(Node node, HashMap<Node, Node> map){
         if(node==null || map.containsKey(node)){
            return;
         }
         
        map.put(node,new Node(node.val));
        for(int i=0;i<node.neighbors.size();i++){
            traverse(node.neighbors.get(i), map); 
        }
    }

    public void pass2(Node node, HashMap<Node, Node> map){
        if(node==null || map.get(node).neighbors.size() > 0){
            return;
        }
        
        Node clone = map.get(node);
        for(int i = 0;i<node.neighbors.size();i++){
            clone.neighbors.add(map.get(node.neighbors.get(i)));
            pass2(node.neighbors.get(i), map);
        }

    }
}