import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static97 {

	@OriginalMember(owner = "client!jh", name = "e", descriptor = "Lclient!ai;")
	public static Class7 aClass7_19;

	@OriginalMember(owner = "client!jh", name = "f", descriptor = "[I")
	public static int[] anIntArray263;

	@OriginalMember(owner = "client!jh", name = "i", descriptor = "I")
	public static int anInt2259;

	@OriginalMember(owner = "client!jh", name = "k", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray2;

	@OriginalMember(owner = "client!jh", name = "m", descriptor = "I")
	public static int anInt2261;

	@OriginalMember(owner = "client!jh", name = "n", descriptor = "Lclient!kb;")
	public static Class55 aClass55_2;

	@OriginalMember(owner = "client!jh", name = "d", descriptor = "Lclient!kh;")
	public static Class60 aClass60_733 = Static200.method3116("Versteckt");

	@OriginalMember(owner = "client!jh", name = "h", descriptor = "Lclient!kh;")
	public static Class60 aClass60_734 = Static200.method3116("Fehler beim Laden Ihres Spielcharakters)3");

	@OriginalMember(owner = "client!jh", name = "j", descriptor = "Lclient!kh;")
	public static Class60 aClass60_735 = Static200.method3116(" )2> <col=ffffff>");

	@OriginalMember(owner = "client!jh", name = "p", descriptor = "Lclient!kh;")
	public static Class60 aClass60_736 = Static200.method3116("Um ein neues Spielkonto zu erstellen)1 m-Ussen Sie");

	@OriginalMember(owner = "client!jh", name = "r", descriptor = "[Lclient!kh;")
	public static Class60[] aClass60Array14 = new Class60[100];

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(ZI)V")
	public static void method1670() {
		@Pc(9) byte[][] local9 = Static12.aByteArrayArray1;
		for (@Pc(11) int local11 = 0; local11 < 4; local11++) {
			Static84.method1044();
			for (@Pc(17) int local17 = 0; local17 < 13; local17++) {
				for (@Pc(21) int local21 = 0; local21 < 13; local21++) {
					@Pc(31) int local31 = Static145.anIntArrayArrayArray12[local11][local17][local21];
					if (local31 != -1) {
						@Pc(41) int local41 = local31 >> 24 & 0x3;
						@Pc(54) int local54 = local31 >> 1 & 0x3;
						@Pc(60) int local60 = local31 >> 14 & 0x3FF;
						@Pc(66) int local66 = local31 >> 3 & 0x7FF;
						@Pc(76) int local76 = (local60 / 8 << 8) + local66 / 8;
						for (@Pc(78) int local78 = 0; local78 < Static193.anIntArray536.length; local78++) {
							if (local76 == Static193.anIntArray536[local78] && local9[local78] != null) {
								Static46.method798(local11, local9[local78], local41, (local60 & 0x7) * 8, (local66 & 0x7) * 8, local17 * 8, Static153.aClass3Array1, local21 * 8, local54);
								break;
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(IZILclient!sj;)V")
	public static void method1672(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class9_Sub4_Sub2 arg2) {
		if (arg2.anInt3896 == arg1 && arg1 != -1) {
			@Pc(20) Class1_Sub1_Sub21 local20 = Static74.method1343(arg1);
			@Pc(23) int local23 = local20.anInt3434;
			if (local23 == 1) {
				arg2.anInt3948 = 0;
				arg2.anInt3906 = arg0;
				arg2.anInt3924 = 0;
				arg2.anInt3899 = 0;
				Static90.method1562(arg2.anInt3925, arg2.anInt3948, false, local20, arg2.anInt3903);
			}
			if (local23 == 2) {
				arg2.anInt3924 = 0;
				return;
			}
		} else if (arg1 == -1 || arg2.anInt3896 == -1 || Static74.method1343(arg1).anInt3440 >= Static74.method1343(arg2.anInt3896).anInt3440) {
			arg2.anInt3943 = arg2.anInt3946;
			arg2.anInt3896 = arg1;
			arg2.anInt3924 = 0;
			arg2.anInt3948 = 0;
			arg2.anInt3906 = arg0;
			arg2.anInt3899 = 0;
			if (arg2.anInt3896 == -1) {
				return;
			}
			Static90.method1562(arg2.anInt3925, arg2.anInt3948, false, Static74.method1343(arg2.anInt3896), arg2.anInt3903);
		}
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(B)V")
	public static void method1673() {
		for (@Pc(15) Class1_Sub1_Sub25 local15 = (Class1_Sub1_Sub25) Static107.aClass19_10.method609(); local15 != null; local15 = (Class1_Sub1_Sub25) Static107.aClass19_10.method615()) {
			@Pc(20) Class9_Sub6 local20 = local15.aClass9_Sub6_1;
			if (local20.anInt3508 != Static180.anInt3841 || local20.aBoolean194) {
				local15.method3530();
			} else if (Static42.anInt910 >= local20.anInt3498) {
				local20.method2650(Static26.anInt594);
				if (local20.aBoolean194) {
					local15.method3530();
				} else {
					Static54.method1049(local20.anInt3508, local20.anInt3501, local20.anInt3513, local20.anInt3502, 60, local20, 0, -1L, false);
				}
			}
		}
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(ZLjava/lang/Object;Z)[B")
	public static byte[] method1676(@OriginalArg(0) boolean arg0, @OriginalArg(1) Object arg1) {
		if (arg1 == null) {
			return null;
		} else if (arg1 instanceof byte[]) {
			@Pc(18) byte[] local18 = (byte[]) arg1;
			return arg0 ? Static184.method2915(local18) : local18;
		} else if (arg1 instanceof Class54) {
			@Pc(32) Class54 local32 = (Class54) arg1;
			return local32.method2718();
		} else {
			throw new IllegalArgumentException();
		}
	}
}
