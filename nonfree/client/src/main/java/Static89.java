import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static89 {

	@OriginalMember(owner = "client!qe", name = "p", descriptor = "I")
	public static int anInt2024;

	@OriginalMember(owner = "client!qe", name = "D", descriptor = "[I")
	public static int[] anIntArray300;

	@OriginalMember(owner = "client!qe", name = "K", descriptor = "[Lclient!oa;")
	public static Class1_Sub1_Sub5_Sub3[] aClass1_Sub1_Sub5_Sub3Array5;

	@OriginalMember(owner = "client!qe", name = "L", descriptor = "Lclient!gb;")
	public static Class1_Sub1_Sub5_Sub1 aClass1_Sub1_Sub5_Sub1_4;

	@OriginalMember(owner = "client!qe", name = "h", descriptor = "Ljava/util/zip/CRC32;")
	public static CRC32 aCRC32_1 = new CRC32();

	@OriginalMember(owner = "client!qe", name = "t", descriptor = "I")
	public static int anInt2028 = 0;

	@OriginalMember(owner = "client!qe", name = "x", descriptor = "Lclient!rd;")
	private static Class64 aClass64_1279 = Static69.method1153(" has logged out)3");

	@OriginalMember(owner = "client!qe", name = "y", descriptor = "Lclient!rd;")
	private static Class64 aClass64_1280 = Static69.method1153("flash3:");

	@OriginalMember(owner = "client!qe", name = "z", descriptor = "Lclient!rd;")
	public static Class64 aClass64_1281 = aClass64_1280;

	@OriginalMember(owner = "client!qe", name = "B", descriptor = "Lclient!pc;")
	public static Class58 aClass58_5 = new Class58(4096);

	@OriginalMember(owner = "client!qe", name = "E", descriptor = "[I")
	public static int[] anIntArray301 = new int[128];

	@OriginalMember(owner = "client!qe", name = "F", descriptor = "I")
	public static int anInt2034 = 0;

	@OriginalMember(owner = "client!qe", name = "G", descriptor = "Lclient!rd;")
	public static Class64 aClass64_1282 = Static69.method1153("Fallen lassen");

	@OriginalMember(owner = "client!qe", name = "H", descriptor = "Lclient!rd;")
	public static Class64 aClass64_1283 = aClass64_1279;

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(I)V")
	public static void method1446() {
		aClass64_1282 = null;
		anIntArray301 = null;
		aClass1_Sub1_Sub5_Sub1_4 = null;
		aClass64_1281 = null;
		aClass64_1280 = null;
		anIntArray300 = null;
		aClass58_5 = null;
		aCRC32_1 = null;
		aClass64_1283 = null;
		aClass64_1279 = null;
		aClass1_Sub1_Sub5_Sub3Array5 = null;
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(BI)Lclient!rd;")
	public static Class64 method1447() {
		@Pc(3) Class64 local3 = new Class64();
		local3.aByteArray24 = new byte[100];
		local3.anInt2086 = 0;
		return local3;
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(III)I")
	public static int method1448(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(39) int local39 = Static95.method1569(arg0 + 45365, arg1 + 91923, 4) + (Static95.method1569(arg0 + 10294, arg1 - -37821, 2) - 128 >> 1) + (Static95.method1569(arg0, arg1, 1) + -128 >> 2) - 128;
		local39 = (int) ((double) local39 * 0.3D) + 35;
		if (local39 < 10) {
			local39 = 10;
		} else if (local39 > 60) {
			local39 = 60;
		}
		return local39;
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(IIIII)I")
	public static int method1449(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(21) int local21 = 65536 - Class1_Sub1_Sub5_Sub4.anIntArray429[arg2 * 1024 / arg1] >> 1;
		return ((65536 - local21) * arg0 >> 16) + (arg3 * local21 >> 16);
	}

	@OriginalMember(owner = "client!qe", name = "b", descriptor = "(I)V")
	public static void method1450() {
		@Pc(9) int local9 = Static17.aClass1_Sub1_Sub5_Sub1_2.method654(Static52.aClass64_1827);
		@Pc(19) int local19;
		for (@Pc(11) int local11 = 0; local11 < Static48.anInt2603; local11++) {
			local19 = Static17.aClass1_Sub1_Sub5_Sub1_2.method653(Static101.aClass64Array16[local11]);
			if (local9 < local19) {
				local9 = local19;
			}
		}
		local9 += 8;
		local19 = Static48.anInt2603 * 15 + 21;
		@Pc(93) int local93;
		@Pc(97) int local97;
		if (Static27.anInt889 != -1) {
			Static110.anInt2655 = local9;
			Static119.anInt2852 = Static48.anInt2603 * 15 + 22;
			Static94.aBoolean132 = true;
			Static12.anInt1938 = 0;
			local93 = Static118.anInt2842 - local9 / 2;
			if (local9 + local93 > 765) {
				local93 = 765 - local9;
			}
			if (local93 < 0) {
				local93 = 0;
			}
			Static109.anInt2635 = local93;
			local97 = Static96.anInt2745;
			if (local19 + local97 > 503) {
				local97 = 503 - local19;
			}
			if (local97 < 0) {
				local97 = 0;
			}
			Static71.anInt1611 = local97;
			return;
		}
		if (Static118.anInt2842 > 4 && Static96.anInt2745 > 4 && Static118.anInt2842 < 516 && Static96.anInt2745 < 338) {
			Static94.aBoolean132 = true;
			local93 = Static118.anInt2842 - local9 / 2 - 4;
			Static110.anInt2655 = local9;
			if (local9 + local93 > 512) {
				local93 = 512 - local9;
			}
			Static12.anInt1938 = 0;
			Static119.anInt2852 = Static48.anInt2603 * 15 + 22;
			local97 = Static96.anInt2745 - 4;
			if (local97 + local19 > 334) {
				local97 = 334 - local19;
			}
			if (local93 < 0) {
				local93 = 0;
			}
			Static109.anInt2635 = local93;
			if (local97 < 0) {
				local97 = 0;
			}
			Static71.anInt1611 = local97;
			return;
		}
		if (Static118.anInt2842 > 553 && Static96.anInt2745 > 205 && Static118.anInt2842 < 743 && Static96.anInt2745 < 466) {
			Static12.anInt1938 = 1;
			Static94.aBoolean132 = true;
			Static119.anInt2852 = Static48.anInt2603 * 15 + 22;
			local93 = Static118.anInt2842 - local9 / 2 - 553;
			local97 = Static96.anInt2745 - 205;
			Static110.anInt2655 = local9;
			if (local93 < 0) {
				local93 = 0;
			} else if (local93 + local9 > 190) {
				local93 = 190 - local9;
			}
			Static109.anInt2635 = local93;
			if (local97 < 0) {
				local97 = 0;
			} else if (local19 + local97 > 261) {
				local97 = 261 - local19;
			}
			Static71.anInt1611 = local97;
			return;
		}
		if (Static118.anInt2842 <= 17 || Static96.anInt2745 <= 357 || Static118.anInt2842 >= 496 || Static96.anInt2745 >= 453) {
			return;
		}
		Static110.anInt2655 = local9;
		Static119.anInt2852 = Static48.anInt2603 * 15 + 22;
		Static12.anInt1938 = 2;
		Static94.aBoolean132 = true;
		local93 = Static118.anInt2842 - local9 / 2 - 17;
		local97 = Static96.anInt2745 - 357;
		if (local97 < 0) {
			local97 = 0;
		} else if (local19 + local97 > 96) {
			local97 = 96 - local19;
		}
		Static71.anInt1611 = local97;
		if (local93 < 0) {
			local93 = 0;
		} else if (local9 + local93 > 479) {
			local93 = 479 - local9;
		}
		Static109.anInt2635 = local93;
		return;
	}
}
