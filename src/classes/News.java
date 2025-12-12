/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author Jia Xin Li
 */

public class News {
    //Created variables
    private String headline;
    private String contents;
    private String author;
    private String date;
    private String newsSource;
    private String type;
    private String category;
    
    /**
     * Constructor for the News class
     * @param type
     * @param category
     * @param headline
     * @param contents
     * @param author
     * @param date
     * @param newsSource
     */
    public News(String type, String category, String headline, String contents, String author, String date, String newsSource){
        this.headline = headline;
        this.contents = contents;
        this.author = author;
        this.date = date;
        this.newsSource = newsSource;
        this.type = type;
        this.category = category;
    }
    
    /**
     * Method to return real news information
     * @return
     */
    public String information(){
        return "This is a news";
    }
    
    /**
     * Getter method to get news type (real)
     * @return
     */
    public String getType(){
        return type;
    }

    /**
     * Override toString Method for constant output
     * @return
     */
    @Override
    public String toString(){
        return "Headline: " + headline + "\nContent: " + contents + "\nAuthor: " + author + "\nDate: " + date + "\nNews Source: " + newsSource + "\nCategory: " + category;
    }
}