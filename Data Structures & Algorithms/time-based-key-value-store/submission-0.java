class TimeMap {
    HashMap<String,TreeMap<Integer,String>> map;
    public TimeMap() {
        map = new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
        if(map.get(key)!=null){
            TreeMap<Integer,String> unit = this.map.get(key);
            unit.put(timestamp,value);
        } else {
            TreeMap<Integer,String> treemap = new TreeMap<>();
            treemap.put(timestamp,value);
            map.put(key, treemap );
        }
    }
    
    public String get(String key, int timestamp) {
        if(map.get(key)==null){
            return "";
        }

        TreeMap<Integer,String> unit = map.get(key);
        Integer t = unit.floorKey(timestamp);

        if(t==null){
            return "";
        }

        return unit.get(t);

    }
}
