package edu.umkc.sc9v9.tetris.sidepanel;


import edu.uci.isr.myx.fw.AbstractMyxSimpleBrick;
import edu.uci.isr.myx.fw.IMyxName;
import edu.uci.isr.myx.fw.MyxUtils;

import edu.umkc.sc9v9.tetris.ISidePanel;

public class SidePanelArch extends AbstractMyxSimpleBrick implements ISidePanel
{
    public static final IMyxName msg_ISidePanel = MyxUtils.createName("edu.umkc.sc9v9.tetris.ISidePanel");


	private ISidePanelImp _imp;

    public SidePanelArch (){
		_imp = getImplementation();
		if (_imp != null){
			_imp.setArch(this);
		} else {
			System.exit(1);
		}
	}
    
    protected ISidePanelImp getImplementation(){
        try{
			return new SidePanelImp();    
        } catch (Exception e){
            System.err.println(e.getMessage());
            return null;
        }
    }

    public void init(){
        _imp.init();
    }
    
    public void begin(){
        _imp.begin();
    }
    
    public void end(){
        _imp.end();
    }
    
    public void destroy(){
        _imp.destroy();
    }
    
	public Object getServiceObject(IMyxName arg0) {
		if (arg0.equals(msg_ISidePanel)){
			return this;
		}        
		return null;
	}
  
    
}