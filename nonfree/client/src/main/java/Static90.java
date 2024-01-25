import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static90 {

	@OriginalMember(owner = "client!fm", name = "b", descriptor = "Ljava/awt/Frame;")
	public static Frame aFrame1;

	@OriginalMember(owner = "client!fm", name = "c", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray2;

	@OriginalMember(owner = "client!fm", name = "d", descriptor = "Z")
	public static boolean aBoolean119 = false;

	@OriginalMember(owner = "client!fm", name = "f", descriptor = "[I")
	public static final int[] anIntArray193 = new int[] { 4, 4, 1, 2, 6, 4, 2, 48, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };

	@OriginalMember(owner = "client!fm", name = "g", descriptor = "Ljava/lang/String;")
	public static final String aString60 = "cyan:";

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(I)V")
	public static void method1535() {
		@Pc(9) int local9 = Static179.anInt3361 * 128 + 64;
		@Pc(15) int local15 = Static268.anInt5000 * 128 + 64;
		@Pc(25) int local25 = Static306.method5249(local15, local9, Static343.anInt6225) - Static105.anInt1947;
		if (Static102.anInt5256 >= 100) {
			Static11.anInt197 = Static268.anInt5000 * 128 + 64;
			Static287.anInt5405 = Static179.anInt3361 * 128 + 64;
			Static217.anInt4016 = Static306.method5249(Static11.anInt197, Static287.anInt5405, Static343.anInt6225) - Static105.anInt1947;
		} else {
			if (Static287.anInt5405 < local9) {
				Static287.anInt5405 += Static281.anInt5316 + Static102.anInt5256 * (local9 - Static287.anInt5405) / 1000;
				if (local9 < Static287.anInt5405) {
					Static287.anInt5405 = local9;
				}
			}
			if (local25 > Static217.anInt4016) {
				Static217.anInt4016 += Static281.anInt5316 + Static102.anInt5256 * (local25 - Static217.anInt4016) / 1000;
				if (local25 < Static217.anInt4016) {
					Static217.anInt4016 = local25;
				}
			}
			if (local9 < Static287.anInt5405) {
				Static287.anInt5405 -= Static281.anInt5316 + (Static287.anInt5405 - local9) * Static102.anInt5256 / 1000;
				if (local9 > Static287.anInt5405) {
					Static287.anInt5405 = local9;
				}
			}
			if (local15 > Static11.anInt197) {
				Static11.anInt197 += Static281.anInt5316 + Static102.anInt5256 * (local15 - Static11.anInt197) / 1000;
				if (Static11.anInt197 > local15) {
					Static11.anInt197 = local15;
				}
			}
			if (local25 < Static217.anInt4016) {
				Static217.anInt4016 -= Static281.anInt5316 + (Static217.anInt4016 - local25) * Static102.anInt5256 / 1000;
				if (Static217.anInt4016 < local25) {
					Static217.anInt4016 = local25;
				}
			}
			if (Static11.anInt197 > local15) {
				Static11.anInt197 -= Static281.anInt5316 + Static102.anInt5256 * (Static11.anInt197 - local15) / 1000;
				if (Static11.anInt197 < local15) {
					Static11.anInt197 = local15;
				}
			}
		}
		local15 = Static13.anInt229 * 128 + 64;
		local9 = Static148.anInt2742 * 128 + 64;
		local25 = Static306.method5249(local15, local9, Static343.anInt6225) - Static273.anInt6141;
		@Pc(231) int local231 = local9 - Static287.anInt5405;
		@Pc(236) int local236 = local25 - Static217.anInt4016;
		@Pc(241) int local241 = local15 - Static11.anInt197;
		@Pc(252) int local252 = (int) Math.sqrt((double) (local231 * local231 + local241 * local241));
		@Pc(263) int local263 = (int) (Math.atan2((double) local236, (double) local252) * 2607.5945876176133D) & 0x3FFF;
		@Pc(274) int local274 = (int) (Math.atan2((double) local231, (double) local241) * -2607.5945876176133D) & 0x3FFF;
		if (local263 < 1024) {
			local263 = 1024;
		}
		if (local263 > 3072) {
			local263 = 3072;
		}
		if (local263 > Static110.anInt2047) {
			Static110.anInt2047 += Static350.anInt6299 + Static233.anInt4352 * (local263 - Static110.anInt2047 >> 3) / 1000 << 3;
			if (Static110.anInt2047 > local263) {
				Static110.anInt2047 = local263;
			}
		}
		if (Static110.anInt2047 > local263) {
			Static110.anInt2047 -= Static233.anInt4352 * (Static110.anInt2047 - local263 >> 3) / 1000 + Static350.anInt6299 << 3;
			if (Static110.anInt2047 < local263) {
				Static110.anInt2047 = local263;
			}
		}
		@Pc(349) int local349 = local274 - Static79.anInt1450;
		if (local349 > 8192) {
			local349 -= 16384;
		}
		if (local349 < -8192) {
			local349 += 16384;
		}
		local349 >>= 0x3;
		if (local349 > 0) {
			Static79.anInt1450 += Static350.anInt6299 + Static233.anInt4352 * local349 / 1000 << 3;
			Static79.anInt1450 &= 0x3FFF;
		}
		if (local349 < 0) {
			Static79.anInt1450 -= Static350.anInt6299 + Static233.anInt4352 * -local349 / 1000 << 3;
			Static79.anInt1450 &= 0x3FFF;
		}
		@Pc(406) int local406 = local274 - Static79.anInt1450;
		if (local406 > 8192) {
			local406 -= 16384;
		}
		if (local406 < -8192) {
			local406 += 16384;
		}
		if (local406 < 0 && local349 > 0 || local406 > 0 && local349 < 0) {
			Static79.anInt1450 = local274;
		}
	}

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(I[B)[B")
	public static byte[] method1536(@OriginalArg(1) byte[] arg0) {
		@Pc(8) Class6_Sub10 local8 = new Class6_Sub10(arg0);
		@Pc(12) int local12 = local8.method3972();
		@Pc(23) int local23 = local8.method3979();
		if (local23 < 0 || Static298.anInt5640 != 0 && Static298.anInt5640 < local23) {
			throw new RuntimeException();
		} else if (local12 == 0) {
			@Pc(46) byte[] local46 = new byte[local23];
			local8.method3986(local23, local46);
			return local46;
		} else {
			@Pc(60) int local60 = local8.method3979();
			if (local60 < 0 || Static298.anInt5640 != 0 && local60 > Static298.anInt5640) {
				throw new RuntimeException();
			}
			@Pc(77) byte[] local77 = new byte[local60];
			if (local12 == 1) {
				Static231.method4099(local77, local60, arg0, local23);
			} else {
				Static53.aClass180_1.method4854(local77, local8);
			}
			return local77;
		}
	}
}
