/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package id.kelompok2.projectmanagement.employees;

import id.kelompok2.projectmanagement.data.App;
import id.kelompok2.projectmanagement.data.Company;
import id.kelompok2.projectmanagement.projects.Project;
import java.util.ArrayList;

/**
 *
 * @author Iwan Ma'ruf
 */
/*public class Programmer extends Person{
    	
    public Programmer(String name, long id, double salary){
        super(name, id, salary);
    }
    
    public Project[] getOngoingProjects(Company company) {  
    	Project[] arrayProject = new Project[100];
    	int counter = 0;
    	for(ProjectManager pMan: company.getProjectManagers()) {
    		if(pMan != null) {
    			for(Project proj: pMan.getProjects()) {
    				if(proj != null) {
    					for(Programmer programmer: proj.getProgrammers()) {
    						if(programmer != null) {
    							if(programmer == this) {
    								arrayProject[counter] = proj;
    								counter++;
    							}
    						}
    					}
    				}
    			}
    		}
    	}
    	return arrayProject;
    }
}
*/
public class Programmer extends Person{
    private static App app;
    
    public Programmer(String name, long id, double salary){
        super(name, id, salary);
    }
    
    public static void setApp(App app) {
        Programmer.app = app;
    }
    
    public ArrayList<Project> getOngoingProjects() { //munculin project yang lagi di kerjain 
    	//Project[] arrayProject = new Project[100];
	ArrayList<Project> arrayProject = new ArrayList<>();
    	int counter = 0;
    	for(ProjectManager pMan: app.getProjectManagers()) {
    		if(pMan != null) {
    			for(Project proj: pMan.getProjects()) {
    				if(proj != null) {
    					for(Programmer programmer: proj.getProgrammers()) {
    						if(programmer != null) {
    							if(programmer == this) {
    								arrayProject.add(proj);
    							}
    						}
    					}
    				}
    			}
    		}
    	}
    	return arrayProject;
    }
}

