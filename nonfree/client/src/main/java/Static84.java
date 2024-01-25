import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static84 {

	@OriginalMember(owner = "client!ej", name = "I", descriptor = "Lclient!j;")
	public static final Class113 aClass113_2 = new Class113(6, -1);

	@OriginalMember(owner = "client!ej", name = "O", descriptor = "I")
	public static int anInt1552 = 0;

	@OriginalMember(owner = "client!ej", name = "c", descriptor = "(II)I")
	public static int method1245(@OriginalArg(1) int arg0) {
		@Pc(5) int local5 = 0;
		if (arg0 < 0 || arg0 >= 65536) {
			local5 += 16;
			arg0 >>>= 0x10;
		}
		if (arg0 >= 256) {
			local5 += 8;
			arg0 >>>= 0x8;
		}
		if (arg0 >= 16) {
			arg0 >>>= 0x4;
			local5 += 4;
		}
		if (arg0 >= 4) {
			local5 += 2;
			arg0 >>>= 0x2;
		}
		if (arg0 >= 1) {
			arg0 >>>= 0x1;
			local5++;
		}
		return arg0 + local5;
	}

	@OriginalMember(owner = "client!ej", name = "b", descriptor = "(III)Lclient!je;")
	public static Class117 method1246(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) Class117 local7 = Static13.method107(arg0);
		if (arg1 == -1) {
			return local7;
		} else if (local7 == null || local7.aClass117Array1 == null || local7.aClass117Array1.length <= arg1) {
			return null;
		} else {
			return local7.aClass117Array1[arg1];
		}
	}
}
