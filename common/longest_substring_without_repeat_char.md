### 返回字符串s中最长的无重复字符的子字符串
+ 相关方法
    + char string.charAt(index)
        根据索引获取字符串中对应位置的字符
    + boolean set.contains(value)
        判断集合中是否存在该value值
+ 方法一暴力破解
+ 方法二，滑动窗口
    + 使用set集合存储数据
    + 变量i（左索引）,j（右索引）,res（最长字符串长度）
    + 使用while循环移动右索引并对每个新增加的值做判定，如果非重复，加入set，如果重复开始移动左索引，直到该窗口不包含重复字符串继续移动右索引，期间随时记录窗口大小并更新最大窗口值
        ```
            public class Solution {
            public int lengthOfLongestSubstring(String s) {
                int n = s.length();
                Set<Character> set = new HashSet<>();
                int ans = 0, i = 0, j = 0;
                while (i < n && j < n) {
                    // try to extend the range [i, j]
                    if (!set.contains(s.charAt(j))){
                        set.add(s.charAt(j++));
                        ans = Math.max(ans, j - i);
                    }
                    else {
                        set.remove(s.charAt(i++));
                    }
                }
                return ans;
            }
        }
        ```
+ 方法三 滑动窗口优化（直接跳过重复字符所在区域）
    + 使用map存储数据
        ```
            public  int lengthOfLongestSubstring03(String s) {
            int n = s.length(), ans = 0;
            //创建map窗口,i为左区间，j为右区间，右边界移动
            Map<Character, Integer> map = new HashMap<>();
            for (int j = 0, i = 0; j < n; j++) {
                // 如果窗口中包含当前字符
                if (map.containsKey(s.charAt(j))) {
                    //左边界开始移动到 相同字符的下一个位置和i当前位置中更靠右的位置，这样是为了防止i向左移动
                    i = Math.max(map.get(s.charAt(j)), i);
                }
                //比对当前无重复字段长度和储存的长度，选最大值并替换
                //j-i+1是因为此时i,j索引仍处于不重复的位置，j还没有向后移动，取的[i,j]长度
                ans = Math.max(ans, j - i + 1);
                // 将当前字符为key，下一个索引为value放入map中
                // value为j+1是为了当出现重复字符时，左边界i直接跳到上个相同字符的下一个位置而不是重复字符的位置，if中取值就不用+1了
                map.put(s.charAt(j), j+1);
            }
            return ans;
        }
        ```