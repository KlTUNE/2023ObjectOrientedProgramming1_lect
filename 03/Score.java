public class Score {
    int id;
    String name;
    static int[] subjects = new int[5];
    int getJapanese(){
        return  subjects[0];
    }
    int getMathmatics(){
        return subjects[1];
    }
    int getScience(){
        return subjects[2];
    }
    int getSocialStudies(){
        return subjects[3];
    }
    int getEnglish(){
        return subjects[4];
    }
    void  setJapanese(int a){
        subjects[0] = a;
    }
    void  setMathmatics(int a){
        subjects[1] = a;
    }
    void  setScience(int a){
        subjects[2] = a;
    }
    void  setSocialStudies(int a){
        subjects[3] = a;
    }
    void  setEnglish(int a){
        subjects[4] = a;
    }
    int getTotal(){
        int total=0;
        for (int i=0;i<5;i++){
            total += subjects[i];
        }
        return  total;
    }
    double getAverage(){
        double total=0;
        for (int i=0;i<5;i++){
            total += subjects[i];
        }
        return  total/5;
    }
    int getHighScore(){
        int high=subjects[0];
        for (int i=1;i<5;i++){
            if (high < subjects[i]){
                high = subjects[i];
            }
        }
        return  high;
    }
    String getHighScoreSubject(){
        Score app = new Score();
        String[] subject = {"国語", "数学", "理科", "社会","英語"};
        String str = "「";
        int high = app.getHighScore();
        for (int i=0;i<5;i++){
            if (subjects[i] == high && str == "「") {
                str += subject[i];
            } else if (subjects[i] == high) {
                str += ("," + subject[i]);
            }
        }
        return  str+"」";
    }
    int getLowScore(){
        int low=subjects[0];
        for (int i=1;i<5;i++){
            if (low > subjects[i]){
                low = subjects[i];
            }
        }
        return  low;
    }
    String getLowScoreSubject(){
        Score app = new Score();
        String[] subject = {"国語", "数学", "理科", "社会","英語"};
        String str = "「";
        int low = app.getLowScore();
        for (int i=0;i<5;i++){
            if (subjects[i] == low && str == "「") {
                str += subject[i];
            } else if (subjects[i] == low) {
                str += ("," + subject[i]);
            }
        }
        return  str+"」";
    }
    void printInfo(){
        Score app = new Score();
        System.out.printf("「%d %s 国語%d点,数学%d点,理科%d点,社会%d点,英語%d点 合計%d点 平均%.2f点 得意科目%s%d点 苦手科目%s%d点」\n",
                id, name, subjects[0], subjects[1], subjects[2], subjects[3], subjects[4], app.getTotal(), app.getAverage(),
                app.getHighScoreSubject(), app.getHighScore(), app.getLowScoreSubject(), app.getLowScore());
    }
}
