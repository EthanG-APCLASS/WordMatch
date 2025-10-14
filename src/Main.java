public class Main
{
    public static void main (String[] args)
    {
        WordMatch w = new WordMatch("mississippi");
        System.out.println(w.scoreGuess("i"));
        System.out.println(w.scoreGuess("iss"));
        System.out.println(w.scoreGuess("issipp"));
        System.out.println(w.scoreGuess("mississippi"));
        WordMatch p = new WordMatch("aaaabb");
        System.out.println(p.scoreGuess("a"));
        System.out.println(p.scoreGuess("aa"));
        System.out.println(p.scoreGuess("aaa"));
        System.out.println(p.scoreGuess("aabb"));
        System.out.println(p.scoreGuess("c"));
        WordMatch game = new WordMatch("concatenation");
    }
}
