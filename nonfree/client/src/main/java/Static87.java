import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static87 {

	@OriginalMember(owner = "client!pe", name = "n", descriptor = "Lclient!jd;")
	public static Class11 aClass11_100;

	@OriginalMember(owner = "client!pe", name = "w", descriptor = "I")
	public static int anInt2495;

	@OriginalMember(owner = "client!pe", name = "i", descriptor = "Lclient!mb;")
	private static Class45 aClass45_1037 = Static63.method1251("Please contact customer support)3");

	@OriginalMember(owner = "client!pe", name = "f", descriptor = "Lclient!mb;")
	public static Class45 aClass45_1036 = aClass45_1037;

	@OriginalMember(owner = "client!pe", name = "j", descriptor = "Lclient!mb;")
	public static Class45 aClass45_1038 = Static63.method1251("Regelversto-8 melden");

	@OriginalMember(owner = "client!pe", name = "o", descriptor = "Lclient!s;")
	public static Class66 aClass66_8 = new Class66(32);

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(BI)Z")
	public static boolean method1680(@OriginalArg(1) int arg0) {
		return (arg0 >> 21 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(IIIIII[BI[Lclient!jc;I)V")
	public static void method1682(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(8) Class37[] arg7, @OriginalArg(9) int arg8) {
		for (@Pc(11) int local11 = 0; local11 < 8; local11++) {
			for (@Pc(15) int local15 = 0; local15 < 8; local15++) {
				if (arg2 + local11 > 0 && local11 + arg2 < 103 && local15 + arg3 > 0 && arg3 + local15 < 103) {
					arg7[arg0].anIntArrayArray19[arg2 + local11][local15 + arg3] &= 0xFEFFFFFF;
				}
			}
		}
		@Pc(88) Class5_Sub9 local88 = new Class5_Sub9(arg6);
		for (@Pc(90) int local90 = 0; local90 < 4; local90++) {
			for (@Pc(94) int local94 = 0; local94 < 64; local94++) {
				for (@Pc(98) int local98 = 0; local98 < 64; local98++) {
					if (arg4 == local90 && local94 >= arg8 && local94 < arg8 + 8 && arg5 <= local98 && local98 < arg5 + 8) {
						Static101.method747(arg0, Static92.method2113(arg1, local98 & 0x7, local94 & 0x7) + arg3, 0, arg1, local88, arg2 + Static37.method791(arg1, local98 & 0x7, local94 & 0x7), 0);
					} else {
						Static101.method747(0, -1, 0, 0, local88, -1, 0);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(I)V")
	public static void method1683() {
		if (Static28.anInt881 != 1) {
			return;
		}
		if (Static67.anInt1906 >= 539 && Static67.anInt1906 <= 573 && Static36.anInt1063 >= 169 && Static36.anInt1063 < 205 && Static57.anIntArray262[0] != -1) {
			Static78.aBoolean102 = true;
			Static53.anInt2372 = 0;
			Static72.aBoolean99 = true;
		}
		if (Static67.anInt1906 >= 569 && Static67.anInt1906 <= 599 && Static36.anInt1063 >= 168 && Static36.anInt1063 < 205 && Static57.anIntArray262[1] != -1) {
			Static72.aBoolean99 = true;
			Static53.anInt2372 = 1;
			Static78.aBoolean102 = true;
		}
		if (Static67.anInt1906 >= 597 && Static67.anInt1906 <= 627 && Static36.anInt1063 >= 168 && Static36.anInt1063 < 205 && Static57.anIntArray262[2] != -1) {
			Static72.aBoolean99 = true;
			Static78.aBoolean102 = true;
			Static53.anInt2372 = 2;
		}
		if (Static67.anInt1906 >= 625 && Static67.anInt1906 <= 669 && Static36.anInt1063 >= 168 && Static36.anInt1063 < 203 && Static57.anIntArray262[3] != -1) {
			Static78.aBoolean102 = true;
			Static72.aBoolean99 = true;
			Static53.anInt2372 = 3;
		}
		if (Static67.anInt1906 >= 666 && Static67.anInt1906 <= 696 && Static36.anInt1063 >= 168 && Static36.anInt1063 < 205 && Static57.anIntArray262[4] != -1) {
			Static78.aBoolean102 = true;
			Static53.anInt2372 = 4;
			Static72.aBoolean99 = true;
		}
		if (Static67.anInt1906 >= 694 && Static67.anInt1906 <= 724 && Static36.anInt1063 >= 168 && Static36.anInt1063 < 205 && Static57.anIntArray262[5] != -1) {
			Static78.aBoolean102 = true;
			Static53.anInt2372 = 5;
			Static72.aBoolean99 = true;
		}
		if (Static67.anInt1906 >= 722 && Static67.anInt1906 <= 756 && Static36.anInt1063 >= 169 && Static36.anInt1063 < 205 && Static57.anIntArray262[6] != -1) {
			Static53.anInt2372 = 6;
			Static78.aBoolean102 = true;
			Static72.aBoolean99 = true;
		}
		if (Static67.anInt1906 >= 540 && Static67.anInt1906 <= 574 && Static36.anInt1063 >= 466 && Static36.anInt1063 < 502 && Static57.anIntArray262[7] != -1) {
			Static78.aBoolean102 = true;
			Static53.anInt2372 = 7;
			Static72.aBoolean99 = true;
		}
		if (Static67.anInt1906 >= 572 && Static67.anInt1906 <= 602 && Static36.anInt1063 >= 466 && Static36.anInt1063 < 503 && Static57.anIntArray262[8] != -1) {
			Static78.aBoolean102 = true;
			Static53.anInt2372 = 8;
			Static72.aBoolean99 = true;
		}
		if (Static67.anInt1906 >= 599 && Static67.anInt1906 <= 629 && Static36.anInt1063 >= 466 && Static36.anInt1063 < 503 && Static57.anIntArray262[9] != -1) {
			Static78.aBoolean102 = true;
			Static53.anInt2372 = 9;
			Static72.aBoolean99 = true;
		}
		if (Static67.anInt1906 >= 627 && Static67.anInt1906 <= 671 && Static36.anInt1063 >= 467 && Static36.anInt1063 < 502 && Static57.anIntArray262[10] != -1) {
			Static78.aBoolean102 = true;
			Static72.aBoolean99 = true;
			Static53.anInt2372 = 10;
		}
		if (Static67.anInt1906 >= 669 && Static67.anInt1906 <= 699 && Static36.anInt1063 >= 466 && Static36.anInt1063 < 503 && Static57.anIntArray262[11] != -1) {
			Static78.aBoolean102 = true;
			Static72.aBoolean99 = true;
			Static53.anInt2372 = 11;
		}
		if (Static67.anInt1906 >= 696 && Static67.anInt1906 <= 726 && Static36.anInt1063 >= 466 && Static36.anInt1063 < 503 && Static57.anIntArray262[12] != -1) {
			Static78.aBoolean102 = true;
			Static53.anInt2372 = 12;
			Static72.aBoolean99 = true;
		}
		if (Static67.anInt1906 >= 724 && Static67.anInt1906 <= 758 && Static36.anInt1063 >= 466 && Static36.anInt1063 < 502 && Static57.anIntArray262[13] != -1) {
			Static53.anInt2372 = 13;
			Static72.aBoolean99 = true;
			Static78.aBoolean102 = true;
		}
	}

	@OriginalMember(owner = "client!pe", name = "b", descriptor = "(I)V")
	public static void method1684() {
		aClass45_1036 = null;
		aClass66_8 = null;
		aClass45_1038 = null;
		aClass45_1037 = null;
		aClass11_100 = null;
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(Ljava/awt/Component;I)V")
	public static void method1686(@OriginalArg(0) Component arg0) {
		arg0.addMouseListener(Static71.aClass63_1);
		arg0.addMouseMotionListener(Static71.aClass63_1);
		arg0.addFocusListener(Static71.aClass63_1);
	}
}
