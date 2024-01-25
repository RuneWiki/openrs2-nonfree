import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static97 {

	@OriginalMember(owner = "client!dl", name = "q", descriptor = "Lclient!ps;")
	public static final Class262 aClass262_2 = new Class262(4, 7);

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(IIIZII)V")
	public static void method1805(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (Static376.aFrame4 != null && (arg0 != 3 || Static405.aClass3_Sub3_Sub1_1.anInt7569 != arg3 || Static405.aClass3_Sub3_Sub1_1.anInt7560 != arg1)) {
			Static40.method656(Static237.aClass258_3, Static376.aFrame4);
			Static376.aFrame4 = null;
		}
		if (arg0 == 3 && Static376.aFrame4 == null) {
			Static376.aFrame4 = Static141.method2725(arg1, 0, arg3, Static237.aClass258_3);
			if (Static376.aFrame4 != null) {
				Static405.aClass3_Sub3_Sub1_1.anInt7569 = arg3;
				Static405.aClass3_Sub3_Sub1_1.anInt7560 = arg1;
				Static405.aClass3_Sub3_Sub1_1.method6313(Static237.aClass258_3);
			}
		}
		if (arg0 == 3 && Static376.aFrame4 == null) {
			method1805(Static405.aClass3_Sub3_Sub1_1.anInt7570, -1, true, -1, arg4);
			return;
		}
		@Pc(77) Container local77;
		@Pc(104) Insets local104;
		if (Static376.aFrame4 != null) {
			Static570.anInt9271 = arg1;
			local77 = Static376.aFrame4;
			Static308.anInt5172 = arg3;
		} else if (Static203.aFrame3 == null) {
			if (Static31.anApplet1 == null) {
				local77 = Static150.anApplet_Sub1_1;
			} else {
				local77 = Static31.anApplet1;
			}
			Static308.anInt5172 = local77.getSize().width;
			Static570.anInt9271 = local77.getSize().height;
		} else {
			local104 = Static203.aFrame3.getInsets();
			Static308.anInt5172 = Static203.aFrame3.getSize().width - local104.right - local104.left;
			@Pc(120) int local120 = -local104.top;
			Static570.anInt9271 = Static203.aFrame3.getSize().height + local120 - local104.bottom;
			local77 = Static203.aFrame3;
		}
		if (arg0 == 1) {
			Static40.anInt758 = Static245.anInt4333;
			Static486.anInt7950 = 0;
			Static308.anInt5171 = Static66.anInt1531;
			Static322.anInt5444 = (Static308.anInt5172 - Static245.anInt4333) / 2;
		} else {
			Static222.method3506();
		}
		if (Static516.aClass272_11 != Static478.aClass272_10) {
			@Pc(159) boolean local159;
			if (Static40.anInt758 < 1024 && Static308.anInt5171 < 768) {
				local159 = true;
			} else {
				local159 = false;
			}
		}
		if (arg2) {
			Static11.method167();
		} else {
			Static387.aCanvas9.setSize(Static40.anInt758, Static308.anInt5171);
			Static505.aClass45_11.method7403(Static387.aCanvas9);
			if (Static203.aFrame3 == local77) {
				local104 = Static203.aFrame3.getInsets();
				Static387.aCanvas9.setLocation(Static322.anInt5444 + local104.left, Static486.anInt7950 + local104.top);
			} else {
				Static387.aCanvas9.setLocation(Static322.anInt5444, Static486.anInt7950);
			}
		}
		if (arg0 < 2) {
			Static556.aBoolean676 = false;
		} else {
			Static556.aBoolean676 = true;
		}
		if (Static353.anInt6188 != -1) {
			Static101.method1867(true);
		}
		if (Static324.aClass165_2 != null && Static184.method3148(Static32.anInt602)) {
			Static52.method830();
		}
		for (@Pc(226) int local226 = 0; local226 < 100; local226++) {
			Static319.aBooleanArray17[local226] = true;
		}
		Static249.aBoolean332 = true;
	}

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(IZIIIII)V")
	public static void method1806(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(6) int arg4) {
		if (Static405.aClass3_Sub3_Sub1_1.anInt7559 != 0 && arg0 != 0 && Static5.anInt118 < 50 && arg2 != -1) {
			Static204.aClass347Array1[Static5.anInt118++] = new Class347((byte) 2, arg2, arg0, arg1, arg4, arg3);
		}
	}
}
