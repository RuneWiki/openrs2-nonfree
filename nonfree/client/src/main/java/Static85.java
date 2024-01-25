import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static85 {

	@OriginalMember(owner = "client!fd", name = "b", descriptor = "Ljava/lang/String;")
	public static String aString19;

	@OriginalMember(owner = "client!fd", name = "c", descriptor = "Lclient!tq;")
	public static Class191 aClass191_53;

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "I")
	public static int anInt1831 = 0;

	@OriginalMember(owner = "client!fd", name = "e", descriptor = "I")
	public static int anInt1833 = 0;

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(III)Lclient!oj;")
	public static Class62_Sub2 method1907(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class8 local7 = Static275.aClass8ArrayArrayArray4[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		} else {
			@Pc(14) Class62_Sub2 local14 = local7.aClass62_Sub2_1;
			local7.aClass62_Sub2_1 = null;
			return local14;
		}
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(IBIII)Z")
	public static boolean method1908(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if ((Static313.aByteArrayArrayArray12[0][arg3][arg1] & 0x2) != 0) {
			return true;
		} else if ((Static313.aByteArrayArrayArray12[arg0][arg3][arg1] & 0x10) == 0) {
			return Static305.method5362(arg1, arg3, arg0) == arg2;
		} else {
			return false;
		}
	}
}
