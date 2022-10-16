package lt.easy.crawler_log_folder_1598;

public class Answer1598 {
    public int minOperations(String[] logs) {
//        DirNode root = new DirNode("root", null, null);
//        DirNode now = root;
//
//        String back = "../";
//        String stay = "./";
//
//        for (String operator : logs) {
//            if (operator.equals(back)) {
//                if (now.getPrev() != null) {
//                    now = now.getPrev();
//                }
//            } else if (operator.equals(stay)) {
//
//            } else {
//                DirNode newDir = new DirNode(operator.substring(0, operator.length() - 1), now, null);
//                now.setNext(newDir);
//                now = newDir;
//            }
//        }
//
//        int result = 0;
//        while (now.prev != null) {
//            now = now.getPrev();
//            result++;
//        }
//
//        return result;

        return secondVersion(logs);
    }

    public int secondVersion(String[] logs) {
        String back = "../";
        String stay = "./";

        int level = 0;
        for (String operator : logs) {
            if (operator.equals(back)) {
                if (level > 0) level--;
            } else if (operator.equals(stay)) {

            } else {
                level++;
            }
        }

        return level;
    }


    private static class DirNode {
        private String name;
        private DirNode prev;
        private DirNode next;


        public DirNode(String name, DirNode prev, DirNode next) {
            this.name = name;
            this.prev = prev;
            this.next = next;
        }

        public DirNode getPrev() {
            return this.prev;
        }

        public void setNext(DirNode dir) {
            this.next = dir;
        }
    }
}
