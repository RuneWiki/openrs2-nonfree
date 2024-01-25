import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static89 {

	@OriginalMember(owner = "client!cw", name = "o", descriptor = "J")
	public static long aLong51;

	@OriginalMember(owner = "client!cw", name = "q", descriptor = "Lclient!hv;")
	public static final Class146 aClass146_9 = new Class146(1, 2);

	@OriginalMember(owner = "client!cw", name = "b", descriptor = "(III)V")
	public static void method1665(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Static261.anInt4675 == 1) {
			Static242.method6995(Static569.aClass3_Sub11_Sub14_5, arg0, arg1);
		} else if (Static261.anInt4675 == 2) {
			if (Static82.aBoolean134) {
				Static281.method4519(Static147.method2738() + arg0, Static31.method748() + arg1);
			} else {
				Static281.method4519(arg0, arg1);
			}
		}
		Static261.anInt4675 = 0;
		Static569.aClass3_Sub11_Sub14_5 = null;
	}

	@OriginalMember(owner = "client!cw", name = "a", descriptor = "(IIIIII)V")
	public static void method1666(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		for (@Pc(11) int local11 = arg2; local11 <= arg4; local11++) {
			Static483.method7014(Static392.anIntArrayArray39[local11], arg0, arg1, arg3);
		}
	}

	@OriginalMember(owner = "client!cw", name = "a", descriptor = "(I[B)V")
	public static void method1668(@OriginalArg(1) byte[] arg0) {
		@Pc(10) Class3_Sub25 local10 = new Class3_Sub25(arg0);
		while (true) {
			@Pc(16) int local16;
			@Pc(41) int local41;
			@Pc(36) int local36;
			label45: do {
				while (true) {
					while (true) {
						local16 = local10.method8632();
						if (local16 == 0) {
							return;
						}
						if (local16 == 1) {
							@Pc(109) int[] local109 = Static272.anIntArray430 = new int[6];
							local109[0] = local10.method8593();
							local109[1] = local10.method8593();
							local109[2] = local10.method8593();
							local109[3] = local10.method8593();
							local109[4] = local10.method8593();
							local109[5] = local10.method8593();
						} else {
							if (local16 != 4) {
								continue label45;
							}
							local36 = local10.method8632();
							Static277.anIntArray584 = new int[local36];
							for (local41 = 0; local41 < local36; local41++) {
								Static277.anIntArray584[local41] = local10.method8593();
								if (Static277.anIntArray584[local41] == 65535) {
									Static277.anIntArray584[local41] = -1;
								}
							}
						}
					}
				}
			} while (local16 != 5);
			local36 = local10.method8632();
			Static424.anIntArray609 = new int[local36];
			for (local41 = 0; local41 < local36; local41++) {
				Static424.anIntArray609[local41] = local10.method8593();
				if (Static424.anIntArray609[local41] == 65535) {
					Static424.anIntArray609[local41] = -1;
				}
			}
		}
	}

	@OriginalMember(owner = "client!cw", name = "a", descriptor = "(BII)Z")
	public static boolean method1669(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x800) != 0;
	}
}
