import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static95 {

	@OriginalMember(owner = "client!jf", name = "mb", descriptor = "Lclient!nb;")
	public static Class1_Sub1_Sub6_Sub1 aClass1_Sub1_Sub6_Sub1_5;

	@OriginalMember(owner = "client!jf", name = "hb", descriptor = "Lclient!kh;")
	private static Class60 aClass60_1151 = Static200.method3116("glow1:");

	@OriginalMember(owner = "client!jf", name = "T", descriptor = "Lclient!kh;")
	public static Class60 aClass60_1150 = aClass60_1151;

	@OriginalMember(owner = "client!jf", name = "Z", descriptor = "Lclient!ge;")
	public static Class39 aClass39_16 = new Class39(64);

	@OriginalMember(owner = "client!jf", name = "ib", descriptor = "Lclient!kh;")
	public static Class60 aClass60_1152 = aClass60_1151;

	@OriginalMember(owner = "client!jf", name = "kb", descriptor = "Lclient!eg;")
	public static Class1_Sub9_Sub1 aClass1_Sub9_Sub1_4 = new Class1_Sub9_Sub1(5000);

	@OriginalMember(owner = "client!jf", name = "lb", descriptor = "Lclient!kh;")
	public static Class60 aClass60_1153 = Static200.method3116(" x ");

	@OriginalMember(owner = "client!jf", name = "g", descriptor = "(I)V")
	public static void method2547() {
		if (Static124.anInt2765 < 128) {
			Static124.anInt2765 = 128;
		}
		if (Static124.anInt2765 > 383) {
			Static124.anInt2765 = 383;
		}
		Static31.anInt799 &= 0x7FF;
		@Pc(30) int local30 = Static44.anInt1007 >> 7;
		@Pc(32) int local32 = 0;
		@Pc(36) int local36 = Static218.anInt4727 >> 7;
		@Pc(42) int local42 = Static165.method2268(Static218.anInt4727, Static180.anInt3841, Static44.anInt1007);
		@Pc(60) int local60;
		if (local30 > 3 && local36 > 3 && local30 < 100 && local36 < 100) {
			for (local60 = local30 - 4; local60 <= local30 + 4; local60++) {
				for (@Pc(66) int local66 = local36 - 4; local66 <= local36 + 4; local66++) {
					@Pc(70) int local70 = Static180.anInt3841;
					if (local70 < 3 && (Static209.aByteArrayArrayArray13[1][local60][local66] & 0x2) == 2) {
						local70++;
					}
					@Pc(98) int local98 = local42 - Static138.anIntArrayArrayArray17[local70][local60][local66];
					if (local32 < local98) {
						local32 = local98;
					}
				}
			}
		}
		local60 = local32 * 192;
		if (local60 > 98048) {
			local60 = 98048;
		}
		if (local60 < 32768) {
			local60 = 32768;
		}
		if (Static52.anInt1421 < local60) {
			Static52.anInt1421 += (local60 - Static52.anInt1421) / 24;
		} else if (local60 < Static52.anInt1421) {
			Static52.anInt1421 += (local60 - Static52.anInt1421) / 80;
			return;
		}
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(IIII)I")
	public static int method2548(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) int local7 = arg2 & 0x3;
		if (local7 == 0) {
			return arg0;
		} else if (local7 == 1) {
			return 7 - arg1;
		} else if (local7 == 2) {
			return 7 - arg0;
		} else {
			return arg1;
		}
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(Ljava/awt/Component;III)Lclient!lj;")
	public static Class5 method2549(@OriginalArg(0) Component arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(11) Class local11 = Class.forName("Class5_Sub2");
			@Pc(15) Class5 local15 = (Class5) local11.getDeclaredConstructor().newInstance();
			local15.method1981(arg2, arg1, arg0);
			return local15;
		} catch (@Pc(24) Throwable local24) {
			@Pc(28) Class5_Sub1 local28 = new Class5_Sub1();
			local28.method1981(arg2, arg1, arg0);
			return local28;
		}
	}
}
