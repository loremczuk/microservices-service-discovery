package pl.oremczuk.bookpricingservice.models;

import java.util.List;

public class BookPriceListWrapper {

    private List<BookPrice> priceList;

    public BookPriceListWrapper(List<BookPrice> priceList) {
        this.priceList = priceList;
    }

    public List<BookPrice> getPriceList() {
        return priceList;
    }
}
