import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static86 {

	@OriginalMember(owner = "client!gg", name = "e", descriptor = "Lclient!nm;")
	public static Class119 aClass119_37;

	@OriginalMember(owner = "client!gg", name = "b", descriptor = "Ljava/lang/String;")
	public static String aString67 = "Take";

	@OriginalMember(owner = "client!gg", name = "d", descriptor = "[J")
	public static long[] aLongArray6 = new long[100];

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(CB)Z")
	public static boolean method1716(@OriginalArg(0) char arg0) {
		return arg0 >= '0' && arg0 <= '9' || arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(Z)V")
	public static void method1717() {
		Static273.aClass175_40.method4287();
	}

	@OriginalMember(owner = "client!gg", name = "b", descriptor = "(I)Lclient!fh;")
	public static Class1_Sub13 method1719() {
		@Pc(8) Class1_Sub13 local8 = new Class1_Sub13(34);
		local8.method1822(11);
		local8.method1822(Static153.anInt2340);
		local8.method1822(Static252.aBoolean432 ? 1 : 0);
		local8.method1822(Static128.aBoolean223 ? 1 : 0);
		local8.method1822(Static41.aBoolean79 ? 1 : 0);
		local8.method1822(Static286.aBoolean488 ? 1 : 0);
		local8.method1822(Static271.aBoolean476 ? 1 : 0);
		local8.method1822(Static174.aBoolean528 ? 1 : 0);
		local8.method1822(Static142.aBoolean243 ? 1 : 0);
		local8.method1822(Static294.aBoolean109 ? 1 : 0);
		local8.method1822(Static147.anInt5168);
		local8.method1822(Static69.aBoolean146 ? 1 : 0);
		local8.method1822(Static43.aBoolean88 ? 1 : 0);
		local8.method1822(Static222.aBoolean379 ? 1 : 0);
		local8.method1822(Static296.anInt842);
		local8.method1822(Static230.aBoolean388 ? 1 : 0);
		local8.method1822(Static253.anInt4650);
		local8.method1822(Static172.anInt3363);
		local8.method1822(Static167.anInt638);
		local8.method1835(Static299.anInt5384);
		local8.method1835(Static80.anInt1772);
		local8.method1822(Static52.method967());
		local8.method1851(Static205.anInt3963);
		local8.method1822(Static271.anInt4996);
		local8.method1822(Static286.aBoolean489 ? 1 : 0);
		local8.method1822(Static240.aBoolean404 ? 1 : 0);
		local8.method1822(Static19.anInt422);
		local8.method1822(Static5.aBoolean18 ? 1 : 0);
		local8.method1822(Static81.aBoolean176 ? 1 : 0);
		return local8;
	}
}
