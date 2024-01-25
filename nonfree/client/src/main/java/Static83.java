import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static83 {

	@OriginalMember(owner = "client!fa", name = "F", descriptor = "[I")
	public static int[] anIntArray174;

	@OriginalMember(owner = "client!fa", name = "K", descriptor = "I")
	public static int anInt1764;

	@OriginalMember(owner = "client!fa", name = "U", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray2;

	@OriginalMember(owner = "client!fa", name = "x", descriptor = "I")
	public static int anInt1757 = 0;

	@OriginalMember(owner = "client!fa", name = "z", descriptor = "Lclient!ph;")
	public static final Class154 aClass154_27 = new Class154(8);

	@OriginalMember(owner = "client!fa", name = "B", descriptor = "Z")
	public static boolean aBoolean136 = false;

	@OriginalMember(owner = "client!fa", name = "L", descriptor = "I")
	public static volatile int anInt1765 = -1;

	@OriginalMember(owner = "client!fa", name = "M", descriptor = "I")
	public static int anInt1766 = 0;

	@OriginalMember(owner = "client!fa", name = "R", descriptor = "Z")
	public static boolean aBoolean137 = false;

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(IIIIIIBI)V")
	public static void method1461(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6) {
		@Pc(10) int local10 = arg5 + arg6;
		@Pc(15) int local15 = arg1 - arg6;
		for (@Pc(22) int local22 = arg5; local22 < local10; local22++) {
			Static182.method3394(arg2, Static30.anIntArrayArray10[local22], arg0, arg3);
		}
		@Pc(41) int local41 = arg3 - arg6;
		@Pc(45) int local45 = arg6 + arg2;
		for (@Pc(47) int local47 = arg1; local47 > local15; local47--) {
			Static182.method3394(arg2, Static30.anIntArrayArray10[local47], arg0, arg3);
		}
		for (@Pc(63) int local63 = local10; local63 <= local15; local63++) {
			@Pc(69) int[] local69 = Static30.anIntArrayArray10[local63];
			Static182.method3394(arg2, local69, arg0, local45);
			Static182.method3394(local45, local69, arg4, local41);
			Static182.method3394(local41, local69, arg0, arg3);
		}
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(IB)V")
	public static void method1462() {
		@Pc(1) Class154 local1 = Static46.aClass154_13;
		synchronized (Static46.aClass154_13) {
			Static46.aClass154_13.method4220(5);
		}
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(BII)B")
	public static byte method1463(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 == 9) {
			return (byte) ((arg1 & 0x1) == 0 ? 1 : 2);
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(Ljava/lang/String;I)Z")
	public static boolean method1465(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(16) int local16 = 0; local16 < Static173.anInt3827; local16++) {
			if (arg0.equalsIgnoreCase(Static36.aStringArray3[local16])) {
				return true;
			}
			if (arg0.equalsIgnoreCase(Static207.aStringArray34[local16])) {
				return true;
			}
		}
		return false;
	}
}
