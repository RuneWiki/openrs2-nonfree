import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static83 {

	@OriginalMember(owner = "client!dba", name = "e", descriptor = "Z")
	public static boolean aBoolean193;

	@OriginalMember(owner = "client!dba", name = "h", descriptor = "Lclient!rn;")
	public static Class58 aClass58_2;

	@OriginalMember(owner = "client!dba", name = "k", descriptor = "Lclient!ep;")
	public static Class93 aClass93_3;

	@OriginalMember(owner = "client!dba", name = "i", descriptor = "Ljava/math/BigInteger;")
	public static final BigInteger aBigInteger2 = new BigInteger("973e3273ac195f263620286d8b0182b764456cc714421b1378712e771bbd4d83e19bcffce14e2f4ff02071a61a5165a7fe5e53fffab9a220ca5f58dd48c41e4f", 16);

	@OriginalMember(owner = "client!dba", name = "j", descriptor = "Lclient!kfa;")
	public static final Class181 aClass181_20 = new Class181(1, 8);

	@OriginalMember(owner = "client!dba", name = "l", descriptor = "[Lclient!vi;")
	public static final Class332[] aClass332Array2 = new Class332[8];

	@OriginalMember(owner = "client!dba", name = "m", descriptor = "J")
	public static long aLong43 = -1L;

	@OriginalMember(owner = "client!dba", name = "a", descriptor = "(IIIIIIIIIIILclient!oa;[[[B)V")
	public static void method1832(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) Class9 arg10, @OriginalArg(12) byte[][][] arg11) {
		if (arg4 == 0 || arg5 == 0) {
			return;
		}
		if (arg4 == 9) {
			arg4 = 1;
			arg9 = arg9 + 1 & 0x3;
		}
		if (arg4 == 10) {
			arg4 = 1;
			arg9 = arg9 + 3 & 0x3;
		}
		if (arg4 == 11) {
			arg9 = arg9 + 3 & 0x3;
			arg4 = 8;
		}
		arg10.ma(arg0, arg8, arg6, arg2, arg7, arg3, arg11[arg4 - 1][arg9], arg5, arg1);
	}

	@OriginalMember(owner = "client!dba", name = "a", descriptor = "(ILclient!le;IIIIIIIII)Z")
	public static boolean method1833(@OriginalArg(1) Class194 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(7) int local7 = arg7;
		@Pc(9) int local9 = arg2;
		@Pc(23) int local23 = arg7 - 64;
		@Pc(27) int local27 = arg2 - 64;
		Static4.anIntArrayArray1[64][64] = 99;
		Static221.anIntArrayArray32[64][64] = 0;
		@Pc(41) byte local41 = 0;
		@Pc(43) int local43 = 0;
		Static506.anIntArray794[0] = arg7;
		@Pc(50) int local50 = local41 + 1;
		Static88.anIntArray159[0] = arg2;
		@Pc(55) int[][] local55 = arg0.anIntArrayArray40;
		while (local43 != local50) {
			local7 = Static506.anIntArray794[local43];
			local9 = Static88.anIntArray159[local43];
			local43 = local43 + 1 & 0xFFF;
			@Pc(77) int local77 = local9 - arg0.anInt5584;
			@Pc(81) int local81 = local9 - local27;
			@Pc(85) int local85 = local7 - local23;
			@Pc(91) int local91 = local7 - arg0.anInt5598;
			if (arg5 == -4) {
				if (local7 == arg1 && arg3 == local9) {
					Static132.anInt9039 = local9;
					Static524.anInt9093 = local7;
					return true;
				}
			} else if (arg5 == -3) {
				if (Static515.method7172(1, arg3, arg8, local7, arg1, 1, local9, arg9)) {
					Static132.anInt9039 = local9;
					Static524.anInt9093 = local7;
					return true;
				}
			} else if (arg5 == -2) {
				if (arg0.method4799(1, arg6, arg1, arg9, local7, arg8, arg3, local9, 1)) {
					Static132.anInt9039 = local9;
					Static524.anInt9093 = local7;
					return true;
				}
			} else if (arg5 == -1) {
				if (arg0.method4808(arg6, arg3, local9, 1, arg9, local7, arg8, arg1)) {
					Static132.anInt9039 = local9;
					Static524.anInt9093 = local7;
					return true;
				}
			} else if (arg5 == 0 || arg5 == 1 || arg5 == 2 || arg5 == 3 || arg5 == 9) {
				if (arg0.method4807(arg1, arg3, local7, 1, arg5, local9, arg4)) {
					Static132.anInt9039 = local9;
					Static524.anInt9093 = local7;
					return true;
				}
			} else if (arg0.method4800(arg3, 1, arg5, local7, arg4, local9, arg1)) {
				Static132.anInt9039 = local9;
				Static524.anInt9093 = local7;
				return true;
			}
			@Pc(234) int local234 = Static221.anIntArrayArray32[local85][local81] + 1;
			if (local85 > 0 && Static4.anIntArrayArray1[local85 - 1][local81] == 0 && (local55[local91 - 1][local77] & 0x42240000) == 0) {
				Static506.anIntArray794[local50] = local7 - 1;
				Static88.anIntArray159[local50] = local9;
				local50 = local50 + 1 & 0xFFF;
				Static4.anIntArrayArray1[local85 - 1][local81] = 2;
				Static221.anIntArrayArray32[local85 - 1][local81] = local234;
			}
			if (local85 < 127 && Static4.anIntArrayArray1[local85 + 1][local81] == 0 && (local55[local91 + 1][local77] & 0x60240000) == 0) {
				Static506.anIntArray794[local50] = local7 + 1;
				Static88.anIntArray159[local50] = local9;
				Static4.anIntArrayArray1[local85 + 1][local81] = 8;
				local50 = local50 + 1 & 0xFFF;
				Static221.anIntArrayArray32[local85 + 1][local81] = local234;
			}
			if (local81 > 0 && Static4.anIntArrayArray1[local85][local81 - 1] == 0 && (local55[local91][local77 - 1] & 0x40A40000) == 0) {
				Static506.anIntArray794[local50] = local7;
				Static88.anIntArray159[local50] = local9 - 1;
				local50 = local50 + 1 & 0xFFF;
				Static4.anIntArrayArray1[local85][local81 - 1] = 1;
				Static221.anIntArrayArray32[local85][local81 - 1] = local234;
			}
			if (local81 < 127 && Static4.anIntArrayArray1[local85][local81 + 1] == 0 && (local55[local91][local77 + 1] & 0x48240000) == 0) {
				Static506.anIntArray794[local50] = local7;
				Static88.anIntArray159[local50] = local9 + 1;
				local50 = local50 + 1 & 0xFFF;
				Static4.anIntArrayArray1[local85][local81 + 1] = 4;
				Static221.anIntArrayArray32[local85][local81 + 1] = local234;
			}
			if (local85 > 0 && local81 > 0 && Static4.anIntArrayArray1[local85 - 1][local81 - 1] == 0 && (local55[local91 - 1][local77 - 1] & 0x43A40000) == 0 && (local55[local91 - 1][local77] & 0x42240000) == 0 && (local55[local91][local77 - 1] & 0x40A40000) == 0) {
				Static506.anIntArray794[local50] = local7 - 1;
				Static88.anIntArray159[local50] = local9 - 1;
				Static4.anIntArrayArray1[local85 - 1][local81 - 1] = 3;
				local50 = local50 + 1 & 0xFFF;
				Static221.anIntArrayArray32[local85 - 1][local81 - 1] = local234;
			}
			if (local85 < 127 && local81 > 0 && Static4.anIntArrayArray1[local85 + 1][local81 - 1] == 0 && (local55[local91 + 1][local77 - 1] & 0x60E40000) == 0 && (local55[local91 + 1][local77] & 0x60240000) == 0 && (local55[local91][local77 - 1] & 0x40A40000) == 0) {
				Static506.anIntArray794[local50] = local7 + 1;
				Static88.anIntArray159[local50] = local9 - 1;
				Static4.anIntArrayArray1[local85 + 1][local81 - 1] = 9;
				local50 = local50 + 1 & 0xFFF;
				Static221.anIntArrayArray32[local85 + 1][local81 - 1] = local234;
			}
			if (local85 > 0 && local81 < 127 && Static4.anIntArrayArray1[local85 - 1][local81 + 1] == 0 && (local55[local91 - 1][local77 + 1] & 0x4E240000) == 0 && (local55[local91 - 1][local77] & 0x42240000) == 0 && (local55[local91][local77 + 1] & 0x48240000) == 0) {
				Static506.anIntArray794[local50] = local7 - 1;
				Static88.anIntArray159[local50] = local9 + 1;
				local50 = local50 + 1 & 0xFFF;
				Static4.anIntArrayArray1[local85 - 1][local81 + 1] = 6;
				Static221.anIntArrayArray32[local85 - 1][local81 + 1] = local234;
			}
			if (local85 < 127 && local81 < 127 && Static4.anIntArrayArray1[local85 + 1][local81 + 1] == 0 && (local55[local91 + 1][local77 + 1] & 0x78240000) == 0 && (local55[local91 + 1][local77] & 0x60240000) == 0 && (local55[local91][local77 + 1] & 0x48240000) == 0) {
				Static506.anIntArray794[local50] = local7 + 1;
				Static88.anIntArray159[local50] = local9 + 1;
				local50 = local50 + 1 & 0xFFF;
				Static4.anIntArrayArray1[local85 + 1][local81 + 1] = 12;
				Static221.anIntArrayArray32[local85 + 1][local81 + 1] = local234;
			}
		}
		Static132.anInt9039 = local9;
		Static524.anInt9093 = local7;
		return false;
	}
}
