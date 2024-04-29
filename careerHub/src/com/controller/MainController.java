package com.controller;

import java.sql.SQLException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import com.model.Applicants;
import com.model.Companies;
import com.model.JobApplications;
import com.model.JobListings;
import com.service.ApplicantsService;
import com.service.CompaniesService;
import com.service.JobApplicationsService;
import com.service.JobListingService;

public class MainController {
private static int List;
private static int JobListings;
private static boolean list1;

public static void main(String[] args) throws SQLException {
	Scanner sc = new Scanner(System.in);
	JobListingService jobListingService = new JobListingService();
	JobApplicationsService jobApplicationsService = new JobApplicationsService();
	ApplicantsService applicantService = new ApplicantsService();
	CompaniesService companyService = new CompaniesService();
	while(true) {
		System.out.println("1. Apply with Applicant Id and Job ID");
		System.out.println("2. Post Job");
		System.out.println("3. Retrive jobs by company");
		System.out.println("4. List Applicants for each Job");
		System.out.println("5. Create profile for Applicants");
		System.out.println("6. Retrieves a list of all companies");
		System.out.println("7. Retrieves a list of all job listings");
		System.out.println("8. Retrieves a list of all applicants");
		System.out.println("0. Exit");
		int input = sc.nextInt();
		if(input == 0) {
			System.out.println("Exiting..");
			break;
			}
		switch(input) {
		case 1:
			
			JobApplications jobA = new JobApplications();
			List<JobListings> list=jobListingService.findAll();
			for(JobListings p :list) {
				System.out.println(p);
				
			}
			Random random = new Random(); 
			int randomNumber = random.nextInt(); 
			int application_id =randomNumber<0?randomNumber*-1:randomNumber;
			jobA.setApplicationId(application_id);
			System.out.println(application_id);
			System.out.println("Enter Job Id");
			jobA.setJobId(sc.nextInt());
			System.out.println("Enter Applicant Id");
			jobA.setApplicantID(sc.nextInt());
			
		    LocalDateTime currentDate = LocalDateTime.now(); // the current date
	        String ApplicationDate = currentDate.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")); // "YYYY-MM-DD"
		    System.out.println("Order_date:" +ApplicationDate);
		    jobA.setApplicaionDate(ApplicationDate);
		    
		    System.out.println("Enter Cover Letter");
		    String coverLetter = sc.nextLine(); // Consume newline character
		    coverLetter = sc.nextLine(); // Read cover letter input
		    jobA.setCoverLetter(coverLetter);
		    //jobA.setCoverLetter(sc.nextLine());
		    //sc.nextLine();
		    
		    jobApplicationsService.save(jobA);
		    System.out.println("Applied...");
			
			break;
			
		case 2:
			JobListings jobl = new JobListings();
			Random random1 = new Random(); 
			int randomNumber1 = random1.nextInt(); 
			int job_id =randomNumber1<0?randomNumber1*-1:randomNumber1;
			jobl.setJobId(job_id);
			
			System.out.println("Enter Company Id");
			jobl.setComplanyId(sc.nextInt());
			sc.nextLine();
			System.out.println("Enter Job Title");
			jobl.setJobTitle(sc.nextLine());
			//sc.nextLine();
			
			System.out.println("Enter Job Description");
			jobl.setJobDescription(sc.nextLine());
			//sc.nextLine();
			
			System.out.println("Enter Job Location");
			jobl.setJobLocation(sc.nextLine());
			//sc.nextLine();
			
			System.out.println("Enter Salary");
			jobl.setSalary(sc.nextDouble());
			sc.nextLine();
			System.out.println("Enter Job Type");
			jobl.setJobType(sc.nextLine());
			//sc.nextLine();
			
			LocalDateTime currentDate1 = LocalDateTime.now(); // the current date
	        String PostedDate = currentDate1.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")); // "YYYY-MM-DD"
		    System.out.println("Post_date:" +PostedDate);
		    jobl.setPostedDate(PostedDate);
		    
		    jobListingService.save(jobl);
			System.out.println("Added to job Listing...");
			break;
			
		case 3:
			System.out.println("Enter company id");
			int companyid = sc.nextInt();
			List<JobListings> list2 = jobListingService.findAll(companyid);
			for(JobListings c:list2) {
				System.out.println(c);
				}
			break;
		case 4:
			System.out.println("Enter Job id");
			int jobid = sc.nextInt();
			List<JobApplications> list3 = jobApplicationsService.findAll(jobid);
			for(JobApplications a : list3) {
				System.out.println(a);
			}
			break;
		case 5:
			Applicants app = new Applicants();
			Random random2 = new Random(); 
			int randomNumber2 = random2.nextInt(); 
			int applicant_id =randomNumber2<0?randomNumber2*-1:randomNumber2;
			app.setApplicantId(applicant_id);
			sc.nextLine();
			System.out.println("Enter First name");
			app.setFirstName(sc.nextLine());
			
			System.out.println("Enter Last Name");
			app.setLastName(sc.nextLine());
			
			System.out.println("Enter Email");
			app.setEmail(sc.nextLine());
			
			System.out.println("Enter Phone Number");
			app.setEmail(sc.nextLine());
			
			System.out.println("Enter Resume");
			app.setResume(sc.nextLine());
			
			applicantService.save(app);
			
			System.out.println("Applicant Added..");
			break;
		case 6:
			List<Companies> com = companyService.findAll();
			for(Companies b:com) {
				System.out.println(b);
			}
			break;
			
		case 7:
			 List<JobListings> jobListings = jobListingService.findAll();
             for (JobListings listing : jobListings) {
                 System.out.println(listing);
             }
			
			break;
			
		case 8:
			List<Applicants> appli = applicantService.findAll();
			for(Applicants ab : appli) {
				System.out.println(ab);
			}
			break;
		}
	}
}}
