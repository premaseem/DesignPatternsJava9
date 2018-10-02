package com.premaseem.adapterPattern;

public interface Adapter {

}

class AmazonCloudAdapter implements ClientBrokerInterface {
	AmazonCloudProvider adapteeProvider = new AmazonCloudProvider();

	@Override
	public void start(String id) {
		adapteeProvider.startVM(id);

	}

	@Override
	public void stop(String id) {
		adapteeProvider.stopVM(id);
	}

	@Override
	public void restart(String id) {
		adapteeProvider.rebootVM(id);
	}
}

class AzureCloudAdapter implements ClientBrokerInterface {
	AzureCloudProvider adapteeProvider = new AzureCloudProvider();

	@Override
	public void start(String id) {
		adapteeProvider.bootVM(id, "");

	}

	@Override
	public void stop(String id) {
		adapteeProvider.terminateVM(id, "");
	}

	@Override
	public void restart(String id) {
		adapteeProvider.rebootVM(id);
	}
}

class GoogleCloudAdapter implements ClientBrokerInterface {
	GoogleCloudProvider adapteeProvider = new GoogleCloudProvider();

	@Override
	public void start(String id) {
		adapteeProvider.startVM(id);

	}

	@Override
	public void stop(String id) {
		adapteeProvider.shutdownVM(id);
	}

	@Override
	public void restart(String id) {
		adapteeProvider.shutdownVM(id);
		adapteeProvider.startVM(id);
	}
}