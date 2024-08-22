package dev.tombolton.dsa.stacksandqueues.examples.JavaScriptLinter;

import dev.tombolton.dsa.stacksandqueues.examples.JavaScriptLinter.Exceptions.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class JavaScriptLinterTest {
    static JavaScriptLinter linter;

    @BeforeAll
    static void beforeAll() {
       linter = new JavaScriptLinter();
    }

    @Test
    public void shouldNotThrowIfAllBracesMatch() {
        // Arrange
        String javascript = """
                    function factorial(n) {
                        if (n === 0 || n === 1) {
                            return 1;
                        }
                        return n * factorial(n - 1);
                    }
                """;

        // Act & Assert
        assertDoesNotThrow(() -> linter.lint(javascript));
    }

    @Test
    public void shouldThrowMissingOpeningBrace() {
        // Arrange
        String javascript = """
                    if (x.y.includes(1))) {
                        console.log('1 is included');
                    }
                """;

        // Act & Assert
        Exception e = assertThrows(MissingOpeningBraceException.class, () -> linter.lint(javascript));
        assertEquals(") does not have opening brace", e.getMessage());
    }

    @Test
    public void shouldThrowMismatchedOpeningBraceException() {
        // Arrange
        String javascript = """
                function MyComponent(props) {
                    return (
                        <div>
                            <p>Hello World</p>
                        </div>
                    ]
                }
                """;

        // Act & Assert
        Exception e = assertThrows(MismatchedOpeningBraceException.class, () -> linter.lint(javascript));
        assertEquals("] has mismatched opening brace", e.getMessage());
    }

    @Test
    public void shouldThrowMissingClosingBraceException() {
        // Arrange
        String javascript = """
                    const json = {
                      "glossary": {
                        "title": "example glossary",
                        "GlossDiv": {
                          "title": "S",
                          "GlossList": {
                            "GlossEntry": {
                              "ID": "SGML",
                              "SortAs": "SGML",
                              "GlossTerm": "Standard Generalized Markup Language",
                              "Acronym": "SGML",
                              "Abbrev": "ISO 8879:1986",
                              "GlossDef": {
                                "para": "A meta-markup language, used to create markup languages such as DocBook.",
                                "GlossSeeAlso": ["GML", "XML"]
                              },
                              "GlossSee": "markup"
                            }
                        }
                      }
                    };
                """;

        // Act & Assert
        Exception e = assertThrows(MissingClosingBraceException.class, () -> linter.lint(javascript));
        assertEquals("{ does not have closing brace", e.getMessage());
    }
}
