import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static84 {

	@OriginalMember(owner = "client!ds", name = "e", descriptor = "I")
	public static int anInt2030;

	@OriginalMember(owner = "client!ds", name = "j", descriptor = "I")
	public static int anInt2035;

	@OriginalMember(owner = "client!ds", name = "k", descriptor = "[[[I")
	public static final int[][][] anIntArrayArrayArray2 = new int[2][][];

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(II)I")
	public static int method1522(@OriginalArg(1) int arg0) {
		return arg0 & 0x3FF;
	}
}
