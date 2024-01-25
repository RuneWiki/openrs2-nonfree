import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static99 {

	@OriginalMember(owner = "client!di", name = "b", descriptor = "Lclient!tm;")
	public static final Class337 aClass337_35 = new Class337(51, -2);

	@OriginalMember(owner = "client!di", name = "a", descriptor = "([BIILjava/lang/String;)I")
	public static int method1614(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2) {
		@Pc(10) int local10 = arg2.length();
		for (@Pc(12) int local12 = 0; local12 < local10; local12 += 4) {
			@Pc(20) int local20 = Static193.method7306(arg2.charAt(local12));
			@Pc(37) int local37 = local12 + 1 < local10 ? Static193.method7306(arg2.charAt(local12 + 1)) : -1;
			@Pc(56) int local56 = local12 + 2 >= local10 ? -1 : Static193.method7306(arg2.charAt(local12 + 2));
			@Pc(75) int local75 = local10 > local12 + 3 ? Static193.method7306(arg2.charAt(local12 + 3)) : -1;
			arg0[arg1++] = (byte) (local20 << 2 | local37 >>> 4);
			if (local56 == -1) {
				break;
			}
			arg0[arg1++] = (byte) ((local37 & 0xF) << 4 | local56 >>> 2);
			if (local75 == -1) {
				break;
			}
			arg0[arg1++] = (byte) (local75 | (local56 & 0x3) << 6);
		}
		return arg1;
	}
}
