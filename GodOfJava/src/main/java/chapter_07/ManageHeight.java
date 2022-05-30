package chapter_07;

public class ManageHeight {
    int[][] gradeHeights = new int[5][5];

    public void setData() {
        gradeHeights[0] = new int[]{170, 180, 173, 175, 177};
        gradeHeights[1] = new int[]{160, 165, 167, 186};
        gradeHeights[2] = new int[]{158, 177, 187, 176};
        gradeHeights[3] = new int[]{173, 182, 181};
        gradeHeights[4] = new int[]{170, 180, 165, 177, 172};
    }

    public void printHeight(int classNo) {
        System.out.println("Class No. : " + classNo);
        for (int height : gradeHeights[classNo - 1]) {
            System.out.println(height);
        }
    }

    public void printAverage(int classNo) {
        System.out.println("Class No. : " + classNo);
        double totalHeight = 0.0;
        int memberCount = gradeHeights[classNo - 1].length;
        for (int height : gradeHeights[classNo - 1]) {
            totalHeight += height;
        }
        System.out.println("Height average :" + totalHeight / memberCount);
    }

    public static void main(String[] args) {
        ManageHeight manageHeight = new ManageHeight();
        manageHeight.setData();
//        for (int classNo = 1; classNo <= 5; classNo++) {
//            manageHeight.printHeight(classNo);
//        }
        for (int classNo = 1; classNo <= 5; classNo++) {
            manageHeight.printAverage(classNo);
        }

    }
}
