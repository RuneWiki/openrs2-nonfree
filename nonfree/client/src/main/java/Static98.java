import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static98 {

	@OriginalMember(owner = "client!dga", name = "N", descriptor = "[[B")
	public static byte[][] aByteArrayArray6;

	@OriginalMember(owner = "client!dga", name = "H", descriptor = "Lclient!uh;")
	public static final Class341 aClass341_28 = new Class341();

	@OriginalMember(owner = "client!dga", name = "M", descriptor = "Lclient!wu;")
	public static final Class379 aClass379_2 = new Class379(16);

	@OriginalMember(owner = "client!dga", name = "O", descriptor = "Lclient!mu;")
	public static final Class215 aClass215_34 = new Class215(83, 2);

	@OriginalMember(owner = "client!dga", name = "c", descriptor = "(II)I")
	public static int method2589(@OriginalArg(0) int arg0) {
		return arg0 & 0xFF;
	}

	@OriginalMember(owner = "client!dga", name = "a", descriptor = "(II[BI)[B")
	public static byte[] method2590(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) {
		@Pc(22) byte[] local22;
		if (arg0 > 0) {
			local22 = new byte[arg2];
			for (@Pc(24) int local24 = 0; local24 < arg2; local24++) {
				local22[local24] = arg1[arg0 + local24];
			}
		} else {
			local22 = arg1;
		}
		@Pc(50) Class191 local50 = new Class191();
		local50.method5513();
		local50.method5516((long) (arg2 * 8), local22);
		@Pc(66) byte[] local66 = new byte[64];
		local50.method5517(local66);
		return local66;
	}
}
