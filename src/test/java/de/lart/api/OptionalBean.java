package de.lart.api;

import com.google.auto.value.AutoValue;

import java.util.Optional;

@AutoValue
public abstract class OptionalBean implements Bean
{
    OptionalBean()
    {}

    @Override
    public abstract String getUserName();

    protected abstract Optional<String> getInternalDisplayName();

    @Override
    public String getDisplayName()
    {
        return getInternalDisplayName().get();
    }

    @Override
    public abstract Builder toBuilder();

    public static Builder builder()
    {
        return new AutoValue_OptionalBean.Builder();
    }

    @AutoValue.Builder
    public abstract static class Builder implements Bean.Builder<OptionalBean>
    {
        @Override
        public abstract Builder userName(String userName);

        protected abstract Builder internalDisplayName(Optional<String> displayName);

        @Override
        public Builder displayName(String displayName)
        {
            return internalDisplayName(Optional.of(displayName));
        }

        protected abstract String getUserName();

        protected abstract Optional<String> getInternalDisplayName();

        abstract OptionalBean autoBuild();

        @Override
        public OptionalBean build()
        {
            if (!getInternalDisplayName().isPresent()) {
                displayName(getUserName());
            }

            return autoBuild();
        }
    }
}
