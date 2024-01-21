import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static85 {

	@OriginalMember(owner = "client!oa", name = "e", descriptor = "Lclient!ob;")
	public static Class1_Sub2_Sub14 aClass1_Sub2_Sub14_4;

	@OriginalMember(owner = "client!oa", name = "o", descriptor = "[Lclient!fc;")
	public static Class25[] aClass25Array15;

	@OriginalMember(owner = "client!oa", name = "p", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray6;

	@OriginalMember(owner = "client!oa", name = "i", descriptor = "Lclient!p;")
	public static Class63 aClass63_16 = new Class63(30);

	@OriginalMember(owner = "client!oa", name = "l", descriptor = "Lclient!fc;")
	public static Class25 aClass25_922 = Static78.method1313("Lade Eingabe)2Steuerungsprogramm)3)3)3");

	@OriginalMember(owner = "client!oa", name = "m", descriptor = "[I")
	public static int[] anIntArray336 = new int[2048];

	@OriginalMember(owner = "client!oa", name = "n", descriptor = "Lclient!fc;")
	public static Class25 aClass25_923 = Static78.method1313("Von:");

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(II)Z")
	public static boolean method1412(@OriginalArg(1) int arg0) {
		return (arg0 >> 21 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(I)V")
	public static void method1413() {
		while (true) {
			if (Static35.aClass1_Sub5_Sub1_1.method687(Static110.anInt2558) >= 11) {
				@Pc(21) int local21 = Static35.aClass1_Sub5_Sub1_1.method691(11);
				if (local21 != 2047) {
					@Pc(28) boolean local28 = false;
					if (Static88.aClass1_Sub2_Sub3_Sub4_Sub2Array1[local21] == null) {
						Static88.aClass1_Sub2_Sub3_Sub4_Sub2Array1[local21] = new Class1_Sub2_Sub3_Sub4_Sub2();
						local28 = true;
						if (Static21.aClass1_Sub5Array1[local21] != null) {
							Static88.aClass1_Sub2_Sub3_Sub4_Sub2Array1[local21].method1981(Static21.aClass1_Sub5Array1[local21]);
						}
					}
					Static28.anIntArray150[Static96.anInt2797++] = local21;
					@Pc(64) Class1_Sub2_Sub3_Sub4_Sub2 local64 = Static88.aClass1_Sub2_Sub3_Sub4_Sub2Array1[local21];
					local64.anInt2794 = Static60.anInt1366;
					@Pc(72) int local72 = Static35.aClass1_Sub5_Sub1_1.method691(1);
					@Pc(77) int local77 = Static35.aClass1_Sub5_Sub1_1.method691(5);
					@Pc(84) int local84 = Static5.anIntArray25[Static35.aClass1_Sub5_Sub1_1.method691(3)];
					if (local28) {
						local64.anInt2819 = local84;
					}
					if (local77 > 15) {
						local77 -= 32;
					}
					@Pc(100) int local100 = Static35.aClass1_Sub5_Sub1_1.method691(5);
					if (local100 > 15) {
						local100 -= 32;
					}
					@Pc(109) int local109 = Static35.aClass1_Sub5_Sub1_1.method691(1);
					if (local109 == 1) {
						anIntArray336[Static59.anInt1356++] = local21;
					}
					local64.method1973(Static82.aClass1_Sub2_Sub3_Sub4_Sub2_1.anIntArray484[0] + local100, local72 == 1, Static82.aClass1_Sub2_Sub3_Sub4_Sub2_1.anIntArray485[0] + local77);
					continue;
				}
			}
			Static35.aClass1_Sub5_Sub1_1.method690();
			return;
		}
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(B)V")
	public static void method1414() {
		aByteArrayArrayArray6 = null;
		aClass25_922 = null;
		aClass25_923 = null;
		aClass63_16 = null;
		anIntArray336 = null;
		aClass25Array15 = null;
		aClass1_Sub2_Sub14_4 = null;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(ILclient!oc;Lclient!fc;Lclient!fc;)Lclient!ma;")
	public static Class1_Sub2_Sub2_Sub3 method1415(@OriginalArg(1) Class56 arg0, @OriginalArg(2) Class25 arg1, @OriginalArg(3) Class25 arg2) {
		@Pc(4) int local4 = arg0.method1278(arg2);
		@Pc(14) int local14 = arg0.method1264(arg1, local4);
		return Static52.method1011(local4, local14, arg0);
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(ZII)I")
	public static int method1416(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(49) int local49 = Static9.method237(arg0 - 1, arg1 + -1) + Static9.method237(arg0 + 1, arg1 + -1) + Static9.method237(arg0 - 1, arg1 - -1) + Static9.method237(arg0 + 1, arg1 - -1);
		@Pc(79) int local79 = Static9.method237(arg0 - 1, arg1) + Static9.method237(arg0 + 1, arg1) + Static9.method237(arg0, arg1 - 1) + Static9.method237(arg0, arg1 + 1);
		@Pc(84) int local84 = Static9.method237(arg0, arg1);
		return local84 / 4 + local79 / 8 + local49 / 16;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIII)I")
	public static int method1417(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(3) int local3 = arg0 & 0x3;
		if (local3 == 0) {
			return arg1;
		} else if (local3 == 1) {
			return 7 - arg2;
		} else if (local3 == 2) {
			return 7 - arg1;
		} else {
			return arg2;
		}
	}
}
