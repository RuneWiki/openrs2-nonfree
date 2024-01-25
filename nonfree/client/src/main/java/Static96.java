import java.awt.datatransfer.Clipboard;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static96 {

	@OriginalMember(owner = "client!g", name = "d", descriptor = "Lclient!ct;")
	public static Class30 aClass30_29;

	@OriginalMember(owner = "client!g", name = "s", descriptor = "Ljava/awt/datatransfer/Clipboard;")
	public static Clipboard aClipboard1;

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(ZZ)Z")
	public static boolean method2057(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(IIIBIIII)V")
	public static void method2058(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(11) int local11 = Static11.method912(arg5, Static38.anInt945, Static131.anInt2843);
		@Pc(17) int local17 = Static11.method912(arg1, Static38.anInt945, Static131.anInt2843);
		@Pc(23) int local23 = Static11.method912(arg4, Static122.anInt1360, Static93.anInt5014);
		@Pc(29) int local29 = Static11.method912(arg6, Static122.anInt1360, Static93.anInt5014);
		@Pc(39) int local39 = Static11.method912(arg0 + arg5, Static38.anInt945, Static131.anInt2843);
		@Pc(48) int local48 = Static11.method912(arg1 - arg0, Static38.anInt945, Static131.anInt2843);
		for (@Pc(50) int local50 = local11; local50 < local39; local50++) {
			Static367.method6081(arg2, local23, Static43.anIntArrayArray57[local50], local29);
		}
		for (@Pc(75) int local75 = local17; local75 > local48; local75--) {
			Static367.method6081(arg2, local23, Static43.anIntArrayArray57[local75], local29);
		}
		@Pc(101) int local101 = Static11.method912(arg4 + arg0, Static122.anInt1360, Static93.anInt5014);
		@Pc(112) int local112 = Static11.method912(arg6 - arg0, Static122.anInt1360, Static93.anInt5014);
		for (@Pc(114) int local114 = local39; local114 <= local48; local114++) {
			@Pc(120) int[] local120 = Static43.anIntArrayArray57[local114];
			Static367.method6081(arg2, local23, local120, local101);
			Static367.method6081(arg3, local101, local120, local112);
			Static367.method6081(arg2, local112, local120, local29);
		}
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(Lclient!tp;ZIIIII)V")
	public static void method2060(@OriginalArg(0) Class199 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (Static116.anInt2537 >= 50 || (arg0 == null || arg0.anIntArrayArray67 == null || arg0.anIntArrayArray67.length <= arg3 || arg0.anIntArrayArray67[arg3] == null)) {
			return;
		}
		@Pc(37) int local37 = arg0.anIntArrayArray67[arg3][0];
		@Pc(41) int local41 = local37 >> 8;
		@Pc(47) int local47 = local37 >> 5 & 0x7;
		@Pc(51) int local51 = local37 & 0x1F;
		@Pc(68) int local68;
		if (arg0.anIntArrayArray67[arg3].length > 1) {
			local68 = (int) ((double) arg0.anIntArrayArray67[arg3].length * Math.random());
			if (local68 > 0) {
				local41 = arg0.anIntArrayArray67[arg3][local68];
			}
		}
		if (local51 == 0) {
			if (arg1) {
				Static308.method5351(0, local47, local41, 255);
			}
		} else if (Static105.anInt2415 != 0) {
			Static189.anIntArray288[Static116.anInt2537] = local41;
			Static123.anIntArray198[Static116.anInt2537] = local47;
			Static38.anIntArray61[Static116.anInt2537] = 0;
			Static83.aClass65Array1[Static116.anInt2537] = null;
			Static81.anIntArray144[Static116.anInt2537] = 255;
			local68 = (arg4 - 64) / 128;
			@Pc(123) int local123 = (arg5 - 64) / 128;
			Static155.anIntArray232[Static116.anInt2537] = local51 + (local68 << 16) + (arg2 << 24) + (local123 << 8);
			Static116.anInt2537++;
		}
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(Lclient!ct;ZZLjava/lang/String;)Lclient!i;")
	public static Class86 method2063(@OriginalArg(0) Class30 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) String arg2) {
		@Pc(10) int local10 = arg0.method1153(arg2);
		if (local10 == -1) {
			return new Class86(0);
		}
		@Pc(24) int[] local24 = arg0.method1156(local10);
		@Pc(30) Class86 local30 = new Class86(local24.length);
		@Pc(32) int local32 = 0;
		@Pc(34) int local34 = 0;
		while (true) {
			while (local32 < local30.anInt2801) {
				@Pc(53) Class1_Sub7 local53 = new Class1_Sub7(arg0.method1161(local24[local34++], local10));
				@Pc(57) int local57 = local53.method2140();
				@Pc(61) int local61 = local53.method2161();
				@Pc(65) int local65 = local53.method2132();
				if (!arg1 && local65 == 1) {
					local30.anInt2801--;
				} else {
					local30.anIntArray210[local32] = local57;
					local30.anIntArray211[local32] = local61;
					local32++;
				}
			}
			return local30;
		}
	}

	@OriginalMember(owner = "client!g", name = "b", descriptor = "(B)Z")
	public static boolean method2066() {
		if (Static71.aBoolean115) {
			try {
				if ((Boolean) Static381.method4930(Static227.aClass75_5.anApplet1, "showingVideoAd")) {
					return false;
				}
				return true;
			} catch (@Pc(23) Throwable local23) {
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "([[B[II[I[BII[[B)I")
	public static int method2067(@OriginalArg(0) byte[][] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) byte[] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) byte[][] arg6) {
		@Pc(9) int local9 = arg1[arg4];
		@Pc(15) int local15 = local9 + arg2[arg4];
		@Pc(19) int local19 = arg1[arg5];
		@Pc(25) int local25 = arg2[arg5] + local19;
		@Pc(27) int local27 = local9;
		if (local9 < local19) {
			local27 = local19;
		}
		@Pc(38) int local38 = local15;
		if (local15 > local25) {
			local38 = local25;
		}
		@Pc(53) int local53 = arg3[arg4] & 0xFF;
		if (local53 > (arg3[arg5] & 0xFF)) {
			local53 = arg3[arg5] & 0xFF;
		}
		@Pc(70) byte[] local70 = arg0[arg4];
		@Pc(74) byte[] local74 = arg6[arg5];
		@Pc(79) int local79 = local27 - local9;
		@Pc(84) int local84 = local27 - local19;
		for (@Pc(86) int local86 = local27; local86 < local38; local86++) {
			@Pc(98) int local98 = local74[local84++] + local70[local79++];
			if (local98 < local53) {
				local53 = local98;
			}
		}
		return -local53;
	}

	@OriginalMember(owner = "client!g", name = "c", descriptor = "(I)V")
	public static void method2069() {
		Static239.method4426();
		Static34.method880();
		Static225.method4170();
		Static195.method3643();
		Static131.method2692();
		Static243.aClass220_2.method5977();
		Static279.method4984();
		Static18.method520();
		Static351.method2582();
		Static220.method4116();
		Static208.method3811();
		Static215.method3978();
		Static7.method287();
		Static330.method5568();
		Static8.method292();
		Static141.method2840();
		Static174.method3402();
		Static328.method5534();
		Static112.method2382();
		Static158.method2987();
		Static264.method4799();
		Static27.method647();
		if (Static355.anInt6715 != 0) {
			for (@Pc(57) int local57 = 0; local57 < Static291.aByteArrayArray16.length; local57++) {
				Static291.aByteArrayArray16[local57] = null;
			}
			Static128.anInt5882 = 0;
		}
		Static129.method2666();
		Static125.method2621();
		Static6.method278();
		Static21.method559();
		Static55.method1352();
		Static302.aClass21_155.method857();
		Static9.aClass63_1.method4608();
		Static219.aClass44_6.method1614();
		Static307.method5316();
		Static86.aClass30_25.method1166();
		Static176.aClass30_98.method1166();
		Static195.aClass30_57.method1166();
		Static71.aClass30_17.method1166();
		Static265.aClass30_78.method1166();
		Static166.aClass30_53.method1166();
		Static330.aClass30_93.method1166();
		Static140.aClass30_41.method1166();
		Static280.aClass30_83.method1166();
		Static19.aClass30_2.method1166();
		Static73.aClass30_18.method1166();
		Static47.aClass30_11.method1166();
		Static368.aClass30_112.method1166();
		Static101.aClass30_30.method1166();
		Static22.aClass30_104.method1166();
		Static363.aClass30_108.method1166();
		Static83.aClass30_21.method1166();
		Static155.aClass30_46.method1166();
		Static276.aClass30_82.method1166();
		Static270.aClass30_79.method1166();
		Static247.aClass30_75.method1166();
		Static218.aClass30_65.method1166();
		Static34.aClass30_8.method1166();
		Static310.aClass30_88.method1166();
		Static177.aClass30_56.method1166();
		Static84.aClass30_23.method1166();
		Static361.aClass30_107.method1166();
		Static311.aClass30_85.method1166();
		Static273.aClass30_80.method1166();
		Static328.aClass21_165.method857();
		Static217.aClass21_116.method857();
		Static219.aClass21_119.method857();
		Static359.aClass21_176.method857();
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(BI)I")
	public static int method2070(@OriginalArg(1) int arg0) {
		@Pc(5) int local5 = 0;
		if (arg0 < 0 || arg0 >= 65536) {
			arg0 >>>= 0x10;
			local5 += 16;
		}
		if (arg0 >= 256) {
			arg0 >>>= 0x8;
			local5 += 8;
		}
		if (arg0 >= 16) {
			arg0 >>>= 0x4;
			local5 += 4;
		}
		if (arg0 >= 4) {
			arg0 >>>= 0x2;
			local5 += 2;
		}
		if (arg0 >= 1) {
			arg0 >>>= 0x1;
			local5++;
		}
		return arg0 + local5;
	}
}
