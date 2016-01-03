package de.lart;

import de.lart.api.Bean;
import de.lart.api.Bean.Builder;
import de.lart.api.VanillaBean;

public class TestVanillaBean extends AbstractTestBean
{

    @Override
    protected Builder<? extends Bean> getBuilder()
    {
        return VanillaBean.builder();
    }
}
