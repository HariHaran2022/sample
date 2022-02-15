package org.sam;

public class SampleProgram {
	
	public void abc() {
	System.out.println("First three letters");
	}
	public void xyz() {
		System.out.println("Last three letters");
	}
    public void d() {
		System.out.println("Fourth letter");
	}
	public static void main(String[] args) {
		SampleProgram sampleProgram = new SampleProgram();
	sampleProgram.abc();
	sampleProgram.xyz();
	sampleProgram.d();
	}

}
