import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static90 {

	@OriginalMember(owner = "client!dg", name = "gb", descriptor = "I")
	public static int anInt1932;

	@OriginalMember(owner = "client!dg", name = "Eb", descriptor = "I")
	public static int anInt1950;

	@OriginalMember(owner = "client!dg", name = "ob", descriptor = "[I")
	public static final int[] anIntArray100 = new int[] { 0, 1, 2, 3, 4, 5, 6, 14 };

	@OriginalMember(owner = "client!dg", name = "zb", descriptor = "I")
	public static int anInt1946 = 0;

	@OriginalMember(owner = "client!dg", name = "Cb", descriptor = "I")
	public static int anInt1949 = -1;

	@OriginalMember(owner = "client!dg", name = "b", descriptor = "(III)I")
	public static int method1416(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(14) int local14 = arg0 * 57 + arg1;
		@Pc(20) int local20 = local14 ^ local14 << 13;
		@Pc(34) int local34 = local20 * (local20 * local20 * 15731 + 789221) + 1376312589 & Integer.MAX_VALUE;
		return local34 >> 19 & 0xFF;
	}

	@OriginalMember(owner = "client!dg", name = "b", descriptor = "(I)[Lclient!rc;")
	public static Class279[] method1419() {
		return new Class279[] { Static385.aClass279_12, Static305.aClass279_10, Static504.aClass279_13 };
	}
}
