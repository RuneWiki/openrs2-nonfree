import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static91 {

	@OriginalMember(owner = "client!re", name = "m", descriptor = "[I")
	public static int[] anIntArray281;

	@OriginalMember(owner = "client!re", name = "s", descriptor = "Lclient!ac;")
	public static Class3 aClass3_22;

	@OriginalMember(owner = "client!re", name = "b", descriptor = "Lclient!kc;")
	public static Class36 aClass36_1127 = Static14.method2017("@or1@");

	@OriginalMember(owner = "client!re", name = "e", descriptor = "Lclient!ja;")
	public static Class31 aClass31_6 = new Class31(32);

	@OriginalMember(owner = "client!re", name = "h", descriptor = "Lclient!kc;")
	public static Class36 aClass36_1128 = Static14.method2017(")2");

	@OriginalMember(owner = "client!re", name = "i", descriptor = "[I")
	public static int[] anIntArray280 = new int[1000];

	@OriginalMember(owner = "client!re", name = "j", descriptor = "I")
	public static int anInt2363 = 0;

	@OriginalMember(owner = "client!re", name = "l", descriptor = "Z")
	public static boolean aBoolean105 = false;

	@OriginalMember(owner = "client!re", name = "n", descriptor = "Lclient!kc;")
	public static Class36 aClass36_1129 = Static14.method2017("redstone1");

	@OriginalMember(owner = "client!re", name = "o", descriptor = "Lclient!kc;")
	public static Class36 aClass36_1130 = Static14.method2017("titlebutton");

	@OriginalMember(owner = "client!re", name = "q", descriptor = "I")
	public static int anInt2365 = -1;

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(I)V")
	public static void method1654() {
		@Pc(1) Object local1 = Static61.anObject3;
		synchronized (Static61.anObject3) {
			if (Static47.anInt1243 == 0) {
				Static67.aClass11_1.method237(5, new Class41());
			}
			Static47.anInt1243 = 600;
		}
	}

	@OriginalMember(owner = "client!re", name = "b", descriptor = "(I)V")
	public static void method1655() {
		anIntArray280 = null;
		aClass31_6 = null;
		aClass36_1129 = null;
		aClass36_1127 = null;
		aClass36_1128 = null;
		anIntArray281 = null;
		aClass3_22 = null;
		aClass36_1130 = null;
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(ZI)V")
	public static void method1656(@OriginalArg(0) boolean arg0) {
		if (Static55.aClass2_Sub1_Sub4_Sub2_Sub2_3.anInt2204 >> 7 == Static22.anInt576 && Static55.aClass2_Sub1_Sub4_Sub2_Sub2_3.anInt2149 >> 7 == Static78.anInt2040) {
			Static22.anInt576 = 0;
		}
		@Pc(25) int local25 = Static65.anInt1689;
		if (arg0) {
			local25 = 1;
		}
		for (@Pc(35) int local35 = 0; local35 < local25; local35++) {
			@Pc(43) Class2_Sub1_Sub4_Sub2_Sub2 local43;
			@Pc(41) int local41;
			if (arg0) {
				local41 = 33538048;
				local43 = Static55.aClass2_Sub1_Sub4_Sub2_Sub2_3;
			} else {
				local41 = Static99.anIntArray243[local35] << 14;
				local43 = Static34.aClass2_Sub1_Sub4_Sub2_Sub2Array1[Static99.anIntArray243[local35]];
			}
			if (local43 != null && local43.method1554()) {
				local43.aBoolean89 = false;
				if ((Static35.aBoolean51 && Static65.anInt1689 > 50 || Static65.anInt1689 > 200) && !arg0 && local43.anInt2181 == local43.anInt2200) {
					local43.aBoolean89 = true;
				}
				@Pc(97) int local97 = local43.anInt2204 >> 7;
				@Pc(102) int local102 = local43.anInt2149 >> 7;
				if (local97 >= 0 && local97 < 104 && local102 >= 0 && local102 < 104) {
					if (local43.aClass2_Sub1_Sub4_Sub1_3 == null || local43.anInt2217 > Static113.anInt2952 || local43.anInt2226 <= Static113.anInt2952) {
						if ((local43.anInt2204 & 0x7F) == 64 && (local43.anInt2149 & 0x7F) == 64) {
							if (Static9.anIntArrayArray5[local97][local102] == Static74.anInt1988) {
								continue;
							}
							Static9.anIntArrayArray5[local97][local102] = Static74.anInt1988;
						}
						local43.anInt2214 = Static56.method1044(local43.anInt2149, local43.anInt2204, Static92.anInt2412);
						Static85.aClass61_1.method1688(Static92.anInt2412, local43.anInt2204, local43.anInt2149, local43.anInt2214, 60, local43, local43.anInt2156, local41, local43.aBoolean88);
					} else {
						local43.aBoolean89 = false;
						local43.anInt2214 = Static56.method1044(local43.anInt2149, local43.anInt2204, Static92.anInt2412);
						Static85.aClass61_1.method1726(Static92.anInt2412, local43.anInt2204, local43.anInt2149, local43.anInt2214, local43, local43.anInt2156, local41, local43.anInt2213, local43.anInt2231, local43.anInt2228, local43.anInt2211);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(Lclient!ed;II)Lclient!kc;")
	public static Class36 method1657(@OriginalArg(0) Class2_Sub1_Sub6 arg0, @OriginalArg(2) int arg1) {
		if (!Static100.method1856(arg1, Static67.method1163(arg0))) {
			return null;
		} else if (arg0.aClass36Array14 == null || arg1 >= arg0.aClass36Array14.length || arg0.aClass36Array14[arg1] == null || arg0.aClass36Array14[arg1].method1014().method1028() == 0) {
			return Static117.aBoolean84 ? Static49.method949(new Class36[] { Static99.aClass36_951, Static57.method1055(arg1) }) : null;
		} else {
			return arg0.aClass36Array14[arg1];
		}
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(Lclient!kc;Ljava/awt/Color;II)V")
	public static void method1658(@OriginalArg(0) Class36 arg0, @OriginalArg(1) Color arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(6) Graphics local6 = Static107.aCanvas1.getGraphics();
			if (Static100.aFont1 == null) {
				Static100.aFont1 = new Font("Helvetica", 1, 13);
				Static25.aFontMetrics1 = Static107.aCanvas1.getFontMetrics(Static100.aFont1);
			}
			if (Static108.aBoolean131) {
				Static108.aBoolean131 = false;
				local6.setColor(Color.black);
				local6.fillRect(0, 0, Static51.anInt2591, Static39.anInt979);
			}
			if (arg1 == null) {
				arg1 = new Color(140, 17, 17);
			}
			try {
				if (Static14.anImage34 == null) {
					Static14.anImage34 = Static107.aCanvas1.createImage(304, 34);
				}
				@Pc(51) Graphics local51 = Static14.anImage34.getGraphics();
				local51.setColor(arg1);
				local51.drawRect(0, 0, 303, 33);
				local51.fillRect(2, 2, arg2 * 3, 30);
				local51.setColor(Color.black);
				local51.drawRect(1, 1, 301, 31);
				local51.fillRect(arg2 * 3 + 2, 2, 300 - arg2 * 3, 30);
				local51.setFont(Static100.aFont1);
				local51.setColor(Color.white);
				arg0.method1036(local51, (304 - arg0.method1027(Static25.aFontMetrics1)) / 2, 22);
				local6.drawImage(Static14.anImage34, Static51.anInt2591 / 2 - 152, Static39.anInt979 / 2 + -18, null);
			} catch (@Pc(133) Exception local133) {
				@Pc(139) int local139 = Static51.anInt2591 / 2 - 152;
				@Pc(145) int local145 = Static39.anInt979 / 2 - 18;
				local6.setColor(arg1);
				local6.drawRect(local139, local145, 303, 33);
				local6.fillRect(local139 + 2, local145 + 2, arg2 * 3, 30);
				local6.setColor(Color.black);
				local6.drawRect(local139 + 1, local145 - -1, 301, 31);
				local6.fillRect(arg2 * 3 + local139 + 2, local145 + 2, 300 - arg2 * 3, 30);
				local6.setFont(Static100.aFont1);
				local6.setColor(Color.white);
				arg0.method1036(local6, (304 - arg0.method1027(Static25.aFontMetrics1)) / 2 + local139, local145 + 22);
			}
		} catch (@Pc(226) Exception local226) {
			Static107.aCanvas1.repaint();
		}
	}
}
