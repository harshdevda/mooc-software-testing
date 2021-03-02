package tudelft.discount;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import tudelft.invoicemocked.Invoice;

import java.util.Arrays;
import java.util.List;

public class DiscountApplierTest {
    @Test
    void applyDiscount() {

        Product first = new Product("Rice", 100, "HOME");
        Product second = new Product("Wheat", 1000, "BUSINESS");

        ProductDao dao = Mockito.mock(ProductDao.class);

        List<Product> results = Arrays.asList(first, second);
        Mockito.when(dao.all()).thenReturn(results);

        DiscountApplier discount = new DiscountApplier(dao);
        discount.setNewPrices();



        Assertions.assertEquals(90,first.getPrice());
        Assertions.assertEquals(1100,second.getPrice());
    }
}


