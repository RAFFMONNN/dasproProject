package ScoreAnalyzer;

public class ScoreAnalyzer {

    public String classifyResult(int[] scores) {

        if (scores == null || scores.length == 0) {
            return "Poor";
        }

        int total = 0;

        for (int nilai : scores) {
            if (nilai >= 0 && nilai <= 100) {
                total += nilai;
            }
        }

        double rata = (double) total / scores.length;

        if (rata >= 85) {
            return "Excellent";
        } else if (rata >= 70) {
            return "Good";
        } else if (rata >= 50) {
            return "Fair";
        } else {
            return "Poor";
        }
    }
}
