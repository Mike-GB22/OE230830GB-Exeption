package Sem3;

public class ShopManager  {
    public static double purchaseProduct(int productId, int quantity) throws AccsessDBExeption{
        Product product = ProductDatabase.getProduct(productId);
        double totalPrice = product.getPrice() * quantity;
        return totalPrice;
    }
}