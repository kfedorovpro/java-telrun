package kw6.day26;

public class MyBreak {
    public static void main(String[] args) {
        boolean permission = true;
        boolean notPermission = false;
        quarantine(permission);
        quarantine(notPermission);
    }

    public static void quarantine(boolean quarant) {
        quarantineZone:
        {
            if (quarant) {
                break quarantineZone;
            }
            System.out.println("мы в карантине");
        }
    }
}
