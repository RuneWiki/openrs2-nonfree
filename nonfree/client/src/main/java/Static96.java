import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static96 {

	@OriginalMember(owner = "client!fr", name = "e", descriptor = "[S")
	public static short[] aShortArray52;

	@OriginalMember(owner = "client!fr", name = "h", descriptor = "I")
	public static int anInt2181;

	@OriginalMember(owner = "client!fr", name = "g", descriptor = "I")
	public static int anInt2180 = 100;

	@OriginalMember(owner = "client!fr", name = "i", descriptor = "[I")
	public static final int[] anIntArray214 = new int[3];

	@OriginalMember(owner = "client!fr", name = "j", descriptor = "Z")
	public static boolean aBoolean181 = false;

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "(II)V")
	public static void method2167() {
		@Pc(1) Class119 local1 = Static335.aClass119_205;
		synchronized (Static335.aClass119_205) {
			Static335.aClass119_205.method3315(5);
		}
		local1 = Static102.aClass119_67;
		synchronized (Static102.aClass119_67) {
			Static102.aClass119_67.method3315(5);
		}
		local1 = Static214.aClass119_127;
		synchronized (Static214.aClass119_127) {
			Static214.aClass119_127.method3315(5);
		}
		local1 = Static101.aClass119_64;
		synchronized (Static101.aClass119_64) {
			Static101.aClass119_64.method3315(5);
		}
	}

	@OriginalMember(owner = "client!fr", name = "b", descriptor = "(I)V")
	public static void method2169() {
		@Pc(1) Class119 local1 = Static282.aClass119_171;
		synchronized (Static282.aClass119_171) {
			Static282.aClass119_171.method3312();
		}
		local1 = Static296.aClass119_182;
		synchronized (Static296.aClass119_182) {
			Static296.aClass119_182.method3312();
		}
		local1 = Static290.aClass119_174;
		synchronized (Static290.aClass119_174) {
			Static290.aClass119_174.method3312();
		}
	}

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "(IBII)I")
	public static int method2170(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = arg1 & 0x3;
		if (local7 == 0) {
			return arg2;
		} else if (local7 == 1) {
			return 1023 - arg0;
		} else if (local7 == 2) {
			return 1023 - arg2;
		} else {
			return arg0;
		}
	}

	@OriginalMember(owner = "client!fr", name = "c", descriptor = "(I)V")
	public static void method2171() {
		if (Static313.aClass83_1 == null) {
			return;
		}
		while (true) {
			while (Static271.anInt5505 < Static303.aClass20_Sub1Array3.length) {
				@Pc(22) Class20_Sub1 local22 = Static303.aClass20_Sub1Array3[Static271.anInt5505];
				if (local22 != null && local22.anInt506 == -1) {
					if (Static235.aClass2_Sub32_1 == null) {
						Static235.aClass2_Sub32_1 = Static313.aClass83_1.method2508(local22.aString10);
					}
					@Pc(46) int local46 = Static235.aClass2_Sub32_1.anInt4261;
					if (local46 == -1) {
						return;
					}
					Static271.anInt5505++;
					Static235.aClass2_Sub32_1 = null;
					local22.anInt506 = local46;
				} else {
					Static271.anInt5505++;
				}
			}
			return;
		}
	}

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "(B)V")
	public static void method2172() {
		for (@Pc(7) int local7 = -1; local7 < Static214.anInt4133; local7++) {
			@Pc(17) int local17;
			if (local7 == -1) {
				local17 = 2047;
			} else {
				local17 = Static103.anIntArray218[local7];
			}
			@Pc(27) Class62_Sub1_Sub2_Sub2 local27 = Static129.aClass62_Sub1_Sub2_Sub2Array1[local17];
			if (local27 != null) {
				Static46.method1095(local27, local27.method4777());
			}
		}
	}
}
