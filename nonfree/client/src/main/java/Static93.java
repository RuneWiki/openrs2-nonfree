import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static93 {

	@OriginalMember(owner = "client!gm", name = "d", descriptor = "[S")
	public static short[] aShortArray17;

	@OriginalMember(owner = "client!gm", name = "r", descriptor = "[[Z")
	public static boolean[][] aBooleanArrayArray2 = new boolean[][] { { true, true, true }, { false, false }, { false, true }, { true, false }, { false, true, true }, { true, false, true }, { false, true, false }, { true, false, false } };

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(Ljava/lang/String;B)V")
	public static void method1374(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return;
		}
		@Pc(13) String local13 = Static136.method2200(arg0);
		if (local13 == null) {
			return;
		}
		for (@Pc(26) int local26 = 0; local26 < Static175.anInt3635; local26++) {
			@Pc(35) String local35 = Static136.method2200(Static279.aStringArray44[local26]);
			if (local35 != null && local35.equals(local13)) {
				Static175.anInt3635--;
				for (@Pc(52) int local52 = local26; local52 < Static175.anInt3635; local52++) {
					Static279.aStringArray44[local52] = Static279.aStringArray44[local52 + 1];
					Static263.aStringArray43[local52] = Static263.aStringArray43[local52 + 1];
					Static112.anIntArray187[local52] = Static112.anIntArray187[local52 + 1];
					Static313.aStringArray47[local52] = Static313.aStringArray47[local52 + 1];
					Static82.anIntArray124[local52] = Static82.anIntArray124[local52 + 1];
					Static67.aBooleanArray11[local52] = Static67.aBooleanArray11[local52 + 1];
				}
				Static214.anInt4214 = Static314.anInt5908;
				Static137.aClass1_Sub14_Sub1_6.method2661(101);
				Static137.aClass1_Sub14_Sub1_6.method2631(Static255.method3873(arg0));
				Static137.aClass1_Sub14_Sub1_6.method2619(arg0);
				break;
			}
		}
	}

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(ZI)V")
	public static void method1376(@OriginalArg(0) boolean arg0) {
		@Pc(11) int[] local11 = null;
		@Pc(17) byte local17;
		@Pc(19) byte[][] local19;
		if (Static291.aBoolean404 && arg0) {
			local17 = 1;
			local19 = Static254.aByteArrayArray14;
		} else {
			local19 = Static156.aByteArrayArray10;
			local17 = 4;
		}
		for (@Pc(27) int local27 = 0; local27 < local17; local27++) {
			Static82.method1238();
			for (@Pc(38) int local38 = 0; local38 < 13; local38++) {
				for (@Pc(43) int local43 = 0; local43 < 13; local43++) {
					@Pc(48) boolean local48 = false;
					@Pc(56) int local56 = Static268.anIntArrayArrayArray19[local27][local38][local43];
					if (local56 != -1) {
						@Pc(66) int local66 = local56 >> 24 & 0x3;
						if (!arg0 || local66 == 0) {
							@Pc(76) int local76 = local56 >> 1 & 0x3;
							@Pc(82) int local82 = local56 >> 14 & 0x3FF;
							@Pc(88) int local88 = local56 >> 3 & 0x7FF;
							@Pc(98) int local98 = local88 / 8 + (local82 / 8 << 8);
							for (@Pc(100) int local100 = 0; local100 < Static278.anIntArray487.length; local100++) {
								if (local98 == Static278.anIntArray487[local100] && local19[local100] != null) {
									local48 = true;
									@Pc(136) int[] local136 = Static254.method3870(local66, local19[local100], local82, local43 * 8, arg0, local76, local88, local38 * 8, local27, Static56.aClass122Array1);
									if (local11 == null && local136 != null) {
										local11 = local136;
									}
									break;
								}
							}
						}
					}
					if (!local48) {
						Static99.method1487(local27, local43 * 8, 8, local38 * 8, 8);
					}
				}
			}
		}
		if (local11 == null) {
			Static112.anInt2219 = -1;
			return;
		}
		Static233.anInt4699 = local11[3];
		Static167.anInt3494 = local11[4];
		Static115.anInt2287 = local11[1];
		Static112.anInt2219 = local11[0];
		Static175.anInt3624 = local11[2];
	}

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(B)V")
	public static void method1377() {
		try {
			@Pc(12) Method local12 = Runtime.class.getMethod("maxMemory");
			if (local12 != null) {
				try {
					@Pc(17) Runtime local17 = Runtime.getRuntime();
					@Pc(24) Long local24 = (Long) local12.invoke(local17, (Object[]) null);
					Static83.anInt1516 = (int) (local24 / 1048576L) + 1;
				} catch (@Pc(34) Throwable local34) {
				}
			}
		} catch (@Pc(42) Exception local42) {
		}
	}

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(II)Lclient!ea;")
	public static Class41 method1378(@OriginalArg(0) int arg0) {
		@Pc(10) Class41 local10 = (Class41) Static179.aClass169_100.method4017((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(28) byte[] local28 = Static191.aClass138_50.method3346(16, arg0);
		local10 = new Class41();
		if (local28 != null) {
			local10.method906(new Class1_Sub14(local28));
		}
		Static179.aClass169_100.method4016(local10, (long) arg0);
		return local10;
	}
}
