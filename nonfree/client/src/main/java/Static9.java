import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static9 {

	@OriginalMember(owner = "client!al", name = "e", descriptor = "[Lclient!ug;")
	public static Class1_Sub2_Sub14[] aClass1_Sub2_Sub14Array1;

	@OriginalMember(owner = "client!al", name = "f", descriptor = "I")
	public static int anInt271;

	@OriginalMember(owner = "client!al", name = "h", descriptor = "I")
	public static int anInt273;

	@OriginalMember(owner = "client!al", name = "i", descriptor = "Ljava/awt/Canvas;")
	public static Canvas aCanvas1;

	@OriginalMember(owner = "client!al", name = "c", descriptor = "Lclient!md;")
	public static Class98 aClass98_1 = new Class98();

	@OriginalMember(owner = "client!al", name = "g", descriptor = "I")
	public static int anInt272 = 0;

	@OriginalMember(owner = "client!al", name = "k", descriptor = "Lclient!tl;")
	public static Class155 aClass155_2 = new Class155(50);

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(II)V")
	public static void method212(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) Class1_Sub14 local7 = Static132.aClass1_Sub14ArrayArrayArray2[0][arg0][arg1];
		for (@Pc(9) int local9 = 0; local9 < 3; local9++) {
			@Pc(30) Class1_Sub14 local30 = Static132.aClass1_Sub14ArrayArrayArray2[local9][arg0][arg1] = Static132.aClass1_Sub14ArrayArrayArray2[local9 + 1][arg0][arg1];
			if (local30 != null) {
				local30.anInt2334--;
				for (@Pc(40) int local40 = 0; local40 < local30.anInt2332; local40++) {
					@Pc(49) Class152 local49 = local30.aClass152Array1[local40];
					if ((local49.aLong181 >> 29 & 0x3L) == 2L && local49.anInt5509 == arg0 && local49.anInt5519 == arg1) {
						local49.anInt5515--;
					}
				}
			}
		}
		if (Static132.aClass1_Sub14ArrayArrayArray2[0][arg0][arg1] == null) {
			Static132.aClass1_Sub14ArrayArrayArray2[0][arg0][arg1] = new Class1_Sub14(0, arg0, arg1);
		}
		Static132.aClass1_Sub14ArrayArrayArray2[0][arg0][arg1].aClass1_Sub14_1 = local7;
		Static132.aClass1_Sub14ArrayArrayArray2[3][arg0][arg1] = null;
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(IIIZIII)V")
	public static void method213(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(7) Class81[] local7 = Static129.aClass81Array1;
		for (@Pc(9) int local9 = 0; local9 < local7.length; local9++) {
			@Pc(17) Class81 local17 = local7[local9];
			if (local17 != null && local17.anInt3022 == 2) {
				Static43.method943(local17.anInt3013 * 2, arg1, arg5 >> 1, arg0, local17.anInt3007 + (local17.anInt3012 - Static266.anInt5790 << 7), local17.anInt3006 + (local17.anInt3020 + -Static82.anInt1972 << 7), arg4 >> 1);
				if (Static22.anInt480 > -1 && Static32.anInt809 % 20 < 10) {
					Static215.aClass1_Sub2_Sub14Array15[local17.anInt3011].method2727(arg2 + Static22.anInt480 - 12, Static25.anInt512 + -28 + arg3);
				}
			}
		}
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(JZLjava/lang/String;IIZLjava/lang/String;IIIZ)V")
	public static void method214(@OriginalArg(0) long arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) String arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(10) boolean arg9) {
		@Pc(8) int[] local8 = new int[4];
		for (@Pc(14) int local14 = 0; local14 < 3; local14++) {
			local8[local14] = (int) (Math.random() * 9.9999999E7D);
		}
		@Pc(32) Class1_Sub16 local32 = new Class1_Sub16(128);
		local32.method2621(10);
		local32.method2624((arg1 ? 4 : 0) | (arg9 ? 2 : 0) | (arg5 ? 1 : 0));
		local32.method2631(arg0);
		local32.method2606(local8[0]);
		local32.method2630(arg6);
		local32.method2606(local8[1]);
		local32.method2624(Static178.anInt4015);
		local32.method2621(arg8);
		local32.method2621(arg4);
		local32.method2606(local8[2]);
		local32.method2624(arg3);
		local32.method2624(arg7);
		local32.method2606(local8[3]);
		local32.method2604(Static270.aBigInteger2, Static135.aBigInteger1);
		@Pc(118) Class1_Sub16 local118 = new Class1_Sub16(350);
		local118.method2630(arg2);
		@Pc(131) int local131 = 8 - Static224.method3926(arg2) % 8;
		for (@Pc(133) int local133 = 0; local133 < local131; local133++) {
			local118.method2621((int) (Math.random() * 255.0D));
		}
		local118.method2636(local8);
		Static81.aClass1_Sub16_Sub1_1.anInt3328 = 0;
		Static81.aClass1_Sub16_Sub1_1.method2621(22);
		Static81.aClass1_Sub16_Sub1_1.method2624(local32.anInt3328 + local118.anInt3328 + 2);
		Static81.aClass1_Sub16_Sub1_1.method2624(545);
		Static81.aClass1_Sub16_Sub1_1.method2623(local32.anInt3328, local32.aByteArray39);
		Static81.aClass1_Sub16_Sub1_1.method2623(local118.anInt3328, local118.aByteArray39);
		Static110.anInt2378 = 0;
		Static174.anInt3970 = -3;
		Static25.anInt507 = 1;
		Static57.anInt1510 = 0;
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(I)Z")
	public static boolean method215() {
		try {
			if (Static115.anInt2536 == 2) {
				if (Static251.aClass1_Sub31_2 == null) {
					Static251.aClass1_Sub31_2 = Static310.method4181(Static293.aClass83_203, Static57.anInt1509, Static167.anInt3813);
					if (Static251.aClass1_Sub31_2 == null) {
						return false;
					}
				}
				if (Static8.aClass39_2 == null) {
					Static8.aClass39_2 = new Class39(Static20.aClass83_177, Static284.aClass83_197);
				}
				if (Static141.aClass1_Sub3_Sub2_2.method1010(Static8.aClass39_2, Static285.aClass83_198, Static251.aClass1_Sub31_2)) {
					Static141.aClass1_Sub3_Sub2_2.method1006();
					Static141.aClass1_Sub3_Sub2_2.method985(Static66.anInt3701);
					Static141.aClass1_Sub3_Sub2_2.method979(Static282.aBoolean321, Static251.aClass1_Sub31_2);
					Static115.anInt2536 = 0;
					Static251.aClass1_Sub31_2 = null;
					Static293.aClass83_203 = null;
					Static8.aClass39_2 = null;
					return true;
				}
			}
		} catch (@Pc(73) Exception local73) {
			local73.printStackTrace();
			Static141.aClass1_Sub3_Sub2_2.method987();
			Static293.aClass83_203 = null;
			Static8.aClass39_2 = null;
			Static251.aClass1_Sub31_2 = null;
			Static115.anInt2536 = 0;
		}
		return false;
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(B)V")
	public static void method217() {
		Static111.anInt2390 = 0;
		Static146.anInt3487 = 0;
		Static126.method2149();
		Static257.method4356();
		Static192.method3414();
		Static232.method4054();
		@Pc(24) int local24;
		for (local24 = 0; local24 < Static146.anInt3487; local24++) {
			@Pc(35) int local35 = Static226.anIntArray516[local24];
			if (Static32.anInt809 != Static271.aClass25_Sub1_Sub1Array1[local35].anInt1658) {
				if (Static271.aClass25_Sub1_Sub1Array1[local35].anInt712 > 0) {
					Static253.method4313(Static271.aClass25_Sub1_Sub1Array1[local35]);
				}
				Static271.aClass25_Sub1_Sub1Array1[local35] = null;
			}
		}
		if (Static222.aClass1_Sub16_Sub1_3.anInt3328 != Static5.anInt141) {
			throw new RuntimeException("gpp1 pos:" + Static222.aClass1_Sub16_Sub1_3.anInt3328 + " psize:" + Static5.anInt141);
		}
		for (local24 = 0; local24 < Static266.anInt5789; local24++) {
			if (Static271.aClass25_Sub1_Sub1Array1[Static39.anIntArray108[local24]] == null) {
				throw new RuntimeException("gpp2 pos:" + local24 + " size:" + Static266.anInt5789);
			}
		}
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(Lclient!c;B)V")
	public static void method218(@OriginalArg(0) Class25_Sub1_Sub1 arg0) {
		@Pc(12) Class1_Sub5 local12 = (Class1_Sub5) Static156.aClass117_13.method3438(Static94.method4774(arg0.aString26));
		if (local12 == null) {
			Static283.method4671(arg0.anIntArray172[0], arg0, Static145.anInt3477, null, arg0.anIntArray173[0], 0, null);
		} else {
			local12.method926();
		}
	}
}
