package com.company;

public class Printer {

    private int toneLevel;
    private int pagesPrinted;
    private boolean duplexPrinter;


    public Printer(int toneLevel, boolean duplexPrinter) {

        if (toneLevel > -1 && toneLevel <= 100) {
            this.toneLevel = toneLevel;
        } else {
            this.toneLevel = -1;
        }
        this.duplexPrinter = duplexPrinter;
        this.pagesPrinted = 0;
    }

    public int fillToner(int tonerAmount) {
        if (tonerAmount > 0 && tonerAmount <= 100) {
            if (this.toneLevel + tonerAmount > 100) {
                return -1;
            }
            this.toneLevel += tonerAmount;
            return this.toneLevel;
        } else {
            return -1;
        }

    }

    public int printPages(int pages){

        int pagesToPrint = pages;
        if(this.duplexPrinter){
            pagesToPrint /=2;
            System.out.println("Printing in duplex mode");
        }
        this.pagesPrinted += pagesToPrint;
        return pagesToPrint;
    }
    public int getPagesPrinted() {
        return pagesPrinted;
    }
}