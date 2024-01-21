import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static94 {

	@OriginalMember(owner = "client!lc", name = "t", descriptor = "I")
	public static int anInt1979;

	@OriginalMember(owner = "client!lc", name = "y", descriptor = "Lclient!vg;")
	public static Class85 aClass85_7;

	@OriginalMember(owner = "client!lc", name = "B", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray5;

	@OriginalMember(owner = "client!lc", name = "o", descriptor = "Lclient!lf;")
	public static Class49 aClass49_960 = Static32.method683(" zuerst von Ihrer Freunde)2Liste(Q");

	@OriginalMember(owner = "client!lc", name = "r", descriptor = "I")
	public static int anInt1977 = 0;

	@OriginalMember(owner = "client!lc", name = "z", descriptor = "Lclient!lf;")
	private static Class49 aClass49_962 = Static32.method683("Loaded interfaces");

	@OriginalMember(owner = "client!lc", name = "x", descriptor = "Lclient!lf;")
	public static Class49 aClass49_961 = aClass49_962;

	@OriginalMember(owner = "client!lc", name = "A", descriptor = "[I")
	public static int[] anIntArray201 = new int[100];

	@OriginalMember(owner = "client!lc", name = "D", descriptor = "J")
	public static volatile long aLong91 = 0L;

	@OriginalMember(owner = "client!lc", name = "E", descriptor = "Lclient!lf;")
	public static Class49 aClass49_963 = Static32.method683("null");

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(I)V")
	public static void method1608() {
		while (true) {
			if (Static86.aClass2_Sub13_Sub1_13.method2977(Static180.anInt3988) >= 11) {
				@Pc(22) int local22 = Static86.aClass2_Sub13_Sub1_13.method2978(11);
				if (local22 != 2047) {
					@Pc(27) boolean local27 = false;
					if (Static178.aClass2_Sub2_Sub3_Sub7_Sub2Array1[local22] == null) {
						Static178.aClass2_Sub2_Sub3_Sub7_Sub2Array1[local22] = new Class2_Sub2_Sub3_Sub7_Sub2();
						if (Static134.aClass2_Sub13Array1[local22] != null) {
							Static178.aClass2_Sub2_Sub3_Sub7_Sub2Array1[local22].method2741(Static134.aClass2_Sub13Array1[local22]);
						}
						local27 = true;
					}
					Static110.anIntArray221[Static139.anInt2969++] = local22;
					@Pc(63) Class2_Sub2_Sub3_Sub7_Sub2 local63 = Static178.aClass2_Sub2_Sub3_Sub7_Sub2Array1[local22];
					local63.anInt3582 = Static127.anInt2757;
					@Pc(71) int local71 = Static86.aClass2_Sub13_Sub1_13.method2978(5);
					@Pc(76) int local76 = Static86.aClass2_Sub13_Sub1_13.method2978(5);
					if (local76 > 15) {
						local76 -= 32;
					}
					if (local71 > 15) {
						local71 -= 32;
					}
					@Pc(91) int local91 = Static86.aClass2_Sub13_Sub1_13.method2978(1);
					if (local91 == 1) {
						Static90.anIntArray192[Static88.anInt1850++] = local22;
					}
					@Pc(109) int local109 = Static86.aClass2_Sub13_Sub1_13.method2978(1);
					@Pc(116) int local116 = Static162.anIntArray322[Static86.aClass2_Sub13_Sub1_13.method2978(3)];
					if (local27) {
						local63.anInt3571 = local63.anInt3536 = local116;
					}
					local63.method2735(Static139.aClass2_Sub2_Sub3_Sub7_Sub2_1.anIntArray318[0] + local71, local109 == 1, local76 + Static139.aClass2_Sub2_Sub3_Sub7_Sub2_1.anIntArray316[0]);
					continue;
				}
			}
			Static86.aClass2_Sub13_Sub1_13.method2974();
			return;
		}
	}

	@OriginalMember(owner = "client!lc", name = "b", descriptor = "(Z)V")
	public static void method1609() {
		Static176.aClass2_Sub13_Sub1_14.method2976(188);
		Static176.aClass2_Sub13_Sub1_14.method2956(0L);
	}

	@OriginalMember(owner = "client!lc", name = "b", descriptor = "(I)V")
	public static void method1610() {
		Static41.aClass74_31.method2347();
	}

	@OriginalMember(owner = "client!lc", name = "c", descriptor = "(I)V")
	public static void method1611() {
		aByteArrayArrayArray5 = null;
		aClass49_960 = null;
		aClass49_962 = null;
		aClass49_963 = null;
		anIntArray201 = null;
		aClass85_7 = null;
		aClass49_961 = null;
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(IB)Z")
	public static boolean method1612(@OriginalArg(0) int arg0) {
		if (arg0 < 32) {
			return false;
		} else if (arg0 == 127) {
			return false;
		} else {
			return arg0 < 129 || arg0 > 159;
		}
	}
}
