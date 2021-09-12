
import java.math.BigDecimal;
public class Arith
{
	//默认除法运算精度
	private static final int DEF_DIV_SCALE = 10;
	
	//提供精确的加法运算
	public static double add(double v1, double v2)
	{
		BigDecimal b1 = BigDecimal.valueOf(v1);
		BigDecimal b2 = BigDecimal.valueOf(v2);
		return b1.add(b2).doubleValue();
	}
	//精确的 减法运算
	public static double sub(double v1, double v2)
	{
		BigDecimal b1 = BigDecimal.valueOf(v1);
		BigDecimal b2 = BigDecimal.valueOf(v2);
		return b1.subtract(b2).doubleValue();
	}
	//精确的 乘法运算
	public static double mul(double v1, double v2)
	{
		BigDecimal b1 = BigDecimal.valueOf(v1);
		BigDecimal b2 = BigDecimal.valueOf(v2);
		return b1.multiply(b2).doubleValue();
	}
	//提供（相对）精确的除法运算，当发生除不尽的情况时
	//精确到小数点后10位的数字四舍五入
	public static double div(double v1, double v2)
	{
		BigDecimal b1 = BigDecimal.valueOf(v1);
		BigDecimal b2 = BigDecimal.valueOf(v2);
		return b1.divide(b2, DEF_DIV_SCALE, BigDecimal.ROUND_HALF_UP).doubleValue();
	}	
	
	public static void main(String[] args)
	{
		System.out.println("0.05 + 0.01 = " + Arith.add(0.05, 0.01));
		System.out.println("1.0 - 0.42 = " + Arith.sub(1.0, 0.42));
		System.out.println("4.015*100 = " + Arith.mul(4.015, 100));
		System.out.println("123.3/100 = " + Arith.div(123.3, 100));
	}
}
————————————————
版权声明：本文为CSDN博主「handler-刘」的原创文章，遵循CC 4.0 BY-SA版权协议，转载请附上原文出处链接及本声明。
原文链接：https://blog.csdn.net/qq_15371293/article/details/115523087