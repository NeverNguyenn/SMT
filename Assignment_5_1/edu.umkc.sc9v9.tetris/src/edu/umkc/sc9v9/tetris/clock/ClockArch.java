package edu.umkc.sc9v9.tetris.clock;


import edu.uci.isr.myx.fw.AbstractMyxSimpleBrick;
import edu.uci.isr.myx.fw.IMyxName;
import edu.uci.isr.myx.fw.MyxUtils;
import edu.umkc.sc9v9.tetris.IBoardPanel;
import edu.umkc.sc9v9.tetris.IClock;
import edu.umkc.sc9v9.tetris.ISidePanel;
import edu.umkc.sc9v9.tetris.ITetris;

public class ClockArch extends AbstractMyxSimpleBrick implements IClock
{
	public static final IMyxName msg_ITetris = MyxUtils.createName("edu.umkc.sc9v9.tetris.ITetris");
	public static final IMyxName msg_IClock = MyxUtils.createName("edu.umkc.sc9v9.tetris.IClock");
    public static final IMyxName msg_ISidePanel = MyxUtils.createName("edu.umkc.sc9v9.tetris.ISidePanel");
    public static final IMyxName msg_IBoardPanel = MyxUtils.createName("edu.umkc.sc9v9.tetris.IBoardPanel");

    public ITetris OUT_ITetris;
    public IClock OUT_IClock;
    public ISidePanel OUT_ISidePanel;
    public IBoardPanel OUT_IBoardPanel;

	public IClockImp _imp;

    public ClockArch (){
		_imp = getImplementation();
		if (_imp != null){
			_imp.setArch(this);
		} else {
			System.exit(1);
		}
	}
    
    protected IClockImp getImplementation(){
        try{
			return new ClockImp();    
        } catch (Exception e){
            System.err.println(e.getMessage());
            return null;
        }
    }

    public void init(){
        _imp.init();
    }
    
    public void begin(){
    	 OUT_ITetris = (ITetris) MyxUtils.getFirstRequiredServiceObject(this,msg_ITetris);
        if (OUT_ITetris == null){
 			System.err.println("Error: Interface edu.umkc.sc9v9.tetris.ITetris returned null");
			return;       
        }
    	OUT_IClock = (IClock) MyxUtils.getFirstRequiredServiceObject(this,msg_IClock);
        if (OUT_IClock == null){
 			System.err.println("Error: Interface edu.umkc.sc9v9.tetris.IClock returned null");
			return;       
        }
        OUT_ISidePanel = (ISidePanel) MyxUtils.getFirstRequiredServiceObject(this,msg_ISidePanel);
        if (OUT_ISidePanel == null){
 			System.err.println("Error: Interface edu.umkc.sc9v9.tetris.ISidePanel returned null");
			return;       
        }
        OUT_IBoardPanel = (IBoardPanel) MyxUtils.getFirstRequiredServiceObject(this,msg_IBoardPanel);
        if (OUT_IBoardPanel == null){
 			System.err.println("Error: Interface edu.umkc.sc9v9.tetris.IBoardPanel returned null");
			return;       
        }
        _imp.begin();
    }
    
    public void end(){
        _imp.end();
    }
    
    public void destroy(){
        _imp.destroy();
    }
    
	public Object getServiceObject(IMyxName arg0) {
		if (arg0.equals(msg_IClock)){
			return this;
		}        
		return null;
	}

	@Override
	public void setCyclesPerSecond(float cyclesPerSecond) {
		// TODO Auto-generated method stub
		_imp.setCyclesPerSecond(cyclesPerSecond);
	}

	@Override
	public void reset() {
		// TODO Auto-generated method stub
		_imp.reset();
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		_imp.update();
	}

	@Override
	public void setPaused(boolean paused) {
		// TODO Auto-generated method stub
		_imp.setPaused(paused);
	}
  
    
}