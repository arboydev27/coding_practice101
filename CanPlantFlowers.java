public class CanPlantFlowers {

    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count = 0;
        for (int i = 0; i < flowerbed.length; i++) {
            if (flowerbed[i] == 0) {
                int prev = (i == 0) ? 0 : flowerbed[i - 1];
                int next = (i == flowerbed.length - 1) ? 0 : flowerbed[i + 1];
                if (prev == 0 && next == 0) {
                    flowerbed[i] = 1;
                    count++;
                }
            }
        }
        return count >= n;
    }

    public static void main(String[] args) {
        // Test Case 1:
        int[] flowerbed1 = {1, 0, 0, 0, 1};
        int n1 = 1;
        System.out.println("Can plant flowers: " + canPlaceFlowers(flowerbed1, n1));

        // Test Case 2:
        int[] flowerbed2 = {1, 0, 0, 0, 1};
        int n2 = 2;
        System.out.println("Can plant flowers: " + canPlaceFlowers(flowerbed2, n2));

        // Test Case 3:
        int[] flowerbed3 = {0, 0, 1, 0, 0};
        int n3 = 2;
        System.out.println("Can plant flowers: " + canPlaceFlowers(flowerbed3, n3));
    }

}
