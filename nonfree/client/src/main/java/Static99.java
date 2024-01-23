import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static99 {

	@OriginalMember(owner = "client!gn", name = "l", descriptor = "Lclient!ca;")
	public static Class23 aClass23_1;

	@OriginalMember(owner = "client!gn", name = "d", descriptor = "I")
	public static int anInt2343 = 127;

	@OriginalMember(owner = "client!gn", name = "g", descriptor = "[[B")
	public static byte[][] aByteArrayArray6 = new byte[250][];

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(III)V")
	public static void method1706(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) Class44 local13 = Static121.aClass44ArrayArrayArray1[Static32.anInt876][arg0][arg1];
		if (local13 == null) {
			Static290.method4492(Static32.anInt876, arg0, arg1);
			return;
		}
		@Pc(24) int local24 = -99999999;
		@Pc(26) Class2_Sub8_Sub19 local26 = null;
		@Pc(31) Class2_Sub8_Sub19 local31;
		for (local31 = (Class2_Sub8_Sub19) local13.method1352(); local31 != null; local31 = (Class2_Sub8_Sub19) local13.method1360()) {
			@Pc(40) Class60 local40 = Static87.method1546(local31.aClass15_Sub1_1.anInt462);
			@Pc(43) int local43 = local40.anInt2233;
			if (local40.anInt2244 == 1) {
				local43 *= local31.aClass15_Sub1_1.anInt463 + 1;
			}
			if (local43 > local24) {
				local24 = local43;
				local26 = local31;
			}
		}
		if (local26 == null) {
			Static290.method4492(Static32.anInt876, arg0, arg1);
			return;
		}
		local13.method1355(local26);
		@Pc(92) Class15_Sub1 local92 = null;
		@Pc(94) Class15_Sub1 local94 = null;
		for (local31 = (Class2_Sub8_Sub19) local13.method1352(); local31 != null; local31 = (Class2_Sub8_Sub19) local13.method1360()) {
			@Pc(105) Class15_Sub1 local105 = local31.aClass15_Sub1_1;
			if (local26.aClass15_Sub1_1.anInt462 != local105.anInt462) {
				if (local92 == null) {
					local92 = local105;
				}
				if (local105.anInt462 != local92.anInt462 && local94 == null) {
					local94 = local105;
				}
			}
		}
		@Pc(148) long local148 = (long) (arg0 + (arg1 << 7) + 1610612736);
		Static209.method3505(Static32.anInt876, arg0, arg1, Static234.method3798(arg1 * 128 + 64, arg0 * 128 + 64, Static32.anInt876), local26.aClass15_Sub1_1, local148, local92, local94);
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(IZI)V")
	public static void method1708(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		Static296.aClass157_44 = new Class157(arg1);
		Static257.aClass157_41 = new Class157(arg0);
	}

	@OriginalMember(owner = "client!gn", name = "b", descriptor = "(III)V")
	public static void method1711(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) Class144 local7 = Static220.method3665(arg1);
		@Pc(10) int local10 = local7.anInt4650;
		@Pc(13) int local13 = local7.anInt4655;
		@Pc(16) int local16 = local7.anInt4657;
		@Pc(23) int local23 = Class146.anIntArray470[local16 - local13];
		if (arg0 < 0 || local23 < arg0) {
			arg0 = 0;
		}
		local23 <<= local13;
		Static47.method881(local10, local23 & arg0 << local13 | ~local23 & Static20.anIntArray55[local10]);
	}

	@OriginalMember(owner = "client!gn", name = "c", descriptor = "(I)V")
	public static void method1714() {
		if (Static28.aBoolean37) {
			Static263.aClass93_1 = null;
			Static119.aClass2_Sub8_Sub1_13 = null;
			Static28.aBoolean37 = false;
		}
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(IILclient!g;IIIII)V")
	public static void method1715(@OriginalArg(1) int arg0, @OriginalArg(2) Class56 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (Static142.aBoolean218) {
			Static209.anInt4309 = 32;
		} else {
			Static209.anInt4309 = 0;
		}
		Static142.aBoolean218 = false;
		@Pc(134) int local134;
		if (Static307.anInt5933 != 0) {
			if (arg5 <= arg4 && arg5 + 16 > arg4 && arg2 >= arg0 && arg2 < arg0 + 16) {
				arg1.anInt2039 -= 4;
				Static287.method4466(arg1);
			} else if (arg5 <= arg4 && arg5 + 16 > arg4 && arg3 + arg0 - 16 <= arg2 && arg0 + arg3 > arg2) {
				arg1.anInt2039 += 4;
				Static287.method4466(arg1);
			} else if (arg5 - Static209.anInt4309 <= arg4 && arg5 + Static209.anInt4309 + 16 > arg4 && arg0 + 16 <= arg2 && arg2 < arg0 + arg3 - 16) {
				local134 = arg3 * (arg3 - 32) / arg6;
				if (local134 < 8) {
					local134 = 8;
				}
				@Pc(151) int local151 = arg2 - arg0 - local134 / 2 - 16;
				@Pc(158) int local158 = arg3 - local134 - 32;
				arg1.anInt2039 = local151 * (arg6 - arg3) / local158;
				Static287.method4466(arg1);
				Static142.aBoolean218 = true;
			}
		}
		if (Static55.anInt1397 == 0) {
			return;
		}
		local134 = arg1.anInt2057;
		if (arg5 - local134 <= arg4 && arg2 >= arg0 && arg4 < arg5 + 16 && arg3 + arg0 >= arg2) {
			arg1.anInt2039 += Static55.anInt1397 * 45;
			Static287.method4466(arg1);
		}
	}
}
