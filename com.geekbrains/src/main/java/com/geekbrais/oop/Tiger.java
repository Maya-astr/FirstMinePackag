package com.geekbrais.oop;
    public class Tiger extends Cat {
        protected String foto;
        public Tiger(String name, String color, int age, String masterName, int run, int sail) {
            super(name, color, age, masterName,run,sail);
            this.foto = foto;
        }
        public Tiger(String name, String color, int age, String foto){
            super(name, color, age, foto);
        }
        public String getFoto(){
            return foto;
        }
        public  void setFoto(String foto){
            this.foto = foto;
        }
    }




