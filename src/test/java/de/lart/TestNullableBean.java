package de.lart;

import de.lart.api.Bean;
import de.lart.api.Bean.Builder;
import de.lart.api.NullableBean;

public class TestNullableBean extends AbstractTestBean
{

    @Override
    protected Builder<? extends Bean> getBuilder()
    {
        return NullableBean.builder();
    }
}
