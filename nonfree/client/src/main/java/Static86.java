import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static86 {

	@OriginalMember(owner = "client!cn", name = "c", descriptor = "Lclient!wm;")
	public static Class390 aClass390_16;

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(III)Z")
	public static boolean method1835(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x100100) != 0;
	}

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(IILclient!mea;IIB)V")
	public static void method1837(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class225 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg3 < 1 || arg4 < 1 || Static201.anInt3834 - 2 < arg3 || Static626.anInt10238 - 2 < arg4) {
			return;
		}
		if (Static635.aClass226ArrayArrayArray3 == null) {
			return;
		}
		@Pc(38) Interface1 local38 = Static373.aClass104_Sub1_2.method2593(arg0, arg3, arg1, arg4);
		if (local38 == null) {
			return;
		}
		if (local38 instanceof Class28_Sub1_Sub4_Sub1) {
			((Class28_Sub1_Sub4_Sub1) local38).method2204(arg2);
		} else if (local38 instanceof Class28_Sub1_Sub2_Sub1) {
			((Class28_Sub1_Sub2_Sub1) local38).method812(arg2);
		} else if (local38 instanceof Class28_Sub1_Sub5_Sub1) {
			((Class28_Sub1_Sub5_Sub1) local38).method5267(arg2);
		} else if (local38 instanceof Class28_Sub1_Sub3_Sub1) {
			((Class28_Sub1_Sub3_Sub1) local38).method7585(arg2);
		}
	}

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(IFIFIFFILclient!fc;IF)[B")
	public static byte[] method1838(@OriginalArg(1) float arg0, @OriginalArg(3) float arg1, @OriginalArg(5) float arg2, @OriginalArg(6) float arg3, @OriginalArg(8) Class34 arg4, @OriginalArg(10) float arg5) {
		@Pc(20) byte[] local20 = new byte[262144];
		Static71.method8031(local20, arg2, arg4, arg3, arg5, 0, arg1, arg0);
		return local20;
	}
}
