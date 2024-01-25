import java.io.IOException;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static97 {

	@OriginalMember(owner = "client!de", name = "e", descriptor = "[I")
	public static int[] anIntArray126;

	@OriginalMember(owner = "client!de", name = "f", descriptor = "Lclient!bba;")
	public static Class29 aClass29_1;

	@OriginalMember(owner = "client!de", name = "h", descriptor = "Lclient!bl;")
	public static Class6_Sub5 aClass6_Sub5_1;

	@OriginalMember(owner = "client!de", name = "b", descriptor = "I")
	public static int anInt1910 = 0;

	@OriginalMember(owner = "client!de", name = "c", descriptor = "Lclient!ada;")
	public static final Class8 aClass8_10 = new Class8();

	@OriginalMember(owner = "client!de", name = "g", descriptor = "J")
	public static long aLong47 = 0L;

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(ILjava/lang/String;)V")
	public static void method1576(@OriginalArg(1) String arg0) {
		if (Static85.aStringArray17 == null) {
			Static516.method7738();
		}
		Static86.aCalendar3.setTime(new Date(Static32.method595()));
		@Pc(24) int local24 = Static86.aCalendar3.get(11);
		@Pc(28) int local28 = Static86.aCalendar3.get(12);
		@Pc(32) int local32 = Static86.aCalendar3.get(13);
		@Pc(66) String local66 = Integer.toString(local24 / 10) + local24 % 10 + ":" + local28 / 10 + local28 % 10 + ":" + local32 / 10 + local32 % 10;
		@Pc(71) String[] local71 = Static513.method7614(arg0, '\n');
		for (@Pc(73) int local73 = 0; local73 < local71.length; local73++) {
			for (@Pc(77) int local77 = Static162.anInt3372; local77 > 0; local77--) {
				Static85.aStringArray17[local77] = Static85.aStringArray17[local77 - 1];
			}
			Static85.aStringArray17[0] = local66 + ": " + local71[local73];
			if (Static326.aFileOutputStream1 != null) {
				try {
					Static326.aFileOutputStream1.write(Static627.method8750(Static85.aStringArray17[0] + "\n"));
				} catch (@Pc(123) IOException local123) {
				}
			}
			if (Static162.anInt3372 < Static85.aStringArray17.length - 1) {
				if (Static276.anInt5428 > 0) {
					Static276.anInt5428++;
				}
				Static162.anInt3372++;
			}
		}
	}
}
