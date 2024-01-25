import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static99 {

	@OriginalMember(owner = "client!em", name = "L", descriptor = "I")
	public static int anInt1890;

	@OriginalMember(owner = "client!em", name = "N", descriptor = "I")
	public static int anInt1891;

	@OriginalMember(owner = "client!em", name = "C", descriptor = "Z")
	public static final boolean aBoolean133 = false;

	@OriginalMember(owner = "client!em", name = "E", descriptor = "Lclient!sn;")
	public static final Class225 aClass225_5 = new Class225(12, 7);

	@OriginalMember(owner = "client!em", name = "M", descriptor = "[I")
	public static final int[] anIntArray146 = new int[25];

	@OriginalMember(owner = "client!em", name = "O", descriptor = "Lclient!de;")
	public static final Class50 aClass50_7 = new Class50(12, 0, 1, 0);

	@OriginalMember(owner = "client!em", name = "P", descriptor = "[I")
	public static final int[] anIntArray147 = new int[8];

	@OriginalMember(owner = "client!em", name = "b", descriptor = "(IB)I")
	public static int method1525(@OriginalArg(0) int arg0) {
		return arg0 & 0xFF;
	}
}
