package edu.umkc.sc9v9.tetris.sidepanel;



public class SidePanelImp implements ISidePanelImp
{
	private SidePanelArch _arch;

    public SidePanelImp (){
    }

	public void setArch(SidePanelArch arch){
		_arch = arch;
	}
	public SidePanelArch getArch(){
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