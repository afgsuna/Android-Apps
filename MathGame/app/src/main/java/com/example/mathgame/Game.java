package com.example.mathgame;

import java.util.List;

public class Game {

    private List<Questions> questions;
    private int numberCorrect;
    private int numberIncorrect;
    private int totalQuestion;
    private int score;
    private Questions currentQuestion;

    public List<Questions> getQuestions() {
        return questions;
    }

    public void setQuestions(List<Questions> questions) {
        this.questions = questions;
    }

    public int getNumberCorrect() {
        return numberCorrect;
    }

    public void setNumberCorrect(int numberCorrect) {
        this.numberCorrect = numberCorrect;
    }

    public int getNumberIncorrect() {
        return numberIncorrect;
    }

    public void setNumberIncorrect(int numberIncorrect) {
        this.numberIncorrect = numberIncorrect;
    }

    public int getTotalQuestion() {
        return totalQuestion;
    }

    public void setTotalQuestion(int totalQuestion) {
        this.totalQuestion = totalQuestion;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public Questions getCurrentQuestion() {
        return currentQuestion;
    }

    public void setCurrentQuestion(Questions currentQuestion) {
        this.currentQuestion = currentQuestion;
    }




    public Game(){
        numberCorrect = 0;
        numberIncorrect = 0;
        totalQuestion = 0;
        score = 0;
        currentQuestion = new Questions(0);
    }


    public void makeNewQuestion(){
        currentQuestion = new Questions(totalQuestion * 2 + 5);
        totalQuestion++;
        questions.add(currentQuestion);
    }


    public boolean checkAnswer(int submittedAnswer){
        boolean isCorrect;
        if(currentQuestion.getAnswer() == submittedAnswer) {
            numberCorrect++;
            isCorrect = true;
        } else {
            numberIncorrect++;
            isCorrect = false;
        }
        score = numberCorrect * 10 - numberIncorrect * 30;
        return isCorrect;

    }

}
