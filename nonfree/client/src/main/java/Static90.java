import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static90 {

	@OriginalMember(owner = "client!ec", name = "l", descriptor = "I")
	public static int anInt1755 = 765;

	@OriginalMember(owner = "client!ec", name = "m", descriptor = "Lclient!kc;")
	public static final Class134 aClass134_30 = new Class134("white:", "weiss:", "blanc:", "branco:");

	@OriginalMember(owner = "client!ec", name = "n", descriptor = "[I")
	public static int[] anIntArray136 = new int[2];

	@OriginalMember(owner = "client!ec", name = "o", descriptor = "[Lclient!wh;")
	public static final Class2_Sub5_Sub18[] aClass2_Sub5_Sub18Array1 = new Class2_Sub5_Sub18[14];

	@OriginalMember(owner = "client!ec", name = "p", descriptor = "Lclient!kc;")
	public static final Class134 aClass134_31 = new Class134("flash2:", "blinken2:", "clignotant2:", "flash2:");

	@OriginalMember(owner = "client!ec", name = "q", descriptor = "Lclient!rb;")
	public static final Class211 aClass211_43 = new Class211(76, 3);

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(Lclient!dk;ZLclient!dk;)I")
	public static int method1415(@OriginalArg(0) Class54 arg0, @OriginalArg(2) Class54 arg1) {
		@Pc(10) int local10 = 0;
		if (arg0.method1131(Static129.anInt2330)) {
			local10++;
		}
		if (arg0.method1131(Static224.anInt3665)) {
			local10++;
		}
		if (arg0.method1131(Static314.anInt5421)) {
			local10++;
		}
		if (arg1.method1131(Static129.anInt2330)) {
			local10++;
		}
		if (arg1.method1131(Static224.anInt3665)) {
			local10++;
		}
		if (arg1.method1131(Static314.anInt5421)) {
			local10++;
		}
		return local10;
	}

	@OriginalMember(owner = "client!ec", name = "c", descriptor = "(I)[Lclient!vr;")
	public static Class258[] method1419() {
		return new Class258[] { Static60.aClass258_1, Static368.aClass258_8, Static271.aClass258_5, Static107.aClass258_2, Static236.aClass258_6, Static168.aClass258_3 };
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(Lclient!at;Lclient!za;B)V")
	public static void method1421(@OriginalArg(0) Class16 arg0, @OriginalArg(1) Class163 arg1) {
		@Pc(31) boolean local31 = Static384.aClass164_2.method3453(arg1, arg0.aBoolean33 ? Static60.aClass3_Sub4_Sub1_Sub2_1.aClass249_1 : null, arg0.anInt292, arg0.anInt291, arg0.anInt297, arg0.anInt301, arg0.anInt260 | 0xFF000000) == null;
		if (local31) {
			Static297.aClass156_38.method3157(new Class2_Sub45(arg0.anInt301, arg0.anInt297, arg0.anInt292, arg0.anInt260 | 0xFF000000, arg0.anInt291, arg0.aBoolean33));
			Static176.method70(arg0);
		}
	}
}
