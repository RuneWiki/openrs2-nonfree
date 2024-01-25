import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static89 {

	@OriginalMember(owner = "client!ct", name = "i", descriptor = "[I")
	public static final int[] anIntArray82 = new int[14];

	@OriginalMember(owner = "client!ct", name = "a", descriptor = "(BLclient!aia;)V")
	public static void method1565(@OriginalArg(1) Class15_Sub1 arg0) {
		arg0.aClass15_Sub3_Sub3_Sub1_1 = null;
		if (Static621.anInt10814 < 20) {
			Static102.aClass60_2.method1551(arg0);
			Static621.anInt10814++;
		}
	}

	@OriginalMember(owner = "client!ct", name = "a", descriptor = "(JIIBZ)Ljava/lang/String;")
	public static String method1567(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) boolean arg3) {
		@Pc(7) char local7 = ',';
		@Pc(15) char local15 = '.';
		if (arg1 == 0) {
			local7 = '.';
			local15 = ',';
		}
		if (arg1 == 2) {
			local15 = ' ';
		}
		@Pc(33) boolean local33 = false;
		if (arg0 < 0L) {
			arg0 = -arg0;
			local33 = true;
		}
		@Pc(49) StringBuffer local49 = new StringBuffer(26);
		@Pc(53) int local53;
		@Pc(58) int local58;
		if (arg2 > 0) {
			for (local53 = 0; local53 < arg2; local53++) {
				local58 = (int) arg0;
				arg0 /= 10L;
				local49.append((char) (local58 + 48 - (int) arg0 * 10));
			}
			local49.append(local7);
		}
		local53 = 0;
		while (true) {
			local58 = (int) arg0;
			arg0 /= 10L;
			local49.append((char) (local58 + 48 - (int) arg0 * 10));
			if (arg0 == 0L) {
				if (local33) {
					local49.append('-');
				}
				return local49.reverse().toString();
			}
			if (arg3) {
				local53++;
				if (local53 % 3 == 0) {
					local49.append(local15);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ct", name = "a", descriptor = "(Lclient!ha;IIIILclient!td;IIIIII)V")
	public static void method1568(@OriginalArg(0) Class101 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class2_Sub1_Sub19 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		if (arg6 < arg3 && arg3 < arg6 + arg8 && arg1 > arg2 - 13 && arg2 + 3 > arg1) {
			arg10 = arg4;
		}
		@Pc(43) String local43 = Static299.method4949(arg5);
		Static253.aClass59_5.method9571(local43, Static277.anIntArray597, Static251.aClass71Array25, arg2, arg6 + 3, arg10);
	}

	@OriginalMember(owner = "client!ct", name = "a", descriptor = "(BII)Z")
	public static boolean method1569(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x22) != 0;
	}
}
