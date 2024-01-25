import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static93 {

	@OriginalMember(owner = "client!dg", name = "f", descriptor = "I")
	public static int anInt2348;

	@OriginalMember(owner = "client!dg", name = "h", descriptor = "[I")
	public static int[] anIntArray79;

	@OriginalMember(owner = "client!dg", name = "d", descriptor = "Lclient!dca;")
	public static final Class65 aClass65_7 = new Class65();

	@OriginalMember(owner = "client!dg", name = "e", descriptor = "Lclient!hga;")
	public static final Class123 aClass123_69 = new Class123(100, 20);

	@OriginalMember(owner = "client!dg", name = "g", descriptor = "I")
	public static int anInt2349 = 0;

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(II)I")
	public static int method1989(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static155.aShortArrayArray2 == null ? 0 : Static155.aShortArrayArray2[arg0][arg1] & 0xFFFF;
	}
}
