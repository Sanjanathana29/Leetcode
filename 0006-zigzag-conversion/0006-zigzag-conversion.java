class Solution {
    public String convert(String s, int numRows) {

    
        if (numRows == 1) {
            return s;
        }

        StringBuilder[] lines = new StringBuilder[numRows];
        for (int i = 0; i < numRows; i++) {
            lines[i] = new StringBuilder();
        }

        int currentLine = 0; 
        int step = 1;        

       
        for (int i = 0; i < s.length(); i++) {
            lines[currentLine].append(s.charAt(i));

          
            if (currentLine == 0) {
                step = 1;   
            }
            if (currentLine == numRows - 1) {
                step = -1;  
            }

            currentLine = currentLine + step;
        }

       
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < numRows; i++) {
            result.append(lines[i]);
        }

        return result.toString();
    }
}
