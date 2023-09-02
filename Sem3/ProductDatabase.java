package Sem3;

public class ProductDatabase {
    public static Product getProduct(int productId) throws AccsessDBExeption, ProductWasNotFound{
        // Подразумевается обращение к базе данных или хранилищу товаров
        // и получение информации о товаре по его ID
        // В данном примере мы используем заглушку
        boolean flagAccesDB = true;
        if(flagAccesDB == false) throw new AccsessDBExeption("DB Error");
        
        if (productId == 1) {
            return new Product("Product 1", 10, 5.99);
        } else { // Товар не найден
            throw new ProductWasNotFound("id: "+productId);
        }
    }
}