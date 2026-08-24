class Solution(object):
 def intersect(self, nums1, nums2):
    hashmap = {}
    for num in nums1:
        hashmap[num] = hashmap.get(num, 0) + 1
    res = []
    for i in nums2:
        if i in hashmap and hashmap[i] > 0:
            res.append(i)
            hashmap[i] -= 1
    return res