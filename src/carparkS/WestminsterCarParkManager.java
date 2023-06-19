package carparkS;

import java.util.ArrayList;
import java.util.Scanner;

public class WestminsterCarParkManager implements carParkManager {

    static Scanner reade1 = new Scanner(System.in);
    static Scanner read2 = new Scanner(System.in);
    private static String InputUser;
    static int counter = 1;
    private ArrayList<Vehicle> area;
    private static int vehicleCount = 0;

    private static int IDs;
    private static String vbrand;
    private static int Pdate;
    private static int Pmonth;
    private static int Phours;
    private static int Pminutes;

    public static void main(String[] args) {
        WestminsterCarParkManager obj = new WestminsterCarParkManager();
        obj.area = new ArrayList<>(20);
        obj.mainMenu();
    }

    @Override
    public void mainMenu() {

        System.out.println("--------------------------------");
        System.out.println(" LIVE VEHICLE PARKING SYSTEM ");
        System.out.println("--------------------------------");

        System.out.println("\n1. ADD  vehicle" + "\n2. DELETE  vehicle" + "\n3. LIST OF VEHICLE parked"
                + "\n4. VEHICLE by order" + "\n5. SEARCH VEHICLE by date"
                + "\n6. Parking charges of the vehicles"
                + "\n7. NUMBER of VEHICLE parked"
                + "\n8. AVAILABLE SLOTS FOR PARK"
                + "\n9. EXIT/CLOSE");
        System.out.println(" ");
        System.out.print("Select No: ");
        do {
            int choice = reade1.nextInt();
            switch (choice) {
                case 1:
                    addVehicle();
                    break;
                case 2:
                    deleteVehicle();
                    break;
                case 3:
                    parkingDetails();
                    break;
                case 4:
                    byOrder();
                    break;
                case 5:
                    VehcleByDate();
                    break;
                case 6:
                    chargers();
                    break;
                case 7:
                    totVehicles();
                    break;
                case 8:
                    Available();
                    break;
                case 9:
                    System.exit(0);
                    break;
                default:
                    System.err.println("INVALID Input");
            }
        } while (counter == 1);
    }

    @Override
    public void addVehicle() {
        System.out.println("A ===> Car ");
        System.out.println("B ===> Van");
        System.out.println("C ===> Motorbike");
        System.out.print("Select Vehicle Type: ");
        char select = reade1.next().charAt(0);

        System.out.print("Input vehicleBrand: ");
        vbrand = read2.nextLine();

        System.out.print("Input VehicleID: ");
        IDs = reade1.nextInt();

        System.out.print("DATE: ");
        Pdate = reade1.nextInt();

        System.out.print("MONTH: ");
        Pmonth = reade1.nextInt();

        System.out.print("HOURS: ");
        Phours = reade1.nextInt();

        System.out.print("MINUTES: ");
        Pminutes = reade1.nextInt();

        DateAndTime DT = new DateAndTime(Pdate, Pmonth, Phours, Pminutes);

        if (select == 'a' || select == 'A') {

            Caar obj = new Caar();
            System.out.print("COLOR: ");
            String color = read2.nextLine();
            System.out.print("DOORS: ");
            int doors = reade1.nextInt();

            obj.setpVehicleTYPES("Car");
            obj.setpVehicleID(IDs);
            obj.setpVehicleBrand(vbrand);
            obj.setColor(color);
            obj.setNumOfDoors(doors);
            obj.setpEntryTime(DT);

            if (vehicleCount < 20) {
                area.add(obj);
                vehicleCount++;
            } else {
                System.err.println("NO MORE Slots!");
            }
            mainMenu();
        }

        if (select == 'b' || select == 'B') {
            Van obj = new Van();
            obj.setpVehicleTYPES("Van");
            obj.setpVehicleID(IDs);
            obj.setpVehicleBrand(vbrand);
            obj.setpEntryTime(DT);

            if (vehicleCount < 20) {
                area.add(obj);
                vehicleCount++;
            } else {
                System.err.println("NO MORE SLOTS Available!!!");
            }
            mainMenu();
        }

        if (select == 'c' || select == 'C') {
            Motorbike obj = new Motorbike();

            obj.setpVehicleTYPES("Motorbike");
            obj.setpVehicleID(IDs);
            obj.setpVehicleBrand(vbrand);
            obj.setpEntryTime(DT);
            System.out.println("DONE");

            if (vehicleCount < 20) {
                area.add(obj);
                vehicleCount++;
            } else {
                System.err.println("NO MORE SLOTS!!!!");
            }
            mainMenu();
        }
    }

    @Override
    public void deleteVehicle() {

        System.out.print("ID: ");
        int id = reade1.nextInt();

        for (int i = 0; i < area.size(); i++) {
            if (id == area.get(i).getpVehicleID()) {
                System.out.println("Successfully Deleted the vehicle by ID " + area.get(i).getpVehicleID());
                area.remove(i);
                vehicleCount--;
            }
        }

        mainMenu();

    }

