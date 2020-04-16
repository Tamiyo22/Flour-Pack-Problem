public class FlourPacker {

    public static boolean canPack (int bigCount, int smallCount, int goal){
        if(bigCount < 0 || smallCount < 0 || goal < 0){
            return false;
        }

        int bigKilos = (bigCount * 5);
        int totalKilos = (bigKilos + smallCount);
        boolean evenBig = ((bigKilos % 2) == 0);
        int leftOver = goal - totalKilos;
        int leftOverTotal = leftOver *-1;

        if((leftOverTotal < 5) && (leftOverTotal > smallCount)){
            return false;
        }


        if((evenBig && (totalKilos >= goal)) ||(smallCount >= goal) || (totalKilos == goal )){
            return true;

        }

        return false;

    }
}