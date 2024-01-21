import java.awt.Color;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!client")
public final class client extends Applet_Sub1 {

	@OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V")
	public static void main(@OriginalArg(0) String[] arg0) {
		try {
			if (arg0.length != 5) {
				Static24.method1434();
			}
			Static18.anInt614 = Integer.parseInt(arg0[0]);
			if (arg0[1].equals("live")) {
				Static30.anInt923 = 0;
			} else if (arg0[1].equals("office")) {
				Static30.anInt923 = 1;
			} else if (arg0[1].equals("local")) {
				Static30.anInt923 = 2;
			} else {
				Static24.method1434();
			}
			if (arg0[2].equals("live")) {
				Static56.anInt1499 = 0;
			} else if (arg0[2].equals("rc")) {
				Static56.anInt1499 = 1;
			} else if (arg0[2].equals("wip")) {
				Static56.anInt1499 = 2;
			} else {
				Static24.method1434();
			}
			if (arg0[3].equals("lowmem")) {
				Static48.method754();
			} else if (arg0[3].equals("highmem")) {
				Static41.method681();
			} else {
				Static24.method1434();
			}
			if (arg0[4].equals("free")) {
				Static106.aBoolean121 = false;
			} else if (arg0[4].equals("members")) {
				Static106.aBoolean121 = true;
			} else {
				Static24.method1434();
			}
			@Pc(130) client local130 = new client();
			local130.method365("runescape", InetAddress.getLocalHost(), Static56.anInt1499 + 32);
		} catch (@Pc(145) Exception local145) {
			Static99.method1580(null, local145);
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(B)V")
	private void method379() {
		if (Static64.anInt1731 >= 4) {
			this.method366("js5crc");
			Static11.anInt319 = 1000;
			return;
		}
		if (Static48.anInt1337 >= 4) {
			if (Static11.anInt319 <= 5) {
				this.method366("js5io");
				Static11.anInt319 = 1000;
				return;
			}
			Static29.anInt890 = 3000;
			Static48.anInt1337 = 3;
		}
		if (Static29.anInt890-- > 0) {
			return;
		}
		try {
			if (Static95.anInt2437 == 0) {
				Static6.aClass19_1 = Static1.aClass55_1.method1407(Static94.anInt2426);
				Static95.anInt2437++;
			}
			if (Static95.anInt2437 == 1) {
				if (Static6.aClass19_1.anInt879 == 2) {
					this.method383(-1);
					return;
				}
				if (Static6.aClass19_1.anInt879 == 1) {
					Static95.anInt2437++;
				}
			}
			if (Static95.anInt2437 == 2) {
				Static33.aClass27_1 = new Class27((Socket) Static6.aClass19_1.anObject2, Static1.aClass55_1);
				@Pc(92) Class10_Sub10 local92 = new Class10_Sub10(5);
				local92.method1126(15);
				local92.method1157(414);
				Static33.aClass27_1.method613(local92.aByteArray9, 5);
				Static95.anInt2437++;
				Static10.aLong14 = System.currentTimeMillis();
			}
			if (Static95.anInt2437 == 3) {
				if (Static11.anInt319 <= 5 || Static33.aClass27_1.method608() > 0) {
					@Pc(127) int local127 = Static33.aClass27_1.method612();
					if (local127 != 0) {
						this.method383(local127);
						return;
					}
					Static95.anInt2437++;
				} else if (System.currentTimeMillis() - Static10.aLong14 > 30000L) {
					this.method383(-2);
					return;
				}
			}
			if (Static95.anInt2437 == 4) {
				Static1.method4(Static11.anInt319 > 20, Static33.aClass27_1);
				Static33.aClass27_1 = null;
				Static6.aClass19_1 = null;
				Static95.anInt2437 = 0;
				Static22.anInt743 = 0;
			}
		} catch (@Pc(176) IOException local176) {
			this.method383(-3);
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(B)V")
	@Override
	protected void method373() {
		Static95.anInt2442++;
		this.method381();
		Static27.method525();
		Static15.method337();
		Static11.method248();
		Static64.method941();
		Static21.method442();
		if (Static11.anInt319 == 0) {
			Static17.method399();
			Static51.method790();
		} else if (Static11.anInt319 == 5) {
			Static17.method399();
			Static51.method790();
		} else if (Static11.anInt319 == 10) {
			Static53.method801();
		} else if (Static11.anInt319 == 20) {
			Static53.method801();
			Static60.method898();
		} else if (Static11.anInt319 == 25) {
			Static47.method742();
		}
		if (Static11.anInt319 == 30) {
			Static10.method247();
		} else if (Static11.anInt319 == 35) {
			Static10.method247();
		} else if (Static11.anInt319 == 40) {
			Static60.method898();
			return;
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(I)V")
	@Override
	protected void method363() {
		if (Static1.aClass22_1 != null) {
			Static1.aClass22_1.aBoolean40 = false;
		}
		Static1.aClass22_1 = null;
		if (Static99.aClass27_4 != null) {
			Static99.aClass27_4.method610();
		}
		Static4.method27();
		Static10.method243();
		Static15.method340();
		Static26.method926();
		Static19.method411();
		Static58.method842();
		try {
			if (Static58.aClass53_2 != null) {
				Static58.aClass53_2.method1280();
			}
			if (Static29.aClass53Array1 != null) {
				for (@Pc(47) int local47 = 0; local47 < Static29.aClass53Array1.length; local47++) {
					if (Static29.aClass53Array1[local47] != null) {
						Static29.aClass53Array1[local47].method1280();
					}
				}
			}
			if (Static12.aClass53_1 != null) {
				Static12.aClass53_1.method1280();
			}
		} catch (@Pc(70) IOException local70) {
		}
	}

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V")
	private void method381() {
		if (Static11.anInt319 != 1000) {
			@Pc(12) boolean local12 = Static69.method1010();
			if (!local12) {
				this.method379();
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
	@Override
	public void init() {
		if (!this.method370()) {
			return;
		}
		Static18.anInt614 = Integer.parseInt(this.getParameter("worldid"));
		Static56.anInt1499 = Integer.parseInt(this.getParameter("modewhat"));
		Static30.anInt923 = Integer.parseInt(this.getParameter("modewhere"));
		@Pc(29) String local29 = this.getParameter("lowmem");
		if (local29 != null && local29.equals("1")) {
			Static48.method754();
		} else {
			Static41.method681();
		}
		@Pc(45) String local45 = this.getParameter("members");
		if (local45 != null && local45.equals("1")) {
			Static106.aBoolean121 = true;
		} else {
			Static106.aBoolean121 = false;
		}
		this.method372(Static56.anInt1499 + 32);
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(I)V")
	@Override
	protected void method368() {
		if (Static50.aBoolean67) {
			Static39.method214(Static38.aCanvas1);
			Static55.method810(Static38.aCanvas1);
			this.method364();
			Static4.method32(Static38.aCanvas1);
			Static55.method809(Static38.aCanvas1);
		}
		if (Static11.anInt319 == 0) {
			Static6.method69(null, Static15.aClass61_148, Static42.anInt2376);
		} else if (Static11.anInt319 == 5) {
			Static56.method820(Static8.aClass10_Sub1_Sub1_Sub4_1, Static50.aClass10_Sub1_Sub1_Sub4_3);
		} else if (Static11.anInt319 == 10) {
			Static56.method820(Static8.aClass10_Sub1_Sub1_Sub4_1, Static50.aClass10_Sub1_Sub1_Sub4_3);
		} else if (Static11.anInt319 == 20) {
			Static56.method820(Static8.aClass10_Sub1_Sub1_Sub4_1, Static50.aClass10_Sub1_Sub1_Sub4_3);
		} else if (Static11.anInt319 == 25) {
			@Pc(98) int local98;
			if (Static64.anInt1737 == 1) {
				if (Static9.anInt302 < Static57.anInt1515) {
					Static9.anInt302 = Static57.anInt1515;
				}
				local98 = (Static9.anInt302 - Static57.anInt1515) * 50 / Static9.anInt302;
				Static58.method840(true, Static93.method1156(new Class61[] { Static69.aClass61_748, Static29.method529(local98), Static43.aClass61_498 }), Static95.aClass61_975);
			} else if (Static64.anInt1737 == 2) {
				if (Static58.anInt1533 > Static51.anInt1410) {
					Static51.anInt1410 = Static58.anInt1533;
				}
				local98 = (Static51.anInt1410 - Static58.anInt1533) * 50 / Static51.anInt1410 + 50;
				Static58.method840(true, Static93.method1156(new Class61[] { Static69.aClass61_748, Static29.method529(local98), Static43.aClass61_498 }), Static95.aClass61_975);
			} else {
				Static58.method840(false, null, Static95.aClass61_975);
			}
		} else if (Static11.anInt319 == 30) {
			Static53.method798();
		} else if (Static11.anInt319 == 35) {
			Static35.method606();
		} else if (Static11.anInt319 == 40) {
			Static58.method840(false, Static22.aClass61_287, Static106.aClass61_1086);
		}
		Static6.anInt68 = 0;
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(II)V")
	private void method383(@OriginalArg(1) int arg0) {
		Static95.anInt2437 = 0;
		Static6.aClass19_1 = null;
		Static33.aClass27_1 = null;
		if (Static79.anInt2146 == Static94.anInt2426) {
			Static94.anInt2426 = Static20.anInt2656;
		} else {
			Static94.anInt2426 = Static79.anInt2146;
		}
		Static22.anInt743++;
		if (Static22.anInt743 >= 2 && (arg0 == 7 || arg0 == 9)) {
			if (Static11.anInt319 > 5) {
				Static29.anInt890 = 3000;
			} else {
				this.method366("js5connect_full");
				Static11.anInt319 = 1000;
			}
		} else if (Static22.anInt743 >= 2 && arg0 == 6) {
			this.method366("js5connect_outofdate");
			Static11.anInt319 = 1000;
		} else if (Static22.anInt743 >= 4) {
			if (Static11.anInt319 > 5) {
				Static29.anInt890 = 3000;
			} else {
				this.method366("js5connect");
				Static11.anInt319 = 1000;
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(I)V")
	@Override
	protected void method374() {
		Static16.method380();
		Static101.method1605();
		Static63.method375();
		Static51.method785();
		Static10.method246();
		Static103.method592();
		Static29.method531();
		Static93.method1134();
		Static36.method611();
		Static9.method234();
		Static82.method1283();
		Static58.method841();
		Static41.method683();
		Static75.method1163();
		Static97.method1538();
		Static85.method1342();
		Static12.method259();
		Static62.method931();
		Static7.method73();
		Static17.method398();
		Static55.method816();
		Static67.method966();
		Static26.method924();
		Static22.method467();
		Static13.method285();
		Static79.method1253();
		Static20.method1652();
		Static37.method615();
		Static53.method800();
		Static100.method1657();
		Static39.method202();
		Static40.method651();
		Static33.method580();
		Static84.method1333();
		Static56.method819();
		Static52.method797();
		Static54.method806();
		Static76.method1173();
		Static70.method1662();
		Static88.method1420();
		Static4.method31();
		Static71.method1018();
		Static50.method782();
		Static73.method1030();
		Static80.method1255();
		Static23.method476();
		Static47.method738();
		Static15.method341();
		Static24.method1436();
		Static35.method604();
		Static65.method948();
		Static102.method1630();
		Static60.method897();
		Static48.method755();
		Static66.method956();
		Static68.method1009();
		Static45.method1533();
		Static1.method3();
		Static30.method554();
		Static5.method35();
		Static8.method167();
		Static78.method1237();
		Static44.method706();
		Static49.method768();
		Static99.method1584();
		Static38.method639();
		Static81.method1277();
		Static64.method944();
		Static104.method1643();
		Static6.method66();
		Static90.method1453();
		Static25.method490();
		Static61.method905();
		Static28.method527();
		Static89.method1424();
		Static3.method26();
		Static57.method829();
		Static46.method736();
		Static94.method1496();
		Static69.method1015();
		Static106.method1666();
		Static21.method447();
		Static19.method409();
		Static96.method1512();
		Static18.method404();
		Static11.method249();
		Static34.method598();
		Static31.method556();
		Static72.method1026();
		Static98.method1560();
		Static87.method1410();
		Static105.method1651();
		Static59.method875();
		Static32.method567();
		Static83.method1295();
		Static107.method1498();
		Static74.method1045();
		Static92.method1442();
		Static77.method1222();
		Static27.method523();
		Static43.method691();
		Static42.method1471();
		Static2.method16();
		Static95.method1510();
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(B)V")
	@Override
	protected void method371() {
		Static79.anInt2146 = Static30.anInt923 == 0 ? 43594 : Static18.anInt614 + 40000;
		Static94.anInt2426 = Static79.anInt2146;
		Static20.anInt2656 = Static30.anInt923 == 0 ? 443 : Static18.anInt614 + 50000;
		Static67.method971();
		Static4.method32(Static38.aCanvas1);
		Static55.method809(Static38.aCanvas1);
		Static43.anInt1208 = Static86.anInt2308;
		try {
			if (Static1.aClass55_1.aClass52_3 != null) {
				Static58.aClass53_2 = new Class53(Static1.aClass55_1.aClass52_3, 5200, 0);
				for (@Pc(54) int local54 = 0; local54 < 12; local54++) {
					Static29.aClass53Array1[local54] = new Class53(Static1.aClass55_1.aClass52Array1[local54], 6000, 0);
				}
				Static12.aClass53_1 = new Class53(Static1.aClass55_1.aClass52_2, 6000, 0);
				Static95.aClass38_4 = new Class38(255, Static58.aClass53_2, Static12.aClass53_1, 500000);
				Static1.aClass55_1.aClass52Array1 = null;
				Static1.aClass55_1.aClass52_2 = null;
				Static1.aClass55_1.aClass52_3 = null;
			}
		} catch (@Pc(99) IOException local99) {
			Static58.aClass53_2 = null;
			Static12.aClass53_1 = null;
			Static95.aClass38_4 = null;
		}
		if (Static30.anInt923 != 0) {
			Static69.aBoolean87 = true;
		}
	}
}
