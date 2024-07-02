package com.designpattern;

import netscape.javascript.JSObject;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ObserverPattern {
    //
    public static void main(String[] args) {
        NewsAgency newsAgency = new NewsAgency();
        NewsChannel newsChannel1 = new NewsChannel();
        NewsChannel newsChannel2 = new NewsChannel();

        newsAgency.registerObserver(newsChannel1);
        newsAgency.registerObserver(newsChannel2);

        newsAgency.setNews("Tax free upto 3 Lakhs");
    }
}

interface Observer{
    void update(String news);
}

class NewsChannel implements Observer{
    private String news;
    public void update(String news){
        this.news = news;
        display();
    }

    public void display(){
        System.out.println("Breaking news ::"+this.news);
    }
}

interface Subject{
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}

class NewsAgency implements Subject{
    private List<Observer> observers = new ArrayList<>();
    private String news;
    public void registerObserver(Observer observer){
        observers.add(observer);
    }
    public void removeObserver(Observer observer){
        observers.remove(observer);
    }
    public void notifyObservers(){
        for (Observer observer:observers){
            observer.update(news);
        }
    }
    public void setNews(String news){
        this.news = news;
        notifyObservers();
    }
}
