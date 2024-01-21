import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static83 {

	@OriginalMember(owner = "client!ob", name = "Y", descriptor = "[Lclient!ue;")
	public static Class4_Sub4_Sub5_Sub4[] aClass4_Sub4_Sub5_Sub4Array8;

	@OriginalMember(owner = "client!ob", name = "N", descriptor = "Lclient!v;")
	public static Class76 aClass76_793 = Static134.method2017(")4u");

	@OriginalMember(owner = "client!ob", name = "R", descriptor = "Lclient!v;")
	public static Class76 aClass76_794 = Static134.method2017("u");

	@OriginalMember(owner = "client!ob", name = "S", descriptor = "Lclient!v;")
	public static Class76 aClass76_795 = Static134.method2017("gt");

	@OriginalMember(owner = "client!ob", name = "T", descriptor = "Lclient!v;")
	public static Class76 aClass76_796 = Static134.method2017(")4shad");

	@OriginalMember(owner = "client!ob", name = "V", descriptor = "Ljava/util/Random;")
	public static Random aRandom2 = new Random();

	@OriginalMember(owner = "client!ob", name = "W", descriptor = "I")
	public static int anInt1861 = 256;

	@OriginalMember(owner = "client!ob", name = "Z", descriptor = "I")
	public static int anInt1863 = 0;

	@OriginalMember(owner = "client!ob", name = "ab", descriptor = "Lclient!v;")
	public static Class76 aClass76_797 = Static134.method2017("col=");

	@OriginalMember(owner = "client!ob", name = "bb", descriptor = "Lclient!v;")
	public static Class76 aClass76_798 = Static134.method2017("shad=");

	@OriginalMember(owner = "client!ob", name = "cb", descriptor = "Lclient!v;")
	public static Class76 aClass76_799 = Static134.method2017("u=");

	@OriginalMember(owner = "client!ob", name = "db", descriptor = "Lclient!v;")
	public static Class76 aClass76_800 = Static134.method2017("br");

	@OriginalMember(owner = "client!ob", name = "fb", descriptor = "Lclient!v;")
	public static Class76 aClass76_801 = Static134.method2017("shad");

	@OriginalMember(owner = "client!ob", name = "gb", descriptor = "I")
	public static int anInt1865 = 0;

	@OriginalMember(owner = "client!ob", name = "hb", descriptor = "I")
	public static int anInt1866 = -1;

	@OriginalMember(owner = "client!ob", name = "ib", descriptor = "I")
	public static int anInt1867 = -1;

	@OriginalMember(owner = "client!ob", name = "jb", descriptor = "Lclient!v;")
	public static Class76 aClass76_802 = Static134.method2017(")4str");

	@OriginalMember(owner = "client!ob", name = "kb", descriptor = "I")
	public static int anInt1868 = -1;

	@OriginalMember(owner = "client!ob", name = "lb", descriptor = "Lclient!v;")
	public static Class76 aClass76_803 = Static134.method2017("img=");

	@OriginalMember(owner = "client!ob", name = "mb", descriptor = "I")
	public static int anInt1869 = 0;

	@OriginalMember(owner = "client!ob", name = "nb", descriptor = "Lclient!v;")
	public static Class76 aClass76_804 = Static134.method2017(")4col");

	@OriginalMember(owner = "client!ob", name = "ob", descriptor = "I")
	public static int anInt1870 = 0;

	@OriginalMember(owner = "client!ob", name = "pb", descriptor = "Lclient!v;")
	public static Class76 aClass76_805 = Static134.method2017("str=");

	@OriginalMember(owner = "client!ob", name = "qb", descriptor = "Lclient!v;")
	public static Class76 aClass76_806 = Static134.method2017("lt");

	@OriginalMember(owner = "client!ob", name = "sb", descriptor = "Lclient!v;")
	public static Class76 aClass76_807 = Static134.method2017("str");

	@OriginalMember(owner = "client!ob", name = "ub", descriptor = "I")
	public static int anInt1872 = -1;

	@OriginalMember(owner = "client!ob", name = "xb", descriptor = "[Lclient!v;")
	public static Class76[] aClass76Array19 = new Class76[100];

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "([I[BIIIIIII)V")
	public static void method1309(@OriginalArg(0) int[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(4) int local4 = -(arg5 >> 2);
		@Pc(9) int local9 = -(arg5 & 0x3);
		for (@Pc(12) int local12 = -arg6; local12 < 0; local12++) {
			for (@Pc(15) int local15 = local4; local15 < 0; local15++) {
				if (arg1[arg3++] == 0) {
					arg4++;
				} else {
					arg0[arg4++] = arg2;
				}
				if (arg1[arg3++] == 0) {
					arg4++;
				} else {
					arg0[arg4++] = arg2;
				}
				if (arg1[arg3++] == 0) {
					arg4++;
				} else {
					arg0[arg4++] = arg2;
				}
				if (arg1[arg3++] == 0) {
					arg4++;
				} else {
					arg0[arg4++] = arg2;
				}
			}
			for (@Pc(69) int local69 = local9; local69 < 0; local69++) {
				if (arg1[arg3++] == 0) {
					arg4++;
				} else {
					arg0[arg4++] = arg2;
				}
			}
			arg4 += arg7;
			arg3 += arg8;
		}
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "([[B[[B[I[I[III)I")
	public static int method1312(@OriginalArg(0) byte[][] arg0, @OriginalArg(1) byte[][] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(3) int local3 = arg2[arg5];
		@Pc(9) int local9 = local3 + arg4[arg5];
		@Pc(13) int local13 = arg2[arg6];
		@Pc(19) int local19 = local13 + arg4[arg6];
		@Pc(21) int local21 = local3;
		if (local13 > local3) {
			local21 = local13;
		}
		@Pc(28) int local28 = local9;
		if (local19 < local9) {
			local28 = local19;
		}
		@Pc(37) int local37 = arg3[arg5];
		if (arg3[arg6] < local37) {
			local37 = arg3[arg6];
		}
		@Pc(50) byte[] local50 = arg1[arg5];
		@Pc(54) byte[] local54 = arg0[arg6];
		@Pc(58) int local58 = local21 - local3;
		@Pc(62) int local62 = local21 - local13;
		for (@Pc(64) int local64 = local21; local64 < local28; local64++) {
			@Pc(75) int local75 = local50[local58++] + local54[local62++];
			if (local75 < local37) {
				local37 = local75;
			}
		}
		return -local37;
	}

	@OriginalMember(owner = "client!ob", name = "d", descriptor = "()V")
	public static void method1319() {
		aClass76_806 = null;
		aClass76_795 = null;
		aClass76_803 = null;
		aClass76_800 = null;
		aClass76_797 = null;
		aClass76_804 = null;
		aClass76_799 = null;
		aClass76_794 = null;
		aClass76_793 = null;
		aClass76_798 = null;
		aClass76_801 = null;
		aClass76_796 = null;
		aClass76_805 = null;
		aClass76_807 = null;
		aClass76_802 = null;
		aClass4_Sub4_Sub5_Sub4Array8 = null;
		aRandom2 = null;
		aClass76Array19 = null;
	}

	@OriginalMember(owner = "client!ob", name = "b", descriptor = "([BIIIII)V")
	public static void method1325(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(5) int local5 = arg1 + arg2 * Static46.anInt2602;
		@Pc(9) int local9 = Static46.anInt2602 - arg3;
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = 0;
		@Pc(20) int local20;
		if (arg2 < Static46.anInt2603) {
			local20 = Static46.anInt2603 - arg2;
			arg4 -= local20;
			arg2 = Static46.anInt2603;
			local13 = local20 * arg3;
			local5 += local20 * Static46.anInt2602;
		}
		if (arg2 + arg4 > Static46.anInt2606) {
			arg4 -= arg2 + arg4 - Static46.anInt2606;
		}
		if (arg1 < Static46.anInt2605) {
			local20 = Static46.anInt2605 - arg1;
			arg3 -= local20;
			arg1 = Static46.anInt2605;
			local13 += local20;
			local5 += local20;
			local11 = local20;
			local9 += local20;
		}
		if (arg1 + arg3 > Static46.anInt2604) {
			local20 = arg1 + arg3 - Static46.anInt2604;
			arg3 -= local20;
			local11 += local20;
			local9 += local20;
		}
		if (arg3 > 0 && arg4 > 0) {
			method1309(Static46.anIntArray387, arg0, arg5, local13, local5, arg3, arg4, local9, local11);
		}
	}

	@OriginalMember(owner = "client!ob", name = "c", descriptor = "(Lclient!v;)Lclient!v;")
	public static Class76 method1328(@OriginalArg(0) Class76 arg0) {
		@Pc(3) int local3 = arg0.method1851();
		@Pc(5) int local5 = 0;
		for (@Pc(7) int local7 = 0; local7 < local3; local7++) {
			@Pc(13) byte local13 = arg0.aByteArray71[local7];
			if (local13 == 60 || local13 == 62) {
				local5 += 3;
			}
		}
		@Pc(28) Class76 local28 = new Class76();
		local28.anInt2668 = local3 + local5;
		local28.aByteArray71 = new byte[local28.anInt2668];
		@Pc(40) int local40 = 0;
		for (@Pc(42) int local42 = 0; local42 < local3; local42++) {
			@Pc(48) byte local48 = arg0.aByteArray71[local42];
			if (local48 == 60) {
				local28.aByteArray71[local40++] = 60;
				local28.aByteArray71[local40++] = 108;
				local28.aByteArray71[local40++] = 116;
				local28.aByteArray71[local40++] = 62;
			} else if (local48 == 62) {
				local28.aByteArray71[local40++] = 60;
				local28.aByteArray71[local40++] = 103;
				local28.aByteArray71[local40++] = 116;
				local28.aByteArray71[local40++] = 62;
			} else {
				local28.aByteArray71[local40++] = local48;
			}
		}
		return local28;
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "([I[BIIIIIIII)V")
	public static void method1330(@OriginalArg(0) int[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		@Pc(17) int local17 = ((arg2 & 0xFF00FF) * arg9 & 0xFF00FF00) + ((arg2 & 0xFF00) * arg9 & 0xFF0000) >> 8;
		@Pc(21) int local21 = 256 - arg9;
		for (@Pc(24) int local24 = -arg6; local24 < 0; local24++) {
			for (@Pc(28) int local28 = -arg5; local28 < 0; local28++) {
				if (arg1[arg3++] == 0) {
					arg4++;
				} else {
					@Pc(38) int local38 = arg0[arg4];
					arg0[arg4++] = (((local38 & 0xFF00FF) * local21 & 0xFF00FF00) + ((local38 & 0xFF00) * local21 & 0xFF0000) >> 8) + local17;
				}
			}
			arg4 += arg7;
			arg3 += arg8;
		}
	}

	@OriginalMember(owner = "client!ob", name = "b", descriptor = "([BIIIIII)V")
	public static void method1335(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(5) int local5 = arg1 + arg2 * Static46.anInt2602;
		@Pc(9) int local9 = Static46.anInt2602 - arg3;
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = 0;
		@Pc(20) int local20;
		if (arg2 < Static46.anInt2603) {
			local20 = Static46.anInt2603 - arg2;
			arg4 -= local20;
			arg2 = Static46.anInt2603;
			local13 = local20 * arg3;
			local5 += local20 * Static46.anInt2602;
		}
		if (arg2 + arg4 > Static46.anInt2606) {
			arg4 -= arg2 + arg4 - Static46.anInt2606;
		}
		if (arg1 < Static46.anInt2605) {
			local20 = Static46.anInt2605 - arg1;
			arg3 -= local20;
			arg1 = Static46.anInt2605;
			local13 += local20;
			local5 += local20;
			local11 = local20;
			local9 += local20;
		}
		if (arg1 + arg3 > Static46.anInt2604) {
			local20 = arg1 + arg3 - Static46.anInt2604;
			arg3 -= local20;
			local11 += local20;
			local9 += local20;
		}
		if (arg3 > 0 && arg4 > 0) {
			method1330(Static46.anIntArray387, arg0, arg5, local13, local5, arg3, arg4, local9, local11, arg6);
		}
	}
}
