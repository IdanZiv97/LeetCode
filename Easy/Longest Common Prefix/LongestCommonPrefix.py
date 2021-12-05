from typing import List
class LongestCommonPrefix:
    def longetCommonPrefix(self, strs: List[str]) -> str:
        if len(strs) == 0:
            return ""
        elif len(strs) == 1:
            return strs[0]
        strs.sort()
        firstString = strs[0]
        size = len(strs[0])
        lastString = strs[-1]
        LCP = ""
        for i in range(size):
            if firstString[i] == lastString[i]:
                LCP += firstString[i]
            else:
                break
        return LCP

