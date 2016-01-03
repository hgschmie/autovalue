package de.lart.api;

import com.google.auto.value.AutoValue;

import javax.annotation.Nullable;

@AutoValue
public abstract class NullableBean implements Bean
{
    NullableBean()
    {}

    @Override
    public abstract String getUserName();

    @Nullable
    @Override
    public abstract String getDisplayName();

    @Override
    public abstract Builder toBuilder();

    public static Builder builder()
    {
        return new AutoValue_NullableBean.Builder();
    }

    @AutoValue.Builder
    public abstract static class Builder implements Bean.Builder<NullableBean>
    {
        @Override
        public abstract Builder userName(String userName);

        @Override
        public abstract Builder displayName(String displayName);

        protected abstract String getUserName();

        protected abstract String getDisplayName();

        abstract NullableBean autoBuild();

        @Override
        public NullableBean build()
        {
            if (getDisplayName() == null) {
                displayName(getUserName());
            }

            return autoBuild();
        }
    }
}
