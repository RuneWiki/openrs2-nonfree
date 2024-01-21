import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static83 {

	@OriginalMember(owner = "client!ii", name = "c", descriptor = "I")
	public static int anInt2028;

	@OriginalMember(owner = "client!ii", name = "j", descriptor = "I")
	public static int anInt2032;

	@OriginalMember(owner = "client!ii", name = "l", descriptor = "[[[Lclient!gg;")
	public static Class1_Sub7[][][] aClass1_Sub7ArrayArrayArray1;

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "Lclient!oc;")
	public static final Class65 aClass65_1221 = Static118.method2249(" loggt sich ein)3");

	@OriginalMember(owner = "client!ii", name = "d", descriptor = "[Lclient!n;")
	public static final Class57[] aClass57Array1 = new Class57[4];

	@OriginalMember(owner = "client!ii", name = "e", descriptor = "Lclient!oc;")
	public static final Class65 aClass65_1222 = Static118.method2249("titlebox");

	@OriginalMember(owner = "client!ii", name = "f", descriptor = "Lclient!oc;")
	public static Class65 aClass65_1223 = null;

	@OriginalMember(owner = "client!ii", name = "g", descriptor = "I")
	public static int anInt2029 = -1;

	@OriginalMember(owner = "client!ii", name = "m", descriptor = "[Lclient!q;")
	public static final Class73[] aClass73Array1 = new Class73[500];

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(IB[Lclient!wd;)V")
	public static void method1442(@OriginalArg(0) int arg0, @OriginalArg(2) Class97[] arg1) {
		for (@Pc(12) int local12 = 0; local12 < arg1.length; local12++) {
			@Pc(18) Class97 local18 = arg1[local12];
			if (local18 != null && arg0 == local18.anInt4319 && (!local18.aBoolean181 || !Static16.method300(local18))) {
				if (local18.anInt4329 == 0) {
					if (!local18.aBoolean181 && Static16.method300(local18) && local18 != Static204.aClass97_16) {
						continue;
					}
					method1442(local18.anInt4376, arg1);
					if (local18.aClass97Array2 != null) {
						method1442(local18.anInt4376, local18.aClass97Array2);
					}
					@Pc(73) Class1_Sub20 local73 = (Class1_Sub20) Static200.aClass99_14.method3292((long) local18.anInt4376);
					if (local73 != null) {
						Static154.method2697(local73.anInt3111);
					}
				}
				if (local18.anInt4329 == 6) {
					@Pc(101) int local101;
					if (local18.anInt4381 != -1 || local18.anInt4351 != -1) {
						@Pc(96) boolean local96 = Static192.method3158(local18);
						if (local96) {
							local101 = local18.anInt4351;
						} else {
							local101 = local18.anInt4381;
						}
						if (local101 != -1) {
							@Pc(114) Class1_Sub2_Sub14 local114 = Static173.method2924(local101);
							if (local114 != null) {
								local18.anInt4328 += Static160.anInt2781;
								while (local18.anInt4328 > local114.anIntArray282[local18.anInt4316]) {
									local18.anInt4328 -= local114.anIntArray282[local18.anInt4316];
									local18.anInt4316++;
									if (local114.anIntArray284.length <= local18.anInt4316) {
										local18.anInt4316 -= local114.anInt2497;
										if (local18.anInt4316 < 0 || local114.anIntArray284.length <= local18.anInt4316) {
											local18.anInt4316 = 0;
										}
									}
									Static25.method448(local18);
								}
							}
						}
					}
					if (local18.anInt4311 != 0 && !local18.aBoolean181) {
						@Pc(198) int local198 = local18.anInt4311 >> 16;
						@Pc(202) int local202 = local198 * Static160.anInt2781;
						local101 = local18.anInt4311 << 16 >> 16;
						local18.anInt4370 = local202 + local18.anInt4370 & 0x7FF;
						local101 *= Static160.anInt2781;
						local18.anInt4380 = local101 + local18.anInt4380 & 0x7FF;
						Static25.method448(local18);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(Lclient!oc;ILclient!oc;Lclient!sd;)[Lclient!cg;")
	public static Class1_Sub2_Sub5_Sub1[] method1443(@OriginalArg(0) Class65 arg0, @OriginalArg(2) Class65 arg1, @OriginalArg(3) Class60 arg2) {
		@Pc(8) int local8 = arg2.method2328(arg1);
		@Pc(14) int local14 = arg2.method2333(arg0, local8);
		return Static42.method716(arg2, local14, local8);
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(I)I")
	public static int method1444() {
		return 6;
	}
}
