class Solution {

    public String encode(List<String> strs) {
        StringBuilder build = new StringBuilder();
        for (String str : strs) {
            for (char c : str.toCharArray()) {
                int val = (int) c;
                build.append(val);
                build.append('.');
            }
            build.append('_');
        }
        return build.toString();
    }

    public List<String> decode(String str) {
        StringBuilder build = new StringBuilder();
        StringBuilder charBuild = new StringBuilder();
        List<String> res = new ArrayList<>();
        for (char c : str.toCharArray()) {
            if (c == '.') {
                int charVal = Integer.parseInt(build.toString());
                build = new StringBuilder();
                charBuild.append(String.valueOf((char) charVal));
            } else if (c == '_') {
                res.add(charBuild.toString());
                charBuild = new StringBuilder();
            } else {
                build.append(c);
            }
        }
        return res;
    }
}
