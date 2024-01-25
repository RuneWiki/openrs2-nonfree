import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static9 {

	@OriginalMember(owner = "client!aea", name = "g", descriptor = "[Lclient!lm;")
	public static Class30_Sub1[] aClass30_Sub1Array1;

	@OriginalMember(owner = "client!aea", name = "t", descriptor = "I")
	public static int anInt137;

	@OriginalMember(owner = "client!aea", name = "a", descriptor = "I")
	public static int anInt120 = 13156520;

	@OriginalMember(owner = "client!aea", name = "A", descriptor = "[Lclient!nv;")
	public static final Class12_Sub4_Sub13[] aClass12_Sub4_Sub13Array1 = new Class12_Sub4_Sub13[14];

	@OriginalMember(owner = "client!aea", name = "a", descriptor = "(IIIIIIZII)Z")
	public static boolean method274(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) boolean arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(8) int local8 = Static440.aClass30_Sub1_Sub1_Sub1_2.anIntArray316[0];
		@Pc(13) int local13 = Static440.aClass30_Sub1_Sub1_Sub1_2.anIntArray317[0];
		if (local8 < 0 || local8 >= Static37.anInt7512 || local13 < 0 || local13 >= Static329.anInt6247) {
			return false;
		} else if (arg1 >= 0 && Static37.anInt7512 > arg1 && arg3 >= 0 && arg3 < Static329.anInt6247) {
			@Pc(88) int local88 = Static151.method3020(Static40.anIntArray120, Static510.aClass184Array1[Static440.aClass30_Sub1_Sub1_Sub1_2.aByte99], arg7, arg3, local8, arg4, local13, Static440.aClass30_Sub1_Sub1_Sub1_2.method3591(), arg2, arg6, Static250.anIntArray370, arg1, arg5, arg0);
			if (local88 < 1) {
				return false;
			}
			Static273.anInt5444 = Static40.anIntArray120[local88 - 1];
			Static141.anInt3151 = Static250.anIntArray370[local88 - 1];
			Static209.aBoolean364 = false;
			Static62.method1459();
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!aea", name = "a", descriptor = "(II)V")
	public static void method278(@OriginalArg(0) int arg0) {
		if (arg0 == Static96.anInt2243) {
			return;
		}
		if (Static96.anInt2243 == 0) {
			Static49.method907();
		}
		if (arg0 == 12) {
			if (Static258.aString53 == null) {
				Static71.method1597(Static122.anInt2825, Static172.aString92, Static262.aString56);
			} else {
				Static31.method678(Static122.anInt2825);
			}
		}
		if (arg0 != 12 && Static121.aClass277_1 != null) {
			Static121.aClass277_1.method7170();
			Static121.aClass277_1 = null;
		}
		if (arg0 == 2) {
			Static72.method1645(Static258.anInt5240 != Static406.anInt7660);
		}
		if (arg0 == 6) {
			Static414.method6450(Static121.anInt2763 != Static406.anInt7660);
		}
		if (arg0 == 4) {
			if (Static258.aString53 == null) {
				Static36.method6961(Static262.aString56, Static172.aString92);
			} else {
				Static12.method349();
			}
		} else if (arg0 == 5) {
			if (Static258.aString53 == null) {
				Static71.method1597(Static122.anInt2825, Static172.aString92, Static262.aString56);
			} else {
				Static31.method678(Static122.anInt2825);
			}
		} else if (arg0 == 8) {
			if (Static258.aString53 == null) {
				Static71.method1597(Static122.anInt2825, Static172.aString92, Static262.aString56);
			} else {
				Static31.method678(Static122.anInt2825);
			}
		} else if (arg0 == 11) {
			if (Static258.aString53 == null) {
				Static36.method6961(Static262.aString56, Static172.aString92);
			} else {
				Static12.method349();
			}
		}
		if (Static335.method5371(Static96.anInt2243)) {
			Static539.aClass16_120.anInt295 = 2;
			Static458.aClass16_106.anInt295 = 2;
			Static362.aClass16_88.anInt295 = 2;
			Static222.aClass16_59.anInt295 = 2;
			Static115.aClass16_29.anInt295 = 2;
			Static354.aClass16_87.anInt295 = 2;
			Static170.aClass16_47.anInt295 = 2;
		}
		if (Static335.method5371(arg0)) {
			Static478.anInt8725 = 0;
			Static377.anInt9639 = 0;
			Static420.anInt7814 = 1;
			Static419.anInt7798 = 0;
			Static266.anInt5319 = 1;
			Static490.method7294(true);
			Static539.aClass16_120.anInt295 = 1;
			Static458.aClass16_106.anInt295 = 1;
			Static362.aClass16_88.anInt295 = 1;
			Static222.aClass16_59.anInt295 = 1;
			Static115.aClass16_29.anInt295 = 1;
			Static354.aClass16_87.anInt295 = 1;
			Static170.aClass16_47.anInt295 = 1;
		}
		if (arg0 == 10 || arg0 == 2) {
			Static494.method7349();
		}
		if (arg0 == 1) {
			Static72.method1646(Static440.aClass16_103, Static243.aClass42_4);
		} else {
			Static218.method4016();
		}
		@Pc(234) boolean local234 = arg0 == 1 || Static149.method2947(arg0) || Static109.method2274(arg0);
		@Pc(257) boolean local257 = Static96.anInt2243 == 1 || Static149.method2947(Static96.anInt2243) || Static109.method2274(Static96.anInt2243);
		if (local234 != local257) {
			if (local234) {
				Static471.anInt8643 = Static140.anInt3127;
				if (Static208.aClass12_Sub10_Sub1_1.anInt2227 == 0) {
					Static408.method6389();
				} else {
					Static393.method6189(Static140.anInt3127, Static208.aClass12_Sub10_Sub1_1.anInt2227, Static250.aClass16_67);
				}
				Static234.aClass86_2.method2308(false);
			} else {
				Static408.method6389();
				Static234.aClass86_2.method2308(true);
			}
		}
		if (Static335.method5371(arg0) || arg0 == 12) {
			Static243.aClass42_4.method5816();
		}
		Static96.anInt2243 = arg0;
	}

	@OriginalMember(owner = "client!aea", name = "a", descriptor = "(Lclient!wk;B)V")
	public static void method280(@OriginalArg(0) Class317 arg0) {
		Static114.aClass317_1 = arg0;
	}
}
