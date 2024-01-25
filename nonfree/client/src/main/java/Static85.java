import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static85 {

	@OriginalMember(owner = "client!db", name = "h", descriptor = "I")
	public static int anInt1770;

	@OriginalMember(owner = "client!db", name = "k", descriptor = "[I")
	public static int[] anIntArray116;

	@OriginalMember(owner = "client!db", name = "i", descriptor = "I")
	public static int anInt1771 = -2;

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(IIZ)Z")
	public static boolean method1761(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x20) != 0;
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(BI)I")
	public static int method1763(@OriginalArg(1) int arg0) {
		return arg0 == 16711935 ? -1 : Static278.method4064(arg0);
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(IIIIIIBIII)V")
	public static void method1764(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(5) int arg3, @OriginalArg(7) int arg4, @OriginalArg(8) int arg5, @OriginalArg(9) int arg6) {
		if (arg2 < 512 || arg0 < 512 || (Static224.anInt3557 - 2) * 512 < arg2 || arg0 > Static267.anInt4309 * 512 - 1024) {
			Static519.anIntArray552[0] = Static519.anIntArray552[1] = -1;
			return;
		}
		@Pc(46) int local46 = Static674.method8951(arg3, arg0, arg2) - arg6;
		if (Static423.aBoolean517) {
			Static117.method2151(true);
		} else {
			Static149.aClass92_2.method3851(arg1, 0, 0);
			Static582.aClass33_13.method8133(Static149.aClass92_2);
		}
		if (Static499.aBoolean608) {
			Static582.aClass33_13.HA(arg2, local46, arg0, Static140.anInt8126, Static519.anIntArray552);
		} else {
			Static582.aClass33_13.da(arg2, local46, arg0, Static519.anIntArray552);
		}
		if (Static423.aBoolean517) {
			Static479.method6585();
		} else {
			Static149.aClass92_2.method3851(-arg1, 0, 0);
			Static582.aClass33_13.method8133(Static149.aClass92_2);
		}
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(BLjava/lang/String;)[B")
	public static byte[] method1765(@OriginalArg(1) String arg0) {
		@Pc(6) int local6 = arg0.length();
		if (local6 == 0) {
			return new byte[0];
		}
		@Pc(27) int local27 = local6 + 3 & 0xFFFFFFFC;
		@Pc(33) int local33 = local27 / 4 * 3;
		if (local27 - 2 >= local6 || Static555.method7393(arg0.charAt(local27 - 2)) == -1) {
			local33 -= 2;
		} else if (local6 <= local27 - 1 || Static555.method7393(arg0.charAt(local27 - 1)) == -1) {
			local33--;
		}
		@Pc(73) byte[] local73 = new byte[local33];
		Static258.method3732(local73, 0, arg0);
		return local73;
	}
}
