class Solution:
    def isValid(self, s: str) -> bool:
        if s == "":
            return False 
        stack = []
        pairs = {
            '(' :')',
            '{' : '}',
            '[': ']'
        }
        sl = list(s)

        for i in sl:
            if i in pairs.keys():
                stack.append(i)
            elif i in pairs.values():
                if len(stack) == 0:
                    return False
                if i == pairs[stack[-1]]:
                    stack.pop()
                else:
                    return False
        if len(stack) != 0:
            return False
        else:
            return True
        