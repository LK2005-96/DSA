# 537. Complex Number Multiplication

[![LeetCode Link](https://img.shields.io/badge/LeetCode-Problem_Link-FFA116?style=flat-square&logo=leetcode)](https://leetcode.com/problems/complex-number-multiplication/)
![Difficulty](https://img.shields.io/badge/Difficulty-Medium-eab308?style=flat-square)

## Problem Statement

<p>A <a href="https://en.wikipedia.org/wiki/Complex_number" target="_blank">complex number</a> can be represented as a string on the form <code>&quot;<strong>real</strong>+<strong>imaginary</strong>i&quot;</code> where:</p>

<ul>
	<li><code>real</code> is the real part and is an integer in the range <code>[-100, 100]</code>.</li>
	<li><code>imaginary</code> is the imaginary part and is an integer in the range <code>[-100, 100]</code>.</li>
	<li><code>i<sup>2</sup> == -1</code>.</li>
</ul>

<p>Given two complex numbers <code>num1</code> and <code>num2</code> as strings, return <em>a string of the complex number that represents their multiplications</em>.</p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>

<pre>
<strong>Input:</strong> num1 = &quot;1+1i&quot;, num2 = &quot;1+1i&quot;
<strong>Output:</strong> &quot;0+2i&quot;
<strong>Explanation:</strong> (1 + i) * (1 + i) = 1 + i2 + 2 * i = 2i, and you need convert it to the form of 0+2i.
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre>
<strong>Input:</strong> num1 = &quot;1+-1i&quot;, num2 = &quot;1+-1i&quot;
<strong>Output:</strong> &quot;0+-2i&quot;
<strong>Explanation:</strong> (1 - i) * (1 - i) = 1 + i2 - 2 * i = -2i, and you need convert it to the form of 0+-2i.
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>num1</code> and <code>num2</code> are valid complex numbers.</li>
</ul>


---
*Synced automatically with [AlgoVault](https://github.com/mr-sanjai-offl/AlgoVault)*