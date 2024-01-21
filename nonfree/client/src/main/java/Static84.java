import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static84 {

	@OriginalMember(owner = "client!ie", name = "r", descriptor = "I")
	public static int anInt2011;

	@OriginalMember(owner = "client!ie", name = "v", descriptor = "Lclient!dj;")
	public static final Class24 aClass24_602 = Static81.method1507("M");

	@OriginalMember(owner = "client!ie", name = "c", descriptor = "(I)V")
	public static void method1554() {
		Static67.aClass86_24.method2817();
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(II[BI)Lclient!dj;")
	public static Class24 method1555(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) {
		@Pc(15) Class24 local15 = new Class24();
		local15.aByteArray13 = new byte[arg0];
		local15.anInt1084 = 0;
		for (@Pc(24) int local24 = arg2; local24 < arg0 + arg2; local24++) {
			if (arg1[local24] != 0) {
				local15.aByteArray13[local15.anInt1084++] = arg1[local24];
			}
		}
		return local15;
	}

	@OriginalMember(owner = "client!ie", name = "b", descriptor = "(B)[Lclient!od;")
	public static Class1_Sub2_Sub8_Sub3[] method1556() {
		@Pc(8) Class1_Sub2_Sub8_Sub3[] local8 = new Class1_Sub2_Sub8_Sub3[Static96.anInt2211];
		for (@Pc(15) int local15 = 0; local15 < Static96.anInt2211; local15++) {
			@Pc(21) Class1_Sub2_Sub8_Sub3 local21 = new Class1_Sub2_Sub8_Sub3();
			local21.anInt3019 = Static83.anInt2001;
			local21.anInt3021 = Static201.anInt4511;
			local21.anInt3020 = Static80.anIntArray164[local15];
			local21.anInt3018 = Static35.anIntArray360[local15];
			local21.anInt3022 = Static85.anIntArray288[local15];
			local21.anInt3017 = Static153.anIntArray291[local15];
			@Pc(53) int local53 = local21.anInt3017 * local21.anInt3022;
			@Pc(57) byte[] local57 = Static53.aByteArrayArray5[local15];
			local21.anIntArray246 = new int[local53];
			for (@Pc(63) int local63 = 0; local63 < local53; local63++) {
				local21.anIntArray246[local63] = Static148.anIntArray279[local57[local63] & 0xFF];
			}
			local8[local15] = local21;
		}
		Static110.method1908();
		return local8;
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(BILclient!vi;ILjava/awt/Component;)Lclient!pg;")
	public static Class42 method1558(@OriginalArg(1) int arg0, @OriginalArg(2) Class99 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Component arg3) {
		if (Static148.anInt3288 == 0) {
			throw new IllegalStateException();
		}
		try {
			@Pc(31) Class42 local31 = (Class42) Class.forName("Class42_Sub1").getDeclaredConstructor().newInstance();
			local31.anInt3128 = arg0;
			local31.anIntArray256 = new int[(Static138.aBoolean145 ? 2 : 1) * 256];
			local31.method2419(arg3);
			local31.anInt3130 = (-1024 & arg0) + 1024;
			if (local31.anInt3130 > 16384) {
				local31.anInt3130 = 16384;
			}
			local31.method2417(local31.anInt3130);
			if (Static106.anInt2399 > 0 && Static24.aClass68_1 == null) {
				Static24.aClass68_1 = new Class68();
				Static24.aClass68_1.aClass99_4 = arg1;
				arg1.method3421(Static106.anInt2399, Static24.aClass68_1);
			}
			if (Static24.aClass68_1 != null) {
				if (Static24.aClass68_1.aClass42Array1[arg2] != null) {
					throw new IllegalArgumentException();
				}
				Static24.aClass68_1.aClass42Array1[arg2] = local31;
			}
			return local31;
		} catch (@Pc(113) Throwable local113) {
			try {
				@Pc(119) Class42_Sub2 local119 = new Class42_Sub2(arg1, arg2);
				local119.anInt3128 = arg0;
				local119.anIntArray256 = new int[(Static138.aBoolean145 ? 2 : 1) * 256];
				local119.method2419(arg3);
				local119.anInt3130 = 16384;
				local119.method2417(local119.anInt3130);
				if (Static106.anInt2399 > 0 && Static24.aClass68_1 == null) {
					Static24.aClass68_1 = new Class68();
					Static24.aClass68_1.aClass99_4 = arg1;
					arg1.method3421(Static106.anInt2399, Static24.aClass68_1);
				}
				if (Static24.aClass68_1 != null) {
					if (Static24.aClass68_1.aClass42Array1[arg2] != null) {
						throw new IllegalArgumentException();
					}
					Static24.aClass68_1.aClass42Array1[arg2] = local119;
				}
				return local119;
			} catch (@Pc(178) Throwable local178) {
				return new Class42();
			}
		}
	}
}
