import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static91 {

	@OriginalMember(owner = "client!qc", name = "r", descriptor = "I")
	public static int anInt2546;

	@OriginalMember(owner = "client!qc", name = "B", descriptor = "Lclient!sc;")
	public static Class5_Sub2_Sub6_Sub4 aClass5_Sub2_Sub6_Sub4_37;

	@OriginalMember(owner = "client!qc", name = "c", descriptor = "Ljava/math/BigInteger;")
	public static BigInteger aBigInteger1 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

	@OriginalMember(owner = "client!qc", name = "d", descriptor = "Lclient!mb;")
	public static Class45 aClass45_1060 = Static63.method1251(":0");

	@OriginalMember(owner = "client!qc", name = "k", descriptor = "I")
	public static int anInt2541 = 0;

	@OriginalMember(owner = "client!qc", name = "p", descriptor = "[[S")
	public static short[][] aShortArrayArray1 = new short[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433, 2983, -11343 }, { 8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 25239 }, { 25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

	@OriginalMember(owner = "client!qc", name = "q", descriptor = "Lclient!mb;")
	public static Class45 aClass45_1061 = Static63.method1251("::gc");

	@OriginalMember(owner = "client!qc", name = "s", descriptor = "Lclient!mb;")
	private static Class45 aClass45_1062 = Static63.method1251("Existing user");

	@OriginalMember(owner = "client!qc", name = "z", descriptor = "Lclient!mb;")
	private static Class45 aClass45_1068 = Static63.method1251("flash2:");

	@OriginalMember(owner = "client!qc", name = "t", descriptor = "Lclient!mb;")
	public static Class45 aClass45_1063 = aClass45_1068;

	@OriginalMember(owner = "client!qc", name = "u", descriptor = "Lclient!mb;")
	public static Class45 aClass45_1064 = aClass45_1062;

	@OriginalMember(owner = "client!qc", name = "v", descriptor = "Lclient!mb;")
	public static Class45 aClass45_1065 = Static63.method1251("Verbindung mit Update)2Server)3)3)3");

	@OriginalMember(owner = "client!qc", name = "w", descriptor = "Lclient!mb;")
	public static Class45 aClass45_1066 = Static63.method1251("Wir vermuten)1 dass jemand Ihr Passwort kennt)3");

	@OriginalMember(owner = "client!qc", name = "x", descriptor = "Lclient!mb;")
	public static Class45 aClass45_1067 = Static63.method1251("Mem:");

	@OriginalMember(owner = "client!qc", name = "y", descriptor = "I")
	public static volatile int anInt2547 = 0;

	@OriginalMember(owner = "client!qc", name = "A", descriptor = "Lclient!mb;")
	public static Class45 aClass45_1069 = Static63.method1251("backright2");

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(IIBII[BI[Lclient!jc;ILclient!i;I)V")
	public static void method1706(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) byte[] arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class37[] arg6, @OriginalArg(8) int arg7, @OriginalArg(9) Class34 arg8, @OriginalArg(10) int arg9) {
		@Pc(6) Class5_Sub9 local6 = new Class5_Sub9(arg4);
		@Pc(8) int local8 = -1;
		while (true) {
			@Pc(21) int local21 = local6.method1417();
			if (local21 == 0) {
				return;
			}
			local8 += local21;
			@Pc(29) int local29 = 0;
			while (true) {
				@Pc(33) int local33 = local6.method1417();
				if (local33 == 0) {
					break;
				}
				local29 += local33 - 1;
				@Pc(48) int local48 = local29 & 0x3F;
				@Pc(54) int local54 = local29 >> 6 & 0x3F;
				@Pc(58) int local58 = local29 >> 12;
				@Pc(62) int local62 = local6.method1408();
				@Pc(66) int local66 = local62 >> 2;
				@Pc(70) int local70 = local62 & 0x3;
				if (arg0 == local58 && arg3 <= local54 && arg3 + 8 > local54 && arg2 <= local48 && arg2 + 8 > local48) {
					@Pc(109) Class5_Sub2_Sub7 local109 = Static62.method1232(local8);
					@Pc(126) int local126 = Static37.method795(arg1, local109.anInt829, local48 & 0x7, local54 & 0x7, local109.anInt839, local70) + arg7;
					@Pc(143) int local143 = Static6.method118(local109.anInt829, arg1, local109.anInt839, local54 & 0x7, local48 & 0x7, local70) + arg5;
					if (local126 > 0 && local143 > 0 && local126 < 103 && local143 < 103) {
						@Pc(163) int local163 = arg9;
						if ((Static48.aByteArrayArrayArray3[1][local126][local143] & 0x2) == 2) {
							local163 = arg9 - 1;
						}
						@Pc(179) Class37 local179 = null;
						if (local163 >= 0) {
							local179 = arg6[local163];
						}
						Static55.method1155(local126, local143, arg8, local179, arg9, local8, arg1 + local70 & 0x3, local66);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(B)V")
	public static void method1707() {
		Static87.aClass66_8 = new Class66(32);
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(I)V")
	public static void method1708() {
		aClass45_1065 = null;
		aShortArrayArray1 = null;
		aClass45_1062 = null;
		aClass45_1069 = null;
		aClass45_1068 = null;
		aClass45_1066 = null;
		aClass5_Sub2_Sub6_Sub4_37 = null;
		aClass45_1067 = null;
		aBigInteger1 = null;
		aClass45_1064 = null;
		aClass45_1060 = null;
		aClass45_1061 = null;
		aClass45_1063 = null;
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(BZLclient!df;Lclient!sd;Lclient!sd;)V")
	public static void method1709(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class5_Sub2_Sub6_Sub1 arg1, @OriginalArg(3) Class29 arg2, @OriginalArg(4) Class29 arg3) {
		Static80.aClass29_53 = arg3;
		Static77.aClass29_51 = arg2;
		Static8.aBoolean8 = arg0;
		Static70.anInt2008 = Static80.aClass29_53.method737(10);
		Static30.aClass5_Sub2_Sub6_Sub1_3 = arg1;
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(IB)Lclient!ua;")
	public static Class5_Sub2_Sub15 method1710(@OriginalArg(0) int arg0) {
		@Pc(15) Class5_Sub2_Sub15 local15 = (Class5_Sub2_Sub15) Static40.aClass67_11.method1823((long) arg0);
		if (local15 != null) {
			return local15;
		}
		@Pc(25) byte[] local25 = Static114.aClass29_79.method733(arg0, 13);
		local15 = new Class5_Sub2_Sub15();
		local15.anInt2867 = arg0;
		if (local25 != null) {
			local15.method1964(new Class5_Sub9(local25));
		}
		Static40.aClass67_11.method1818(local15, (long) arg0);
		return local15;
	}
}
