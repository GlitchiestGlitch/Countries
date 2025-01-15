//Name: Anthony Lam
//Date: 1/13/25
//Purpose: To create a geographic quiz for people who want to test their knowledge on capitals.
public class Country
{
  // add private instance variables for the name, capital, language, and image file.
  private String name;
  private String capital;
  private String language;
  private String imageFile;
  // add constructors
  public Country (String name, String capital, String language, String imageFile){
    this.name = name;
    this.capital = capital;
    this.language = language;
    this.imageFile = imageFile;
  }

  // Write accessor/get methods for each instance variable that returns it.
  public String getName(){
    return(this.name);
  }
  public String getCapital(){
    return(this.capital);
  }
  public String getLanguage(){
    return(this.language);
  }
  public String getimageFile(){
    return(this.imageFile);
  }
  // Write a toString() method that returns a concatenated String of 3 of the instance variables in a sentence like "..'s capital is .. and its primary language is ..."
 //To string to return information back to the review button
  public String toString(){
    return((getName() + "'s capital is " + getCapital() + " and its primary langauge is " + getLanguage()));
 }


  
}