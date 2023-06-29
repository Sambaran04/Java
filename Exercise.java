public class Exercise {
    public static void main(String[] args) {
        long minutes = 61;
        long seconds = 0;
        long total = getDurationString(minutes, seconds);
        long remainmin = total/60;
        long remainsec = total%60;
        long hour = remainmin/60;
        remainmin = remainmin % 60;
        if (total == -1){
            System.out.println("Not a Valid Input");
        }else{
        System.out.println(minutes + " minutes and " + seconds + " seconds = " + hour+"h "+ remainmin+"m "+remainsec + "s");
        }
    }
    public static long getDurationString(long minutes, long seconds){
        long total =0;
        if (minutes <0 || seconds <0 || seconds >59){
            return -1;
        }else if (minutes==0 && seconds != 0){
            total = seconds;
        }else if (minutes >0 && seconds ==0){
            total = minutes*60;
        }else{
            total = minutes*60 + seconds;
        }
        return total;
    }
    public static long getDurationString(long seconds) {
        if (seconds <0){
            return -1;
        }
        long minutes = seconds/60;
        seconds = seconds %60;
        System.out.println(seconds + " Seconds = " + minutes + " Minutes and " + seconds + " Seconds");
    return getDurationString(minutes, seconds);
    }
}