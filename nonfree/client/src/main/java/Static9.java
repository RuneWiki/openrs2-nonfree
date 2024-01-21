import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static9 {

	@OriginalMember(owner = "client!ai", name = "e", descriptor = "Lclient!ai;")
	public static Class6 aClass6_71 = Static38.method685("");

	@OriginalMember(owner = "client!ai", name = "v", descriptor = "Lclient!ai;")
	public static Class6 aClass6_75 = Static38.method685("");

	@OriginalMember(owner = "client!ai", name = "i", descriptor = "Lclient!ai;")
	public static Class6 aClass6_72 = aClass6_75;

	@OriginalMember(owner = "client!ai", name = "k", descriptor = "Z")
	public static volatile boolean aBoolean5 = false;

	@OriginalMember(owner = "client!ai", name = "o", descriptor = "Lclient!ai;")
	public static Class6 aClass6_73 = aClass6_75;

	@OriginalMember(owner = "client!ai", name = "q", descriptor = "Lclient!ai;")
	public static Class6 aClass6_74 = aClass6_71;

	@OriginalMember(owner = "client!ai", name = "y", descriptor = "Lclient!ai;")
	public static Class6 aClass6_76 = aClass6_75;

	@OriginalMember(owner = "client!ai", name = "J", descriptor = "Lclient!ai;")
	public static Class6 aClass6_77 = Static38.method685("mapback");

	@OriginalMember(owner = "client!ai", name = "M", descriptor = "Lclient!ai;")
	public static Class6 aClass6_78 = aClass6_75;

	@OriginalMember(owner = "client!ai", name = "W", descriptor = "Lclient!ai;")
	public static Class6 aClass6_79 = aClass6_75;

	@OriginalMember(owner = "client!ai", name = "eb", descriptor = "Lclient!ai;")
	public static Class6 aClass6_80 = aClass6_75;

	@OriginalMember(owner = "client!ai", name = "c", descriptor = "(I)V")
	public static void method113() {
		if (!Static160.aBoolean24) {
			Static65.anIntArray104[0] = 1005;
			Static46.anInt1322 = 1;
			Static103.aClass6Array13[0] = Static66.aClass6_486;
			Static134.aClass6Array17[0] = aClass6_71;
		}
		if (Static21.anInt520 != -1) {
			Static82.method1316(Static21.anInt520);
		}
		for (@Pc(29) int local29 = 0; local29 < Static10.anInt232; local29++) {
			if (Static86.aBooleanArray5[local29]) {
				Static137.aBooleanArray14[local29] = true;
			}
			Static36.aBooleanArray3[local29] = Static86.aBooleanArray5[local29];
			Static86.aBooleanArray5[local29] = false;
		}
		Static182.aClass87_15 = null;
		Static106.anInt4180 = Static107.anInt2559;
		Static65.anInt1615 = -1;
		Static136.anInt3178 = -1;
		if (Static21.anInt520 != -1) {
			Static10.anInt232 = 0;
			Static139.method2154(Static21.anInt520, 0, 503, 0, 0, -1, 0, 765);
		}
		Static53.method2495();
		Static68.method1100();
		if (Static160.aBoolean24) {
			Static116.method1868();
		} else if (Static136.anInt3178 != -1) {
			Static8.method99(Static65.anInt1615, Static136.anInt3178);
		}
		if (Static81.anInt1980 == 3) {
			for (@Pc(111) int local111 = 0; local111 < Static10.anInt232; local111++) {
				if (Static36.aBooleanArray3[local111]) {
					Static53.method2490(Static58.anIntArray97[local111], Static27.anIntArray30[local111], Static60.anIntArray92[local111], Static4.anIntArray1[local111], 16711935, 128);
				} else if (Static137.aBooleanArray14[local111]) {
					Static53.method2490(Static58.anIntArray97[local111], Static27.anIntArray30[local111], Static60.anIntArray92[local111], Static4.anIntArray1[local111], 16711680, 128);
				}
			}
		}
		Static165.method2627(Static131.aClass2_Sub3_Sub5_Sub1_Sub1_1.anInt2672, Static131.aClass2_Sub3_Sub5_Sub1_Sub1_1.anInt2674, Static36.anInt1020, Static131.anInt3038);
		Static131.anInt3038 = 0;
	}

	@OriginalMember(owner = "client!ai", name = "i", descriptor = "(B)V")
	public static void method138() {
		aClass6_74 = null;
		aClass6_80 = null;
		aClass6_78 = null;
		aClass6_77 = null;
		aClass6_71 = null;
		aClass6_72 = null;
		aClass6_76 = null;
		aClass6_75 = null;
		aClass6_79 = null;
		aClass6_73 = null;
	}
}
