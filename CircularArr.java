package vr222ed_assign4;

import java.util.ArrayList;

public class CircularArr {
    ArrayList<Character> up = new ArrayList<Character>();
    ArrayList<Character> low = new ArrayList<Character>();
    private String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private String lower = "abcdefghijklmnopqrstuvwxyz";

    CircularArr() {
        for (char c: upper.toCharArray()) {
        up.add(c);
        }
        for (char c: lower.toCharArray()) {
        low.add(c);
        }

    }

    public Character get(char a, boolean encr) {
        int offset = 3;
        if (!encr) { offset = -3;}
        if (Character.isUpperCase(a)) {
            int ind = up.indexOf(a);
            ind = Math.floorMod(ind+offset, low.size());
            return up.get(ind);
        }
        else if (Character.isLowerCase(a)) {
            int ind = low.indexOf(a);
            ind = Math.floorMod(ind+offset, low.size());
            return low.get(ind);
        }
        else return a;
    }

}
