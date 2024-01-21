import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static84 {

	@OriginalMember(owner = "client!oc", name = "j", descriptor = "I")
	public static int anInt1827;

	@OriginalMember(owner = "client!oc", name = "k", descriptor = "Lclient!sd;")
	public static Class69 aClass69_1;

	@OriginalMember(owner = "client!oc", name = "n", descriptor = "J")
	public static long aLong71;

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "Lclient!oc;")
	public static Class56 aClass56_2 = new Class56();

	@OriginalMember(owner = "client!oc", name = "h", descriptor = "I")
	public static int anInt1825 = 0;

	@OriginalMember(owner = "client!oc", name = "l", descriptor = "Lclient!u;")
	public static Class74 aClass74_1238 = Static72.method1077("::gc");

	@OriginalMember(owner = "client!oc", name = "m", descriptor = "I")
	public static int anInt1828 = 0;

	@OriginalMember(owner = "client!oc", name = "o", descriptor = "Z")
	public static boolean aBoolean73 = false;

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(ZI)V")
	public static void method1289(@OriginalArg(0) boolean arg0) {
		if (Static35.aClass15_59.anEventQueue1 == null) {
			return;
		}
		for (@Pc(16) int local16 = 0; local16 < 50 && Static35.aClass15_59.anEventQueue1.peekEvent() != null; local16++) {
			Static80.method1260(1L);
		}
		if (arg0) {
			Static35.aClass15_59.anEventQueue1.postEvent(new ActionEvent(Static51.aCanvas2, 1001, "dummy"));
		}
	}

	@OriginalMember(owner = "client!oc", name = "b", descriptor = "(I)V")
	public static void method1290() {
		aClass69_1 = null;
		aClass74_1238 = null;
		aClass56_2 = null;
	}

	@OriginalMember(owner = "client!oc", name = "b", descriptor = "(B)V")
	public static void method1291() {
		if (Static46.aBoolean43) {
			Static31.method574();
			Static46.aBoolean43 = false;
			Static40.method664();
			Static116.aBoolean107 = true;
			Static36.aBoolean29 = true;
			Static8.aBoolean11 = true;
			Static55.aBoolean16 = true;
		}
		Static113.method1689();
		if (Static109.aBoolean103 && Static78.anInt1701 == 1) {
			Static116.aBoolean107 = true;
		}
		@Pc(38) boolean local38;
		if (Static66.anInt1458 != -1) {
			local38 = Static91.method1338(Static66.anInt1458);
			if (local38) {
				Static116.aBoolean107 = true;
			}
		}
		if (Static91.anInt1908 == 2) {
			Static116.aBoolean107 = true;
		}
		if (Static27.anInt678 == 2) {
			Static116.aBoolean107 = true;
		}
		if (Static116.aBoolean107) {
			Static116.aBoolean107 = false;
			Static18.method413();
		}
		@Pc(110) int local110;
		if (Static42.anInt982 == -1) {
			Static2.aClass2_Sub2_Sub17_1.anInt2836 = Static21.anInt616 - Static46.anInt1055 - 77;
			if (Static46.anInt1062 > 17 && Static46.anInt1062 < 560 && Static62.anInt1414 > 332) {
				Static75.method1103(-1, Static62.anInt1414 - 357, 463, 0, Static46.anInt1062 - 17, Static2.aClass2_Sub2_Sub17_1, 77, Static21.anInt616);
			}
			local110 = Static21.anInt616 - Static2.aClass2_Sub2_Sub17_1.anInt2836 - 77;
			if (local110 < 0) {
				local110 = 0;
			}
			if (local110 > Static21.anInt616 - 77) {
				local110 = Static21.anInt616 - 77;
			}
			if (Static46.anInt1055 != local110) {
				Static55.aBoolean16 = true;
				Static46.anInt1055 = local110;
			}
		}
		if (Static42.anInt982 == -1 && Static36.anInt869 == 3) {
			Static2.aClass2_Sub2_Sub17_1.anInt2836 = Static127.anInt2880;
			local110 = Static65.anInt1449 * 14 + 7;
			if (Static46.anInt1062 > 17 && Static46.anInt1062 < 560 && Static62.anInt1414 > 332) {
				Static75.method1103(-1, Static62.anInt1414 - 357, 463, 0, Static46.anInt1062 - 17, Static2.aClass2_Sub2_Sub17_1, 77, local110);
			}
			@Pc(177) int local177 = Static2.aClass2_Sub2_Sub17_1.anInt2836;
			if (local177 < 0) {
				local177 = 0;
			}
			if (local177 > local110 - 77) {
				local177 = local110 - 77;
			}
			if (local177 != Static127.anInt2880) {
				Static127.anInt2880 = local177;
				Static55.aBoolean16 = true;
			}
		}
		if (Static42.anInt982 != -1) {
			local38 = Static91.method1338(Static42.anInt982);
			if (local38) {
				Static55.aBoolean16 = true;
			}
		}
		if (Static91.anInt1908 == 3) {
			Static55.aBoolean16 = true;
		}
		if (Static27.anInt678 == 3) {
			Static55.aBoolean16 = true;
		}
		if (Static16.aClass74_411 != null) {
			Static55.aBoolean16 = true;
		}
		if (Static109.aBoolean103 && Static78.anInt1701 == 2) {
			Static55.aBoolean16 = true;
		}
		if (Static55.aBoolean16) {
			Static55.aBoolean16 = false;
			Static54.method917();
		}
		Static16.method360();
		if (Static46.anInt1049 != -1) {
			Static8.aBoolean11 = true;
		}
		if (Static8.aBoolean11) {
			if (Static46.anInt1049 != -1 && Static46.anInt1049 == Static42.anInt980) {
				Static46.anInt1049 = -1;
				Static128.aClass2_Sub10_Sub1_3.method1533(96);
				Static128.aClass2_Sub10_Sub1_3.method1486(Static42.anInt980);
			}
			Static109.aBoolean104 = true;
			Static8.aBoolean11 = false;
			Static114.method1693(Static16.anIntArray49, Static42.anInt980, Static107.anInt2338 % 20 < 10 ? -1 : Static46.anInt1049, Static66.anInt1458 == -1);
		}
		if (Static36.aBoolean29) {
			Static36.aBoolean29 = false;
			Static109.aBoolean104 = true;
			Static25.method496(Static77.aClass2_Sub2_Sub1_Sub3_9, Static107.anInt2345, Static41.anInt964, Static65.anInt1443);
		}
		Static41.method670(Static117.anInt2529, Static99.aClass2_Sub2_Sub2_Sub1_Sub2_1.anInt2673, Static99.aClass2_Sub2_Sub2_Sub1_Sub2_1.anInt2672, Static15.anInt429);
		Static15.anInt429 = 0;
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(Lclient!ga;I)V")
	public static void method1292(@OriginalArg(0) Class2_Sub8 arg0) {
		@Pc(13) int local13 = 0;
		@Pc(15) int local15 = 0;
		if (arg0.anInt924 == 0) {
			local13 = aClass69_1.method1638(arg0.anInt919, arg0.anInt921, arg0.anInt933);
		}
		if (arg0.anInt924 == 1) {
			local13 = aClass69_1.method1610(arg0.anInt919, arg0.anInt921, arg0.anInt933);
		}
		@Pc(44) int local44 = 0;
		@Pc(46) int local46 = -1;
		if (arg0.anInt924 == 2) {
			local13 = aClass69_1.method1632(arg0.anInt919, arg0.anInt921, arg0.anInt933);
		}
		if (arg0.anInt924 == 3) {
			local13 = aClass69_1.method1630(arg0.anInt919, arg0.anInt921, arg0.anInt933);
		}
		if (local13 != 0) {
			local46 = local13 >> 14 & 0x7FFF;
			@Pc(90) int local90 = aClass69_1.method1617(arg0.anInt919, arg0.anInt921, arg0.anInt933, local13);
			local44 = local90 >> 6 & 0x3;
			local15 = local90 & 0x1F;
		}
		arg0.anInt935 = local46;
		arg0.anInt931 = local15;
		arg0.anInt918 = local44;
	}
}
