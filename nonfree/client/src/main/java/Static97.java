import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static97 {

	@OriginalMember(owner = "client!dr", name = "f", descriptor = "I")
	public static int anInt1863;

	@OriginalMember(owner = "client!dr", name = "h", descriptor = "I")
	public static int anInt1865 = 0;

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(IZ)V")
	public static void method1747(@OriginalArg(0) int arg0) {
		@Pc(13) Class6_Sub2_Sub7 local13 = Static401.method5861(arg0, 12);
		local13.method2580();
	}

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(I)V")
	public static void method1748() {
		if (Static185.anInt3865 < 0) {
			return;
		}
		@Pc(12) long local12 = Static8.method201();
		Static185.anInt3865 = (int) ((long) Static185.anInt3865 + Static110.aLong61 - local12);
		if (Static185.anInt3865 <= 0) {
			Static300.anInt5540 = Static152.aClass348_3.anInt9427;
			Static70.aFloat78 = Static152.aClass348_3.aFloat198;
			Static185.anInt3865 = -1;
			Static89.aFloat22 = Static152.aClass348_3.aFloat199;
			Static284.aClass26_4 = Static152.aClass348_3.aClass26_7;
			Static88.anInt1753 = Static152.aClass348_3.anInt9423;
			Static123.aFloat63 = Static152.aClass348_3.aFloat197;
			Static427.anInt7433 = Static152.aClass348_3.anInt9421;
			Static55.aFloat15 = Static152.aClass348_3.aFloat200;
			Static326.aFloat139 = Static152.aClass348_3.aFloat201;
			Static99.aFloat23 = Static152.aClass348_3.aFloat202;
		} else {
			@Pc(65) int local65 = (Static185.anInt3865 << 8) / Static225.anInt4648;
			@Pc(70) int local70 = 255 - local65;
			@Pc(75) float local75 = (float) local65 / 255.0F;
			@Pc(80) float local80 = 1.0F - local75;
			Static88.anInt1753 = ((Static293.anInt5466 & 0xFF00) * local65 + (Static152.aClass348_3.anInt9423 & 0xFF00) * local70 & 0xFF0000) + (local70 * (Static152.aClass348_3.anInt9423 & 0xFF00FF) + (Static293.anInt5466 & 0xFF00FF) * local65 & 0xFF00FF00) >>> 8;
			Static70.aFloat78 = Static222.aFloat110 + local80 * (Static152.aClass348_3.aFloat198 - Static222.aFloat110);
			Static89.aFloat22 = Static528.aFloat190 + local80 * (Static152.aClass348_3.aFloat199 - Static528.aFloat190);
			Static99.aFloat23 = local80 * (Static152.aClass348_3.aFloat202 - Static550.aFloat195) + Static550.aFloat195;
			Static427.anInt7433 = ((Static152.aClass348_3.anInt9421 & 0xFF00) * local70 + local65 * (Static418.anInt7259 & 0xFF00) & 0xFF0000) + (local65 * (Static418.anInt7259 & 0xFF00FF) + (Static152.aClass348_3.anInt9421 & 0xFF00FF) * local70 & 0xFF00FF00) >>> 8;
			Static123.aFloat63 = Static588.aFloat24 + (Static152.aClass348_3.aFloat197 - Static588.aFloat24) * local80;
			Static326.aFloat139 = Static309.aFloat135 + local80 * (Static152.aClass348_3.aFloat201 - Static309.aFloat135);
			Static55.aFloat15 = local80 * (Static152.aClass348_3.aFloat200 - Static182.aFloat69) + Static182.aFloat69;
			Static300.anInt5540 = local65 * Static484.anInt8191 + local70 * Static152.aClass348_3.anInt9427 >> 8;
			if (Static461.aClass26_6 != Static152.aClass348_3.aClass26_7) {
				Static284.aClass26_4 = Static25.aClass14_1.method6870(Static461.aClass26_6, Static152.aClass348_3.aClass26_7, local80, Static284.aClass26_4);
			}
		}
		Static110.aLong61 = local12;
	}

	@OriginalMember(owner = "client!dr", name = "b", descriptor = "(I)V")
	public static void method1749() {
		Static518.anInt8739 = 0;
		Static119.anInt2849 = 0;
		Static130.anInt2951 = 0;
		Static552.anInt9133 = 0;
	}

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(B)V")
	public static void method1750() {
		if (Static557.anInt9206 == 7) {
			Static40.method1024(false);
		} else {
			Static535.aClass127_1 = Static563.aClass127_2;
			Static563.aClass127_2 = null;
			Static449.method6350(13);
		}
	}
}
