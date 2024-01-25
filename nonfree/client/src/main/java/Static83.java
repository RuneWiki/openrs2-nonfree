import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static83 {

	@OriginalMember(owner = "client!fe", name = "d", descriptor = "Lclient!dp;")
	public static Class53 aClass53_41;

	@OriginalMember(owner = "client!fe", name = "g", descriptor = "[[B")
	public static byte[][] aByteArrayArray4;

	@OriginalMember(owner = "client!fe", name = "b", descriptor = "Lclient!jj;")
	public static final Class108 aClass108_14 = new Class108(16);

	@OriginalMember(owner = "client!fe", name = "h", descriptor = "I")
	public static final int anInt1517 = -11713997;

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(BII)I")
	public static int method1390(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(18) Class6_Sub38 local18 = (Class6_Sub38) Static297.aClass108_31.method2900((long) arg0);
		if (local18 == null) {
			return 0;
		} else if (arg1 >= 0 && local18.anIntArray652.length > arg1) {
			return local18.anIntArray652[arg1];
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(I)V")
	public static void method1391() {
		Static214.method3832();
		Static167.method3293();
		Static175.method3405();
		Static124.method2460();
		Static242.method4251();
		Static271.method4597();
		Static69.method421();
		Static156.method5552();
		Static252.method4322();
		Static221.method3914();
		Static94.method1708();
		Static152.method3079();
		Static200.method3640();
		Static139.method2651();
		Static33.method509();
		Static117.method2382();
		Static270.method4575();
		Static345.method5700();
		Static113.method2275();
		Static23.method357();
		Static82.method1378();
		Static297.method5066();
		if (Static285.anInt5397 != 0) {
			for (@Pc(57) int local57 = 0; local57 < Static5.aByteArrayArray1.length; local57++) {
				Static5.aByteArrayArray1[local57] = null;
			}
			Static141.anInt2540 = 0;
		}
		Static253.method4341();
		Static341.method5620();
		Static236.method2523();
		Static171.method3327();
		Static53.method886();
		Static140.aClass70_49.method1399();
		Static289.aClass81_7.method3045();
		Static91.aClass31_8.method636();
		Static306.method5248();
		Static127.aClass53_105.method1021();
		Static87.aClass53_42.method1021();
		Static114.aClass53_62.method1021();
		Static129.aClass53_75.method1021();
		Static15.aClass53_14.method1021();
		Static71.aClass53_36.method1021();
		Static244.aClass53_116.method1021();
		Static17.aClass53_155.method1021();
		Static269.aClass53_124.method1021();
		Static244.aClass53_115.method1021();
		Static73.aClass53_38.method1021();
		Static243.aClass53_113.method1021();
		Static109.aClass53_55.method1021();
		Static5.aClass53_8.method1021();
		Static306.aClass53_142.method1021();
		Static350.aClass53_159.method1021();
		Static282.aClass53_130.method1021();
		Static284.aClass53_131.method1021();
		Static128.aClass53_74.method1021();
		Static110.aClass53_57.method1021();
		Static111.aClass53_59.method1021();
		Static291.aClass53_133.method1021();
		Static276.aClass53_128.method1021();
		Static138.aClass53_114.method1021();
		Static238.aClass53_126.method1021();
		Static27.aClass53_24.method1021();
		Static250.aClass53_22.method1021();
		Static160.aClass53_88.method1021();
		Static179.aClass53_93.method1021();
		Static132.aClass70_43.method1399();
		Static226.aClass70_75.method1399();
		Static323.aClass70_102.method1399();
		Static133.aClass70_45.method1399();
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(I[B)[B")
	public static byte[] method1392(@OriginalArg(1) byte[] arg0) {
		if (arg0 == null) {
			return null;
		} else {
			@Pc(16) byte[] local16 = new byte[arg0.length];
			Static358.method954(arg0, 0, local16, 0, arg0.length);
			return local16;
		}
	}
}
