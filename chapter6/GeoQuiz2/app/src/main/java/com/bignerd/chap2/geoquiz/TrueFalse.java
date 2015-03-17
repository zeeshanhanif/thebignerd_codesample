package com.bignerd.chap2.geoquiz;

/**
 * Created by zeeshanhanif on 3/16/2015.
 */
public class TrueFalse {

    private int mQuestion;
    private boolean mTrueQuestion;
    public TrueFalse(int question, boolean trueQuestion) {
        mQuestion = question;
        mTrueQuestion = trueQuestion;
    }

    public boolean isTrueQuestion() {
        return mTrueQuestion;
    }

    public void setTrueQuestion(boolean trueQuestion) {
        mTrueQuestion = trueQuestion;
    }

    public int getQuestion() {
        return mQuestion;
    }

    public void setQuestion(int question) {
        mQuestion = question;
    }
}
