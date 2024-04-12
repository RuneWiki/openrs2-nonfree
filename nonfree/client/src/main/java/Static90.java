import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static90 {

	@OriginalMember(owner = "client!uc", name = "w", descriptor = "I")
	public static int anInt2370;

	@OriginalMember(owner = "client!uc", name = "x", descriptor = "Lclient!p;")
	public static Class45 aClass45_30;

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(IIZIIIII)V", line = 11)
	public static void method1566(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg1 < 1 || arg2 < 1 || arg1 > 102 || arg2 > 102) {
			return;
		}
		if (Class1.aBoolean2 && Static1.anInt8 != arg4) {
			return;
		}
		@Pc(29) int local29 = 0;
		if (arg0 == 0) {
			local29 = Static85.aClass55_1.method1459(arg4, arg1, arg2);
		}
		if (arg0 == 1) {
			local29 = Static85.aClass55_1.method1419(arg4, arg1, arg2);
		}
		if (arg0 == 2) {
			local29 = Static85.aClass55_1.method1429(arg4, arg1, arg2);
		}
		if (arg0 == 3) {
			local29 = Static85.aClass55_1.method1458(arg4, arg1, arg2);
		}
		@Pc(92) int local92;
		if (local29 != 0) {
			@Pc(85) int local85 = local29 >> 14 & 0x7FFF;
			local92 = Static85.aClass55_1.method1449(arg4, arg1, arg2, local29);
			@Pc(98) int local98 = local92 >> 6 & 0x3;
			@Pc(102) int local102 = local92 & 0x1F;
			@Pc(116) Class2_Sub2_Sub10 local116;
			if (arg0 == 0) {
				Static85.aClass55_1.method1439(arg4, arg1, arg2);
				local116 = Static83.method1470(local85);
				if (local116.aBoolean77) {
					Class18.aClass20Array3[arg4].method532(local102, local116.aBoolean79, arg2, local98, arg1);
				}
			}
			if (arg0 == 1) {
				Static85.aClass55_1.method1415(arg4, arg1, arg2);
			}
			if (arg0 == 2) {
				Static85.aClass55_1.method1423(arg4, arg1, arg2);
				local116 = Static83.method1470(local85);
				if (arg1 + local116.anInt1036 > 103 || arg2 + local116.anInt1036 > 103 || arg1 + local116.anInt1040 > 103 || local116.anInt1040 + arg2 > 103) {
					return;
				}
				if (local116.aBoolean77) {
					Class18.aClass20Array3[arg4].method529(local116.anInt1036, local116.anInt1040, local98, local116.aBoolean79, arg1, arg2);
				}
			}
			if (arg0 == 3) {
				Static85.aClass55_1.method1413(arg4, arg1, arg2);
				local116 = Static83.method1470(local85);
				if (local116.aBoolean77 && local116.anInt1054 == 1) {
					Class18.aClass20Array3[arg4].method537(arg2, arg1);
				}
			}
		}
		if (arg5 < 0) {
			return;
		}
		local92 = arg4;
		if (arg4 < 3 && (Class34.aByteArrayArrayArray7[1][arg1][arg2] & 0x2) == 2) {
			local92 = arg4 + 1;
		}
		Static46.method845(local92, arg2, arg3, Class18.aClass20Array3[arg4], arg5, Static85.aClass55_1, arg6, arg4, arg1);
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(B)V", line = 117)
	public static void method1567() {
		while (true) {
			if (Class2_Sub2_Sub12_Sub1.aClass2_Sub3_Sub1_5.method1742(Class2_Sub2_Sub7.anInt785) >= 11) {
				@Pc(14) int local14 = Class2_Sub2_Sub12_Sub1.aClass2_Sub3_Sub1_5.method1743(11);
				if (local14 != 2047) {
					if (Class2_Sub2_Sub15.aClass2_Sub2_Sub12_Sub1_Sub1Array1[local14] == null) {
						Class2_Sub2_Sub15.aClass2_Sub2_Sub12_Sub1_Sub1Array1[local14] = new Class2_Sub2_Sub12_Sub1_Sub1();
						if (Class32.aClass2_Sub3Array1[local14] != null) {
							Class2_Sub2_Sub15.aClass2_Sub2_Sub12_Sub1_Sub1Array1[local14].method918(Class32.aClass2_Sub3Array1[local14]);
						}
					}
					Class41.anIntArray408[Class54.anInt2067++] = local14;
					@Pc(51) Class2_Sub2_Sub12_Sub1_Sub1 local51 = Class2_Sub2_Sub15.aClass2_Sub2_Sub12_Sub1_Sub1Array1[local14];
					local51.anInt2274 = Class24.anInt2511;
					@Pc(59) int local59 = Class2_Sub2_Sub12_Sub1.aClass2_Sub3_Sub1_5.method1743(5);
					if (local59 > 15) {
						local59 -= 32;
					}
					@Pc(68) int local68 = Class2_Sub2_Sub12_Sub1.aClass2_Sub3_Sub1_5.method1743(5);
					if (local68 > 15) {
						local68 -= 32;
					}
					@Pc(79) int local79 = Class2_Sub2_Sub12_Sub1.aClass2_Sub3_Sub1_5.method1743(1);
					if (local79 == 1) {
						Class60.anIntArray504[Class2_Sub9.anInt1190++] = local14;
					}
					@Pc(97) int local97 = Class2_Sub2_Sub12_Sub1.aClass2_Sub3_Sub1_5.method1743(1);
					local51.method1545(local97 == 1, Static80.aClass2_Sub2_Sub12_Sub1_Sub1_1.anIntArray496[0] + local59, local68 + Static80.aClass2_Sub2_Sub12_Sub1_Sub1_1.anIntArray492[0]);
					continue;
				}
			}
			Class2_Sub2_Sub12_Sub1.aClass2_Sub3_Sub1_5.method1739();
			return;
		}
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(BI)Lclient!ic;", line = 192)
	public static Class2_Sub2_Sub11 method1568(@OriginalArg(1) int arg0) {
		@Pc(10) Class2_Sub2_Sub11 local10 = (Class2_Sub2_Sub11) Class27.aClass47_12.method1325((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static26.aClass5_9.method68(arg0, 16);
		local10 = new Class2_Sub2_Sub11();
		if (local20 != null) {
			local10.method788(new Class2_Sub3(local20));
		}
		Class27.aClass47_12.method1332((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(I)V", line = 257)
	public static void method1569() {
		Class60.anIntArray504 = null;
		Class60.aClass40_676 = null;
		Class60.aClass40_679 = null;
		Class60.aClass40_674 = null;
		Class60.aClass40_675 = null;
		Class60.aClass2_Sub2_Sub12_Sub4Array1 = null;
		Class60.aClass40_680 = null;
		Class60.aClass40_681 = null;
		Class60.aBooleanArray35 = null;
		Class60.aClass40_677 = null;
		aClass45_30 = null;
		Class60.aClass40_678 = null;
	}
}
