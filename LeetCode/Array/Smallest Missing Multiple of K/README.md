# 3718. Smallest Missing Multiple of K

[![LeetCode Link](https://img.shields.io/badge/LeetCode-Problem_Link-FFA116?style=flat-square&logo=leetcode)](https://leetcode.com/problems/smallest-missing-multiple-of-k/)
![Difficulty](https://img.shields.io/badge/Difficulty-Easy-22c55e?style=flat-square)

## Problem Statement

Given an integer array nums and an integer k, return the smallest positive multiple of k that is missing from nums.

A multiple of k is any positive integer divisible by k.

 
Example 1:


Input: nums = [8,2,3,4,6], k = 2

Output: 10

Explanation:

The multiples of k = 2 are 2, 4, 6, 8, 10, 12... and the smallest multiple missing from nums is 10.


Example 2:


Input: nums = [1,4,7,10,15], k = 5

Output: 5

Explanation:

The multiples of k = 5 are 5, 10, 15, 20... and the smallest multiple missing from nums is 5.


 
Constraints:


	1 <= nums.length <= 100
	1 <= nums[i] <= 100
	1 <= k <= 100

## Examples

```
Input:  nums = [8,2,3,4,6], k = 2
Output: 10

Multiples of 2: 2, 4, 6, 8, 10, 12, ...
2, 4, 6, 8 are present. 10 is the first one missing.

Input:  nums = [1,4,7,10,15], k = 5
Output: 5

Multiples of 5: 5, 10, 15, 20, ...
5 is missing right away.
```

## Constraints

- 1 <= nums.length <= 100
- 1 <= nums[i] <= 100
- 1 <= k <= 100

---
*Synced automatically with [AlgoVault](https://github.com/mr-sanjai-offl/AlgoVault)*