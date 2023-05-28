import java.util.Arrays;

public class Citys_14 {
    public static int[] chooseBestSum(int maxDist, int citiesTo, int[] cityDist) {
        int[] bestCombi = null;
        int bestDistance = 0;

        if (cityDist.length < citiesTo) {
            return null;
        }

        int[] inde = new int[citiesTo];
        for (int i = 0; i < citiesTo; i++) {
            inde[i] = i;
        }

        int totalCombinations = (int) Math.pow(cityDist.length, citiesTo);
        int combinationsChecked = 0;

        while (inde[0] <= cityDist.length - citiesTo) {
            int[] combination = new int[citiesTo];
            for (int i = 0; i < citiesTo; i++) {
                combination[i] = cityDist[inde[i]];
            }

            int combinationDistance = 0;
            for (int distance : combination) {
                combinationDistance += distance;
            }

            if (combinationDistance <= maxDist) {
                if (combinationDistance > bestDistance) {
                    bestDistance = combinationDistance;
                    bestCombi = combination;
                }
            }

            combinationsChecked++;
            if (combinationsChecked >= totalCombinations / 2) {
                return null;
            }

            int i = citiesTo - 1;
            while (i >= 0 && inde[i] == cityDist.length - citiesTo + i) {
                i--;
            }
            if (i < 0) {
                break;
            }
            inde[i]++;
            for (int j = i + 1; j < citiesTo; j++) {
                inde[j] = inde[j - 1] + 1;
            }
        }

        return bestCombi;
    }

    public static void main(String[] args) {
        int[] cityDist = {50, 55, 57, 58, 60};
        int maxDist = 163;
        int citiesTo = 3;
        int[] bestCombination = chooseBestSum(maxDist, citiesTo, cityDist);
        if (bestCombination != null) {
            System.out.println("Максимальная дистанция: " + maxDist);
            System.out.println("Лучшая комбинация: " + Arrays.toString(bestCombination));
        } else {
            System.out.println("Нет комбинации");
        }
    }
}