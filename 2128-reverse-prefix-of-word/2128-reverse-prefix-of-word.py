class Solution(object):
    def reversePrefix(self, word, ch):
        try:
         index=word.index(ch)+1
         reverse_part=word[:index][::-1]
         remaining_part=word[index:]
         result=reverse_part+remaining_part
         return result
        except ValueError:
            return word
        """
        :type word: str
        :type ch: str
        :rtype: str
        """
        