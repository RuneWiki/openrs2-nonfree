import java.awt.Image;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static96 {

	@OriginalMember(owner = "client!ua", name = "c", descriptor = "Ljava/awt/Image;")
	public static Image anImage4;

	@OriginalMember(owner = "client!ua", name = "f", descriptor = "Lclient!m;")
	public static Class10_Sub1_Sub1_Sub2 aClass10_Sub1_Sub1_Sub2_23;

	@OriginalMember(owner = "client!ua", name = "m", descriptor = "[I")
	public static int[] anIntArray321;

	@OriginalMember(owner = "client!ua", name = "n", descriptor = "Z")
	public static boolean aBoolean113;

	@OriginalMember(owner = "client!ua", name = "o", descriptor = "I")
	public static int anInt2449;

	@OriginalMember(owner = "client!ua", name = "l", descriptor = "Lclient!va;")
	private static Class61 aClass61_983 = Static88.method1421("Loading interfaces )2 ");

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "Lclient!va;")
	public static Class61 aClass61_980 = aClass61_983;

	@OriginalMember(owner = "client!ua", name = "b", descriptor = "Z")
	public static boolean aBoolean112 = false;

	@OriginalMember(owner = "client!ua", name = "e", descriptor = "Lclient!va;")
	private static Class61 aClass61_982 = Static88.method1421("Loading fonts )2 ");

	@OriginalMember(owner = "client!ua", name = "d", descriptor = "Lclient!va;")
	public static Class61 aClass61_981 = aClass61_982;

	@OriginalMember(owner = "client!ua", name = "g", descriptor = "Lclient!n;")
	public static Applet_Sub1 anApplet_Sub1_1 = null;

	@OriginalMember(owner = "client!ua", name = "i", descriptor = "[I")
	public static int[] anIntArray320 = new int[4000];

	@OriginalMember(owner = "client!ua", name = "j", descriptor = "I")
	public static int anInt2447 = 0;

	@OriginalMember(owner = "client!ua", name = "k", descriptor = "I")
	public static int anInt2448 = -1;

	@OriginalMember(owner = "client!ua", name = "p", descriptor = "I")
	public static int anInt2450 = 0;

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(I)V")
	public static void method1512() {
		aClass10_Sub1_Sub1_Sub2_23 = null;
		aClass61_980 = null;
		aClass61_981 = null;
		anIntArray321 = null;
		aClass61_983 = null;
		anIntArray320 = null;
		aClass61_982 = null;
		anImage4 = null;
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(ZI)[B")
	public static synchronized byte[] method1513(@OriginalArg(1) int arg0) {
		@Pc(26) byte[] local26;
		if (arg0 == 100 && Static65.anInt1750 > 0) {
			local26 = Static18.aByteArrayArray6[--Static65.anInt1750];
			Static18.aByteArrayArray6[Static65.anInt1750] = null;
			return local26;
		} else if (arg0 == 5000 && Static26.anInt1677 > 0) {
			local26 = Static33.aByteArrayArray7[--Static26.anInt1677];
			Static33.aByteArrayArray7[Static26.anInt1677] = null;
			return local26;
		} else if (arg0 == 30000 && Static83.anInt2229 > 0) {
			local26 = Static16.aByteArrayArray5[--Static83.anInt2229];
			Static16.aByteArrayArray5[Static83.anInt2229] = null;
			return local26;
		} else {
			return new byte[arg0];
		}
	}
}
