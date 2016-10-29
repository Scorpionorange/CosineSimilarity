/**
 * Created by ScorpionOrange on 2016/10/30.
 * http://www.lintcode.com/zh-cn/problem/cosine-similarity/
 * wiki链接: Cosine Similarity
 * 这里给出公式:
 * /media/problem/cosine-similarity.png
 * 给你两个相同大小的向量 A B，求出他们的余弦相似度
 * 返回 2.0000 如果余弦相似不合法 (比如 A = [0] B = [0]).
 *
 * 样例
 * 给出 A = [1, 2, 3], B = [2, 3 ,4].
 * 返回 0.9926.
 * 给出 A = [0], B = [0].
 * 返回 2.0000
*/

public class CosineSimilarity {
    public static void main(String[] args)
    {
        int[] A = {1, 2, 3};
        int[] B = {2, 3, 4};
        System.out.println("CosineSimilarity(A, B) = " + new Solution().cosineSimilarity(A, B));
    }
}

class Solution {
    /**
     * @param A: An integer array.
     * @param B: An integer array.
     * @return: Cosine similarity.
     */
    public double cosineSimilarity(int[] A, int[] B) {
        // write your code here
        if(A.length != B.length) return -1.0;
        if(A.length == 0 || B.length == 0) return 2.0;
        int AB = 0, A2 = 0, B2 = 0;
        for(int i = 0; i < A.length; i++){
            AB = AB + A[i] * B[i];
            A2 = A2 + A[i] * A[i];
            B2 = B2 + B[i] * B[i];
        }
        if( A2 == 0 || B2 == 0) return 2.0;
        double result = AB / (Math.sqrt(A2) * Math.sqrt(B2));
        return result;
    }
}
