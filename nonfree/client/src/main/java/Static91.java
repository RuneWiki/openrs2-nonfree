import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static91 {

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "[Lclient!f;")
	public static Class76[] aClass76Array9;

	@OriginalMember(owner = "client!eh", name = "l", descriptor = "I")
	public static int anInt2066 = 0;

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(IIII)I")
	public static int method1528(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(3) int local3 = arg1 & 0x3;
		if (local3 == 0) {
			return arg0;
		} else if (local3 == 1) {
			return arg2;
		} else if (local3 == 2) {
			return 7 - arg0;
		} else {
			return 7 - arg2;
		}
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(BIIII)V")
	public static void method1530(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = arg3;
		@Pc(16) int local16 = -arg3;
		@Pc(18) int local18 = -1;
		@Pc(27) int local27 = Static440.method5950(arg1 + arg3, Static351.anInt6176, Static331.anInt5894);
		@Pc(35) int local35 = Static440.method5950(arg1 - arg3, Static351.anInt6176, Static331.anInt5894);
		Static49.method990(Static277.anIntArrayArray40[arg0], local27, local35, arg2);
		while (local13 > local11) {
			local18 += 2;
			local16 += local18;
			@Pc(66) int local66;
			@Pc(70) int local70;
			@Pc(85) int local85;
			@Pc(94) int local94;
			if (local16 > 0) {
				local13--;
				local16 -= local13 << 1;
				local66 = arg0 - local13;
				local70 = arg0 + local13;
				if (local70 >= Static75.anInt1858 && local66 <= Static175.anInt3399) {
					local85 = Static440.method5950(arg1 + local11, Static351.anInt6176, Static331.anInt5894);
					local94 = Static440.method5950(arg1 - local11, Static351.anInt6176, Static331.anInt5894);
					if (local70 <= Static175.anInt3399) {
						Static49.method990(Static277.anIntArrayArray40[local70], local85, local94, arg2);
					}
					if (local66 >= Static75.anInt1858) {
						Static49.method990(Static277.anIntArrayArray40[local66], local85, local94, arg2);
					}
				}
			}
			local11++;
			local66 = arg0 - local11;
			local70 = local11 + arg0;
			if (local70 >= Static75.anInt1858 && local66 <= Static175.anInt3399) {
				local85 = Static440.method5950(local13 + arg1, Static351.anInt6176, Static331.anInt5894);
				local94 = Static440.method5950(arg1 - local13, Static351.anInt6176, Static331.anInt5894);
				if (local70 <= Static175.anInt3399) {
					Static49.method990(Static277.anIntArrayArray40[local70], local85, local94, arg2);
				}
				if (local66 >= Static75.anInt1858) {
					Static49.method990(Static277.anIntArrayArray40[local66], local85, local94, arg2);
				}
			}
		}
	}
}
