import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static93 {

	@OriginalMember(owner = "client!en", name = "J", descriptor = "I")
	public static int anInt1873;

	@OriginalMember(owner = "client!en", name = "O", descriptor = "I")
	public static int anInt1878;

	@OriginalMember(owner = "client!en", name = "Y", descriptor = "I")
	public static int anInt1887;

	@OriginalMember(owner = "client!en", name = "R", descriptor = "I")
	public static int anInt1881 = 0;

	@OriginalMember(owner = "client!en", name = "W", descriptor = "[I")
	public static final int[] anIntArray152 = new int[] { 0, 4, 3, 3, 1, 1, 3, 5, 1, 5, 3, 6, 4 };

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(IIB)Z")
	public static boolean method1643(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x84080) != 0;
	}
}
