import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static88 {

	@OriginalMember(owner = "client!fg", name = "X", descriptor = "Lclient!sg;")
	public static Class54 aClass54_2;

	@OriginalMember(owner = "client!fg", name = "Y", descriptor = "I")
	public static int anInt1650;

	@OriginalMember(owner = "client!fg", name = "Q", descriptor = "Z")
	public static boolean aBoolean116 = true;

	@OriginalMember(owner = "client!fg", name = "T", descriptor = "I")
	public static int anInt1648 = 0;

	@OriginalMember(owner = "client!fg", name = "U", descriptor = "Z")
	public static boolean aBoolean117 = false;

	@OriginalMember(owner = "client!fg", name = "W", descriptor = "[I")
	public static final int[] anIntArray137 = new int[250];

	@OriginalMember(owner = "client!fg", name = "Z", descriptor = "S")
	public static short aShort7 = 1;

	@OriginalMember(owner = "client!fg", name = "c", descriptor = "(III)I")
	public static int method1588(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(48) int local48 = Static47.method795(arg0 + 45365, arg1 + 91923, 4) + (Static47.method795(arg0 + 10294, arg1 + 37821, 2) + -128 >> 1) + (Static47.method795(arg0, arg1, 1) + -128 >> 2) - 128;
		local48 = (int) ((double) local48 * 0.3D) + 35;
		if (local48 < 10) {
			local48 = 10;
		} else if (local48 > 60) {
			local48 = 60;
		}
		return local48;
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(IIB)V")
	public static void method1589(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static289.aClass109_52 = new Class109(arg1);
		Static149.aClass109_34 = new Class109(arg0);
	}

	@OriginalMember(owner = "client!fg", name = "b", descriptor = "(Z)V")
	public static void method1590() {
		@Pc(9) Class109 local9 = Static72.aClass109_19;
		synchronized (Static72.aClass109_19) {
			Static72.aClass109_19.method2858();
		}
	}
}
