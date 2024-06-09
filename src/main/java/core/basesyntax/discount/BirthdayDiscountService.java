package core.basesyntax.discount;

import core.basesyntax.strategy.DiscountService;

public class BirthdayDiscountService implements DiscountService {

    @Override
    public double getDiscount() {
        return 100 * 0.33;
    }
}