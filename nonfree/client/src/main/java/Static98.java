import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static98 {

	@OriginalMember(owner = "client!dca", name = "E", descriptor = "[B")
	public static final byte[] aByteArray8 = new byte[2048];

	@OriginalMember(owner = "client!dca", name = "a", descriptor = "(Lclient!r;III[Z)V")
	public static void method1435(@OriginalArg(0) Class5_Sub5_Sub4 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean[] arg4) {
		if (Static242.aClass22Array3 == Static134.aClass22Array1) {
			return;
		}
		@Pc(10) int local10 = Static220.aClass22Array2[arg1].method8032(arg2, arg3);
		for (@Pc(12) int local12 = 0; local12 <= arg1; local12++) {
			if (arg4 == null || arg4[local12]) {
				@Pc(25) Class22 local25 = Static220.aClass22Array2[local12];
				if (local25 != null) {
					local25.wa(arg0, arg2, local10 - local25.method8032(arg2, arg3), arg3, 0, false);
				}
			}
		}
	}
}
