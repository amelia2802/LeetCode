class MyHashMap {
    
    private HashMap<Integer, Integer> sampleMap;

    public MyHashMap() {
        sampleMap = new HashMap<Integer,Integer>();
    }
    
    public void put(int key, int value) {
       sampleMap.put(key,value);
    }
    
    public int get(int key) {
        if(sampleMap.containsKey(key)){
            return sampleMap.get(key);
        }
        return -1;
    }
    
    public void remove(int key) {
        sampleMap.remove(key);
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */