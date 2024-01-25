import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static90 {

	@OriginalMember(owner = "client!dh", name = "c", descriptor = "Lclient!jd;")
	public static final Class153 aClass153_13 = new Class153(6, 1);

	@OriginalMember(owner = "client!dh", name = "g", descriptor = "Z")
	public static boolean aBoolean718 = false;

	@OriginalMember(owner = "client!dh", name = "m", descriptor = "I")
	public static int anInt9289 = 0;

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(III)Z")
	public static boolean method7592(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Static263.method4410(arg1, arg0) | (arg1 & 0x10000) != 0 || Static585.method7760(arg1, arg0)) {
			return true;
		} else {
			return (arg0 & 0x37) == 0 && Static516.method7139(arg1, arg0);
		}
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(Lclient!ji;I)Lclient!oq;")
	public static Class18_Sub3_Sub1 method7595(@OriginalArg(0) Class6_Sub21 arg0) {
		@Pc(7) Class18_Sub3 local7 = Static531.method7231(arg0);
		@Pc(11) int local11 = arg0.method6058();
		return new Class18_Sub3_Sub1(local7.aClass319_12, local7.aClass247_12, local7.anInt6642, local7.anInt6646, local7.anInt6645, local7.anInt6643, local7.anInt6639, local7.anInt6641, local7.anInt6640, local7.anInt6647, local7.anInt6650, local7.anInt6652, local7.anInt6648, local7.anInt6656, local7.anInt6657, local11);
	}
}
