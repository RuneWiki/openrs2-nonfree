import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static87 {

	@OriginalMember(owner = "client!qe", name = "f", descriptor = "I")
	public static int anInt2318;

	@OriginalMember(owner = "client!qe", name = "p", descriptor = "Z")
	public static boolean aBoolean104;

	@OriginalMember(owner = "client!qe", name = "t", descriptor = "I")
	public static int anInt2325;

	@OriginalMember(owner = "client!qe", name = "v", descriptor = "[Lclient!kb;")
	public static Class2_Sub1_Sub4_Sub2[] aClass2_Sub1_Sub4_Sub2Array9;

	@OriginalMember(owner = "client!qe", name = "d", descriptor = "Lclient!ke;")
	public static Class39 aClass39_1058 = Static2.method66("Nehmen");

	@OriginalMember(owner = "client!qe", name = "i", descriptor = "Z")
	public static boolean aBoolean103 = false;

	@OriginalMember(owner = "client!qe", name = "k", descriptor = "Lclient!ke;")
	private static Class39 aClass39_1059 = Static2.method66(" is already on your friend list");

	@OriginalMember(owner = "client!qe", name = "o", descriptor = "Lclient!ke;")
	public static Class39 aClass39_1060 = Static2.method66("Ihre Freunde)2Liste ist voll(Q Mitglieder k-Onnen 200 Freunde hinzuf-Ugen)1 freie Spieler nur 100)3");

	@OriginalMember(owner = "client!qe", name = "q", descriptor = "Lclient!ke;")
	public static Class39 aClass39_1061 = aClass39_1059;

	@OriginalMember(owner = "client!qe", name = "r", descriptor = "Lclient!ke;")
	public static Class39 aClass39_1062 = null;

	@OriginalMember(owner = "client!qe", name = "s", descriptor = "I")
	public static int anInt2324 = 0;

	@OriginalMember(owner = "client!qe", name = "u", descriptor = "Lclient!ke;")
	private static Class39 aClass39_1063 = Static2.method66("Continue");

	@OriginalMember(owner = "client!qe", name = "w", descriptor = "I")
	public static int anInt2326 = 0;

	@OriginalMember(owner = "client!qe", name = "x", descriptor = "I")
	public static int anInt2327 = 0;

	@OriginalMember(owner = "client!qe", name = "y", descriptor = "Lclient!ke;")
	public static Class39 aClass39_1064 = aClass39_1063;

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(I)V")
	public static void method1641() {
		aClass39_1058 = null;
		aClass39_1064 = null;
		Class55.anIntArray300 = null;
		aClass39_1062 = null;
		aClass39_1060 = null;
		aClass39_1063 = null;
		aClass39_1059 = null;
		aClass39_1061 = null;
		aClass2_Sub1_Sub4_Sub2Array9 = null;
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(Lclient!ke;ILclient!ke;I)V")
	public static void method1642(@OriginalArg(0) Class39 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class39 arg2) {
		if (Static99.anInt2696 == -1) {
			Static31.aBoolean91 = true;
		}
		if (arg1 == 0 && Static41.anInt1197 != -1) {
			Static39.anInt1172 = 0;
			Static62.aClass39_785 = arg0;
		}
		for (@Pc(28) int local28 = 99; local28 > 0; local28--) {
			Static40.anIntArray169[local28] = Static40.anIntArray169[local28 - 1];
			Static42.aClass39Array8[local28] = Static42.aClass39Array8[local28 - 1];
			Static67.aClass39Array12[local28] = Static67.aClass39Array12[local28 - 1];
		}
		Static40.anIntArray169[0] = arg1;
		Static42.aClass39Array8[0] = arg2;
		Static67.aClass39Array12[0] = arg0;
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(IIBIIII)I")
	public static int method1643(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(3) int local3 = arg1 & 0x3;
		if ((arg0 & 0x1) == 1) {
			@Pc(16) int local16 = arg5;
			arg5 = arg3;
			arg3 = local16;
		}
		if (local3 == 0) {
			return arg4;
		} else if (local3 == 1) {
			return 1 + 7 - arg5 - arg2;
		} else if (local3 == 2) {
			return 7 + 1 - arg4 - arg3;
		} else {
			return arg2;
		}
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(B)V")
	public static void method1644() {
		if (Static78.aClass11_1 == null) {
			return;
		}
		Static101.method1958();
		if (Static10.anInt248 > 0) {
			Static78.aClass11_1.method1867(256);
			Static10.anInt248 = 0;
		}
		Static78.aClass11_1.method1866();
		Static78.aClass11_1 = null;
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(Lclient!uc;I)V")
	public static void method1645(@OriginalArg(0) Class2_Sub1_Sub4_Sub3 arg0) {
		for (@Pc(5) int local5 = 0; local5 < Static63.anIntArray238.length; local5++) {
			Static63.anIntArray238[local5] = 0;
		}
		@Pc(32) int local32;
		for (@Pc(23) int local23 = 0; local23 < 5000; local23++) {
			local32 = (int) (Math.random() * 128.0D * (double) 256);
			Static63.anIntArray238[local32] = (int) (Math.random() * 256.0D);
		}
		@Pc(50) int local50;
		@Pc(53) int local53;
		@Pc(61) int local61;
		for (local32 = 0; local32 < 20; local32++) {
			for (local50 = 1; local50 < 255; local50++) {
				for (local53 = 1; local53 < 127; local53++) {
					local61 = local53 + (local50 << 7);
					Static30.anIntArray92[local61] = (Static63.anIntArray238[local61 + 128] + Static63.anIntArray238[local61 - 1] + Static63.anIntArray238[local61 + 1] + Static63.anIntArray238[local61 + -128]) / 4;
				}
			}
			@Pc(106) int[] local106 = Static63.anIntArray238;
			Static63.anIntArray238 = Static30.anIntArray92;
			Static30.anIntArray92 = local106;
		}
		if (arg0 == null) {
			return;
		}
		local50 = 0;
		for (local53 = 0; local53 < arg0.anInt2729; local53++) {
			for (local61 = 0; local61 < arg0.anInt2733; local61++) {
				if (arg0.aByteArray24[local50++] != 0) {
					@Pc(142) int local142 = arg0.anInt2732 + local53 + 16;
					@Pc(149) int local149 = arg0.anInt2728 + local61 + 16;
					@Pc(155) int local155 = (local142 << 7) + local149;
					Static63.anIntArray238[local155] = 0;
				}
			}
		}
	}
}
