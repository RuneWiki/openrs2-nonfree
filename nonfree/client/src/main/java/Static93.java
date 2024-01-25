import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static93 {

	@OriginalMember(owner = "client!dga", name = "n", descriptor = "I")
	public static int anInt2344 = 0;

	@OriginalMember(owner = "client!dga", name = "a", descriptor = "(IB)Lclient!kd;")
	public static Class176 method1854(@OriginalArg(0) int arg0) {
		@Pc(8) Class176[] local8 = Static449.method6611();
		for (@Pc(15) int local15 = 0; local15 < local8.length; local15++) {
			@Pc(21) Class176 local21 = local8[local15];
			if (arg0 == local21.anInt5329) {
				return local21;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!dga", name = "a", descriptor = "(III)Z")
	public static boolean method1858(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return Static305.method4819(arg1, arg0) | (arg0 & 0x70000) != 0 || Static363.method5477(arg0, arg1);
	}

	@OriginalMember(owner = "client!dga", name = "a", descriptor = "(II)V")
	public static void method1863(@OriginalArg(1) int arg0) {
		@Pc(8) Class4_Sub6_Sub5 local8 = Static396.method6079(arg0, 11);
		local8.method2302();
	}
}
