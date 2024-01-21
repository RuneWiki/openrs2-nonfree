import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static98 {

	@OriginalMember(owner = "client!qb", name = "g", descriptor = "Lclient!r;")
	public static Class41_Sub1 aClass41_Sub1_16;

	@OriginalMember(owner = "client!qb", name = "n", descriptor = "[Lclient!fd;")
	public static Class1_Sub3_Sub1_Sub2[] aClass1_Sub3_Sub1_Sub2Array7;

	@OriginalMember(owner = "client!qb", name = "b", descriptor = "I")
	public static int anInt2404 = 0;

	@OriginalMember(owner = "client!qb", name = "e", descriptor = "Lclient!af;")
	public static Class5 aClass5_1152 = Static45.method1937("Keine Antwort vom Anmelde)2Server)3");

	@OriginalMember(owner = "client!qb", name = "f", descriptor = "I")
	public static int anInt2407 = 0;

	@OriginalMember(owner = "client!qb", name = "k", descriptor = "I")
	public static int anInt2411 = 0;

	@OriginalMember(owner = "client!qb", name = "l", descriptor = "Lclient!af;")
	public static Class5 aClass5_1153 = Static45.method1937("Die Verbindung konnte");

	@OriginalMember(owner = "client!qb", name = "m", descriptor = "Lclient!af;")
	public static Class5 aClass5_1154 = Static45.method1937("60 Sekunden noch einmal)3)3)3");

	@OriginalMember(owner = "client!qb", name = "o", descriptor = "Lclient!af;")
	public static Class5 aClass5_1155 = Static45.method1937("Fertigkeit)2");

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(Z)V")
	public static void method1645() {
		aClass5_1152 = null;
		aClass41_Sub1_16 = null;
		aClass1_Sub3_Sub1_Sub2Array7 = null;
		aClass5_1153 = null;
		aClass5_1155 = null;
		aClass5_1154 = null;
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(B)V")
	public static void method1646() {
		Static79.aClass1_Sub20_Sub1_2.method2113();
		@Pc(11) int local11 = Static79.aClass1_Sub20_Sub1_2.method2115(1);
		if (local11 == 0) {
			return;
		}
		@Pc(26) int local26 = Static79.aClass1_Sub20_Sub1_2.method2115(2);
		if (local26 == 0) {
			Static20.anIntArray83[Static86.anInt2184++] = 2047;
			return;
		}
		@Pc(50) int local50;
		@Pc(60) int local60;
		if (local26 == 1) {
			local50 = Static79.aClass1_Sub20_Sub1_2.method2115(3);
			Static20.aClass1_Sub3_Sub4_Sub2_Sub1_1.method2155(false, local50);
			local60 = Static79.aClass1_Sub20_Sub1_2.method2115(1);
			if (local60 == 1) {
				Static20.anIntArray83[Static86.anInt2184++] = 2047;
			}
			return;
		}
		@Pc(102) int local102;
		if (local26 == 2) {
			local50 = Static79.aClass1_Sub20_Sub1_2.method2115(3);
			Static20.aClass1_Sub3_Sub4_Sub2_Sub1_1.method2155(true, local50);
			local60 = Static79.aClass1_Sub20_Sub1_2.method2115(3);
			Static20.aClass1_Sub3_Sub4_Sub2_Sub1_1.method2155(true, local60);
			local102 = Static79.aClass1_Sub20_Sub1_2.method2115(1);
			if (local102 == 1) {
				Static20.anIntArray83[Static86.anInt2184++] = 2047;
			}
		} else if (local26 == 3) {
			Static7.anInt213 = Static79.aClass1_Sub20_Sub1_2.method2115(2);
			local50 = Static79.aClass1_Sub20_Sub1_2.method2115(1);
			if (local50 == 1) {
				Static20.anIntArray83[Static86.anInt2184++] = 2047;
			}
			local60 = Static79.aClass1_Sub20_Sub1_2.method2115(7);
			local102 = Static79.aClass1_Sub20_Sub1_2.method2115(7);
			@Pc(157) int local157 = Static79.aClass1_Sub20_Sub1_2.method2115(1);
			Static20.aClass1_Sub3_Sub4_Sub2_Sub1_1.method2151(local60, local102, local157 == 1);
		}
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(I)V")
	public static void method1647() {
		if (Static88.aString2.toLowerCase().indexOf("microsoft") != -1) {
			Static104.anIntArray390[192] = 58;
			Static104.anIntArray390[223] = 28;
			Static104.anIntArray390[189] = 26;
			Static104.anIntArray390[186] = 57;
			Static104.anIntArray390[222] = 59;
			Static104.anIntArray390[220] = 74;
			Static104.anIntArray390[221] = 43;
			Static104.anIntArray390[190] = 72;
			Static104.anIntArray390[187] = 27;
			Static104.anIntArray390[191] = 73;
			Static104.anIntArray390[219] = 42;
			Static104.anIntArray390[188] = 71;
			return;
		}
		Static104.anIntArray390[59] = 57;
		if (Static88.aMethod1 == null) {
			Static104.anIntArray390[222] = 59;
			Static104.anIntArray390[192] = 58;
		} else {
			Static104.anIntArray390[192] = 28;
			Static104.anIntArray390[520] = 59;
			Static104.anIntArray390[222] = 58;
		}
		Static104.anIntArray390[47] = 73;
		Static104.anIntArray390[44] = 71;
		Static104.anIntArray390[91] = 42;
		Static104.anIntArray390[93] = 43;
		Static104.anIntArray390[46] = 72;
		Static104.anIntArray390[45] = 26;
		Static104.anIntArray390[61] = 27;
		Static104.anIntArray390[92] = 74;
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(IIIII)V")
	public static void method1648(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(7) int local7 = 0; local7 < Static74.anInt1725; local7++) {
			if (Static76.anIntArray294[local7] + Static92.anIntArray352[local7] > arg0 && Static76.anIntArray294[local7] < arg0 + arg2 && Static84.anIntArray330[local7] + Static28.anIntArray100[local7] > arg1 && arg1 + arg3 > Static84.anIntArray330[local7]) {
				Static1.aBooleanArray1[local7] = true;
			}
		}
	}
}
