package projectacme.util;

import projectacme.UserActual;
import projectacme.view.InterfaceViewReports;


public class ThreadAccess extends Thread{
    private boolean running = true;
    InterfaceViewReports view;
    private String role;

    @Override
    public void run() {
        while (running) {
            try {
                Report report;
                System.out.println("ThreadSearching" + System.currentTimeMillis());
                if (role.equals("securityGuard")) {
                    report = new Report(UserActual.getAccessSubjectSecurityGuard().getReportsAccessLogs(),"Live Access Log");
                } else if (role.equals("officer")) {
                    report = new Report(UserActual.getAccessSubjectOfficer().getReportsAccessLogs(),"Live Access Log");
                } else {
                    System.out.println("Invalid Role");
                    return;
                }
                view.setTable(report.getInformation());
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                System.out.println("ThreadAccess was interrupted.");
                running = false;
            }
        }
    }
    public void stopThread() {
        running = false;
        this.interrupt();
    }

    public static void main(String[] args) {
        ThreadAccess threadAccess = new ThreadAccess();
        threadAccess.start();
    }

    public void setView(InterfaceViewReports view) {
        this.view = view;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
