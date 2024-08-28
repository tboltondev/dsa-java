package dev.tombolton.dsa.recursion.exercises.numberarrays;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumberArraysTest {
    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeEach
    public void beforeEach() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @AfterEach
    public void afterEach() {
        System.setOut(standardOut);
    }

    @Test
    public void shouldPrintAllNumbers() {
        // Arrange
        IntOrArr[] array = {
                IntOrArr.integer(1),
                IntOrArr.integer(2),
                IntOrArr.integer(3),
                IntOrArr.array(new IntOrArr[]{IntOrArr.integer(4), IntOrArr.integer(5), IntOrArr.integer(6)}),
                IntOrArr.integer(7),
                IntOrArr.array(new IntOrArr[]{IntOrArr.integer(8),
                    IntOrArr.array(new IntOrArr[] {IntOrArr.integer(9), IntOrArr.integer(10), IntOrArr.integer(11),
                        IntOrArr.array(new IntOrArr[]{IntOrArr.integer(12), IntOrArr.integer(13), IntOrArr.integer(14)})
                    })
                }),
                IntOrArr.array(new IntOrArr[]{IntOrArr.integer(15), IntOrArr.integer(16), IntOrArr.integer(17), IntOrArr.integer(18), IntOrArr.integer(19),
                    IntOrArr.array(new IntOrArr[] {IntOrArr.integer(20), IntOrArr.integer(21), IntOrArr.integer(22),
                        IntOrArr.array(new IntOrArr[] {IntOrArr.integer(23), IntOrArr.integer(24), IntOrArr.integer(25),
                            IntOrArr.array(new IntOrArr[]{IntOrArr.integer(26), IntOrArr.integer(27), IntOrArr.integer(28), IntOrArr.integer(29)})
                        }), IntOrArr.integer(30), IntOrArr.integer(31)
                    }), IntOrArr.integer(32)
                }), IntOrArr.integer(33)
        };

        StringBuilder expected = new StringBuilder();
        for (int i = 1; i <= 33; i++) {
            expected.append(i).append("\n");
        }

        // Act
        NumberArrays.print(array);

        // Assert
        assertEquals(expected.toString(), outputStreamCaptor.toString());
    }
}
