package common;

import java.util.*;

public class Inventory {
	private List<Guitar> guitarList;
	private List<Mandalorin> mandalorinList;
	
	public Inventory()
	{
		this.guitarList=new ArrayList<Guitar>();
		this.mandalorinList=new ArrayList<Mandalorin>();
	}
	public List<Guitar> getGuitarList() {
		return guitarList;
	}
	public void setGuitarList(List<Guitar> guitarList) {
		this.guitarList = guitarList;
	}
	public List<Mandalorin> getMandalorinList() {
		return mandalorinList;
	}
	public void setMandalorinList(List<Mandalorin> mandalorinList) {
		this.mandalorinList = mandalorinList;
	}
	
	public void addInstrument(Instrument instrument)
	{
		if(instrument instanceof Guitar)
		{
			guitarList.add((Guitar)instrument);
		}
		if(instrument instanceof Mandalorin)
		{
			mandalorinList.add((Mandalorin)instrument);
		}
	}
	public List<Instrument> searchInstrument(InstrumentSpec instrumentspec)
	{
		List<Instrument> searchList=new ArrayList<Instrument>();
		if(instrumentspec instanceof GuitarSpec)
		{
			Iterator<Guitar> it=guitarList.iterator();
			while(it.hasNext())
			{
				Guitar guitar=(Guitar)it.next();
				GuitarSpec spec=(GuitarSpec)guitar.getInstrumentSpec();
				if(spec.equals((GuitarSpec)instrumentspec))
				{
					searchList.add(guitar);
				}
			}
		}
		if(instrumentspec instanceof MandolrinSpec)
		{
			Iterator<Mandalorin> it=mandalorinList.iterator();
			while(it.hasNext())
			{
				Mandalorin mandalorin=(Mandalorin)it.next();
				MandolrinSpec spec=(MandolrinSpec)mandalorin.getInstrumentSpec();
				if(spec.equals((MandolrinSpec)instrumentspec))
				{
					searchList.add(mandalorin);
				}
			}
		}
		return searchList;
		
	}
	
	public List<Mandalorin> searchMandalorin(MandolrinSpec mandolrinSpec)
	{
		List<Mandalorin> searchList=new ArrayList<Mandalorin>();
		Iterator<Mandalorin> it=mandalorinList.iterator();
		while(it.hasNext())
		{
			Mandalorin mandalorin=(Mandalorin)it.next();
			MandolrinSpec spec=(MandolrinSpec)mandalorin.getInstrumentSpec();
			if(spec.equals(mandolrinSpec))
			{
				searchList.add(mandalorin);
			}
		}
		return searchList;
		
	}

}
