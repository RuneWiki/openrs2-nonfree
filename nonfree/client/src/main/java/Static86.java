import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static86 {

	@OriginalMember(owner = "client!ne", name = "f", descriptor = "I")
	public static int anInt2319;

	@OriginalMember(owner = "client!ne", name = "g", descriptor = "Lclient!vf;")
	public static Class80 aClass80_2;

	@OriginalMember(owner = "client!ne", name = "l", descriptor = "I")
	public static int anInt2322;

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "Lclient!r;")
	public static Class61 aClass61_673 = null;

	@OriginalMember(owner = "client!ne", name = "c", descriptor = "[I")
	public static int[] anIntArray294 = new int[500];

	@OriginalMember(owner = "client!ne", name = "d", descriptor = "Lclient!r;")
	private static Class61 aClass61_674 = Static129.method2060("scroll:");

	@OriginalMember(owner = "client!ne", name = "i", descriptor = "Lclient!ke;")
	public static Class5_Sub11 aClass5_Sub11_8 = null;

	@OriginalMember(owner = "client!ne", name = "j", descriptor = "Lclient!r;")
	public static Class61 aClass61_675 = aClass61_674;

	@OriginalMember(owner = "client!ne", name = "n", descriptor = "Lclient!r;")
	public static Class61 aClass61_676 = aClass61_674;

	@OriginalMember(owner = "client!ne", name = "o", descriptor = "Lclient!r;")
	public static Class61 aClass61_677 = Static129.method2060("Anmelde)2Limit -Uberschritten)3");

	@OriginalMember(owner = "client!ne", name = "p", descriptor = "Lclient!r;")
	public static Class61 aClass61_678 = Static129.method2060("mapmarker");

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(I)[Lclient!vd;")
	public static Class5_Sub2_Sub1_Sub4[] method1530() {
		@Pc(4) Class5_Sub2_Sub1_Sub4[] local4 = new Class5_Sub2_Sub1_Sub4[anInt2319];
		for (@Pc(10) int local10 = 0; local10 < anInt2319; local10++) {
			@Pc(23) Class5_Sub2_Sub1_Sub4 local23 = new Class5_Sub2_Sub1_Sub4();
			local23.anInt3196 = Static93.anInt2432;
			local23.anInt3195 = Static92.anInt2249;
			local23.anInt3191 = Static129.anIntArray393[local10];
			local23.anInt3193 = Static48.anIntArray190[local10];
			local23.anInt3194 = Static58.anIntArray212[local10];
			local23.anInt3192 = Static50.anIntArray191[local10];
			@Pc(53) byte[] local53 = Static67.aByteArrayArray7[local10];
			@Pc(59) int local59 = local23.anInt3192 * local23.anInt3194;
			local23.anIntArray386 = new int[local59];
			for (@Pc(65) int local65 = 0; local65 < local59; local65++) {
				local23.anIntArray386[local65] = Static108.anIntArray19[local53[local65] & 0xFF];
			}
			local4[local10] = local23;
		}
		Static87.method1546();
		return local4;
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(B)V")
	public static void method1531() {
		aClass61_676 = null;
		aClass5_Sub11_8 = null;
		aClass61_674 = null;
		aClass61_677 = null;
		aClass61_675 = null;
		anIntArray294 = null;
		aClass61_673 = null;
		aClass61_678 = null;
		aClass80_2 = null;
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(BI)Lclient!r;")
	public static Class61 method1532(@OriginalArg(1) int arg0) {
		return Static107.aClass61Array19[arg0].method1733() <= 0 ? Static123.aClass61Array23[arg0] : Static123.method1929(new Class61[] { Static123.aClass61Array23[arg0], Static78.aClass61_603, Static107.aClass61Array19[arg0] });
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(III[Lclient!r;)Lclient!r;")
	public static Class61 method1533(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class61[] arg2) {
		@Pc(1) int local1 = 0;
		for (@Pc(3) int local3 = 0; local3 < arg1; local3++) {
			if (arg2[local3 + arg0] == null) {
				arg2[arg0 + local3] = Static98.aClass61_761;
			}
			local1 += arg2[local3 + arg0].anInt2675;
		}
		@Pc(44) byte[] local44 = new byte[local1];
		@Pc(46) int local46 = 0;
		@Pc(56) Class61 local56;
		for (@Pc(48) int local48 = 0; local48 < arg1; local48++) {
			local56 = arg2[arg0 + local48];
			Static136.method893(local56.aByteArray38, 0, local44, local46, local56.anInt2675);
			local46 += local56.anInt2675;
		}
		local56 = new Class61();
		local56.aByteArray38 = local44;
		local56.anInt2675 = local1;
		return local56;
	}

	@OriginalMember(owner = "client!ne", name = "b", descriptor = "(B)V")
	public static void method1534() {
		@Pc(1) Object local1 = Static77.anObject4;
		synchronized (Static77.anObject4) {
			if (Static32.anInt954 == 0) {
				aClass80_2.method2040(new Class51(), 5);
			}
			Static32.anInt954 = 600;
		}
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(Lclient!r;I)V")
	public static void method1535(@OriginalArg(0) Class61 arg0) {
		if (Static88.aClass5_Sub12Array62 == null) {
			return;
		}
		@Pc(12) long local12 = arg0.method1723();
		@Pc(14) int local14 = 0;
		if (local12 == 0L) {
			return;
		}
		while (local14 < Static88.aClass5_Sub12Array62.length && Static88.aClass5_Sub12Array62[local14].aLong100 != local12) {
			local14++;
		}
		if (Static88.aClass5_Sub12Array62.length > local14 && Static88.aClass5_Sub12Array62[local14] != null) {
			Static1.aClass5_Sub14_Sub1_1.method1489(50);
			Static1.aClass5_Sub14_Sub1_1.method1464(Static88.aClass5_Sub12Array62[local14].aLong100);
		}
	}
}
