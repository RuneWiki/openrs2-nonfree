import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static95 {

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "I")
	public static int anInt2250;

	@OriginalMember(owner = "client!lg", name = "b", descriptor = "[I")
	public static int[] anIntArray237;

	@OriginalMember(owner = "client!lg", name = "q", descriptor = "[Lclient!ea;")
	public static Class2_Sub1_Sub4_Sub2[] aClass2_Sub1_Sub4_Sub2Array7;

	@OriginalMember(owner = "client!lg", name = "o", descriptor = "Lclient!cd;")
	public static Class10 aClass10_949 = Static51.method932("");

	@OriginalMember(owner = "client!lg", name = "c", descriptor = "Lclient!cd;")
	public static Class10 aClass10_940 = aClass10_949;

	@OriginalMember(owner = "client!lg", name = "d", descriptor = "Lclient!cd;")
	private static Class10 aClass10_941 = Static51.method932("Please use a different world)3");

	@OriginalMember(owner = "client!lg", name = "e", descriptor = "Lclient!cd;")
	public static Class10 aClass10_942 = Static51.method932("Einloggen");

	@OriginalMember(owner = "client!lg", name = "f", descriptor = "Lclient!cd;")
	public static Class10 aClass10_943 = aClass10_949;

	@OriginalMember(owner = "client!lg", name = "g", descriptor = "Lclient!cd;")
	public static Class10 aClass10_944 = aClass10_941;

	@OriginalMember(owner = "client!lg", name = "i", descriptor = "Lclient!cd;")
	public static Class10 aClass10_945 = aClass10_949;

	@OriginalMember(owner = "client!lg", name = "j", descriptor = "Lclient!cd;")
	public static Class10 aClass10_946 = Static51.method932("auf der Hautpseite)3");

	@OriginalMember(owner = "client!lg", name = "k", descriptor = "Lclient!cd;")
	public static Class10 aClass10_947 = aClass10_949;

	@OriginalMember(owner = "client!lg", name = "l", descriptor = "I")
	public static int anInt2252 = 0;

	@OriginalMember(owner = "client!lg", name = "m", descriptor = "Lclient!cd;")
	public static Class10 aClass10_948 = aClass10_949;

	@OriginalMember(owner = "client!lg", name = "p", descriptor = "Lclient!cd;")
	public static Class10 aClass10_950 = aClass10_941;

	@OriginalMember(owner = "client!lg", name = "r", descriptor = "I")
	public static int anInt2254 = 0;

	@OriginalMember(owner = "client!lg", name = "s", descriptor = "Lclient!cd;")
	public static Class10 aClass10_951 = aClass10_949;

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(Lclient!cd;IZ)V")
	public static void method1587(@OriginalArg(0) Class10 arg0, @OriginalArg(2) boolean arg1) {
		@Pc(9) Class10 local9 = arg0.method360();
		@Pc(12) short[] local12 = new short[16];
		@Pc(14) int local14 = 0;
		@Pc(62) int local62;
		for (@Pc(16) int local16 = 0; local16 < Static58.anInt1469; local16++) {
			@Pc(22) Class2_Sub1_Sub6 local22 = Static78.method577(local16);
			if ((!arg1 || local22.aBoolean65) && local22.aClass10_662.method360().method365(local9) != -1) {
				if (local14 >= 100) {
					Static135.anInt2995 = -1;
					Static118.aShortArray22 = null;
					return;
				}
				if (local14 >= local12.length) {
					@Pc(60) short[] local60 = new short[local12.length * 2];
					for (local62 = 0; local62 < local14; local62++) {
						local60[local62] = local12[local62];
					}
					local12 = local60;
				}
				local12[local14++] = (short) local16;
			}
		}
		Static118.aShortArray22 = local12;
		Static135.anInt2995 = local14;
		Static18.anInt486 = 0;
		@Pc(98) int local98 = local14;
		@Pc(103) boolean local103;
		do {
			if (local98 <= 0) {
				return;
			}
			local98--;
			local103 = true;
			for (local62 = 0; local62 < local98; local62++) {
				@Pc(113) Class2_Sub1_Sub6 local113 = Static78.method577(local12[local62]);
				@Pc(121) Class2_Sub1_Sub6 local121 = Static78.method577(local12[local62 + 1]);
				if (local113.aClass10_662.method338(local121.aClass10_662) > 0) {
					local103 = false;
					@Pc(134) short local134 = local12[local62];
					local12[local62] = local12[local62 + 1];
					local12[local62 + 1] = local134;
				}
			}
		} while (!local103);
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(IZ)Z")
	public static boolean method1588(@OriginalArg(0) int arg0) {
		if (arg0 < 32) {
			return false;
		} else if (arg0 == 127) {
			return false;
		} else {
			return arg0 < 129 || arg0 > 159;
		}
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(Z)V")
	public static void method1589() {
		aClass10_949 = null;
		aClass10_947 = null;
		aClass10_951 = null;
		aClass10_945 = null;
		aClass10_946 = null;
		aClass10_948 = null;
		aClass10_943 = null;
		anIntArray237 = null;
		aClass10_942 = null;
		aClass10_941 = null;
		aClass10_950 = null;
		aClass10_940 = null;
		aClass2_Sub1_Sub4_Sub2Array7 = null;
		aClass10_944 = null;
	}
}
