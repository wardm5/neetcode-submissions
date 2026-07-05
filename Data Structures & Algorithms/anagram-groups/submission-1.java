class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        for (String s : strs) {
            char[] tempArr = s.toCharArray();
            Arrays.sort(tempArr);

            String sortKey = new String(tempArr);
            List<String> list = map.getOrDefault(sortKey, new ArrayList<>());
            list.add(s);
            map.put(sortKey, list);
        }
        List<List<String>> res = new ArrayList<>();
        for (String s : map.keySet()) {
            res.add(map.get(s));
        }
        return res;
    }
}
