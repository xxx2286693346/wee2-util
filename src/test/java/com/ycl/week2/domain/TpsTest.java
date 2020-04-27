package com.ycl.week2.domain;

import static org.junit.Assert.*;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import org.junit.Test;

import com.ycl.week2.util.RandNumUtil;
import com.ycl.week2.util.ZHStringUtil;

public class TpsTest {
	
	

	@Test
	public void testToString() {
		ArrayList<Tps> list = new ArrayList<Tps>();
		
		for (int i = 0; i <5; i++) {
			Tps tps = new Tps();
			//id从1开始递增
			BigInteger valueOf = BigInteger.valueOf(i+1);
			tps.setId(valueOf);
			//专家姓名
			tps.setName(ZHStringUtil.getZHName());
			//专家年龄
			tps.setAge(RandNumUtil.random2(1, 100));
			//专家薪资,且保留两位小数
			double value = RandNumUtil.getValue(30000, 80000, 2);
			tps.setPrice(new BigDecimal(Double.toString(value)));
			//SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
			//tps.setTime(testTime());
			
			Calendar c = Calendar.getInstance();
			c.set(2012, 0, 1);
			Date time = c.getTime();
			Date  da= new Date();
			long time2 = time.getTime();
			long time3 = da.getTime();
			long date =(long)(Math.random()*(time3-time2)+time2);
			SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
			Date date2 = new Date(date);
			
			tps.setTime(date2);
			
			list.add(tps);
			
		}
		
		
			System.out.println(list);
		
}
}
