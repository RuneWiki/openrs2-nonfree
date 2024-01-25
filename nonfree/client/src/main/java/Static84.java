import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static84 {

	@OriginalMember(owner = "client!dt", name = "B", descriptor = "Lclient!jp;")
	public static final Class129 aClass129_40 = new Class129(85, 4);

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "(IIZII)V")
	public static void method1237(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(8) Class5_Sub2_Sub9 local8 = Static72.method1073(4, arg1);
		local8.method3026();
		local8.anInt3821 = arg2;
		local8.anInt3826 = arg0;
		local8.anInt3818 = arg3;
	}

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "(ILjava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;II)V")
	public static void method1238(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2, @OriginalArg(4) String arg3, @OriginalArg(5) String arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		for (@Pc(8) int local8 = 99; local8 > 0; local8--) {
			Static243.anIntArray251[local8] = Static243.anIntArray251[local8 - 1];
			Static178.anIntArray404[local8] = Static178.anIntArray404[local8 - 1];
			Static338.aStringArray37[local8] = Static338.aStringArray37[local8 - 1];
			Static229.aStringArray28[local8] = Static229.aStringArray28[local8 - 1];
			Static366.aStringArray42[local8] = Static366.aStringArray42[local8 - 1];
			Static265.aStringArray32[local8] = Static265.aStringArray32[local8 - 1];
			Static127.anIntArray124[local8] = Static127.anIntArray124[local8 - 1];
		}
		Static243.anIntArray251[0] = arg6;
		Static338.aStringArray37[0] = arg0;
		Static178.anIntArray404[0] = arg1;
		Static229.aStringArray28[0] = arg4;
		Static366.aStringArray42[0] = arg3;
		Static186.anInt3149 = Static319.anInt4969;
		Static127.anIntArray124[0] = arg5;
		Static310.anInt4816++;
		Static265.aStringArray32[0] = arg2;
	}

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "(BLclient!dk;ZLclient!dk;I)I")
	public static int method1239(@OriginalArg(1) Class50_Sub1 arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) Class50_Sub1 arg2, @OriginalArg(4) int arg3) {
		@Pc(9) int local9;
		@Pc(12) int local12;
		if (arg3 == 1) {
			local9 = arg0.anInt1383;
			local12 = arg2.anInt1383;
			if (!arg1) {
				if (local12 == -1) {
					local12 = 2001;
				}
				if (local9 == -1) {
					local9 = 2001;
				}
			}
			return local9 - local12;
		} else if (arg3 == 2) {
			return Static328.method6026(arg2.method1134().aString43, arg0.method1134().aString43, Static38.anInt4834);
		} else if (arg3 == 3) {
			if (arg0.aString7.equals("-")) {
				if (arg2.aString7.equals("-")) {
					return 0;
				} else if (arg1) {
					return -1;
				} else {
					return 1;
				}
			} else if (arg2.aString7.equals("-")) {
				return arg1 ? 1 : -1;
			} else {
				return Static328.method6026(arg2.aString7, arg0.aString7, Static38.anInt4834);
			}
		} else if (arg3 == 4) {
			if (arg0.method1133()) {
				return arg2.method1133() ? 0 : 1;
			} else if (arg2.method1133()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg3 == 5) {
			if (arg0.method1127()) {
				return arg2.method1127() ? 0 : 1;
			} else if (arg2.method1127()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg3 == 6) {
			if (arg0.method1128()) {
				return arg2.method1128() ? 0 : 1;
			} else if (arg2.method1128()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg3 == 7) {
			if (arg0.method1130()) {
				return arg2.method1130() ? 0 : 1;
			} else if (arg2.method1130()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg3 == 8) {
			local9 = arg0.anInt1386;
			local12 = arg2.anInt1386;
			if (arg1) {
				if (local9 == 1000) {
					local9 = -1;
				}
				if (local12 == 1000) {
					local12 = -1;
				}
			} else {
				if (local9 == -1) {
					local9 = 1000;
				}
				if (local12 == -1) {
					local12 = 1000;
				}
			}
			return local9 - local12;
		} else {
			return arg0.anInt1389 - arg2.anInt1389;
		}
	}
}
