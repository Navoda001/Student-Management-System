import java.util.*;

class StudentManagementSystem {
    public static String homePage() {
        Scanner input = new Scanner(System.in);
        System.out.println(
                "---------------------------------------------------------------------------------------------------------------");
        System.out.println("|\t\t\t\tWELCOME TO GDSE MARKS MANAGEMENT SYSTEM\t\t\t\t\t|");
        System.out.println(
                "---------------------------------------------------------------------------------------------------------------");
        System.out.println();
        System.out.println("[1] Add New Student\t\t\t\t\t\t[2] Add New Student With Marks");
        System.out.println("[3] Add Marks\t\t\t\t\t\t\t[4] Update Student Details");
        System.out.println("[5] Update Marks\t\t\t\t\t\t[6] Delete Student");
        System.out.println("[7] Print Student Deatails\t\t\t\t\t[8] Print Student Ranks");
        System.out.println("[9] Best in Programming Fundamentals\t\t\t\t[10] Best in Database Management System");
        System.out.println();
        System.out.print("Enter an option to continue > ");
        String n = input.next();
        return n;
    }

    public final static void clearConsole() {
        try {
            final String os = System.getProperty("os.name");
            if (os.contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                System.out.print("\033[H\033[2J");
                System.out.flush();
            }
        } catch (final Exception e) {
            e.printStackTrace();
            // Handle any exceptions.
        }
    }

    public static int searchId(String id, String[][] tempNa_ID) {
        int index = -1;
        for (int i = 0; i < tempNa_ID.length; i++) {
            if (id.equals(tempNa_ID[i][0])) {
                index = i;
                return index;
            }
        }
        return -1;
    }

    public static int searchNumberOfID(String[][] tempName_Id) {
        int count = 0;
        for (int i = 0; i < tempName_Id.length; i++) {
            if (tempName_Id[i][0] != (null)) {
                count = count + 1;
                ;
            }
        }
        return count;
    }

    public static double getAverage(int index, int tempMark[][]) {
        double avg = (double) (tempMark[index][0] + tempMark[index][1]) / 2;
        return avg;
    }

    public static void case1page() {
        System.out.println(
                "---------------------------------------------------------------------------------------------------------------");
        System.out.println("|\t\t\t\t\t\tADD NEW STUDENT\t\t\t\t\t\t|");
        System.out.println(
                "---------------------------------------------------------------------------------------------------------------");
    }

    public static void case2page() {
        System.out.println(
                "---------------------------------------------------------------------------------------------------------------");
        System.out.println("|\t\t\t\t\t\tADD NEW STUDENT WITH MARKS\t\t\t\t|");
        System.out.println(
                "---------------------------------------------------------------------------------------------------------------");
    }

    public static void case3page() {
        System.out.println(
                "---------------------------------------------------------------------------------------------------------------");
        System.out.println("|\t\t\t\t\t\tADD MARKS\t\t\t\t\t\t|");
        System.out.println(
                "---------------------------------------------------------------------------------------------------------------");
    }

    public static void case4page() {
        System.out.println(
                "---------------------------------------------------------------------------------------------------------------");
        System.out.println("|\t\t\t\t\t\tUPDATE STUDENT DETAILS\t\t\t\t\t|");
        System.out.println(
                "---------------------------------------------------------------------------------------------------------------");
    }

    public static void case5page() {
        System.out.println(
                "---------------------------------------------------------------------------------------------------------------");
        System.out.println("|\t\t\t\t\t\tUPDATE MARKS\t\t\t\t\t\t|");
        System.out.println(
                "---------------------------------------------------------------------------------------------------------------");
    }

    public static void case6page() {
        System.out.println(
                "---------------------------------------------------------------------------------------------------------------");
        System.out.println("|\t\t\t\t\t\tDELETE STUDENT\t\t\t\t\t\t|");
        System.out.println(
                "---------------------------------------------------------------------------------------------------------------");
    }

    public static void case7page() {
        System.out.println(
                "---------------------------------------------------------------------------------------------------------------");
        System.out.println("|\t\t\t\t\t\tPRINT STUDENT DEATAILS\t\t\t\t\t|");
        System.out.println(
                "---------------------------------------------------------------------------------------------------------------");
    }

