/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author FFC03
 */
public class RealNews extends News{
    private String url;
    public RealNews(String headline, String contents, String author, String date, String newsSource, String type, String category, String url){
        super(headline, contents, author, date, newsSource, type, category);
        this.url = url;
    }
    @Override
    public String information(){
        return """
               This is a real news
               Learn more at: """ + url;
    }
}
