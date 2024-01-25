import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static97 {

	@OriginalMember(owner = "client!dba", name = "a", descriptor = "Lclient!tq;")
	public static final Class340 aClass340_9 = new Class340(8);

	@OriginalMember(owner = "client!dba", name = "a", descriptor = "(III)Z")
	public static boolean method1947(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x18) != 0 | (arg1 & 0x220) == 544;
	}

	@OriginalMember(owner = "client!dba", name = "a", descriptor = "(IIIIII[II)Z")
	public static boolean method1948(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int[] arg5) {
		if (Static552.anInt9017 < arg2) {
			arg2 = Static552.anInt9017;
		}
		if (arg1 < 0) {
			arg1 = 0;
		}
		if (arg1 >= arg2) {
			return true;
		}
		arg0 += arg1 - 1;
		arg4 += arg3 * arg1;
		@Pc(48) int local48 = arg2 - arg1 >> 2;
		@Pc(61) int local61;
		@Pc(74) int local74;
		if (Static203.anInt3866 == 1) {
			Static383.anInt6814 += local48;
			while (true) {
				local48--;
				@Pc(59) int local59;
				if (local48 < 0) {
					local48 = arg2 - arg1 & 0x3;
					while (true) {
						local48--;
						if (local48 < 0) {
							return true;
						}
						local59 = ~arg4;
						arg0++;
						if (local59 > ~arg5[arg0]) {
							arg5[arg0] = arg4;
						}
						arg4 += arg3;
					}
				}
				local59 = ~arg4;
				local61 = arg0 + 1;
				if (local59 > ~arg5[local61]) {
					arg5[local61] = arg4;
				}
				local74 = arg4 + arg3;
				local61++;
				if (arg5[local61] > local74) {
					arg5[local61] = local74;
				}
				local74 += arg3;
				local61++;
				if (local74 < arg5[local61]) {
					arg5[local61] = local74;
				}
				local74 += arg3;
				arg0 = local61 + 1;
				if (arg5[arg0] > local74) {
					arg5[arg0] = local74;
				}
				arg4 = local74 + arg3;
			}
		} else {
			arg4 -= 38400;
			while (true) {
				local48--;
				if (local48 < 0) {
					local48 = arg2 - arg1 & 0x3;
					while (true) {
						local48--;
						if (local48 < 0) {
							return true;
						}
						arg0++;
						if (arg5[arg0] > arg4) {
							return false;
						}
						arg4 += arg3;
					}
				}
				local61 = arg0 + 1;
				if (arg5[local61] > arg4) {
					return false;
				}
				local74 = arg4 + arg3;
				local61++;
				if (arg5[local61] > local74) {
					return false;
				}
				local74 += arg3;
				local61++;
				if (arg5[local61] > local74) {
					return false;
				}
				local74 += arg3;
				arg0 = local61 + 1;
				if (local74 < arg5[arg0]) {
					return false;
				}
				arg4 = local74 + arg3;
			}
		}
	}
}
