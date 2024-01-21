import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static97 {

	@OriginalMember(owner = "client!rc", name = "J", descriptor = "I")
	public static int anInt2725;

	@OriginalMember(owner = "client!rc", name = "L", descriptor = "Lclient!l;")
	public static Class6_Sub3_Sub3_Sub2 aClass6_Sub3_Sub3_Sub2_4;

	@OriginalMember(owner = "client!rc", name = "M", descriptor = "Lclient!ce;")
	public static Class10 aClass10_2;

	@OriginalMember(owner = "client!rc", name = "S", descriptor = "[[I")
	public static int[][] anIntArrayArray35;

	@OriginalMember(owner = "client!rc", name = "G", descriptor = "I")
	public static int anInt2723 = 0;

	@OriginalMember(owner = "client!rc", name = "H", descriptor = "[B")
	public static byte[] aByteArray32 = new byte[] { 95, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57 };

	@OriginalMember(owner = "client!rc", name = "N", descriptor = "Lclient!rd;")
	public static Class63 aClass63_1495 = Static80.method1463("huffman");

	@OriginalMember(owner = "client!rc", name = "O", descriptor = "I")
	public static int anInt2727 = 0;

	@OriginalMember(owner = "client!rc", name = "Q", descriptor = "I")
	public static int anInt2729 = 0;

	@OriginalMember(owner = "client!rc", name = "R", descriptor = "[I")
	public static int[] anIntArray293 = new int[] { 0, -1, 0, 1 };

	@OriginalMember(owner = "client!rc", name = "T", descriptor = "I")
	public static int anInt2730 = 0;

	@OriginalMember(owner = "client!rc", name = "V", descriptor = "I")
	public static int anInt2732 = (int) (Math.random() * 33.0D) - 16;

	@OriginalMember(owner = "client!rc", name = "d", descriptor = "(I)V")
	public static void method1790() {
		aByteArray32 = null;
		aClass63_1495 = null;
		aClass6_Sub3_Sub3_Sub2_4 = null;
		anIntArrayArray35 = null;
		anIntArray293 = null;
		aClass10_2 = null;
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(BLclient!wa;)Lclient!rd;")
	public static Class63 method1791(@OriginalArg(1) Class6_Sub3_Sub17 arg0) {
		if (Static47.method1027(Static82.method1498(arg0)) == 0) {
			return null;
		} else if (arg0.aClass63_1773 == null || arg0.aClass63_1773.method1833().method1811() == 0) {
			return Static66.aBoolean170 ? Static6.aClass63_59 : null;
		} else {
			return arg0.aClass63_1773;
		}
	}

	@OriginalMember(owner = "client!rc", name = "b", descriptor = "(B)I")
	public static int method1792() {
		@Pc(12) int local12 = 3;
		if (Static35.anInt1172 < 310) {
			@Pc(21) int local21 = Static41.anInt1273 >> 7;
			@Pc(25) int local25 = Static4.anInt45 >> 7;
			@Pc(30) int local30 = Static120.aClass6_Sub3_Sub1_Sub2_Sub2_1.anInt2319 >> 7;
			if ((Static103.aByteArrayArrayArray92[Static101.anInt2810][local21][local25] & 0x4) != 0) {
				local12 = Static101.anInt2810;
			}
			@Pc(50) int local50;
			if (local30 > local21) {
				local50 = local30 - local21;
			} else {
				local50 = local21 - local30;
			}
			@Pc(61) int local61 = Static120.aClass6_Sub3_Sub1_Sub2_Sub2_1.anInt2347 >> 7;
			@Pc(68) int local68;
			if (local25 >= local61) {
				local68 = local25 - local61;
			} else {
				local68 = local61 - local25;
			}
			@Pc(90) int local90;
			@Pc(84) int local84;
			if (local50 <= local68) {
				local84 = 32768;
				local90 = local50 * 65536 / local68;
				while (local61 != local25) {
					if (local61 > local25) {
						local25++;
					} else if (local61 < local25) {
						local25--;
					}
					if ((Static103.aByteArrayArrayArray92[Static101.anInt2810][local21][local25] & 0x4) != 0) {
						local12 = Static101.anInt2810;
					}
					local84 += local90;
					if (local84 >= 65536) {
						if (local21 < local30) {
							local21++;
						} else if (local30 < local21) {
							local21--;
						}
						local84 -= 65536;
						if ((Static103.aByteArrayArrayArray92[Static101.anInt2810][local21][local25] & 0x4) != 0) {
							local12 = Static101.anInt2810;
						}
					}
				}
			} else {
				local90 = local68 * 65536 / local50;
				local84 = 32768;
				while (local30 != local21) {
					local84 += local90;
					if (local21 < local30) {
						local21++;
					} else if (local30 < local21) {
						local21--;
					}
					if ((Static103.aByteArrayArrayArray92[Static101.anInt2810][local21][local25] & 0x4) != 0) {
						local12 = Static101.anInt2810;
					}
					if (local84 >= 65536) {
						local84 -= 65536;
						if (local61 > local25) {
							local25++;
						} else if (local61 < local25) {
							local25--;
						}
						if ((Static103.aByteArrayArrayArray92[Static101.anInt2810][local21][local25] & 0x4) != 0) {
							local12 = Static101.anInt2810;
						}
					}
				}
			}
		}
		if ((Static103.aByteArrayArrayArray92[Static101.anInt2810][Static120.aClass6_Sub3_Sub1_Sub2_Sub2_1.anInt2319 >> 7][Static120.aClass6_Sub3_Sub1_Sub2_Sub2_1.anInt2347 >> 7] & 0x4) != 0) {
			local12 = Static101.anInt2810;
		}
		return local12;
	}
}
