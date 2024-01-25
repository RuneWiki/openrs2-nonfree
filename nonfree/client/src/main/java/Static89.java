import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static89 {

	@OriginalMember(owner = "client!df", name = "j", descriptor = "[[Z")
	public static boolean[][] aBooleanArrayArray3;

	@OriginalMember(owner = "client!df", name = "l", descriptor = "I")
	public static int anInt1987;

	@OriginalMember(owner = "client!df", name = "o", descriptor = "[Lclient!ui;")
	public static Class328[] aClass328Array1;

	@OriginalMember(owner = "client!df", name = "g", descriptor = "Lclient!eba;")
	public static final Class81 aClass81_52 = new Class81(3, -1);

	@OriginalMember(owner = "client!df", name = "i", descriptor = "Lclient!wh;")
	public static final Class356 aClass356_5 = new Class356(16);

	@OriginalMember(owner = "client!df", name = "k", descriptor = "Lclient!eba;")
	public static final Class81 aClass81_53 = new Class81(64, 6);

	@OriginalMember(owner = "client!df", name = "m", descriptor = "[[I")
	public static final int[][] anIntArrayArray10 = new int[128][128];

	@OriginalMember(owner = "client!df", name = "n", descriptor = "I")
	public static int anInt1988 = -1;

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(III)Lclient!hk;")
	public static Class20_Sub2_Sub1 method1752(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class293 local7 = Static118.aClass293ArrayArrayArray14[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass20_Sub2_Sub1_1;
	}

	@OriginalMember(owner = "client!df", name = "b", descriptor = "(B)V")
	public static void method1753() {
		@Pc(5) int local5 = 0;
		if (Static479.aClass1_Sub7_Sub1_1.method2618(Static375.anInt6609)) {
			local5 = 55;
		}
		if (!Static479.aClass1_Sub7_Sub1_1.aBoolean223) {
			local5 |= 0x40;
		}
		Static439.method6327(local5);
		Static146.aClass214_1.method4892(local5);
		Static46.aClass234_1.method5392(local5);
		Static183.aClass182_1.method4057(local5);
		Static592.aClass98_2.method2297(local5);
		Static230.method5039(local5);
		Static415.method5823(local5);
		Static365.method5361(local5);
		Static283.method4361(local5);
		Static499.method6958();
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(I)V")
	public static void method1754() {
		if (Static479.aClass1_Sub7_Sub1_1.method2625(Static375.anInt6609) || Static296.anInt5478 == Static240.anInt4595) {
			Static382.method5520(Static136.aClass12_8);
			if (Static240.anInt4595 != Static58.anInt1499) {
				Static566.method7638();
			}
		} else {
			Static304.method4713(11, Static246.anInt8758, Static360.anInt6293, false);
		}
	}
}
