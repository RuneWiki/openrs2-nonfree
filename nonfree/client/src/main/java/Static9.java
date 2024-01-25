import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static9 {

	@OriginalMember(owner = "client!ai", name = "e", descriptor = "Lclient!on;")
	public static Class154 aClass154_1;

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "Lclient!hc;")
	public static final Class85 aClass85_7 = new Class85("Loading interfaces - ", "Lade Benutzeroberfläche - ", "Chargement des interfaces - ", "Carregando interfaces - ");

	@OriginalMember(owner = "client!ai", name = "b", descriptor = "[I")
	public static final int[] anIntArray41 = new int[50];

	@OriginalMember(owner = "client!ai", name = "d", descriptor = "I")
	public static int anInt191 = 0;

	@OriginalMember(owner = "client!ai", name = "f", descriptor = "Ljava/lang/String;")
	public static String aString3 = "";

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(IIIZII)V")
	public static void method174(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(5) int arg4) {
		if (arg3) {
			Static51.method834();
		}
		if (Static110.aFrame4 != null && (arg1 != 3 || Static211.anInt4178 != arg2 || arg4 != Static124.anInt2371)) {
			Static151.method2736(Static110.aFrame4, Static182.aClass139_5);
			Static110.aFrame4 = null;
		}
		if (arg1 == 3 && Static110.aFrame4 == null) {
			Static110.aFrame4 = Static174.method3162(Static182.aClass139_5, arg2, 0, arg4);
			if (Static110.aFrame4 != null) {
				Static124.anInt2371 = arg4;
				Static211.anInt4178 = arg2;
				Static72.method1328(Static182.aClass139_5);
			}
		}
		if (arg1 == 3 && Static110.aFrame4 == null) {
			method174(arg0, Static223.anInt4410, -1, true, -1);
			return;
		}
		@Pc(69) Container local69;
		if (Static110.aFrame4 != null) {
			local69 = Static110.aFrame4;
			Static1.anInt9 = arg2;
			Static32.anInt632 = arg4;
		} else if (Static60.aFrame3 == null) {
			local69 = Static182.aClass139_5.anApplet1;
			Static1.anInt9 = local69.getSize().width;
			Static32.anInt632 = local69.getSize().height;
		} else {
			@Pc(91) Insets local91 = Static60.aFrame3.getInsets();
			@Pc(99) int local99 = local91.right + local91.left;
			Static1.anInt9 = Static60.aFrame3.getSize().width - local99;
			@Pc(109) int local109 = local91.top + local91.bottom;
			Static32.anInt632 = Static60.aFrame3.getSize().height - local109;
			local69 = Static60.aFrame3;
		}
		@Pc(152) int local152;
		if (arg1 == 1) {
			Static168.anInt3376 = 765;
			Static84.anInt4252 = (Static1.anInt9 - 765) / 2;
			Static256.anInt5066 = 503;
			Static134.anInt2040 = 0;
		} else if (Static345.anInt6645 < 96 && Static342.anInt6605 == 0) {
			local152 = Static1.anInt9 > 1024 ? 1024 : Static1.anInt9;
			Static168.anInt3376 = local152;
			Static84.anInt4252 = (Static1.anInt9 - local152) / 2;
			@Pc(167) int local167 = Static32.anInt632 <= 768 ? Static32.anInt632 : 768;
			Static134.anInt2040 = 0;
			Static256.anInt5066 = local167;
		} else {
			Static256.anInt5066 = Static32.anInt632;
			Static168.anInt3376 = Static1.anInt9;
			Static84.anInt4252 = 0;
			Static134.anInt2040 = 0;
		}
		if (Static351.anInt6735 != 0) {
			@Pc(198) boolean local198;
			if (Static168.anInt3376 < 1024 && Static256.anInt5066 < 768) {
				local198 = true;
			} else {
				local198 = false;
			}
		}
		if (arg3) {
			Static144.method2633(Static342.anInt6605);
		} else {
			Static102.aCanvas3.setSize(Static168.anInt3376, Static256.anInt5066);
			if (Static236.aClass55_9 != null) {
				Static236.aClass55_9.method5171();
			}
			if (local69 == Static60.aFrame3) {
				@Pc(226) Insets local226 = Static60.aFrame3.getInsets();
				Static102.aCanvas3.setLocation(Static84.anInt4252 + local226.left, local226.top + Static134.anInt2040);
			} else {
				Static102.aCanvas3.setLocation(Static84.anInt4252, Static134.anInt2040);
			}
		}
		if (arg1 < 2) {
			Static245.aBoolean411 = false;
		} else {
			Static245.aBoolean411 = true;
		}
		if (Static32.anInt628 != -1) {
			Static43.method6040(true);
		}
		if (Static155.aClass41_18 != null && (Static278.anInt5495 == 30 || Static278.anInt5495 == 25)) {
			Static70.method1312();
		}
		for (local152 = 0; local152 < 100; local152++) {
			Static287.aBooleanArray23[local152] = true;
		}
		Static78.aBoolean102 = true;
	}
}
