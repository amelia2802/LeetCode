class MyHashSet {
    
    private HashSet<Integer> exampleSet;
    
    public MyHashSet() {
        exampleSet = new HashSet<Integer>();
    }
    
    public void add(int key) {
        exampleSet.add(key);
    }
    
    public void remove(int key) {
        exampleSet.remove(key);
    }
    
    public boolean contains(int key) {
        if(exampleSet.contains(key)){
            return true;
        }
        return false;
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */