import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static92 {

	@OriginalMember(owner = "client!de", name = "e", descriptor = "[[Lclient!qk;")
	public static Class279[][] aClass279ArrayArray1;

	@OriginalMember(owner = "client!de", name = "g", descriptor = "Lclient!baa;")
	public static Class23 aClass23_1;

	@OriginalMember(owner = "client!de", name = "a", descriptor = "S")
	public static short aShort27 = 32767;

	@OriginalMember(owner = "client!de", name = "b", descriptor = "I")
	public static int anInt2193 = -1;

	@OriginalMember(owner = "client!de", name = "f", descriptor = "[Z")
	public static final boolean[] aBooleanArray6 = new boolean[8];

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(II[IIIIIB)Z")
	public static boolean method2078(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		if (arg3 < 0) {
			arg3 = 0;
		}
		if (arg4 > Static305.anInt5423) {
			arg4 = Static305.anInt5423;
		}
		if (arg4 <= arg3) {
			return true;
		}
		arg0 += arg1 * arg3;
		@Pc(44) int local44 = arg4 - arg3 >> 2;
		arg5 += arg3 - 1;
		@Pc(110) int local110;
		@Pc(75) int local75;
		@Pc(61) int local61;
		if (Static231.anInt4359 == 1) {
			Static127.anInt2678 += local44;
			while (true) {
				local44--;
				if (local44 < 0) {
					local44 = arg4 - arg3 & 0x3;
					while (true) {
						local44--;
						if (local44 < 0) {
							return true;
						}
						arg5++;
						if (arg2[arg5] > arg0) {
							arg2[arg5] = arg0;
						}
						arg0 += arg1;
					}
				}
				local61 = arg5 + 1;
				if (arg2[local61] > arg0) {
					arg2[local61] = arg0;
				}
				local75 = arg0 + arg1;
				local110 = ~local75;
				local61++;
				if (local110 > ~arg2[local61]) {
					arg2[local61] = local75;
				}
				local75 += arg1;
				local110 = ~local75;
				local61++;
				if (local110 > ~arg2[local61]) {
					arg2[local61] = local75;
				}
				local75 += arg1;
				arg5 = local61 + 1;
				if (local75 < arg2[arg5]) {
					arg2[arg5] = local75;
				}
				arg0 = local75 + arg1;
			}
		} else {
			arg0 -= 38400;
			while (true) {
				local44--;
				if (local44 < 0) {
					local44 = arg4 - arg3 & 0x3;
					while (true) {
						local44--;
						if (local44 < 0) {
							return true;
						}
						arg5++;
						if (arg0 < arg2[arg5]) {
							return false;
						}
						arg0 += arg1;
					}
				}
				local61 = arg5 + 1;
				if (arg2[local61] > arg0) {
					return false;
				}
				local75 = arg0 + arg1;
				local61++;
				if (arg2[local61] > local75) {
					return false;
				}
				local75 += arg1;
				local61++;
				if (arg2[local61] > local75) {
					return false;
				}
				local75 += arg1;
				local110 = ~local75;
				arg5 = local61 + 1;
				if (local110 > ~arg2[arg5]) {
					return false;
				}
				arg0 = local75 + arg1;
			}
		}
	}
}
