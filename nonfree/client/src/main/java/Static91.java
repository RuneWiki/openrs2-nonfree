import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static91 {

	@OriginalMember(owner = "client!l", name = "f", descriptor = "Lclient!oh;")
	public static Class11_Sub1 aClass11_Sub1_23;

	@OriginalMember(owner = "client!l", name = "g", descriptor = "Lclient!te;")
	public static Class2_Sub2_Sub17 aClass2_Sub2_Sub17_1;

	@OriginalMember(owner = "client!l", name = "l", descriptor = "I")
	public static int anInt1931;

	@OriginalMember(owner = "client!l", name = "m", descriptor = "[I")
	public static int[] anIntArray196;

	@OriginalMember(owner = "client!l", name = "t", descriptor = "[I")
	public static int[] anIntArray197;

	@OriginalMember(owner = "client!l", name = "b", descriptor = "[I")
	public static int[] anIntArray193 = new int[1000];

	@OriginalMember(owner = "client!l", name = "c", descriptor = "[I")
	public static int[] anIntArray194 = new int[1000];

	@OriginalMember(owner = "client!l", name = "n", descriptor = "I")
	public static final int anInt1932 = 4;

	@OriginalMember(owner = "client!l", name = "e", descriptor = "[I")
	public static int[] anIntArray195 = new int[anInt1932];

	@OriginalMember(owner = "client!l", name = "j", descriptor = "[[Lclient!rg;")
	public static Class76[][] aClass76ArrayArray1 = new Class76[anInt1932][500];

	@OriginalMember(owner = "client!l", name = "r", descriptor = "Lclient!lf;")
	public static Class49 aClass49_946 = Static32.method683("scrollbar");

	@OriginalMember(owner = "client!l", name = "u", descriptor = "[I")
	public static int[] anIntArray198 = new int[] { -1, -1, 1, 1 };

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(I)V")
	public static void method1575() {
		aClass76ArrayArray1 = null;
		anIntArray197 = null;
		aClass49_946 = null;
		anIntArray194 = null;
		aClass11_Sub1_23 = null;
		aClass2_Sub2_Sub17_1 = null;
		anIntArray196 = null;
		anIntArray193 = null;
		anIntArray195 = null;
		anIntArray198 = null;
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(II)Lclient!lf;")
	public static Class49 method1577(@OriginalArg(0) int arg0) {
		return Static33.method692(new Class49[] { Static48.method882(arg0 >> 24 & 0xFF), Static38.aClass49_484, Static48.method882(arg0 >> 16 & 0xFF), Static38.aClass49_484, Static48.method882(arg0 >> 8 & 0xFF), Static38.aClass49_484, Static48.method882(arg0 & 0xFF) });
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(B[Lclient!lf;)[Lclient!lf;")
	public static Class49[] method1579(@OriginalArg(1) Class49[] arg0) {
		@Pc(8) Class49[] local8 = new Class49[5];
		for (@Pc(15) int local15 = 0; local15 < 5; local15++) {
			local8[local15] = Static33.method692(new Class49[] { Static48.method882(local15), Static2.aClass49_15 });
			if (arg0 != null && arg0[local15] != null) {
				local8[local15] = Static33.method692(new Class49[] { local8[local15], arg0[local15] });
			}
		}
		return local8;
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(Lclient!lf;IZ)V")
	public static void method1580(@OriginalArg(0) Class49 arg0, @OriginalArg(2) boolean arg1) {
		@Pc(10) int local10 = Static84.aClass2_Sub2_Sub2_Sub1_Sub1_4.method623(arg0, 250);
		@Pc(21) int local21 = Static84.aClass2_Sub2_Sub2_Sub1_Sub1_4.method627(arg0, 250) * 13;
		Static10.method1861(6, 6, local10 + 4 + 4, local21 + 4 + 4, 0);
		Static10.method1854(6, 6, local10 + 4 + 4, 4 + 4 + local21, 16777215);
		Static84.aClass2_Sub2_Sub2_Sub1_Sub1_4.method633(arg0, 10, 10, local10, local21, 16777215, -1, 1, 1, 0);
		Static170.method2828(local21 + 4 + 4, 6, 6, local10 + 8);
		if (!arg1) {
			Static160.method2711(local10, local21, 10, 10);
			return;
		}
		try {
			@Pc(111) Graphics local111 = Static5.aCanvas1.getGraphics();
			Static62.aClass24_1.method1748(local111);
		} catch (@Pc(119) Exception local119) {
			Static5.aCanvas1.repaint();
		}
	}
}
