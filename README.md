# LeetCode
> 我的LeetCode刷题笔记
## 刷题记录

| Squence | Problem       | Level  | Data  | Result |
|:-------:|:--------------|:------:|:----:|:------:|
|1|[Two Sum](https://leetcode.com/problems/two-sum/description/)|Easy|2018/01/13|AC|
|2|[Add Two Numbers](https://leetcode.com/problems/add-two-numbers/description/)|Medium|2018/01/13|AC|
|3|[Longest Substring Without Repeating Characters](https://leetcode.com/problems/longest-substring-without-repeating-characters/description/)|Medium|2018/01/14|TLE|
|4|[Median of Two Sorted Arrays](https://leetcode.com/problems/median-of-two-sorted-arrays/description/)|Hard|2018/01/14|Review|
|5|[Longest Palindromic Substring](https://leetcode.com/problems/longest-palindromic-substring/description/)|Medium|2018/01/15|Review|
|6|[ZigZag Conversion](https://leetcode.com/problems/zigzag-conversion/description/)|Medium|2018/01/16|AC|

## 题目描述
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
>P&nbsp;&nbsp;&nbsp;A&nbsp;&nbsp;&nbsp;H &nbsp;&nbsp;&nbsp;N</br>
A&nbsp;P&nbsp;L&nbsp; S&nbsp; I&nbsp; I&nbsp; G</br>
Y&nbsp;&nbsp;&nbsp;I&nbsp;&nbsp;&nbsp;R

And then read line by line: **"PAHNAPLSIIGYIR"**
Write the code that will take a string and make this conversion given a number of rows:

**convert("PAYPALISHIRING", 3)** should return **"PAHNAPLSIIGYIR"**.