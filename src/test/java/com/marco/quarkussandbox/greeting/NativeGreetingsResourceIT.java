package com.marco.quarkussandbox.greeting;

import io.quarkus.test.junit.NativeImageTest;
import org.junit.jupiter.api.Disabled;

@NativeImageTest
@Disabled
public class NativeGreetingsResourceIT extends GreetingsResourceTest {

    // Execute the same tests but in native mode.
}