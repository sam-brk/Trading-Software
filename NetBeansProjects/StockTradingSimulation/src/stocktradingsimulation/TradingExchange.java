/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stocktradingsimulation;

import java.util.ArrayList;

/**
 *
 * @author sb
 */



public class TradingExchange {
    
    public float shareIndex;
    //public ArrayList<Trader> traders = new ArrayList<Trader>;
    //public ArrayList<Stock> masterStock = new ArrayList<Stock>;
    
    public static void main(String[] args) {
        StockMarket market = new StockMarket();
        //As of right now, the method only tests the clock on the trading exchange.
        while (market.getMonth()!=13){
            market.incrementTime();
            System.out.println(market.isHoliday() + "-" + market.getWeekdayName(market.getWeekdays(), market.getWeekday()) + " " + market.getDay() + "-" + market.getMonth() + " " + String.format("%02d",market.getHour()) + ":" + String.format("%02d", market.getMinute()));
        }
    }

    /**public void addCompany(Stock stock){
        //Need to fill.
    }*/
    
    /**public void removeInsolventCompany(){
     * //Need to fill
     */
    
    /**public void addTrader(){
        //Need to fill
    }*/
    
    /**public void removeTrader(){
        //Need to fill
    }*/
    
    /**public void addStock(){
        //Need to fill
    }*/
    
    /**public void removeStock(){
        //Need to fill
    }*/
    
    /**public void issueStock(){
        //Need to fill
    }*/
    
    //Setter methods
    public void setShareIndex(float shareIndex) {
        this.shareIndex = shareIndex;
    }
    
    /**public void updateSharePrice(Stock stock){
        //Need to fill.
    }*/
    
    //Getter methods
    public float getShareIndex() {
        return shareIndex;
    }
    
    /**public float getSharePrice() {
        //Need to fill.
    }   */
    
    
    
}
