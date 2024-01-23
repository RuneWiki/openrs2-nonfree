import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static92 {

	@OriginalMember(owner = "client!gm", name = "d", descriptor = "[I")
	public static int[] anIntArray130;

	@OriginalMember(owner = "client!gm", name = "e", descriptor = "[S")
	public static short[] aShortArray17;

	@OriginalMember(owner = "client!gm", name = "f", descriptor = "I")
	public static int anInt1945;

	@OriginalMember(owner = "client!gm", name = "i", descriptor = "B")
	public static byte aByte6;

	@OriginalMember(owner = "client!gm", name = "b", descriptor = "I")
	public static int anInt1943 = 1;

	@OriginalMember(owner = "client!gm", name = "c", descriptor = "I")
	public static int anInt1944 = 0;

	@OriginalMember(owner = "client!gm", name = "g", descriptor = "[I")
	public static int[] anIntArray131 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

	@OriginalMember(owner = "client!gm", name = "k", descriptor = "I")
	public static int anInt1948 = 0;

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(II)Lclient!gn;")
	public static Class66 method1480(@OriginalArg(1) int arg0) {
		@Pc(6) Class66 local6 = (Class66) Static243.aClass61_47.method1384((long) arg0);
		if (local6 != null) {
			return local6;
		}
		@Pc(20) byte[] local20 = Static295.aClass132_66.method3194(16, arg0);
		local6 = new Class66();
		if (local20 != null) {
			local6.method1487(new Class8_Sub2(local20));
		}
		Static243.aClass61_47.method1377((long) arg0, local6);
		return local6;
	}

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(IB)V")
	public static void method1481(@OriginalArg(0) int arg0) {
		if (arg0 > 256) {
			arg0 = 256;
		}
		if (arg0 > 10) {
			arg0 = 10;
		}
		Static209.anInt4336 += arg0 * 128;
		@Pc(51) int local51;
		if (Static69.anIntArray104.length < Static209.anInt4336) {
			Static209.anInt4336 -= Static69.anIntArray104.length;
			local51 = (int) (Math.random() * 12.0D);
			Static285.method4247(Static173.aClass43_Sub2Array2[local51]);
		}
		local51 = 0;
		@Pc(65) int local65 = (256 - arg0) * 128;
		@Pc(69) int local69 = arg0 * 128;
		@Pc(71) int local71;
		@Pc(96) int local96;
		for (local71 = 0; local71 < local65; local71++) {
			local96 = Static38.anIntArray59[local51 + local69] - arg0 * Static69.anIntArray104[Static209.anInt4336 + local51 & Static69.anIntArray104.length + -1] / 6;
			if (local96 < 0) {
				local96 = 0;
			}
			Static38.anIntArray59[local51++] = local96;
		}
		@Pc(127) int local127;
		@Pc(137) int local137;
		for (local71 = 256 - arg0; local71 < 256; local71++) {
			local96 = local71 * 128;
			for (local127 = 0; local127 < 128; local127++) {
				local137 = (int) (Math.random() * 100.0D);
				if (local137 < 50 && local127 > 10 && local127 < 118) {
					Static38.anIntArray59[local127 + local96] = 255;
				} else {
					Static38.anIntArray59[local127 + local96] = 0;
				}
			}
		}
		for (local71 = 0; local71 < 256 - arg0; local71++) {
			Static211.anIntArray331[local71] = Static211.anIntArray331[local71 + arg0];
		}
		for (local71 = 256 - arg0; local71 < 256; local71++) {
			Static211.anIntArray331[local71] = (int) (Math.sin((double) Static73.anInt1574 / 14.0D) * 16.0D + Math.sin((double) Static73.anInt1574 / 15.0D) * 14.0D + Math.sin((double) Static73.anInt1574 / 16.0D) * 12.0D);
			Static73.anInt1574++;
		}
		Static182.anInt3577 += arg0;
		local71 = ((Static183.anInt3590 & 0x1) + arg0) / 2;
		if (local71 <= 0) {
			return;
		}
		for (local96 = 0; local96 < Static182.anInt3577; local96++) {
			local127 = (int) (Math.random() * 124.0D) + 2;
			local137 = (int) (Math.random() * 128.0D) + 128;
			Static38.anIntArray59[local127 + (local137 << 7)] = 192;
		}
		Static182.anInt3577 = 0;
		@Pc(298) int local298;
		for (local96 = 0; local96 < 256; local96++) {
			local137 = local96 * 128;
			local127 = 0;
			for (local298 = -local71; local298 < 128; local298++) {
				if (local71 + local298 < 128) {
					local127 += Static38.anIntArray59[local298 + local137 + local71];
				}
				if (local298 - local71 - 1 >= 0) {
					local127 -= Static38.anIntArray59[local298 + local137 - local71 - 1];
				}
				if (local298 >= 0) {
					Static185.anIntArray274[local298 + local137] = local127 / (local71 * 2 + 1);
				}
			}
		}
		for (local96 = 0; local96 < 128; local96++) {
			local127 = 0;
			for (local137 = -local71; local137 < 256; local137++) {
				local298 = local137 * 128;
				if (local71 + local137 < 256) {
					local127 += Static185.anIntArray274[local71 * 128 + local298 + local96];
				}
				if (local137 - local71 - 1 >= 0) {
					local127 -= Static185.anIntArray274[local298 + local96 - (local71 + 1) * 128];
				}
				if (local137 >= 0) {
					Static38.anIntArray59[local96 + local298] = local127 / (local71 * 2 + 1);
				}
			}
		}
	}

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(III)I")
	public static int method1482(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) int local9 = arg0 * 57 + arg1;
		@Pc(15) int local15 = local9 << 13 ^ local9;
		@Pc(29) int local29 = Integer.MAX_VALUE & local15 * (local15 * 15731 * local15 + 789221) + 1376312589;
		return local29 >> 19 & 0xFF;
	}

	@OriginalMember(owner = "client!gm", name = "b", descriptor = "(II)Z")
	public static boolean method1483(@OriginalArg(1) int arg0) {
		if (Static10.aBooleanArray1[arg0]) {
			return true;
		} else if (Static171.aClass132_60.method3192(arg0)) {
			@Pc(31) int local31 = Static171.aClass132_60.method3189(arg0);
			if (local31 == 0) {
				Static10.aBooleanArray1[arg0] = true;
				return true;
			}
			if (Static210.aClass159ArrayArray6[arg0] == null) {
				Static210.aClass159ArrayArray6[arg0] = new Class159[local31];
			}
			for (@Pc(51) int local51 = 0; local51 < local31; local51++) {
				if (Static210.aClass159ArrayArray6[arg0][local51] == null) {
					@Pc(70) byte[] local70 = Static171.aClass132_60.method3194(arg0, local51);
					if (local70 != null) {
						@Pc(84) Class159 local84 = Static210.aClass159ArrayArray6[arg0][local51] = new Class159();
						local84.anInt5199 = local51 + (arg0 << 16);
						if (local70[0] == -1) {
							local84.method3880(new Class8_Sub2(local70));
						} else {
							local84.method3886(new Class8_Sub2(local70));
						}
					}
				}
			}
			Static10.aBooleanArray1[arg0] = true;
			return true;
		} else {
			return false;
		}
	}
}
