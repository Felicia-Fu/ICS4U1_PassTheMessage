/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author Felicia
 */
public class Answer {
    private boolean correctType;
    private boolean correctError;
    public Answer(News news, String identifiedType){
        correctType = news.getType().equalsIgnoreCase(identifiedType);
        correctError = news instanceof FakeNews ? false : null;
    }
    public Answer(News news, String identifiedType, String identifiedError){
        correctType = news.getType().equalsIgnoreCase(identifiedError);
        correctError = news instanceof RealNews? false : ((FakeNews) news).getSourceOfError().equals(identifiedError);
    }
    public boolean getTypeCorrect(){
        return correctType;
    }
    public boolean getErrorCorrect(){
        return correctError;
    }
}