    public static void case8page() {
        System.out.println(
                "---------------------------------------------------------------------------------------------------------------");
        System.out.println("|\t\t\t\t\t\tPRINT STUDENT'S RANKS\t\t\t\t\t|");
        System.out.println(
                "---------------------------------------------------------------------------------------------------------------");
    }

    public static void case9page() {
        System.out.println(
                "---------------------------------------------------------------------------------------------------------------");
        System.out.println("|\t\t\t\t\tBEST IN PROGRAMMING FUNDAMENTALS\t\t\t\t|");
        System.out.println(
                "---------------------------------------------------------------------------------------------------------------");
    }

    public static void case10page() {
        System.out.println(
                "---------------------------------------------------------------------------------------------------------------");
        System.out.println("|\t\t\t\tBEST IN DATABASE MANAGEMENT SYSTEM\t\t\t\t|");
        System.out.println(
                "---------------------------------------------------------------------------------------------------------------");
    }

    public static int[][] copyAndSortStudentRank(int[][] rankOfStudents) {
        int[][] tempRank = new int[rankOfStudents.length][1];
        for (int i = 0; i < rankOfStudents.length; i++) {
            tempRank[i][0] = rankOfStudents[i][0];
        }
        for (int i = tempRank.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (tempRank[j][0] > tempRank[j + 1][0]) {
                    int temp = tempRank[j][0];
                    tempRank[j][0] = tempRank[j + 1][0];
                    tempRank[j + 1][0] = temp;
                }
            }
        }
        return tempRank;
    }

    public static double[][] averageSort(double average[][]) {
        for (int i = average.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (average[j][0] > average[j + 1][0]) {
                    double temp = average[j][0];
                    average[j][0] = average[j + 1][0];
                    average[j + 1][0] = temp;
                }
            }
        }
        return average;
    }

    public static int[][] getAllTotals(int total[][], int studentMark[][]) {
        for (int i = 0; i < studentMark.length; i++) {
            total[i][0] = studentMark[i][0] + studentMark[i][1];
        }
        return total;
    }

    public static double[][] getAllAverages(int total[][]) {
        double[][] average = new double[total.length][1];
        for (int i = 0; i < average.length; i++) {
            average[i][0] = (double) total[i][0] / 2;
        }
        return average;
    }

    public static int[][] getAllRanks(double averageOfSort[][], int[][] rankOfStudents) {
        int count = 1;
        for (int i = averageOfSort.length - 1; i >= 0; i--) {
            rankOfStudents[i][0] = count;
            for (int j = averageOfSort.length - 2; j >= 0; j--) {
                if (averageOfSort[i][0] == averageOfSort[j][0]) {
                    rankOfStudents[j][0] = count;
                    i--;
                    count = count + 1;
                }
            }
            count = count + 1;
        }
        return rankOfStudents;
    }

    public static int searchRank(int index, double[][] average, double[][] averageOfSort, int[][] rankOfStudents) {
        int rank = 0;
        for (int i = 0; i < rankOfStudents.length; i++) {
            for (int j = 0; j < rankOfStudents.length; j++) {
                if (average[index][0] == averageOfSort[j][0]) {
                    rank = rankOfStudents[j][0];
                    return rank;
                }
            }
        }
        return rank;
    }

    public static int[][] pFMarkDescendingOrder(int[][] tempMark) {
        int[][] copyTempMark = new int[tempMark.length][1];
        for (int i = 0; i < copyTempMark.length; i++) {
            copyTempMark[i][0] = tempMark[i][0];
        }
        for (int i = copyTempMark.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (copyTempMark[j][0] > copyTempMark[j + 1][0]) {
                    int temp = copyTempMark[j][0];
                    copyTempMark[j][0] = copyTempMark[j + 1][0];
                    copyTempMark[j + 1][0] = temp;
                }
            }
        }
        return copyTempMark;
    }

    public static int[][] dBMSMarkDescendingOrder(int[][] tempMark) {
        int[][] copyTempMark = new int[tempMark.length][1];
        for (int i = 0; i < copyTempMark.length; i++) {
            copyTempMark[i][0] = tempMark[i][1];
        }
        for (int i = copyTempMark.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (copyTempMark[j][0] > copyTempMark[j + 1][0]) {
                    int temp = copyTempMark[j][0];
                    copyTempMark[j][0] = copyTempMark[j + 1][0];
                    copyTempMark[j + 1][0] = temp;
                }
            }
        }
        return copyTempMark;
    }

