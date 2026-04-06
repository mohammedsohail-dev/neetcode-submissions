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
    HashMap<Node, Node> map = new HashMap<>();
    public Node cloneGraph(Node node) {
        if(node == null) return null;
        pass1(node);
        pass2(node);
        return map.get(node);
    }

    public void pass1(Node node){
        if(map.containsKey(node)) return;
        map.put(node,new Node(node.val));

        for(Node nei : node.neighbors){
            pass1(nei);
        }
    }

    public void pass2(Node node){
        if(map.get(node).neighbors.size()>0) return;
        List<Node> list = map.get(node).neighbors;

        for(Node nei : node.neighbors){
            list.add(map.get(nei));
            pass2(nei);
        }
    }
}