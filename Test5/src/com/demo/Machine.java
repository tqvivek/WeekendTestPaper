package com.demo;

public class Machine {
	private String machineType;
	private Engine engine;

	public Machine(String machineType, Engine engine) {
		super();
		this.machineType = machineType;
		this.engine = engine;
	}

	public String getMachineType() {
		return machineType;
	}

	public void setMachineType(String machineType) {
		this.machineType = machineType;
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	@Override
	public String toString() {
		return "Machine [machineType=" + machineType + ", engine=" + engine + "]";
	}

}
