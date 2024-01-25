import java.awt.Canvas;
import java.awt.Container;
import java.awt.Frame;
import java.awt.Insets;
import java.awt.Rectangle;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.Socket;
import java.util.GregorianCalendar;
import java.util.Vector;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!client")
public final class client extends Applet_Sub1 {

	@OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V")
	public static void main(@OriginalArg(0) String[] arg0) {
		try {
			if (arg0.length != 6) {
				Static474.method7101("Argument count");
			}
			Static537.aClass357_3 = new Class357();
			Static537.aClass357_3.anInt9936 = Integer.parseInt(arg0[0]);
			Static575.aClass357_5 = new Class357();
			Static575.aClass357_5.anInt9936 = Integer.parseInt(arg0[1]);
			Static548.aClass59_10 = Static543.aClass59_9;
			if (arg0[3].equals("live")) {
				Static108.aClass229_1 = Static660.aClass229_5;
			} else if (arg0[3].equals("rc")) {
				Static108.aClass229_1 = Static449.aClass229_6;
			} else if (arg0[3].equals("wip")) {
				Static108.aClass229_1 = Static312.aClass229_4;
			} else {
				Static474.method7101("modewhat");
			}
			Static26.anInt352 = Static69.method1093(arg0[4]);
			if (Static26.anInt352 == -1) {
				if (arg0[4].equals("english")) {
					Static26.anInt352 = 0;
				} else if (arg0[4].equals("german")) {
					Static26.anInt352 = 1;
				} else {
					Static474.method7101("language");
				}
			}
			Static571.aBoolean654 = false;
			Static482.aBoolean588 = false;
			if (arg0[5].equals("game0")) {
				Static161.aClass80_6 = Static344.aClass80_7;
			} else if (arg0[5].equals("game1")) {
				Static161.aClass80_6 = Static480.aClass80_10;
			} else if (arg0[5].equals("game2")) {
				Static161.aClass80_6 = Static433.aClass80_9;
			} else if (arg0[5].equals("game3")) {
				Static161.aClass80_6 = Static20.aClass80_1;
			} else {
				Static474.method7101("game");
			}
			Static538.anInt9200 = 0;
			Static130.aString30 = "";
			Static6.aBoolean10 = true;
			Static459.aBoolean734 = true;
			Static653.aLong311 = 0L;
			Static125.aBoolean141 = false;
			Static105.aBoolean665 = false;
			Static449.anInt7513 = 0;
			Static528.anInt9083 = 0;
			Static573.aString106 = null;
			Static510.anInt8857 = Static161.aClass80_6.anInt1861;
			Static624.aByteArray106 = null;
			@Pc(237) client local237 = new client();
			Static105.aClient4 = local237;
			local237.method1342(Static161.aClass80_6.aString28, Static108.aClass229_1.method5511() + 32);
			Static613.aFrame2.setLocation(40, 40);
		} catch (@Pc(260) Exception local260) {
			Static629.method8829((String) null, local260);
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(B)V")
	@Override
	public synchronized void method1347() {
		if (Static531.anApplet2 != null && Static626.aCanvas12 == null && !Static344.aClass173_5.aBoolean359) {
			try {
				@Pc(17) Class local17 = Static531.anApplet2.getClass();
				@Pc(23) Field local23 = local17.getDeclaredField("canvas");
				Static626.aCanvas12 = (Canvas) local23.get(Static531.anApplet2);
				local23.set(Static531.anApplet2, (Object) null);
				if (Static626.aCanvas12 != null) {
					return;
				}
			} catch (@Pc(37) Exception local37) {
			}
		}
		super.method1347();
	}

	@OriginalMember(owner = "client!client", name = "m", descriptor = "(I)V")
	private void method1356() {
		if (Static685.aClass24_3.anInt347 > Static2.anInt17) {
			Static564.aClass357_4.method8506();
			Static370.anInt6288 = (Static685.aClass24_3.anInt347 - 1) * 250;
			if (Static370.anInt6288 > 3000) {
				Static370.anInt6288 = 3000;
			}
			if (Static685.aClass24_3.anInt347 >= 2 && Static685.aClass24_3.anInt348 == 6) {
				this.method1346("js5connect_outofdate");
				Static387.anInt9114 = 16;
				return;
			}
			if (Static685.aClass24_3.anInt347 >= 4 && Static685.aClass24_3.anInt348 == -1) {
				this.method1346("js5crc");
				Static387.anInt9114 = 16;
				return;
			}
			if (Static685.aClass24_3.anInt347 >= 4 && Static53.method970(Static387.anInt9114)) {
				if (Static685.aClass24_3.anInt348 == 7 || Static685.aClass24_3.anInt348 == 9) {
					this.method1346("js5connect_full");
				} else if (Static685.aClass24_3.anInt348 <= 0) {
					this.method1346("js5io");
				} else if (Static321.aString74 == null) {
					this.method1346("js5connect");
				} else {
					this.method1346("js5proxy_" + Static321.aString74.trim());
				}
				Static387.anInt9114 = 16;
				return;
			}
		}
		Static2.anInt17 = Static685.aClass24_3.anInt347;
		if (Static370.anInt6288 > 0) {
			Static370.anInt6288--;
			return;
		}
		try {
			if (Static345.anInt5865 == 0) {
				Static98.aClass230_2 = Static564.aClass357_4.method8511(Static344.aClass173_5);
				Static345.anInt5865++;
			}
			if (Static345.anInt5865 == 1) {
				if (Static98.aClass230_2.anInt6256 == 2) {
					if (Static98.aClass230_2.anObject12 != null) {
						Static321.aString74 = (String) Static98.aClass230_2.anObject12;
					}
					this.method1365(1000);
					return;
				}
				if (Static98.aClass230_2.anInt6256 == 1) {
					Static345.anInt5865++;
				}
			}
			if (Static345.anInt5865 == 2) {
				Static65.aClass20_2 = new Class20((Socket) Static98.aClass230_2.anObject12, Static344.aClass173_5, 25000);
				@Pc(252) Class14_Sub21 local252 = new Class14_Sub21(5);
				local252.method7747(Static307.aClass358_2.anInt9944);
				local252.method7730(661);
				Static65.aClass20_2.method295(5, local252.aByteArray99);
				Static345.anInt5865++;
				Static491.aLong227 = Static26.method382();
			}
			if (Static345.anInt5865 == 3) {
				if (Static53.method970(Static387.anInt9114) || Static65.aClass20_2.method288() > 0) {
					@Pc(317) int local317 = Static65.aClass20_2.method290();
					if (local317 != 0) {
						this.method1365(local317);
						return;
					}
					Static345.anInt5865++;
				} else if (Static26.method382() - Static491.aLong227 > 30000L) {
					this.method1365(1001);
					return;
				}
			}
			if (Static345.anInt5865 == 4) {
				@Pc(360) boolean local360 = Static53.method970(Static387.anInt9114) || Static648.method9079(Static387.anInt9114) || Static232.method3903(Static387.anInt9114);
				@Pc(363) Class303[] local363 = Static508.method7618();
				@Pc(371) Class14_Sub21 local371 = new Class14_Sub21(local363.length * 4);
				Static65.aClass20_2.method289(local371.aByteArray99.length, 0, local371.aByteArray99);
				for (@Pc(382) int local382 = 0; local382 < local363.length; local382++) {
					local363[local382].method7616(local371.method7748());
				}
				Static685.aClass24_3.method364(Static65.aClass20_2, !local360);
				Static345.anInt5865 = 0;
				Static98.aClass230_2 = null;
				Static65.aClass20_2 = null;
			}
		} catch (@Pc(421) IOException local421) {
			this.method1365(1002);
		}
	}

	@OriginalMember(owner = "client!client", name = "l", descriptor = "(I)V")
	private void method1357() {
		@Pc(7) boolean local7 = Static685.aClass24_3.method376();
		if (!local7) {
			this.method1356();
		}
	}

	@OriginalMember(owner = "client!client", name = "o", descriptor = "(I)V")
	private void method1358() {
		@Pc(44) int local44;
		if (Static387.anInt9114 == 7 && !Static355.method5401() || Static387.anInt9114 == 9 && Static203.anInt3512 == 42) {
			if (Static132.anInt2081 > 1) {
				Static132.anInt2081--;
				Static504.anInt8772 = Static154.anInt2379;
			}
			if (!Static455.aBoolean533) {
				Static374.method5795();
			}
			for (local44 = 0; local44 < 100 && Static572.method8155(Static277.aClass347_1); local44++) {
			}
		}
		Static468.anInt7945++;
		Static97.method1617(-1, -1, (Class299) null);
		Static507.method7601(-1, -1, (Class299) null);
		Static327.method5104();
		Static154.anInt2379++;
		for (local44 = 0; local44 < Static549.anInt1216; local44++) {
			@Pc(106) Class4_Sub3_Sub3_Sub3_Sub1 local106 = Static28.aClass14_Sub44Array2[local44].aClass4_Sub3_Sub3_Sub3_Sub1_2;
			if (local106 != null) {
				@Pc(112) byte local112 = local106.aClass362_1.aByte129;
				if ((local112 & 0x1) != 0) {
					@Pc(123) int local123 = local106.method2870(0);
					@Pc(151) int local151;
					if ((local112 & 0x2) != 0 && local106.anInt3298 == 0 && Math.random() * 1000.0D < 10.0D) {
						local151 = (int) Math.round(Math.random() * 10.0D - 5.0D);
						@Pc(159) int local159 = (int) Math.round(Math.random() * 10.0D - 5.0D);
						if (local151 != 0 || local159 != 0) {
							@Pc(173) int local173 = local106.anIntArray200[0] + local151;
							if (local173 < 0) {
								local173 = 0;
							} else if (Static380.anInt6689 - local123 - 1 < local173) {
								local173 = Static380.anInt6689 - local123 - 1;
							}
							@Pc(205) int local205 = local106.anIntArray201[0] + local159;
							if (local205 < 0) {
								local205 = 0;
							} else if (local205 > Static542.anInt9214 - local123 - 1) {
								local205 = Static542.anInt9214 - local123 - 1;
							}
							@Pc(260) int local260 = Static686.method9454(local123, Static40.aClass289Array1[local106.aByte146], Static310.anIntArray306, local123, local106.anIntArray200[0], -1, Static684.anIntArray600, local106.anIntArray201[0], true, 0, local173, 0, local123, local205);
							if (local260 > 0) {
								if (local260 > 9) {
									local260 = 9;
								}
								for (@Pc(274) int local274 = 0; local274 < local260; local274++) {
									local106.anIntArray200[local274] = Static684.anIntArray600[local260 - local274 - 1];
									local106.anIntArray201[local274] = Static310.anIntArray306[local260 - local274 - 1];
									local106.aByteArray50[local274] = 1;
								}
								local106.anInt3298 = local260;
							}
						}
					}
					Static556.method8037(local106, true);
					local151 = Static395.method6021(local106);
					Static216.method5719(local106);
					Static73.method1221(local151, Static198.anInt3445, local106, Static583.anInt9645);
					Static633.method9092(Static583.anInt9645, local106);
					Static147.method2177(local106);
				}
			}
		}
		if ((Static387.anInt9114 == 3 || Static387.anInt9114 == 9 || Static387.anInt9114 == 7) && (!Static355.method5401() || Static387.anInt9114 == 9 && Static203.anInt3512 == 42) && Static465.anInt7807 == 0) {
			if (Static304.anInt5410 == 2) {
				Static502.method7567();
			} else {
				Static267.method4408();
			}
			if (Static70.anInt1085 >> 9 < 14 || Static70.anInt1085 >> 9 >= Static380.anInt6689 - 14 || Static229.anInt4393 >> 9 < 14 || Static542.anInt9214 - 14 <= Static229.anInt4393 >> 9) {
				Static537.method7911();
			}
		}
		while (true) {
			@Pc(462) Class14_Sub10 local462;
			@Pc(467) Class299 local467;
			@Pc(479) Class299 local479;
			do {
				local462 = (Class14_Sub10) Static401.aClass32_41.method579();
				if (local462 == null) {
					while (true) {
						do {
							local462 = (Class14_Sub10) Static72.aClass32_1.method579();
							if (local462 == null) {
								while (true) {
									do {
										local462 = (Class14_Sub10) Static97.aClass32_6.method579();
										if (local462 == null) {
											if (Static649.aClass299_12 != null) {
												Static377.method5815();
											}
											if (Static530.anInt9105 % 1500 == 0) {
												Static533.method7883();
											}
											if (Static387.anInt9114 == 7 && !Static355.method5401() || Static387.anInt9114 == 9 && Static203.anInt3512 == 42) {
												Static553.method7985();
											}
											Static188.method2811();
											if (Static610.aBoolean693 && Static3.aLong5 < Static26.method382() - 60000L) {
												Static32.method9346();
											}
											for (@Pc(674) Class4_Sub4_Sub2 local674 = (Class4_Sub4_Sub2) Static417.aClass283_9.method6791(); local674 != null; local674 = (Class4_Sub4_Sub2) Static417.aClass283_9.method6792()) {
												if (Static26.method382() / 1000L - 5L > (long) local674.anInt8718) {
													if (local674.aShort85 > 0) {
														Static187.method2752(local674.aString100 + Static21.aClass21_18.method324(Static26.anInt352), 0, "", "", 5, "");
													}
													if (local674.aShort85 == 0) {
														Static187.method2752(local674.aString100 + Static21.aClass21_19.method324(Static26.anInt352), 0, "", "", 5, "");
													}
													local674.method9473();
												}
											}
											if (Static387.anInt9114 == 7 && !Static355.method5401() || Static387.anInt9114 == 9 && Static203.anInt3512 == 42) {
												if (Static387.anInt9114 != 9 && Static277.aClass347_1.aClass278_2 == null) {
													Static334.method5151(false);
													return;
												}
												if (Static277.aClass347_1 != null) {
													Static277.aClass347_1.anInt9632++;
													if (Static277.aClass347_1.anInt9632 > 50) {
														@Pc(823) Class14_Sub54 local823 = Static72.method1195(Static277.aClass347_1.aClass197_2, Static117.aClass251_66);
														Static277.aClass347_1.method8308(local823);
													}
													try {
														Static277.aClass347_1.method8303();
														return;
													} catch (@Pc(832) IOException local832) {
														if (Static387.anInt9114 != 9) {
															Static334.method5151(false);
															return;
														}
														Static277.aClass347_1.method8306();
														return;
													}
												}
											}
											return;
										}
										local467 = local462.aClass299_2;
										if (local467.anInt8590 < 0) {
											break;
										}
										local479 = Static391.method5936(local467.anInt8527);
									} while (local479 == null || local479.aClass299Array1 == null || local479.aClass299Array1.length <= local467.anInt8590 || local479.aClass299Array1[local467.anInt8590] != local467);
									Static672.method9304(local462);
								}
							}
							local467 = local462.aClass299_2;
							if (local467.anInt8590 < 0) {
								break;
							}
							local479 = Static391.method5936(local467.anInt8527);
						} while (local479 == null || local479.aClass299Array1 == null || local467.anInt8590 >= local479.aClass299Array1.length || local479.aClass299Array1[local467.anInt8590] != local467);
						Static672.method9304(local462);
					}
				}
				local467 = local462.aClass299_2;
				if (local467.anInt8590 < 0) {
					break;
				}
				local479 = Static391.method5936(local467.anInt8527);
			} while (local479 == null || local479.aClass299Array1 == null || local479.aClass299Array1.length <= local467.anInt8590 || local479.aClass299Array1[local467.anInt8590] != local467);
			Static672.method9304(local462);
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(B)V")
	@Override
	protected void method1355() {
		if (Static105.aBoolean665) {
			Static360.anInt6168 = 64;
		}
		@Pc(18) Frame local18 = new Frame("Jagex");
		local18.pack();
		local18.dispose();
		Static261.method4366();
		Static466.aClass364_2 = new Class364(Static344.aClass173_5);
		Static685.aClass24_3 = new Class24();
		Static649.method9109(new int[] { 20, 260 }, new int[] { 1000, 100 });
		if (Static548.aClass59_10 != Static115.aClass59_4) {
			Static519.aByteArrayArray28 = new byte[50][];
		}
		Static181.aClass14_Sub26_9 = Static68.method1085();
		if (Static548.aClass59_10 == Static115.aClass59_4) {
			Static537.aClass357_3.aString110 = this.getCodeBase().getHost();
		} else if (Static228.method3846(Static548.aClass59_10)) {
			Static537.aClass357_3.aString110 = this.getCodeBase().getHost();
			Static537.aClass357_3.anInt9929 = Static537.aClass357_3.anInt9936 + 40000;
			Static575.aClass357_5.anInt9929 = Static575.aClass357_5.anInt9936 + 40000;
			Static537.aClass357_3.anInt9932 = Static537.aClass357_3.anInt9936 + 50000;
			Static575.aClass357_5.anInt9932 = Static575.aClass357_5.anInt9936 + 50000;
		} else if (Static548.aClass59_10 == Static543.aClass59_9) {
			Static537.aClass357_3.aString110 = "127.0.0.1";
			Static575.aClass357_5.aString110 = "127.0.0.1";
			Static537.aClass357_3.anInt9929 = Static537.aClass357_3.anInt9936 + 40000;
			Static537.aClass357_3.anInt9932 = Static537.aClass357_3.anInt9936 + 50000;
			Static575.aClass357_5.anInt9929 = Static575.aClass357_5.anInt9936 + 40000;
			Static575.aClass357_5.anInt9932 = Static575.aClass357_5.anInt9936 + 50000;
		}
		Static365.aShortArray90 = Static378.aShortArray91 = Static566.aShortArray119 = Static580.aShortArray130 = new short[256];
		Static564.aClass357_4 = Static537.aClass357_3;
		if (Static161.aClass80_6 == Static344.aClass80_7) {
			Static465.aBoolean546 = false;
		}
		try {
			Static661.aClipboard1 = Static105.aClient4.getToolkit().getSystemClipboard();
		} catch (@Pc(192) Exception local192) {
		}
		Static89.aClass207_3 = Static289.method4814(Static626.aCanvas12);
		Static656.aClass118_1 = Static540.method7941(Static626.aCanvas12);
		try {
			if (Static344.aClass173_5.aClass345_2 != null) {
				Static230.aClass243_2 = new Class243(Static344.aClass173_5.aClass345_2, 5200, 0);
				for (@Pc(214) int local214 = 0; local214 < 37; local214++) {
					Static349.aClass243Array1[local214] = new Class243(Static344.aClass173_5.aClass345Array1[local214], 6000, 0);
				}
				Static24.aClass243_1 = new Class243(Static344.aClass173_5.aClass345_1, 6000, 0);
				Static166.aClass384_2 = new Class384(255, Static230.aClass243_2, Static24.aClass243_1, 500000);
				Static413.aClass243_3 = new Class243(Static344.aClass173_5.aClass345_3, 24, 0);
				Static344.aClass173_5.aClass345Array1 = null;
				Static344.aClass173_5.aClass345_1 = null;
				Static344.aClass173_5.aClass345_3 = null;
				Static344.aClass173_5.aClass345_2 = null;
			}
		} catch (@Pc(274) IOException local274) {
			Static166.aClass384_2 = null;
			Static413.aClass243_3 = null;
			Static24.aClass243_1 = null;
			Static230.aClass243_2 = null;
		}
		if (Static548.aClass59_10 != Static115.aClass59_4) {
			Static432.aBoolean511 = true;
		}
		Static473.aString92 = Static21.aClass21_11.method324(Static26.anInt352);
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(B)V")
	private void method1361() {
		if (Static387.anInt9114 == 16) {
			return;
		}
		@Pc(20) long local20 = Static365.method5500() / 1000000L - Static319.aLong160;
		Static319.aLong160 = Static365.method5500() / 1000000L;
		@Pc(35) boolean local35 = Static191.method2891();
		if (local35 && Static460.aBoolean599 && Static571.aClass37_3 != null) {
			Static571.aClass37_3.method4369();
		}
		if (Static410.method6169(Static387.anInt9114)) {
			if (Static335.aLong164 != 0L && Static335.aLong164 < Static26.method382()) {
				Static89.method8701(false, Static250.anInt4757, Static141.method2141(), Static592.anInt9783);
			} else if (!Static103.aClass144_3.method6944() && Static376.aBoolean625) {
				Static589.method8394();
			}
		}
		@Pc(117) int local117;
		@Pc(121) int local121;
		if (Static12.aFrame1 == null) {
			@Pc(101) Container local101;
			if (Static613.aFrame2 != null) {
				local101 = Static613.aFrame2;
			} else if (Static531.anApplet2 == null) {
				local101 = Static267.anApplet_Sub1_1;
			} else {
				local101 = Static531.anApplet2;
			}
			local117 = local101.getSize().width;
			local121 = local101.getSize().height;
			if (Static613.aFrame2 == local101) {
				@Pc(127) Insets local127 = Static613.aFrame2.getInsets();
				local117 -= local127.left + local127.right;
				local121 -= local127.top + local127.bottom;
			}
			if (local117 != Static34.anInt543 || local121 != Static235.anInt4561 || Static178.aBoolean203) {
				if (Static103.aClass144_3 == null || Static103.aClass144_3.method6895()) {
					Static261.method4366();
				} else {
					Static34.anInt543 = local117;
					Static235.anInt4561 = local121;
				}
				Static335.aLong164 = Static26.method382() + 500L;
				Static178.aBoolean203 = false;
			}
		}
		if (Static12.aFrame1 != null && !Static271.aBoolean373 && Static410.method6169(Static387.anInt9114)) {
			Static89.method8701(false, -1, Static181.aClass14_Sub26_9.aClass43_Sub15_1.method4526(), -1);
		}
		@Pc(219) boolean local219 = false;
		if (Static467.aBoolean547) {
			Static467.aBoolean547 = false;
			local219 = true;
		}
		if (local219) {
			Static118.method1852();
		}
		if (Static103.aClass144_3 != null && Static103.aClass144_3.method6944() || Static141.method2141() != 1) {
			Static438.method6532();
		}
		if (Static53.method970(Static387.anInt9114)) {
			Static512.method9098(local219);
		} else if (Static178.method2625(Static387.anInt9114)) {
			Static264.method4390();
		} else if (Static619.method8706(Static387.anInt9114)) {
			Static264.method4390();
		} else if (Static260.method4351(Static387.anInt9114)) {
			if (Static472.anInt8114 == 1) {
				if (Static140.anInt2225 > Static11.anInt179) {
					Static11.anInt179 = Static140.anInt2225;
				}
				local117 = (Static11.anInt179 - Static140.anInt2225) * 50 / Static11.anInt179;
				Static478.method7167(Static372.aClass350_5, Static446.aClass68_8, true, Static21.aClass21_11.method324(Static26.anInt352) + "<br>(" + local117 + "%)", Static103.aClass144_3);
			} else if (Static472.anInt8114 == 2) {
				if (Static464.anInt7758 > Static101.anInt1762) {
					Static101.anInt1762 = Static464.anInt7758;
				}
				local117 = (Static101.anInt1762 - Static464.anInt7758) * 50 / Static101.anInt1762 + 50;
				Static478.method7167(Static372.aClass350_5, Static446.aClass68_8, true, Static21.aClass21_11.method324(Static26.anInt352) + "<br>(" + local117 + "%)", Static103.aClass144_3);
			} else {
				Static478.method7167(Static372.aClass350_5, Static446.aClass68_8, true, Static21.aClass21_11.method324(Static26.anInt352), Static103.aClass144_3);
			}
		} else if (Static387.anInt9114 == 11) {
			Static562.method8084(local20);
		} else if (Static387.anInt9114 == 14) {
			Static478.method7167(Static372.aClass350_5, Static446.aClass68_8, false, Static21.aClass21_13.method324(Static26.anInt352) + "<br>" + Static21.aClass21_14.method324(Static26.anInt352), Static103.aClass144_3);
		} else if (Static387.anInt9114 == 15) {
			Static478.method7167(Static372.aClass350_5, Static446.aClass68_8, false, Static21.aClass21_30.method324(Static26.anInt352), Static103.aClass144_3);
		}
		if (Static58.anInt983 == 3) {
			for (local117 = 0; local117 < Static132.anInt2080; local117++) {
				@Pc(495) Rectangle local495 = Class14_Sub33.aRectangleArray2[local117];
				if (Static234.aBooleanArray13[local117]) {
					Static103.aClass144_3.method6906(local495.x, local495.height, local495.width, -65281, local495.y);
				} else if (Static655.aBooleanArray27[local117]) {
					Static103.aClass144_3.method6906(local495.x, local495.height, local495.width, -65536, local495.y);
				} else {
					Static103.aClass144_3.method6906(local495.x, local495.height, local495.width, -16711936, local495.y);
				}
			}
		}
		if (Static562.method8085()) {
			Static438.method6535(Static103.aClass144_3);
		}
		if (Static344.aClass173_5.aBoolean359 && Static410.method6169(Static387.anInt9114) && Static58.anInt983 == 0 && Static141.method2141() == 1 && !local219) {
			local117 = 0;
			for (local121 = 0; local121 < Static132.anInt2080; local121++) {
				if (Static655.aBooleanArray27[local121]) {
					Static655.aBooleanArray27[local121] = false;
					Static10.aRectangleArray1[local117++] = Class14_Sub33.aRectangleArray2[local121];
				}
			}
			try {
				if (Static656.aBoolean741) {
					Static258.method4322(Static10.aRectangleArray1, local117);
				} else {
					Static103.aClass144_3.method6951(local117, Static10.aRectangleArray1);
				}
			} catch (@Pc(711) Exception_Sub1 local711) {
			}
		} else if (!Static53.method970(Static387.anInt9114)) {
			for (local117 = 0; local117 < Static132.anInt2080; local117++) {
				Static655.aBooleanArray27[local117] = false;
			}
			try {
				if (Static656.aBoolean741) {
					Static359.method5456();
				} else {
					Static103.aClass144_3.method6928();
				}
			} catch (@Pc(635) Exception_Sub1 local635) {
				Static629.method8829(local635.getMessage() + " (Recovered) " + this.method1350(), local635);
				Static459.method8986(false, 0);
			}
		}
		Static216.method5677();
		local117 = Static181.aClass14_Sub26_9.aClass43_Sub9_1.method3015();
		if (local117 == 0) {
			Static548.method7968(15L);
		} else if (local117 == 1) {
			Static548.method7968(10L);
		} else if (local117 == 2) {
			Static548.method7968(5L);
		} else if (local117 == 3) {
			Static548.method7968(2L);
		}
		if (Static655.aBoolean740) {
			Static90.method1505();
		}
		if (Static181.aClass14_Sub26_9.aClass43_Sub18_1.method5170() == 1 && Static387.anInt9114 == 3 && Static358.anInt6145 != -1) {
			Static181.aClass14_Sub26_9.method5270(0, Static181.aClass14_Sub26_9.aClass43_Sub18_1);
			Static574.method8188();
		}
	}

	@OriginalMember(owner = "client!client", name = "k", descriptor = "(I)V")
	private void method1362() {
		if (Static387.anInt9114 == 16) {
			return;
		}
		Static530.anInt9105++;
		if (Static530.anInt9105 % 1000 == 1) {
			@Pc(27) GregorianCalendar local27 = new GregorianCalendar();
			Static596.anInt9848 = local27.get(11) * 600 + local27.get(12) * 10 + local27.get(13) / 6;
			Static476.aRandom1.setSeed((long) Static596.anInt9848);
		}
		Static277.aClass347_2.method8302();
		Static277.aClass347_1.method8302();
		this.method1357();
		if (Static343.aClass52_1 != null) {
			Static343.aClass52_1.method1028();
		}
		Static342.method5224();
		Static589.method8393();
		Static89.aClass207_3.method5067();
		Static656.aClass118_1.method7595();
		if (Static103.aClass144_3 != null) {
			Static103.aClass144_3.method6946((int) Static26.method382());
		}
		Static166.method2391();
		Static200.anInt9878 = 0;
		Static563.anInt4938 = 0;
		for (@Pc(98) Interface17 local98 = Static89.aClass207_3.method5069(); local98 != null; local98 = Static89.aClass207_3.method5069()) {
			@Pc(106) int local106 = local98.method649();
			if (local106 == 2 || local106 == 3) {
				@Pc(122) char local122 = local98.method650();
				if (Static473.method7088() && (local122 == '`' || local122 == '§' || local122 == '²')) {
					if (Static562.method8085()) {
						Static136.method2059();
					} else {
						Static644.method9056();
					}
				} else if (Static563.anInt4938 < 128) {
					Static340.anInterface17Array1[Static563.anInt4938] = local98;
					Static563.anInt4938++;
				}
			} else if (local106 == 0 && Static200.anInt9878 < 75) {
				Static376.anInterface17Array3[Static200.anInt9878] = local98;
				Static200.anInt9878++;
			}
		}
		Static438.anInt7390 = 0;
		for (@Pc(220) Class14_Sub29 local220 = Static656.aClass118_1.method7594(); local220 != null; local220 = Static656.aClass118_1.method7594()) {
			@Pc(228) int local228 = local220.method7856();
			if (local228 == -1) {
				Static502.aClass32_58.method582(local220);
			} else if (local228 == 6) {
				Static438.anInt7390 += local220.method7860();
			} else if (Static60.method1026(local228)) {
				Static477.aClass32_54.method582(local220);
				if (Static477.aClass32_54.method589() > 10) {
					Static477.aClass32_54.method579();
				}
			}
		}
		if (Static562.method8085()) {
			Static68.method1084();
		}
		if (Static53.method970(Static387.anInt9114)) {
			Static507.method7604();
			Static459.method8984();
		} else if (Static260.method4351(Static387.anInt9114)) {
			Static99.method1657();
		}
		if (Static648.method9079(Static387.anInt9114) && !Static260.method4351(Static387.anInt9114)) {
			this.method1358();
			Static64.method1040();
			Static475.method7125();
		} else if (Static232.method3903(Static387.anInt9114) && !Static260.method4351(Static387.anInt9114)) {
			this.method1358();
			Static475.method7125();
		} else if (Static387.anInt9114 == 13) {
			Static475.method7125();
		} else if (Static111.method1779(Static387.anInt9114) && !Static260.method4351(Static387.anInt9114)) {
			Static642.method9005();
		} else if (Static387.anInt9114 == 14 || Static387.anInt9114 == 15) {
			Static475.method7125();
			if (Static203.anInt3512 != -3 && Static203.anInt3512 != 2 && Static203.anInt3512 != 15) {
				if (Static387.anInt9114 == 15) {
					Static160.anInt2462 = Static203.anInt3512;
					Static466.anInt7823 = Static301.anInt5895;
					Static600.anInt9920 = Static368.anInt6246;
					if (Static167.aBoolean180) {
						Static332.method5147(Static164.aClass357_1.anInt9936, Static164.aClass357_1.aString110);
						Static277.aClass347_2.aClass278_2 = null;
						Static160.method2323(14);
					} else {
						Static334.method5151(Static669.aBoolean764);
					}
				} else {
					Static334.method5151(false);
				}
			}
		}
		Static238.method3985(Static103.aClass144_3);
		Static477.aClass32_54.method579();
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(B)Ljava/lang/String;")
	@Override
	public String method1350() {
		@Pc(5) String local5 = null;
		try {
			local5 = "[1)" + Static36.anInt617 + "," + Static550.anInt9242 + "," + Static380.anInt6689 + "," + Static542.anInt9214 + "|";
			if (Static294.aClass4_Sub3_Sub3_Sub3_Sub2_1 != null) {
				local5 = local5 + "2)" + Static391.anInt6811 + "," + (Static294.aClass4_Sub3_Sub3_Sub3_Sub2_1.anIntArray200[0] + Static36.anInt617) + "," + (Static550.anInt9242 + Static294.aClass4_Sub3_Sub3_Sub3_Sub2_1.anIntArray201[0]) + "|";
			}
			local5 = local5 + "3)" + Static181.aClass14_Sub26_9.aClass43_Sub1_1.method801() + "|4)" + Static181.aClass14_Sub26_9.aClass43_Sub17_1.method4949() + "|5)" + Static141.method2141() + "|6)" + Static563.anInt4939 + "," + Static506.anInt8791 + "|";
			local5 = local5 + "7)" + Static181.aClass14_Sub26_9.aClass43_Sub16_1.method4851() + "|";
			local5 = local5 + "8)" + Static181.aClass14_Sub26_9.aClass43_Sub8_1.method2751() + "|";
			local5 = local5 + "9)" + Static181.aClass14_Sub26_9.aClass43_Sub14_1.method4225() + "|";
			local5 = local5 + "10)" + Static181.aClass14_Sub26_9.aClass43_Sub5_1.method1872() + "|";
			local5 = local5 + "11)" + Static181.aClass14_Sub26_9.aClass43_Sub23_1.method7067() + "|";
			local5 = local5 + "12)" + Static181.aClass14_Sub26_9.aClass43_Sub19_1.method5412() + "|";
			local5 = local5 + "13)" + Static360.anInt6168 + "|";
			local5 = local5 + "14)" + Static387.anInt9114;
			if (Static526.aClass14_Sub12_1 != null) {
				local5 = local5 + "|15)" + Static526.aClass14_Sub12_1.anInt1226;
			}
			try {
				if (Static181.aClass14_Sub26_9.aClass43_Sub1_1.method801() == 2) {
					@Pc(281) Class local281 = Class.forName("java.lang.ClassLoader");
					@Pc(287) Field local287 = local281.getDeclaredField("nativeLibraries");
					@Pc(292) Class local292 = Class.forName("java.lang.reflect.AccessibleObject");
					@Pc(304) Method local304 = local292.getDeclaredMethod("setAccessible", Boolean.TYPE);
					local304.invoke(local287, Boolean.TRUE);
					@Pc(330) Vector local330 = (Vector) local287.get((Static80.aClass9 == null ? (Static80.aClass9 = a("client")) : Static80.aClass9).getClassLoader());
					for (@Pc(332) int local332 = 0; local330.size() > local332; local332++) {
						try {
							@Pc(337) Object local337 = local330.elementAt(local332);
							@Pc(344) Field local344 = local337.getClass().getDeclaredField("name");
							local304.invoke(local344, Boolean.TRUE);
							try {
								@Pc(359) String local359 = (String) local344.get(local337);
								if (local359 != null && local359.indexOf("sw3d.dll") != -1) {
									@Pc(378) Field local378 = local337.getClass().getDeclaredField("handle");
									local304.invoke(local378, Boolean.TRUE);
									local5 = local5 + "|16)" + Long.toHexString(local378.getLong(local337));
									local304.invoke(local378, Boolean.FALSE);
								}
							} catch (@Pc(416) Throwable local416) {
							}
							local304.invoke(local344, Boolean.FALSE);
						} catch (@Pc(428) Throwable local428) {
						}
					}
				}
			} catch (@Pc(436) Throwable local436) {
			}
			local5 = local5 + "]";
		} catch (@Pc(447) Throwable local447) {
		}
		return local5;
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(II)V")
	private void method1365(@OriginalArg(0) int arg0) {
		Static345.anInt5865 = 0;
		Static685.aClass24_3.anInt348 = arg0;
		Static685.aClass24_3.anInt347++;
		Static98.aClass230_2 = null;
		Static65.aClass20_2 = null;
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(I)V")
	@Override
	protected void method1349() {
		if (Static181.aClass14_Sub26_9.aClass43_Sub1_1.method801() != 2) {
			this.method1361();
			return;
		}
		try {
			this.method1361();
		} catch (@Pc(27) ThreadDeath local27) {
			throw local27;
		} catch (@Pc(30) Throwable local30) {
			Static629.method8829(local30.getMessage() + " (Recovered) " + this.method1350(), local30);
			Static162.aBoolean173 = true;
			Static459.method8986(false, 0);
		}
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V")
	@Override
	protected void method1353() {
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Z)V")
	@Override
	protected void method1348() {
		if (Static181.aClass14_Sub26_9.aClass43_Sub1_1.method801() != 2) {
			this.method1362();
			return;
		}
		try {
			this.method1362();
		} catch (@Pc(21) ThreadDeath local21) {
			throw local21;
		} catch (@Pc(24) Throwable local24) {
			Static629.method8829(local24.getMessage() + " (Recovered) " + this.method1350(), local24);
			Static162.aBoolean173 = true;
			Static459.method8986(false, 0);
		}
	}

	@OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
	@Override
	public void init() {
		if (!this.method1345()) {
			return;
		}
		Static537.aClass357_3 = new Class357();
		Static537.aClass357_3.anInt9936 = Integer.parseInt(this.getParameter("worldid"));
		Static575.aClass357_5 = new Class357();
		Static575.aClass357_5.anInt9936 = Integer.parseInt(this.getParameter("lobbyid"));
		Static575.aClass357_5.aString110 = this.getParameter("lobbyaddress");
		Static548.aClass59_10 = Static289.method4812(Integer.parseInt(this.getParameter("modewhere")));
		if (Static543.aClass59_9 == Static548.aClass59_10) {
			Static548.aClass59_10 = Static530.aClass59_8;
		} else if (!Static228.method3846(Static548.aClass59_10) && Static548.aClass59_10 != Static115.aClass59_4) {
			Static548.aClass59_10 = Static115.aClass59_4;
		}
		Static108.aClass229_1 = Static447.method6639(Integer.parseInt(this.getParameter("modewhat")));
		if (Static312.aClass229_4 != Static108.aClass229_1 && Static449.aClass229_6 != Static108.aClass229_1 && Static108.aClass229_1 != Static660.aClass229_5) {
			Static108.aClass229_1 = Static660.aClass229_5;
		}
		try {
			Static26.anInt352 = Integer.parseInt(this.getParameter("lang"));
		} catch (@Pc(110) Exception local110) {
			Static26.anInt352 = 0;
		}
		@Pc(118) String local118 = this.getParameter("objecttag");
		if (local118 != null && local118.equals("1")) {
			Static482.aBoolean588 = true;
		} else {
			Static482.aBoolean588 = false;
		}
		@Pc(142) String local142 = this.getParameter("js");
		if (local142 != null && local142.equals("1")) {
			Static571.aBoolean654 = true;
		} else {
			Static571.aBoolean654 = false;
		}
		@Pc(166) String local166 = this.getParameter("advert");
		if (local166 != null && local166.equals("1")) {
			Static535.aBoolean633 = true;
		} else {
			Static535.aBoolean633 = false;
		}
		@Pc(190) String local190 = this.getParameter("game");
		if (local190 != null) {
			if (local190.equals("0")) {
				Static161.aClass80_6 = Static344.aClass80_7;
			} else if (local190.equals("1")) {
				Static161.aClass80_6 = Static480.aClass80_10;
			} else if (local190.equals("2")) {
				Static161.aClass80_6 = Static433.aClass80_9;
			} else if (local190.equals("3")) {
				Static161.aClass80_6 = Static20.aClass80_1;
			}
		}
		try {
			Static449.anInt7513 = Integer.parseInt(this.getParameter("affid"));
		} catch (@Pc(247) Exception local247) {
			Static449.anInt7513 = 0;
		}
		Static315.aString73 = this.getParameter("quiturl");
		Static130.aString30 = this.getParameter("settings");
		if (Static130.aString30 == null) {
			Static130.aString30 = "";
		}
		Static32.aBoolean770 = "1".equals(this.getParameter("under"));
		@Pc(281) String local281 = this.getParameter("country");
		if (local281 != null) {
			try {
				Static538.anInt9200 = Integer.parseInt(local281);
			} catch (@Pc(288) Exception local288) {
				Static538.anInt9200 = 0;
			}
		}
		Static510.anInt8857 = Integer.parseInt(this.getParameter("colourid"));
		if (Static510.anInt8857 < 0 || Static537.aColorArray1.length <= Static510.anInt8857) {
			Static510.anInt8857 = 0;
		}
		if (Integer.parseInt(this.getParameter("sitesettings_member")) == 1) {
			Static6.aBoolean10 = true;
			Static459.aBoolean734 = true;
		}
		@Pc(335) String local335 = this.getParameter("frombilling");
		if (local335 != null && local335.equals("true")) {
			Static125.aBoolean141 = true;
		}
		@Pc(355) String local355 = this.getParameter("sskey");
		if (local355 != null) {
			Static624.aByteArray106 = Static380.method5852(Static196.method2945(local355));
			if (Static624.aByteArray106.length < 16) {
				Static624.aByteArray106 = null;
			}
		}
		@Pc(381) String local381 = this.getParameter("force64mb");
		if (local381 != null && local381.equals("true")) {
			Static105.aBoolean665 = true;
		}
		@Pc(401) String local401 = this.getParameter("worldflags");
		if (local401 != null) {
			try {
				Static528.anInt9083 = Integer.parseInt(local401);
			} catch (@Pc(408) Exception local408) {
			}
		}
		@Pc(415) String local415 = this.getParameter("userFlow");
		if (local415 != null) {
			try {
				Static653.aLong311 = Long.parseLong(local415);
			} catch (@Pc(423) NumberFormatException local423) {
			}
		}
		Static573.aString106 = this.getParameter("additionalInfo");
		if (Static573.aString106 != null && Static573.aString106.length() > 50) {
			Static573.aString106 = null;
		}
		Static105.aClient4 = this;
		if (Static161.aClass80_6 == Static344.aClass80_7) {
			Static380.anInt6697 = 503;
			Static380.anInt6690 = 765;
		} else if (Static161.aClass80_6 == Static480.aClass80_10) {
			Static380.anInt6690 = 640;
			Static380.anInt6697 = 480;
		}
		this.method1340(Static161.aClass80_6.aString28, Static380.anInt6690, Static108.aClass229_1.method5511() + 32, Static380.anInt6697);
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(I)V")
	@Override
	protected void method1351() {
		if (Static610.aBoolean693) {
			Static32.method9346();
		}
		Static320.method5048();
		if (Static103.aClass144_3 != null) {
			Static103.aClass144_3.method6932();
		}
		if (Static12.aFrame1 != null) {
			Static452.method6682(Static12.aFrame1, Static344.aClass173_5);
			Static12.aFrame1 = null;
		}
		Static277.aClass347_2.method8306();
		Static277.aClass347_1.method8306();
		Static360.method5462();
		Static685.aClass24_3.method366();
		Static466.aClass364_2.method8653();
		if (Static193.aClass101_5 != null) {
			Static193.aClass101_5.method2157();
			Static193.aClass101_5 = null;
		}
		try {
			Static230.aClass243_2.method5978();
			for (@Pc(73) int local73 = 0; local73 < 37; local73++) {
				Static349.aClass243Array1[local73].method5978();
			}
			Static24.aClass243_1.method5978();
			Static413.aClass243_3.method5978();
			Static690.method9514();
		} catch (@Pc(102) Exception local102) {
		}
	}
}
