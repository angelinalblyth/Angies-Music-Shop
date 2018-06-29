package shop;

import Instruments.Guitar;

import java.util.ArrayList;

public  class Shop {

    private ArrayList<Stock> stock;


    public Shop(){

        this.stock = new ArrayList<Stock>();

    }

    public ArrayList<Stock> getStock() {
        return stock;
    }



    public int stockLevel(){
        return stock.size();
    }

    public void addItem(Stock item) {
        stock.add(item);
    }

    public void removeItem(Stock item){
        stock.remove(item);
        }

        public double calculateMarkup(){
        double totalProfit = 0;
            for(Stock item: stock){
               totalProfit += item.getSellPrice() - item.getBoughtPrice() ;
            }
            return totalProfit;
        }

}
