import java.awt.event.KeyEvent;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static85 {

	@OriginalMember(owner = "client!jh", name = "h", descriptor = "[Lclient!kf;")
	public static Class2_Sub2_Sub2_Sub3[] aClass2_Sub2_Sub2_Sub3Array3;

	@OriginalMember(owner = "client!jh", name = "l", descriptor = "Lclient!db;")
	public static Class2_Sub2_Sub2_Sub1_Sub1 aClass2_Sub2_Sub2_Sub1_Sub1_5;

	@OriginalMember(owner = "client!jh", name = "b", descriptor = "[[I")
	public static int[][] anIntArrayArray18 = new int[104][104];

	@OriginalMember(owner = "client!jh", name = "d", descriptor = "[Lclient!hf;")
	public static Class37[] aClass37Array1 = new Class37[16];

	@OriginalMember(owner = "client!jh", name = "g", descriptor = "[[I")
	public static int[][] anIntArrayArray19 = new int[][] { { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 }, { 12, 8, 4, 0, 13, 9, 5, 1, 14, 10, 6, 2, 15, 11, 7, 3 }, { 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 }, { 3, 7, 11, 15, 2, 6, 10, 14, 1, 5, 9, 13, 0, 4, 8, 12 } };

	@OriginalMember(owner = "client!jh", name = "k", descriptor = "I")
	public static int anInt1806 = 0;

	@OriginalMember(owner = "client!jh", name = "n", descriptor = "Lclient!lf;")
	public static Class49 aClass49_899 = Static32.method683("Fertigkeit)2");

	@OriginalMember(owner = "client!jh", name = "t", descriptor = "[I")
	public static int[] anIntArray188 = new int[200];

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(ZB)V")
	public static void method1440(@OriginalArg(0) boolean arg0) {
		Static5.aBoolean7 = arg0;
		@Pc(21) int local21;
		@Pc(29) int local29;
		@Pc(35) int local35;
		@Pc(39) int local39;
		@Pc(65) int local65;
		@Pc(69) int local69;
		@Pc(73) int local73;
		@Pc(133) int local133;
		@Pc(141) int local141;
		@Pc(149) int local149;
		if (!Static5.aBoolean7) {
			local21 = Static86.aClass2_Sub13_Sub1_13.method2939();
			local29 = (Static180.anInt3988 - Static86.aClass2_Sub13_Sub1_13.anInt3940) / 16;
			Static23.anIntArrayArray3 = new int[local29][4];
			for (local35 = 0; local35 < local29; local35++) {
				for (local39 = 0; local39 < 4; local39++) {
					Static23.anIntArrayArray3[local35][local39] = Static86.aClass2_Sub13_Sub1_13.method2946();
				}
			}
			local39 = Static86.aClass2_Sub13_Sub1_13.method2939();
			local65 = Static86.aClass2_Sub13_Sub1_13.method2954();
			local69 = Static86.aClass2_Sub13_Sub1_13.method2933();
			local73 = Static86.aClass2_Sub13_Sub1_13.method2939();
			Static127.aByteArrayArray10 = new byte[local29][];
			@Pc(78) boolean local78 = false;
			Static45.anIntArray104 = new int[local29];
			Static91.anIntArray196 = new int[local29];
			Static78.aByteArrayArray8 = new byte[local29][];
			if ((local39 / 8 == 48 || local39 / 8 == 49) && (local21 / 8) == 48) {
				local78 = true;
			}
			if (local39 / 8 == 48 && local21 / 8 == 148) {
				local78 = true;
			}
			Static71.anIntArray174 = new int[local29];
			local29 = 0;
			for (local133 = (local39 - 6) / 8; local133 <= (local39 + 6) / 8; local133++) {
				for (local141 = (local21 - 6) / 8; local141 <= (local21 + 6) / 8; local141++) {
					local149 = local141 + (local133 << 8);
					if (!local78 || local141 != 49 && local141 != 149 && local141 != 147 && local133 != 50 && (local133 != 49 || local141 != 47)) {
						Static91.anIntArray196[local29] = local149;
						Static45.anIntArray104[local29] = Static151.aClass11_Sub1_34.method2053(Static33.method692(new Class49[] { Static175.aClass49_1707, Static48.method882(local133), Static141.aClass49_1356, Static48.method882(local141) }));
						Static71.anIntArray174[local29] = Static151.aClass11_Sub1_34.method2053(Static33.method692(new Class49[] { Static130.aClass49_1696, Static48.method882(local133), Static141.aClass49_1356, Static48.method882(local141) }));
						local29++;
					}
				}
			}
			Static59.method989(local21, local39, local69, local73, local65);
			return;
		}
		local21 = Static86.aClass2_Sub13_Sub1_13.method2933();
		local29 = Static86.aClass2_Sub13_Sub1_13.method2937();
		local35 = Static86.aClass2_Sub13_Sub1_13.method2958();
		local39 = Static86.aClass2_Sub13_Sub1_13.method2933();
		Static86.aClass2_Sub13_Sub1_13.method2975();
		@Pc(308) int local308;
		for (local65 = 0; local65 < 4; local65++) {
			for (local69 = 0; local69 < 13; local69++) {
				for (local73 = 0; local73 < 13; local73++) {
					local308 = Static86.aClass2_Sub13_Sub1_13.method2978(1);
					if (local308 == 1) {
						Static9.anIntArrayArrayArray1[local65][local69][local73] = Static86.aClass2_Sub13_Sub1_13.method2978(26);
					} else {
						Static9.anIntArrayArrayArray1[local65][local69][local73] = -1;
					}
				}
			}
		}
		Static86.aClass2_Sub13_Sub1_13.method2974();
		local69 = (Static180.anInt3988 - Static86.aClass2_Sub13_Sub1_13.anInt3940) / 16;
		Static23.anIntArrayArray3 = new int[local69][4];
		for (local73 = 0; local73 < local69; local73++) {
			for (local308 = 0; local308 < 4; local308++) {
				Static23.anIntArrayArray3[local73][local308] = Static86.aClass2_Sub13_Sub1_13.method2943();
			}
		}
		local308 = Static86.aClass2_Sub13_Sub1_13.method2939();
		Static91.anIntArray196 = new int[local69];
		Static78.aByteArrayArray8 = new byte[local69][];
		Static127.aByteArrayArray10 = new byte[local69][];
		Static45.anIntArray104 = new int[local69];
		Static71.anIntArray174 = new int[local69];
		local69 = 0;
		for (local133 = 0; local133 < 4; local133++) {
			for (local141 = 0; local141 < 13; local141++) {
				for (local149 = 0; local149 < 13; local149++) {
					@Pc(428) int local428 = Static9.anIntArrayArrayArray1[local133][local141][local149];
					if (local428 != -1) {
						@Pc(438) int local438 = local428 >> 14 & 0x3FF;
						@Pc(444) int local444 = local428 >> 3 & 0x7FF;
						@Pc(454) int local454 = local444 / 8 + (local438 / 8 << 8);
						for (@Pc(456) int local456 = 0; local456 < local69; local456++) {
							if (local454 == Static91.anIntArray196[local456]) {
								local454 = -1;
								break;
							}
						}
						if (local454 != -1) {
							@Pc(481) int local481 = local454 >> 8 & 0xFF;
							Static91.anIntArray196[local69] = local454;
							@Pc(489) int local489 = local454 & 0xFF;
							Static45.anIntArray104[local69] = Static151.aClass11_Sub1_34.method2053(Static33.method692(new Class49[] { Static175.aClass49_1707, Static48.method882(local481), Static141.aClass49_1356, Static48.method882(local489) }));
							Static71.anIntArray174[local69] = Static151.aClass11_Sub1_34.method2053(Static33.method692(new Class49[] { Static130.aClass49_1696, Static48.method882(local481), Static141.aClass49_1356, Static48.method882(local489) }));
							local69++;
						}
					}
				}
			}
		}
		Static59.method989(local35, local21, local308, local39, local29);
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(I)V")
	public static void method1441() {
		anIntArray188 = null;
		aClass2_Sub2_Sub2_Sub1_Sub1_5 = null;
		aClass37Array1 = null;
		aClass2_Sub2_Sub2_Sub3Array3 = null;
		aClass49_899 = null;
		anIntArrayArray18 = null;
		anIntArrayArray19 = null;
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(BLjava/awt/event/KeyEvent;)I")
	public static int method1442(@OriginalArg(1) KeyEvent arg0) {
		@Pc(11) int local11 = arg0.getKeyChar();
		if (local11 == 8364) {
			return 128;
		} else {
			if (local11 <= 0 || local11 >= 256) {
				local11 = -1;
			}
			return local11;
		}
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(III)I")
	public static int method1445(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(20) Class2_Sub19 local20 = (Class2_Sub19) Static70.aClass25_6.method836((long) arg0);
		if (local20 == null) {
			return 0;
		} else if (arg1 == -1) {
			return 0;
		} else {
			@Pc(31) int local31 = 0;
			for (@Pc(33) int local33 = 0; local33 < local20.anIntArray199.length; local33++) {
				if (local20.anIntArray200[local33] == arg1) {
					local31 += local20.anIntArray199[local33];
				}
			}
			return local31;
		}
	}
}
