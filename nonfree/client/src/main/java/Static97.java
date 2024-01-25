import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static97 {

	@OriginalMember(owner = "client!dca", name = "a", descriptor = "I")
	public static int anInt1731;

	@OriginalMember(owner = "client!dca", name = "b", descriptor = "I")
	public static int anInt1732;

	@OriginalMember(owner = "client!dca", name = "e", descriptor = "I")
	public static int anInt1735;

	@OriginalMember(owner = "client!dca", name = "d", descriptor = "I")
	public static final int anInt1734 = 1338;

	@OriginalMember(owner = "client!dca", name = "a", descriptor = "(II[S)[S")
	public static short[] method1660(@OriginalArg(0) int arg0, @OriginalArg(2) short[] arg1) {
		@Pc(11) short[] local11 = new short[arg0];
		Static679.method4132(arg1, 0, local11, 0, arg0);
		return local11;
	}
}
