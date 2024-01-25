import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static86 {

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(BIZI)V")
	public static void method7758(@OriginalArg(2) boolean arg0) {
		Static146.anInt3002 = 2;
		Static411.aBoolean570 = arg0;
		Static168.anInt3272 = 22050;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(ILjava/lang/String;I)Lclient!uf;")
	public static Class283 method7761(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class283 local8;
		try {
			local8 = (Class283) Class.forName("Class283_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(10) Throwable local10) {
			local8 = new Class283_Sub2();
		}
		local8.aString98 = arg0;
		local8.anInt9730 = arg1;
		return local8;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(III[IIIII)Z")
	public static boolean method7762(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (Static196.anInt3665 < arg0) {
			arg0 = Static196.anInt3665;
		}
		if (arg1 < 0) {
			arg1 = 0;
		}
		if (arg1 >= arg0) {
			return true;
		}
		@Pc(38) int local38 = arg0 - arg1 >> 2;
		arg5 += arg1 * arg4;
		arg3 += arg1 - 1;
		@Pc(88) int local88;
		@Pc(64) int local64;
		@Pc(73) int local73;
		if (Static438.anInt7599 == 1) {
			Static560.anInt9310 += local38;
			while (true) {
				local38--;
				if (local38 < 0) {
					local38 = arg0 - arg1 & 0x3;
					while (true) {
						local38--;
						if (local38 < 0) {
							return true;
						}
						arg3++;
						if (arg2[arg3] > arg5) {
							arg2[arg3] = arg5;
						}
						arg5 += arg4;
					}
				}
				local64 = arg3 + 1;
				if (arg2[local64] > arg5) {
					arg2[local64] = arg5;
				}
				local73 = arg5 + arg4;
				local64++;
				if (arg2[local64] > local73) {
					arg2[local64] = local73;
				}
				local73 += arg4;
				local64++;
				if (local73 < arg2[local64]) {
					arg2[local64] = local73;
				}
				local73 += arg4;
				local88 = ~local73;
				arg3 = local64 + 1;
				if (local88 > ~arg2[arg3]) {
					arg2[arg3] = local73;
				}
				arg5 = local73 + arg4;
			}
		} else {
			arg5 -= 38400;
			while (true) {
				local38--;
				if (local38 < 0) {
					local38 = arg0 - arg1 & 0x3;
					while (true) {
						local38--;
						if (local38 < 0) {
							return true;
						}
						local88 = ~arg5;
						arg3++;
						if (local88 > ~arg2[arg3]) {
							return false;
						}
						arg5 += arg4;
					}
				}
				local64 = arg3 + 1;
				if (arg5 < arg2[local64]) {
					return false;
				}
				local73 = arg5 + arg4;
				local64++;
				if (local73 < arg2[local64]) {
					return false;
				}
				local73 += arg4;
				local88 = ~local73;
				local64++;
				if (local88 > ~arg2[local64]) {
					return false;
				}
				local73 += arg4;
				arg3 = local64 + 1;
				if (local73 < arg2[arg3]) {
					return false;
				}
				arg5 = local73 + arg4;
			}
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(B)V")
	public static void method7763() {
		Static322.anInt6163 = 0;
		Static162.anInt3235 = -1;
		Static258.anInt5032 = -1;
		Static617.anInt9920 = -1;
	}
}
