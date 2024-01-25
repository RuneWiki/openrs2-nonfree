import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static99 {

	@OriginalMember(owner = "client!es", name = "b", descriptor = "Lclient!jm;")
	public static final Class131 aClass131_56 = new Class131(79, -1);

	@OriginalMember(owner = "client!es", name = "a", descriptor = "(ILjava/lang/String;)Z")
	public static boolean method1539(@OriginalArg(1) String arg0) {
		return Static362.method4956(arg0);
	}

	@OriginalMember(owner = "client!es", name = "a", descriptor = "(IC)Z")
	public static boolean method1540(@OriginalArg(1) char arg0) {
		return arg0 == ' ' || arg0 == ' ' || arg0 == '_' || arg0 == '-';
	}

	@OriginalMember(owner = "client!es", name = "a", descriptor = "(IIZB)I")
	public static int method1541(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(12) Class1_Sub45 local12 = Static193.method906(arg2, arg1);
		if (local12 == null) {
			return 0;
		} else if (arg0 == -1) {
			return 0;
		} else {
			@Pc(24) int local24 = 0;
			for (@Pc(31) int local31 = 0; local31 < local12.anIntArray681.length; local31++) {
				if (local12.anIntArray680[local31] == arg0) {
					local24 += local12.anIntArray681[local31];
				}
			}
			return local24;
		}
	}
}
