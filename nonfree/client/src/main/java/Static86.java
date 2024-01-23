import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static86 {

	@OriginalMember(owner = "client!hi", name = "U", descriptor = "I")
	public static int anInt1939;

	@OriginalMember(owner = "client!hi", name = "S", descriptor = "Lclient!qe;")
	public static Class78 aClass78_428 = Static199.method3560("Hierhin gehen");

	@OriginalMember(owner = "client!hi", name = "T", descriptor = "Lclient!qe;")
	public static Class78 aClass78_429 = Static199.method3560("gleiten:");

	@OriginalMember(owner = "client!hi", name = "V", descriptor = "[I")
	public static int[] anIntArray341 = new int[4096];

	@OriginalMember(owner = "client!hi", name = "Y", descriptor = "Lclient!qe;")
	public static Class78 aClass78_430 = Static199.method3560(":");

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(BI)V")
	public static void method1522(@OriginalArg(1) int arg0) {
		if (arg0 == -1 || !Static80.method1339(arg0)) {
			return;
		}
		@Pc(16) Class64[] local16 = Static181.aClass64ArrayArray1[arg0];
		for (@Pc(18) int local18 = 0; local18 < local16.length; local18++) {
			@Pc(23) Class64 local23 = local16[local18];
			if (local23.anObjectArray13 != null) {
				@Pc(30) Class2_Sub1 local30 = new Class2_Sub1();
				local30.aClass64_1 = local23;
				local30.anObjectArray1 = local23.anObjectArray13;
				Static91.method1595(2000000, local30);
			}
		}
	}
}
