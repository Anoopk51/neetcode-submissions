class Solution:
    def validPalindrome(self, s: str) -> bool:
        low = 0
        high = len(s) -1

        def isPalindrome(s , l , h):
            while(l <= h):
                if (s[l] != s[h]):
                    return False
                l += 1
                h -= 1
            return True

        while(low <= high):
            if(s[low] != s[high]):
                return (isPalindrome(s , low +1 ,high) or isPalindrome(s, low ,high-1))
            
            low += 1
            high -= 1

        return True


        
            


            
        