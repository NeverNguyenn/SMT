package edu.umkc.sc9v9.tetris.clock;



public class ClockImp implements IClockImp
{
	private ClockArch _arch;

    public ClockImp (){
    }

	public void setArch(ClockArch arch){
		_arch = arch;
	}
	public ClockArch getArch(){
		return _arch;
	}

	/*
  	  Myx Lifecycle Methods: these methods are called automatically by the framework
  	  as the bricks are created, attached, detached, and destroyed respectively.
	*/	
	public void init(){
	    //TODO Auto-generated method stub
	}
	public void begin(){
		//TODO Auto-generated method stub
	}
	public void end(){
		//TODO Auto-generated method stub
	}
	public void destroy(){
		//TODO Auto-generated method stub
	}

	/*
  	  Implementation primitives required by the architecture
	*/
  
    
}