import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static87 {

	@OriginalMember(owner = "client!ej", name = "t", descriptor = "[[I")
	public static final int[][] anIntArrayArray13 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12, 12, 5 }, { 5, 5, 1, 1 }, { 5, 1, 1, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 12, 12, 12, 12, 12 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 3, 1, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 7, 3, 7 }, { 12, 12, 12, 12 } };

	@OriginalMember(owner = "client!ej", name = "eb", descriptor = "Lclient!di;")
	public static final Class54 aClass54_29 = new Class54(5, 7);

	@OriginalMember(owner = "client!ej", name = "rb", descriptor = "Lclient!di;")
	public static final Class54 aClass54_30 = new Class54(0, 7);

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(IIILclient!hm;Lclient!hm;)V")
	public static void method1703(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class3_Sub3 arg3, @OriginalArg(4) Class3_Sub3 arg4) {
		@Pc(4) Class106 local4 = Static292.method4206(arg0, arg1, arg2);
		if (local4 != null) {
			local4.aClass3_Sub3_1 = arg3;
			local4.aClass3_Sub3_2 = arg4;
		}
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(IB)V")
	public static void method1705(@OriginalArg(0) int arg0) {
		for (@Pc(15) Class2 local15 = Static157.aClass163_18.method3771(); local15 != null; local15 = Static157.aClass163_18.method3770()) {
			if ((long) arg0 == (local15.aLong227 >> 48 & 0xFFFFL)) {
				local15.method5866();
			}
		}
	}
}
