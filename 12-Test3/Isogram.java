import java.util.HashSet;

public class Isogram {
    public static boolean isogram(String string){
        HashSet<Character> set = new HashSet<Character>();
        for (char c : string.toCharArray()){
            set.add(c);
        }

        if (set.size() == string.length()){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(Isogram.isogram("red sun"));
        System.out.println(Isogram.isogram("blue water"));
        System.out.println(Isogram.isogram("BLUE water"));
        System.out.println(Isogram.isogram("my blue water"));
    }
}
