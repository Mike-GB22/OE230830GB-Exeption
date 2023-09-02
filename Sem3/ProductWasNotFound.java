package Sem3;

public class ProductWasNotFound extends RuntimeException{
    public ProductWasNotFound(String msg){
        super("Product was not found: " + msg);
    }
}
