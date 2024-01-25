import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static88 {

	@OriginalMember(owner = "client!daa", name = "r", descriptor = "Lclient!pj;")
	public static Class248 aClass248_15;

	@OriginalMember(owner = "client!daa", name = "a", descriptor = "(IBIIII)V")
	public static void method1369(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		Static119.anInt7222 = arg0;
		Static48.anInt8831 = arg1;
		Static478.anInt8411 = arg4;
		Static342.anInt6506 = arg3;
		Static531.anInt9137 = arg2;
		if (Static478.anInt8411 >= 100) {
			@Pc(32) int local32 = Static48.anInt8831 * 512 + 256;
			@Pc(38) int local38 = Static342.anInt6506 * 512 + 256;
			@Pc(47) int local47 = Static37.method631(local38, local32, Static391.anInt7128) - Static531.anInt9137;
			@Pc(51) int local51 = local32 - Static378.anInt6923;
			@Pc(56) int local56 = local47 - Static12.anInt183;
			@Pc(61) int local61 = local38 - Static208.anInt3949;
			@Pc(72) int local72 = (int) Math.sqrt((double) (local61 * local61 + local51 * local51));
			Static38.anInt742 = (int) (Math.atan2((double) local56, (double) local72) * 2607.5945876176133D) & 0x3FFF;
			Static232.anInt9865 = (int) (-2607.5945876176133D * Math.atan2((double) local51, (double) local61)) & 0x3FFF;
			Static463.anInt8184 = 0;
			if (Static38.anInt742 < 1024) {
				Static38.anInt742 = 1024;
			}
			if (Static38.anInt742 > 3072) {
				Static38.anInt742 = 3072;
			}
		}
		Static60.anInt1008 = 2;
	}
}
