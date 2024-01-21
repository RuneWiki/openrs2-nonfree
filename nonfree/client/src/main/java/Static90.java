import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static90 {

	@OriginalMember(owner = "client!kh", name = "V", descriptor = "I")
	public static int anInt1923;

	@OriginalMember(owner = "client!kh", name = "Y", descriptor = "Lclient!ke;")
	public static Class45 aClass45_3;

	@OriginalMember(owner = "client!kh", name = "R", descriptor = "Lclient!rc;")
	public static Class74 aClass74_58 = new Class74(64);

	@OriginalMember(owner = "client!kh", name = "T", descriptor = "[I")
	public static int[] anIntArray192 = new int[2048];

	@OriginalMember(owner = "client!kh", name = "W", descriptor = "Lclient!lf;")
	public static Class49 aClass49_945 = Static32.method683("Begeben Sie sich in ein freies Gebiet)1 um");

	@OriginalMember(owner = "client!kh", name = "Z", descriptor = "I")
	public static int anInt1925 = 0;

	@OriginalMember(owner = "client!kh", name = "c", descriptor = "(III)V")
	public static void method1571() {
		for (@Pc(1) int local1 = 0; local1 < Static40.anInt978; local1++) {
			for (@Pc(4) int local4 = 0; local4 < Static91.anInt1931; local4++) {
				for (@Pc(7) int local7 = 0; local7 < Static59.anInt1256; local7++) {
					@Pc(16) Class2_Sub1 local16 = Static72.aClass2_Sub1ArrayArrayArray1[local1][local4][local7];
					if (local16 != null) {
						@Pc(21) Class7 local21 = local16.aClass7_1;
						if (local21 != null && local21.aClass2_Sub2_Sub3_1 instanceof Class2_Sub2_Sub3_Sub6) {
							@Pc(31) Class2_Sub2_Sub3_Sub6 local31 = (Class2_Sub2_Sub3_Sub6) local21.aClass2_Sub2_Sub3_1;
							Static41.method792(local31, local1, local4, local7, 1, 1);
							if (local21.aClass2_Sub2_Sub3_2 instanceof Class2_Sub2_Sub3_Sub6) {
								@Pc(46) Class2_Sub2_Sub3_Sub6 local46 = (Class2_Sub2_Sub3_Sub6) local21.aClass2_Sub2_Sub3_2;
								Static41.method792(local46, local1, local4, local7, 1, 1);
								Static119.method2019(local31, local46, 0, 0, 0, false);
								local21.aClass2_Sub2_Sub3_2 = local46.method2027(local46.aShort28, local46.aShort27, -50, -10, -50, false);
							}
							local21.aClass2_Sub2_Sub3_1 = local31.method2027(local31.aShort28, local31.aShort27, -50, -10, -50, false);
						}
						@Pc(104) Class2_Sub2_Sub3_Sub6 local104;
						for (@Pc(88) int local88 = 0; local88 < local16.anInt15; local88++) {
							@Pc(94) Class22 local94 = local16.aClass22Array1[local88];
							if (local94 != null && local94.aClass2_Sub2_Sub3_6 instanceof Class2_Sub2_Sub3_Sub6) {
								local104 = (Class2_Sub2_Sub3_Sub6) local94.aClass2_Sub2_Sub3_6;
								Static41.method792(local104, local1, local4, local7, local94.anInt983 + 1 - local94.anInt1000, local94.anInt999 - local94.anInt988 + 1);
								local94.aClass2_Sub2_Sub3_6 = local104.method2027(local104.aShort28, local104.aShort27, -50, -10, -50, false);
							}
						}
						@Pc(144) Class26 local144 = local16.aClass26_1;
						if (local144 != null && local144.aClass2_Sub2_Sub3_7 instanceof Class2_Sub2_Sub3_Sub6) {
							local104 = (Class2_Sub2_Sub3_Sub6) local144.aClass2_Sub2_Sub3_7;
							Static53.method927(local104, local1, local4, local7);
							local144.aClass2_Sub2_Sub3_7 = local104.method2027(local104.aShort28, local104.aShort27, -50, -10, -50, false);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(IBI)I")
	public static int method1572(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(42) int local42 = Static102.method1750(4, arg0 + 91923, arg1 + 45365) + (Static102.method1750(2, arg0 + 37821, arg1 - -10294) - 128 >> 1) + (Static102.method1750(1, arg0, arg1) + -128 >> 2) - 128;
		local42 = (int) ((double) local42 * 0.3D) + 35;
		if (local42 < 10) {
			local42 = 10;
		} else if (local42 > 60) {
			local42 = 60;
		}
		return local42;
	}

	@OriginalMember(owner = "client!kh", name = "d", descriptor = "(B)V")
	public static void method1573() {
		aClass49_945 = null;
		anIntArray192 = null;
		aClass45_3 = null;
		aClass74_58 = null;
	}
}
