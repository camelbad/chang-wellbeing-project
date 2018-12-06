package com.mobilewellbeingkit.model;

public class Card {
    long cardId; // PK for card table
    String cardName; // title that appears on back of card
    String cardNote; // user entered card note (back of card)
    int favourite; // is the card a favourite
    int duplicate; // is the card a copy of another
    //byte[] cardPic; // custom card image
    String cardImage;//modified

    /******CONSTRUCTORS*******/
    // for cases where an empty constructor is needed
    public Card() {
    }

    // standard use where id is auto generated by DB are needed
    public Card(String name, String note, int favourite, int duplicate, String image){
        this.cardName = name;
        this.cardNote = note;
        this.favourite = favourite;
        this.duplicate = duplicate;
        this.cardImage = image;
    }

    // for cases that an id needs to be specified
    public Card(int id, String name, String note, int favourite, int duplicate, String image){
        this.cardId = id;
        this.cardName = name;
        this.cardNote = note;
        this.favourite = favourite;
        this.duplicate = duplicate;
        this.cardImage = image;
    }

    /****SETTERS****/
    public void setCardId(long id){
        this.cardId = id;
    }

    public void setCardName(String name){
        this.cardName = name;
    }

    public void setCardNote(String note){
        this.cardNote = note;
    }

    public void setFavourite(int favourite){
        this.favourite = favourite;
    }

    public void setDuplicate(int duplicate){
        this.duplicate = duplicate;
    }

    public void setCardImage(String image){ this.cardImage = image; }

    /****GETTERS****/
    public long getCardId (){return this.cardId;}

    public String getCardName() {return this.cardName;}

    public String getCardNote() {return this.cardNote;}

    public int getFavourite() {return this.favourite;}

    public int getDuplicate() {return  this.duplicate;}

    public String getCardImage(){return this.cardImage;}

}