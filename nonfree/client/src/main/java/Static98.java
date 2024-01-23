import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static98 {

	@OriginalMember(owner = "client!hb", name = "q", descriptor = "F")
	public static float aFloat57;

	@OriginalMember(owner = "client!hb", name = "u", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray6;

	@OriginalMember(owner = "client!hb", name = "l", descriptor = "Ljava/lang/String;")
	public static String aString74 = "Hidden";

	@OriginalMember(owner = "client!hb", name = "n", descriptor = "Z")
	public static volatile boolean aBoolean113 = true;

	@OriginalMember(owner = "client!hb", name = "r", descriptor = "Lclient!ul;")
	public static Class172 aClass172_19 = new Class172(32);

	@OriginalMember(owner = "client!hb", name = "t", descriptor = "Ljava/lang/String;")
	public static String aString75 = "level: ";

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(IIIZIIII)V")
	public static void method1587(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(12) int local12 = arg1 - 334;
		@Pc(18) int local18 = 2048 - arg0 & 0x7FF;
		@Pc(20) int local20 = 0;
		@Pc(27) int local27 = 2048 - arg4 & 0x7FF;
		if (local12 < 0) {
			local12 = 0;
		} else if (local12 > 100) {
			local12 = 100;
		}
		@Pc(49) int local49 = local12 * (Static207.aShort15 - Static168.aShort26) / 100 + Static168.aShort26;
		@Pc(51) int local51 = 0;
		@Pc(57) int local57 = arg3 * local49 >> 8;
		@Pc(59) int local59 = local57;
		@Pc(68) int local68;
		@Pc(79) int local79;
		if (local18 != 0) {
			local68 = Class174.anIntArray444[local18];
			local51 = local68 * -local57 >> 16;
			local79 = Class174.anIntArray443[local18];
			local59 = local57 * local79 >> 16;
		}
		if (local27 != 0) {
			local68 = Class174.anIntArray444[local27];
			local20 = local59 * local68 >> 16;
			local79 = Class174.anIntArray443[local27];
			local59 = local79 * local59 >> 16;
		}
		Static71.anInt1457 = arg2 - local20;
		Static248.anInt4865 = arg6 - local59;
		Static254.anInt4974 = arg0;
		Static56.anInt1258 = arg4;
		Static153.anInt3111 = arg5 - local51;
	}
}
