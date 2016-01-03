package de.lart.api;

import com.google.auto.value.AutoValue;

@AutoValue
public abstract class VanillaBean implements Bean
{
    VanillaBean()
    {}

    @Override
    public abstract String getUserName();

    @Override
    public abstract String getDisplayName();

    @Override
    public abstract Builder toBuilder();

    public static Builder builder()
    {
        return new AutoValue_VanillaBean.Builder();
    }

    @AutoValue.Builder
    public abstract static class Builder implements Bean.Builder<VanillaBean>
    {
        @Override
        public abstract Builder userName(String userName);

        @Override
        public abstract Builder displayName(String displayName);

        abstract String getUserName();

        abstract String getDisplayName();

        abstract VanillaBean autoBuild();

        @Override
        public VanillaBean build()
        {
            if (getDisplayName() == null) {
                displayName(getUserName());
            }

            return autoBuild();
        }
    }
}
