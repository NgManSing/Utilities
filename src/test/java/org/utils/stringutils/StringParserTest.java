package org.utils.stringutils;

import org.junit.jupiter.api.Test;
import org.utils.exceptions.InvalidStringInputException;

import java.security.InvalidAlgorithmParameterException;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StringParserTest {

    @Test
    void splitString_OneSeparator_expectTwoParts() throws InvalidStringInputException {
        StringParser sp = new StringParser();
        String inputString = "Hello|World";
        String separator = "\\|";
        List<String> stringParts = sp.splitString(inputString, separator);
        assertEquals(stringParts.size(), 2);
    }

    @Test
    void splitString_OneSeparator_Exception() {
        StringParser sp = new StringParser();
        String inputString = null;
        String separator = "\\|";
        assertThrows(InvalidStringInputException.class, () -> {
            sp.splitString(inputString, separator);
        });
    }
}