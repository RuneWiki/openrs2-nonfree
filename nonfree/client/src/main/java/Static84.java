import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static84 {

	@OriginalMember(owner = "client!h", name = "bc", descriptor = "[[[Lclient!jd;")
	public static Class1_Sub16[][][] aClass1_Sub16ArrayArrayArray1;

	@OriginalMember(owner = "client!h", name = "fc", descriptor = "Lclient!pa;")
	public static Class103 aClass103_4;

	@OriginalMember(owner = "client!h", name = "hc", descriptor = "Lclient!hc;")
	public static Class51 aClass51_29;

	@OriginalMember(owner = "client!h", name = "Tb", descriptor = "I")
	public static int anInt2408 = 0;

	@OriginalMember(owner = "client!h", name = "Wb", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray14 = new String[1000];

	@OriginalMember(owner = "client!h", name = "ac", descriptor = "Lclient!ic;")
	public static Class58 aClass58_8 = new Class58(64);

	@OriginalMember(owner = "client!h", name = "dc", descriptor = "S")
	public static short aShort15 = 1;

	@OriginalMember(owner = "client!h", name = "ec", descriptor = "[J")
	public static long[] aLongArray14 = new long[500];

	@OriginalMember(owner = "client!h", name = "gc", descriptor = "J")
	public static long aLong79 = 0L;

	@OriginalMember(owner = "client!h", name = "ic", descriptor = "Ljava/lang/String;")
	public static String aString147 = "flash2:";

	@OriginalMember(owner = "client!h", name = "u", descriptor = "(I)V")
	public static void method1816() {
		Static201.aClass79_29.method2489();
		Static100.aClass79_15.method2489();
		Static47.aClass79_5.method2489();
	}

	@OriginalMember(owner = "client!h", name = "v", descriptor = "(I)Lclient!tj;")
	public static Class1_Sub2_Sub18 method1818() {
		@Pc(13) Class1_Sub2_Sub18 local13 = (Class1_Sub2_Sub18) Static141.aClass99_6.method2970();
		if (local13 != null) {
			local13.method4186();
			local13.method4198();
			return local13;
		}
		do {
			local13 = (Class1_Sub2_Sub18) Static237.aClass99_10.method2970();
			if (local13 == null) {
				return null;
			}
			if (local13.method3811() > Static31.method591()) {
				return null;
			}
			local13.method4186();
			local13.method4198();
		} while ((Long.MIN_VALUE & local13.aLong185) == 0L);
		return local13;
	}

	@OriginalMember(owner = "client!h", name = "m", descriptor = "(II)V")
	public static void method1819(@OriginalArg(1) int arg0) {
		Static171.method2967();
		Static215.method3534();
		@Pc(16) int local16 = Static100.method2096(arg0).anInt4553;
		if (local16 == 0) {
			return;
		}
		@Pc(29) int local29 = Static91.anIntArray189[arg0];
		if (local16 == 5) {
			Static15.anInt527 = local29;
		}
		if (local16 == 6) {
			Static136.anInt3380 = local29;
		}
		if (local16 == 9) {
			Static182.anInt4172 = local29;
		}
	}

	@OriginalMember(owner = "client!h", name = "p", descriptor = "(B)[Lclient!ge;")
	public static Class7_Sub1[] method1827() {
		@Pc(8) Class7_Sub1[] local8 = new Class7_Sub1[Static75.anInt2041];
		for (@Pc(15) int local15 = 0; local15 < Static75.anInt2041; local15++) {
			local8[local15] = new Class7_Sub1(Static24.anInt806, Static240.anInt5164, Static202.anIntArray345[local15], Static79.anIntArray165[local15], Static218.anIntArray382[local15], Static233.anIntArray438[local15], Static11.aByteArrayArray1[local15], Static102.anIntArray201);
		}
		Static259.method4155();
		return local8;
	}
}
