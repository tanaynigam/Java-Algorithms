import java.util.*;

public class ReadPara{
	public static void main(String[] args) {
		String para = "William Shakespeare was an English poet, playwright, and actor, widely regarded as the greatest writer in the English language and the world's pre-eminent dramatist.\nHe is often called England's national poet, and the Bard of Avon.His extant works, including collaborations, consist of approximately 38 plays, 154 sonnets, two long narrative poems, and a few other verses, some of uncertain authorship.\nHis plays have been translated into every major living language and are performed more often than those of any other playwright.";

		System.out.print(para + "\n\n");
		String[] lines = para.split("\n");
		String[] words = para.split(" |\\.");
		char ch[] = para.toCharArray();

		System.out.println("Number of lines: " + lines.length);
		System.out.println("Number of words: " + words.length);
		System.out.println("Number of characters: " + ch.length);

	}
}