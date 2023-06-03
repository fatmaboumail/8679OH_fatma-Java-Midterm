package company_app_design;

public enum Months {
    January, February, March, April, May, June, July, August, September, October, November, December;
    int noofmonths;
    int getNoofmonths(){
        return noofmonths;
    }
    public static void main(String[]args){
        Months m1=Months.January;

        for ( Months m: Months.values() ){
            System.out.println(m.ordinal()+1+" "+m.name()+" "+m.getNoofmonths());
        }

    }
}
