import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static91 {

	@OriginalMember(owner = "client!el", name = "q", descriptor = "Lclient!vq;")
	public static Class265 aClass265_1;

	@OriginalMember(owner = "client!el", name = "x", descriptor = "Lclient!ea;")
	public static final Class56 aClass56_1 = new Class56(0);

	@OriginalMember(owner = "client!el", name = "y", descriptor = "Lclient!bd;")
	public static final Class21 aClass21_23 = new Class21("Attack", "Angreifen", "Attaquer", "Atacar");

	@OriginalMember(owner = "client!el", name = "z", descriptor = "[S")
	public static final short[] aShortArray29 = new short[] { 6798, 8741, 25238, 4626, 4550 };

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(Lclient!bt;IIZ[II)Lclient!hf;")
	public static Class62_Sub2_Sub1 method1812(@OriginalArg(0) Class30_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int[] arg3) {
		if (arg0.aBoolean50 || Static39.method809(arg2) && Static39.method809(arg1)) {
			return new Class62_Sub2_Sub1(arg0, 3553, arg2, arg1, false, arg3);
		} else if (arg0.aBoolean39) {
			return new Class62_Sub2_Sub1(arg0, 34037, arg2, arg1, false, arg3);
		} else {
			return new Class62_Sub2_Sub1(arg0, arg2, arg1, Static84.method6309(arg2), Static84.method6309(arg1), arg3);
		}
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(BIII)I")
	public static int method1814(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (Static165.anInt3267 < 100) {
			return -2;
		}
		@Pc(19) int local19 = -2;
		@Pc(21) int local21 = Integer.MAX_VALUE;
		@Pc(26) int local26 = arg1 - Static425.anInt3657;
		@Pc(31) int local31 = arg2 - Static425.anInt3658;
		for (@Pc(36) Class4_Sub4 local36 = (Class4_Sub4) Static425.aClass91_24.method2584(); local36 != null; local36 = (Class4_Sub4) Static425.aClass91_24.method2586()) {
			if (local36.anInt366 == arg0) {
				@Pc(49) int local49 = local36.anInt359;
				@Pc(52) int local52 = local36.anInt364;
				@Pc(63) int local63 = local52 + Static425.anInt3658 | local49 - -Static425.anInt3657 << 14;
				@Pc(82) int local82 = (local26 - local49) * (local26 - local49) + (local31 - local52) * (-local52 + local31);
				if (local19 < 0 || local21 > local82) {
					local21 = local82;
					local19 = local63;
				}
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(ZI)V")
	public static void method1815(@OriginalArg(0) boolean arg0) {
		if (Static172.aClass13_1 != null) {
			Static172.aClass13_1.method172();
			Static172.aClass13_1 = null;
		}
		Static427.anInt7334 = 0;
		Static72.method1587();
		Static310.method4732();
		for (@Pc(19) int local19 = 0; local19 < 4; local19++) {
			Static335.aClass253Array1[local19].method5745();
		}
		Static35.method519(false);
		System.gc();
		Static207.method3648();
		Static351.aBoolean462 = false;
		Static305.anInt5655 = -1;
		Static383.method5404(true);
		Static245.anInt4783 = 0;
		Static462.anInt7854 = 0;
		Static227.anInt4510 = 0;
		Static33.anInt549 = 0;
		Static72.anInt1776 = 0;
		Static426.anInt7325 = 0;
		for (@Pc(66) int local66 = 0; local66 < Static209.aClass51Array1.length; local66++) {
			Static209.aClass51Array1[local66] = null;
		}
		Static42.method909();
		for (@Pc(85) int local85 = 0; local85 < 2048; local85++) {
			Static39.aClass11_Sub5_Sub2_Sub1Array1[local85] = null;
		}
		Static77.anInt1870 = 0;
		Static80.aClass96_8.method2799();
		Static328.anInt5871 = 0;
		Static377.aClass96_31.method2799();
		Static435.method5992();
		Static424.anInt7324 = 0;
		Static67.aClass224_1.method5155();
		Static95.method1839();
		Static315.method4354();
		Static364.aLong187 = 0L;
		Static42.aClass4_Sub23_1 = null;
		if (arg0) {
			Static382.method3540(11);
			return;
		}
		Static382.method3540(2);
		try {
			Static476.method5363(Static390.aClass255_5.anApplet1, "loggedout");
		} catch (@Pc(139) Throwable local139) {
		}
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(IIILclient!eu;)V")
	public static void method1816(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class4_Sub14 arg2) {
		if (arg2 == null || Static289.aClass91_31.aClass4_103 == arg2) {
			return;
		}
		@Pc(15) int local15 = arg2.anInt2133;
		@Pc(18) int local18 = arg2.anInt2135;
		@Pc(21) int local21 = arg2.anInt2132;
		@Pc(25) int local25 = (int) arg2.aLong69;
		if (local21 >= 2000) {
			local21 -= 2000;
		}
		@Pc(34) long local34 = arg2.aLong69;
		if (local21 == 25) {
			Static210.anInt4281 = 2;
			Static317.anInt5744 = 0;
			Static75.anInt1851 = arg0;
			Static122.anInt2551 = arg1;
			Static448.method6134(Static277.aClass212_37);
			Static457.aClass4_Sub20_Sub1_5.method4590(Static115.aClass173_1.method4895(82) ? 1 : 0);
			Static457.aClass4_Sub20_Sub1_5.method4558(Static426.anInt7325 + local15);
			Static457.aClass4_Sub20_Sub1_5.method4587(Integer.MAX_VALUE & (int) (local34 >>> 32));
			Static457.aClass4_Sub20_Sub1_5.method4587(Static72.anInt1776 + local18);
			Static236.method3987(local18, local34, local15);
		}
		@Pc(111) Class4_Sub44 local111;
		@Pc(116) Class11_Sub5_Sub2_Sub2 local116;
		if (local21 == 1001) {
			Static317.anInt5744 = 0;
			Static210.anInt4281 = 2;
			Static122.anInt2551 = arg1;
			Static75.anInt1851 = arg0;
			local111 = (Class4_Sub44) Static80.aClass96_8.method2797((long) local25);
			if (local111 != null) {
				local116 = local111.aClass11_Sub5_Sub2_Sub2_2;
				@Pc(119) Class241 local119 = local116.aClass241_1;
				if (local119.anIntArray565 != null) {
					local119 = local119.method5593(Static67.aClass224_1);
				}
				if (local119 != null) {
					Static448.method6134(Static50.aClass212_10);
					Static457.aClass4_Sub20_Sub1_5.method4558(local119.anInt7025);
				}
			}
		}
		if (local21 == 1007) {
			Static210.anInt4281 = 2;
			Static122.anInt2551 = arg1;
			Static317.anInt5744 = 0;
			Static75.anInt1851 = arg0;
			Static448.method6134(Static306.aClass212_75);
			Static457.aClass4_Sub20_Sub1_5.method4558(local25);
		}
		if (local21 == 1012) {
			Static317.anInt5744 = 0;
			Static210.anInt4281 = 2;
			Static75.anInt1851 = arg0;
			Static122.anInt2551 = arg1;
			Static448.method6134(Static69.aClass212_17);
			Static457.aClass4_Sub20_Sub1_5.method4587(local15 + Static426.anInt7325);
			Static457.aClass4_Sub20_Sub1_5.method4590(Static115.aClass173_1.method4895(82) ? 1 : 0);
			Static457.aClass4_Sub20_Sub1_5.method4571(local18 + Static72.anInt1776);
			Static457.aClass4_Sub20_Sub1_5.method4571((int) (local34 >>> 32) & Integer.MAX_VALUE);
			Static236.method3987(local18, local34, local15);
		}
		if (local21 == 47) {
			Static317.anInt5744 = 0;
			Static122.anInt2551 = arg1;
			Static210.anInt4281 = 2;
			Static75.anInt1851 = arg0;
			Static448.method6134(Static132.aClass212_35);
			Static457.aClass4_Sub20_Sub1_5.method4587(local25);
			Static457.aClass4_Sub20_Sub1_5.method4587(local15 + Static426.anInt7325);
			Static457.aClass4_Sub20_Sub1_5.method4590(Static115.aClass173_1.method4895(82) ? 1 : 0);
			Static457.aClass4_Sub20_Sub1_5.method4587(local18 + Static72.anInt1776);
			Static15.method258(local18, local15);
		}
		if (local21 == 15) {
			Static210.anInt4281 = 2;
			Static317.anInt5744 = 0;
			Static75.anInt1851 = arg0;
			Static122.anInt2551 = arg1;
			Static448.method6134(Static259.aClass212_67);
			Static457.aClass4_Sub20_Sub1_5.method4587(local18 + Static72.anInt1776);
			Static457.aClass4_Sub20_Sub1_5.method4558(local15 + Static426.anInt7325);
			Static457.aClass4_Sub20_Sub1_5.method4610((int) (local34 >>> 32) & Integer.MAX_VALUE);
			Static457.aClass4_Sub20_Sub1_5.method4579(Static115.aClass173_1.method4895(82) ? 1 : 0);
			Static236.method3987(local18, local34, local15);
		}
		if (local21 == 4) {
			local111 = (Class4_Sub44) Static80.aClass96_8.method2797((long) local25);
			if (local111 != null) {
				Static122.anInt2551 = arg1;
				Static317.anInt5744 = 0;
				Static210.anInt4281 = 2;
				local116 = local111.aClass11_Sub5_Sub2_Sub2_2;
				Static75.anInt1851 = arg0;
				Static448.method6134(Static409.aClass212_91);
				Static457.aClass4_Sub20_Sub1_5.method4610(local25);
				Static457.aClass4_Sub20_Sub1_5.method4581(Static115.aClass173_1.method4895(82) ? 1 : 0);
				Static258.method3306(local116.method5302(), 0, local116.anIntArray524[0], -2, local116.anIntArray523[0], true, 0, local116.method5302());
			}
		}
		if (local21 == 13) {
			Static317.anInt5744 = 0;
			Static75.anInt1851 = arg0;
			Static210.anInt4281 = 2;
			Static122.anInt2551 = arg1;
			Static448.method6134(Static103.aClass212_30);
			Static457.aClass4_Sub20_Sub1_5.method4558(Static344.anInt6075);
			Static457.aClass4_Sub20_Sub1_5.method4601(Static383.anInt6696);
			Static457.aClass4_Sub20_Sub1_5.method4558(Integer.MAX_VALUE & (int) (local34 >>> 32));
			Static457.aClass4_Sub20_Sub1_5.method4558(Static25.anInt464);
			Static457.aClass4_Sub20_Sub1_5.method4571(local15 + Static426.anInt7325);
			Static457.aClass4_Sub20_Sub1_5.method4565(Static115.aClass173_1.method4895(82) ? 1 : 0);
			Static457.aClass4_Sub20_Sub1_5.method4571(local18 + Static72.anInt1776);
			Static236.method3987(local18, local34, local15);
		}
		if (local21 == 6 || local21 == 1008) {
			Static168.method2939(local25, local15, local18, arg2.aString13);
		}
		@Pc(502) Class11_Sub5_Sub2_Sub1 local502;
		if (local21 == 22) {
			local502 = Static39.aClass11_Sub5_Sub2_Sub1Array1[local25];
			if (local502 != null) {
				Static317.anInt5744 = 0;
				Static210.anInt4281 = 2;
				Static122.anInt2551 = arg1;
				Static75.anInt1851 = arg0;
				Static448.method6134(Static157.aClass212_47);
				Static457.aClass4_Sub20_Sub1_5.method4581(Static115.aClass173_1.method4895(82) ? 1 : 0);
				Static457.aClass4_Sub20_Sub1_5.method4587(local25);
				Static258.method3306(local502.method5302(), 0, local502.anIntArray524[0], -2, local502.anIntArray523[0], true, 0, local502.method5302());
			}
		}
		if (local21 == 60) {
			local502 = Static39.aClass11_Sub5_Sub2_Sub1Array1[local25];
			if (local502 != null) {
				Static75.anInt1851 = arg0;
				Static317.anInt5744 = 0;
				Static122.anInt2551 = arg1;
				Static210.anInt4281 = 2;
				Static448.method6134(Static331.aClass212_79);
				Static457.aClass4_Sub20_Sub1_5.method4587(local25);
				Static457.aClass4_Sub20_Sub1_5.method4565(Static115.aClass173_1.method4895(82) ? 1 : 0);
				Static258.method3306(local502.method5302(), 0, local502.anIntArray524[0], -2, local502.anIntArray523[0], true, 0, local502.method5302());
			}
		}
		if (local21 == 2) {
			local502 = Static39.aClass11_Sub5_Sub2_Sub1Array1[local25];
			if (local502 != null) {
				Static122.anInt2551 = arg1;
				Static317.anInt5744 = 0;
				Static75.anInt1851 = arg0;
				Static210.anInt4281 = 2;
				Static448.method6134(Static10.aClass212_3);
				Static457.aClass4_Sub20_Sub1_5.method4558(local25);
				Static457.aClass4_Sub20_Sub1_5.method4610(Static344.anInt6075);
				Static457.aClass4_Sub20_Sub1_5.method4587(Static25.anInt464);
				Static457.aClass4_Sub20_Sub1_5.method4590(Static115.aClass173_1.method4895(82) ? 1 : 0);
				Static457.aClass4_Sub20_Sub1_5.method4562(Static383.anInt6696);
				Static258.method3306(local502.method5302(), 0, local502.anIntArray524[0], -2, local502.anIntArray523[0], true, 0, local502.method5302());
			}
		}
		if (local21 == 48) {
			Static317.anInt5744 = 0;
			Static122.anInt2551 = arg1;
			Static75.anInt1851 = arg0;
			Static210.anInt4281 = 2;
			Static448.method6134(Static186.aClass212_52);
			Static457.aClass4_Sub20_Sub1_5.method4610(local25);
			Static457.aClass4_Sub20_Sub1_5.method4558(local18 + Static72.anInt1776);
			Static457.aClass4_Sub20_Sub1_5.method4610(local15 + Static426.anInt7325);
			Static457.aClass4_Sub20_Sub1_5.method4565(Static115.aClass173_1.method4895(82) ? 1 : 0);
			Static15.method258(local18, local15);
		}
		if (local21 == 17) {
			local502 = Static39.aClass11_Sub5_Sub2_Sub1Array1[local25];
			if (local502 != null) {
				Static210.anInt4281 = 2;
				Static122.anInt2551 = arg1;
				Static75.anInt1851 = arg0;
				Static317.anInt5744 = 0;
				Static448.method6134(Static368.aClass212_84);
				Static457.aClass4_Sub20_Sub1_5.method4571(local25);
				Static457.aClass4_Sub20_Sub1_5.method4579(Static115.aClass173_1.method4895(82) ? 1 : 0);
				Static258.method3306(local502.method5302(), 0, local502.anIntArray524[0], -2, local502.anIntArray523[0], true, 0, local502.method5302());
			}
		}
		if (local21 == 44) {
			local111 = (Class4_Sub44) Static80.aClass96_8.method2797((long) local25);
			if (local111 != null) {
				Static210.anInt4281 = 2;
				Static75.anInt1851 = arg0;
				Static317.anInt5744 = 0;
				local116 = local111.aClass11_Sub5_Sub2_Sub2_2;
				Static122.anInt2551 = arg1;
				Static448.method6134(Static388.aClass212_66);
				Static457.aClass4_Sub20_Sub1_5.method4581(Static115.aClass173_1.method4895(82) ? 1 : 0);
				Static457.aClass4_Sub20_Sub1_5.method4587(local25);
				Static258.method3306(local116.method5302(), 0, local116.anIntArray524[0], -2, local116.anIntArray523[0], true, 0, local116.method5302());
			}
		}
		if (local21 == 46) {
			Static317.anInt5744 = 0;
			Static75.anInt1851 = arg0;
			Static210.anInt4281 = 2;
			Static122.anInt2551 = arg1;
			Static448.method6134(Static159.aClass212_48);
			Static457.aClass4_Sub20_Sub1_5.method4587(local25);
			Static457.aClass4_Sub20_Sub1_5.method4587(Static72.anInt1776 + local18);
			Static457.aClass4_Sub20_Sub1_5.method4565(Static115.aClass173_1.method4895(82) ? 1 : 0);
			Static457.aClass4_Sub20_Sub1_5.method4587(local15 + Static426.anInt7325);
			Static15.method258(local18, local15);
		}
		if (local21 == 12) {
			local111 = (Class4_Sub44) Static80.aClass96_8.method2797((long) local25);
			if (local111 != null) {
				Static210.anInt4281 = 2;
				Static75.anInt1851 = arg0;
				local116 = local111.aClass11_Sub5_Sub2_Sub2_2;
				Static122.anInt2551 = arg1;
				Static317.anInt5744 = 0;
				Static448.method6134(Static273.aClass212_69);
				Static457.aClass4_Sub20_Sub1_5.method4587(Static25.anInt464);
				Static457.aClass4_Sub20_Sub1_5.method4562(Static383.anInt6696);
				Static457.aClass4_Sub20_Sub1_5.method4610(local25);
				Static457.aClass4_Sub20_Sub1_5.method4587(Static344.anInt6075);
				Static457.aClass4_Sub20_Sub1_5.method4565(Static115.aClass173_1.method4895(82) ? 1 : 0);
				Static258.method3306(local116.method5302(), 0, local116.anIntArray524[0], -2, local116.anIntArray523[0], true, 0, local116.method5302());
			}
		}
		if (local21 == 57) {
			Static210.anInt4281 = 2;
			Static122.anInt2551 = arg1;
			Static317.anInt5744 = 0;
			Static75.anInt1851 = arg0;
			Static448.method6134(Static390.aClass212_88);
			Static457.aClass4_Sub20_Sub1_5.method4610(Static72.anInt1776 + local18);
			Static457.aClass4_Sub20_Sub1_5.method4587(local15 + Static426.anInt7325);
			Static457.aClass4_Sub20_Sub1_5.method4558((int) (local34 >>> 32) & Integer.MAX_VALUE);
			Static457.aClass4_Sub20_Sub1_5.method4565(Static115.aClass173_1.method4895(82) ? 1 : 0);
			Static236.method3987(local18, local34, local15);
		}
		if (local21 == 58) {
			local502 = Static39.aClass11_Sub5_Sub2_Sub1Array1[local25];
			if (local502 != null) {
				Static75.anInt1851 = arg0;
				Static317.anInt5744 = 0;
				Static122.anInt2551 = arg1;
				Static210.anInt4281 = 2;
				Static448.method6134(Static227.aClass212_63);
				Static457.aClass4_Sub20_Sub1_5.method4558(local25);
				Static457.aClass4_Sub20_Sub1_5.method4565(Static115.aClass173_1.method4895(82) ? 1 : 0);
				Static258.method3306(local502.method5302(), 0, local502.anIntArray524[0], -2, local502.anIntArray523[0], true, 0, local502.method5302());
			}
		}
		if (local21 == 45) {
			if (Static70.anInt1720 > 0 && Static115.aClass173_1.method4895(82) && Static115.aClass173_1.method4895(81)) {
				Static328.method4877(local15 + Static426.anInt7325, Static52.aClass11_Sub5_Sub2_Sub1_2.aByte100, local18 + Static72.anInt1776);
			} else {
				Static122.anInt2551 = arg1;
				Static210.anInt4281 = 1;
				Static75.anInt1851 = arg0;
				Static317.anInt5744 = 0;
				Static448.method6134(Static53.aClass212_64);
				Static457.aClass4_Sub20_Sub1_5.method4587(local15 + Static426.anInt7325);
				Static457.aClass4_Sub20_Sub1_5.method4610(local18 + Static72.anInt1776);
			}
		}
		if (local21 == 50) {
			local502 = Static39.aClass11_Sub5_Sub2_Sub1Array1[local25];
			if (local502 != null) {
				Static75.anInt1851 = arg0;
				Static122.anInt2551 = arg1;
				Static210.anInt4281 = 2;
				Static317.anInt5744 = 0;
				Static448.method6134(Static80.aClass212_21);
				Static457.aClass4_Sub20_Sub1_5.method4558(local25);
				Static457.aClass4_Sub20_Sub1_5.method4579(Static115.aClass173_1.method4895(82) ? 1 : 0);
				Static258.method3306(local502.method5302(), 0, local502.anIntArray524[0], -2, local502.anIntArray523[0], true, 0, local502.method5302());
			}
		}
		if (local21 == 30) {
			local502 = Static39.aClass11_Sub5_Sub2_Sub1Array1[local25];
			if (local502 != null) {
				Static122.anInt2551 = arg1;
				Static75.anInt1851 = arg0;
				Static210.anInt4281 = 2;
				Static317.anInt5744 = 0;
				Static448.method6134(Static412.aClass212_94);
				Static457.aClass4_Sub20_Sub1_5.method4558(local25);
				Static457.aClass4_Sub20_Sub1_5.method4579(Static115.aClass173_1.method4895(82) ? 1 : 0);
				Static258.method3306(local502.method5302(), 0, local502.anIntArray524[0], -2, local502.anIntArray523[0], true, 0, local502.method5302());
			}
		}
		if (local21 == 9) {
			local502 = Static39.aClass11_Sub5_Sub2_Sub1Array1[local25];
			if (local502 != null) {
				Static122.anInt2551 = arg1;
				Static75.anInt1851 = arg0;
				Static210.anInt4281 = 2;
				Static317.anInt5744 = 0;
				Static448.method6134(Static165.aClass212_50);
				Static457.aClass4_Sub20_Sub1_5.method4565(Static115.aClass173_1.method4895(82) ? 1 : 0);
				Static457.aClass4_Sub20_Sub1_5.method4610(local25);
				Static258.method3306(local502.method5302(), 0, local502.anIntArray524[0], -2, local502.anIntArray523[0], true, 0, local502.method5302());
			}
		}
		@Pc(1396) Class240 local1396;
		if (local21 == 51) {
			local1396 = Static231.method3929(local18, local15);
			if (local1396 != null) {
				Static294.method4500();
				@Pc(1403) Class4_Sub45 local1403 = Static50.method1146(local1396);
				Static288.method4458(local1403.method5906(), local1396, local1403.anInt7348);
				Static198.aString26 = Static26.method401(local1396);
				if (Static198.aString26 == null) {
					Static198.aString26 = "Null";
				}
				Static168.aString24 = local1396.aString59 + "<col=ffffff>";
			}
			return;
		}
		if (local21 == 5) {
			Static75.anInt1851 = arg0;
			Static210.anInt4281 = 2;
			Static317.anInt5744 = 0;
			Static122.anInt2551 = arg1;
			Static448.method6134(Static10.aClass212_3);
			Static457.aClass4_Sub20_Sub1_5.method4558(Static52.aClass11_Sub5_Sub2_Sub1_2.anInt6518);
			Static457.aClass4_Sub20_Sub1_5.method4610(Static344.anInt6075);
			Static457.aClass4_Sub20_Sub1_5.method4587(Static25.anInt464);
			Static457.aClass4_Sub20_Sub1_5.method4590(Static115.aClass173_1.method4895(82) ? 1 : 0);
			Static457.aClass4_Sub20_Sub1_5.method4562(Static383.anInt6696);
		}
		if (local21 == 49) {
			Static75.anInt1851 = arg0;
			Static210.anInt4281 = 1;
			Static122.anInt2551 = arg1;
			Static317.anInt5744 = 0;
			Static448.method6134(Static196.aClass212_97);
			Static457.aClass4_Sub20_Sub1_5.method4558(Static25.anInt464);
			Static457.aClass4_Sub20_Sub1_5.method4571(Static426.anInt7325 + local15);
			Static457.aClass4_Sub20_Sub1_5.method4601(Static383.anInt6696);
			Static457.aClass4_Sub20_Sub1_5.method4587(Static344.anInt6075);
			Static457.aClass4_Sub20_Sub1_5.method4571(Static72.anInt1776 + local18);
			Static258.method3306(1, 0, local18, -4, local15, true, 0, 1);
		}
		if (local21 == 16) {
			local111 = (Class4_Sub44) Static80.aClass96_8.method2797((long) local25);
			if (local111 != null) {
				Static317.anInt5744 = 0;
				Static75.anInt1851 = arg0;
				Static210.anInt4281 = 2;
				local116 = local111.aClass11_Sub5_Sub2_Sub2_2;
				Static122.anInt2551 = arg1;
				Static448.method6134(Static26.aClass212_6);
				Static457.aClass4_Sub20_Sub1_5.method4590(Static115.aClass173_1.method4895(82) ? 1 : 0);
				Static457.aClass4_Sub20_Sub1_5.method4571(local25);
				Static258.method3306(local116.method5302(), 0, local116.anIntArray524[0], -2, local116.anIntArray523[0], true, 0, local116.method5302());
			}
		}
		if (local21 == 11 && Static341.aClass240_13 == null) {
			Static328.method4876(local18, local15);
			Static341.aClass240_13 = Static231.method3929(local18, local15);
			Static273.method4374(Static341.aClass240_13);
		}
		if (local21 == 23) {
			Static122.anInt2551 = arg1;
			Static75.anInt1851 = arg0;
			Static210.anInt4281 = 2;
			Static317.anInt5744 = 0;
			Static448.method6134(Static407.aClass212_90);
			Static457.aClass4_Sub20_Sub1_5.method4610(Static72.anInt1776 + local18);
			Static457.aClass4_Sub20_Sub1_5.method4587(Static426.anInt7325 + local15);
			Static457.aClass4_Sub20_Sub1_5.method4571(Integer.MAX_VALUE & (int) (local34 >>> 32));
			Static457.aClass4_Sub20_Sub1_5.method4590(Static115.aClass173_1.method4895(82) ? 1 : 0);
			Static236.method3987(local18, local34, local15);
		}
		if (local21 == 1010) {
			Static317.anInt5744 = 0;
			Static75.anInt1851 = arg0;
			Static210.anInt4281 = 2;
			Static122.anInt2551 = arg1;
			Static448.method6134(Static404.aClass212_89);
			Static457.aClass4_Sub20_Sub1_5.method4558(local25);
		}
		if (local21 == 21) {
			if (Static70.anInt1720 > 0 && Static115.aClass173_1.method4895(82) && Static115.aClass173_1.method4895(81)) {
				Static328.method4877(local15 + Static426.anInt7325, Static52.aClass11_Sub5_Sub2_Sub1_2.aByte100, Static72.anInt1776 + local18);
			} else {
				Static185.method3384(local18, local15, local25);
				if (local25 == 1) {
					Static457.aClass4_Sub20_Sub1_5.method4590(-1);
					Static457.aClass4_Sub20_Sub1_5.method4590(-1);
					Static457.aClass4_Sub20_Sub1_5.method4558((int) Static322.aFloat82);
					Static457.aClass4_Sub20_Sub1_5.method4590(57);
					Static457.aClass4_Sub20_Sub1_5.method4590(Static53.anInt4624);
					Static457.aClass4_Sub20_Sub1_5.method4590(Static437.anInt7473);
					Static457.aClass4_Sub20_Sub1_5.method4590(89);
					Static457.aClass4_Sub20_Sub1_5.method4558(Static52.aClass11_Sub5_Sub2_Sub1_2.anInt7514);
					Static457.aClass4_Sub20_Sub1_5.method4558(Static52.aClass11_Sub5_Sub2_Sub1_2.anInt7515);
					Static457.aClass4_Sub20_Sub1_5.method4590(63);
				} else {
					Static210.anInt4281 = 1;
					Static317.anInt5744 = 0;
					Static122.anInt2551 = arg1;
					Static75.anInt1851 = arg0;
				}
				Static258.method3306(1, 0, local18, -4, local15, true, 0, 1);
			}
		}
		if (local21 == 3) {
			local1396 = Static231.method3929(local18, local15);
			if (local1396 != null) {
				Static377.method5054(local1396);
			}
		}
		if (local21 == 10) {
			local111 = (Class4_Sub44) Static80.aClass96_8.method2797((long) local25);
			if (local111 != null) {
				Static210.anInt4281 = 2;
				Static317.anInt5744 = 0;
				Static122.anInt2551 = arg1;
				Static75.anInt1851 = arg0;
				local116 = local111.aClass11_Sub5_Sub2_Sub2_2;
				Static448.method6134(Static411.aClass212_86);
				Static457.aClass4_Sub20_Sub1_5.method4610(local25);
				Static457.aClass4_Sub20_Sub1_5.method4579(Static115.aClass173_1.method4895(82) ? 1 : 0);
				Static258.method3306(local116.method5302(), 0, local116.anIntArray524[0], -2, local116.anIntArray523[0], true, 0, local116.method5302());
			}
		}
		if (local21 == 59) {
			local502 = Static39.aClass11_Sub5_Sub2_Sub1Array1[local25];
			if (local502 != null) {
				Static317.anInt5744 = 0;
				Static122.anInt2551 = arg1;
				Static75.anInt1851 = arg0;
				Static210.anInt4281 = 2;
				Static448.method6134(Static295.aClass212_72);
				Static457.aClass4_Sub20_Sub1_5.method4558(local25);
				Static457.aClass4_Sub20_Sub1_5.method4590(Static115.aClass173_1.method4895(82) ? 1 : 0);
				Static258.method3306(local502.method5302(), 0, local502.anIntArray524[0], -2, local502.anIntArray523[0], true, 0, local502.method5302());
			}
		}
		if (local21 == 18) {
			Static75.anInt1851 = arg0;
			Static210.anInt4281 = 2;
			Static122.anInt2551 = arg1;
			Static317.anInt5744 = 0;
			Static448.method6134(Static457.aClass212_99);
			Static457.aClass4_Sub20_Sub1_5.method4561(Static383.anInt6696);
			Static457.aClass4_Sub20_Sub1_5.method4565(Static115.aClass173_1.method4895(82) ? 1 : 0);
			Static457.aClass4_Sub20_Sub1_5.method4571(local15 + Static426.anInt7325);
			Static457.aClass4_Sub20_Sub1_5.method4571(local18 + Static72.anInt1776);
			Static457.aClass4_Sub20_Sub1_5.method4571(Static344.anInt6075);
			Static457.aClass4_Sub20_Sub1_5.method4571(Static25.anInt464);
			Static457.aClass4_Sub20_Sub1_5.method4571(local25);
			Static15.method258(local18, local15);
		}
		if (local21 == 8) {
			Static75.anInt1851 = arg0;
			Static122.anInt2551 = arg1;
			Static317.anInt5744 = 0;
			Static210.anInt4281 = 2;
			Static448.method6134(Static410.aClass212_93);
			Static457.aClass4_Sub20_Sub1_5.method4587(local25);
			Static457.aClass4_Sub20_Sub1_5.method4571(local18 + Static72.anInt1776);
			Static457.aClass4_Sub20_Sub1_5.method4587(Static426.anInt7325 + local15);
			Static457.aClass4_Sub20_Sub1_5.method4581(Static115.aClass173_1.method4895(82) ? 1 : 0);
			Static15.method258(local18, local15);
		}
		if (local21 == 20) {
			Static317.anInt5744 = 0;
			Static210.anInt4281 = 2;
			Static75.anInt1851 = arg0;
			Static122.anInt2551 = arg1;
			Static448.method6134(Static350.aClass212_82);
			Static457.aClass4_Sub20_Sub1_5.method4587(local15 + Static426.anInt7325);
			Static457.aClass4_Sub20_Sub1_5.method4558(Static72.anInt1776 + local18);
			Static457.aClass4_Sub20_Sub1_5.method4565(Static115.aClass173_1.method4895(82) ? 1 : 0);
			Static457.aClass4_Sub20_Sub1_5.method4587(local25);
			Static15.method258(local18, local15);
		}
		if (local21 == 1003 || local21 == 1004 || local21 == 1011 || local21 == 1006 || local21 == 1009) {
			Static436.method6001(local15, local25, local21);
		}
		if (local21 == 19) {
			local111 = (Class4_Sub44) Static80.aClass96_8.method2797((long) local25);
			if (local111 != null) {
				Static317.anInt5744 = 0;
				Static210.anInt4281 = 2;
				Static75.anInt1851 = arg0;
				Static122.anInt2551 = arg1;
				local116 = local111.aClass11_Sub5_Sub2_Sub2_2;
				Static448.method6134(Static89.aClass212_26);
				Static457.aClass4_Sub20_Sub1_5.method4565(Static115.aClass173_1.method4895(82) ? 1 : 0);
				Static457.aClass4_Sub20_Sub1_5.method4571(local25);
				Static258.method3306(local116.method5302(), 0, local116.anIntArray524[0], -2, local116.anIntArray523[0], true, 0, local116.method5302());
			}
		}
		if (Static449.aBoolean564) {
			Static294.method4500();
		}
		if (Static262.aClass240_12 != null && Static298.anInt5468 == 0) {
			Static273.method4374(Static262.aClass240_12);
		}
	}
}
