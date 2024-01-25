import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static83 {

	@OriginalMember(owner = "client!er", name = "Q", descriptor = "[I")
	public static int[] anIntArray357;

	@OriginalMember(owner = "client!er", name = "W", descriptor = "[Lclient!ae;")
	public static Class4[] aClass4Array2;

	@OriginalMember(owner = "client!er", name = "N", descriptor = "Lclient!rc;")
	public static final Class205 aClass205_36 = new Class205(46, 8);

	@OriginalMember(owner = "client!er", name = "U", descriptor = "J")
	public static long aLong61 = -1L;

	@OriginalMember(owner = "client!er", name = "X", descriptor = "[I")
	public static final int[] anIntArray358 = new int[] { 2047, 16383, 65535 };

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(III)I")
	public static int method1260(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(16) int local16 = arg1 - 1 & arg0 >> 31;
		return (arg0 + (arg0 >>> 31)) % arg1 + local16;
	}
}
