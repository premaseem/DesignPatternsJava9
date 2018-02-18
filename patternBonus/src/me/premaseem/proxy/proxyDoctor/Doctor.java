package me.premaseem.proxy.proxyDoctor;

public abstract class Doctor {

	void doGeneralCheckup() {
		new HospitalService().callNurse();
	}

	abstract void doOperationAndSurgery();

	void provideSummaryandReport() {
		new HospitalService().generateSummaryRepor();
	}
}

class RealDoctor extends Doctor {

	@Override
	void doOperationAndSurgery() {
		System.out.println("Real doctor doing operation");

	}

}

class ProxyDoctor extends Doctor {
	Doctor realDoctor = null;

	void doGeneralCheckup() {
		if (realDoctor != null) {
			realDoctor.doGeneralCheckup();
		} else {
			new HospitalService().callNurse();
		}
	}

	@Override
	void doOperationAndSurgery() {
		System.out.println("Since proxy doctor cannot handle this operation he is invoking real doctor ");
		realDoctor = new RealDoctor();
		realDoctor.doOperationAndSurgery();
	}

}