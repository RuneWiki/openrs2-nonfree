import java.awt.Color;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static95 {

	@OriginalMember(owner = "client!dp", name = "v", descriptor = "Lclient!dr;")
	public static final Class73 aClass73_36 = new Class73(1, -1);

	@OriginalMember(owner = "client!dp", name = "z", descriptor = "[Ljava/awt/Color;")
	public static final Color[] aColorArray1 = new Color[] { new Color(9179409), new Color(3289650) };

	@OriginalMember(owner = "client!dp", name = "B", descriptor = "I")
	public static int anInt1825 = 0;

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(IIIIIII)I")
	public static int method1723(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(12) int local12 = arg4 & 0x3;
		if ((arg5 & 0x1) == 1) {
			@Pc(21) int local21 = arg2;
			arg2 = arg1;
			arg1 = local21;
		}
		if (local12 == 0) {
			return arg0;
		} else if (local12 == 1) {
			return 1 + 7 - arg2 - arg3;
		} else if (local12 == 2) {
			return 1 + 7 - arg1 - arg0;
		} else {
			return arg3;
		}
	}

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "([BIIIII)V")
	public static void method1725(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3) {
		if (arg3 <= arg2) {
			return;
		}
		@Pc(24) int local24 = arg3 - arg2 >> 2;
		arg1 += arg2;
		while (true) {
			local24--;
			if (local24 < 0) {
				local24 = arg3 - arg2 & 0x3;
				while (true) {
					local24--;
					if (local24 < 0) {
						return;
					}
					arg0[arg1++] = 1;
				}
			}
			@Pc(33) int local33 = arg1 + 1;
			arg0[arg1] = 1;
			@Pc(38) int local38 = local33 + 1;
			arg0[local33] = 1;
			@Pc(43) int local43 = local38 + 1;
			arg0[local38] = 1;
			arg1 = local43 + 1;
			arg0[local43] = 1;
		}
	}
}
