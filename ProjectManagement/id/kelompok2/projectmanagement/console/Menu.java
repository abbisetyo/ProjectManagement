/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.kelompok2.projectmanagement.console;

import id.kelompok2.projectmanagement.employees.Programmer;
import id.kelompok2.projectmanagement.employees.ProjectManager;
import id.kelompok2.projectmanagement.projects.Project;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 *
 * @author Iwan Ma'ruf
 */
public class Menu {
    public void run() {
    	while(true) {
    		showAllMenu();
    	}
    }
    
    void showMenuSatu() {
        System.out.println("Menu satu");
        System.out.println("");
        
        
    }
    
    public void showAllMenu() {
    	System.out.println("Welcome, "+ Driver.getUser().getName() +"!");
    	if(Driver.getUser() instanceof Programmer) {
    		Programmer programmer = (Programmer) Driver.getUser();
    		System.out.println("1. Active Projects");
    		System.out.println("2. User Details");
        	try {
    			switch(Integer.parseInt(inputPilihan("Pilih menu"))) {
    				case 1:
    					int i = 0;
    					for(Project p: programmer.getOngoingProjects()) {
    						System.out.println((i+1)+". "+ p.getName());
    					}
    					break;
    				case 2:
    					System.out.println("Username: "+ programmer.getName());
    					System.out.println("Salary: "+ String.valueOf(programmer.getSalary()));
    					System.out.println("ID: "+ programmer.getId());
    					break;
    			}
    		} catch (NumberFormatException | IOException e) {
    			e.printStackTrace();
    		}
    	}
    	else if(Driver.getUser() instanceof ProjectManager) {
    		
    		System.out.println("*********************************************************");
            System.out.println("*+++>                  ON-BOARD                     <+++*");
            System.out.println("*=======================================================*");
            System.out.println("*          Everybody is on board with ON-BOARD          *");
            System.out.println("*        The easiest way to manage your projects        *");
            System.out.println("*                   NO FUSS, NO RUSH                    *");
            System.out.println("*=======================================================*");
            System.out.println("*               1. Start a new project                  *");
            System.out.println("*               2. Show all projects          			*");
            System.out.println("*               3. Create your team an account          *");
            System.out.println("*               4. Show available programmers           *");
            System.out.println("*               5. Log-out                              *");
            System.out.println("*********************************************************");
    		try {
    			switch(Integer.parseInt(inputPilihan("Pilih menu"))) {
	    			case 1:
	    				createProject();
	    				break;
	    			case 2:
	    				printProjects();
	    				break;
	    			case 3:
	    				createProgrammer();
	    				break;
	    			case 4:
	    				showProgrammers();
	    				break;
	    			case 5:
	    				ConsoleMain.app.serialize();
	    				break;
    			}
    		} catch(NumberFormatException | IOException e) {
    			e.printStackTrace();
    		}
    	}
    }
    
    private void showProgrammers() {
    	int i = 0;
    	for(Programmer p: ConsoleMain.app.getProgrammers()) {
    		System.out.println((i+1) +". "+ p.getName() +" ("+ p.getId() +")");
    		i++;
    	}
	}

	private void printProjects() {
    	System.out.println("PROJECTS OF "+ Driver.getUser().getName().toUpperCase());
    	ProjectManager projMan = (ProjectManager) Driver.getUser();
    	for(Project proj: projMan.getProjects()) {
    		if(proj != null) {
    			System.out.println(proj.getId()+". "+ proj.getName());
    		}
    	}
    	try {
    		int projId = Integer.parseInt(inputPilihan("Masukkan Project ID (0 untuk kembali)"));
    		if(projectExists(projId)) {
    			showMenuProject(projId);
    		}
    	} catch(IOException e) {
    		e.printStackTrace();
    	}
	}

	private void showMenuProject(int projId) {
		ProjectManager projMan = (ProjectManager) Driver.getUser();
		Project proj = projMan.findProject(projId);
		System.out.println("Project: "+ proj.getName() +"("+ proj.getId() +")");
		System.out.println("Client: "+ proj.getClient());
		for(Programmer programmer: proj.getProgrammers()) {
			if(programmer != null) {
				System.out.println("Programmer: "+ programmer.getName());
			}
		}
		System.out.println("============ MENU ===============");
		System.out.println("1. Create Task");
		System.out.println("2. Assign Programmer To Project");
		System.out.println("3. Remove Programmer From Project");
		try {
			switch(Integer.parseInt(inputPilihan("Masukkan pilihan anda"))) {
				case 1:
					proj.addTask(inputPilihan("Masukkan nama task"), 
						Integer.parseInt(inputPilihan("Masukkan ID Task")));
					break;
				case 2:
					Programmer prog = getProgrammer(inputPilihan("Enter programmer's ID/Name"));
					if(prog != null) {
						projMan.assignProject(prog, proj.getId());
					}
					else System.out.println("The ID/Name you entered was invalid!");
					break;
				case 3:
					Programmer uProg = getProgrammer(inputPilihan("Enter programmer's ID/Name"));
					if(uProg != null) {
						projMan.unassignProject(uProg, proj.getId());
					}
					else System.out.println("The ID/Name you entered was invalid!");
					break;
			}
		} catch(IOException e) {
			e.printStackTrace();
		}
	}


