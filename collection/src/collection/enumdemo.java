package collection;
import java.util.*;

enum WeekDays{
	mon , tues , wed , thur , fri , sat , sun;
}

public class enumdemo {
	public static void main(String ar[])
	{
		Set<WeekDays> en = EnumSet.allOf(WeekDays.class);
		System.out.println(en);
		System.out.println(EnumSet.range(WeekDays.tues, WeekDays.fri));
		System.out.println(EnumSet.noneOf(WeekDays.class));
		System.out.println(EnumSet.complementOf(EnumSet.of(WeekDays.mon, WeekDays.fri)));
	}
}