    @Override
    public void parkingDetails() {

        System.out.println("Type" + "\t\t" + "ID" + "\t" + "Brand" + "\t" + "Date" + "\t" + "Month" + "\t" + "Hours" + "\t" + "Minutes");

        for (int i = 0; i < area.size(); i++) {

            if (area.get(i).vehicleTipes == "Car") {

                System.out.println(area.get(i).getpVehicleTYPES() + "\t" + area.get(i).getpVehicleID()
                        + "\t" + area.get(i).getpVehicleBrand() + "\t" + area.get(i).getpEntryTime().getPDate()
                        + "\t\t" + area.get(i).getpEntryTime().getPMonth() + "\t\t" + area.get(i).getpEntryTime().getPHours() + "\t\t"
                        + area.get(i).getpEntryTime().getPMinutes());
            }

            if (area.get(i).vehicleTipes == "Van") {
                Van van = new Van();
                System.out.println(area.get(i).getpVehicleTYPES() + "\t" + area.get(i).getpVehicleID()
                        + "\t" + area.get(i).getpVehicleBrand() + "\t" + area.get(i).getpEntryTime().getPDate()
                        + "\t\t" + area.get(i).getpEntryTime().getPMonth() + "\t\t" + area.get(i).getpEntryTime().getPHours() + "\t\t"
                        + area.get(i).getpEntryTime().getPMinutes());
            }

            if (area.get(i).vehicleTipes == "Motorbike") {
                Motorbike bike = new Motorbike();
                System.out.println(area.get(i).getpVehicleTYPES() + "\t" + area.get(i).getpVehicleID()
                        + "\t" + area.get(i).getpVehicleBrand() + "\t" + area.get(i).getpEntryTime().getPDate()
                        + "\t\t" + area.get(i).getpEntryTime().getPMonth() + "\t\t" + area.get(i).getpEntryTime().getPHours() + "\t\t"
                        + area.get(i).getpEntryTime().getPMinutes());
            }
        }

    }

    @Override
    public void byOrder() {
        System.out.println("Type" + "\t" + "ID" + "\t" + "Brand");

        for (int i = area.size() - 1; i >= 0; i--) {
            System.out.println(area.get(i).getpVehicleTYPES() + "\t" + area.get(i).getpVehicleID() + "\t"
                    + area.get(i).getpVehicleBrand());
        }
    }

    @Override
    public void VehcleByDate() {
        System.out.print("date: ");
        int date = reade1.nextInt();
        System.out.print("Month: ");
        int month = reade1.nextInt();

        System.out.println("Type" + "\t" + "ID" + "\t" + "Brand");
        for (int i = 0; i < area.size(); i++) {
            if (WestminsterCarParkManager.Pdate == area.get(i).getpEntryTime().getPDate() && WestminsterCarParkManager.Pmonth == area.get(i).getpEntryTime().getPMonth()) {

                System.out.println(area.get(i).getpVehicleTYPES() + "\t" + area.get(i).getpVehicleID() + "\t"
                        + area.get(i).getpVehicleBrand());
            }
        }
    }

    @Override
    public void Available() {
        System.out.println("");
        System.out.print("AVAILABLE Slots: " + (20 - vehicleCount));
        System.out.println("");
    }

    @Override
    public void totVehicles() {
        System.out.println("");
        System.out.print("TOTAL vehicles: " + vehicleCount);
        System.out.println("");
    }

    @Override
    public void chargers() {

        int mins = 0, hours = 0;
        do {
            System.out.print("HOURS :");
            hours = reade1.nextInt();
            System.out.print("MINUTES : ");
            mins = reade1.nextInt();

        } while (((hours < 00) || (hours > 24)) && ((mins < 00) || (mins > 60)));

        for (int i = 0; i < area.size(); i++) {

            int getpHour = area.get(i).getpEntryTime().getPHours();
            int getpMinute = area.get(i).getpEntryTime().getPMinutes();

            int MinuteSDifference;
            if (mins < getpMinute) {
                MinuteSDifference = 60 + mins - getpMinute;
                if (hours == 00) {
                    hours = 23;
                } else {
                    hours--;
                }
            } else {
                MinuteSDifference = mins - getpMinute;
            }

            int hourSDifference;
            if (hours < getpHour) {
                hourSDifference = hours + 24 - hours;
            } else {
                hourSDifference = hours - getpHour;
            }

            int Payment = 0;
            int x = 1;

            double parkedHours = Math.ceil(hourSDifference + (MinuteSDifference * 1.0 / 60));

            if (parkedHours > 6) {
                Payment = 30;
            } else {
                if (parkedHours > 3) {
                    Payment = 9;
                    x = 4;
                }
            }
            for (; x <= parkedHours; x++) {
                if (parkedHours > 3) {
                    Payment += 3;
                } else {
                    Payment += 3;
                }
            }
            System.out.print("ID PLATE NUMBER : " + area.get(i).getpVehicleID());
            System.out.print("CHARGE : " + Payment);
        }
    }
}
