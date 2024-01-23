import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static97 {

	@OriginalMember(owner = "client!hc", name = "e", descriptor = "I")
	public static int anInt1857;

	@OriginalMember(owner = "client!hc", name = "i", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray11;

	@OriginalMember(owner = "client!hc", name = "c", descriptor = "[[S")
	public static short[][] aShortArrayArray4 = new short[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433, 2983, -11343, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 25239, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

	@OriginalMember(owner = "client!hc", name = "f", descriptor = "Z")
	public static boolean aBoolean136 = true;

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(IIIIII)V")
	public static void method1592(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		for (@Pc(7) int local7 = arg0; local7 <= arg1; local7++) {
			Static288.method4405(arg3, arg4, arg2, Static151.anIntArrayArray26[local7]);
		}
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(Lclient!ak;IBI)[Lclient!ek;")
	public static Class1_Sub2_Sub2_Sub1[] method1593(@OriginalArg(0) Class7 arg0, @OriginalArg(3) int arg1) {
		return Static139.method2193(arg0, arg1, 0) ? Static101.method1646() : null;
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(I)V")
	public static void method1594() {
		Static277.aClass31_41.method855();
		Static140.aClass31_23.method855();
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(Lclient!ak;ILclient!ak;)V")
	public static void method1596(@OriginalArg(0) Class7 arg0, @OriginalArg(2) Class7 arg1) {
		Static233.aClass7_191 = arg0;
		Static79.aClass7_131 = arg1;
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(Lclient!jj;I)V")
	public static void method1597(@OriginalArg(0) Class1_Sub18 arg0) {
		label83: while (true) {
			if (arg0.anInt3911 < arg0.aByteArray71.length) {
				@Pc(24) boolean local24 = false;
				@Pc(26) int local26 = 0;
				@Pc(28) int local28 = 0;
				if (arg0.method3122() == 1) {
					local26 = arg0.method3122();
					local28 = arg0.method3122();
					local24 = true;
				}
				@Pc(47) int local47 = arg0.method3122();
				@Pc(51) int local51 = arg0.method3122();
				@Pc(62) int local62 = Static77.anInt1559 + Static198.anInt3851 - local51 * 64 - 1;
				@Pc(69) int local69 = local47 * 64 - Static219.anInt4487;
				@Pc(142) byte local142;
				@Pc(98) int local98;
				if (local69 >= 0 && local62 - 63 >= 0 && local69 + 63 < Static93.anInt1769 && Static77.anInt1559 > local62) {
					@Pc(94) int local94 = local62 >> 6;
					local98 = local69 >> 6;
					@Pc(100) int local100 = 0;
					while (true) {
						if (local100 >= 64) {
							continue label83;
						}
						for (@Pc(107) int local107 = 0; local107 < 64; local107++) {
							if (!local24 || local26 * 8 <= local100 && local26 * 8 + 8 > local100 && local28 * 8 <= local107 && local107 < local28 * 8 + 8) {
								local142 = arg0.method3082();
								if (local142 != 0) {
									if (Static276.aByteArrayArrayArray26[local98][local94] == null) {
										Static276.aByteArrayArrayArray26[local98][local94] = new byte[4096];
									}
									Static276.aByteArrayArrayArray26[local98][local94][(63 - local107 << 6) + local100] = local142;
									@Pc(178) byte local178 = arg0.method3082();
									if (Static212.aByteArrayArrayArray25[local98][local94] == null) {
										Static212.aByteArrayArrayArray25[local98][local94] = new byte[4096];
									}
									Static212.aByteArrayArrayArray25[local98][local94][local100 + (63 - local107 << 6)] = local178;
								}
							}
						}
						local100++;
					}
				}
				local98 = 0;
				while (true) {
					if (local98 >= (local24 ? 64 : 4096)) {
						continue label83;
					}
					local142 = arg0.method3082();
					if (local142 != 0) {
						arg0.anInt3911++;
					}
					local98++;
				}
			}
			return;
		}
	}
}
