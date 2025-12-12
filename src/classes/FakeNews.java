/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author Connie
 */
public class FakeNews extends News{
    //Instance Variable
    private String sourceOfError;
    
    //Constructor
    public FakeNews(String type, String category, String headline, String contents, String author, String date, String newsSource, String sourceOfError){
        super(type, category, headline, contents, author, date, newsSource);
        this.sourceOfError = sourceOfError;
    }
    
    //Returns source of error
    public String getSourceOfError(){
        return sourceOfError;
    }
    
    //Returns information
    @Override
    public String information(){
        return "This is fake news. \nSource of Error: " + sourceOfError;
    }
}
