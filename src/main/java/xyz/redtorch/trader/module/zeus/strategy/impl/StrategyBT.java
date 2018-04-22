package xyz.redtorch.trader.module.zeus.strategy.impl;

import xyz.redtorch.trader.entity.Bar;
import xyz.redtorch.trader.entity.Order;
import xyz.redtorch.trader.entity.Tick;
import xyz.redtorch.trader.entity.Trade;
import xyz.redtorch.trader.module.zeus.ZeusEngine;
import xyz.redtorch.trader.module.zeus.entity.StopOrder;
import xyz.redtorch.trader.module.zeus.strategy.StrategySetting;
import xyz.redtorch.trader.module.zeus.strategy.StrategyTemplate;

/**
 * @author sun0x00@gmail.com
 */
public class StrategyBT extends StrategyTemplate{

	public StrategyBT(ZeusEngine zeusEngine, StrategySetting strategySetting) {
		super(zeusEngine, strategySetting);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void onInit() throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStartTrading() throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStopTrading(boolean isException) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTick(Tick tick) throws Exception {
		
	}

	@Override
	public void onBar(Bar bar) throws Exception {
		int timeTest = bar.getDateTime().getMinuteOfHour() + bar.getDateTime().getHourOfDay()*100;
		
		String icSymbol = strategySetting.getContractByPrefix("IC").getRtSymbol();
		String ihSymbol = strategySetting.getContractByPrefix("IH").getRtSymbol();
		if(timeTest == 945 && trading) {
			if(bar.getRtSymbol().equals(icSymbol)) {
				buyByPreset(icSymbol, bar.getClose()+1);
			}else if(bar.getRtSymbol().equals(ihSymbol)) {
				sellShortByPreset(ihSymbol, bar.getClose()-1);
			}
		}else if(timeTest == 1315 && trading) {
			if(bar.getRtSymbol().equals(icSymbol)) {
				sellByPosition(icSymbol, bar.getClose()-1);
			}else if(bar.getRtSymbol().equals(ihSymbol)) {
				buyToCoverByPosition(ihSymbol, bar.getClose()+1);
			}
		}else if(timeTest == 1445 && trading) {
			if(bar.getRtSymbol().equals(icSymbol)) {
				buyByPreset(icSymbol, bar.getClose()+1);
			}else if(bar.getRtSymbol().equals(ihSymbol)) {
				sellShortByPreset(ihSymbol, bar.getClose()-1);
			}
		}
		
	}

	@Override
	public void onXMinBar(Bar bar) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onOrder(Order order) throws Exception {
	}

	@Override
	public void onTrade(Trade trade) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStopOrder(StopOrder StopOrder) throws Exception {
		// TODO Auto-generated method stub
		
	}

}
