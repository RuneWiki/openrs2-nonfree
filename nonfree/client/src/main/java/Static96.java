import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static96 {

	@OriginalMember(owner = "client!em", name = "a", descriptor = "I")
	public static int anInt2086;

	@OriginalMember(owner = "client!em", name = "b", descriptor = "Lclient!ui;")
	public static final Class242 aClass242_23 = new Class242("M", "M", "M", "M");

	@OriginalMember(owner = "client!em", name = "d", descriptor = "[I")
	public static final int[] anIntArray130 = new int[] { 32, 39, 44, 47 };

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(II)[B")
	public static synchronized byte[] method1569(@OriginalArg(1) int arg0) {
		@Pc(16) byte[] local16;
		if (arg0 == 100 && Static105.anInt2236 > 0) {
			local16 = Static174.aByteArrayArray4[--Static105.anInt2236];
			Static174.aByteArrayArray4[Static105.anInt2236] = null;
			return local16;
		} else if (arg0 == 5000 && Static205.anInt3905 > 0) {
			local16 = Static273.aByteArrayArray12[--Static205.anInt3905];
			Static273.aByteArrayArray12[Static205.anInt3905] = null;
			return local16;
		} else if (arg0 == 30000 && Static130.anInt2601 > 0) {
			local16 = Static430.aByteArrayArray18[--Static130.anInt2601];
			Static430.aByteArrayArray18[Static130.anInt2601] = null;
			return local16;
		} else {
			return new byte[arg0];
		}
	}
}
