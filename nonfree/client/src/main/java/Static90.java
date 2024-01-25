import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static90 {

	@OriginalMember(owner = "client!da", name = "c", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray25;

	@OriginalMember(owner = "client!da", name = "i", descriptor = "Lclient!ha;")
	public static Class13 aClass13_18;

	@OriginalMember(owner = "client!da", name = "s", descriptor = "I")
	public static int anInt10121;

	@OriginalMember(owner = "client!da", name = "x", descriptor = "Lclient!hka;")
	public static Class3_Sub30 aClass3_Sub30_10;

	@OriginalMember(owner = "client!da", name = "n", descriptor = "Ljava/lang/String;")
	public static String aString119 = null;

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(CI)I")
	public static int method8848(@OriginalArg(0) char arg0) {
		return arg0 >= '\u0000' && arg0 < Class123.anIntArray355.length ? Class123.anIntArray355[arg0] : -1;
	}
}
