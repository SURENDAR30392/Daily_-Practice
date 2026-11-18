class Solution {
    public int compress(char[] chars) {

        int i = 0;
        int write = 0;

        while (i < chars.length) {

            char current = chars[i];
            int count = 0;
            int j = i;

            // Count consecutive characters
            while (j < chars.length && chars[j] == current) {
                count++;
                j++;
            }

            // Write the character
            chars[write++] = current;

            // Write the count if greater than 1
            if (count > 1) {
                for (char digit : String.valueOf(count).toCharArray()) {
                    chars[write++] = digit;
                }
            }

            // Move to the next group
            i = j;
        }

        return write;
    }
}