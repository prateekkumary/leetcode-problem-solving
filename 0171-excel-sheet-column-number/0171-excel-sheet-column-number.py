class Solution(object):
    def titleToNumber(self, columnTitle):
        """
        :type columnTitle: str
        :rtype: int
        """
        colNum=0
        for char in columnTitle:
            
            value=ord(char)-ord('A')+1
            colNum=colNum*26+value
        return colNum
        