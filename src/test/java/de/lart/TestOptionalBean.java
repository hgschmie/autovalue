package de.lart;

import de.lart.api.Bean;
import de.lart.api.Bean.Builder;
import de.lart.api.OptionalBean;

public class TestOptionalBean extends AbstractTestBean
{

    @Override
    protected Builder<? extends Bean> getBuilder()
    {
        return OptionalBean.builder();
    }
}
