import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static86 {

	@OriginalMember(owner = "client!fb", name = "G", descriptor = "Lclient!ir;")
	public static Class100 aClass100_86;

	@OriginalMember(owner = "client!fb", name = "V", descriptor = "I")
	public static int anInt4277;

	@OriginalMember(owner = "client!fb", name = "db", descriptor = "I")
	public static int anInt4285;

	@OriginalMember(owner = "client!fb", name = "B", descriptor = "[[B")
	public static final byte[][] aByteArrayArray15 = new byte[50][];

	@OriginalMember(owner = "client!fb", name = "k", descriptor = "(II)I")
	public static int method3645(@OriginalArg(1) int arg0) {
		return arg0 >>> 8;
	}
}
