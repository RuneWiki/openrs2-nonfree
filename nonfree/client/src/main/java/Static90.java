import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static90 {

	@OriginalMember(owner = "client!ff", name = "J", descriptor = "Z")
	public static boolean aBoolean129;

	@OriginalMember(owner = "client!ff", name = "P", descriptor = "[Lclient!ij;")
	public static Class107[] aClass107Array1;

	@OriginalMember(owner = "client!ff", name = "H", descriptor = "I")
	public static int anInt1727 = -50;

	@OriginalMember(owner = "client!ff", name = "N", descriptor = "J")
	public static long aLong66 = 0L;

	@OriginalMember(owner = "client!ff", name = "Q", descriptor = "I")
	public static int anInt1732 = 0;

	@OriginalMember(owner = "client!ff", name = "R", descriptor = "I")
	public static int anInt1733 = 1;

	@OriginalMember(owner = "client!ff", name = "d", descriptor = "(B)V")
	public static void method1686() {
		for (@Pc(15) Class2_Sub10_Sub10 local15 = (Class2_Sub10_Sub10) Static261.aClass30_37.method694(); local15 != null; local15 = (Class2_Sub10_Sub10) Static261.aClass30_37.method682()) {
			@Pc(20) Class1_Sub5_Sub6 local20 = local15.aClass1_Sub5_Sub6_1;
			if (local20.aBoolean447) {
				local15.method5617();
				local20.method5491();
			} else if (Static253.anInt4469 >= local20.anInt6330) {
				local20.method5492(Static64.anInt1278);
				if (local20.aBoolean447) {
					local15.method5617();
				} else {
					Static356.method5230(local20, true);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(IIIII)Z")
	public static boolean method1687(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if ((Static96.aByteArrayArrayArray8[0][arg3][arg0] & 0x2) != 0) {
			return true;
		} else if ((Static96.aByteArrayArrayArray8[arg2][arg3][arg0] & 0x10) == 0) {
			return Static111.method2291(arg0, arg2, arg3) == arg1;
		} else {
			return false;
		}
	}
}
