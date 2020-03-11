package ua.lviv.iot.lab6.RegEx;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class RegEx {

    public static String findInInterrogativeSentencesWordLengthOf(final int wordLenght, final String text) {
        Set<String> foundWords = new LinkedHashSet<>();
        foundWords.add(findInSentenceWordLengthOf(wordLenght, findInterrogativeSentences(text)));
        return foundWords.toString();
    }

    private static String findInterrogativeSentences(final String text) {
        String textToCheck = " " + text;
        Set<String> foundStrings = new LinkedHashSet<>();
        String patternString = "[^.!?]+\\?";
        Pattern pattern = Pattern.compile(patternString);
        Matcher matcher = pattern.matcher(textToCheck);
        while (matcher.find()) {
            foundStrings.add(matcher.group());
        }
        return foundStrings.toString();
    }

    private static String findInSentenceWordLengthOf(final int lengthOfWord, final String text) {
        Set<String> foundWords = new LinkedHashSet<>();
        String patternString = "\\b\\w{" + lengthOfWord + "}\\b";
        Pattern pattern = Pattern.compile(patternString);
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            foundWords.add(matcher.group());
        }
        return foundWords.toString();
    }

}
