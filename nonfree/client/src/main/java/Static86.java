import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static86 {

	@OriginalMember(owner = "client!e", name = "a", descriptor = "Lclient!vl;")
	public static Class263 aClass263_34;

	@OriginalMember(owner = "client!e", name = "b", descriptor = "Lclient!uf;")
	public static Class248 aClass248_7;

	@OriginalMember(owner = "client!e", name = "d", descriptor = "Lclient!ok;")
	public static Class186 aClass186_4;

	@OriginalMember(owner = "client!e", name = "k", descriptor = "I")
	public static int anInt7437;

	@OriginalMember(owner = "client!e", name = "l", descriptor = "Lclient!l;")
	public static Interface4 anInterface4_11;

	@OriginalMember(owner = "client!e", name = "p", descriptor = "I")
	public static int anInt7441;

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(ZI)Lclient!mt;")
	public static Class165 method5980(@OriginalArg(1) int arg0) {
		@Pc(13) Class165[] local13 = Static127.method1563();
		for (@Pc(15) int local15 = 0; local15 < local13.length; local15++) {
			if (arg0 == local13[local15].anInt4667) {
				return local13[local15];
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!e", name = "b", descriptor = "(III)Z")
	public static boolean method5984(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x100) != 0;
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(ZLclient!jg;)V")
	public static void method5997(@OriginalArg(1) Class11_Sub1_Sub3 arg0) {
		if (arg0 instanceof Class11_Sub1_Sub3_Sub1) {
			@Pc(28) Class11_Sub1_Sub3_Sub1 local28 = (Class11_Sub1_Sub3_Sub1) arg0;
			if (local28.aClass272_1 != null) {
				Static210.method5860(local28.aByte90 != Static94.aClass11_Sub1_Sub3_Sub2_1.aByte90, local28);
			}
		} else if (arg0 instanceof Class11_Sub1_Sub3_Sub2) {
			@Pc(12) Class11_Sub1_Sub3_Sub2 local12 = (Class11_Sub1_Sub3_Sub2) arg0;
			Static222.method3205(local12, local12.aByte90 != Static94.aClass11_Sub1_Sub3_Sub2_1.aByte90);
		}
	}
}
