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
				Static546.method7470("Argument count");
			}
			Static641.aClass258_7 = new Class258();
			Static641.aClass258_7.anInt6748 = Integer.parseInt(arg0[0]);
			Static291.aClass258_4 = new Class258();
			Static291.aClass258_4.anInt6748 = Integer.parseInt(arg0[1]);
			Static130.aClass258_2 = new Class258();
			Static130.aClass258_2.anInt6748 = Integer.parseInt(arg0[2]);
			Static670.aClass242_7 = Static478.aClass242_9;
			if (arg0[3].equals("live")) {
				Static249.aClass240_3 = Static515.aClass240_4;
			} else if (arg0[3].equals("rc")) {
				Static249.aClass240_3 = Static43.aClass240_2;
			} else if (arg0[3].equals("wip")) {
				Static249.aClass240_3 = Static8.aClass240_1;
			} else {
				Static546.method7470("modewhat");
			}
			Static375.anInt7800 = Static32.method4590(arg0[4]);
			if (Static375.anInt7800 == -1) {
				if (arg0[4].equals("english")) {
					Static375.anInt7800 = 0;
				} else if (arg0[4].equals("german")) {
					Static375.anInt7800 = 1;
				} else {
					Static546.method7470("language");
				}
			}
			Static460.aBoolean507 = false;
			Static525.aBoolean554 = false;
			if (arg0[5].equals("game0")) {
				Static536.aClass290_6 = Static82.aClass290_1;
			} else if (arg0[5].equals("game1")) {
				Static536.aClass290_6 = Static532.aClass290_5;
			} else if (arg0[5].equals("game2")) {
				Static536.aClass290_6 = Static488.aClass290_4;
			} else if (arg0[5].equals("game3")) {
				Static536.aClass290_6 = Static313.aClass290_3;
			} else {
				Static546.method7470("game");
			}
			Static342.anInt5705 = 0;
			Static72.anInt1198 = 0;
			Static83.aString12 = null;
			Static653.anInt10666 = 0;
			Static306.aBoolean340 = true;
			Static82.aBoolean119 = true;
			Static681.anInt10911 = Static536.aClass290_6.anInt7535;
			Static61.aBoolean83 = false;
			Static565.aString101 = "";
			Static588.aBoolean668 = false;
			Static218.aLong113 = 0L;
			Static417.aByteArray79 = null;
			@Pc(248) client local248 = new client();
			Static189.aClient1 = local248;
			local248.method1206(Static249.aClass240_3.method5515() + 32, Static536.aClass290_6.aString91);
			Static207.aFrame2.setLocation(40, 40);
		} catch (@Pc(271) Exception local271) {
			Static522.method7115(local271, (String) null);
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(B)V")
	@Override
	protected void method1196() {
		if (Static577.aClass5_Sub19_25.aClass17_Sub24_2.method8102() != 2) {
			this.method1218();
			return;
		}
		try {
			this.method1218();
		} catch (@Pc(23) ThreadDeath local23) {
			throw local23;
		} catch (@Pc(26) Throwable local26) {
			Static522.method7115(local26, local26.getMessage() + " (Recovered) " + this.method1191());
			Static331.aBoolean371 = true;
			Static462.method6506(false, 0);
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Z)V")
	private void method1213() {
		if (Static202.anInt10049 < Static93.aClass241_1.anInt6269) {
			Static68.aClass258_6.method5843();
			Static411.anInt6963 = (Static93.aClass241_1.anInt6269 - 1) * 250;
			if (Static411.anInt6963 > 3000) {
				Static411.anInt6963 = 3000;
			}
			if (Static93.aClass241_1.anInt6269 >= 2 && Static93.aClass241_1.anInt6268 == 6) {
				this.method1192("js5connect_outofdate");
				Static652.anInt10664 = 16;
				return;
			}
			if (Static93.aClass241_1.anInt6269 >= 4 && Static93.aClass241_1.anInt6268 == -1) {
				this.method1192("js5crc");
				Static652.anInt10664 = 16;
				return;
			}
			if (Static93.aClass241_1.anInt6269 >= 4 && Static660.method9070(Static652.anInt10664)) {
				if (Static93.aClass241_1.anInt6268 == 7 || Static93.aClass241_1.anInt6268 == 9) {
					this.method1192("js5connect_full");
				} else if (Static93.aClass241_1.anInt6268 <= 0) {
					this.method1192("js5io");
				} else if (Static294.aString58 == null) {
					this.method1192("js5connect");
				} else {
					this.method1192("js5proxy_" + Static294.aString58.trim());
				}
				Static652.anInt10664 = 16;
				return;
			}
		}
		Static202.anInt10049 = Static93.aClass241_1.anInt6269;
		if (Static411.anInt6963 > 0) {
			Static411.anInt6963--;
			return;
		}
		try {
			if (Static332.anInt5596 == 0) {
				Static639.aClass361_7 = Static68.aClass258_6.method5846(Static681.aClass349_6);
				Static332.anInt5596++;
			}
			if (Static332.anInt5596 == 1) {
				if (Static639.aClass361_7.anInt9720 == 2) {
					if (Static639.aClass361_7.anObject20 != null) {
						Static294.aString58 = (String) Static639.aClass361_7.anObject20;
					}
					this.method1226(1000);
					return;
				}
				if (Static639.aClass361_7.anInt9720 == 1) {
					Static332.anInt5596++;
				}
			}
			if (Static332.anInt5596 == 2) {
				Static312.aClass136_1 = new Class136((Socket) Static639.aClass361_7.anObject20, Static681.aClass349_6, 25000);
				@Pc(241) Class5_Sub36 local241 = new Class5_Sub36(5);
				local241.method7324(Static115.aClass157_2.anInt3847);
				local241.method7287(656);
				Static312.aClass136_1.method3206(local241.aByteArray89, 5);
				Static332.anInt5596++;
				Static579.aLong268 = Static480.method6763();
			}
			if (Static332.anInt5596 == 3) {
				if (Static660.method9070(Static652.anInt10664) || Static312.aClass136_1.method3205() > 0) {
					@Pc(303) int local303 = Static312.aClass136_1.method3212();
					if (local303 != 0) {
						this.method1226(local303);
						return;
					}
					Static332.anInt5596++;
				} else if (Static480.method6763() - Static579.aLong268 > 30000L) {
					this.method1226(1001);
					return;
				}
			}
			if (Static332.anInt5596 == 4) {
				@Pc(356) boolean local356 = Static660.method9070(Static652.anInt10664) || Static186.method3179(Static652.anInt10664) || Static285.method4551(false, Static652.anInt10664);
				@Pc(359) Class331[] local359 = Static547.method7481();
				@Pc(367) Class5_Sub36 local367 = new Class5_Sub36(local359.length * 4);
				Static312.aClass136_1.method3211(local367.aByteArray89.length, local367.aByteArray89, 0);
				for (@Pc(378) int local378 = 0; local378 < local359.length; local378++) {
					local359[local378].method7476(local367.method7268());
				}
				Static93.aClass241_1.method5530(!local356, Static312.aClass136_1);
				Static639.aClass361_7 = null;
				Static312.aClass136_1 = null;
				Static332.anInt5596 = 0;
			}
		} catch (@Pc(417) IOException local417) {
			this.method1226(1002);
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(B)V")
	@Override
	protected void method1201() {
		if (Static195.aBoolean256) {
			Static66.method1106();
		}
		Static221.method3526();
		if (Static273.aClass100_6 != null) {
			Static273.aClass100_6.method8666();
		}
		if (Static95.aFrame1 != null) {
			Static35.method561(Static95.aFrame1, Static681.aClass349_6);
			Static95.aFrame1 = null;
		}
		Static4.aClass389_17.method9073();
		Static4.aClass389_16.method9073();
		Static169.method3034();
		Static93.aClass241_1.method5538();
		Static194.aClass301_9.method6827();
		if (Static184.aClass273_1 != null) {
			Static184.aClass273_1.method6217();
			Static184.aClass273_1 = null;
		}
		try {
			Static546.aClass62_7.method1156();
			for (@Pc(66) int local66 = 0; local66 < 37; local66++) {
				Static222.aClass62Array1[local66].method1156();
			}
			Static228.aClass62_3.method1156();
			Static683.aClass62_8.method1156();
			Static498.method6948();
		} catch (@Pc(93) Exception local93) {
		}
	}

	@OriginalMember(owner = "client!client", name = "j", descriptor = "(B)V")
	private void method1216() {
		@Pc(15) boolean local15 = Static93.aClass241_1.method5534();
		if (!local15) {
			this.method1213();
		}
	}

	@OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
	@Override
	public void init() {
		if (!this.method1207()) {
			return;
		}
		Static641.aClass258_7 = new Class258();
		Static641.aClass258_7.anInt6748 = Integer.parseInt(this.getParameter("worldid"));
		Static291.aClass258_4 = new Class258();
		Static291.aClass258_4.anInt6748 = Integer.parseInt(this.getParameter("lobbyid"));
		Static291.aClass258_4.aString78 = this.getParameter("lobbyaddress");
		Static130.aClass258_2 = new Class258();
		Static130.aClass258_2.anInt6748 = Integer.parseInt(this.getParameter("demoid"));
		Static130.aClass258_2.aString78 = this.getParameter("demoaddress");
		Static670.aClass242_7 = Static466.method6569(Integer.parseInt(this.getParameter("modewhere")));
		if (Static670.aClass242_7 == Static478.aClass242_9) {
			Static670.aClass242_7 = Static581.aClass242_10;
		} else if (!Static428.method6190(Static670.aClass242_7) && Static387.aClass242_8 != Static670.aClass242_7) {
			Static670.aClass242_7 = Static387.aClass242_8;
		}
		Static249.aClass240_3 = Static335.method7706(Integer.parseInt(this.getParameter("modewhat")));
		if (Static8.aClass240_1 != Static249.aClass240_3 && Static249.aClass240_3 != Static43.aClass240_2 && Static249.aClass240_3 != Static515.aClass240_4) {
			Static249.aClass240_3 = Static515.aClass240_4;
		}
		try {
			Static375.anInt7800 = Integer.parseInt(this.getParameter("lang"));
		} catch (@Pc(129) Exception local129) {
			Static375.anInt7800 = 0;
		}
		@Pc(137) String local137 = this.getParameter("objecttag");
		if (local137 != null && local137.equals("1")) {
			Static525.aBoolean554 = true;
		} else {
			Static525.aBoolean554 = false;
		}
		@Pc(161) String local161 = this.getParameter("js");
		if (local161 != null && local161.equals("1")) {
			Static460.aBoolean507 = true;
		} else {
			Static460.aBoolean507 = false;
		}
		@Pc(185) String local185 = this.getParameter("advert");
		if (local185 != null && local185.equals("1")) {
			Static160.aBoolean588 = true;
		} else {
			Static160.aBoolean588 = false;
		}
		@Pc(209) String local209 = this.getParameter("game");
		if (local209 != null) {
			if (local209.equals("0")) {
				Static536.aClass290_6 = Static82.aClass290_1;
			} else if (local209.equals("1")) {
				Static536.aClass290_6 = Static532.aClass290_5;
			} else if (local209.equals("2")) {
				Static536.aClass290_6 = Static488.aClass290_4;
			} else if (local209.equals("3")) {
				Static536.aClass290_6 = Static313.aClass290_3;
			}
		}
		try {
			Static653.anInt10666 = Integer.parseInt(this.getParameter("affid"));
		} catch (@Pc(266) Exception local266) {
			Static653.anInt10666 = 0;
		}
		Static665.aString55 = this.getParameter("quiturl");
		Static565.aString101 = this.getParameter("settings");
		if (Static565.aString101 == null) {
			Static565.aString101 = "";
		}
		Static525.aBoolean555 = "1".equals(this.getParameter("under"));
		@Pc(300) String local300 = this.getParameter("country");
		if (local300 != null) {
			try {
				Static72.anInt1198 = Integer.parseInt(local300);
			} catch (@Pc(307) Exception local307) {
				Static72.anInt1198 = 0;
			}
		}
		Static681.anInt10911 = Integer.parseInt(this.getParameter("colourid"));
		if (Static681.anInt10911 < 0 || Static681.anInt10911 >= Static78.aColorArray4.length) {
			Static681.anInt10911 = 0;
		}
		if (Integer.parseInt(this.getParameter("sitesettings_member")) == 1) {
			Static306.aBoolean340 = true;
			Static82.aBoolean119 = true;
		}
		@Pc(356) String local356 = this.getParameter("frombilling");
		if (local356 != null && local356.equals("true")) {
			Static588.aBoolean668 = true;
		}
		@Pc(376) String local376 = this.getParameter("sskey");
		if (local376 != null) {
			Static417.aByteArray79 = Static496.method6932(Static546.method7471(local376));
			if (Static417.aByteArray79.length < 16) {
				Static417.aByteArray79 = null;
			}
		}
		@Pc(402) String local402 = this.getParameter("force64mb");
		if (local402 != null && local402.equals("true")) {
			Static61.aBoolean83 = true;
		}
		@Pc(422) String local422 = this.getParameter("worldflags");
		if (local422 != null) {
			try {
				Static342.anInt5705 = Integer.parseInt(local422);
			} catch (@Pc(429) Exception local429) {
			}
		}
		@Pc(436) String local436 = this.getParameter("userFlow");
		if (local436 != null) {
			try {
				Static218.aLong113 = Long.parseLong(local436);
			} catch (@Pc(444) NumberFormatException local444) {
			}
		}
		Static83.aString12 = this.getParameter("additionalInfo");
		if (Static83.aString12 != null && Static83.aString12.length() > 50) {
			Static83.aString12 = null;
		}
		if (Static82.aClass290_1 == Static536.aClass290_6) {
			Static401.anInt6745 = 503;
			Static592.anInt9548 = 765;
		} else if (Static532.aClass290_5 == Static536.aClass290_6) {
			Static401.anInt6745 = 480;
			Static592.anInt9548 = 640;
		}
		Static189.aClient1 = this;
		this.method1199(Static536.aClass290_6.aString91, Static249.aClass240_3.method5515() + 32, Static401.anInt6745, Static592.anInt9548);
	}

	@OriginalMember(owner = "client!client", name = "m", descriptor = "(I)V")
	private void method1217() {
		@Pc(44) int local44;
		if (Static652.anInt10664 == 7 && !Static546.method7472() || Static652.anInt10664 == 9 && Static438.anInt7237 == 42) {
			if (Static413.anInt6991 > 1) {
				Static413.anInt6991--;
				Static476.anInt7745 = Static55.anInt959;
			}
			if (!Static490.aBoolean536) {
				Static395.method5813();
			}
			for (local44 = 0; local44 < 100 && Static77.method1286(Static4.aClass389_16); local44++) {
			}
		}
		Static675.anInt10854++;
		Static472.method6676((Class238) null, -1, -1);
		Static391.method5779(-1, (Class238) null, -1);
		Static188.method9008();
		Static55.anInt959++;
		for (local44 = 0; local44 < Static259.anInt4657; local44++) {
			@Pc(105) Class4_Sub1_Sub1_Sub2_Sub2 local105 = Static591.aClass5_Sub9Array1[local44].aClass4_Sub1_Sub1_Sub2_Sub2_1;
			if (local105 != null) {
				@Pc(111) byte local111 = local105.aClass105_1.aByte28;
				if ((local111 & 0x1) != 0) {
					@Pc(119) int local119 = local105.method5932();
					@Pc(147) int local147;
					if ((local111 & 0x2) != 0 && local105.anInt6895 == 0 && Math.random() * 1000.0D < 10.0D) {
						local147 = (int) Math.round(Math.random() * 10.0D - 5.0D);
						@Pc(155) int local155 = (int) Math.round(Math.random() * 10.0D - 5.0D);
						if (local147 != 0 || local155 != 0) {
							@Pc(175) int local175 = local105.anIntArray405[0] + local147;
							@Pc(182) int local182 = local155 + local105.anIntArray404[0];
							if (local175 < 0) {
								local175 = 0;
							} else if (Static271.anInt4910 - local119 - 1 < local175) {
								local175 = Static271.anInt4910 - local119 - 1;
							}
							if (local182 < 0) {
								local182 = 0;
							} else if (Static613.anInt9909 - local119 - 1 < local182) {
								local182 = Static613.anInt9909 - local119 - 1;
							}
							@Pc(259) int local259 = Static637.method6718(0, 0, Static53.anIntArray63, -1, local119, true, local182, Static553.aClass169Array1[local105.aByte139], local105.anIntArray405[0], Static489.anIntArray460, local105.anIntArray404[0], 43, local119, local175, local119);
							if (local259 > 0) {
								if (local259 > 9) {
									local259 = 9;
								}
								for (@Pc(275) int local275 = 0; local275 < local259; local275++) {
									local105.anIntArray405[local275] = Static53.anIntArray63[local259 - local275 - 1];
									local105.anIntArray404[local275] = Static489.anIntArray460[local259 - local275 - 1];
									local105.aByteArray76[local275] = 1;
								}
								local105.anInt6895 = local259;
							}
						}
					}
					Static30.method505(true, local105);
					local147 = Static398.method5825(local105);
					Static56.method976(local105);
					Static19.method289(Static479.anInt7782, local147, local105, Static268.anInt4796);
					Static536.method7362(Static479.anInt7782, local105);
					Static191.method8804(local105);
				}
			}
		}
		if ((!Static546.method7472() || Static652.anInt10664 == 9 && Static438.anInt7237 == 42) && Static78.anInt1382 == 0) {
			if (Static426.anInt7111 == 2) {
				Static476.method6741();
			} else {
				Static153.method2791();
			}
			if (Static141.anInt2764 >> 9 < 14 || Static141.anInt2764 >> 9 >= Static271.anInt4910 - 14 || Static282.anInt5025 >> 9 < 14 || Static282.anInt5025 >> 9 >= Static613.anInt9909 - 14) {
				Static496.method6933();
			}
		}
		while (true) {
			@Pc(429) Class5_Sub24 local429;
			@Pc(434) Class238 local434;
			@Pc(446) Class238 local446;
			do {
				local429 = (Class5_Sub24) Static669.aClass20_74.method369();
				if (local429 == null) {
					while (true) {
						do {
							local429 = (Class5_Sub24) Static350.aClass20_27.method369();
							if (local429 == null) {
								while (true) {
									do {
										local429 = (Class5_Sub24) Static196.aClass20_11.method369();
										if (local429 == null) {
											if (Static388.aClass238_11 != null) {
												Static598.method9151();
											}
											if (Static565.anInt8921 % 1500 == 0) {
												Static52.method933();
											}
											if (Static652.anInt10664 == 7 && !Static546.method7472() || Static652.anInt10664 == 9 && Static438.anInt7237 == 42) {
												Static423.method9003();
											}
											Static618.method8479();
											if (Static195.aBoolean256 && Static480.method6763() - 60000L > Static274.aLong141) {
												Static66.method1106();
											}
											for (@Pc(644) Class4_Sub4_Sub2 local644 = (Class4_Sub4_Sub2) Static601.aClass387_7.method9018(); local644 != null; local644 = (Class4_Sub4_Sub2) Static601.aClass387_7.method9016()) {
												if ((long) local644.anInt10036 < Static480.method6763() / 1000L - 5L) {
													if (local644.aShort118 > 0) {
														Static464.method6554("", "", 5, "", local644.aString115 + Static184.aClass131_20.method3168(Static375.anInt7800), 0);
													}
													if (local644.aShort118 == 0) {
														Static464.method6554("", "", 5, "", local644.aString115 + Static184.aClass131_21.method3168(Static375.anInt7800), 0);
													}
													local644.method8570();
												}
											}
											if (Static652.anInt10664 == 7 && !Static546.method7472() || Static652.anInt10664 == 9 && Static438.anInt7237 == 42) {
												if (Static652.anInt10664 != 9 && Static4.aClass389_16.aClass50_2 == null) {
													Static452.method6395(false);
													return;
												}
												if (Static4.aClass389_16 != null) {
													Static4.aClass389_16.anInt10760++;
													if (Static4.aClass389_16.anInt10760 > 50) {
														@Pc(794) Class5_Sub41 local794 = Static647.method8905(Static510.aClass381_211, Static4.aClass389_16.aClass393_2);
														Static4.aClass389_16.method9079(local794);
													}
													try {
														Static4.aClass389_16.method9078(91);
														return;
													} catch (@Pc(803) IOException local803) {
														if (Static652.anInt10664 != 9) {
															Static452.method6395(false);
															return;
														}
														Static4.aClass389_16.method9073();
														return;
													}
												}
											}
											return;
										}
										local434 = local429.aClass238_6;
										if (local434.anInt5986 < 0) {
											break;
										}
										local446 = Static305.method4761(local434.anInt5963);
									} while (local446 == null || local446.aClass238Array1 == null || local446.aClass238Array1.length <= local434.anInt5986 || local434 != local446.aClass238Array1[local434.anInt5986]);
									Static247.method3957(local429);
								}
							}
							local434 = local429.aClass238_6;
							if (local434.anInt5986 < 0) {
								break;
							}
							local446 = Static305.method4761(local434.anInt5963);
						} while (local446 == null || local446.aClass238Array1 == null || local446.aClass238Array1.length <= local434.anInt5986 || local434 != local446.aClass238Array1[local434.anInt5986]);
						Static247.method3957(local429);
					}
				}
				local434 = local429.aClass238_6;
				if (local434.anInt5986 < 0) {
					break;
				}
				local446 = Static305.method4761(local434.anInt5963);
			} while (local446 == null || local446.aClass238Array1 == null || local434.anInt5986 >= local446.aClass238Array1.length || local446.aClass238Array1[local434.anInt5986] != local434);
			Static247.method3957(local429);
		}
	}

	@OriginalMember(owner = "client!client", name = "k", descriptor = "(I)V")
	private void method1218() {
		if (Static652.anInt10664 == 16) {
			return;
		}
		Static565.anInt8921++;
		if (Static565.anInt8921 % 1000 == 1) {
			@Pc(23) GregorianCalendar local23 = new GregorianCalendar();
			Static671.anInt10802 = local23.get(11) * 600 + local23.get(12) * 10 + local23.get(13) / 6;
			Static68.aRandom3.setSeed((long) Static671.anInt10802);
		}
		Static4.aClass389_17.method9074();
		Static4.aClass389_16.method9074();
		this.method1216();
		if (Static62.aClass318_1 != null) {
			Static62.aClass318_1.method7165();
		}
		Static34.method559((byte) -113);
		Static370.method5512((byte) 32);
		Static53.aClass297_1.method6735();
		Static300.aClass164_1.method5001();
		if (Static273.aClass100_6 != null) {
			Static273.aClass100_6.method8634((int) Static480.method6763());
		}
		Static324.method4954();
		Static479.anInt7781 = 0;
		Static322.anInt5498 = 0;
		for (@Pc(97) Interface23 local97 = Static53.aClass297_1.method6733(); local97 != null; local97 = Static53.aClass297_1.method6733()) {
			@Pc(105) int local105 = local97.method4635();
			if (local105 == 2 || local105 == 3) {
				@Pc(145) char local145 = local97.method4634();
				if (Static369.method5506() && (local145 == '`' || local145 == '§' || local145 == '²')) {
					if (Static112.method1657()) {
						Static205.method3369();
					} else {
						Static438.method6291();
					}
				} else if (Static479.anInt7781 < 128) {
					Static154.anInterface23Array1[Static479.anInt7781] = local97;
					Static479.anInt7781++;
				}
			} else if (local105 == 0 && Static322.anInt5498 < 75) {
				Static370.anInterface23Array2[Static322.anInt5498] = local97;
				Static322.anInt5498++;
			}
		}
		Static381.anInt6412 = 0;
		for (@Pc(217) Class5_Sub10 local217 = Static300.aClass164_1.method5005(); local217 != null; local217 = Static300.aClass164_1.method5005()) {
			@Pc(225) int local225 = local217.method7046();
			if (local225 == -1) {
				Static322.aClass20_23.method370(local217);
			} else if (local225 == 6) {
				Static381.anInt6412 += local217.method7043();
			} else if (Static530.method7244(local225)) {
				Static433.aClass20_37.method370(local217);
				if (Static433.aClass20_37.method372() > 10) {
					Static433.aClass20_37.method369();
				}
			}
		}
		if (Static112.method1657()) {
			Static510.method7025();
		}
		if (Static660.method9070(Static652.anInt10664)) {
			Static40.method759();
			Static61.method1058();
		} else if (Static115.method1731(Static652.anInt10664, -115)) {
			Static642.method8872();
		}
		if (Static186.method3179(Static652.anInt10664) && !Static115.method1731(Static652.anInt10664, -99)) {
			this.method1217();
			Static222.method3529();
			Static439.method6328();
		} else if (Static285.method4551(false, Static652.anInt10664) && !Static115.method1731(Static652.anInt10664, -93)) {
			this.method1217();
			Static439.method6328();
		} else if (Static652.anInt10664 == 13) {
			Static439.method6328();
		} else if (Static372.method5547(Static652.anInt10664) && !Static115.method1731(Static652.anInt10664, 121)) {
			Static528.method7228();
		} else if (Static652.anInt10664 == 14 || Static652.anInt10664 == 15) {
			Static439.method6328();
			if (Static438.anInt7237 != -3 && Static438.anInt7237 != 2 && Static438.anInt7237 != 15) {
				if (Static652.anInt10664 == 15) {
					Static147.anInt2909 = Static280.anInt4976;
					Static332.anInt5594 = Static438.anInt7237;
					Static660.method9072(Static669.aClass258_8.aString78, Static669.aClass258_8.anInt6748);
					Static4.aClass389_17.aClass50_2 = null;
					Static411.method6060(14, -3);
				} else {
					Static452.method6395(false);
				}
			}
		}
		Static586.method8070(Static273.aClass100_6);
		Static433.aClass20_37.method369();
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(I)V")
	@Override
	public synchronized void method1205() {
		if (Static265.anApplet2 != null && Static357.aCanvas8 == null && !Static681.aClass349_6.aBoolean602) {
			try {
				@Pc(17) Class local17 = Static265.anApplet2.getClass();
				@Pc(23) Field local23 = local17.getDeclaredField("canvas");
				Static357.aCanvas8 = (Canvas) local23.get(Static265.anApplet2);
				local23.set(Static265.anApplet2, (Object) null);
				if (Static357.aCanvas8 != null) {
					return;
				}
			} catch (@Pc(37) Exception local37) {
			}
		}
		super.method1205();
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V")
	private void method1220() {
		if (Static652.anInt10664 == 16) {
			return;
		}
		@Pc(17) long local17 = Static246.method3951() / 1000000L - Static561.aLong258;
		Static561.aLong258 = Static246.method3951() / 1000000L;
		@Pc(25) boolean local25 = Static523.method7136();
		if (local25 && Static76.aBoolean115 && Static604.aClass45_2 != null) {
			Static604.aClass45_2.method7455();
		}
		if (Static484.method6823(Static652.anInt10664)) {
			if (Static683.aLong313 != 0L && Static480.method6763() > Static683.aLong313) {
				Static471.method6672(Static260.method4249(), Static288.anInt5095, Static630.anInt10248, false);
			} else if (!Static273.aClass100_6.method8622() && Static549.aBoolean574) {
				Static595.method8191();
			}
		}
		@Pc(111) int local111;
		@Pc(115) int local115;
		if (Static95.aFrame1 == null) {
			@Pc(95) Container local95;
			if (Static207.aFrame2 != null) {
				local95 = Static207.aFrame2;
			} else if (Static265.anApplet2 == null) {
				local95 = Static597.anApplet_Sub1_1;
			} else {
				local95 = Static265.anApplet2;
			}
			local111 = local95.getSize().width;
			local115 = local95.getSize().height;
			if (local95 == Static207.aFrame2) {
				@Pc(121) Insets local121 = Static207.aFrame2.getInsets();
				local111 -= local121.right + local121.left;
				local115 -= local121.bottom + local121.top;
			}
			if (Static166.anInt3250 != local111 || Static249.anInt4342 != local115 || Static27.aBoolean20) {
				if (Static273.aClass100_6 == null || Static273.aClass100_6.method8655()) {
					Static555.method7518();
				} else {
					Static249.anInt4342 = local115;
					Static166.anInt3250 = local111;
				}
				Static683.aLong313 = Static480.method6763() + 500L;
				Static27.aBoolean20 = false;
			}
		}
		if (Static95.aFrame1 != null && !Static645.aBoolean756 && Static484.method6823(Static652.anInt10664)) {
			Static471.method6672(Static577.aClass5_Sub19_25.aClass17_Sub6_1.method1610(), -1, -1, false);
		}
		@Pc(202) boolean local202 = false;
		if (Static538.aBoolean565) {
			local202 = true;
			Static538.aBoolean565 = false;
		}
		if (local202) {
			Static285.method4554();
		}
		if (Static273.aClass100_6 != null && Static273.aClass100_6.method8622() || Static260.method4249() != 1) {
			Static352.method5188(-90);
		}
		if (Static660.method9070(Static652.anInt10664)) {
			Static298.method4687(local202);
		} else if (Static87.method1377(Static652.anInt10664)) {
			Static300.method4693();
		} else if (Static446.method6376(Static652.anInt10664)) {
			Static300.method4693();
		} else if (Static115.method1731(Static652.anInt10664, 115)) {
			if (Static184.anInt3435 == 1) {
				if (Static574.anInt8997 > Static2.anInt6) {
					Static2.anInt6 = Static574.anInt8997;
				}
				local111 = (Static2.anInt6 - Static574.anInt8997) * 50 / Static2.anInt6;
				Static636.method8809(true, Static273.aClass100_6, Static85.aClass196_38, Static184.aClass131_13.method3168(Static375.anInt7800) + "<br>(" + local111 + "%)", Static414.aClass70_6);
			} else if (Static184.anInt3435 == 2) {
				if (Static82.anInt1434 < Static119.anInt1944) {
					Static82.anInt1434 = Static119.anInt1944;
				}
				local111 = (Static82.anInt1434 - Static119.anInt1944) * 50 / Static82.anInt1434 + 50;
				Static636.method8809(true, Static273.aClass100_6, Static85.aClass196_38, Static184.aClass131_13.method3168(Static375.anInt7800) + "<br>(" + local111 + "%)", Static414.aClass70_6);
			} else {
				Static636.method8809(true, Static273.aClass100_6, Static85.aClass196_38, Static184.aClass131_13.method3168(Static375.anInt7800), Static414.aClass70_6);
			}
		} else if (Static652.anInt10664 == 11) {
			Static457.method6440(local17);
		} else if (Static652.anInt10664 == 14) {
			Static636.method8809(false, Static273.aClass100_6, Static85.aClass196_38, Static184.aClass131_15.method3168(Static375.anInt7800) + "<br>" + Static184.aClass131_16.method3168(Static375.anInt7800), Static414.aClass70_6);
		} else if (Static652.anInt10664 == 15) {
			Static636.method8809(false, Static273.aClass100_6, Static85.aClass196_38, Static184.aClass131_32.method3168(Static375.anInt7800), Static414.aClass70_6);
		}
		if (Static151.anInt2970 == 3) {
			for (local111 = 0; local111 < Static171.anInt5360; local111++) {
				@Pc(482) Rectangle local482 = Class147.aRectangleArray1[local111];
				if (Static38.aBooleanArray1[local111]) {
					Static273.aClass100_6.method8620(local482.y, -65281, local482.width, local482.x, local482.height);
				} else if (Static528.aBooleanArray23[local111]) {
					Static273.aClass100_6.method8620(local482.y, -65536, local482.width, local482.x, local482.height);
				} else {
					Static273.aClass100_6.method8620(local482.y, -16711936, local482.width, local482.x, local482.height);
				}
			}
		}
		if (Static112.method1657()) {
			Static601.method8250(Static273.aClass100_6);
		}
		if (Static681.aClass349_6.aBoolean602 && Static484.method6823(Static652.anInt10664) && Static151.anInt2970 == 0 && Static260.method4249() == 1 && !local202) {
			local111 = 0;
			for (local115 = 0; local115 < Static171.anInt5360; local115++) {
				if (Static528.aBooleanArray23[local115]) {
					Static528.aBooleanArray23[local115] = false;
					Static584.aRectangleArray2[local111++] = Class147.aRectangleArray1[local115];
				}
			}
			try {
				if (Static377.aBoolean419) {
					Static432.method6220(local111, Static584.aRectangleArray2);
				} else {
					Static273.aClass100_6.method8589(local111, Static584.aRectangleArray2);
				}
			} catch (@Pc(691) Exception_Sub1 local691) {
			}
		} else if (!Static660.method9070(Static652.anInt10664)) {
			for (local111 = 0; local111 < Static171.anInt5360; local111++) {
				Static528.aBooleanArray23[local111] = false;
			}
			try {
				if (Static377.aBoolean419) {
					Static614.method8444();
				} else {
					Static273.aClass100_6.method8619();
				}
			} catch (@Pc(615) Exception_Sub1 local615) {
				Static522.method7115(local615, local615.getMessage() + " (Recovered) " + this.method1191());
				Static462.method6506(false, 0);
			}
		}
		Static27.method419();
		local111 = Static577.aClass5_Sub19_25.aClass17_Sub11_1.method4285();
		if (local111 == 0) {
			Static620.method7045(-4, 15L);
		} else if (local111 == 1) {
			Static620.method7045(-4, 10L);
		} else if (local111 == 2) {
			Static620.method7045(-4, 5L);
		} else if (local111 == 3) {
			Static620.method7045(-4, 2L);
		}
		if (Static443.aBoolean494) {
			Static461.method6502();
		}
		if (Static577.aClass5_Sub19_25.aClass17_Sub25_1.method8266() == 1 && Static652.anInt10664 == 3 && Static381.anInt6411 != -1) {
			Static577.aClass5_Sub19_25.method2550(Static577.aClass5_Sub19_25.aClass17_Sub25_1, 0);
			Static111.method1655();
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(I)Ljava/lang/String;")
	@Override
	public String method1191() {
		@Pc(7) String local7 = null;
		try {
			local7 = "[1)" + Static315.anInt5380 + "," + Static290.anInt5128 + "," + Static271.anInt4910 + "," + Static613.anInt9909 + "|";
			if (Static362.aClass4_Sub1_Sub1_Sub2_Sub1_4 != null) {
				local7 = local7 + "2)" + Static324.anInt5529 + "," + (Static362.aClass4_Sub1_Sub1_Sub2_Sub1_4.anIntArray405[0] + Static315.anInt5380) + "," + (Static362.aClass4_Sub1_Sub1_Sub2_Sub1_4.anIntArray404[0] + Static290.anInt5128) + "|";
			}
			local7 = local7 + "3)" + Static577.aClass5_Sub19_25.aClass17_Sub24_2.method8102() + "|4)" + Static577.aClass5_Sub19_25.aClass17_Sub29_2.method9175() + "|5)" + Static260.method4249() + "|6)" + Static85.anInt9921 + "," + Static256.anInt4629 + "|";
			local7 = local7 + "7)" + Static577.aClass5_Sub19_25.aClass17_Sub23_1.method7699() + "|";
			local7 = local7 + "8)" + Static577.aClass5_Sub19_25.aClass17_Sub3_1.method430() + "|";
			local7 = local7 + "9)" + Static577.aClass5_Sub19_25.aClass17_Sub10_1.method3380() + "|";
			local7 = local7 + "10)" + Static577.aClass5_Sub19_25.aClass17_Sub21_1.method6983() + "|";
			local7 = local7 + "11)" + Static577.aClass5_Sub19_25.aClass17_Sub17_1.method6214() + "|";
			local7 = local7 + "12)" + Static577.aClass5_Sub19_25.aClass17_Sub27_1.method9058() + "|";
			local7 = local7 + "13)" + Static21.anInt299 + "|";
			local7 = local7 + "14)" + Static652.anInt10664;
			if (Static506.aClass5_Sub32_2 != null) {
				local7 = local7 + "|15)" + Static506.aClass5_Sub32_2.anInt5619;
			}
			try {
				if (Static577.aClass5_Sub19_25.aClass17_Sub24_2.method8102() == 2) {
					@Pc(279) Class local279 = Class.forName("java.lang.ClassLoader");
					@Pc(285) Field local285 = local279.getDeclaredField("nativeLibraries");
					@Pc(290) Class local290 = Class.forName("java.lang.reflect.AccessibleObject");
					@Pc(302) Method local302 = local290.getDeclaredMethod("setAccessible", Boolean.TYPE);
					local302.invoke(local285, Boolean.TRUE);
					@Pc(328) Vector local328 = (Vector) local285.get((Static73.aClass8 == null ? (Static73.aClass8 = a("client")) : Static73.aClass8).getClassLoader());
					for (@Pc(330) int local330 = 0; local328.size() > local330; local330++) {
						try {
							@Pc(336) Object local336 = local328.elementAt(local330);
							@Pc(343) Field local343 = local336.getClass().getDeclaredField("name");
							local302.invoke(local343, Boolean.TRUE);
							try {
								@Pc(358) String local358 = (String) local343.get(local336);
								if (local358 != null && local358.indexOf("sw3d.dll") != -1) {
									@Pc(376) Field local376 = local336.getClass().getDeclaredField("handle");
									local302.invoke(local376, Boolean.TRUE);
									local7 = local7 + "|16)" + Long.toHexString(local376.getLong(local336));
									local302.invoke(local376, Boolean.FALSE);
								}
							} catch (@Pc(414) Throwable local414) {
							}
							local302.invoke(local343, Boolean.FALSE);
						} catch (@Pc(426) Throwable local426) {
						}
					}
				}
			} catch (@Pc(436) Throwable local436) {
			}
			local7 = local7 + "]";
		} catch (@Pc(447) Throwable local447) {
		}
		return local7;
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(I)V")
	@Override
	protected void method1204() {
		if (Static61.aBoolean83) {
			Static21.anInt299 = 64;
		}
		@Pc(18) Frame local18 = new Frame("Jagex");
		local18.pack();
		local18.dispose();
		Static555.method7518();
		Static194.aClass301_9 = new Class301(Static681.aClass349_6);
		Static93.aClass241_1 = new Class241();
		Static642.method8881(new int[] { 20, 260 }, new int[] { 1000, 100 });
		if (Static670.aClass242_7 != Static387.aClass242_8) {
			Static123.aByteArrayArray6 = new byte[50][];
		}
		Static577.aClass5_Sub19_25 = Static626.method8558();
		if (Static670.aClass242_7 == Static387.aClass242_8) {
			Static641.aClass258_7.aString78 = this.getCodeBase().getHost();
		} else if (Static428.method6190(Static670.aClass242_7)) {
			Static641.aClass258_7.aString78 = this.getCodeBase().getHost();
			Static641.aClass258_7.anInt6747 = Static641.aClass258_7.anInt6748 + 40000;
			Static291.aClass258_4.anInt6747 = Static291.aClass258_4.anInt6748 + 40000;
			Static641.aClass258_7.anInt6746 = Static641.aClass258_7.anInt6748 + 50000;
			Static130.aClass258_2.anInt6747 = Static130.aClass258_2.anInt6748 + 40000;
			Static291.aClass258_4.anInt6746 = Static291.aClass258_4.anInt6748 + 50000;
			Static130.aClass258_2.anInt6746 = Static130.aClass258_2.anInt6748 + 50000;
		} else if (Static478.aClass242_9 == Static670.aClass242_7) {
			Static641.aClass258_7.aString78 = "127.0.0.1";
			Static291.aClass258_4.aString78 = "127.0.0.1";
			Static130.aClass258_2.aString78 = "127.0.0.1";
			Static641.aClass258_7.anInt6747 = Static641.aClass258_7.anInt6748 + 40000;
			Static291.aClass258_4.anInt6747 = Static291.aClass258_4.anInt6748 + 40000;
			Static130.aClass258_2.anInt6747 = Static130.aClass258_2.anInt6748 + 40000;
			Static641.aClass258_7.anInt6746 = Static641.aClass258_7.anInt6748 + 50000;
			Static291.aClass258_4.anInt6746 = Static291.aClass258_4.anInt6748 + 50000;
			Static130.aClass258_2.anInt6746 = Static130.aClass258_2.anInt6748 + 50000;
		}
		Static68.aClass258_6 = Static641.aClass258_7;
		Static279.aShortArray62 = Static4.aShortArray135 = Static559.aShortArray134 = Static471.aShortArray115 = new short[256];
		if (Static536.aClass290_6 == Static82.aClass290_1) {
			Static587.aBoolean665 = false;
		}
		if (Static532.aClass290_5 == Static536.aClass290_6) {
			Static458.anInt7395 = 0;
			Static445.aShortArrayArray20 = Static191.aShortArrayArray26;
			Static468.aBoolean513 = true;
			Static467.aShortArrayArrayArray4 = Static283.aShortArrayArrayArray2;
			Static74.anInt1314 = 16777215;
		} else if (Static313.aClass290_3 == Static536.aClass290_6) {
			Static445.aShortArrayArray20 = Static116.aShortArrayArray25;
			Static467.aShortArrayArrayArray4 = Static442.aShortArrayArrayArray3;
		} else {
			Static467.aShortArrayArrayArray4 = Static98.aShortArrayArrayArray1;
			Static445.aShortArrayArray20 = Static367.aShortArrayArray19;
		}
		try {
			Static78.aClipboard1 = Static189.aClient1.getToolkit().getSystemClipboard();
		} catch (@Pc(253) Exception local253) {
		}
		Static53.aClass297_1 = Static128.method1919(Static357.aCanvas8);
		Static300.aClass164_1 = Static632.method8776(Static357.aCanvas8);
		try {
			if (Static681.aClass349_6.aClass223_2 != null) {
				Static546.aClass62_7 = new Class62(Static681.aClass349_6.aClass223_2, 5200, 0);
				for (@Pc(275) int local275 = 0; local275 < 37; local275++) {
					Static222.aClass62Array1[local275] = new Class62(Static681.aClass349_6.aClass223Array1[local275], 6000, 0);
				}
				Static228.aClass62_3 = new Class62(Static681.aClass349_6.aClass223_3, 6000, 0);
				Static45.aClass75_1 = new Class75(255, Static546.aClass62_7, Static228.aClass62_3, 500000);
				Static683.aClass62_8 = new Class62(Static681.aClass349_6.aClass223_4, 24, 0);
				Static681.aClass349_6.aClass223Array1 = null;
				Static681.aClass349_6.aClass223_2 = null;
				Static681.aClass349_6.aClass223_3 = null;
				Static681.aClass349_6.aClass223_4 = null;
			}
		} catch (@Pc(335) IOException local335) {
			Static228.aClass62_3 = null;
			Static683.aClass62_8 = null;
			Static546.aClass62_7 = null;
			Static45.aClass75_1 = null;
		}
		if (Static670.aClass242_7 != Static387.aClass242_8) {
			Static480.aBoolean521 = true;
		}
		Static160.aString100 = Static184.aClass131_13.method3168(Static375.anInt7800);
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(IZ)V")
	private void method1226(@OriginalArg(0) int arg0) {
		Static332.anInt5596 = 0;
		Static639.aClass361_7 = null;
		Static93.aClass241_1.anInt6268 = arg0;
		Static93.aClass241_1.anInt6269++;
		Static312.aClass136_1 = null;
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(B)V")
	@Override
	protected void method1194() {
		if (Static577.aClass5_Sub19_25.aClass17_Sub24_2.method8102() != 2) {
			this.method1220();
			return;
		}
		try {
			this.method1220();
		} catch (@Pc(24) ThreadDeath local24) {
			throw local24;
		} catch (@Pc(27) Throwable local27) {
			Static522.method7115(local27, local27.getMessage() + " (Recovered) " + this.method1191());
			Static331.aBoolean371 = true;
			Static462.method6506(false, 0);
		}
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(B)V")
	@Override
	protected void method1195() {
	}
}
