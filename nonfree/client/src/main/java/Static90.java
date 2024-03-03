import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static90 {

	@OriginalMember(owner = "client!fk", name = "Z", descriptor = "I")
	public static int anInt2032;

	@OriginalMember(owner = "client!fk", name = "xb", descriptor = "I")
	public static int anInt2046;

	@OriginalMember(owner = "client!fk", name = "Ab", descriptor = "I")
	public static int anInt2049;

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;IB)V", line = 480)
	public static void method2089(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) {
		Class242.aString70 = arg1;
		Class11_Sub2_Sub3.anInt3710 = arg2;
		Class5.aString51 = arg0;
		if (Class242.aString70.equals("") || Class5.aString51.equals("")) {
			Class2_Sub3_Sub6.anInt1045 = 3;
		} else if (Class87.anInt2382 == -1) {
			Class25.anInt666 = 0;
			Class109.anInt2800 = 1;
			Class2_Sub3_Sub6.anInt1045 = -3;
			Class134.anInt3553 = 0;
			@Pc(40) Class2_Sub4 local40 = new Class2_Sub4(128);
			local40.method4843(10);
			local40.method4814((int) (Math.random() * 9.9999999E7D));
			local40.method4833(Static76.method5986(Class242.aString70));
			local40.method4814((int) (Math.random() * 9.9999999E7D));
			local40.method4823(Class5.aString51);
			local40.method4814((int) (Math.random() * 9.9999999E7D));
			local40.method4835(Class2_Sub35.aBigInteger2, Class135.aBigInteger1);
			Class14.aClass2_Sub4_Sub2_4.anInt5289 = 0;
			Class14.aClass2_Sub4_Sub2_4.method4843(Class2_Sub2_Sub3.aClass242_10.anInt7025);
			Class14.aClass2_Sub4_Sub2_4.method4843(local40.anInt5289 + 2);
			Class14.aClass2_Sub4_Sub2_4.method4844(578);
			Class14.aClass2_Sub4_Sub2_4.method4858(local40.aByteArray73, local40.anInt5289);
		} else {
			Static213.method4015();
		}
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(I[Ljava/lang/String;)[Ljava/lang/String;", line = 1267)
	public static String[] method2097(@OriginalArg(1) String[] arg0) {
		@Pc(8) String[] local8 = new String[5];
		for (@Pc(10) int local10 = 0; local10 < 5; local10++) {
			local8[local10] = local10 + ": ";
			if (arg0 != null && arg0[local10] != null) {
				local8[local10] = local8[local10] + arg0[local10];
			}
		}
		return local8;
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(IIIIIII)V", line = 1305)
	public static void method2098(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (Class25_Sub1.anInt675 <= arg5 - arg0 && arg5 + arg0 <= Class61.anInt1835 && arg4 - arg0 >= Class2_Sub40.anInt6819 && Class2_Sub20.anInt2951 >= arg0 + arg4) {
			Static36.method1136(arg3, arg5, arg1, arg4, arg0, arg2);
		} else {
			Static240.method6017(arg1, arg4, arg0, arg3, arg2, arg5);
		}
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(Lclient!ag;BLclient!ag;)V", line = 1481)
	public static void method2102(@OriginalArg(0) Class2 arg0, @OriginalArg(2) Class2 arg1) {
		if (arg0.aClass2_244 != null) {
			arg0.method6469();
		}
		arg0.aClass2_244 = arg1.aClass2_244;
		arg0.aClass2_243 = arg1;
		arg0.aClass2_244.aClass2_243 = arg0;
		arg0.aClass2_243.aClass2_244 = arg0;
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(IB)I", line = 1498)
	public static int method2103(@OriginalArg(0) int arg0) {
		return arg0 == 16711935 ? -1 : Static351.method6286(arg0);
	}
}
