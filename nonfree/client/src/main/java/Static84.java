import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static84 {

	@OriginalMember(owner = "client!dg", name = "w", descriptor = "I")
	public static int anInt1836;

	@OriginalMember(owner = "client!dg", name = "B", descriptor = "Lclient!hb;")
	public static final Class117 aClass117_4 = new Class117(11, 3);

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(IIIIZ)Lclient!lc;")
	public static Class3_Sub29 method1741(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3) {
		@Pc(7) Class3_Sub29 local7 = new Class3_Sub29();
		local7.anInt5521 = arg2;
		local7.anInt5522 = arg0;
		Static156.aClass267_14.method6640(local7, (long) arg1);
		Static173.method3294(arg0);
		@Pc(30) Class245 local30 = Static46.method1005(arg1);
		if (local30 != null) {
			Static31.method809(local30);
		}
		if (Static140.aClass245_4 != null) {
			Static31.method809(Static140.aClass245_4);
			Static140.aClass245_4 = null;
		}
		Static34.method838();
		if (local30 != null) {
			Static264.method4639(!arg3, local30);
		}
		if (!arg3) {
			Static60.method1219(arg0);
		}
		if (!arg3 && Static422.anInt8667 != -1) {
			Static342.method5429(1, Static422.anInt8667);
		}
		return local7;
	}

	@OriginalMember(owner = "client!dg", name = "c", descriptor = "(B)Lclient!eba;")
	public static Class68_Sub1 method1744() {
		Static159.anInt3712 = 0;
		return Static97.method1903();
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(BI)Z")
	public static boolean method1745(@OriginalArg(0) byte arg0) {
		@Pc(12) int local12 = arg0 & 0xFF;
		if (local12 == 0) {
			return false;
		} else {
			return local12 < 128 || local12 >= 160 || Static81.aCharArray4[local12 - 128] != '\u0000';
		}
	}
}
