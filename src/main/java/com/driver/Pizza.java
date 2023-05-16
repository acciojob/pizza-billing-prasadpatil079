package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;

    public static int vegBasePrice = 300;
    public static int nonVegBasePrice = 400;
    public static int vegtop = 70;
    public static int nonVegtop = 120;
    public static int cheesePrice = 80;

    public static int bagPrice = 20;

    public int mytopping = 0;

    public static int mybaseprice=0;

    private boolean addcheese;
    private boolean addtopping;
    public boolean istakeaway;

    public Pizza(Boolean isVeg) {
        this.isVeg = isVeg;
       // this.isVeg = false;
        this.mybaseprice = isVeg ? vegBasePrice : nonVegBasePrice;
        this.price=this.mybaseprice;
        this.bill = "";
        this.addcheese = false;
        this.addtopping = false;
        this.istakeaway = false;
        // your code goes here
    }

    public int getPrice() {
        return this.price;
    }

    public void addExtraCheese() {
        // your code goes here
        if (addcheese == false) {
            addcheese = true;
            this.price += cheesePrice;
        }
    }

    public void addExtraToppings() {
        // your code goes here
        if (addtopping == false && isVeg == true) {
            addtopping = true;
            this.mytopping = vegtop;
            this.price = price + this.mytopping;
        }
        if (addtopping == false && isVeg == false) {
            addtopping = true;
            this.mytopping = nonVegtop;
            this.price = price + this.mytopping;
        }
    }

    public void addTakeaway() {
        // your code goes here
        if (istakeaway == false) {
            istakeaway = true;
            this.price = price + bagPrice;
        }
    }

        public String getBill(){
            //Base Price Of The Pizza: 300
            //Extra Cheese Added: 80
            //Extra Toppings Added: 70
            //Paperbag Added: 20
            //Total Price: 470
        String bill="Base Price Of The Pizza: " + this.mybaseprice + "\n";
            if (addcheese) {
                bill += "Extra Cheese Added: " + cheesePrice + "\n";
            }
            if (addtopping) {
                bill += "Extra Toppings Added: " + mytopping + "\n";
            }
            if (istakeaway) {
                bill += "Paperbag Added: " + bagPrice + "\n";
            }
            bill += "Total Price: " + this.price + "\n";
            // your code goes here
         this.bill=bill;
            return this.bill;
        }
    }

