import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static83 {

	@OriginalMember(owner = "client!cs", name = "f", descriptor = "I")
	public static int anInt1268;

	@OriginalMember(owner = "client!cs", name = "e", descriptor = "Lclient!mv;")
	public static final Class241 aClass241_21 = new Class241(86, 7);

	@OriginalMember(owner = "client!cs", name = "b", descriptor = "[S")
	public static short[] aShortArray35 = new short[256];

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(IIZII[Lclient!vo;)V")
	public static void method1220(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class381[] arg4) {
		for (@Pc(7) int local7 = 0; local7 < arg4.length; local7++) {
			@Pc(13) Class381 local13 = arg4[local7];
			if (local13 != null && arg1 == local13.anInt10079) {
				Static100.method1964(local13, arg2, arg0, arg3);
				Static409.method6271(arg3, arg0, local13);
				if (local13.anInt10100 - local13.anInt10159 < local13.anInt10136) {
					local13.anInt10136 = local13.anInt10100 - local13.anInt10159;
				}
				if (local13.anInt10142 - local13.anInt10131 < local13.anInt10141) {
					local13.anInt10141 = local13.anInt10142 - local13.anInt10131;
				}
				if (local13.anInt10136 < 0) {
					local13.anInt10136 = 0;
				}
				if (local13.anInt10141 < 0) {
					local13.anInt10141 = 0;
				}
				if (local13.anInt10156 == 0) {
					Static518.method7497(arg2, local13);
				}
			}
		}
	}
}
