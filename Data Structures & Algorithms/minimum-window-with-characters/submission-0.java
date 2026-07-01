class Solution {
    public String minWindow(String s, String t) {

        if (s.length() < t.length()) {
            return "";
        }

        Map<Character, Integer> map = new HashMap<>();

        for (char c : t.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        int remaining = t.length();
        int left = 0;

        int minLen = Integer.MAX_VALUE;
        int start = 0;

        for (int right = 0; right < s.length(); right++) {

            char rc = s.charAt(right);

            if (map.containsKey(rc)) {

                if (map.get(rc) > 0) {
                    remaining--;
                }

                map.put(rc, map.get(rc) - 1);
            }

            while (remaining == 0) {

                if (right - left + 1 < minLen) {
                    minLen = right - left + 1;
                    start = left;
                }

                char lc = s.charAt(left);

                if (map.containsKey(lc)) {

                    map.put(lc, map.get(lc) + 1);

                    if (map.get(lc) > 0) {
                        remaining++;
                    }
                }

                left++;
            }
        }

        return minLen == Integer.MAX_VALUE
                ? ""
                : s.substring(start, start + minLen);
    }
}