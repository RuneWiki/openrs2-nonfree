import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static9 {

	@OriginalMember(owner = "client!ah", name = "I", descriptor = "I")
	public static int anInt3078;

	@OriginalMember(owner = "client!ah", name = "M", descriptor = "I")
	public static int anInt3081;

	@OriginalMember(owner = "client!ah", name = "N", descriptor = "Z")
	public static boolean aBoolean184;

	@OriginalMember(owner = "client!ah", name = "L", descriptor = "Lclient!bs;")
	public static final Class37 aClass37_2 = new Class37(0);

	@OriginalMember(owner = "client!ah", name = "d", descriptor = "(I)V")
	public static void method2255() {
		if (Static435.anIntArray722 != null && Static311.anIntArray545 != null) {
			return;
		}
		Static311.anIntArray545 = new int[256];
		Static435.anIntArray722 = new int[256];
		for (@Pc(22) int local22 = 0; local22 < 256; local22++) {
			@Pc(31) double local31 = (double) local22 / 255.0D * 6.283185307179586D;
			Static435.anIntArray722[local22] = (int) (Math.sin(local31) * 4096.0D);
			Static311.anIntArray545[local22] = (int) (Math.cos(local31) * 4096.0D);
		}
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(BLclient!nv;ILjava/awt/Canvas;Lclient!l;)Lclient!za;")
	public static Class106 method2256(@OriginalArg(1) Class183 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Canvas arg2, @OriginalArg(4) Interface7 arg3) {
		return new w(arg1, arg2, arg3, arg0);
	}

	@OriginalMember(owner = "client!ah", name = "c", descriptor = "(Z)V")
	public static void method2257() {
		Static365.aClass251_6.method5611();
		Static331.aClass191_5.method4337();
		Static19.aClass143_1.method3320();
		Static455.aClass161_4.method3629();
		Static300.aClass44_2.method1011();
		Static43.aClass57_1.method1411();
		Static107.aClass239_1.method5422();
		Static145.aClass63_1.method1528();
		Static303.aClass152_1.method3462();
		Static204.aClass46_1.method1070();
		Static241.aClass258_1.method5773();
		Static420.aClass84_2.method1804();
		Static163.aClass170_2.method3740();
		Static201.aClass5_1.method59();
		Static53.aClass32_1.method721();
		Static106.aClass53_1.method1338();
		Static100.aClass42_1.method902();
		Static447.aClass270_1.method6170();
		Static60.aClass133_1.method3163();
		Static257.aClass115_1.method2704();
		Static107.method1760();
		Static212.method3353();
		Static139.method2240();
		Static201.method3242();
		Static434.aClass91_99.method1993();
		Static276.aClass91_73.method1993();
		Static300.aClass91_77.method1993();
		Static329.aClass91_83.method1993();
		Static178.aClass91_52.method1993();
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(BLclient!ap;)V")
	public static void method2260(@OriginalArg(1) Class1_Sub3_Sub1 arg0) {
		arg0.method320();
		@Pc(8) int local8 = 0;
		@Pc(39) int local39;
		for (@Pc(10) int local10 = 0; local10 < Static180.anInt3908; local10++) {
			@Pc(15) int local15 = Static274.anIntArray500[local10];
			if ((Static85.aByteArray22[local15] & 0x1) == 0) {
				if (local8 > 0) {
					Static85.aByteArray22[local15] = (byte) (Static85.aByteArray22[local15] | 0x2);
					local8--;
				} else {
					local39 = arg0.method321(1);
					if (local39 == 0) {
						local8 = Static142.method2273(arg0);
						Static85.aByteArray22[local15] = (byte) (Static85.aByteArray22[local15] | 0x2);
					} else {
						Static44.method4577(arg0, local15);
					}
				}
			}
		}
		arg0.method315();
		if (local8 != 0) {
			throw new RuntimeException("nsn0");
		}
		arg0.method320();
		@Pc(94) int local94;
		@Pc(121) int local121;
		for (local39 = 0; local39 < Static180.anInt3908; local39++) {
			local94 = Static274.anIntArray500[local39];
			if ((Static85.aByteArray22[local94] & 0x1) != 0) {
				if (local8 > 0) {
					local8--;
					Static85.aByteArray22[local94] = (byte) (Static85.aByteArray22[local94] | 0x2);
				} else {
					local121 = arg0.method321(1);
					if (local121 == 0) {
						local8 = Static142.method2273(arg0);
						Static85.aByteArray22[local94] = (byte) (Static85.aByteArray22[local94] | 0x2);
					} else {
						Static44.method4577(arg0, local94);
					}
				}
			}
		}
		arg0.method315();
		if (local8 != 0) {
			throw new RuntimeException("nsn1");
		}
		arg0.method320();
		@Pc(199) int local199;
		for (local94 = 0; local94 < Static398.anInt7204; local94++) {
			local121 = Static214.anIntArray679[local94];
			if ((Static85.aByteArray22[local121] & 0x1) != 0) {
				if (local8 > 0) {
					local8--;
					Static85.aByteArray22[local121] = (byte) (Static85.aByteArray22[local121] | 0x2);
				} else {
					local199 = arg0.method321(1);
					if (local199 == 0) {
						local8 = Static142.method2273(arg0);
						Static85.aByteArray22[local121] = (byte) (Static85.aByteArray22[local121] | 0x2);
					} else if (Static121.method5870(local121, arg0)) {
						Static85.aByteArray22[local121] = (byte) (Static85.aByteArray22[local121] | 0x2);
					}
				}
			}
		}
		arg0.method315();
		if (local8 != 0) {
			throw new RuntimeException("nsn2");
		}
		arg0.method320();
		for (local121 = 0; local121 < Static398.anInt7204; local121++) {
			local199 = Static214.anIntArray679[local121];
			if ((Static85.aByteArray22[local199] & 0x1) == 0) {
				if (local8 > 0) {
					local8--;
					Static85.aByteArray22[local199] = (byte) (Static85.aByteArray22[local199] | 0x2);
				} else {
					@Pc(287) int local287 = arg0.method321(1);
					if (local287 == 0) {
						local8 = Static142.method2273(arg0);
						Static85.aByteArray22[local199] = (byte) (Static85.aByteArray22[local199] | 0x2);
					} else if (Static121.method5870(local199, arg0)) {
						Static85.aByteArray22[local199] = (byte) (Static85.aByteArray22[local199] | 0x2);
					}
				}
			}
		}
		arg0.method315();
		if (local8 != 0) {
			throw new RuntimeException("nsn3");
		}
		Static398.anInt7204 = 0;
		Static180.anInt3908 = 0;
		for (local199 = 1; local199 < 2048; local199++) {
			Static85.aByteArray22[local199] = (byte) (Static85.aByteArray22[local199] >> 1);
			@Pc(350) Class30_Sub1_Sub1_Sub2 local350 = Static135.aClass30_Sub1_Sub1_Sub2Array1[local199];
			if (local350 == null) {
				Static214.anIntArray679[Static398.anInt7204++] = local199;
			} else {
				Static274.anIntArray500[Static180.anInt3908++] = local199;
			}
		}
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(IB)Z")
	public static boolean method2261(@OriginalArg(0) int arg0) {
		return arg0 >= 4 && arg0 <= 8;
	}
}
