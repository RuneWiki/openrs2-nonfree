import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static9 {

	@OriginalMember(owner = "client!bc", name = "e", descriptor = "I")
	public static int anInt220;

	@OriginalMember(owner = "client!bc", name = "t", descriptor = "[Lclient!td;")
	public static Class3_Sub1_Sub16[] aClass3_Sub1_Sub16Array1;

	@OriginalMember(owner = "client!bc", name = "c", descriptor = "[I")
	public static int[] anIntArray9 = new int[500];

	@OriginalMember(owner = "client!bc", name = "d", descriptor = "[[I")
	public static int[][] anIntArrayArray2 = new int[104][104];

	@OriginalMember(owner = "client!bc", name = "f", descriptor = "Lclient!oa;")
	public static Class56 aClass56_117 = Static33.method650("Versteckt");

	@OriginalMember(owner = "client!bc", name = "o", descriptor = "Lclient!oa;")
	private static Class56 aClass56_122 = Static33.method650("New User");

	@OriginalMember(owner = "client!bc", name = "h", descriptor = "Lclient!oa;")
	public static Class56 aClass56_118 = aClass56_122;

	@OriginalMember(owner = "client!bc", name = "i", descriptor = "Lclient!oa;")
	public static Class56 aClass56_119 = Static33.method650("Hier wechseln");

	@OriginalMember(owner = "client!bc", name = "j", descriptor = "Lclient!oa;")
	public static Class56 aClass56_120 = Static33.method650("Diese Welt ist voll)3");

	@OriginalMember(owner = "client!bc", name = "k", descriptor = "Lclient!oa;")
	public static Class56 aClass56_121 = Static33.method650("::");

	@OriginalMember(owner = "client!bc", name = "q", descriptor = "Lclient!oa;")
	public static Class56 aClass56_123 = Static33.method650("Um ein neues Spielkonto zu erstellen)1 m-Ussen Sie");

	@OriginalMember(owner = "client!bc", name = "r", descriptor = "[Lclient!bd;")
	public static Class3_Sub1_Sub2_Sub1[] aClass3_Sub1_Sub2_Sub1Array1 = new Class3_Sub1_Sub2_Sub1[4];

	@OriginalMember(owner = "client!bc", name = "s", descriptor = "I")
	public static int anInt224 = 0;

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(I)V")
	public static void method176() {
		Static105.aClass30_16.method813();
		Static115.aClass3_Sub1_Sub1_Sub4_70.method1504(0, 0);
		Static55.method1046();
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(II)Lclient!uc;")
	public static Class3_Sub1_Sub17 method177(@OriginalArg(0) int arg0) {
		@Pc(10) Class3_Sub1_Sub17 local10 = (Class3_Sub1_Sub17) Static28.aClass52_17.method1342((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static23.aClass44_13.method1146(9, arg0);
		local10 = new Class3_Sub1_Sub17();
		local10.anInt2929 = arg0;
		if (local20 != null) {
			local10.method1899(new Class3_Sub2(local20));
		}
		local10.method1903();
		Static28.aClass52_17.method1344(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!bc", name = "b", descriptor = "(I)V")
	public static void method178() {
		aClass56_119 = null;
		aClass56_120 = null;
		aClass56_122 = null;
		aClass56_117 = null;
		anIntArrayArray2 = null;
		aClass56_121 = null;
		anIntArray9 = null;
		aClass3_Sub1_Sub2_Sub1Array1 = null;
		aClass3_Sub1_Sub16Array1 = null;
		aClass56_123 = null;
		aClass56_118 = null;
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(Lclient!hf;IBII)V")
	public static void method179(@OriginalArg(0) Class3_Sub1_Sub2_Sub4_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static59.aClass3_Sub1_Sub2_Sub4_Sub1_1 == arg0 || Static66.anInt559 >= 400) {
			return;
		}
		@Pc(59) Class56 local59;
		if (arg0.anInt1371 == 0) {
			local59 = Static84.method1524(new Class56[] { arg0.aClass56_764, Static12.method240(arg0.anInt1368, Static59.aClass3_Sub1_Sub2_Sub4_Sub1_1.anInt1368), Static61.aClass56_958, Static15.aClass56_212, Static111.method1851(arg0.anInt1368), Static79.aClass56_1135 });
		} else {
			local59 = Static84.method1524(new Class56[] { arg0.aClass56_764, Static61.aClass56_958, Static53.aClass56_853, Static111.method1851(arg0.anInt1371), Static79.aClass56_1135 });
		}
		@Pc(166) int local166;
		if (Static98.anInt2560 == 1) {
			Static97.method1702(arg3, Static57.aClass56_890, 13, arg2, Static84.method1524(new Class56[] { Static84.aClass56_1217, Static62.aClass56_961, local59 }), arg1);
		} else if (!Static93.aBoolean114) {
			for (local166 = 4; local166 >= 0; local166--) {
				if (Static108.aClass56Array11[local166] != null) {
					@Pc(178) short local178 = 0;
					if (Static108.aClass56Array11[local166].method1418(Static102.aClass56_1749)) {
						if (arg0.anInt1368 > Static59.aClass3_Sub1_Sub2_Sub4_Sub1_1.anInt1368) {
							local178 = 2000;
						}
						if (Static59.aClass3_Sub1_Sub2_Sub4_Sub1_1.anInt1385 != 0 && arg0.anInt1385 != 0) {
							if (Static59.aClass3_Sub1_Sub2_Sub4_Sub1_1.anInt1385 == arg0.anInt1385) {
								local178 = 2000;
							} else {
								local178 = 0;
							}
						}
					} else if (Static118.aBooleanArray14[local166]) {
						local178 = 2000;
					}
					@Pc(225) int local225 = 0;
					if (local166 == 0) {
						local225 = local178 + 50;
					}
					if (local166 == 1) {
						local225 = local178 + 2;
					}
					if (local166 == 2) {
						local225 = local178 + 37;
					}
					if (local166 == 3) {
						local225 = local178 + 43;
					}
					if (local166 == 4) {
						local225 = local178 + 21;
					}
					Static97.method1702(arg3, Static108.aClass56Array11[local166], local225, arg2, Static84.method1524(new Class56[] { Static123.aClass56_1664, local59 }), arg1);
				}
			}
		} else if ((Static63.anInt1819 & 0x8) == 8) {
			Static97.method1702(arg3, Static76.aClass56_1114, 15, arg2, Static84.method1524(new Class56[] { Static126.aClass56_1702, Static62.aClass56_961, local59 }), arg1);
		}
		for (local166 = 0; local166 < Static66.anInt559; local166++) {
			if (anIntArray9[local166] == 56) {
				Static28.aClass56Array2[local166] = Static84.method1524(new Class56[] { Static77.aClass56_1727, Static53.aClass56_856, Static123.aClass56_1664, local59 });
				break;
			}
		}
	}
}
