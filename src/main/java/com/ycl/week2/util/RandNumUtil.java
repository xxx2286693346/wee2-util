package com.ycl.week2.util;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Random;

/**
 * 
    * @ClassName: RandNumUtil
    * @Description: TODO(随机数工具类)
    * @author 袁成龙
    * @date 2020年4月27日
    *
 */
public class RandNumUtil {
	//方法1：获得指定范围的随机小数,精度scale表示小数点后位数，举例min为25400.56,max为67078.94,返回小数点后2位的min和max之间的数，比如48545.87（8分）
	public static double getValue(final double min, final double max,final int scale){
		Random random = new Random();
		Double resultVal=null;
		Double nextInt = random.nextDouble()*(max-min)+min;
		BigDecimal bigDecimal = new BigDecimal(nextInt);
		resultVal=bigDecimal.setScale(scale,BigDecimal.ROUND_HALF_UP).doubleValue();
		return resultVal;
	//TODO 实现代码
	}
	
	
	
	//方法2：返回min-max之间的随机整数（包含min和不包含max值），例如返回1-3之间的随机数，则返回1或2，不能是其他数值（8分）
	public static int random(int min, int max){
		//TODO 实现代码	
		Random random = new Random();
		int  i= random.nextInt(max-min)+min;
		return i;
	} 
	
	
	//方法1：返回min-max之间的随机整数（包含min和max值），例如返回1-3之间的随机数，那么返回1或2或3都是正确的，返回4就不对。 (5分)
		public static int random2(int min, int max){
			//TODO 实现代码	
			Random random = new Random();
			int nextInt = random.nextInt(max-min+1)+min;

			return nextInt;
		
		}
}
