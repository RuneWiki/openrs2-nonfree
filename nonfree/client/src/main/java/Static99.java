import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static99 {

	@OriginalMember(owner = "client!ke", name = "M", descriptor = "I")
	public static int anInt2138;

	@OriginalMember(owner = "client!ke", name = "N", descriptor = "Lclient!dc;")
	public static final Class20 aClass20_790 = Static161.method2452(" <col=ffff00>");

	@OriginalMember(owner = "client!ke", name = "U", descriptor = "Lclient!dc;")
	public static final Class20 aClass20_791 = Static161.method2452("(U4");

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(ILclient!pc;)V")
	public static void method1684(@OriginalArg(1) Class5_Sub23 arg0) {
		@Pc(1) long local1 = 0L;
		@Pc(7) int local7 = 0;
		if (arg0.anInt3038 == 0) {
			local1 = Static31.method509(arg0.anInt3025, arg0.anInt3031, arg0.anInt3033);
		}
		if (arg0.anInt3038 == 1) {
			local1 = Static7.method165(arg0.anInt3025, arg0.anInt3031, arg0.anInt3033);
		}
		if (arg0.anInt3038 == 2) {
			local1 = Static178.method2696(arg0.anInt3025, arg0.anInt3031, arg0.anInt3033);
		}
		if (arg0.anInt3038 == 3) {
			local1 = Static216.method3183(arg0.anInt3025, arg0.anInt3031, arg0.anInt3033);
		}
		@Pc(64) int local64 = -1;
		@Pc(66) int local66 = 0;
		if (local1 != 0L) {
			local64 = Integer.MAX_VALUE & (int) (local1 >>> 32);
			local7 = (int) local1 >> 14 & 0x1F;
			local66 = (int) local1 >> 20 & 0x3;
		}
		arg0.anInt3032 = local66;
		arg0.anInt3034 = local7;
		arg0.anInt3020 = local64;
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(I[B)V")
	public static void method1685(@OriginalArg(1) byte[] arg0) {
		@Pc(3) int local3 = 0;
		while (true) {
			while (local3 < arg0.length) {
				@Pc(22) int local22 = (arg0[local3++] & 0xFF) * 64 - Static207.anInt4070;
				@Pc(34) int local34 = (arg0[local3++] & 0xFF) * 64 - Static59.anInt1331;
				@Pc(63) byte local63;
				@Pc(56) int local56;
				if (local22 > 0 && local34 > 0 && Static131.anInt2727 > local22 + 64 && Static165.anInt2257 > local34 + 64) {
					local56 = local22 >> 6;
					@Pc(84) int local84 = Static165.anInt2257 - local34 - 1 >> 6;
					for (@Pc(86) int local86 = 0; local86 < 64; local86++) {
						for (@Pc(90) int local90 = -64; local90 < 0; local90++) {
							local63 = arg0[local3++];
							if (local63 != 0) {
								if (Static106.aByteArrayArrayArray8[local56][local84] == null) {
									Static106.aByteArrayArrayArray8[local56][local84] = new byte[4096];
								}
								Static106.aByteArrayArrayArray8[local56][local84][(-(local90 + 1) << 6) + local86] = local63;
								@Pc(132) byte local132 = arg0[local3++];
								if (Static28.aByteArrayArrayArray1[local56][local84] == null) {
									Static28.aByteArrayArrayArray1[local56][local84] = new byte[4096];
								}
								Static28.aByteArrayArrayArray1[local56][local84][(-(local90 + 1) << 6) + local86] = local132;
							}
						}
					}
				} else {
					for (local56 = -4096; local56 < 0; local56++) {
						local63 = arg0[local3++];
						if (local63 != 0) {
							local3++;
						}
					}
				}
			}
			return;
		}
	}

	@OriginalMember(owner = "client!ke", name = "g", descriptor = "(I)I")
	public static int method1687() {
		if (Static29.aDouble1 == 3.0D) {
			return 37;
		} else if (Static29.aDouble1 == 4.0D) {
			return 50;
		} else if (Static29.aDouble1 == 6.0D) {
			return 75;
		} else {
			return 100;
		}
	}
}
