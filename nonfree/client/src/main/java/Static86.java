import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static86 {

	@OriginalMember(owner = "client!es", name = "ac", descriptor = "I")
	public static int anInt5376;

	@OriginalMember(owner = "client!es", name = "Yb", descriptor = "Lclient!cs;")
	public static final Class41 aClass41_162 = new Class41(46, 3);

	@OriginalMember(owner = "client!es", name = "a", descriptor = "(IIILjava/lang/Class;)Lclient!tq;")
	public static Class12_Sub1 method4712(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class arg3) {
		@Pc(7) Class227 local7 = Static297.aClass227ArrayArrayArray7[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		}
		for (@Pc(14) Class164 local14 = local7.aClass164_25; local14 != null; local14 = local14.aClass164_19) {
			@Pc(18) Class12_Sub1 local18 = local14.aClass12_Sub1_2;
			if (arg3.isAssignableFrom(local18.getClass()) && local18.aShort97 == arg1 && local18.aShort94 == arg2) {
				return local18;
			}
		}
		return null;
	}
}
