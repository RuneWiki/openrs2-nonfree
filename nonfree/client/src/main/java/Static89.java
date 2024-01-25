import java.awt.Image;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static89 {

	@OriginalMember(owner = "client!fm", name = "e", descriptor = "Ljava/awt/Image;")
	public static Image anImage1;

	@OriginalMember(owner = "client!fm", name = "i", descriptor = "S")
	public static short aShort40 = 205;

	@OriginalMember(owner = "client!fm", name = "k", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray23 = new String[100];

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(IIBI)Lclient!dd;")
	public static Class7_Sub1_Sub6 method1854(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(9) int local9 = arg2 | arg1 << 8;
		@Pc(18) Class7_Sub1_Sub6 local18 = (Class7_Sub1_Sub6) Static122.aClass154_2.method4079((long) local9 << 16);
		if (local18 != null) {
			return local18;
		}
		@Pc(32) byte[] local32 = Static194.aClass180_21.method4583(Static194.aClass180_21.method4557(local9));
		if (local32 == null) {
			local9 = arg2 | arg0 + 65536 << 8;
			local18 = (Class7_Sub1_Sub6) Static122.aClass154_2.method4079((long) local9 << 16);
			if (local18 != null) {
				return local18;
			}
			local32 = Static194.aClass180_21.method4583(Static194.aClass180_21.method4557(local9));
			if (local32 == null) {
				local9 = arg2 | 0xFFFF00;
				local18 = (Class7_Sub1_Sub6) Static122.aClass154_2.method4079((long) local9 << 16);
				if (local18 != null) {
					return local18;
				}
				local32 = Static194.aClass180_21.method4583(Static194.aClass180_21.method4557(local9));
				if (local32 == null) {
					return null;
				} else if (local32.length <= 1) {
					return null;
				} else {
					local18 = Static24.method419(local32);
					local18.anInt1419 = arg2;
					Static122.aClass154_2.method4078(local18, (long) local9 << 16);
					return local18;
				}
			} else if (local32.length <= 1) {
				return null;
			} else {
				local18 = Static24.method419(local32);
				local18.anInt1419 = arg2;
				Static122.aClass154_2.method4078(local18, (long) local9 << 16);
				return local18;
			}
		} else if (local32.length <= 1) {
			return null;
		} else {
			local18 = Static24.method419(local32);
			local18.anInt1419 = arg2;
			Static122.aClass154_2.method4078(local18, (long) local9 << 16);
			return local18;
		}
	}

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(IILjava/lang/String;Ljava/lang/String;)V")
	public static void method1856(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1, @OriginalArg(3) String arg2) {
		Static68.aString124 = arg1;
		Static100.anInt2439 = arg0;
		Static301.aString368 = arg2;
		if (Static301.aString368.equals("") || Static68.aString124.equals("")) {
			Static346.anInt6535 = 3;
		} else if (Static65.anInt1630 == -1) {
			Static259.anInt5012 = 0;
			Static346.anInt6535 = -3;
			Static251.anInt6256 = 0;
			Static191.anInt3822 = 1;
			@Pc(39) Class7_Sub3 local39 = new Class7_Sub3(128);
			local39.method2735(10);
			local39.method2765((int) (Math.random() * 9.9999999E7D));
			local39.method2777(Static199.method3568(Static301.aString368));
			local39.method2765((int) (Math.random() * 9.9999999E7D));
			local39.method2738(Static68.aString124);
			local39.method2765((int) (Math.random() * 9.9999999E7D));
			local39.method2789(Static184.aBigInteger2, Static101.aBigInteger1);
			Static29.aClass7_Sub3_Sub2_1.anInt3005 = 0;
			Static29.aClass7_Sub3_Sub2_1.method2735(24);
			Static29.aClass7_Sub3_Sub2_1.method2735(local39.anInt3005 + 2);
			Static29.aClass7_Sub3_Sub2_1.method2788(555);
			Static29.aClass7_Sub3_Sub2_1.method2781(local39.aByteArray33, local39.anInt3005);
		} else {
			Static314.method5101();
		}
	}

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(ZZZLclient!ji;)V")
	public static void method1858(@OriginalArg(1) boolean arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) Class7_Sub17 arg2) {
		@Pc(6) int local6 = arg2.anInt3252;
		@Pc(10) int local10 = (int) arg2.aLong232;
		arg2.method5648();
		if (arg0) {
			Static94.method1901(local6);
		}
		Static194.method1513(local6);
		@Pc(25) Class26 local25 = Static245.method4231(local10);
		if (local25 != null) {
			Static245.method4226(local25);
		}
		Static212.method3767();
		if (!arg1 && Static161.anInt3337 != -1) {
			Static325.method5214(1, Static161.anInt3337);
		}
		@Pc(46) Class35 local46 = new Class35(Static247.aClass10_40);
		for (@Pc(56) Class7_Sub17 local56 = (Class7_Sub17) local46.method667(); local56 != null; local56 = (Class7_Sub17) local46.method666()) {
			if (!local56.method5651()) {
				local56 = (Class7_Sub17) local46.method667();
				if (local56 == null) {
					return;
				}
			}
			if (local56.anInt3249 == 3) {
				@Pc(79) int local79 = (int) local56.aLong232;
				if (local79 >>> 16 == local6) {
					method1858(true, arg1, local56);
				}
			}
		}
	}

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
	public static String method1859(@OriginalArg(1) String arg0) {
		@Pc(14) int local14 = arg0.length();
		@Pc(17) char[] local17 = new char[local14];
		@Pc(19) byte local19 = 2;
		for (@Pc(21) int local21 = 0; local21 < local14; local21++) {
			@Pc(26) char local26 = arg0.charAt(local21);
			if (local19 == 0) {
				local26 = Character.toLowerCase(local26);
			} else if (local19 == 2 || Character.isUpperCase(local26)) {
				local26 = Static163.method3093(local26);
			}
			if (Character.isLetter(local26)) {
				local19 = 0;
			} else if (local26 == '.' || local26 == '?' || local26 == '!') {
				local19 = 2;
			} else if (!Character.isSpaceChar(local26)) {
				local19 = 1;
			} else if (local19 != 2) {
				local19 = 1;
			}
			local17[local21] = local26;
		}
		return new String(local17);
	}

	@OriginalMember(owner = "client!fm", name = "b", descriptor = "(II)V")
	public static void method1860(@OriginalArg(1) int arg0) {
		if (arg0 == Static343.anInt6504) {
			return;
		}
		Static15.anInt287 = Static325.anInt6173 = Static79.anIntArray282[arg0];
		Static128.aClass89_3.method5457(50, (int) ((double) Static15.anInt287 * 34.46D));
		Static42.anIntArrayArray16 = new int[Static15.anInt287][Static325.anInt6173];
		Static142.anIntArrayArrayArray10 = new int[4][Static15.anInt287 >> 3][Static325.anInt6173 >> 3];
		Static143.anIntArrayArray32 = new int[Static15.anInt287][Static325.anInt6173];
		for (@Pc(46) int local46 = 0; local46 < 4; local46++) {
			Static327.aClass149Array1[local46] = Static294.method5315(Static325.anInt6173, Static15.anInt287);
		}
		Static301.aByteArrayArrayArray11 = new byte[4][Static15.anInt287][Static325.anInt6173];
		Static241.method4151(Static325.anInt6173, Static15.anInt287);
		Static191.method3450(Static128.aClass89_3, Static325.anInt6173 >> 3, Static15.anInt287 >> 3);
		Static343.anInt6504 = arg0;
	}

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(Lclient!pe;)V")
	public static void method1862(@OriginalArg(0) Class89 arg0) {
		for (@Pc(1) int local1 = Static54.anInt1423; local1 < Static41.anInt1075; local1++) {
			for (@Pc(4) int local4 = 0; local4 < Static346.anInt6536; local4++) {
				for (@Pc(7) int local7 = 0; local7 < Static174.anInt3604; local7++) {
					@Pc(16) Class49 local16 = Static229.aClass49ArrayArrayArray6[local1][local4][local7];
					if (local16 != null) {
						@Pc(21) Class22_Sub4 local21 = local16.aClass22_Sub4_1;
						@Pc(24) Class22_Sub4 local24 = local16.aClass22_Sub4_2;
						if (local21 != null && local21.method5343()) {
							Static270.method4497(arg0, local21, local1, local4, local7, 1, 1);
							if (local24 != null && local24.method5343()) {
								Static270.method4497(arg0, local24, local1, local4, local7, 1, 1);
								local24.method5340(false, local21, arg0, 0, 0, 0);
								local24.method5338();
							}
							local21.method5338();
						}
						for (@Pc(70) Class47 local70 = local16.aClass47_3; local70 != null; local70 = local70.aClass47_2) {
							@Pc(74) Class22_Sub2 local74 = local70.aClass22_Sub2_1;
							if (local74 != null && local74.method5343()) {
								Static270.method4497(arg0, local74, local1, local4, local7, local74.aShort82 + 1 - local74.aShort83, local74.aShort84 - local74.aShort81 + 1);
								local74.method5338();
							}
						}
						@Pc(111) Class22_Sub1 local111 = local16.aClass22_Sub1_1;
						if (local111 != null && local111.method5343()) {
							Static266.method4451(arg0, local111, local1, local4, local7);
							local111.method5338();
						}
					}
				}
			}
		}
	}
}
