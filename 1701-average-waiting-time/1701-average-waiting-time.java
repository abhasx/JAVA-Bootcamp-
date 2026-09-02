class Solution {
    public double averageWaitingTime(int[][] customers) {
        long currentTime = 0;
        long totalWaitingTime = 0;

        for (int[] customer : customers) {
            currentTime = Math.max(currentTime, customer[0]);
            currentTime += customer[1];

            totalWaitingTime += currentTime - customer[0];
        }

        return (double) totalWaitingTime / customers.length;
    }
}