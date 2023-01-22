 /* QN:
    The floodFill method is the main method that is called by the user. 
    It takes as input the image represented as a 2D array, the x and y coordinates of the starting point, and the new color that the connected area should be filled with. */
public class FloodFillAlgo {
   /*The method starts by saving the original color of the starting point, and then calls the dfs method if the original color is different from the new color. */
    public int[][] floodFill(int[][] image, int x, int y, int newColor) {
        int originalColor = image[x][y];
        if (originalColor != newColor) {
            dfs(image, x, y, originalColor, newColor);
        }
        return image;
    }
    /* 
    -> The dfs method is a recursive method that explores the connected pixels by moving in the 4 possible directions (right, left, up, and down) and replacing the color of each pixel that is part of the connected area with the new color. 
    -> The method checks if the current pixel is within the boundaries of the image and if it has the same color as the starting point before recursing. */
    void dfs(int[][] image, int x, int y, int originalColor, int newColor) {
        if (x < 0 || x >= image.length || y < 0 || y >= image[0].length) {
            return;
        }
        if (image[x][y] != originalColor) {
            return;
        }
        image[x][y] = newColor;
        dfs(image, x + 1, y, originalColor, newColor);
        dfs(image, x - 1, y, originalColor, newColor);
        dfs(image, x, y + 1, originalColor, newColor);
        dfs(image, x, y - 1, originalColor, newColor);  
        }
}

// It's important to note that the above code assumes the image is a 2D array of integers where each element represent a color, and that it's only traversing the pixels that are in the same color as the starting point, the new color is being set only to those pixels.
//----------------------------COMPLEXITY ANALYSIS
//TC: O(n) where n is the number of pixels or elements in the matrix
//SC: O(h) where h is the height of the image