/*
Paint Job - Challenge Instructions (Comment Form)

Bob is a wall painter. He needs help calculating how many buckets of paint to buy.

---

Method 1: getBucketCount(double width, double height, double areaPerBucket, int extraBuckets)
- width: width of the wall
- height: height of the wall
- areaPerBucket: area covered by one bucket
- extraBuckets: buckets Bob already has

→ Return number of buckets Bob needs to buy
→ Return -1 if any of:
    - width <= 0
    - height <= 0
    - areaPerBucket <= 0
    - extraBuckets < 0

EXAMPLES:
getBucketCount(-3.4, 2.1, 1.5, 2); → -1 (invalid width)
getBucketCount(3.4, 2.1, 1.5, 2); → 3
getBucketCount(2.75, 3.25, 2.5, 1); → 3

---

Method 2: getBucketCount(double width, double height, double areaPerBucket)
- Same as method 1 but no extraBuckets input
→ Return number of total buckets needed
→ Return -1 if:
    - width <= 0
    - height <= 0
    - areaPerBucket <= 0

EXAMPLES:
getBucketCount(-3.4, 2.1, 1.5); → -1
getBucketCount(3.4, 2.1, 1.5); → 5
getBucketCount(7.25, 4.3, 2.35); → 14

---

Method 3: getBucketCount(double area, double areaPerBucket)
- Bob knows total wall area but not width & height
→ Return number of buckets needed
→ Return -1 if:
    - area <= 0
    - areaPerBucket <= 0

EXAMPLES:
getBucketCount(3.4, 1.5); → 3
getBucketCount(6.26, 2.2); → 3
getBucketCount(3.26, 0.75); → 5

---

NOTES:
- Use Math.ceil to round bucket count UP
- Then cast result to int and return
- All methods must be: public static
- Do not add a `main()` method

Help Bob paint smartly 🎨
*/


public class PaintJob {
    public static void main(String[] args) {


        System.out.println(getBucketCount(3.26, 0.75));
    }
    // extraBucket are the buckets at home
    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBucket){
        // check validity of data
        if (isValid(width) || isValid(height) || isValid(areaPerBucket) || extraBucket < 0){
            return -1;
        }
        // calculate new buckets required
        // steps:
        // 1. calculate wall area
        // 2. int totalBuckets = wallArea/areaPerBucket (round off)
        // 3. newBucketRequired = totalBuckets - extraBuckets

        //1
        double wallArea = width * height;
        //2
        int totalBuckets = (int) Math.ceil(wallArea/areaPerBucket); //forced it to become integer
        //3
        int newBucketRequired = totalBuckets - extraBucket;
        return newBucketRequired;
    }
    public static int getBucketCount(double width, double height, double areaPerBucket){
        // check validity of data
        if (isValid(width) || isValid(height) || isValid(areaPerBucket)){
            return -1;
        }
        // steps:
        // 1. calculate wall area
        // 2. int totalBuckets = wallArea/areaPerBucket (round off)
        // 3. newBucketRequired = totalBuckets
        //1
        double wallArea = width * height;
        //2
        int totalBuckets = (int) Math.ceil(wallArea/areaPerBucket); //forced it to become integer
        //3
        return totalBuckets;
    }
    public static int getBucketCount(double area, double areaPerBucket){
        // check validity of data
        if (isValid(area) || isValid(areaPerBucket)){
            return -1;
        }
        //1
        double wallArea = area;
        //2
        int totalBuckets = (int) Math.ceil(wallArea/areaPerBucket); //forced it to become integer
        //3
        return totalBuckets;
    }
    // validity checker
    public static boolean isValid(double number){
        if (number <= 0){
            return true;
        }
        return false;
    }

}
