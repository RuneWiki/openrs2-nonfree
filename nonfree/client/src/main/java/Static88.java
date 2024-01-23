import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static88 {

	@OriginalMember(owner = "client!gl", name = "e", descriptor = "J")
	public static long aLong249;

	@OriginalMember(owner = "client!gl", name = "i", descriptor = "[S")
	public static short[] aShortArray56;

	@OriginalMember(owner = "client!gl", name = "j", descriptor = "Lclient!jd;")
	public static Class84 aClass84_103;

	@OriginalMember(owner = "client!gl", name = "k", descriptor = "I")
	public static int anInt4713;

	@OriginalMember(owner = "client!gl", name = "b", descriptor = "Ljava/lang/String;")
	public static String aString235 = "Checking for updates - ";

	@OriginalMember(owner = "client!gl", name = "f", descriptor = "Lclient!wm;")
	public static Class2_Sub26 aClass2_Sub26_10 = new Class2_Sub26(new byte[5000]);

	@OriginalMember(owner = "client!gl", name = "g", descriptor = "J")
	public static long aLong250 = 0L;

	@OriginalMember(owner = "client!gl", name = "h", descriptor = "[I")
	public static int[] anIntArray393 = new int[] { 2, 2, 4, 0, 1, 8, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0 };

	@OriginalMember(owner = "client!gl", name = "l", descriptor = "Z")
	public static boolean aBoolean395 = false;

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(Lclient!th;I)V")
	public static void method3790(@OriginalArg(0) Class36_Sub3_Sub2 arg0) {
		@Pc(14) Class2_Sub23 local14 = (Class2_Sub23) Static259.aClass79_21.method2002(Static61.method2447(arg0.aString249));
		if (local14 == null) {
			return;
		}
		if (local14.aClass2_Sub5_Sub2_1 != null) {
			Static43.aClass2_Sub5_Sub1_1.method404(local14.aClass2_Sub5_Sub2_1);
			local14.aClass2_Sub5_Sub2_1 = null;
		}
		local14.method4926();
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(III)I")
	public static int method3791(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 == -2) {
			return 12345678;
		} else if (arg1 == -1) {
			if (arg0 < 2) {
				arg0 = 2;
			} else if (arg0 > 126) {
				arg0 = 126;
			}
			return arg0;
		} else {
			arg0 = (arg1 & 0x7F) * arg0 >> 7;
			if (arg0 < 2) {
				arg0 = 2;
			} else if (arg0 > 126) {
				arg0 = 126;
			}
			return (arg1 & 0xFF80) + arg0;
		}
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(ZB)I")
	public static int method3795(@OriginalArg(0) boolean arg0) {
		@Pc(8) long local8 = Static6.method126();
		for (@Pc(26) Class2_Sub17 local26 = arg0 ? (Class2_Sub17) Static9.aClass79_1.method1992() : (Class2_Sub17) Static9.aClass79_1.method1991(); local26 != null; local26 = (Class2_Sub17) Static9.aClass79_1.method1991()) {
			if ((local26.aLong175 & 0x3FFFFFFFFFFFFFFFL) < local8) {
				if ((local26.aLong175 & 0x4000000000000000L) != 0L) {
					@Pc(53) int local53 = (int) local26.aLong315;
					Static249.anIntArray446[local53] = Static171.anIntArray297[local53];
					local26.method4926();
					return local53;
				}
				local26.method4926();
			}
		}
		return -1;
	}
}
