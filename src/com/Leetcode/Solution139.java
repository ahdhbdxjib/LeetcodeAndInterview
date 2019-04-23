package com.Leetcode;

import java.util.List;

/**
 * 使用动态规划
 * 示例 1：
 *
 * 输入: s = "leetcode", wordDict = ["leet", "code"]
 * 输出: true
 * 解释: 返回 true 因为 "leetcode" 可以被拆分成 "leet code"。
 * 示例 2：
 *
 * 输入: s = "applepenapple", wordDict = ["apple", "pen"]
 * 输出: true
 * 解释: 返回 true 因为 "applepenapple" 可以被拆分成 "apple pen apple"。
 *      注意你可以重复使用字典中的单词。
 * 示例 3：
 *
 * 输入: s = "catsandog", wordDict = ["cats", "dog", "sand", "and", "cat"]
 * 输出: false
 */
public class Solution139 {
    public static boolean wordBreak(String s, List<String> wordDict) {
        int length = s.length();
        boolean dp[] = new boolean[length + 1];
        //字符串为空的时候是可以被拆分的
        dp[0] = true;
        for (int i = 0; i <= length; i++) {
            for (int j = 0; j < i; j++) {
                //若j之前的是满足的则判段其之后的是否是满足的
                if (dp[j] && wordDict.contains(s.substring(j,i))) {
                    dp[i] = true;
                }

            }

        }
        return dp[length];
    }
}
