import java.awt.Component;
import java.awt.event.KeyEvent;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static93 {

	@OriginalMember(owner = "client!tc", name = "Ab", descriptor = "Lclient!he;")
	public static Class11 aClass11_49;

	@OriginalMember(owner = "client!tc", name = "H", descriptor = "Lclient!i;")
	public static Class29 aClass29_56 = new Class29(50);

	@OriginalMember(owner = "client!tc", name = "cb", descriptor = "Lclient!va;")
	public static Class61 aClass61_805 = Static88.method1421("(U3");

	@OriginalMember(owner = "client!tc", name = "yb", descriptor = "Lclient!va;")
	private static Class61 aClass61_806 = Static88.method1421("To");

	@OriginalMember(owner = "client!tc", name = "Fb", descriptor = "Lclient!va;")
	private static Class61 aClass61_808 = Static88.method1421("The server is being updated)3");

	@OriginalMember(owner = "client!tc", name = "zb", descriptor = "Lclient!va;")
	public static Class61 aClass61_807 = aClass61_808;

	@OriginalMember(owner = "client!tc", name = "Db", descriptor = "[I")
	public static int[] anIntArray232 = new int[1000];

	@OriginalMember(owner = "client!tc", name = "Eb", descriptor = "I")
	public static int anInt2002 = 0;

	@OriginalMember(owner = "client!tc", name = "Hb", descriptor = "Lclient!va;")
	public static Class61 aClass61_809 = aClass61_806;

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(IBI)I")
	public static int method1107(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) int local14 = arg1 * 57 + arg0;
		@Pc(20) int local20 = local14 << 13 ^ local14;
		@Pc(34) int local34 = Integer.MAX_VALUE & local20 * (local20 * 15731 * local20 + 789221) + 1376312589;
		return local34 >> 19 & 0xFF;
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(BLjava/awt/event/KeyEvent;)I")
	public static int method1108(@OriginalArg(1) KeyEvent arg0) {
		@Pc(6) int local6 = arg0.getKeyChar();
		if (local6 <= 0 || local6 >= 256) {
			local6 = -1;
		}
		return local6;
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(JZ)V")
	public static void method1123(@OriginalArg(0) long arg0) {
		if (arg0 <= 0L) {
			return;
		}
		if (arg0 % 10L == 0L) {
			Static44.method715(arg0 - 1L);
			Static44.method715(1L);
		} else {
			Static44.method715(arg0);
		}
	}

	@OriginalMember(owner = "client!tc", name = "h", descriptor = "(B)V")
	public static void method1134() {
		aClass61_806 = null;
		aClass29_56 = null;
		aClass11_49 = null;
		aClass61_808 = null;
		aClass61_809 = null;
		aClass61_807 = null;
		anIntArray232 = null;
		aClass61_805 = null;
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(Lclient!he;Ljava/awt/Component;B)V")
	public static void method1149(@OriginalArg(0) Class11 arg0, @OriginalArg(1) Component arg1) {
		if (Static103.aBoolean47) {
			return;
		}
		Static70.aClass10_Sub1_Sub1_Sub2_26 = Static19.method410(arg0, Static101.aClass61_1034, Static19.aClass61_220);
		Static56.aClass10_Sub1_Sub1_Sub2_16 = Static19.method410(arg0, Static49.aClass61_570, Static19.aClass61_220);
		Static102.aClass10_Sub1_Sub1_Sub2_25 = Static19.method410(arg0, Static76.aClass61_816, Static19.aClass61_220);
		Static47.aClass10_Sub1_Sub1_Sub2_13 = Static19.method410(arg0, Static61.aClass61_678, Static19.aClass61_220);
		Static55.aClass10_Sub1_Sub1_Sub2_15 = Static19.method410(arg0, Static76.aClass61_814, Static19.aClass61_220);
		Static60.aClass10_Sub1_Sub1_Sub2_17 = Static19.method410(arg0, Static40.aClass61_457, Static19.aClass61_220);
		Static9.aClass15_7 = Static8.method166(arg1, 96, 479);
		Static56.aClass10_Sub1_Sub1_Sub2_16.method873(0, 0);
		Static71.aClass15_28 = Static8.method166(arg1, 156, 172);
		Static45.method1525();
		Static102.aClass10_Sub1_Sub1_Sub2_25.method873(0, 0);
		Static94.aClass15_35 = Static8.method166(arg1, 261, 190);
		Static70.aClass10_Sub1_Sub1_Sub2_26.method873(0, 0);
		Static106.aClass15_39 = Static8.method166(arg1, 334, 512);
		Static45.method1525();
		Static25.aClass15_15 = Static8.method166(arg1, 50, 496);
		Static24.aClass15_33 = Static8.method166(arg1, 37, 269);
		Static53.aClass15_21 = Static8.method166(arg1, 45, 249);
		@Pc(111) Class10_Sub1_Sub1_Sub1 local111 = Static27.method524(Static19.aClass61_220, arg0, Static40.aClass61_459);
		Static6.aClass15_4 = Static8.method166(arg1, local111.anInt177, local111.anInt179);
		local111.method145(0, 0);
		@Pc(131) Class10_Sub1_Sub1_Sub1 local131 = Static27.method524(Static19.aClass61_220, arg0, Static58.aClass61_643);
		Static74.aClass15_29 = Static8.method166(arg1, local131.anInt177, local131.anInt179);
		local131.method145(0, 0);
		@Pc(149) Class10_Sub1_Sub1_Sub1 local149 = Static27.method524(Static19.aClass61_220, arg0, Static27.aClass61_331);
		Static107.aClass15_36 = Static8.method166(arg1, local149.anInt177, local149.anInt179);
		local149.method145(0, 0);
		@Pc(169) Class10_Sub1_Sub1_Sub1 local169 = Static27.method524(Static19.aClass61_220, arg0, Static82.aClass61_880);
		Static99.aClass15_37 = Static8.method166(arg1, local169.anInt177, local169.anInt179);
		local169.method145(0, 0);
		@Pc(187) Class10_Sub1_Sub1_Sub1 local187 = Static27.method524(Static19.aClass61_220, arg0, Static18.aClass61_202);
		Static57.aClass15_25 = Static8.method166(arg1, local187.anInt177, local187.anInt179);
		local187.method145(0, 0);
		@Pc(205) Class10_Sub1_Sub1_Sub1 local205 = Static27.method524(Static19.aClass61_220, arg0, Static37.aClass61_424);
		Static31.aClass15_17 = Static8.method166(arg1, local205.anInt177, local205.anInt179);
		local205.method145(0, 0);
		@Pc(223) Class10_Sub1_Sub1_Sub1 local223 = Static27.method524(Static19.aClass61_220, arg0, Static24.aClass61_928);
		Static103.aClass15_19 = Static8.method166(arg1, local223.anInt177, local223.anInt179);
		local223.method145(0, 0);
		@Pc(241) Class10_Sub1_Sub1_Sub1 local241 = Static27.method524(Static19.aClass61_220, arg0, Static4.aClass61_4);
		Static43.aClass15_20 = Static8.method166(arg1, local241.anInt177, local241.anInt179);
		local241.method145(0, 0);
		@Pc(259) Class10_Sub1_Sub1_Sub1 local259 = Static27.method524(Static19.aClass61_220, arg0, Static46.aClass61_535);
		Static53.aClass15_22 = Static8.method166(arg1, local259.anInt177, local259.anInt179);
		local259.method145(0, 0);
		Static71.aClass10_Sub1_Sub1_Sub2_20 = Static19.method410(arg0, Static8.aClass61_72, Static19.aClass61_220);
		Static49.aClass10_Sub1_Sub1_Sub2_14 = Static19.method410(arg0, Static104.aClass61_1057, Static19.aClass61_220);
		Static1.aClass10_Sub1_Sub1_Sub2_1 = Static19.method410(arg0, Static99.aClass61_1032, Static19.aClass61_220);
		Static33.aClass10_Sub1_Sub1_Sub2_9 = Static71.aClass10_Sub1_Sub1_Sub2_20.method869();
		Static33.aClass10_Sub1_Sub1_Sub2_9.method871();
		Static32.aClass10_Sub1_Sub1_Sub2_8 = Static49.aClass10_Sub1_Sub1_Sub2_14.method869();
		Static32.aClass10_Sub1_Sub1_Sub2_8.method871();
		Static96.aClass10_Sub1_Sub1_Sub2_23 = Static71.aClass10_Sub1_Sub1_Sub2_20.method869();
		Static96.aClass10_Sub1_Sub1_Sub2_23.method870();
		Static102.aClass10_Sub1_Sub1_Sub2_24 = Static49.aClass10_Sub1_Sub1_Sub2_14.method869();
		Static102.aClass10_Sub1_Sub1_Sub2_24.method870();
		Static46.aClass10_Sub1_Sub1_Sub2_12 = Static1.aClass10_Sub1_Sub1_Sub2_1.method869();
		Static46.aClass10_Sub1_Sub1_Sub2_12.method870();
		Static4.aClass10_Sub1_Sub1_Sub2_2 = Static71.aClass10_Sub1_Sub1_Sub2_20.method869();
		Static4.aClass10_Sub1_Sub1_Sub2_2.method871();
		Static4.aClass10_Sub1_Sub1_Sub2_2.method870();
		Static11.aClass10_Sub1_Sub1_Sub2_3 = Static49.aClass10_Sub1_Sub1_Sub2_14.method869();
		Static11.aClass10_Sub1_Sub1_Sub2_3.method871();
		Static11.aClass10_Sub1_Sub1_Sub2_3.method870();
		Static104.aClass10_Sub1_Sub1_Sub2Array5 = Static75.method1168(arg0, Static41.aClass61_482, Static19.aClass61_220);
		Static80.anIntArray241 = new int[151];
		Static67.anIntArray194 = new int[33];
		Static36.anIntArray116 = new int[151];
		Static16.anIntArray59 = new int[33];
		@Pc(351) int local351;
		@Pc(353) int local353;
		@Pc(355) int local355;
		for (@Pc(348) int local348 = 0; local348 < 33; local348++) {
			local351 = 999;
			local353 = 0;
			for (local355 = 0; local355 < 34; local355++) {
				if (Static102.aClass10_Sub1_Sub1_Sub2_25.aByteArray5[Static102.aClass10_Sub1_Sub1_Sub2_25.anInt1570 * local348 + local355] == 0) {
					if (local351 == 999) {
						local351 = local355;
					}
				} else if (local351 != 999) {
					local353 = local355;
					break;
				}
			}
			Static67.anIntArray194[local348] = local351;
			Static16.anIntArray59[local348] = local353 - local351;
		}
		for (local351 = 5; local351 < 156; local351++) {
			local353 = 999;
			local355 = 0;
			for (@Pc(408) int local408 = 25; local408 < 172; local408++) {
				if (Static102.aClass10_Sub1_Sub1_Sub2_25.aByteArray5[local408 + Static102.aClass10_Sub1_Sub1_Sub2_25.anInt1570 * local351] == 0 && (local408 > 34 || local351 > 34)) {
					if (local353 == 999) {
						local353 = local408;
					}
				} else if (local353 != 999) {
					local355 = local408;
					break;
				}
			}
			Static36.anIntArray116[local351 - 5] = local353 - 25;
			Static80.anIntArray241[local351 - 5] = local355 - local353;
		}
		Static103.aBoolean47 = true;
	}

	@OriginalMember(owner = "client!tc", name = "k", descriptor = "(I)V")
	public static void method1153() {
		Static9.aClass15_7.method597();
		Static56.aClass10_Sub1_Sub1_Sub2_16.method873(0, 0);
		Static75.anIntArray233 = Static68.method998(Static75.anIntArray233);
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(B[Lclient!va;)Lclient!va;")
	public static Class61 method1156(@OriginalArg(1) Class61[] arg0) {
		if (arg0.length < 2) {
			throw new IllegalArgumentException();
		}
		return Static44.method707(arg0, arg0.length);
	}
}
