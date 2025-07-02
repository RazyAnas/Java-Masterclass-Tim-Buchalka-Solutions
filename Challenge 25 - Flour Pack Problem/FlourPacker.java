/*
Write a method called canPack with 3 parameters of type int:
- bigCount: number of big flour bags (5kg each)
- smallCount: number of small flour bags (1kg each)
- goal: the target amount of flour in kg to pack

Return true if it is possible to make the goal amount using the bags.

**Conditions:**
- You can’t break any bag.
- If any of the parameters is negative → return false.

Examples:
canPack(1, 0, 4) → false
canPack(1, 0, 5) → true
canPack(0, 5, 4) → true
canPack(2, 2, 11) → true
canPack(-3, 2, 12) → false
*/
public class FlourPacker {
    public static void main(String[] args) {
        System.out.println(canPack(2, 2, 11)); // true
    }

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }

        int maxBigBagsWeCanUse = goal / 5;
        if (maxBigBagsWeCanUse > bigCount) {
            maxBigBagsWeCanUse = bigCount;
        }

        int remaining = goal - (maxBigBagsWeCanUse * 5);

        return remaining <= smallCount;
    }
}

