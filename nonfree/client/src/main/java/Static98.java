import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static98 {

	@OriginalMember(owner = "client!he", name = "a", descriptor = "Lclient!s;")
	public static Class156 aClass156_8;

	@OriginalMember(owner = "client!he", name = "c", descriptor = "Lclient!ph;")
	public static Class138 aClass138_29;

	@OriginalMember(owner = "client!he", name = "d", descriptor = "[I")
	public static int[] anIntArray148 = new int[1000];

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(IIII)V")
	public static void method1448(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg0 == 1010) {
			Static67.method1131(arg2, arg1, 10);
		} else if (arg0 == 1011) {
			Static67.method1131(arg2, arg1, 11);
		} else if (arg0 == 1005) {
			Static67.method1131(arg2, arg1, 12);
		} else if (arg0 == 1009) {
			Static67.method1131(arg2, arg1, 13);
		} else if (arg0 == 1012) {
			Static67.method1131(arg2, arg1, 14);
		}
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(II)V")
	public static void method1450() {
		Static179.aClass169_100.method4020(5);
	}

	@OriginalMember(owner = "client!he", name = "b", descriptor = "(I)V")
	public static void method1451() {
		if (Static92.anInt1758 == 0 || Static92.anInt1758 == 5) {
			return;
		}
		try {
			if (++Static297.anInt5629 > 2000) {
				if (Static81.aClass7_2 != null) {
					Static81.aClass7_2.method105();
					Static81.aClass7_2 = null;
				}
				if (Static289.anInt5491 >= 1) {
					Static213.anInt4207 = -5;
					Static92.anInt1758 = 0;
					return;
				}
				if (Static286.anInt5441 == Static27.anInt508) {
					Static27.anInt508 = Static61.anInt1208;
				} else {
					Static27.anInt508 = Static286.anInt5441;
				}
				Static92.anInt1758 = 1;
				Static297.anInt5629 = 0;
				Static289.anInt5491++;
			}
			if (Static92.anInt1758 == 1) {
				Static110.aClass10_5 = Static117.aClass117_3.method2996(Static27.anInt508, Static216.aString139);
				Static92.anInt1758 = 2;
			}
			if (Static92.anInt1758 == 2) {
				if (Static110.aClass10_5.anInt151 == 2) {
					throw new IOException();
				}
				if (Static110.aClass10_5.anInt151 != 1) {
					return;
				}
				Static81.aClass7_2 = new Class7((Socket) Static110.aClass10_5.anObject1, Static117.aClass117_3);
				Static110.aClass10_5 = null;
				@Pc(107) long local107 = Static154.aLong122 = Static267.method3977(Static82.aString50);
				Static137.aClass1_Sub14_Sub1_6.anInt3290 = 0;
				@Pc(117) int local117 = (int) (local107 >> 16 & 0x1FL);
				Static137.aClass1_Sub14_Sub1_6.method2631(14);
				Static137.aClass1_Sub14_Sub1_6.method2631(local117);
				Static81.aClass7_2.method108(Static137.aClass1_Sub14_Sub1_6.aByteArray34, 2);
				if (Static313.aClass101_2 != null) {
					Static313.aClass101_2.method2811();
				}
				if (Static199.aClass101_1 != null) {
					Static199.aClass101_1.method2811();
				}
				@Pc(147) int local147 = Static81.aClass7_2.method103();
				if (Static313.aClass101_2 != null) {
					Static313.aClass101_2.method2811();
				}
				if (Static199.aClass101_1 != null) {
					Static199.aClass101_1.method2811();
				}
				if (local147 != 0) {
					Static213.anInt4207 = local147;
					Static92.anInt1758 = 0;
					Static81.aClass7_2.method105();
					Static81.aClass7_2 = null;
					return;
				}
				Static92.anInt1758 = 3;
			}
			if (Static92.anInt1758 == 3) {
				if (Static81.aClass7_2.method104() < 8) {
					return;
				}
				Static81.aClass7_2.method102(Static237.aClass1_Sub14_Sub1_7.aByteArray34, 0, 8);
				Static237.aClass1_Sub14_Sub1_7.anInt3290 = 0;
				@Pc(201) int[] local201 = new int[4];
				Static35.aLong32 = Static237.aClass1_Sub14_Sub1_7.method2587();
				Static137.aClass1_Sub14_Sub1_6.anInt3290 = 0;
				local201[0] = (int) (Math.random() * 9.9999999E7D);
				local201[3] = (int) Static35.aLong32;
				local201[2] = (int) (Static35.aLong32 >> 32);
				local201[1] = (int) (Math.random() * 9.9999999E7D);
				Static137.aClass1_Sub14_Sub1_6.method2631(10);
				Static137.aClass1_Sub14_Sub1_6.method2630(local201[0]);
				Static137.aClass1_Sub14_Sub1_6.method2630(local201[1]);
				Static137.aClass1_Sub14_Sub1_6.method2630(local201[2]);
				Static137.aClass1_Sub14_Sub1_6.method2630(local201[3]);
				Static137.aClass1_Sub14_Sub1_6.method2603(Static267.method3977(Static82.aString50));
				Static137.aClass1_Sub14_Sub1_6.method2619(Static250.aString104);
				Static137.aClass1_Sub14_Sub1_6.method2600(Static164.aBigInteger1, Static195.aBigInteger2);
				Static269.aClass1_Sub14_Sub1_2.anInt3290 = 0;
				if (Static258.anInt5016 == 40) {
					Static269.aClass1_Sub14_Sub1_2.method2631(18);
				} else {
					Static269.aClass1_Sub14_Sub1_2.method2631(16);
				}
				Static269.aClass1_Sub14_Sub1_2.method2637(Static137.aClass1_Sub14_Sub1_6.anInt3290 + Static255.method3873(Static198.aString134) + 163);
				Static269.aClass1_Sub14_Sub1_2.method2630(552);
				Static269.aClass1_Sub14_Sub1_2.method2631(Static251.anInt4923);
				Static269.aClass1_Sub14_Sub1_2.method2631(Static242.aBoolean347 ? 1 : 0);
				Static269.aClass1_Sub14_Sub1_2.method2631(1);
				Static269.aClass1_Sub14_Sub1_2.method2631(Static230.method3622());
				Static269.aClass1_Sub14_Sub1_2.method2637(Static159.anInt3348);
				Static269.aClass1_Sub14_Sub1_2.method2637(Static136.anInt2696);
				Static269.aClass1_Sub14_Sub1_2.method2631(Static37.anInt756);
				Static147.method2365(Static269.aClass1_Sub14_Sub1_2);
				Static269.aClass1_Sub14_Sub1_2.method2619(Static198.aString134);
				Static269.aClass1_Sub14_Sub1_2.method2630(Static119.anInt5881);
				Static269.aClass1_Sub14_Sub1_2.method2630(Static27.method484());
				Static152.aBoolean228 = true;
				Static269.aClass1_Sub14_Sub1_2.method2637(Static189.anInt3780);
				Static269.aClass1_Sub14_Sub1_2.method2630(Static106.aClass138_36.method3366());
				Static269.aClass1_Sub14_Sub1_2.method2630(Static63.aClass138_16.method3366());
				Static269.aClass1_Sub14_Sub1_2.method2630(Static34.aClass138_8.method3366());
				Static269.aClass1_Sub14_Sub1_2.method2630(Static208.aClass138_56.method3366());
				Static269.aClass1_Sub14_Sub1_2.method2630(Static273.aClass138_75.method3366());
				Static269.aClass1_Sub14_Sub1_2.method2630(Static124.aClass138_40.method3366());
				Static269.aClass1_Sub14_Sub1_2.method2630(Static132.aClass138_42.method3366());
				Static269.aClass1_Sub14_Sub1_2.method2630(Static264.aClass138_71.method3366());
				Static269.aClass1_Sub14_Sub1_2.method2630(Static241.aClass138_64.method3366());
				Static269.aClass1_Sub14_Sub1_2.method2630(Static240.aClass138_19.method3366());
				Static269.aClass1_Sub14_Sub1_2.method2630(Static48.aClass138_9.method3366());
				Static269.aClass1_Sub14_Sub1_2.method2630(Static136.aClass138_43.method3366());
				Static269.aClass1_Sub14_Sub1_2.method2630(Static209.aClass138_57.method3366());
				Static269.aClass1_Sub14_Sub1_2.method2630(Static286.aClass138_79.method3366());
				Static269.aClass1_Sub14_Sub1_2.method2630(Static167.aClass138_48.method3366());
				Static269.aClass1_Sub14_Sub1_2.method2630(Static157.aClass138_46.method3366());
				Static269.aClass1_Sub14_Sub1_2.method2630(Static264.aClass138_70.method3366());
				Static269.aClass1_Sub14_Sub1_2.method2630(Static295.aClass138_84.method3366());
				Static269.aClass1_Sub14_Sub1_2.method2630(Static247.aClass138_67.method3366());
				Static269.aClass1_Sub14_Sub1_2.method2630(Static274.aClass138_77.method3366());
				Static269.aClass1_Sub14_Sub1_2.method2630(aClass138_29.method3366());
				Static269.aClass1_Sub14_Sub1_2.method2630(Static84.aClass138_24.method3366());
				Static269.aClass1_Sub14_Sub1_2.method2630(Static302.aClass138_86.method3366());
				Static269.aClass1_Sub14_Sub1_2.method2630(Static300.aClass138_85.method3366());
				Static269.aClass1_Sub14_Sub1_2.method2630(Static315.aClass138_92.method3366());
				Static269.aClass1_Sub14_Sub1_2.method2630(Static66.aClass138_17.method3366());
				Static269.aClass1_Sub14_Sub1_2.method2630(Static270.aClass138_72.method3366());
				Static269.aClass1_Sub14_Sub1_2.method2630(Static230.aClass138_60.method3366());
				Static269.aClass1_Sub14_Sub1_2.method2630(Static114.aClass138_38.method3366());
				Static269.aClass1_Sub14_Sub1_2.method2625(Static137.aClass1_Sub14_Sub1_6.anInt3290, Static137.aClass1_Sub14_Sub1_6.aByteArray34);
				Static81.aClass7_2.method108(Static269.aClass1_Sub14_Sub1_2.aByteArray34, Static269.aClass1_Sub14_Sub1_2.anInt3290);
				Static137.aClass1_Sub14_Sub1_6.method2658(local201);
				for (@Pc(568) int local568 = 0; local568 < 4; local568++) {
					local201[local568] += 50;
				}
				Static237.aClass1_Sub14_Sub1_7.method2658(local201);
				Static92.anInt1758 = 4;
			}
			if (Static92.anInt1758 == 4) {
				if (Static81.aClass7_2.method104() < 1) {
					return;
				}
				@Pc(606) int local606 = Static81.aClass7_2.method103();
				if (local606 == 21) {
					Static92.anInt1758 = 7;
				} else if (local606 == 29) {
					Static92.anInt1758 = 10;
				} else if (local606 == 1) {
					Static213.anInt4207 = local606;
					Static92.anInt1758 = 5;
					return;
				} else if (local606 == 2) {
					Static92.anInt1758 = 8;
				} else if (local606 == 15) {
					Static213.anInt4207 = local606;
					Static92.anInt1758 = 0;
					return;
				} else if (local606 == 23 && Static289.anInt5491 < 1) {
					Static92.anInt1758 = 1;
					Static289.anInt5491++;
					Static297.anInt5629 = 0;
					Static81.aClass7_2.method105();
					Static81.aClass7_2 = null;
					return;
				} else {
					Static92.anInt1758 = 0;
					Static213.anInt4207 = local606;
					Static81.aClass7_2.method105();
					Static81.aClass7_2 = null;
					return;
				}
			}
			if (Static92.anInt1758 == 6) {
				Static137.aClass1_Sub14_Sub1_6.anInt3290 = 0;
				Static137.aClass1_Sub14_Sub1_6.method2661(17);
				Static81.aClass7_2.method108(Static137.aClass1_Sub14_Sub1_6.aByteArray34, Static137.aClass1_Sub14_Sub1_6.anInt3290);
				Static92.anInt1758 = 4;
				return;
			}
			if (Static92.anInt1758 == 7) {
				if (Static81.aClass7_2.method104() < 1) {
					return;
				}
				Static290.anInt5498 = (Static81.aClass7_2.method103() + 3) * 60;
				Static92.anInt1758 = 0;
				Static213.anInt4207 = 21;
				Static81.aClass7_2.method105();
				Static81.aClass7_2 = null;
				return;
			}
			if (Static92.anInt1758 == 10) {
				if (Static81.aClass7_2.method104() >= 1) {
					Static38.anInt771 = Static81.aClass7_2.method103();
					Static92.anInt1758 = 0;
					Static213.anInt4207 = 29;
					Static81.aClass7_2.method105();
					Static81.aClass7_2 = null;
					return;
				}
				return;
			}
			if (Static92.anInt1758 == 8) {
				if (Static81.aClass7_2.method104() < 14) {
					return;
				}
				Static81.aClass7_2.method102(Static237.aClass1_Sub14_Sub1_7.aByteArray34, 0, 14);
				Static237.aClass1_Sub14_Sub1_7.anInt3290 = 0;
				Static95.anInt5251 = Static237.aClass1_Sub14_Sub1_7.method2595();
				Static296.anInt5596 = Static237.aClass1_Sub14_Sub1_7.method2595();
				Static310.aBoolean108 = Static237.aClass1_Sub14_Sub1_7.method2595() == 1;
				Static241.aBoolean346 = Static237.aClass1_Sub14_Sub1_7.method2595() == 1;
				Static64.aBoolean222 = Static237.aClass1_Sub14_Sub1_7.method2595() == 1;
				Static206.aBoolean280 = Static237.aClass1_Sub14_Sub1_7.method2595() == 1;
				Static215.aBoolean289 = Static237.aClass1_Sub14_Sub1_7.method2595() == 1;
				Static117.anInt2308 = Static237.aClass1_Sub14_Sub1_7.method2593();
				Static302.aBoolean420 = Static237.aClass1_Sub14_Sub1_7.method2595() == 1;
				Static235.aBoolean341 = Static237.aClass1_Sub14_Sub1_7.method2595() == 1;
				Static132.method2155(Static235.aBoolean341);
				Static154.method2660(Static235.aBoolean341);
				Static224.method3516(Static235.aBoolean341);
				if (!Static242.aBoolean347) {
					if (Static310.aBoolean108 && !Static64.aBoolean222 || Static302.aBoolean420) {
						try {
							Static324.method4224("zap", Static117.aClass117_3.anApplet1);
						} catch (@Pc(910) Throwable local910) {
						}
					} else {
						try {
							Static324.method4224("unzap", Static117.aClass117_3.anApplet1);
						} catch (@Pc(900) Throwable local900) {
						}
					}
				}
				try {
					Static324.method4224("loggedin", Static117.aClass117_3.anApplet1);
				} catch (@Pc(918) Throwable local918) {
				}
				Static117.anInt2306 = Static237.aClass1_Sub14_Sub1_7.method2654();
				Static127.anInt2543 = Static237.aClass1_Sub14_Sub1_7.method2593();
				Static92.anInt1758 = 9;
			}
			if (Static92.anInt1758 == 9) {
				if (Static81.aClass7_2.method104() >= Static127.anInt2543) {
					Static237.aClass1_Sub14_Sub1_7.anInt3290 = 0;
					Static81.aClass7_2.method102(Static237.aClass1_Sub14_Sub1_7.aByteArray34, 0, Static127.anInt2543);
					Static92.anInt1758 = 0;
					Static213.anInt4207 = 2;
					Static124.method1999();
					Static305.anInt5793 = -1;
					Static281.method4172(false);
					Static117.anInt2306 = -1;
					return;
				}
				return;
			}
		} catch (@Pc(968) IOException local968) {
			if (Static81.aClass7_2 != null) {
				Static81.aClass7_2.method105();
				Static81.aClass7_2 = null;
			}
			if (Static289.anInt5491 >= 1) {
				Static92.anInt1758 = 0;
				Static213.anInt4207 = -4;
			} else {
				if (Static27.anInt508 == Static286.anInt5441) {
					Static27.anInt508 = Static61.anInt1208;
				} else {
					Static27.anInt508 = Static286.anInt5441;
				}
				Static289.anInt5491++;
				Static92.anInt1758 = 1;
				Static297.anInt5629 = 0;
			}
		}
	}
}
