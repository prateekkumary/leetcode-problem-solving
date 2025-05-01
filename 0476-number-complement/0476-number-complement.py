class Solution(object):
    def findComplement(self, num):
        bin_str=bin(num)[2:]
        str=""
        for i in range(len(bin_str)):
            if bin_str[i]=='0':
                str+='1'
            else:
                str+='0'    
        number=int(str,2)
        return number
        """
        :type num: int
        :rtype: int
        """
        