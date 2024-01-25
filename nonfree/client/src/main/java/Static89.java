import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static89 {

	@OriginalMember(owner = "client!da", name = "i", descriptor = "Lclient!sca;")
	public static Class302 aClass302_43 = null;

	@OriginalMember(owner = "client!da", name = "r", descriptor = "I")
	public static final int anInt6695 = 52;

	@OriginalMember(owner = "client!da", name = "s", descriptor = "I")
	public static final int anInt6696 = 4;

	@OriginalMember(owner = "client!da", name = "u", descriptor = "Lclient!qg;")
	public static final Class271 aClass271_14 = new Class271("game3", 2);

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIIIBI)V")
	public static void method5739(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		@Pc(11) int local11 = Static384.method6192(Static567.anInt9578, Static100.anInt10042, arg3);
		@Pc(17) int local17 = Static384.method6192(Static567.anInt9578, Static100.anInt10042, arg2);
		@Pc(23) int local23 = Static384.method6192(Static553.anInt9425, Static347.anInt6542, arg5);
		@Pc(37) int local37 = Static384.method6192(Static553.anInt9425, Static347.anInt6542, arg4);
		@Pc(46) int local46 = Static384.method6192(Static567.anInt9578, Static100.anInt10042, arg3 + arg1);
		@Pc(55) int local55 = Static384.method6192(Static567.anInt9578, Static100.anInt10042, arg2 - arg1);
		for (@Pc(57) int local57 = local11; local57 < local46; local57++) {
			Static312.method5228(arg0, Static484.anIntArrayArray41[local57], local37, local23);
		}
		for (@Pc(73) int local73 = local17; local73 > local55; local73--) {
			Static312.method5228(arg0, Static484.anIntArrayArray41[local73], local37, local23);
		}
		@Pc(95) int local95 = Static384.method6192(Static553.anInt9425, Static347.anInt6542, arg1 + arg5);
		@Pc(104) int local104 = Static384.method6192(Static553.anInt9425, Static347.anInt6542, arg4 - arg1);
		for (@Pc(106) int local106 = local46; local106 <= local55; local106++) {
			@Pc(112) int[] local112 = Static484.anIntArrayArray41[local106];
			Static312.method5228(arg0, local112, local95, local23);
			Static312.method5228(arg0, local112, local37, local104);
		}
	}
}
