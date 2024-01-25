import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static96 {

	@OriginalMember(owner = "client!ei", name = "P", descriptor = "Lclient!o;")
	public static Class137 aClass137_3;

	@OriginalMember(owner = "client!ei", name = "H", descriptor = "Lclient!rh;")
	public static final Class215 aClass215_2 = new Class215(128);

	@OriginalMember(owner = "client!ei", name = "L", descriptor = "[I")
	public static final int[] anIntArray253 = new int[250];

	@OriginalMember(owner = "client!ei", name = "M", descriptor = "I")
	public static int anInt2298 = 0;

	@OriginalMember(owner = "client!ei", name = "N", descriptor = "Lclient!fr;")
	public static final Class91 aClass91_29 = new Class91(20);

	@OriginalMember(owner = "client!ei", name = "O", descriptor = "I")
	public static int anInt2299 = -1;

	@OriginalMember(owner = "client!ei", name = "Q", descriptor = "Z")
	public static boolean aBoolean151 = false;

	@OriginalMember(owner = "client!ei", name = "c", descriptor = "(II)V")
	public static void method1654(@OriginalArg(1) int arg0) {
		if (!Static414.method5610(arg0)) {
			return;
		}
		@Pc(12) Class68[] local12 = Static293.aClass68ArrayArray4[arg0];
		for (@Pc(14) int local14 = 0; local14 < local12.length; local14++) {
			@Pc(19) Class68 local19 = local12[local14];
			if (local19 != null) {
				local19.anInt2116 = 1;
				local19.anInt2151 = 0;
				local19.anInt2128 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(ILjava/lang/String;B)V")
	public static void method1656(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		@Pc(5) int local5 = Static180.anInt3908;
		@Pc(7) int[] local7 = Static274.anIntArray500;
		@Pc(9) boolean local9 = false;
		for (@Pc(17) int local17 = 0; local17 < local5; local17++) {
			@Pc(24) Class30_Sub1_Sub1_Sub2 local24 = Static135.aClass30_Sub1_Sub1_Sub2Array1[local7[local17]];
			if (local24 != null && Static429.aClass30_Sub1_Sub1_Sub2_2 != local24 && local24.aString9 != null && local24.aString9.equalsIgnoreCase(arg1)) {
				if (arg0 == 1) {
					Static32.method677(Static266.aClass177_73);
					Static433.aClass1_Sub3_Sub1_11.method1223(local7[local17]);
					Static433.aClass1_Sub3_Sub1_11.method1164(0);
				} else if (arg0 == 4) {
					Static32.method677(Static363.aClass177_95);
					Static433.aClass1_Sub3_Sub1_11.method1223(local7[local17]);
					Static433.aClass1_Sub3_Sub1_11.method1209(0);
				} else if (arg0 == 5) {
					Static32.method677(Static13.aClass177_48);
					Static433.aClass1_Sub3_Sub1_11.method1205(local7[local17]);
					Static433.aClass1_Sub3_Sub1_11.method1175(0);
				} else if (arg0 == 6) {
					Static32.method677(Static347.aClass177_90);
					Static433.aClass1_Sub3_Sub1_11.method1208(0);
					Static433.aClass1_Sub3_Sub1_11.method1205(local7[local17]);
				} else if (arg0 == 7) {
					Static32.method677(Static219.aClass177_58);
					Static433.aClass1_Sub3_Sub1_11.method1223(local7[local17]);
					Static433.aClass1_Sub3_Sub1_11.method1208(0);
				}
				local9 = true;
				break;
			}
		}
		if (!local9) {
			Static192.method3105(Static434.aClass158_205.method3594(Static365.anInt6682) + arg1);
		}
	}

	@OriginalMember(owner = "client!ei", name = "b", descriptor = "(ZII)Ljava/lang/String;")
	public static String method1657(@OriginalArg(1) int arg0) {
		return arg0 < 0 ? Integer.toString(arg0) : Static88.method1557(arg0);
	}
}
