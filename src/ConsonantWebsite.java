public class ConsonantWebsite extends Website {

    public ConsonantWebsite(String name) {
        super(name);
    }


    @Override
    public void obtainMessage(String message) {
        StringBuilder sb = new StringBuilder();
        char[] chars = message.toCharArray();
        for (char c : chars)
            if (isConsonant(c)) {
                sb.append(String.valueOf(c).toUpperCase());
                value++;
            } else sb.append(String.valueOf(c).toLowerCase());
        System.out.println("(" + name + ", " + value + ") informs: " + sb);
    }


    private static boolean isConsonant(char c) {
        return "zxcvbnmsdfghjklqwrtpZXCVBNMSDFGHJKLQWRTP".indexOf(c) != -1;
    }
}

