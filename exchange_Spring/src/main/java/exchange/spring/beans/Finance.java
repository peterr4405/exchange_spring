package exchange.spring.beans;


public class Finance implements IFinance{
    private IStockDAO stockdao;

    
    
    public void setStockdao(IStockDAO stockdao) {
        this.stockdao = stockdao;
    }
    
    
    

    @Override
    public double exchange(String symbol, double cash) {
        return stockdao.get(symbol)*cash;
    }
    
}
