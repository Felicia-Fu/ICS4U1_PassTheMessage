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
    //Instance variables
    private boolean correctType;
    private Boolean correctError;
    
    /**
     * This is a constructor of Answer object for user-identified real news
     * @param news
     * @param identifiedType 
     */
    public Answer(News news, String identifiedType){
        //If the type of the News object is equal to the user-identified type, set correctType to true.
        //Otherwise, false.
        correctType = news.getType().equalsIgnoreCase(identifiedType);
        //If the News object's instance type is FakeNews, user automatically got the source of error wrong
        //If the News object's instance type is RealNews, which doesn't have a source of error, 
        //set the Boolean object to null.
        correctError = news instanceof FakeNews ? false : null;
    }
    /**
     * This is an overloaded constructor of Answer object for user-identified fake news
     * @param news
     * @param identifiedType
     * @param identifiedError 
     */
    public Answer(News news, String identifiedType, String identifiedError){
        //If the type of the News object is equal to the user-identified type, set correctType to true.
        //Otherwise, false.
        correctType = news.getType().equalsIgnoreCase(identifiedType);
        //If the News object is an instance of RealNews, which doesn't have a source of error, 
        //user automatically got the error wrong.
        //If the News object is an instance of FakeNews, downcast it to type FakeNews and
        //compare its source of error with the identified error.
        correctError = news instanceof RealNews? false : ((FakeNews) news).getSourceOfError().equals(identifiedError);
    }
    
    //Getters of instance variables
    public boolean getTypeCorrect(){
        return correctType;
    }
    public Boolean getErrorCorrect(){
        return correctError;
    }
}
