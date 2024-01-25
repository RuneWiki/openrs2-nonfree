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
				Static562.method7968("Argument count");
			}
			Static319.aClass157_4 = new Class157();
			Static319.aClass157_4.anInt4641 = Integer.parseInt(arg0[0]);
			Static627.aClass157_6 = new Class157();
			Static627.aClass157_6.anInt4641 = Integer.parseInt(arg0[1]);
			Static132.aClass157_3 = new Class157();
			Static132.aClass157_3.anInt4641 = Integer.parseInt(arg0[2]);
			Static38.aClass220_2 = Static242.aClass220_6;
			if (arg0[3].equals("live")) {
				Static373.aClass34_2 = Static237.aClass34_1;
			} else if (arg0[3].equals("rc")) {
				Static373.aClass34_2 = Static562.aClass34_4;
			} else if (arg0[3].equals("wip")) {
				Static373.aClass34_2 = Static536.aClass34_3;
			} else {
				Static562.method7968("modewhat");
			}
			Static455.anInt7738 = Static7.method112(arg0[4]);
			if (Static455.anInt7738 == -1) {
				if (arg0[4].equals("english")) {
					Static455.anInt7738 = 0;
				} else if (arg0[4].equals("german")) {
					Static455.anInt7738 = 1;
				} else {
					Static562.method7968("language");
				}
			}
			Static543.aBoolean676 = false;
			Static332.aBoolean460 = false;
			if (arg0[5].equals("game0")) {
				Static431.aClass133_11 = Static483.aClass133_14;
			} else if (arg0[5].equals("game1")) {
				Static431.aClass133_11 = Static300.aClass133_17;
			} else if (arg0[5].equals("game2")) {
				Static431.aClass133_11 = Static616.aClass133_18;
			} else if (arg0[5].equals("game3")) {
				Static431.aClass133_11 = Static180.aClass133_6;
			} else {
				Static562.method7968("game");
			}
			Static541.anInt9077 = 0;
			Static145.aLong103 = 0L;
			Static340.aBoolean463 = true;
			Static367.aBoolean486 = true;
			Static367.aBoolean487 = false;
			Static587.aString90 = "";
			Static111.aString13 = null;
			Static451.aString66 = null;
			Static192.anInt3598 = Static431.aClass133_11.anInt3574;
			Static280.aBoolean393 = false;
			Static128.anInt1666 = 0;
			Static237.anInt4731 = 0;
			@Pc(181) client local181 = new client();
			Static554.aClient1 = local181;
			local181.method1299(Static373.aClass34_2.method756() + 32, Static431.aClass133_11.aString24);
			Static190.aFrame1.setLocation(40, 40);
		} catch (@Pc(204) Exception local204) {
			Static296.method5075(local204, (String) null);
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(I)V")
	@Override
	protected void method1304() {
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(II)V")
	private void method1310(@OriginalArg(1) int arg0) {
		Static329.anInt6246 = 0;
		Static493.aClass299_1 = null;
		Static217.aClass174_5 = null;
		Static186.aClass323_1.anInt9133 = arg0;
		Static186.aClass323_1.anInt9132++;
	}

	@OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
	@Override
	public void init() {
		if (!this.method1292()) {
			return;
		}
		Static319.aClass157_4 = new Class157();
		Static319.aClass157_4.anInt4641 = Integer.parseInt(this.getParameter("worldid"));
		Static627.aClass157_6 = new Class157();
		Static627.aClass157_6.anInt4641 = Integer.parseInt(this.getParameter("lobbyid"));
		Static627.aClass157_6.aString34 = this.getParameter("lobbyaddress");
		Static132.aClass157_3 = new Class157();
		Static132.aClass157_3.anInt4641 = Integer.parseInt(this.getParameter("demoid"));
		Static132.aClass157_3.aString34 = this.getParameter("demoaddress");
		Static38.aClass220_2 = Static151.method2593(Integer.parseInt(this.getParameter("modewhere")));
		if (Static38.aClass220_2 == Static242.aClass220_6) {
			Static38.aClass220_2 = Static579.aClass220_13;
		} else if (!Static286.method4618(Static38.aClass220_2) && Static508.aClass220_11 != Static38.aClass220_2) {
			Static38.aClass220_2 = Static508.aClass220_11;
		}
		Static373.aClass34_2 = Static398.method6268(Integer.parseInt(this.getParameter("modewhat")));
		if (Static536.aClass34_3 != Static373.aClass34_2 && Static373.aClass34_2 != Static562.aClass34_4 && Static373.aClass34_2 != Static237.aClass34_1) {
			Static373.aClass34_2 = Static237.aClass34_1;
		}
		try {
			Static455.anInt7738 = Integer.parseInt(this.getParameter("lang"));
		} catch (@Pc(98) Exception local98) {
			Static455.anInt7738 = 0;
		}
		@Pc(104) String local104 = this.getParameter("objecttag");
		if (local104 != null && local104.equals("1")) {
			Static332.aBoolean460 = true;
		} else {
			Static332.aBoolean460 = false;
		}
		@Pc(120) String local120 = this.getParameter("js");
		if (local120 != null && local120.equals("1")) {
			Static543.aBoolean676 = true;
		} else {
			Static543.aBoolean676 = false;
		}
		@Pc(136) String local136 = this.getParameter("advert");
		if (local136 != null && local136.equals("1")) {
			Static98.aBoolean157 = true;
		} else {
			Static98.aBoolean157 = false;
		}
		@Pc(152) String local152 = this.getParameter("game");
		if (local152 != null) {
			if (local152.equals("0")) {
				Static431.aClass133_11 = Static483.aClass133_14;
			} else if (local152.equals("1")) {
				Static431.aClass133_11 = Static300.aClass133_17;
			} else if (local152.equals("2")) {
				Static431.aClass133_11 = Static616.aClass133_18;
			} else if (local152.equals("3")) {
				Static431.aClass133_11 = Static180.aClass133_6;
			}
		}
		try {
			Static541.anInt9077 = Integer.parseInt(this.getParameter("affid"));
		} catch (@Pc(191) Exception local191) {
			Static541.anInt9077 = 0;
		}
		Static380.aString49 = this.getParameter("quiturl");
		Static587.aString90 = this.getParameter("settings");
		if (Static587.aString90 == null) {
			Static587.aString90 = "";
		}
		Static502.aBoolean614 = "1".equals(this.getParameter("under"));
		@Pc(215) String local215 = this.getParameter("country");
		if (local215 != null) {
			try {
				Static128.anInt1666 = Integer.parseInt(local215);
			} catch (@Pc(222) Exception local222) {
				Static128.anInt1666 = 0;
			}
		}
		Static192.anInt3598 = Integer.parseInt(this.getParameter("colourid"));
		if (Static192.anInt3598 < 0 || Static192.anInt3598 >= Static521.aColorArray3.length) {
			Static192.anInt3598 = 0;
		}
		if (Integer.parseInt(this.getParameter("sitesettings_member")) == 1) {
			Static340.aBoolean463 = true;
			Static367.aBoolean486 = true;
		}
		@Pc(255) String local255 = this.getParameter("frombilling");
		if (local255 != null && local255.equals("true")) {
			Static280.aBoolean393 = true;
		}
		Static111.aString13 = this.getParameter("sskey");
		if (Static111.aString13 != null && Static111.aString13.length() < 2) {
			Static111.aString13 = null;
		}
		@Pc(281) String local281 = this.getParameter("force64mb");
		if (local281 != null && local281.equals("true")) {
			Static367.aBoolean487 = true;
		}
		@Pc(293) String local293 = this.getParameter("worldflags");
		if (local293 != null) {
			try {
				Static237.anInt4731 = Integer.parseInt(local293);
			} catch (@Pc(300) Exception local300) {
			}
		}
		@Pc(305) String local305 = this.getParameter("userFlow");
		if (local305 != null) {
			try {
				Static145.aLong103 = Long.parseLong(local305);
			} catch (@Pc(312) NumberFormatException local312) {
			}
		}
		Static451.aString66 = this.getParameter("additionalInfo");
		if (Static451.aString66 != null && Static451.aString66.length() > 50) {
			Static451.aString66 = null;
		}
		Static554.aClient1 = this;
		if (Static431.aClass133_11 == Static483.aClass133_14) {
			Static269.anInt5258 = 503;
			Static623.anInt9971 = 765;
		} else if (Static431.aClass133_11 == Static300.aClass133_17) {
			Static623.anInt9971 = 640;
			Static269.anInt5258 = 480;
		}
		this.method1307(Static623.anInt9971, Static373.aClass34_2.method756() + 32, Static269.anInt5258, Static431.aClass133_11.aString24);
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V")
	private void method1313() {
		@Pc(11) boolean local11 = Static186.aClass323_1.method7830();
		if (!local11) {
			this.method1316();
		}
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(B)V")
	private void method1314() {
		@Pc(27) int local27;
		if (Static82.anInt1653 == 7 && Static71.anInt1424 == 0) {
			if (Static269.anInt5252 > 1) {
				Static269.anInt5252--;
				Static500.anInt8429 = Static303.anInt8405;
			}
			if (!Static253.aBoolean362) {
				Static638.method8582();
			}
			for (local27 = 0; local27 < 100 && Static136.method2359(); local27++) {
			}
		}
		Static487.anInt8277++;
		Static286.method4620(-1, (Class344) null, -1);
		Static558.method7940((Class344) null, -1, -1);
		Static556.method7888();
		Static303.anInt8405++;
		for (local27 = 0; local27 < Static73.anInt1445; local27++) {
			@Pc(67) Class9_Sub2_Sub1_Sub2_Sub2 local67 = Static179.aClass3_Sub43Array1[local27].aClass9_Sub2_Sub1_Sub2_Sub2_2;
			if (local67 != null) {
				@Pc(73) byte local73 = local67.aClass309_1.aByte102;
				if ((local73 & 0x1) != 0) {
					@Pc(81) int local81 = local67.method8619();
					@Pc(108) int local108;
					if ((local73 & 0x2) != 0 && local67.anInt10236 == 0 && Math.random() * 1000.0D < 10.0D) {
						local108 = (int) Math.round(Math.random() * 10.0D - 5.0D);
						@Pc(116) int local116 = (int) Math.round(Math.random() * 10.0D - 5.0D);
						if (local108 != 0 || local116 != 0) {
							@Pc(130) int local130 = local108 + local67.anIntArray675[0];
							if (local130 < 0) {
								local130 = 0;
							} else if (Static399.anInt7121 - local81 - 1 < local130) {
								local130 = Static399.anInt7121 - local81 - 1;
							}
							@Pc(160) int local160 = local67.anIntArray676[0] + local116;
							if (local160 < 0) {
								local160 = 0;
							} else if (local160 > Static24.anInt345 - local81 - 1) {
								local160 = Static24.anInt345 - local81 - 1;
							}
							@Pc(211) int local211 = Static589.method8186(Static174.aClass237Array1[local67.aByte127], 0, local81, -1, Static347.anIntArray375, local160, local67.anIntArray675[0], local81, 0, local130, Static192.anIntArray211, local67.anIntArray676[0], true, local81);
							if (local211 > 0) {
								if (local211 > 9) {
									local211 = 9;
								}
								for (@Pc(220) int local220 = 0; local220 < local211; local220++) {
									local67.anIntArray675[local220] = Static192.anIntArray211[local211 - local220 - 1];
									local67.anIntArray676[local220] = Static347.anIntArray375[local211 - local220 - 1];
									local67.aByteArray107[local220] = 1;
								}
								local67.anInt10236 = local211;
							}
						}
					}
					Static54.method986(true, local67);
					local108 = Static41.method737(local67);
					Static493.method7219(local67);
					Static26.method367(local67, Static98.anInt2005, Static6.anInt81, local108);
					Static322.method5335(local67, Static6.anInt81);
					Static606.method8326(local67);
				}
			}
		}
		if (Static71.anInt1424 == 0 && Static187.anInt3550 == 0) {
			if (Static471.anInt8064 == 2) {
				Static550.method7855();
			} else {
				Static637.method8309();
			}
			if (Static419.anInt7345 >> 9 < 14 || Static399.anInt7121 - 14 <= Static419.anInt7345 >> 9 || Static522.anInt8849 >> 9 < 14 || Static24.anInt345 - 14 <= Static522.anInt8849 >> 9) {
				Static339.method916();
			}
		}
		while (true) {
			@Pc(350) Class3_Sub36 local350;
			@Pc(355) Class344 local355;
			@Pc(366) Class344 local366;
			do {
				local350 = (Class3_Sub36) Static140.aClass216_22.method5462();
				if (local350 == null) {
					while (true) {
						do {
							local350 = (Class3_Sub36) Static459.aClass216_56.method5462();
							if (local350 == null) {
								while (true) {
									do {
										local350 = (Class3_Sub36) Static361.aClass216_48.method5462();
										if (local350 == null) {
											if (Static429.aClass344_9 != null) {
												Static99.method7010();
											}
											if (Static304.anInt8391 % 1500 == 0) {
												Static292.method4814();
											}
											if (Static82.anInt1653 == 7 && Static71.anInt1424 == 0) {
												Static571.method8266();
											}
											Static306.method5151();
											if (Static644.aBoolean777 && Static648.aLong276 < Static191.method3071() - 60000L) {
												Static173.method2878();
											}
											for (@Pc(539) Class9_Sub3_Sub1 local539 = (Class9_Sub3_Sub1) Static132.aClass139_3.method3198(); local539 != null; local539 = (Class9_Sub3_Sub1) Static132.aClass139_3.method3205()) {
												if (Static191.method3071() / 1000L - 5L > (long) local539.anInt3132) {
													if (local539.aShort41 > 0) {
														Static329.method5394(local539.aString21 + Static369.aClass235_22.method5893(Static455.anInt7738), "", "", "", 5, 0);
													}
													if (local539.aShort41 == 0) {
														Static329.method5394(local539.aString21 + Static369.aClass235_23.method5893(Static455.anInt7738), "", "", "", 5, 0);
													}
													local539.method8593();
												}
											}
											if (Static82.anInt1653 == 7 && Static71.anInt1424 == 0) {
												if (Static547.aClass197_1 == null) {
													Static416.method6442(false);
													return;
												}
												Static189.anInt3567++;
												if (Static189.anInt3567 > 50) {
													@Pc(644) Class3_Sub27 local644 = Static59.method1040(Static325.aClass20_2, Static60.aClass314_48);
													Static148.method2572(local644);
												}
												try {
													Static263.method4385();
													return;
												} catch (@Pc(651) IOException local651) {
													Static416.method6442(false);
													return;
												}
											}
											return;
										}
										local355 = local350.aClass344_6;
										if (local355.anInt9586 < 0) {
											break;
										}
										local366 = Static324.method5363(local355.anInt9632);
									} while (local366 == null || local366.aClass344Array2 == null || local366.aClass344Array2.length <= local355.anInt9586 || local355 != local366.aClass344Array2[local355.anInt9586]);
									Static400.method6288(local350);
								}
							}
							local355 = local350.aClass344_6;
							if (local355.anInt9586 < 0) {
								break;
							}
							local366 = Static324.method5363(local355.anInt9632);
						} while (local366 == null || local366.aClass344Array2 == null || local355.anInt9586 >= local366.aClass344Array2.length || local355 != local366.aClass344Array2[local355.anInt9586]);
						Static400.method6288(local350);
					}
				}
				local355 = local350.aClass344_6;
				if (local355.anInt9586 < 0) {
					break;
				}
				local366 = Static324.method5363(local355.anInt9632);
			} while (local366 == null || local366.aClass344Array2 == null || local355.anInt9586 >= local366.aClass344Array2.length || local355 != local366.aClass344Array2[local355.anInt9586]);
			Static400.method6288(local350);
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(B)V")
	@Override
	protected void method1298() {
		if (Static32.aClass3_Sub41_3.aClass7_Sub9_2.method4181() != 2) {
			this.method1323();
			return;
		}
		try {
			this.method1323();
		} catch (@Pc(26) ThreadDeath local26) {
			throw local26;
		} catch (@Pc(29) Throwable local29) {
			Static296.method5075(local29, local29.getMessage() + " (Recovered) " + this.method1301());
			Static112.aBoolean167 = true;
			Static230.method3973(0, false);
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(Z)V")
	private void method1316() {
		if (Static580.anInt9474 < Static186.aClass323_1.anInt9132) {
			Static28.aClass157_1.method3977();
			Static489.anInt8329 = (Static186.aClass323_1.anInt9132 - 1) * 250;
			if (Static489.anInt8329 > 3000) {
				Static489.anInt8329 = 3000;
			}
			if (Static186.aClass323_1.anInt9132 >= 2 && Static186.aClass323_1.anInt9133 == 6) {
				this.method1308("js5connect_outofdate");
				Static82.anInt1653 = 14;
				return;
			}
			if (Static186.aClass323_1.anInt9132 >= 4 && Static186.aClass323_1.anInt9133 == -1) {
				this.method1308("js5crc");
				Static82.anInt1653 = 14;
				return;
			}
			if (Static186.aClass323_1.anInt9132 >= 4 && Static102.method1711(Static82.anInt1653)) {
				if (Static186.aClass323_1.anInt9133 == 7 || Static186.aClass323_1.anInt9133 == 9) {
					this.method1308("js5connect_full");
				} else if (Static186.aClass323_1.anInt9133 <= 0) {
					this.method1308("js5io");
				} else if (Static506.aString81 == null) {
					this.method1308("js5connect");
				} else {
					this.method1308("js5proxy_" + Static506.aString81.trim());
				}
				Static82.anInt1653 = 14;
				return;
			}
		}
		Static580.anInt9474 = Static186.aClass323_1.anInt9132;
		if (Static489.anInt8329 > 0) {
			Static489.anInt8329--;
			return;
		}
		try {
			if (Static329.anInt6246 == 0) {
				Static217.aClass174_5 = Static28.aClass157_1.method3979(Static48.aClass298_12);
				Static329.anInt6246++;
			}
			if (Static329.anInt6246 == 1) {
				if (Static217.aClass174_5.anInt5121 == 2) {
					if (Static217.aClass174_5.anObject12 != null) {
						Static506.aString81 = (String) Static217.aClass174_5.anObject12;
					}
					this.method1310(1000);
					return;
				}
				if (Static217.aClass174_5.anInt5121 == 1) {
					Static329.anInt6246++;
				}
			}
			if (Static329.anInt6246 == 2) {
				Static493.aClass299_1 = new Class299((Socket) Static217.aClass174_5.anObject12, Static48.aClass298_12, 25000);
				@Pc(186) Class3_Sub9 local186 = new Class3_Sub9(5);
				local186.method5572(Static284.aClass126_2.anInt3445);
				local186.method5601(641);
				Static493.aClass299_1.method7353(5, local186.aByteArray51);
				Static329.anInt6246++;
				Static24.aLong16 = Static191.method3071();
			}
			if (Static329.anInt6246 == 3) {
				if (Static102.method1711(Static82.anInt1653) || Static493.aClass299_1.method7354() > 0) {
					@Pc(226) int local226 = Static493.aClass299_1.method7358();
					if (local226 != 0) {
						this.method1310(local226);
						return;
					}
					Static329.anInt6246++;
				} else if (Static191.method3071() - Static24.aLong16 > 30000L) {
					this.method1310(1001);
					return;
				}
			}
			if (Static329.anInt6246 == 4) {
				@Pc(278) boolean local278 = Static102.method1711(Static82.anInt1653) || Static87.method1479(Static82.anInt1653) || Static311.method5226(Static82.anInt1653);
				@Pc(281) Class252[] local281 = Static408.method6347();
				@Pc(289) Class3_Sub9 local289 = new Class3_Sub9(local281.length * 4);
				Static493.aClass299_1.method7355(local289.aByteArray51, local289.aByteArray51.length, 0);
				for (@Pc(300) int local300 = 0; local300 < local281.length; local300++) {
					local281[local300].method6352(local289.method5585());
				}
				Static186.aClass323_1.method7826(Static493.aClass299_1, !local278);
				Static329.anInt6246 = 0;
				Static493.aClass299_1 = null;
				Static217.aClass174_5 = null;
			}
		} catch (@Pc(332) IOException local332) {
			this.method1310(1002);
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(B)V")
	@Override
	protected void method1302() {
		if (Static367.aBoolean487) {
			Static248.anInt4899 = 64;
		}
		@Pc(14) Frame local14 = new Frame("Jagex");
		local14.pack();
		local14.dispose();
		Static334.method5415();
		Static220.aClass286_1 = new Class286(Static48.aClass298_12);
		Static186.aClass323_1 = new Class323();
		Static154.method2735(new int[] { 20, 260 }, new int[] { 1000, 100 });
		if (Static38.aClass220_2 != Static508.aClass220_11) {
			Static603.aByteArrayArray27 = new byte[50][];
		}
		Static32.aClass3_Sub41_3 = Static485.method7135();
		if (Static38.aClass220_2 == Static508.aClass220_11) {
			Static319.aClass157_4.aString34 = this.getCodeBase().getHost();
		} else if (Static286.method4618(Static38.aClass220_2)) {
			Static319.aClass157_4.aString34 = this.getCodeBase().getHost();
			Static319.aClass157_4.anInt4643 = Static319.aClass157_4.anInt4641 + 40000;
			Static627.aClass157_6.anInt4643 = Static627.aClass157_6.anInt4641 + 40000;
			Static132.aClass157_3.anInt4643 = Static132.aClass157_3.anInt4641 + 40000;
			Static319.aClass157_4.anInt4640 = Static319.aClass157_4.anInt4641 + 50000;
			Static627.aClass157_6.anInt4640 = Static627.aClass157_6.anInt4641 + 50000;
			Static132.aClass157_3.anInt4640 = Static132.aClass157_3.anInt4641 + 50000;
		} else if (Static38.aClass220_2 == Static242.aClass220_6) {
			Static319.aClass157_4.aString34 = "127.0.0.1";
			Static627.aClass157_6.aString34 = "127.0.0.1";
			Static132.aClass157_3.aString34 = "127.0.0.1";
			Static319.aClass157_4.anInt4643 = Static319.aClass157_4.anInt4641 + 40000;
			Static627.aClass157_6.anInt4643 = Static627.aClass157_6.anInt4641 + 40000;
			Static319.aClass157_4.anInt4640 = Static319.aClass157_4.anInt4641 + 50000;
			Static132.aClass157_3.anInt4643 = Static132.aClass157_3.anInt4641 + 40000;
			Static627.aClass157_6.anInt4640 = Static627.aClass157_6.anInt4641 + 50000;
			Static132.aClass157_3.anInt4640 = Static132.aClass157_3.anInt4641 + 50000;
		}
		Static28.aClass157_1 = Static319.aClass157_4;
		if (Static431.aClass133_11 == Static483.aClass133_14) {
			Static226.aBoolean336 = false;
		}
		Static331.aShortArray54 = Static426.aShortArray89 = Static642.aShortArray157 = Static138.aShortArray34 = new short[256];
		if (Static431.aClass133_11 == Static300.aClass133_17) {
			Static327.aBoolean456 = true;
			Static603.aShortArrayArray19 = Static74.aShortArrayArray2;
			Static461.aShortArrayArrayArray4 = Static413.aShortArrayArrayArray2;
			Static569.anInt9378 = 16777215;
			Static95.anInt1911 = 0;
		} else if (Static180.aClass133_6 == Static431.aClass133_11) {
			Static461.aShortArrayArrayArray4 = Static453.aShortArrayArrayArray3;
			Static603.aShortArrayArray19 = Static24.aShortArrayArray1;
		} else {
			Static461.aShortArrayArrayArray4 = Static330.aShortArrayArrayArray1;
			Static603.aShortArrayArray19 = Static571.aShortArrayArray18;
		}
		try {
			Static472.aClipboard1 = Static554.aClient1.getToolkit().getSystemClipboard();
		} catch (@Pc(222) Exception local222) {
		}
		Static476.aClass62_2 = Static647.method8675(Static617.aCanvas13);
		Static281.aClass49_1 = Static633.method1297(Static617.aCanvas13);
		try {
			if (Static48.aClass298_12.aClass4_2 != null) {
				Static8.aClass305_1 = new Class305(Static48.aClass298_12.aClass4_2, 5200, 0);
				for (@Pc(244) int local244 = 0; local244 < 37; local244++) {
					Static405.aClass305Array1[local244] = new Class305(Static48.aClass298_12.aClass4Array1[local244], 6000, 0);
				}
				Static26.aClass305_2 = new Class305(Static48.aClass298_12.aClass4_1, 6000, 0);
				Static35.aClass196_1 = new Class196(255, Static8.aClass305_1, Static26.aClass305_2, 500000);
				Static367.aClass305_5 = new Class305(Static48.aClass298_12.aClass4_3, 24, 0);
				Static48.aClass298_12.aClass4Array1 = null;
				Static48.aClass298_12.aClass4_2 = null;
				Static48.aClass298_12.aClass4_1 = null;
				Static48.aClass298_12.aClass4_3 = null;
			}
		} catch (@Pc(302) IOException local302) {
			Static35.aClass196_1 = null;
			Static367.aClass305_5 = null;
			Static8.aClass305_1 = null;
			Static26.aClass305_2 = null;
		}
		if (Static508.aClass220_11 != Static38.aClass220_2) {
			Static196.aBoolean264 = true;
		}
		Static595.aString97 = Static369.aClass235_15.method5893(Static455.anInt7738);
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(B)V")
	@Override
	protected void method1296() {
		if (Static644.aBoolean777) {
			Static173.method2878();
		}
		Static311.method5227();
		if (Static266.aClass82_8 != null) {
			Static266.aClass82_8.method6133();
		}
		if (Static355.aFrame7 != null) {
			Static647.method8678(Static355.aFrame7, Static48.aClass298_12);
			Static355.aFrame7 = null;
		}
		if (Static547.aClass197_1 != null) {
			Static547.aClass197_1.method5188();
			Static547.aClass197_1 = null;
		}
		Static446.method6667();
		Static186.aClass323_1.method7827();
		Static220.aClass286_1.method7064();
		if (Static602.aClass227_1 != null) {
			Static602.aClass227_1.method5786();
			Static602.aClass227_1 = null;
		}
		try {
			Static8.aClass305_1.method7515();
			for (@Pc(56) int local56 = 0; local56 < 37; local56++) {
				Static405.aClass305Array1[local56].method7515();
			}
			Static26.aClass305_2.method7515();
			Static367.aClass305_5.method7515();
			Static447.method6684();
		} catch (@Pc(77) Exception local77) {
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(Z)V")
	private void method1323() {
		if (Static82.anInt1653 == 14) {
			return;
		}
		Static304.anInt8391++;
		if (Static304.anInt8391 % 1000 == 1) {
			@Pc(26) GregorianCalendar local26 = new GregorianCalendar();
			Static538.anInt9064 = local26.get(11) * 600 + local26.get(12) * 10 + local26.get(13) / 6;
			Static556.aRandom1.setSeed((long) Static538.anInt9064);
		}
		if (Static304.anInt8391 % 50 == 0) {
			Static646.anInt4673 = Static347.anInt6408;
			Static347.anInt6408 = 0;
			Static583.anInt10159 = Static636.anInt10110;
			Static636.anInt10110 = 0;
		}
		this.method1313();
		if (Static365.aClass183_1 != null) {
			Static365.aClass183_1.method4580();
		}
		Static109.method1810();
		Static443.method6641();
		Static476.aClass62_2.method1419();
		Static281.aClass49_1.method2427();
		if (Static266.aClass82_8 != null) {
			Static266.aClass82_8.method6132((int) Static191.method3071());
		}
		Static481.method7111();
		Static435.anInt7561 = 0;
		Static227.anInt4609 = 0;
		for (@Pc(101) Interface26 local101 = Static476.aClass62_2.method1425(); local101 != null; local101 = Static476.aClass62_2.method1425()) {
			@Pc(107) int local107 = local101.method213();
			if (local107 == 2 || local107 == 3) {
				@Pc(141) char local141 = local101.method211();
				if (Static352.method5771() && (local141 == '`' || local141 == '§' || local141 == '²')) {
					if (Static204.method3222()) {
						Static311.method5225();
					} else {
						Static626.method8486();
					}
				} else if (Static227.anInt4609 < 128) {
					Static512.anInterface26Array1[Static227.anInt4609] = local101;
					Static227.anInt4609++;
				}
			} else if (local107 == 0 && Static435.anInt7561 < 75) {
				Static525.anInterface26Array2[Static435.anInt7561] = local101;
				Static435.anInt7561++;
			}
		}
		Static548.anInt9874 = 0;
		for (@Pc(193) Class3_Sub21 local193 = Static281.aClass49_1.method2425(); local193 != null; local193 = Static281.aClass49_1.method2425()) {
			@Pc(199) int local199 = local193.method5059();
			if (local199 == -1) {
				Static34.aClass216_4.method5449(local193);
			} else if (local199 == 6) {
				Static548.anInt9874 += local193.method5063();
			} else if (Static497.method5031(local199)) {
				Static172.aClass216_29.method5449(local193);
				if (Static172.aClass216_29.method5460() > 10) {
					Static172.aClass216_29.method5462();
				}
			}
		}
		if (Static204.method3222()) {
			Static284.method4610();
		}
		if (Static102.method1711(Static82.anInt1653)) {
			Static130.method2306();
			Static617.method8426();
		} else if (Static259.method4338(Static82.anInt1653)) {
			Static66.method1164();
		}
		if (Static87.method1479(Static82.anInt1653) && !Static259.method4338(Static82.anInt1653)) {
			this.method1314();
			Static241.method4068();
			Static329.method5393();
		} else if (Static311.method5226(Static82.anInt1653) && !Static259.method4338(Static82.anInt1653)) {
			this.method1314();
			Static329.method5393();
		} else if (Static82.anInt1653 == 12) {
			Static329.method5393();
		} else if (Static26.method368(Static82.anInt1653) && !Static259.method4338(Static82.anInt1653)) {
			Static524.method7619();
		} else if (Static82.anInt1653 == 13) {
			Static329.method5393();
			if (Static154.anInt3148 != -3 && Static154.anInt3148 != 2 && Static154.anInt3148 != 15) {
				Static416.method6442(false);
			}
		}
		Static69.method1230(Static266.aClass82_8);
		Static172.aClass216_29.method5462();
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(I)V")
	@Override
	protected void method1300() {
		if (Static32.aClass3_Sub41_3.aClass7_Sub9_2.method4181() != 2) {
			this.method1325();
			return;
		}
		try {
			this.method1325();
		} catch (@Pc(16) ThreadDeath local16) {
			throw local16;
		} catch (@Pc(19) Throwable local19) {
			Static296.method5075(local19, local19.getMessage() + " (Recovered) " + this.method1301());
			Static112.aBoolean167 = true;
			Static230.method3973(0, false);
		}
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(B)V")
	private void method1325() {
		if (Static82.anInt1653 == 14) {
			return;
		}
		@Pc(16) long local16 = Static245.method4133() / 1000000L - Static590.aLong260;
		Static590.aLong260 = Static245.method4133() / 1000000L;
		@Pc(24) boolean local24 = Static57.method7338();
		if (local24 && Static145.aBoolean263 && Static189.aClass89_3 != null) {
			Static189.aClass89_3.method4216();
		}
		if (Static414.method6401(Static82.anInt1653)) {
			if (Static512.aLong232 != 0L && Static512.aLong232 < Static191.method3071()) {
				Static545.method7843(Static154.anInt3153, Static339.method917(), Static384.anInt6921, false);
			} else if (!Static266.aClass82_8.method6175() && Static175.aBoolean246) {
				Static188.method3055();
			}
		}
		@Pc(88) int local88;
		@Pc(92) int local92;
		if (Static355.aFrame7 == null) {
			@Pc(74) Container local74;
			if (Static190.aFrame1 != null) {
				local74 = Static190.aFrame1;
			} else if (Static303.anApplet3 == null) {
				local74 = Static467.anApplet_Sub1_1;
			} else {
				local74 = Static303.anApplet3;
			}
			local88 = local74.getSize().width;
			local92 = local74.getSize().height;
			if (Static190.aFrame1 == local74) {
				@Pc(98) Insets local98 = Static190.aFrame1.getInsets();
				local88 -= local98.left + local98.right;
				local92 -= local98.top + local98.bottom;
			}
			if (local88 != Static136.anInt2830 || local92 != Static155.anInt3159 || Static264.aBoolean581) {
				if (Static266.aClass82_8 == null || Static266.aClass82_8.method6158()) {
					Static334.method5415();
				} else {
					Static136.anInt2830 = local88;
					Static155.anInt3159 = local92;
				}
				Static512.aLong232 = Static191.method3071() + 500L;
				Static264.aBoolean581 = false;
			}
		}
		if (Static355.aFrame7 != null && !Static489.aBoolean602 && Static414.method6401(Static82.anInt1653)) {
			Static545.method7843(-1, Static32.aClass3_Sub41_3.aClass7_Sub22_2.method6533(), -1, false);
		}
		@Pc(171) boolean local171 = false;
		if (Static343.aBoolean465) {
			local171 = true;
			Static343.aBoolean465 = false;
		}
		if (local171) {
			Static616.method8421();
		}
		if (Static266.aClass82_8 != null && Static266.aClass82_8.method6175() || Static339.method917() != 1) {
			Static647.method8677();
		}
		if (Static102.method1711(Static82.anInt1653)) {
			Static93.method1572(local171);
		} else if (Static248.method4183(Static82.anInt1653)) {
			Static413.method6397();
		} else if (Static266.method4464(Static82.anInt1653)) {
			Static413.method6397();
		} else if (Static259.method4338(Static82.anInt1653)) {
			if (Static149.anInt3034 == 1) {
				if (Static491.anInt8357 < Static486.anInt8252) {
					Static491.anInt8357 = Static486.anInt8252;
				}
				local88 = (Static491.anInt8357 - Static486.anInt8252) * 50 / Static491.anInt8357;
				Static447.method6682(true, Static232.aClass63_6, Static369.aClass235_15.method5893(Static455.anInt7738) + "<br>(" + local88 + "%)", Static240.aClass93_4, Static266.aClass82_8);
			} else if (Static149.anInt3034 == 2) {
				if (Static179.anInt3440 < Static586.anInt9503) {
					Static179.anInt3440 = Static586.anInt9503;
				}
				local88 = (Static179.anInt3440 - Static586.anInt9503) * 50 / Static179.anInt3440 + 50;
				Static447.method6682(true, Static232.aClass63_6, Static369.aClass235_15.method5893(Static455.anInt7738) + "<br>(" + local88 + "%)", Static240.aClass93_4, Static266.aClass82_8);
			} else {
				Static447.method6682(true, Static232.aClass63_6, Static369.aClass235_15.method5893(Static455.anInt7738), Static240.aClass93_4, Static266.aClass82_8);
			}
		} else if (Static82.anInt1653 == 10) {
			Static438.method6618(local16);
		} else if (Static82.anInt1653 == 13) {
			Static447.method6682(false, Static232.aClass63_6, Static369.aClass235_17.method5893(Static455.anInt7738) + "<br>" + Static369.aClass235_18.method5893(Static455.anInt7738), Static240.aClass93_4, Static266.aClass82_8);
		}
		if (Static55.anInt1040 == 3) {
			for (local88 = 0; local88 < Static453.anInt7674; local88++) {
				@Pc(369) Rectangle local369 = Class18_Sub3.aRectangleArray1[local88];
				if (Static125.aBooleanArray14[local88]) {
					Static266.aClass82_8.method6137(local369.height, local369.x, local369.width, local369.y, -65281);
				} else if (Static356.aBooleanArray21[local88]) {
					Static266.aClass82_8.method6137(local369.height, local369.x, local369.width, local369.y, -65536);
				} else {
					Static266.aClass82_8.method6137(local369.height, local369.x, local369.width, local369.y, -16711936);
				}
			}
		}
		if (Static204.method3222()) {
			Static160.method2782(Static266.aClass82_8);
		}
		if (Static48.aClass298_12.aBoolean612 && Static414.method6401(Static82.anInt1653) && Static55.anInt1040 == 0 && Static339.method917() == 1 && !local171) {
			local88 = 0;
			for (local92 = 0; local92 < Static453.anInt7674; local92++) {
				if (Static356.aBooleanArray21[local92]) {
					Static356.aBooleanArray21[local92] = false;
					Static438.aRectangleArray2[local88++] = Class18_Sub3.aRectangleArray1[local92];
				}
			}
			try {
				if (Static80.aBoolean118) {
					Static138.method2374(local88, Static438.aRectangleArray2);
				} else {
					Static266.aClass82_8.method6124(Static438.aRectangleArray2, local88);
				}
			} catch (@Pc(547) Exception_Sub1 local547) {
			}
		} else if (!Static102.method1711(Static82.anInt1653)) {
			for (local88 = 0; local88 < Static453.anInt7674; local88++) {
				Static356.aBooleanArray21[local88] = false;
			}
			try {
				if (Static80.aBoolean118) {
					Static568.method7086();
				} else {
					Static266.aClass82_8.method6152();
				}
			} catch (@Pc(481) Exception_Sub1 local481) {
				Static296.method5075(local481, local481.getMessage() + " (Recovered) " + this.method1301());
				Static230.method3973(0, false);
			}
		}
		Static597.method8246();
		local88 = Static32.aClass3_Sub41_3.aClass7_Sub17_1.method6220();
		if (local88 == 0) {
			Static143.method2414(15L);
		} else if (local88 == 1) {
			Static143.method2414(10L);
		} else if (local88 == 2) {
			Static143.method2414(5L);
		} else if (local88 == 3) {
			Static143.method2414(2L);
		}
		if (Static580.aBoolean712) {
			Static336.method5422();
		}
		if (Static32.aClass3_Sub41_3.aClass7_Sub23_1.method6638() == 1 && Static82.anInt1653 == 3 && Static528.anInt8950 != -1) {
			Static32.aClass3_Sub41_3.method6773(0, Static32.aClass3_Sub41_3.aClass7_Sub23_1);
			Static124.method2223();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(I)Ljava/lang/String;")
	@Override
	public String method1301() {
		@Pc(7) String local7 = null;
		try {
			local7 = "[1)" + Static427.anInt7462 + "," + Static22.anInt329 + "," + Static399.anInt7121 + "," + Static24.anInt345 + "|";
			if (Static68.aClass9_Sub2_Sub1_Sub2_Sub1_1 != null) {
				local7 = local7 + "2)" + Static65.anInt1298 + "," + (Static68.aClass9_Sub2_Sub1_Sub2_Sub1_1.anIntArray675[0] + Static427.anInt7462) + "," + (Static68.aClass9_Sub2_Sub1_Sub2_Sub1_1.anIntArray676[0] + Static22.anInt329) + "|";
			}
			local7 = local7 + "3)" + Static32.aClass3_Sub41_3.aClass7_Sub9_2.method4181() + "|4)" + Static32.aClass3_Sub41_3.aClass7_Sub26_1.method8128() + "|5)" + Static339.method917() + "|6)" + Static330.anInt6254 + "," + Static190.anInt3576 + "|";
			local7 = local7 + "7)" + Static32.aClass3_Sub41_3.aClass7_Sub6_1.method3237() + "|";
			local7 = local7 + "8)" + Static32.aClass3_Sub41_3.aClass7_Sub2_1.method984() + "|";
			local7 = local7 + "9)" + Static32.aClass3_Sub41_3.aClass7_Sub27_1.method8231() + "|";
			local7 = local7 + "10)" + Static32.aClass3_Sub41_3.aClass7_Sub28_1.method8245() + "|";
			local7 = local7 + "11)" + Static32.aClass3_Sub41_3.aClass7_Sub25_1.method7711() + "|";
			local7 = local7 + "12)" + Static32.aClass3_Sub41_3.aClass7_Sub13_2.method5385() + "|";
			local7 = local7 + "13)" + Static248.anInt4899 + "|";
			local7 = local7 + "14)" + Static82.anInt1653;
			if (Static545.aClass3_Sub38_1 != null) {
				local7 = local7 + "|15)" + Static545.aClass3_Sub38_1.anInt7213;
			}
			try {
				if (Static32.aClass3_Sub41_3.aClass7_Sub9_2.method4181() == 2) {
					@Pc(245) Class local245 = Class.forName("java.lang.ClassLoader");
					@Pc(249) Field local249 = local245.getDeclaredField("nativeLibraries");
					@Pc(252) Class local252 = Class.forName("java.lang.reflect.AccessibleObject");
					@Pc(262) Method local262 = local252.getDeclaredMethod("setAccessible", Boolean.TYPE);
					local262.invoke(local249, Boolean.TRUE);
					@Pc(285) Vector local285 = (Vector) local249.get(client.class.getClassLoader());
					for (@Pc(287) int local287 = 0; local287 < local285.size(); local287++) {
						try {
							@Pc(293) Object local293 = local285.elementAt(local287);
							@Pc(298) Field local298 = local293.getClass().getDeclaredField("name");
							local262.invoke(local298, Boolean.TRUE);
							try {
								@Pc(313) String local313 = (String) local298.get(local293);
								if (local313 != null && local313.indexOf("sw3d.dll") != -1) {
									@Pc(326) Field local326 = local293.getClass().getDeclaredField("handle");
									local262.invoke(local326, Boolean.TRUE);
									local7 = local7 + "|16)" + Long.toHexString(local326.getLong(local293));
									local262.invoke(local326, Boolean.FALSE);
								}
							} catch (@Pc(362) Throwable local362) {
							}
							local262.invoke(local298, Boolean.FALSE);
						} catch (@Pc(374) Throwable local374) {
						}
					}
				}
			} catch (@Pc(386) Throwable local386) {
			}
			local7 = local7 + "]";
		} catch (@Pc(397) Throwable local397) {
		}
		return local7;
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(B)V")
	@Override
	public synchronized void method1293() {
		if (Static303.anApplet3 != null && Static617.aCanvas13 == null && !Static48.aClass298_12.aBoolean612) {
			try {
				@Pc(13) Class local13 = Static303.anApplet3.getClass();
				@Pc(17) Field local17 = local13.getDeclaredField("canvas");
				Static617.aCanvas13 = (Canvas) local17.get(Static303.anApplet3);
				local17.set(Static303.anApplet3, (Object) null);
				if (Static617.aCanvas13 != null) {
					return;
				}
			} catch (@Pc(30) Exception local30) {
			}
		}
		super.method1293();
	}
}
