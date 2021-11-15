public class VehicleTonna {
int weight;// in KG
int scorost;
String name;

VehicleTonna(int i, String name){
    weight=i;
    this.name=name;
}



    public static void main(String[] args) {
        VehicleTonna truck1=new VehicleTonna(1000,"truck1");
        VehicleTonna truck2=new VehicleTonna(2000,"truck2");
        BrodgeOfficer officer=new BrodgeOfficer(1500);

        //public boolean answerofficer=officer.Propysk(truck1);  создается переменная и ей присваивается -
        //public boolean answerofficer=officer.Propysk(truck1); -ответ офицера в зависимотси от грузоперевозки машины
     officer.Propysk(truck1);
     officer.Propysk(truck2);



    }
}




class BrodgeOfficer {
    int max_weight;// in KG
BrodgeOfficer( int o){
        max_weight=o;
}


    public void Propysk(VehicleTonna vehicleTonna){
        if(vehicleTonna.weight<=max_weight) System.out.println(vehicleTonna.name+ " you can go this road ");
        else System.out.println(vehicleTonna.name +" you cant go. Find another new way ");
    }

//можно создать метод чтобы выводил булево значение(парвда/ложь)
    // public boolean answer{
    //if(vehicleTonna.weight<=max_weight) return true;
    //else return false;
}