	/* Made by Firda Aminy, to be used for Sprint 3.
	 * 
	 * 
	 * Signed,
	 * Adam.
	 * 
	 * 
    public void checkProgress(int login){
        double tampung=0;
        double total=0;
        ArrayList<Project> proyek=new ArrayList<>();
        proyek=daftarManajerProyek.get(login).getProjects();
        
        for (int i=0; i<proyek.size();i++){
            System.out.println((i+1)+". Nama project: "+proyek.get(i).getName());
        }
        System.out.println("Masukkan nomor proyek yang anda ingin check: ");
        int id=in.nextInt();
        
        for(int i=0;i<proyek.get(id).getTasks().size();i++){
            if(proyek.get(id).getTasks().get(i).getStatus()==true){
                tampung=tampung+proyek.get(id).getTasks().get(i).getKesulitan();
                total=total+proyek.get(id).getTasks().get(i).getKesulitan();
            }
            total=total+proyek.get(id).getTasks().get(i).getKesulitan();
        }
        System.out.println("Progress dari project adalah: "+(tampung/total*100)+"%");
    }*/

	private Programmer getProgrammer(String inputPilihan) {
		boolean number = true;
		long num = 0;
		try {
			num = Integer.parseInt(inputPilihan);
		} catch(NumberFormatException | NullPointerException e) {
			number = false;
		}
		if(number) {
			for(Programmer p: ConsoleMain.app.getProgrammers()) {
				if(p != null) {
					if(p.getId() == num) {
						return p;
					}
				}
			}
		}
		else {
			for(Programmer p: ConsoleMain.app.getProgrammers()) {
				if(p != null) {
					if(p.getName().equalsIgnoreCase(inputPilihan)) {
						return p;
					}
				}
			}
		}
		return null;
	}

	private void createProject() {
    	try {
            System.out.println("*********************************************************");
            System.out.println("*   Starting a new project is easy with these 3 steps   *");
            System.out.println("*********************************************************");
			String projectName = inputPilihan("What's the name of your project?");
	    	int projectId = Integer.parseInt(inputPilihan("What's the ID of your project?"));
	    	String projectClient = inputPilihan("Who's your client for this project?");
	    	if(!projectExists(projectId)) {
		    	ProjectManager projMan = (ProjectManager) Driver.getUser();
		    	projMan.createProject(projectId, projectName, projectClient);
	    	}
	    	else {
	    		System.out.println("The ID you entered is already in-use!");
	    	}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private boolean projectExists(int projectId) {
    	int pId;
    	boolean exists = false;
    	try(BufferedReader br = new BufferedReader(new FileReader("Projects.txt"))) {
    	    for(String line; (line = br.readLine()) != null; ) {
    	    	String[] lineVals = line.split(" ");
    	    	pId = Integer.parseInt(lineVals[1]);
    	    	if(pId == projectId) exists = true;
    	    }
    	} catch (IOException e) {
			e.printStackTrace();
		}
		return exists;
	}

	public String inputPilihan(String question) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.print(question+": ");
        String a = br.readLine();
		return a;
	}

	public void createProgrammer() {
		try {
            System.out.println("*********************************************************");
            System.out.println("*     Create an account for each of your programmers    *");
            System.out.println("*********************************************************");
			String namaProgrammer = inputPilihan("Enter programmer's name");
			String idProgrammer = inputPilihan("Enter programmer's ID");
			String gajiProgrammer = inputPilihan("Enter programmer's salary");
			String passwordProgrammer = inputPilihan("Enter programmer's default password");
			if(getProgrammer(namaProgrammer) == null && getProgrammer(idProgrammer) == null) {
				ConsoleMain.app.addProgrammer(new Programmer(namaProgrammer, Integer.parseInt(idProgrammer), Double.parseDouble(gajiProgrammer), passwordProgrammer));
//				ConsoleMain.app.serialize();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
