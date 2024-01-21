import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static94 {

	@OriginalMember(owner = "client!jf", name = "t", descriptor = "Lclient!le;")
	public static Class1_Sub2_Sub8_Sub2 aClass1_Sub2_Sub8_Sub2_3;

	@OriginalMember(owner = "client!jf", name = "s", descriptor = "Lclient!ri;")
	public static final Class86 aClass86_34 = new Class86(64);

	@OriginalMember(owner = "client!jf", name = "u", descriptor = "I")
	public static int anInt2170 = 0;

	@OriginalMember(owner = "client!jf", name = "v", descriptor = "I")
	public static int anInt2171 = 0;

	@OriginalMember(owner = "client!jf", name = "y", descriptor = "Lclient!dj;")
	public static final Class24 aClass24_643 = Static81.method1507("Ihre Ignorieren)2Liste ist voll)1 Sie k-Onnen nur 100 Spieler darauf eintragen)3");

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(III)V")
	public static void method1690(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class1_Sub8 local7 = Static29.aClass1_Sub8ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 != null) {
			local7.aClass81_1 = null;
		}
	}

	@OriginalMember(owner = "client!jf", name = "d", descriptor = "(I)V")
	public static void method1692() {
		if (Static30.aBoolean35 && Static170.anInt3799 != Static80.anInt1910) {
			Static207.method3167(Static115.anInt2583, Static87.aClass5_Sub2_Sub1_1.anIntArray196[0], Static120.anInt2672, Static87.aClass5_Sub2_Sub1_1.anIntArray199[0], Static170.anInt3799);
		} else if (Static170.anInt3799 != Static179.anInt3975) {
			Static179.anInt3975 = Static170.anInt3799;
			Static161.method2727(Static170.anInt3799);
		}
	}
}
