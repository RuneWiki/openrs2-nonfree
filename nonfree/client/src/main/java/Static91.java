import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static91 {

	@OriginalMember(owner = "client!db", name = "A", descriptor = "[[B")
	public static byte[][] aByteArrayArray23;

	@OriginalMember(owner = "client!db", name = "F", descriptor = "[I")
	public static int[] anIntArray99;

	@OriginalMember(owner = "client!db", name = "p", descriptor = "Lclient!cda;")
	public static final Class47 aClass47_3 = new Class47("LIVE", 0);

	@OriginalMember(owner = "client!db", name = "z", descriptor = "Z")
	public static boolean aBoolean90 = false;

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(ZB)I")
	public static int method1163(@OriginalArg(0) boolean arg0) {
		@Pc(13) int local13 = Static469.anInt8256;
		if (local13 == 0) {
			return arg0 ? 0 : Static240.anInt4801;
		} else if (local13 == 1) {
			return Static240.anInt4801;
		} else if (local13 == 2) {
			return 0;
		} else {
			return 0;
		}
	}
}
