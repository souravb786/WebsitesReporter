public class VowelWebsite extends Website {

    public VowelWebsite(String name) {
        super(name);
    }


    @Override
    public void obtainMessage(String message) {
        StringBuilder sb = new StringBuilder();
        char[] chars = message.toCharArray();
        for (char c : chars)
            if (isVowal(c)) {
                sb.append(String.valueOf(c).toUpperCase());
                value++;
            } else sb.append(String.valueOf(c).toLowerCase());
        System.out.println("(" + name + ", " + value + ") informs: " + sb);
    }


    private static boolean isVowal(char c) {
        return "AEUYIOaeyuio".indexOf(c) != -1;
    }
}

