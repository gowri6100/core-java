package com.xworkz.aggregation;

public class Tester {
	
	public static void main(String []args) {
		
		Hospital obj = new Hospital();
		
		obj.nameOfTheHospital = "United";
		obj.noOfPatient = 5647;
		obj.noOfBlocks = 342;
		obj.noOfDoctor = 243;
		obj.noOfEmployee = 3546;
		
		System.out.println(obj.nameOfTheHospital);
		System.out.println(obj.noOfPatient);
		System.out.println(obj.noOfBlocks);
		System.out.println(obj.noOfDoctor);
		System.out.println(obj.noOfEmployee);
		
		Doctors doc = new Doctors();
		
		doc.nameOfTheDoctor = "sudarshan";
		doc.graduation = "MD";
		doc.Branch = "Nuerology";
		doc.isDoctorHaveAGoodCommunication = true;
		doc.salaryOfDoctor = 30000;
		
		System.out.println(doc.nameOfTheDoctor);
		System.out.println(doc.graduation);
		System.out.println(doc.Branch);
		System.out.println(doc.isDoctorHaveAGoodCommunication );
		System.out.println(doc.salaryOfDoctor);
		
		Patients pat = new Patients();
		
		pat.nameOfThePatient = "sham";
		pat.whichDiseasePatientHave = "maleriya";
		pat.age = 45;
		pat.bp = "120mm";
		pat.weight = 88;
		
		System.out.println(pat.nameOfThePatient);
		System.out.println(pat.whichDiseasePatientHave);
		System.out.println(pat.age);
		System.out.println(pat.bp);
		System.out.println(pat.weight);
		
		
		
		Employee emp = new Employee();
		
		emp.nameOfTheEmployee = "ram";
		emp.work = "Nurse";
		emp.age = 45;
		emp.salary = 25000;
		emp.qualification = "BSC Nursing";
		
		System.out.println(emp.nameOfTheEmployee);
		System.out.println(emp.work );
		System.out.println(emp.age );
		System.out.println(emp.salary );
		System.out.println(emp.qualification);
		
		Treatment tre = new Treatment();
		
		tre.diseaseName = "Dengue";
		tre.tabletName = "Dengue NS1";
		tre.treatmentFee = 20000;
		tre.stepsToTreatment = 10;
		tre.syrupName = "Leeford platizen";
		
		System.out.println(tre.diseaseName);
		System.out.println(tre.tabletName);
		System.out.println(tre.treatmentFee );
		System.out.println(tre.stepsToTreatment);
		System.out.println(tre.syrupName );
		
		
			
	}

}
