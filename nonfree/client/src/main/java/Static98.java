import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static98 {

	@OriginalMember(owner = "client!hd", name = "e", descriptor = "[I")
	public static int[] anIntArray146;

	@OriginalMember(owner = "client!hd", name = "b", descriptor = "Ljava/lang/String;")
	public static String aString71 = "Loaded input handler";

	@OriginalMember(owner = "client!hd", name = "d", descriptor = "Ljava/lang/String;")
	public static String aString72 = "";

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(III)Lclient!ea;")
	public static Class39 method1902(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class1_Sub16 local7 = Static254.aClass1_Sub16ArrayArrayArray3[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		} else {
			@Pc(14) Class39 local14 = local7.aClass39_1;
			local7.aClass39_1 = null;
			return local14;
		}
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(IIIIZ)V")
	public static void method1903(@OriginalArg(3) int arg0, @OriginalArg(4) boolean arg1) {
		Static220.anInt4129 = 104;
		Static298.anInt5372 = 104;
		Static161.anInt3224 = arg0;
		Static193.aClass1_Sub16ArrayArrayArray2 = new Class1_Sub16[4][Static220.anInt4129][Static298.anInt5372];
		Static24.anIntArrayArrayArray3 = new int[4][Static220.anInt4129 + 1][Static298.anInt5372 + 1];
		if (Static71.aBoolean165) {
			Static213.aClass1_Sub15ArrayArray37 = new Class1_Sub15[4][];
		}
		if (arg1) {
			Static184.aClass1_Sub16ArrayArrayArray1 = new Class1_Sub16[1][Static220.anInt4129][Static298.anInt5372];
			Static260.anIntArrayArray38 = new int[Static220.anInt4129][Static298.anInt5372];
			Static124.anIntArrayArrayArray5 = new int[1][Static220.anInt4129 + 1][Static298.anInt5372 + 1];
			if (Static71.aBoolean165) {
				Static142.aClass1_Sub15ArrayArray16 = new Class1_Sub15[1][];
			}
		} else {
			Static184.aClass1_Sub16ArrayArrayArray1 = null;
			Static260.anIntArrayArray38 = null;
			Static124.anIntArrayArrayArray5 = null;
			Static142.aClass1_Sub15ArrayArray16 = null;
		}
		Static47.method896(false);
		Static225.aClass59Array2 = new Class59[500];
		Static3.anInt118 = 0;
		Static173.aClass59Array1 = new Class59[500];
		Static183.anInt3512 = 0;
		Static9.anIntArrayArrayArray2 = new int[4][Static220.anInt4129 + 1][Static298.anInt5372 + 1];
		Static242.aClass45Array3 = new Class45[5000];
		Static79.anInt1733 = 0;
		Static80.aClass45Array1 = new Class45[100];
		Static279.aBooleanArrayArray3 = new boolean[Static161.anInt3224 + Static161.anInt3224 + 1][Static161.anInt3224 + Static161.anInt3224 + 1];
		Static142.aBooleanArrayArray2 = new boolean[Static161.anInt3224 + Static161.anInt3224 + 2][Static161.anInt3224 + Static161.anInt3224 + 2];
		Static199.aByteArrayArrayArray8 = new byte[4][Static220.anInt4129][Static298.anInt5372];
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(Lclient!nm;I)V")
	public static void method1904(@OriginalArg(0) Class119 arg0) {
		Static219.anInt4103 = arg0.method3241("p11_full");
		Static100.anInt5569 = arg0.method3241("p12_full");
		Static305.anInt5487 = arg0.method3241("b12_full");
		Static141.anInt2764 = arg0.method3241("hitmarks");
		Static44.anInt1028 = arg0.method3241("hitbar_default");
		Static129.anInt2557 = arg0.method3241("headicons_pk");
		Static143.anInt2792 = arg0.method3241("headicons_prayer");
		Static158.anInt3616 = arg0.method3241("hint_headicons");
		Static164.anInt3279 = arg0.method3241("hint_mapmarkers");
		Static125.anInt2514 = arg0.method3241("mapflag");
		Static267.anInt4947 = arg0.method3241("cross");
		Static194.anInt3875 = arg0.method3241("mapdots");
		Static47.anInt1068 = arg0.method3241("scrollbar");
		Static241.anInt4476 = arg0.method3241("name_icons");
		Static148.anInt3025 = arg0.method3241("floorshadows");
		Static310.anInt5538 = arg0.method3241("compass");
		Static16.anInt334 = arg0.method3241("hint_mapedge");
	}
}
