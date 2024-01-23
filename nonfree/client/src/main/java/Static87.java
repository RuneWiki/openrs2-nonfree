import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static87 {

	@OriginalMember(owner = "client!i", name = "f", descriptor = "[[B")
	public static byte[][] aByteArrayArray6;

	@OriginalMember(owner = "client!i", name = "b", descriptor = "Lclient!hh;")
	public static Class50 aClass50_578 = Static186.method3527("Verbindung mit Update)2Server)3)3)3");

	@OriginalMember(owner = "client!i", name = "c", descriptor = "Lclient!hh;")
	public static Class50 aClass50_579 = Static186.method3527(":duelfriend:");

	@OriginalMember(owner = "client!i", name = "d", descriptor = "I")
	public static int anInt1831 = 0;

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(ILclient!qh;)V")
	public static void method1367(@OriginalArg(1) Class93 arg0) {
		@Pc(9) Class93 local9 = Static216.method3382(arg0);
		@Pc(17) int local17;
		@Pc(19) int local19;
		if (local9 == null) {
			local17 = Static185.anInt3844;
			local19 = Static48.anInt1023;
		} else {
			local19 = local9.anInt3620;
			local17 = local9.anInt3600;
		}
		Static2.method44(local19, false, arg0, local17);
		Static188.method3104(arg0, local19, local17);
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(Lclient!hh;Lclient!hh;Lclient!hh;II)V")
	public static void method1368(@OriginalArg(0) Class50 arg0, @OriginalArg(1) Class50 arg1, @OriginalArg(2) Class50 arg2) {
		Static181.method2964(arg0, -1, arg2, 9, arg1);
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(II)Z")
	public static boolean method1370(@OriginalArg(1) int arg0) {
		return (arg0 >> 28 & 0x1) != 0;
	}
}
