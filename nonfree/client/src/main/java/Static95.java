import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static95 {

	@OriginalMember(owner = "client!fh", name = "hd", descriptor = "Ljava/awt/Canvas;")
	public static Canvas aCanvas3;

	@OriginalMember(owner = "client!fh", name = "e", descriptor = "Lclient!nn;")
	public static final Class140 aClass140_46 = new Class140("Take", "Nehmen", "Prendre", "Pegar");

	@OriginalMember(owner = "client!fh", name = "cd", descriptor = "[Lclient!wn;")
	public static final Class1_Sub2_Sub3_Sub2[] aClass1_Sub2_Sub3_Sub2Array1 = new Class1_Sub2_Sub3_Sub2[32768];

	@OriginalMember(owner = "client!fh", name = "dd", descriptor = "I")
	public static final int anInt1911 = 0;

	@OriginalMember(owner = "client!fh", name = "fd", descriptor = "Lclient!wl;")
	public static final Class221 aClass221_74 = new Class221(32, 6);

	@OriginalMember(owner = "client!fh", name = "gd", descriptor = "[I")
	public static int[] anIntArray148 = new int[2];

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(ZII)Ljava/lang/String;")
	public static String method1862(@OriginalArg(2) int arg0) {
		return arg0 < 0 ? Integer.toString(arg0) : Static292.method4863(arg0);
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(IILclient!fh;Lclient!dr;I)V")
	public static void method1863(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class68 arg2, @OriginalArg(3) Class37 arg3) {
		@Pc(19) Class124 local19 = arg2.method1871(arg3);
		if (local19 == null) {
			return;
		}
		arg3.method3677(arg0, arg1, arg0 + arg2.anInt1874, arg2.anInt1845 + arg1);
		if (Static222.anInt6838 == 2 || Static222.anInt6838 == 5 || Static235.aClass46_16 == null) {
			arg3.method3731(local19, arg0, arg1);
			return;
		}
		@Pc(59) int local59;
		@Pc(61) int local61;
		@Pc(55) int local55;
		@Pc(57) int local57;
		if (Static135.anInt2910 == 4) {
			local55 = (int) -Static366.aFloat48 & 0x3FFF;
			local57 = 4096;
			local59 = Static118.anInt2492;
			local61 = Static362.anInt6967;
		} else {
			local57 = 4096 - Static267.anInt5561 * 16;
			local59 = Static177.aClass1_Sub2_Sub3_Sub1_1.anInt6893;
			local55 = Static85.anInt1601 + (int) -Static366.aFloat48 & 0x3FFF;
			local61 = Static177.aClass1_Sub2_Sub3_Sub1_1.anInt6888;
		}
		@Pc(97) int local97 = local59 / 32 + 48 - (Static66.anInt1177 - 104) * 2;
		@Pc(114) int local114 = Static12.anInt213 * 4 + 208 + 48 - Static12.anInt213 * 2 - local61 / 32;
		Static235.aClass46_16.method5027((float) arg0 + (float) arg2.anInt1874 / 2.0F, (float) arg1 + (float) arg2.anInt1845 / 2.0F, (float) local97, (float) local114, local57, local55 << 2, local19, arg0, arg1);
		@Pc(165) int local165;
		@Pc(174) int local174;
		@Pc(185) int local185;
		@Pc(196) int local196;
		for (@Pc(148) Class2_Sub23 local148 = (Class2_Sub23) Static268.aClass180_38.method4919(); local148 != null; local148 = (Class2_Sub23) Static268.aClass180_38.method4916()) {
			@Pc(153) int local153 = local148.anInt3818;
			local165 = (Static283.aClass194_3.anIntArray480[local153] >> 14 & 0x3FFF) - Static150.anInt3453;
			local174 = (Static283.aClass194_3.anIntArray480[local153] & 0x3FFF) - Static287.anInt5776;
			local185 = local165 * 4 + 2 - local59 / 32;
			local196 = local174 * 4 + 2 - local61 / 32;
			Static353.method5006(local196, Static283.aClass194_3.anIntArray479[local153], arg2, arg1, local19, arg0, local185, arg3);
		}
		for (local165 = 0; local165 < Static190.anInt6227; local165++) {
			local174 = Static18.anIntArray32[local165] * 4 + 2 - local59 / 32;
			local185 = Static292.anIntArray454[local165] * 4 + 2 - local61 / 32;
			@Pc(252) Class74 local252 = Static228.method4210(Static10.anIntArray24[local165]);
			if (local252.anIntArray161 != null) {
				local252 = local252.method1997();
				if (local252 == null || local252.anInt2055 == -1) {
					continue;
				}
			}
			Static353.method5006(local185, local252.anInt2055, arg2, arg1, local19, arg0, local174, arg3);
		}
		for (@Pc(287) Class2_Sub20 local287 = (Class2_Sub20) Static198.aClass41_24.method896(); local287 != null; local287 = (Class2_Sub20) Static198.aClass41_24.method904()) {
			local185 = (int) (local287.aLong219 >> 28 & 0x3L);
			if (Static148.anInt3213 == local185) {
				local196 = (int) (local287.aLong219 & 0x3FFFL) * 4 + 2 - local59 / 32;
				@Pc(336) int local336 = (int) (local287.aLong219 >> 14 & 0x3FFFL) * 4 + 2 - local61 / 32;
				Static343.method3355(Static41.aClass46Array43[0], local19, arg2, arg1, arg0, local196, local336);
			}
		}
		@Pc(409) int local409;
		for (local185 = 0; local185 < Static186.anInt4092; local185++) {
			@Pc(364) Class1_Sub2_Sub3_Sub2 local364 = aClass1_Sub2_Sub3_Sub2Array1[Static171.anIntArray292[local185]];
			if (local364 != null && local364.method5797() && local364.aByte77 == Static177.aClass1_Sub2_Sub3_Sub1_1.aByte77) {
				@Pc(382) Class139 local382 = local364.aClass139_1;
				if (local382 != null && local382.anIntArray350 != null) {
					local382 = local382.method4120();
				}
				if (local382 != null && local382.aBoolean417 && local382.aBoolean415) {
					local409 = local364.anInt6893 / 32 - local59 / 32;
					@Pc(419) int local419 = local364.anInt6888 / 32 - local61 / 32;
					if (local382.anInt4773 == -1) {
						Static343.method3355(Static41.aClass46Array43[1], local19, arg2, arg1, arg0, local409, local419);
					} else {
						Static353.method5006(local419, local382.anInt4773, arg2, arg1, local19, arg0, local409, arg3);
					}
				}
			}
		}
		local196 = Static9.anInt173;
		@Pc(459) int[] local459 = Static195.anIntArray322;
		@Pc(497) int local497;
		@Pc(506) int local506;
		@Pc(510) int local510;
		for (local409 = 0; local409 < local196; local409++) {
			@Pc(469) Class1_Sub2_Sub3_Sub1 local469 = Static164.aClass1_Sub2_Sub3_Sub1Array1[local459[local409]];
			if (local469 != null && local469.method2974() && local469 != Static177.aClass1_Sub2_Sub3_Sub1_1 && Static177.aClass1_Sub2_Sub3_Sub1_1.aByte77 == local469.aByte77) {
				local497 = local469.anInt6893 / 32 - local59 / 32;
				local506 = local469.anInt6888 / 32 - local61 / 32;
				@Pc(508) boolean local508 = false;
				for (local510 = 0; local510 < Static209.anInt6939; local510++) {
					if (local469.aString34.equals(Static190.aStringArray42[local510]) && Static219.anIntArray354[local510] != 0) {
						local508 = true;
						break;
					}
				}
				@Pc(533) boolean local533 = false;
				for (@Pc(535) int local535 = 0; local535 < Static210.anInt4592; local535++) {
					if (local469.aString34.equals(Static51.aClass210Array1[local535].aString72)) {
						local533 = true;
						break;
					}
				}
				@Pc(555) boolean local555 = false;
				if (Static177.aClass1_Sub2_Sub3_Sub1_1.anInt3401 != 0 && local469.anInt3401 != 0 && Static177.aClass1_Sub2_Sub3_Sub1_1.anInt3401 == local469.anInt3401) {
					local555 = true;
				}
				if (local508) {
					Static343.method3355(Static41.aClass46Array43[3], local19, arg2, arg1, arg0, local497, local506);
				} else if (local533) {
					Static343.method3355(Static41.aClass46Array43[5], local19, arg2, arg1, arg0, local497, local506);
				} else if (local555) {
					Static343.method3355(Static41.aClass46Array43[4], local19, arg2, arg1, arg0, local497, local506);
				} else {
					Static343.method3355(Static41.aClass46Array43[2], local19, arg2, arg1, arg0, local497, local506);
				}
			}
		}
		@Pc(637) Class52[] local637 = Static223.aClass52Array1;
		@Pc(728) int local728;
		for (local497 = 0; local497 < local637.length; local497++) {
			@Pc(645) Class52 local645 = local637[local497];
			if (local645 != null && local645.anInt1018 != 0 && Static6.anInt91 % 20 < 10) {
				@Pc(699) int local699;
				if (local645.anInt1018 == 1 && local645.anInt1012 >= 0 && aClass1_Sub2_Sub3_Sub2Array1.length > local645.anInt1012) {
					@Pc(678) Class1_Sub2_Sub3_Sub2 local678 = aClass1_Sub2_Sub3_Sub2Array1[local645.anInt1012];
					if (local678 != null) {
						local510 = local678.anInt6893 / 32 - local59 / 32;
						local699 = local678.anInt6888 / 32 - local61 / 32;
						Static11.method170(arg2, 360000, local19, arg0, arg1, local699, local645.anInt1017, local510);
					}
				}
				if (local645.anInt1018 == 2) {
					local728 = (local645.anInt1011 - Static150.anInt3453) * 4 + 2 - local59 / 32;
					local510 = (local645.anInt1022 - Static287.anInt5776) * 4 + 2 - local61 / 32;
					local699 = local645.anInt1023 * 4;
					local699 *= local699;
					Static11.method170(arg2, local699, local19, arg0, arg1, local510, local645.anInt1017, local728);
				}
				if (local645.anInt1018 == 10 && local645.anInt1012 >= 0 && local645.anInt1012 < Static164.aClass1_Sub2_Sub3_Sub1Array1.length) {
					@Pc(782) Class1_Sub2_Sub3_Sub1 local782 = Static164.aClass1_Sub2_Sub3_Sub1Array1[local645.anInt1012];
					if (local782 != null) {
						local510 = local782.anInt6893 / 32 - local59 / 32;
						local699 = local782.anInt6888 / 32 - local61 / 32;
						Static11.method170(arg2, 360000, local19, arg0, arg1, local699, local645.anInt1017, local510);
					}
				}
			}
		}
		if (Static135.anInt2910 == 4) {
			return;
		}
		if (Static57.anInt1013 != 0) {
			local506 = Static57.anInt1013 * 4 + Static177.aClass1_Sub2_Sub3_Sub1_1.method5787() * 2 + 2 - local59 / 32 - 2;
			local728 = Static360.anInt6858 * 4 + Static177.aClass1_Sub2_Sub3_Sub1_1.method5787() * 2 + 2 - local61 / 32 - 2;
			Static343.method3355(Static328.aClass46Array50[Static100.aBoolean187 ? 1 : 0], local19, arg2, arg1, arg0, local506, local728);
		}
		arg3.method3694(3, -1, 3, arg0 + arg2.anInt1874 / 2 - 1, arg2.anInt1845 / 2 + -1 + arg1);
		return;
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(IIBLclient!dr;ILclient!wp;IIIII)Lclient!wp;")
	public static Class49 method1867(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class37 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class49 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(14) long local14 = (long) arg3;
		@Pc(20) Class49 local20 = (Class49) Static165.aClass107_18.method3021(local14);
		if (local20 == null) {
			@Pc(30) Class111 local30 = Static309.method5155(arg3, Static302.aClass104_156);
			if (local30 == null) {
				return null;
			}
			local20 = arg2.method3667(local30, 1031, Static175.anInt3965, 64, 768);
			Static165.aClass107_18.method3018(local14, local20);
		}
		local20 = local20.method5810((byte) 2, 1031, true);
		if (arg5 != 0) {
			local20.method5857(arg5);
		}
		if (arg6 != 0) {
			local20.method5856(arg6);
		}
		if (arg8 != 0) {
			local20.method5829(arg8);
		}
		if (arg1 != 0) {
			local20.method5849(0, arg1, 0);
		}
		return local20;
	}
}
