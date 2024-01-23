import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static90 {

	@OriginalMember(owner = "client!gk", name = "n", descriptor = "I")
	public static int anInt1920;

	@OriginalMember(owner = "client!gk", name = "l", descriptor = "I")
	public static int anInt1918 = 0;

	@OriginalMember(owner = "client!gk", name = "t", descriptor = "Z")
	public static boolean aBoolean138 = false;

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(Lclient!aj;I)V")
	public static void method1461(@OriginalArg(0) Class8_Sub2 arg0) {
		label83: while (true) {
			if (arg0.aByteArray24.length > arg0.anInt2955) {
				@Pc(21) boolean local21 = false;
				@Pc(23) int local23 = 0;
				@Pc(25) int local25 = 0;
				if (arg0.method2334() == 1) {
					local23 = arg0.method2334();
					local25 = arg0.method2334();
					local21 = true;
				}
				@Pc(45) int local45 = arg0.method2334();
				@Pc(49) int local49 = arg0.method2334();
				@Pc(56) int local56 = local45 * 64 - Static220.anInt4522;
				@Pc(66) int local66 = Static221.anInt4539 + Static140.anInt2782 - local49 * 64 - 1;
				@Pc(101) byte local101;
				@Pc(90) int local90;
				if (local56 >= 0 && local66 - 63 >= 0 && local56 + 63 < Static156.anInt3157 && local66 < Static221.anInt4539) {
					local90 = local56 >> 6;
					@Pc(123) int local123 = local66 >> 6;
					@Pc(125) int local125 = 0;
					while (true) {
						if (local125 >= 64) {
							continue label83;
						}
						for (@Pc(132) int local132 = 0; local132 < 64; local132++) {
							if (!local21 || local23 * 8 <= local125 && local23 * 8 + 8 > local125 && local132 >= local25 * 8 && local132 < local25 * 8 + 8) {
								local101 = arg0.method2374();
								if (local101 != 0) {
									if (Static74.aByteArrayArrayArray3[local90][local123] == null) {
										Static74.aByteArrayArrayArray3[local90][local123] = new byte[4096];
									}
									Static74.aByteArrayArrayArray3[local90][local123][(63 - local132 << 6) + local125] = local101;
									@Pc(213) byte local213 = arg0.method2374();
									if (Static66.aByteArrayArrayArray13[local90][local123] == null) {
										Static66.aByteArrayArrayArray13[local90][local123] = new byte[4096];
									}
									Static66.aByteArrayArrayArray13[local90][local123][(63 - local132 << 6) + local125] = local213;
								}
							}
						}
						local125++;
					}
				}
				local90 = 0;
				while (true) {
					if ((local21 ? 64 : 4096) <= local90) {
						continue label83;
					}
					local101 = arg0.method2374();
					if (local101 != 0) {
						arg0.anInt2955++;
					}
					local90++;
				}
			}
			return;
		}
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(BII)V")
	public static void method1462(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		Static8.anIntArray495[arg0] = arg1;
		@Pc(14) Class8_Sub18 local14 = (Class8_Sub18) Static138.aClass129_14.method3043((long) arg0);
		if (local14 == null) {
			local14 = new Class8_Sub18(Static71.method1143() + 500L);
			Static138.aClass129_14.method3039(local14, (long) arg0);
		} else {
			local14.aLong104 = Static71.method1143() + 500L;
		}
	}
}
