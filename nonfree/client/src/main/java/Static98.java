import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static98 {

	@OriginalMember(owner = "client!je", name = "c", descriptor = "I")
	public static int anInt2021;

	@OriginalMember(owner = "client!je", name = "k", descriptor = "I")
	public static int anInt2025;

	@OriginalMember(owner = "client!je", name = "o", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray8;

	@OriginalMember(owner = "client!je", name = "e", descriptor = "Lclient!b;")
	public static Class6 aClass6_55 = null;

	@OriginalMember(owner = "client!je", name = "i", descriptor = "I")
	public static int anInt2024 = -1;

	@OriginalMember(owner = "client!je", name = "p", descriptor = "Lclient!oc;")
	public static final Class70 aClass70_995 = Static193.method3027(" loggt sich ein)3");

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(ILclient!pb;)V")
	public static void method1409(@OriginalArg(1) Class3_Sub19 arg0) {
		arg0.aBoolean187 = false;
		if (arg0.aClass3_Sub24_5 != null) {
			arg0.aClass3_Sub24_5.anInt3684 = 0;
		}
		for (@Pc(21) Class3_Sub19 local21 = arg0.method3247(); local21 != null; local21 = arg0.method3246()) {
			method1409(local21);
		}
	}
}
