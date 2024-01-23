import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static89 {

	@OriginalMember(owner = "client!ib", name = "o", descriptor = "[I")
	public static int[] anIntArray154 = new int[10000];

	@OriginalMember(owner = "client!ib", name = "w", descriptor = "[I")
	public static int[] anIntArray156 = new int[10000];

	@OriginalMember(owner = "client!ib", name = "B", descriptor = "[I")
	public static int[] anIntArray158 = Class120.anIntArray492;

	@OriginalMember(owner = "client!ib", name = "P", descriptor = "I")
	public static int anInt1863 = 0;

	@OriginalMember(owner = "client!ib", name = "gb", descriptor = "[I")
	public static int[] anIntArray165 = Class120.anIntArray491;

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(Lclient!pa;II)Lclient!ib;")
	public static Class20_Sub4 method1399(@OriginalArg(0) Class86 arg0, @OriginalArg(1) int arg1) {
		@Pc(5) byte[] local5 = arg0.method3325(arg1, 0);
		return local5 == null ? null : new Class20_Sub4(local5);
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "([[III)I")
	public static int method1423(@OriginalArg(0) int[][] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(3) int local3 = arg1 >> 7;
		@Pc(7) int local7 = arg2 >> 7;
		if (local3 < 0 || local7 < 0 || local3 >= arg0.length || local7 >= arg0[0].length) {
			return 0;
		}
		@Pc(27) int local27 = arg1 & 0x7F;
		@Pc(31) int local31 = arg2 & 0x7F;
		@Pc(53) int local53 = arg0[local3][local7] * (128 - local27) + arg0[local3 + 1][local7] * local27 >> 7;
		@Pc(79) int local79 = arg0[local3][local7 + 1] * (128 - local27) + arg0[local3 + 1][local7 + 1] * local27 >> 7;
		return local53 * (128 - local31) + local79 * local31 >> 7;
	}
}