//--------------------------Main ----------------------------------------------------------

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[][] name_id = new String[100][2];
        int[][] studentMark = new int[name_id.length][2];
        double[][] average = new double[studentMark.length][1];// Average
        int[][] total = new int[studentMark.length][1];
        double[][] averageOfSort = new double[studentMark.length][1];// Average Of Sort
        int[][] rankOfStudents = new int[studentMark.length][1];
        double[][] tempAverage = new double[name_id.length][1];// temp Average
        int[][] sortedRankOfStudents = new int[name_id.length][1];
        String[][] sortedName_idForGetRank = new String[studentMark.length][2];
        int[][] sortedTotalForGetRank = new int[studentMark.length][1];
        double[][] avgIsInDessendingOrder = new double[studentMark.length][1];
        int[][] sortedpFMark = new int[studentMark.length][1];
        int[][] descendingOrderInPFMark = new int[studentMark.length][1];
        String[][] sortedName_idForGetBestForPF = new String[studentMark.length][2];
        int[][] sortedDBMSMarksForGetBestForPF = new int[name_id.length][1];
        int[][] sortedPFMarksForGetBestForDBMS = new int[name_id.length][1];
        int[][] pFMarkCopy = new int[name_id.length][1];
        double[][] copyAverage = new double[name_id.length][1];
        int[][] sortedDBMSMark = new int[studentMark.length][1];
        int[][] descendingOrderInDBMSMark = new int[studentMark.length][1];
        int[][] dBMSMarkCopy = new int[name_id.length][1];
        String[][] sortedName_idForGetBestForDBMS = new String[studentMark.length][2];
        String idea = homePage();
        while (!idea.equals("0")) {
            clearConsole();
            switch (idea) {

                // -----------------------------Add new Student-------------------------
               
                case "1":
                    clearConsole();
                    case1page();
                    int count = searchNumberOfID(name_id);
                    for (int i = count; i < name_id.length; i++) {
                        System.out.print("Enter Student ID : ");
                        String id = input.next();
                        int index = searchId(id, name_id);
                        if (index == -1) {
                            name_id[i][0] = id;
                            System.out.print("Enter Student Name : ");
                            name_id[i][1] = input.next();
                            System.out.print(
                                    "Student has been added successfully.Do you want to add a new student (Y/N): ");
                            String condition = input.next();
                            System.out.println();
                            if (condition.equals("N") || condition.equals("n")) {
                                break;
                            }
                            if (condition.equals("Y") || condition.equals("y")) {
                                clearConsole();
                                case1page();
                            }
                        } else if (index != -1) {
                            System.out.println("The Student ID already exists");
                            i--;
                            System.out.println();
                        }
                    }
                    break;

                // -------------------------------------------Add new Student with marks--------------------------------------
                
                case "2": 
                    case2page();
                    int count1 = searchNumberOfID(name_id);
                    for (int i = count1; i < name_id.length; i++) {
                        System.out.println();
                        System.out.print("Enter Student ID : ");
                        String id = input.next();
                        int index = searchId(id, name_id);
                        if (index == -1) {
                            name_id[i][0] = id;
                            System.out.print("Enter Student Name : ");
                            name_id[i][1] = input.next();
                            for (int j = 0; j > -1; j++) {
                                System.out.print("Programming Fundamentals Marks : ");
                                int mark1 = input.nextInt();
                                if (mark1 > 100 ||
                                        mark1 < 0) {
                                    System.out.println("Invalid marks , please enter correct marks.");
                                    System.out.println();
                                    continue;
                                } else {
                                    studentMark[i][0] = mark1;
                                    break;
                                }
                            }
                            for (int j = 0; j > -1; j++) {
                                System.out.print("Database Management System marks : ");
                                int mark2 = input.nextInt();
                                if (mark2 > 100 ||
                                        mark2 < 0) {
                                    System.out.println("Invalid marks , please enter correct marks.");
                                    System.out.println();
                                    continue;
                                } else {
                                    studentMark[i][1] = mark2;
                                    break;
                                }
                            }
                            System.out.print("Student has been added successfully.");
                        } else if (index != -1) {
                            System.out.println("The Student ID already exists");
                            i--;
                        }
                        System.out.print("Do you want to add a new student (Y/N): ");
                        String condition = input.next();
                        System.out.println();
                        if (condition.equals("N") ||
                                condition.equals("n")) {
                            break;
                        }
                        if (condition.equals("Y") ||
                                condition.equals("y")) {
                            clearConsole();
                            case2page();
                        }
                    }
                    break;

                // -------------------------------------ADD MARKS---------------------------
               
                case "3":
                    clearConsole();
                    case3page();
                    L1: for (int i = 0; i > -1; i++) {
                        System.out.println();
                        System.out.print("Enter Student ID :");
                        String id = input.next();
                        int index = searchId(id, name_id);
                        if (index != -1) {
                            System.out.println("Student Name : " + name_id[index][1]);
                            System.out.println();
                            if (studentMark[index][0] != 0
                                    && studentMark[index][0] != 0) {
                                System.out.println(
                                        "This student's marks have been already added.\nIf you wanted to update the marks,please use [4] update marks option.");
                                System.out.println();
                                System.out.print(" Do you want to add marks for another student(Y/N) : ");
                                String yesNo = input.next();
                                if (yesNo.equals("N") ||
                                        yesNo.equals("n")) {
                                    break;
                                }
                                if (yesNo.equals("Y") ||
                                        yesNo.equals("y")) {
                                    clearConsole();
                                    case3page();
                                }
                            }
                            if (studentMark[index][0] == 0) {
                                for (int j = 0; j > -1; j++) {
                                    System.out.print("Programming Fundamentals Marks : ");
                                    int mark1 = input.nextInt();
                                    if (mark1 > 100
                                            || mark1 < 0) {
                                        System.out.println("Invalid marks , please enter correct marks.");
                                        System.out.println();
                                        continue;
                                    } else {
                                        studentMark[index][0] = mark1;
                                        break;
                                    }
                                }
                            }
                            if (studentMark[index][1] == 0) {
                                L2: for (int j = 0; j > -1; j++) {
                                    System.out.print("Database Management System marks : ");
                                    int mark2 = input.nextInt();
                                    if (mark2 > 100
                                            || mark2 < 0) {
                                        System.out.println("Invalid marks , please enter correct marks.");
                                        System.out.println();
                                        continue;
                                    } else {
                                        studentMark[index][1] = mark2;
                                        System.out.print(
                                                "Marks have been added. Do you want to add marks for another student(Y/N) :");
                                        String condition = input.next();
                                        if (condition.equals("Y") || condition.equals("y")) {
                                            clearConsole();
                                            case3page();
                                            break L2;
                                        }
                                        if (condition.equals("N") || condition.equals("n")) {
                                            break L1;
                                        }
                                    }
                                }
                            }
                        }
                        if (index == -1) {
                            System.out.print("Invalid student ID. Do you want to search again? (Y/N)");
                            String condition = input.next();
                            if (condition.equals("Y") ||
                                    condition.equals("y")) {
                                continue;
                            } else if (condition.equals("N")
                                    || condition.equals("n")) {
                                break;
                            }
                        }
                    }
                    break;

                // --------------------------------------------Update Student Details-------------------------------------
               
                case "4":
                   
                    clearConsole();
                    case4page();
                    for (int i = 0; i > -1; i++) {
                        System.out.println();
                        System.out.print("Enter Student ID : ");
                        String id = input.next();
                        int index = searchId(id, name_id);
                        if (index != -1) {
                            System.out.println("Student Name : " + name_id[index][1]);
                            System.out.println();
                            System.out.print("Enter the new student name : ");
                            String id1 = input.next();
                            name_id[index][1] = id1;
                            System.out.println();
                            // System.out.println(name_id[index][1]);
                            System.out.println("Student details has been updated successfully.");
                        } else if (index == -1) {
                            System.out.println("Invalid Student ID");
                        }
                        System.out.print("Do you want to update another student details? (Y/N): ");
                        String condition = input.next();
                        System.out.println();
                        if (condition.equals("N") ||
                                condition.equals("n")) {
                            break;
                        }
                        if (condition.equals("Y") ||
                                condition.equals("y")) {
                            clearConsole();
                            case4page();
                        }
                    }
                    break;

                // -----------------------------------UPDATE MARKS--------------------------------

                case "5":
                    clearConsole();
                    case5page();
                    for (int i = 0; i > -1; i++) {
                        System.out.println();
                        System.out.print("Enter Student ID : ");
                        String id = input.next();
                        int index = searchId(id, name_id);
                        if (index != -1) {
                            System.out.println("Student Name : " + name_id[index][1]);
                            System.out.println();
                            System.out.println("Programming Fundamentals Marks : " + studentMark[index][0]);
                            System.out.println("Database Management System Mark : " + studentMark[index][1]);
                            System.out.println();
                            L3: for (int j = 0; j > -1; j++) {
                                System.out.print("Enter new Programming Fundamentls Mark : ");
                                int mark1 = input.nextInt();
                                if (mark1 > 100 ||
                                        mark1 < 0) {
                                    System.out.println("Invalid marks , please enter correct marks.");
                                    System.out.println();
                                    continue;
                                } else {
                                    studentMark[index][0] = mark1;
                                    break L3;
                                }
                            }
                            L4: for (int j = 0; j > -1; j++) {
                                System.out.print("Enter new Database Management System Mark : ");
                                int mark2 = input.nextInt();
                                if (mark2 > 100 ||
                                        mark2 < 0) {
                                    System.out.println("Invalid marks , please enter correct marks.");
                                    System.out.println();
                                    continue;
                                } else {
                                    studentMark[index][1] = mark2;
                                    break L4;
                                }
                            }
                            System.out.println("Marks have been updated successfully.");
                        } else if (index == -1) {
                            System.out.println("Invalid Student ID");
                        }
                        System.out.print("Do you want to update marks for another student? (Y/N): ");
                        String condition = input.next();
                        System.out.println();
                        if (condition.equals("N") ||
                                condition.equals("n")) {
                            break;
                        }
                        if (condition.equals("Y") ||
                                condition.equals("y")) {
                            clearConsole();
                            case5page();
                        }
                    }
                    break;

                // -------------------------------------DELETE STUDENT--------------------------------

                case "6":
                    clearConsole();
                    case6page();
                    for (int i = 0; i > -1; i++) {
                        System.out.println();
                        System.out.print("Enter Student ID : ");
                        String id = input.next();
                        int index = searchId(id, name_id);
                        if (index != -1) {
                            name_id[index][0] = null;
                            name_id[index][1] = null;
                            studentMark[index][0] = 0;
                            studentMark[index][1] = 0;
                            System.out.println("Student has been deleted successfully.");
                        } else if (index == -1) {
                            System.out.println("Invalid Student ID. ");
                        }
                        System.out.print("Do you want to delete another student? (Y/N): ");
                        String condition = input.next();
                        if (condition.equals("N") ||
                                condition.equals("n")) {
                            break;
                        }
                        if (condition.equals("Y") ||
                                condition.equals("y")) {
                            clearConsole();
                            case6page();
                        }
                    }
                    break;

                // ----------------------------------------Print Student Details----------------------------------

                case "7":
                    clearConsole();
                    case7page();
                    L2: for (int i = 0; i > -1; i++) {
                        System.out.println();
                        System.out.print("Enter Student ID : ");
                        String id = input.next();
                        int index = searchId(id, name_id);
                        if (index == -1) {
                            System.out.print("Invalid student ID. Do you want to search again? (Y/N)");
                            String condition = input.next();
                            if (condition.equals("Y") ||
                                    condition.equals("y")) {
                                continue;
                            } else if (condition.equals("N")
                                    || condition.equals("n")) {
                                break;
                            }
                        } else if (index != -1) {
                            System.out.println("Student Name : " + name_id[index][1]);
                            if (studentMark[index][0] == 0
                                    && studentMark[index][1] == 0) {
                                System.out.println();
                                System.out.print(
                                        "Marks yet to be added\nDo you want to search another student details? (Y/N) : ");
                                String condition = input.next();
                                if (condition.equals("N") || condition.equals("n")) {
                                    break;
                                }
                                if (condition.equals("Y") || condition.equals("y")) {
                                    clearConsole();
                                    case7page();
                                }
                            } else {
                                System.out.println();
                                total = getAllTotals(total, studentMark);
                                average = getAllAverages(total);
                                for (int j = 0; j < average.length; j++) {
                                    tempAverage[j][0] = average[j][0];
                                }
                                averageOfSort = averageSort(tempAverage);// MAXIMUM AVERAGE IS IN LAST
                                rankOfStudents = getAllRanks(averageOfSort, rankOfStudents);
                                int rank = searchRank(index, average, averageOfSort, rankOfStudents);
                                int count3 = searchNumberOfID(name_id);
                                System.out.println("+--------------------------------+-------------------+");
                                System.out.print("|Programming Fundamentals Marks |");
                                System.out.printf("%19d", studentMark[index][0]);
                                System.out.println("|");
                                System.out.print("|Database Manage System Marks |");
                                System.out.printf("%19d", studentMark[index][1]);
                                System.out.println("|");
                                System.out.print("|Total Marks |");
                                System.out.printf("%19d", total[index][0]);
                                System.out.println("|");
                                System.out.print("|Avg. Marks |");
                                System.out.print("\t ");
                                System.out.printf("%10.2f", average[index][0]);
                                System.out.println("|");
                                System.out.print("|Rank|");
                                if (rank == 1 || rank == 2
                                        || rank == 3) {
                                    if (rank == 1) {
                                        System.out.printf("%12d", rank);
                                        System.out.println("(First)|");
                                    }
                                    if (rank == 2) {
                                        System.out.printf("%11d", rank);
                                        System.out.println("(Second)|");
                                    }
                                    if (rank == 3) {
                                        System.out.printf("%12d", rank);
                                        System.out.println("(Third)|");
                                    }
                                } else if (rank == count3) {
                                    System.out.printf("%13d", rank);
                                    System.out.println("(Last)|");
                                } else {
                                    System.out.printf("%19d", rank);
                                    System.out.println("|");
                                }
                                System.out.println("+--------------------------------+-------------------+");
                                System.out.print("Do you want to search another student details? (Y/N) : ");
                                String condition = input.next();
                                if (condition.equals("N") || condition.equals("n")) {
                                    break L2;
                                }
                                if (condition.equals("Y") || condition.equals("y")) {
                                    clearConsole();
                                    case7page();
                                }
                            }
                        }
                    }
                    break;

                // ---------------------------------------Print Student's Ranks-------------------------

                case "8":
                    clearConsole();
                    case8page();
                    int count2 = searchNumberOfID(name_id);
                    if (count2 == 0) {
                        System.out.println();
                        System.out.println(
                                "Relevant data are not entered.\nIf you want to print student details, first enter the student's data");
                        System.out.println();
                        System.out.print("Do you want to go back to main menu? (Y/N) : ");
                        String condition = input.next();
                        if (condition.equals("Y") ||
                                condition.equals("y")) {
                            break;
                        }
                        if (condition.equals("N") ||
                                condition.equals("n")) {
                            clearConsole();
                            case8page();
                            continue;
                        }
                    }
                    if (count2 != 0) {
                        clearConsole();
                        case8page();
                        for (int i = 0; i < name_id.length; i++) {
                            total = getAllTotals(total, studentMark);
                            average = getAllAverages(total);
                            for (int j = 0; j < average.length; j++) {
                                tempAverage[j][0] = average[j][0];
                            }
                            averageOfSort = averageSort(tempAverage);
                            rankOfStudents = getAllRanks(averageOfSort, rankOfStudents);
                            sortedRankOfStudents = copyAndSortStudentRank(rankOfStudents);
                            for (int j = 0; j < average.length; j++) {
                                avgIsInDessendingOrder[j][0] = averageOfSort[average.length - 1 - j][0];
                            }
                            for (int j = 0; j < average.length; j++) {
                                copyAverage[j][0] = average[j][0];
                            }
                            for (int a = 0; a < name_id.length; a++) {
                                L5: for (int j = name_id.length - 1; j >= 0;) {
                                    for (int k = 0; k < name_id.length; k++) {
                                        if (averageOfSort[j - a][0] == copyAverage[k][0]) {
                                            sortedName_idForGetRank[a][0] = name_id[k][0];
                                            sortedName_idForGetRank[a][1] = name_id[k][1];
                                            sortedTotalForGetRank[a][0] = total[k][0];
                                            copyAverage[k][0] = 0;
                                            j--;
                                            break L5;
                                        }
                                    }
                                }
                            }
                            System.out.println();
                            System.out.println(
                                    "+---------+----------+----------------------------+-----------------+-----------------+");
                            System.out.println("|Rank |ID |Name |Total Marks |Avg. Marks |");
                            System.out.println(
                                    "+---------+----------+----------------------------+-----------------+-----------------+");
                            for (int j = 0; j < name_id.length; j++) {
                                if (avgIsInDessendingOrder[j][0] != 0) {
                                    System.out.print("| ");
                                    System.out.printf("%-8d", sortedRankOfStudents[j][0]);
                                    System.out.print("| ");
                                    System.out.printf("%-9s", sortedName_idForGetRank[j][0]);
                                    System.out.print("| ");
                                    System.out.printf("%-27s", sortedName_idForGetRank[j][1]);
                                    System.out.print("|");
                                    System.out.printf("%17d", sortedTotalForGetRank[j][0]);
                                    System.out.print("|");
                                    System.out.printf("%17.2f", avgIsInDessendingOrder[j][0]);
                                    System.out.println("|");
                                }
                            }
                            System.out.println(
                                    "+---------+----------+----------------------------+-----------------+-----------------+");
                            System.out.print("Do you want to go back to main menu? (Y/N) : ");
                            String condition = input.next();
                            if (condition.equals("Y") ||
                                    condition.equals("y")) {
                                break;
                            }
                            if (condition.equals("N") ||
                                    condition.equals("n")) {
                                clearConsole();
                                case8page();
                            }
                        }
                        break;
                    }
                    // -----------------------------------------BEST IN PROGRAMMING FUNDAMENTALS----------------------------------------------------------------------------------------------------------------------------
                case "9":
                    // ===============================================BEST IN
                    // PROGRAMMINGFUNDAMENTALS======================================================================================
                    // ---------------------------------------------------------------------------------------------------------------------------------------------------------------------
                    int count3 = searchNumberOfID(name_id);
                    clearConsole();
                    case9page();
                    if (count3 == 0) {
                        System.out.println();
                        System.out.println(
                                "Relevant data are not entered.\nIf you want to see Best in Programming Fundamentals, first enter thestudent's data");
                        System.out.println();
                        System.out.print("Do you want to go back to main menu? (Y/N) : ");
                        String condition = input.next();
                        if (condition.equals("Y") ||
                                condition.equals("y")) {
                            break;
                        }
                        if (condition.equals("N") ||
                                condition.equals("n")) {
                            clearConsole();
                            case8page();
                            continue;
                        }
                    }
                    if (count3 != 0) {
                        clearConsole();
                        case9page();
                        sortedpFMark = pFMarkDescendingOrder(studentMark);
                        for (int i = 0; i < name_id.length; i++) {
                            descendingOrderInPFMark[i][0] = sortedpFMark[name_id.length - i - 1][0];
                        }
                        for (int i = 0; i < name_id.length; i++) {
                            pFMarkCopy[i][0] = studentMark[i][0];
                        }
                        for (int a = 0; a < name_id.length; a++) {
                            L5: for (int j = name_id.length - 1; j >= 0;) {
                                for (int k = 0; k < name_id.length; k++) {
                                    if (sortedpFMark[j - a][0] == pFMarkCopy[k][0]) {
                                        sortedName_idForGetBestForPF[a][0] = name_id[k][0];
                                        sortedName_idForGetBestForPF[a][1] = name_id[k][1];
                                        sortedDBMSMarksForGetBestForPF[a][0] = studentMark[k][1];
                                        pFMarkCopy[k][0] = 0;
                                        j--;
                                        break L5;
                                    }
                                }
                            }
                        }
                        System.out.println();
                        System.out.println("+---------+-------------------------+----------------+---------------+");
                        System.out.println("|ID |Name |PF Marks |DBMS Marks |");
                        System.out.println("+---------+-------------------------+----------------+---------------+");
                        for (int j = 0; j < name_id.length; j++) {
                            if (descendingOrderInPFMark[j][0] != 0) {
                                System.out.print("|");
                                System.out.printf("%-9s", sortedName_idForGetBestForPF[j][0]);
                                System.out.print("|");
                                System.out.printf("%-25s", sortedName_idForGetBestForPF[j][1]);
                                System.out.print("|");
                                System.out.printf("%-16d", descendingOrderInPFMark[j][0]);
                                System.out.print("|");
                                System.out.printf("%-15d", sortedDBMSMarksForGetBestForPF[j][0]);
                                System.out.println("|");
                            }
                        }
                        System.out.println("+---------+-------------------------+----------------+---------------+");
                        System.out.print("Do you want to go back to main menu? (Y/N) : ");
                        String condition = input.next();
                        if (condition.equals("Y") ||
                                condition.equals("y")) {
                            break;
                        }
                        if (condition.equals("N") ||
                                condition.equals("n")) {
                            clearConsole();
                            case9page();
                            continue;
                        }
                    }
                    break;
                // ----------------------------------------------BEST IN DATABASE MANAGEMENT SYSTEM ----------------------------------------------------------------------------------------------------------------------------
                case "10":
                    
                    int count4 = searchNumberOfID(name_id);
                    clearConsole();
                    case10page();
                    if (count4 == 0) {
                        System.out.println();
                        System.out.println(
                                "Relevant data are not entered.\nIf you want to see Best in Programming Fundamentals, first enter the student's data");
                        System.out.println();
                        System.out.print("Do you want to go back to main menu? (Y/N) : ");
                        String condition = input.next();
                        if (condition.equals("Y") ||
                                condition.equals("y")) {
                            break;
                        }
                        if (condition.equals("N") ||
                                condition.equals("n")) {
                            clearConsole();
                            case8page();
                            continue;
                        }
                    }
                    if (count4 != 0) {
                        clearConsole();
                        case9page();
                        sortedDBMSMark = dBMSMarkDescendingOrder(studentMark);
                        for (int i = 0; i < name_id.length; i++) {
                            descendingOrderInDBMSMark[i][0] = sortedDBMSMark[name_id.length - i - 1][0];
                        }
                        for (int i = 0; i < name_id.length; i++) {
                            dBMSMarkCopy[i][0] = studentMark[i][1];
                        }
                        for (int a = 0; a < name_id.length; a++) {
                            L5: for (int j = name_id.length - 1; j >= 0;) {
                                for (int k = 0; k < name_id.length; k++) {
                                    if (sortedDBMSMark[j - a][0] == dBMSMarkCopy[k][0]) {
                                        sortedName_idForGetBestForDBMS[a][0] = name_id[k][0];
                                        sortedName_idForGetBestForDBMS[a][1] = name_id[k][1];
                                        sortedPFMarksForGetBestForDBMS[a][0] = studentMark[k][0];
                                        dBMSMarkCopy[k][0] = 0;
                                        j--;
                                        break L5;
                                    }
                                }
                            }
                        }
                        System.out.println();
                        System.out.println("+---------+-------------------------+----------------+---------------+");
                        System.out.println("|ID |Name |DBMS Marks |Pf Marks |");
                        System.out.println("+---------+-------------------------+----------------+---------------+");
                        for (int j = 0; j < name_id.length; j++) {
                            if (descendingOrderInDBMSMark[j][0] != 0) {
                                System.out.print("|");
                                System.out.printf("%-9s", sortedName_idForGetBestForDBMS[j][0]);
                                System.out.print("|");
                                System.out.printf("%-25s", sortedName_idForGetBestForDBMS[j][1]);
                                System.out.print("|");
                                System.out.printf("%-16d", descendingOrderInDBMSMark[j][0]);
                                System.out.print("|");
                                System.out.printf("%-15d", sortedPFMarksForGetBestForDBMS[j][0]);
                                System.out.println("|");
                            }
                        }
                        System.out.println("+---------+-------------------------+----------------+---------------+");
                        System.out.print("Do you want to go back to main menu? (Y/N) : ");
                        String condition = input.next();
                        if (condition.equals("Y") ||
                                condition.equals("y")) {
                            break;
                        }
                        if (condition.equals("N") ||
                                condition.equals("n")) {
                            clearConsole();
                            case9page();
                            continue;
                        }
                    }
                    break;
            }
            clearConsole();
            idea = homePage();
            clearConsole();
        }
    }
}