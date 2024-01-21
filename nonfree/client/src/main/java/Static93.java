import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static93 {

	@OriginalMember(owner = "client!qc", name = "gb", descriptor = "[Lclient!qe;")
	public static Class4_Sub3_Sub6_Sub2[] aClass4_Sub3_Sub6_Sub2Array6;

	@OriginalMember(owner = "client!qc", name = "M", descriptor = "I")
	public static int anInt1800 = 0;

	@OriginalMember(owner = "client!qc", name = "O", descriptor = "I")
	public static int anInt1801 = 256;

	@OriginalMember(owner = "client!qc", name = "P", descriptor = "I")
	public static int anInt1802 = 0;

	@OriginalMember(owner = "client!qc", name = "Q", descriptor = "Lclient!od;")
	public static Class60 aClass60_732 = Static41.method597("shad");

	@OriginalMember(owner = "client!qc", name = "S", descriptor = "Lclient!od;")
	public static Class60 aClass60_733 = Static41.method597("lt");

	@OriginalMember(owner = "client!qc", name = "T", descriptor = "Lclient!od;")
	public static Class60 aClass60_734 = Static41.method597(")4str");

	@OriginalMember(owner = "client!qc", name = "U", descriptor = "Lclient!od;")
	public static Class60 aClass60_735 = Static41.method597("str");

	@OriginalMember(owner = "client!qc", name = "V", descriptor = "Lclient!od;")
	public static Class60 aClass60_736 = Static41.method597("br");

	@OriginalMember(owner = "client!qc", name = "W", descriptor = "Lclient!od;")
	public static Class60 aClass60_737 = Static41.method597(")4shad");

	@OriginalMember(owner = "client!qc", name = "Y", descriptor = "I")
	public static int anInt1803 = -1;

	@OriginalMember(owner = "client!qc", name = "ab", descriptor = "Ljava/util/Random;")
	public static Random aRandom2 = new Random();

	@OriginalMember(owner = "client!qc", name = "bb", descriptor = "Lclient!od;")
	public static Class60 aClass60_738 = Static41.method597("shad=");

	@OriginalMember(owner = "client!qc", name = "db", descriptor = "I")
	public static int anInt1804 = 0;

	@OriginalMember(owner = "client!qc", name = "eb", descriptor = "Lclient!od;")
	public static Class60 aClass60_739 = Static41.method597("u=");

	@OriginalMember(owner = "client!qc", name = "fb", descriptor = "I")
	public static int anInt1805 = -1;

	@OriginalMember(owner = "client!qc", name = "hb", descriptor = "Lclient!od;")
	public static Class60 aClass60_740 = Static41.method597("gt");

	@OriginalMember(owner = "client!qc", name = "lb", descriptor = "I")
	public static int anInt1807 = -1;

	@OriginalMember(owner = "client!qc", name = "nb", descriptor = "Lclient!od;")
	public static Class60 aClass60_741 = Static41.method597("str=");

	@OriginalMember(owner = "client!qc", name = "ob", descriptor = "Lclient!od;")
	public static Class60 aClass60_742 = Static41.method597("img=");

	@OriginalMember(owner = "client!qc", name = "pb", descriptor = "Lclient!od;")
	public static Class60 aClass60_743 = Static41.method597(")4u");

	@OriginalMember(owner = "client!qc", name = "qb", descriptor = "Lclient!od;")
	public static Class60 aClass60_744 = Static41.method597("u");

	@OriginalMember(owner = "client!qc", name = "rb", descriptor = "Lclient!od;")
	public static Class60 aClass60_745 = Static41.method597(")4col");

	@OriginalMember(owner = "client!qc", name = "sb", descriptor = "Lclient!od;")
	public static Class60 aClass60_746 = Static41.method597("col=");

	@OriginalMember(owner = "client!qc", name = "tb", descriptor = "I")
	public static int anInt1809 = -1;

	@OriginalMember(owner = "client!qc", name = "wb", descriptor = "I")
	public static int anInt1811 = 0;

	@OriginalMember(owner = "client!qc", name = "xb", descriptor = "[Lclient!od;")
	public static Class60[] aClass60Array11 = new Class60[100];

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(Lclient!od;)Lclient!od;")
	public static Class60 method1199(@OriginalArg(0) Class60 arg0) {
		@Pc(3) int local3 = arg0.method1345();
		@Pc(5) int local5 = 0;
		for (@Pc(7) int local7 = 0; local7 < local3; local7++) {
			@Pc(13) byte local13 = arg0.aByteArray21[local7];
			if (local13 == 60 || local13 == 62) {
				local5 += 3;
			}
		}
		@Pc(28) Class60 local28 = new Class60();
		local28.anInt1991 = local3 + local5;
		local28.aByteArray21 = new byte[local28.anInt1991];
		@Pc(40) int local40 = 0;
		for (@Pc(42) int local42 = 0; local42 < local3; local42++) {
			@Pc(48) byte local48 = arg0.aByteArray21[local42];
			if (local48 == 60) {
				local28.aByteArray21[local40++] = 60;
				local28.aByteArray21[local40++] = 108;
				local28.aByteArray21[local40++] = 116;
				local28.aByteArray21[local40++] = 62;
			} else if (local48 == 62) {
				local28.aByteArray21[local40++] = 60;
				local28.aByteArray21[local40++] = 103;
				local28.aByteArray21[local40++] = 116;
				local28.aByteArray21[local40++] = 62;
			} else {
				local28.aByteArray21[local40++] = local48;
			}
		}
		return local28;
	}

	@OriginalMember(owner = "client!qc", name = "b", descriptor = "([BIIIIII)V")
	public static void method1203(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(5) int local5 = arg1 + arg2 * Static34.anInt2345;
		@Pc(9) int local9 = Static34.anInt2345 - arg3;
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = 0;
		@Pc(20) int local20;
		if (arg2 < Static34.anInt2344) {
			local20 = Static34.anInt2344 - arg2;
			arg4 -= local20;
			arg2 = Static34.anInt2344;
			local13 = local20 * arg3;
			local5 += local20 * Static34.anInt2345;
		}
		if (arg2 + arg4 > Static34.anInt2347) {
			arg4 -= arg2 + arg4 - Static34.anInt2347;
		}
		if (arg1 < Static34.anInt2349) {
			local20 = Static34.anInt2349 - arg1;
			arg3 -= local20;
			arg1 = Static34.anInt2349;
			local13 += local20;
			local5 += local20;
			local11 = local20;
			local9 += local20;
		}
		if (arg1 + arg3 > Static34.anInt2346) {
			local20 = arg1 + arg3 - Static34.anInt2346;
			arg3 -= local20;
			local11 += local20;
			local9 += local20;
		}
		if (arg3 > 0 && arg4 > 0) {
			method1222(Static34.anIntArray298, arg0, arg5, local13, local5, arg3, arg4, local9, local11, arg6);
		}
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "([I[BIIIIIII)V")
	public static void method1211(@OriginalArg(0) int[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
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

	@OriginalMember(owner = "client!qc", name = "d", descriptor = "()V")
	public static void method1213() {
		aClass60_733 = null;
		aClass60_740 = null;
		aClass60_742 = null;
		aClass60_736 = null;
		aClass60_746 = null;
		aClass60_745 = null;
		aClass60_739 = null;
		aClass60_744 = null;
		aClass60_743 = null;
		aClass60_738 = null;
		aClass60_732 = null;
		aClass60_737 = null;
		aClass60_741 = null;
		aClass60_735 = null;
		aClass60_734 = null;
		aClass4_Sub3_Sub6_Sub2Array6 = null;
		aRandom2 = null;
		aClass60Array11 = null;
	}

	@OriginalMember(owner = "client!qc", name = "b", descriptor = "([BIIIII)V")
	public static void method1214(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(5) int local5 = arg1 + arg2 * Static34.anInt2345;
		@Pc(9) int local9 = Static34.anInt2345 - arg3;
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = 0;
		@Pc(20) int local20;
		if (arg2 < Static34.anInt2344) {
			local20 = Static34.anInt2344 - arg2;
			arg4 -= local20;
			arg2 = Static34.anInt2344;
			local13 = local20 * arg3;
			local5 += local20 * Static34.anInt2345;
		}
		if (arg2 + arg4 > Static34.anInt2347) {
			arg4 -= arg2 + arg4 - Static34.anInt2347;
		}
		if (arg1 < Static34.anInt2349) {
			local20 = Static34.anInt2349 - arg1;
			arg3 -= local20;
			arg1 = Static34.anInt2349;
			local13 += local20;
			local5 += local20;
			local11 = local20;
			local9 += local20;
		}
		if (arg1 + arg3 > Static34.anInt2346) {
			local20 = arg1 + arg3 - Static34.anInt2346;
			arg3 -= local20;
			local11 += local20;
			local9 += local20;
		}
		if (arg3 > 0 && arg4 > 0) {
			method1211(Static34.anIntArray298, arg0, arg5, local13, local5, arg3, arg4, local9, local11);
		}
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "([[B[[B[I[I[III)I")
	public static int method1221(@OriginalArg(0) byte[][] arg0, @OriginalArg(1) byte[][] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
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

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "([I[BIIIIIIII)V")
	public static void method1222(@OriginalArg(0) int[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
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
}
