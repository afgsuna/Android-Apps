package com.example.mathgame;

import java.util.Random;

public class Questions {

    private int firstNumber;
    private int secondNumber;
    private int answer;

    //There are 4 possible choices for the user to pick from.
    private int [] answerArray;

    //Which of the 4 position are correct.
    private int answerPosition;

    // The maximum value of the firstNumber or secondNumber.
    private int upperLimit;

    //
    private String questionPhrase;



    public Questions (int upperLimit){
        this.upperLimit=upperLimit;
        Random randomNumberMaker = new Random();

        this.firstNumber = randomNumberMaker.nextInt(upperLimit);
        this.secondNumber = randomNumberMaker.nextInt(upperLimit);
        this.answer = this.firstNumber + this.secondNumber;
        this.answerPosition = randomNumberMaker.nextInt(4);
        this.answerArray = new int[] {0, 1, 2, 3};

        this.answerArray[0] = answer + 1;
        this.answerArray[1] = answer + 10;
        this.answerArray[2] = answer - 5;
        this.answerArray[3] = answer - 2;

        this.answerArray = shuffleArray(this.answerArray);

        answerArray[answerPosition] = answer;

    }

    private int [] shuffleArray(int [] array){
        int index, temp;
        Random randomNumberGenerator = new Random();

        for (int i = array.length - 1; i > 0; i--){
            index = randomNumberGenerator.nextInt( i + 1);
            temp = array[index];
            array[index] = array[i];
            array[i] = temp;
        }

        return array;

    }



    public int getFirstNumber() {
        return firstNumber;
    }

    public void setFirstNumber(int firstNumber) {
        this.firstNumber = firstNumber;
    }

    public int getSecondNumber() {
        return secondNumber;
    }

    public void setSecondNumber(int secondNumber) {
        this.secondNumber = secondNumber;
    }

    public int getAnswer() {
        return answer;
    }

    public void setAnswer(int answer) {
        this.answer = answer;
    }

    public int[] getAnswerArray() {
        return answerArray;
    }

    public void setAnswerArray(int[] answerArray) {
        this.answerArray = answerArray;
    }

    public int getAnswerPosition() {
        return answerPosition;
    }

    public void setAnswerPosition(int answerPosition) {
        this.answerPosition = answerPosition;
    }

    public int getUpperLimit() {
        return upperLimit;
    }

    public void setUpperLimit(int upperLimit) {
        this.upperLimit = upperLimit;
    }

    public String getQuestionPhrase() {
        return questionPhrase;
    }

    public void setQuestionPhrase(String questionPhrase) {
        this.questionPhrase = questionPhrase;
    }
}
