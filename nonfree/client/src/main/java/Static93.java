import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static93 {

	@OriginalMember(owner = "client!dfa", name = "i", descriptor = "I")
	public static int anInt1564;

	@OriginalMember(owner = "client!dfa", name = "f", descriptor = "Lclient!mo;")
	public static Class241 aClass241_1;

	@OriginalMember(owner = "client!dfa", name = "d", descriptor = "[I")
	public static final int[] anIntArray87 = new int[13];

	@OriginalMember(owner = "client!dfa", name = "c", descriptor = "Lclient!vn;")
	public static final Class381 aClass381_48 = new Class381(35, 8);

	@OriginalMember(owner = "client!dfa", name = "k", descriptor = "[I")
	public static final int[] anIntArray88 = new int[3];

	@OriginalMember(owner = "client!dfa", name = "a", descriptor = "[I")
	public static final int[] anIntArray89 = new int[1];

	@OriginalMember(owner = "client!dfa", name = "a", descriptor = "(IIIIIIII)V")
	public static void method1469(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg3 == arg6) {
			Static447.method6378(arg4, arg3, arg1, arg0, arg2, arg5);
		} else if (arg2 - arg3 >= Static230.anInt3962 && arg2 + arg3 <= Static463.anInt7530 && Static573.anInt8986 <= arg0 - arg6 && arg6 + arg0 <= Static319.anInt5445) {
			Static348.method5142(arg0, arg3, arg6, arg5, arg1, arg4, arg2);
		} else {
			Static580.method7999(arg0, arg6, arg4, arg1, arg2, arg5, arg3);
		}
	}

	@OriginalMember(owner = "client!dfa", name = "a", descriptor = "(ZII)Lclient!li;")
	public static Class5_Sub31 method1470(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1) {
		@Pc(20) long local20 = (long) (arg1 | (arg0 ? Integer.MIN_VALUE : 0));
		return (Class5_Sub31) Static492.aClass306_35.method6943(local20);
	}

	@OriginalMember(owner = "client!dfa", name = "a", descriptor = "(IIIIIII)I")
	public static int method1471(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		@Pc(3) int local3 = arg5 & 0x3;
		if ((arg0 & 0x1) == 1) {
			@Pc(12) int local12 = arg4;
			arg4 = arg2;
			arg2 = local12;
		}
		if (local3 == 0) {
			return arg1;
		} else if (local3 == 1) {
			return 7 + 1 - arg3 - arg4;
		} else if (local3 == 2) {
			return 7 + 1 - arg1 - arg2;
		} else {
			return arg3;
		}
	}

	@OriginalMember(owner = "client!dfa", name = "a", descriptor = "(BLclient!ha;)V")
	public static void method1472(@OriginalArg(1) Class100 arg0) {
		for (@Pc(11) Class4_Sub9 local11 = (Class4_Sub9) Static618.aClass387_9.method9018(); local11 != null; local11 = (Class4_Sub9) Static618.aClass387_9.method9016()) {
			if (local11.aBoolean657) {
				local11.method8052(arg0);
			}
		}
	}

	@OriginalMember(owner = "client!dfa", name = "a", descriptor = "(BZI)I")
	public static int method1473(@OriginalArg(2) int arg0) {
		@Pc(15) Class5_Sub31 local15 = method1470(false, arg0);
		if (local15 == null) {
			return Static279.aClass347_1.method7721(arg0).anInt5648;
		}
		@Pc(26) int local26 = 0;
		for (@Pc(28) int local28 = 0; local28 < local15.anIntArray328.length; local28++) {
			if (local15.anIntArray328[local28] == -1) {
				local26++;
			}
		}
		if (-53 == -53) {
			return local26 + Static279.aClass347_1.method7721(arg0).anInt5648 - local15.anIntArray328.length;
		} else {
			return -27;
		}
	}
}
