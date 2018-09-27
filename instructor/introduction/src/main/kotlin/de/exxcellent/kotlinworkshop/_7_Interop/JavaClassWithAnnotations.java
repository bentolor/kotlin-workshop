package de.exxcellent.kotlinworkshop._7_Interop;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class JavaClassWithAnnotations {

    @Nullable
    String mayReturnNull() {
        return "Foo";
    }

    @NotNull
    String expectsAValue(@NotNull String value) {
        return value.toLowerCase();
    }

}
