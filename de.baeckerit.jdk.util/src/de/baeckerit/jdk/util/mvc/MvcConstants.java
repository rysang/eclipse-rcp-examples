package de.baeckerit.jdk.util.mvc;

import de.baeckerit.jdk.util.CharacterRange;
import de.baeckerit.jdk.util.CharacterSet;
import de.baeckerit.jdk.util.CharacterSets;
import de.baeckerit.jdk.util.CharacterString;

public interface MvcConstants {

  CharacterRange ANY_CHARACTER = new CharacterRange();

  CharacterRange ANY_UPPER = new CharacterRange('A', 'Z');
  CharacterRange ANY_LOWER = new CharacterRange('a', 'z');
  CharacterSet ANY_LETTER = new CharacterSets(ANY_UPPER, ANY_LOWER);

  CharacterString ANY_UMLAUT_LOWER = new CharacterString("����");
  CharacterString ANY_UMLAUT_UPPER = new CharacterString("���");
  CharacterString ANY_UMLAUT = new CharacterString("�������");

  CharacterRange ANY_DIGIT = new CharacterRange('0', '9');

  CharacterSet LETTERS_AND_UMLAUTE = new CharacterSets(ANY_LETTER, ANY_UMLAUT);
  CharacterSet LETTERS_AND_DIGITS = new CharacterSets(ANY_UPPER, ANY_LOWER, ANY_DIGIT);
  CharacterSet LETTERS_AND_UMLAUTE_AND_DIGITS = new CharacterSets(ANY_LETTER, ANY_UMLAUT, ANY_DIGIT);

  CharacterString SPECIAL_CHARACTERS = new CharacterString(" !\"�$%&/()=?\\+*#-_,.;:'~@�|<>[]{}");
}
