import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static96 {

	@OriginalMember(owner = "client!qd", name = "U", descriptor = "Lclient!r;")
	public static Class3_Sub1_Sub2_Sub4 aClass3_Sub1_Sub2_Sub4_11;

	@OriginalMember(owner = "client!qd", name = "F", descriptor = "Z")
	public static boolean aBoolean101 = true;

	@OriginalMember(owner = "client!qd", name = "G", descriptor = "Lclient!qf;")
	public static Class60 aClass60_1178 = Static59.method1195("m-Ochte mit Ihnen handeln)3");

	@OriginalMember(owner = "client!qd", name = "H", descriptor = "Lclient!qf;")
	public static Class60 aClass60_1179 = Static59.method1195("backvmid3");

	@OriginalMember(owner = "client!qd", name = "J", descriptor = "Lclient!qf;")
	public static Class60 aClass60_1180 = Static59.method1195("nav");

	@OriginalMember(owner = "client!qd", name = "K", descriptor = "I")
	public static volatile int anInt2744 = 0;

	@OriginalMember(owner = "client!qd", name = "L", descriptor = "I")
	public static int anInt2745 = -1;

	@OriginalMember(owner = "client!qd", name = "M", descriptor = "[Lclient!re;")
	public static Class63[] aClass63Array1 = new Class63[50];

	@OriginalMember(owner = "client!qd", name = "N", descriptor = "I")
	public static int anInt2746 = 0;

	@OriginalMember(owner = "client!qd", name = "P", descriptor = "Lclient!qf;")
	public static Class60 aClass60_1181 = null;

	@OriginalMember(owner = "client!qd", name = "R", descriptor = "Lclient!qf;")
	private static Class60 aClass60_1182 = Static59.method1195("go back to the main RuneScape webpage");

	@OriginalMember(owner = "client!qd", name = "T", descriptor = "Lclient!qf;")
	public static Class60 aClass60_1183 = Static59.method1195("leuchten3:");

	@OriginalMember(owner = "client!qd", name = "V", descriptor = "Lclient!qf;")
	public static Class60 aClass60_1184 = Static59.method1195("<col=00ff00>");

	@OriginalMember(owner = "client!qd", name = "W", descriptor = "I")
	public static int anInt2749 = 0;

	@OriginalMember(owner = "client!qd", name = "Y", descriptor = "Lclient!qf;")
	public static Class60 aClass60_1185 = aClass60_1182;

	@OriginalMember(owner = "client!qd", name = "Z", descriptor = "Lclient!qf;")
	private static Class60 aClass60_1186 = Static59.method1195("Please use a different world)3");

	@OriginalMember(owner = "client!qd", name = "bb", descriptor = "Lclient!qf;")
	private static Class60 aClass60_1188 = Static59.method1195("Close");

	@OriginalMember(owner = "client!qd", name = "ab", descriptor = "Lclient!qf;")
	public static Class60 aClass60_1187 = aClass60_1188;

	@OriginalMember(owner = "client!qd", name = "cb", descriptor = "Lclient!qf;")
	public static Class60 aClass60_1189 = aClass60_1186;

	@OriginalMember(owner = "client!qd", name = "db", descriptor = "Lclient!qf;")
	public static Class60 aClass60_1190 = Static59.method1195("mn");

	@OriginalMember(owner = "client!qd", name = "eb", descriptor = "Lclient!qf;")
	public static Class60 aClass60_1191 = aClass60_1186;

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(ILclient!jb;II)[Lclient!r;")
	public static Class3_Sub1_Sub2_Sub4[] method1803(@OriginalArg(0) int arg0, @OriginalArg(1) Class25 arg1, @OriginalArg(2) int arg2) {
		return Static55.method1140(arg0, arg2, arg1) ? Static4.method93() : null;
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(III[B)I")
	public static int method1804(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte[] arg2) {
		@Pc(7) int local7 = -1;
		for (@Pc(9) int local9 = arg0; local9 < arg1; local9++) {
			local7 = Class82.anIntArray393[(arg2[local9] ^ local7) & 0xFF] ^ local7 >>> 8;
		}
		return ~local7;
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(IB)V")
	public static void method1805(@OriginalArg(0) int arg0) {
		Static16.anInt739 += arg0 * 128;
		@Pc(31) int local31;
		if (Static16.anInt739 > Static58.anIntArray201.length) {
			Static16.anInt739 -= Static58.anIntArray201.length;
			local31 = (int) (Math.random() * 12.0D);
			Static10.method311(Static80.aClass3_Sub1_Sub2_Sub4Array7[local31]);
		}
		local31 = 0;
		@Pc(47) int local47 = arg0 * 128;
		@Pc(54) int local54 = (256 - arg0) * 128;
		@Pc(79) int local79;
		for (@Pc(56) int local56 = 0; local56 < local54; local56++) {
			local79 = Static114.anIntArray338[local47 + local31] - Static58.anIntArray201[local31 + Static16.anInt739 & Static58.anIntArray201.length + -1] * arg0 / 6;
			if (local79 < 0) {
				local79 = 0;
			}
			Static114.anIntArray338[local31++] = local79;
		}
		@Pc(103) int local103;
		@Pc(105) int local105;
		@Pc(112) int local112;
		for (local79 = 256 - arg0; local79 < 256; local79++) {
			local103 = local79 * 128;
			for (local105 = 0; local105 < 128; local105++) {
				local112 = (int) (Math.random() * 100.0D);
				if (local112 < 50 && local105 > 10 && local105 < 118) {
					Static114.anIntArray338[local105 + local103] = 255;
				} else {
					Static114.anIntArray338[local105 + local103] = 0;
				}
			}
		}
		if (Static68.anInt2131 > 0) {
			Static68.anInt2131 -= arg0 * 4;
		}
		if (Static6.anInt183 > 0) {
			Static6.anInt183 -= arg0 * 4;
		}
		if (Static68.anInt2131 == 0 && Static6.anInt183 == 0) {
			local103 = (int) ((double) (2000 / arg0) * Math.random());
			if (local103 == 0) {
				Static68.anInt2131 = 1024;
			}
			if (local103 == 1) {
				Static6.anInt183 = 1024;
			}
		}
		for (local103 = 0; local103 < 256 - arg0; local103++) {
			Static91.anIntArray283[local103] = Static91.anIntArray283[local103 + arg0];
		}
		for (local105 = 256 - arg0; local105 < 256; local105++) {
			Static91.anIntArray283[local105] = (int) (Math.sin((double) Static24.anInt930 / 14.0D) * 16.0D + Math.sin((double) Static24.anInt930 / 15.0D) * 14.0D + Math.sin((double) Static24.anInt930 / 16.0D) * 12.0D);
			Static24.anInt930++;
		}
		Static87.anInt1559 += arg0;
		local112 = (arg0 + (Static34.anInt1183 & 0x1)) / 2;
		if (local112 <= 0) {
			return;
		}
		@Pc(297) int local297;
		@Pc(304) int local304;
		for (@Pc(288) int local288 = 0; local288 < Static87.anInt1559 * 100; local288++) {
			local297 = (int) (Math.random() * 124.0D) + 2;
			local304 = (int) (Math.random() * 128.0D) + 128;
			Static114.anIntArray338[(local304 << 7) + local297] = 192;
		}
		Static87.anInt1559 = 0;
		@Pc(328) int local328;
		@Pc(333) int local333;
		for (local297 = 0; local297 < 256; local297++) {
			local328 = local297 * 128;
			local304 = 0;
			for (local333 = -local112; local333 < 128; local333++) {
				if (local333 + local112 < 128) {
					local304 += Static114.anIntArray338[local112 + local328 + local333];
				}
				if (local333 - local112 - 1 >= 0) {
					local304 -= Static114.anIntArray338[local333 + local328 - local112 - 1];
				}
				if (local333 >= 0) {
					Static73.anIntArray237[local328 + local333] = local304 / (local112 * 2 + 1);
				}
			}
		}
		for (local304 = 0; local304 < 128; local304++) {
			local328 = 0;
			for (local333 = -local112; local333 < 256; local333++) {
				@Pc(414) int local414 = local333 * 128;
				if (local333 + local112 < 256) {
					local328 += Static73.anIntArray237[local112 * 128 + local414 + local304];
				}
				if (local333 - local112 - 1 >= 0) {
					local328 -= Static73.anIntArray237[local414 + local304 - (local112 + 1) * 128];
				}
				if (local333 >= 0) {
					Static114.anIntArray338[local304 + local414] = local328 / (local112 * 2 + 1);
				}
			}
		}
	}

	@OriginalMember(owner = "client!qd", name = "f", descriptor = "(I)V")
	public static void method1806() {
		aClass60_1178 = null;
		aClass3_Sub1_Sub2_Sub4_11 = null;
		aClass63Array1 = null;
		aClass60_1179 = null;
		aClass60_1187 = null;
		aClass60_1181 = null;
		aClass60_1183 = null;
		aClass60_1190 = null;
		aClass60_1191 = null;
		aClass60_1186 = null;
		aClass60_1188 = null;
		aClass60_1185 = null;
		aClass60_1184 = null;
		aClass60_1182 = null;
		aClass60_1180 = null;
		aClass60_1189 = null;
	}
}
