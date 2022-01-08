package com.geekbrais.oop;
    public class Cat extends Animal{
        protected String feed;
        public Cat(String name, String color, int age, String masterName, int run, int sail){
            super(name, color, age, masterName, run, sail);
    }

        public Cat(String name, String color, int age, String feed) {
        }

        public String getFeed(){
        return feed;


        }

        public void setFeed(String feed){
        this.feed = feed;
    }

        public void Tiger() {
        }
    }




