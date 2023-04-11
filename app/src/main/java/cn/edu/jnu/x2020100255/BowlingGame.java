package cn.edu.jnu.x2020100255;

public class BowlingGame {
    int pins[]=new int[21];
    int currentPinIndex=0;

    public void roll(int pin) {
        pins[currentPinIndex++]=pin;
    }

    public int score() {
        int totalScore=0;
        for(int scoreIndex=0;scoreIndex<pins.length;scoreIndex++)
        {
            totalScore+=pins[scoreIndex];
            //if is a spare ,will add next score and its next score into current score
            if(scoreIndex<19)
            {
                if(10==pins[scoreIndex]+pins[scoreIndex+1]) {
                    totalScore+=pins[scoreIndex+2];
                }
            }
        }
        return totalScore;
    }
}
