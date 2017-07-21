package fun.gre.egzact;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class Egzact {

    public static List<ArrayList<String>> stairr(String input, String fs) {
        List<ArrayList<String>> result = new ArrayList<ArrayList<String>>();
        List<String> resultBuilder = Arrays.asList(input.split(fs));
        List<String> rest = new ArrayList<String>();
        resultBuilder.forEach(s -> {
            rest.add(s);
            result.add(new ArrayList<String>(rest));
        });
        return result;
    }

    public static List<ArrayList<String>> stairr(List<String> input, String fs) {
        List<ArrayList<String>> result = new ArrayList<ArrayList<String>>();
        input.forEach(s -> {
            result.addAll(stairl(s, fs));
        });
        return result;
    }

    public static List<ArrayList<String>> stairl(String input, String fs) {
        List<ArrayList<String>> result = new ArrayList<ArrayList<String>>();
        List<String> resultBuilder = Arrays.asList(input.split(fs));
        int lastIndex = resultBuilder.size();
        for (int i = lastIndex-1; i >= 0; i--) {
            result.add(new ArrayList<String>(resultBuilder.subList(i, lastIndex)));
        }
        return result;
    }

    public static List<ArrayList<String>> stairl(List<String> input, String fs) {
        List<ArrayList<String>> result = new ArrayList<ArrayList<String>>();
        input.forEach(s -> {
            result.addAll(stairr(s, fs));
        });
        return result;
    }
}
