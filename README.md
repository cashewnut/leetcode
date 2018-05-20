# LeetCode
> 我的LeetCode刷题笔记
## Problems

| Squence | Problem       | Level  | Date  | Result |
|:-------:|:--------------:|:------:|:----:|:------:|
|1|[Two Sum](https://leetcode.com/problems/two-sum/description/)|Easy|2018/01/13|AC|
|2|[Add Two Numbers](https://leetcode.com/problems/add-two-numbers/description/)|Medium|2018/01/13|AC|
|3|[Longest Substring Without Repeating Characters](https://leetcode.com/problems/longest-substring-without-repeating-characters/description/)|Medium|2018/01/14|TLE|
|4|[Median of Two Sorted Arrays](https://leetcode.com/problems/median-of-two-sorted-arrays/description/)|Hard|2018/01/14|Review|
|5|[Longest Palindromic Substring](https://leetcode.com/problems/longest-palindromic-substring/description/)|Medium|2018/01/15|Review|
|6|[ZigZag Conversion](https://leetcode.com/problems/zigzag-conversion/description/)|Medium|2018/01/16|AC|
|7|[Reverse Integer](https://leetcode.com/problems/reverse-integer/description/)|Easy|2018/01/16|AC|
|8|[String to Integer (atoi)](https://leetcode.com/problems/string-to-integer-atoi/description/)|Medium|2018/01/17|AC|
|9|[Palindrome Number](https://leetcode.com/problems/palindrome-number/description/)|Easy|2018/01/18|AC|
|10|[Regular Expression Matching](https://leetcode.com/problems/regular-expression-matching/description/)|Hard|2018/01/18|Review!!!!!!|
|11|[Container With Most Water](https://leetcode.com/problems/container-with-most-water/description/)|Medium|2018/01/23|Review(TLE)|
|12|[Integer to Roman](https://leetcode.com/problems/integer-to-roman/description/)|Medium|2018/03/27|AC|
|13|[Roman to Integer](https://leetcode.com/problems/roman-to-integer/description/)|Easy|2018/03/27|AC|
|14|[Longest Common Prefix](https://leetcode.com/problems/longest-common-prefix/description/)|Easy|2018/03/28|AC|
|15|[3Sum](https://leetcode.com/problems/3sum/description/)|Medium|2018/03/28|AC|
|16|[3Sum Closest](https://leetcode.com/problems/3sum-closest/description/)|Medium|2018/03/28|AC|
|17|[Letter Combinations of a Phone Number](https://leetcode.com/problems/letter-combinations-of-a-phone-number/description/)|Medium|2018/05/18|AC|
|18|[Letter Combinations of a Phone Number](https://leetcode.com/problems/letter-combinations-of-a-phone-number/description/)|Medium|2018/05/18|AC|
|19|[Remove Nth Node From End of List](https://leetcode.com/problems/remove-nth-node-from-end-of-list/description/)|Medium|2018/05/20|AC|
|20|[Valid Parentheses](https://leetcode.com/problems/valid-parentheses/description/)|Easy|2018/05/20|AC|
|21|[Merge Two Sorted Lists](https://leetcode.com/problems/merge-two-sorted-lists/description/)|Easy|2018/05/20|AC|

## Description
### #1. [Two Sum](https://leetcode.com/problems/two-sum/description/)
Given an array of **integers**, return indices of the two numbers such that they add up to a specific target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

> **Example:**
Given nums = [2, 7, 11, 15], target = 9,
Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].

### #2. [Add Two Numbers](https://leetcode.com/problems/add-two-numbers/description/)
You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.
>**Example**

>**Input**: (2 -> 4 -> 3) + (5 -> 6 -> 4)
**Output**: 7 -> 0 -> 8
**Explanation**: 342 + 465 = 807.

### #3. [Longest Substring Without Repeating Characters](https://leetcode.com/problems/longest-substring-without-repeating-characters/description/)

Given a string, find the length of the longest substring without repeating characters.

>**Examples:**
Given **"abcabcbb"**, the answer is **"abc"**, which the length is **3**.
Given **"bbbbb"**, the answer is **"b"**, with the length of **1**.
Given **"pwwkew"**, the answer is **"wke"**, with the length of **3**. Note that the answer must be a substring, "pwke" is a subsequence and not a substring.

### #4. [Median of Two Sorted Arrays](https://leetcode.com/problems/median-of-two-sorted-arrays/description/)

There are two **sorted** arrays nums1 and nums2 of size m and n respectively.

Find the **median** of the two sorted arrays. The overall run time complexity should be **O(log (m+n))**.

>**Example 1:**
nums1 = [1, 3]</br>
nums2 = [2]</br>
The median is 2.0

>**Example 2:**
nums1 = [1, 2]</br>
nums2 = [3, 4]The median is (2 + 3)/2 = 2.5

### #5.[Longest Palindromic Substring](https://leetcode.com/problems/longest-palindromic-substring/description/)

Given a string **s**, find the longest palindromic substring in s. You may assume that the maximum length of s is 1000.

>**Example:**
**Input:** "babad"</br>
**Output:** "bab"</br>
**Note:** "aba" is also a valid answer.

>**Example:**
**Input:** "cbbd"</br>
**Output:** "bb"

### #6.[ZigZag Conversion](https://leetcode.com/problems/zigzag-conversion/description/)
The string **"PAYPALISHIRING"** is written in a zigzag pattern on a given number of rows like this: (you may want to display this pattern in a fixed font for better legibility)
>P &nbsp;&nbsp;&nbsp;A &nbsp;&nbsp;&nbsp;H &nbsp;&nbsp;&nbsp;N</br>
A&nbsp;P&nbsp;L&nbsp;S&nbsp;&nbsp;I&nbsp;&nbsp;&nbsp;I&nbsp;&nbsp;G</br>
Y&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;I&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;R

And then read line by line: **"PAHNAPLSIIGYIR"**
Write the code that will take a string and make this conversion given a number of rows:

**convert("PAYPALISHIRING", 3)** should return **"PAHNAPLSIIGYIR"**.


### #7.[Reverse Integer](https://leetcode.com/problems/reverse-integer/description/)

Given a 32-bit signed integer, reverse digits of an integer.

>**Example 1:**
**Input:** 123
**Output:**  321

>**Example 2:**
**Input:** -123
**Output:** -321

>**Example 3:**
**Input:** 120
**Output:** 21

**Note:**
Assume we are dealing with an environment which could only hold integers within the **32-bit** signed integer range. For the purpose of this problem, assume that your function returns **0** when the reversed integer overflows.

### #8.[String to Integer (atoi)](https://leetcode.com/problems/string-to-integer-atoi/description/)
Implement atoi to convert a string to an integer.

**Hint:** Carefully consider all possible input cases. If you want a challenge, please do not see below and ask yourself what are the possible input cases.

**Notes:**It is intended for this problem to be specified vaguely (ie, no given input specs). You are responsible to gather all the input requirements up front.

**Requirements** for atoi:
The function first discards as many whitespace characters as necessary until the first non-whitespace character is found. Then, starting from this character, takes an optional initial plus or minus sign followed by as many numerical digits as possible, and interprets them as a numerical value.

The string can contain additional characters after those that form the integral number, which are ignored and have no effect on the behavior of this function.

If the first sequence of non-whitespace characters in str is not a valid integral number, or if no such sequence exists because either str is empty or it contains only whitespace characters, no conversion is performed.

If no valid conversion could be performed, a zero value is returned. If the correct value is out of the range of representable values, INT_MAX (2147483647) or INT_MIN (-2147483648) is returned.

### #9.[Palindrome Number](https://leetcode.com/problems/palindrome-number/description/)
Determine whether an integer is a palindrome. Do this without extra space.

Could negative integers be palindromes? (ie, -1)

If you are thinking of converting the integer to string, note the restriction of using extra space.

You could also try reversing an integer. However, if you have solved the problem "Reverse Integer", you know that the reversed integer might overflow. How would you handle such case?

There is a more generic way of solving this problem.

### #10.[Regular Expression Matching](https://leetcode.com/problems/regular-expression-matching/description/)

Implement regular expression matching with support for **'.' **and **'*'**.

>**'.'** Matches any single character.</br>
**'*'** Matches zero or more of the **preceding** element.</br>
</br>
The matching should cover the entire input string (not partial).</br>
</br>
The function prototype should be:</br>
bool isMatch(const char *s, const char *p)</br>
</br>
Some examples:</br>
isMatch("aa","a") → false</br>
isMatch("aa","aa") → true</br>
isMatch("aaa","aa") → false</br>
isMatch("aa", "a*") → true</br>
isMatch("aa", ".*") → true</br>
isMatch("ab", ".*") → true</br>
isMatch("aab", "c*a*b") → true</br>

### #11.[Container With Most Water](https://leetcode.com/problems/container-with-most-water/description/)
Given n non-negative integers a1, a2, ..., an, where each represents a point at coordinate (i, ai). n vertical lines are drawn such that the two endpoints of line i is at (i, ai) and (i, 0). Find two lines, which together with x-axis forms a container, such that the container contains the most water.

Note: You may not slant the container and n is at least 2.


### #12.[Integer to Roman](https://leetcode.com/problems/integer-to-roman/description/)
Given an integer, convert it to a roman numeral.
Input is guaranteed to be within the range from 1 to 3999.



### #13.[Roman to Integer](https://leetcode.com/problems/roman-to-integer/description/)
Given a roman numeral, convert it to an integer.
Input is guaranteed to be within the range from 1 to 3999.

### #14.[Longest Common Prefix](https://leetcode.com/problems/longest-common-prefix/description/)

Write a function to find the longest common prefix string amongst an array of strings.

### #15.[3Sum](https://leetcode.com/problems/3sum/description/)

Given an array S of n integers, are there elements a, b, c in S such that a + b + c = 0? Find all unique triplets in the array which gives the sum of zero.

Note: The solution set must not contain duplicate triplets.

>For example, given array S = [-1, 0, 1, 2, -1, -4],
A solution set is:
[
  [-1, 0, 1],
  [-1, -1, 2]
]

### #16.[3Sum Closest](https://leetcode.com/problems/3sum-closest/description/)

Given an array nums of n integers and an integer target, find three integers in nums such that the sum is closest to target. Return the sum of the three integers. You may assume that each input would have exactly one solution.

**Example：**
>Given array nums = [-1, 2, 1, -4], and target = 1.

>The sum that is closest to the target is 2. (-1 + 2 + 1 = 2).


### #17.[Letter Combinations of a Phone Number](https://leetcode.com/problems/letter-combinations-of-a-phone-number/description/)
Given a string containing digits from 2-9 inclusive, return all possible letter combinations that the number could represent.

A mapping of digit to letters (just like on the telephone buttons) is given below. Note that 1 does not map to any letters.

**Example：**
>Input: "23"
>Output: ["ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"].

### #18.[4Sum](https://leetcode.com/problems/4sum/description/)
Given an array nums of **n** integers and an integer target, are there elements a, b, c, and d in nums such that a + b + c + d = target? Find all unique quadruplets in the array which gives the sum of target.
**Example：**
>Given array nums = [1, 0, -1, 0, -2, 2], and target = 0.
>A solution set is:
>[
>  [-1,  0, 0, 1],
>  [-2, -1, 1, 2],
>  [-2,  0, 0, 2]
>]


### #19.[Remove Nth Node From End of List](https://leetcode.com/problems/remove-nth-node-from-end-of-list/description/)

Given a linked list, remove the n-th node from the end of list and return its head.
**Example：**
>Given linked list: 1->2->3->4->5, and n = 2.
>After removing the second node from the end, the linked list becomes 1->2->3->5.

**Follow up:**
one pass

### #20.[Valid Parentheses](https://leetcode.com/problems/valid-parentheses/description/)
Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

1、Open brackets must be closed by the same type of brackets.
2、Open brackets must be closed in the correct order.

**Example1：**
>Input: "()"<br>
>Output: true

**Example2：**
>Input: "()[]{}"<br>
>Output: true

**Example3：**
>Input: "(]"<br>
>Output: false

### #21.[Merge Two Sorted Lists](https://leetcode.com/problems/merge-two-sorted-lists/description/)
Merge two sorted linked lists and return it as a new list. The new list should be made by splicing together the nodes of the first two lists.

**Example：**
>Input: 1->2->4, 1->3->4<br>
Output: 1->1->2->3->4->4