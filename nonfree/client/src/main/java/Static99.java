import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static99 {

	@OriginalMember(owner = "client!dja", name = "a", descriptor = "[Lclient!hk;")
	public static Class155[] aClass155Array4;

	@OriginalMember(owner = "client!dja", name = "k", descriptor = "Lclient!qr;")
	public static final Class306 aClass306_8 = new Class306(16);

	@OriginalMember(owner = "client!dja", name = "g", descriptor = "I")
	public static int anInt1643 = 0;

	@OriginalMember(owner = "client!dja", name = "a", descriptor = "(IIILjava/lang/Class;)V")
	public static void method1534(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class arg3) {
		@Pc(7) Class128 local7 = Static283.aClass128ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		for (@Pc(14) Class299 local14 = local7.aClass299_2; local14 != null; local14 = local14.aClass299_3) {
			@Pc(18) Class4_Sub1_Sub1 local18 = local14.aClass4_Sub1_Sub1_1;
			if (arg3.isAssignableFrom(local18.getClass()) && local18.aShort104 == arg1 && local18.aShort105 == arg2) {
				Static314.method4822(local18, false);
				return;
			}
		}
	}
}
