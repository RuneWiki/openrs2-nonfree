package com.jagex;

import jaclib.hardware_info.HardwareInfo;
import java.util.HashMap;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!akd")
public class Class77_Sub28 extends Class77 {

	@OriginalMember(owner = "client!akd", name = "am", descriptor = "I")
	public static final int anInt1578 = 0;

	@OriginalMember(owner = "client!akd", name = "w", descriptor = "I")
	static final int anInt1579 = 2;

	@OriginalMember(owner = "client!akd", name = "y", descriptor = "I")
	static final int anInt1580 = 1;

	@OriginalMember(owner = "client!akd", name = "q", descriptor = "I")
	static final int anInt1581 = 4;

	@OriginalMember(owner = "client!akd", name = "t", descriptor = "I")
	static final int anInt1583 = 3;

	@OriginalMember(owner = "client!akd", name = "m", descriptor = "I")
	static final int anInt1584 = 23;

	@OriginalMember(owner = "client!akd", name = "r", descriptor = "I")
	static final int anInt1585 = 2;

	@OriginalMember(owner = "client!akd", name = "aj", descriptor = "I")
	static final int anInt1586 = 25;

	@OriginalMember(owner = "client!akd", name = "z", descriptor = "I")
	static final int anInt1587 = 4;

	@OriginalMember(owner = "client!akd", name = "j", descriptor = "I")
	static final int anInt1588 = 5;

	@OriginalMember(owner = "client!akd", name = "i", descriptor = "I")
	static final int anInt1589 = 6;

	@OriginalMember(owner = "client!akd", name = "k", descriptor = "I")
	static final int anInt1590 = 7;

	@OriginalMember(owner = "client!akd", name = "ax", descriptor = "I")
	static final int anInt1591 = 4;

	@OriginalMember(owner = "client!akd", name = "e", descriptor = "I")
	static final int anInt1592 = 9;

	@OriginalMember(owner = "client!akd", name = "f", descriptor = "I")
	static final int anInt1593 = 10;

	@OriginalMember(owner = "client!akd", name = "u", descriptor = "I")
	static final int anInt1594 = 8;

	@OriginalMember(owner = "client!akd", name = "n", descriptor = "I")
	static final int anInt1596 = 21;

	@OriginalMember(owner = "client!akd", name = "a", descriptor = "I")
	static final int anInt1597 = 22;

	@OriginalMember(owner = "client!akd", name = "g", descriptor = "I")
	static final int anInt1598 = 3;

	@OriginalMember(owner = "client!akd", name = "o", descriptor = "I")
	static final int anInt1599 = 11;

	@OriginalMember(owner = "client!akd", name = "ai", descriptor = "I")
	static final int anInt1600 = 26;

	@OriginalMember(owner = "client!akd", name = "ag", descriptor = "I")
	static final int anInt1601 = 27;

	@OriginalMember(owner = "client!akd", name = "ao", descriptor = "I")
	static final int anInt1603 = 1;

	@OriginalMember(owner = "client!akd", name = "ak", descriptor = "I")
	static final int anInt1604 = 2;

	@OriginalMember(owner = "client!akd", name = "au", descriptor = "I")
	static final int anInt1605 = 3;

	@OriginalMember(owner = "client!akd", name = "h", descriptor = "I")
	static final int anInt1606 = 24;

	@OriginalMember(owner = "client!akd", name = "ar", descriptor = "I")
	static final int anInt1607 = 5;

	@OriginalMember(owner = "client!akd", name = "s", descriptor = "I")
	static final int anInt1613 = 1;

	@OriginalMember(owner = "client!akd", name = "as", descriptor = "I")
	static final int anInt1614 = 0;

	@OriginalMember(owner = "client!akd", name = "b", descriptor = "I")
	static final int anInt1621 = 20;

	@OriginalMember(owner = "client!akd", name = "l", descriptor = "I")
	static final int anInt1623 = 7;

	@OriginalMember(owner = "client!akd", name = "bl", descriptor = "[I")
	int[] anIntArray202 = new int[3];

	@OriginalMember(owner = "client!akd", name = "x", descriptor = "I")
	int anInt1582;

	@OriginalMember(owner = "client!akd", name = "d", descriptor = "Z")
	boolean aBoolean332;

	@OriginalMember(owner = "client!akd", name = "al", descriptor = "I")
	int anInt1602;

	@OriginalMember(owner = "client!akd", name = "ad", descriptor = "I")
	int anInt1608;

	@OriginalMember(owner = "client!akd", name = "ac", descriptor = "I")
	int anInt1609;

	@OriginalMember(owner = "client!akd", name = "av", descriptor = "I")
	int anInt1610;

	@OriginalMember(owner = "client!akd", name = "at", descriptor = "I")
	int anInt1595;

	@OriginalMember(owner = "client!akd", name = "ae", descriptor = "Z")
	boolean aBoolean331;

	@OriginalMember(owner = "client!akd", name = "ah", descriptor = "I")
	int anInt1612;

	@OriginalMember(owner = "client!akd", name = "aq", descriptor = "I")
	int anInt1611;

	@OriginalMember(owner = "client!akd", name = "bc", descriptor = "I")
	int anInt1622;

	@OriginalMember(owner = "client!akd", name = "af", descriptor = "I")
	int anInt1616;

	@OriginalMember(owner = "client!akd", name = "ay", descriptor = "I")
	public int anInt1615;

	@OriginalMember(owner = "client!akd", name = "bv", descriptor = "Ljava/lang/String;")
	String aString54;

	@OriginalMember(owner = "client!akd", name = "bb", descriptor = "I")
	int anInt1618;

	@OriginalMember(owner = "client!akd", name = "bj", descriptor = "I")
	int anInt1617;

	@OriginalMember(owner = "client!akd", name = "ba", descriptor = "Ljava/lang/String;")
	String aString55;

	@OriginalMember(owner = "client!akd", name = "an", descriptor = "Ljava/lang/String;")
	String aString52;

	@OriginalMember(owner = "client!akd", name = "az", descriptor = "I")
	int anInt1620;

	@OriginalMember(owner = "client!akd", name = "aw", descriptor = "I")
	int anInt1619;

	@OriginalMember(owner = "client!akd", name = "aa", descriptor = "Ljava/lang/String;")
	String aString53;

	@OriginalMember(owner = "client!akd", name = "ab", descriptor = "Ljava/lang/String;")
	String aString50;

	@OriginalMember(owner = "client!akd", name = "ap", descriptor = "Ljava/lang/String;")
	String aString51;

	@OriginalMember(owner = "client!akd", name = "bd", descriptor = "Ljava/lang/String;")
	String aString56;

	@OriginalMember(owner = "client!akd", name = "<init>", descriptor = "(Z)V", line = 67)
	public Class77_Sub28(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			if (Class293.aString184.startsWith("win")) {
				this.anInt1582 = -1372711787;
			} else if (Class293.aString184.startsWith("mac")) {
				this.anInt1582 = 1549543722;
			} else if (Class293.aString184.startsWith("linux")) {
				this.anInt1582 = 176831935;
			} else {
				this.anInt1582 = -1195879852;
			}
			if (Class504.aString153.startsWith("amd64") || Class504.aString153.startsWith("x86_64")) {
				this.aBoolean332 = true;
			} else {
				this.aBoolean332 = false;
			}
			if (this.anInt1582 * -169994563 == 1) {
				if (Class483.aString219.indexOf("4.0") != -1) {
					this.anInt1602 = 426439165;
				} else if (Class483.aString219.indexOf("4.1") != -1) {
					this.anInt1602 = 852878330;
				} else if (Class483.aString219.indexOf("4.9") != -1) {
					this.anInt1602 = 1279317495;
				} else if (Class483.aString219.indexOf("5.0") != -1) {
					this.anInt1602 = 1705756660;
				} else if (Class483.aString219.indexOf("5.1") != -1) {
					this.anInt1602 = 2132195825;
				} else if (Class483.aString219.indexOf("5.2") != -1) {
					this.anInt1602 = -883453976;
				} else if (Class483.aString219.indexOf("6.0") != -1) {
					this.anInt1602 = -1736332306;
				} else if (Class483.aString219.indexOf("6.1") != -1) {
					this.anInt1602 = -1309893141;
				} else if (Class483.aString219.indexOf("6.2") != -1) {
					this.anInt1602 = -457014811;
				} else if (Class483.aString219.indexOf("6.3") != -1) {
					this.anInt1602 = -30575646;
				} else if (Class483.aString219.indexOf("10.0") != -1) {
					this.anInt1602 = 395863519;
				}
			} else if (this.anInt1582 * -169994563 == 2) {
				if (Class483.aString219.indexOf("10.4") != -1) {
					this.anInt1602 = -61151292;
				} else if (Class483.aString219.indexOf("10.5") != -1) {
					this.anInt1602 = 365287873;
				} else if (Class483.aString219.indexOf("10.6") != -1) {
					this.anInt1602 = 791727038;
				} else if (Class483.aString219.indexOf("10.7") != -1) {
					this.anInt1602 = 1218166203;
				} else if (Class483.aString219.indexOf("10.8") != -1) {
					this.anInt1602 = 1644605368;
				} else if (Class483.aString219.indexOf("10.9") != -1) {
					this.anInt1602 = 2071044533;
				} else if (Class483.aString219.indexOf("10.10") != -1) {
					this.anInt1602 = -1797483598;
				} else if (Class483.aString219.indexOf("10.11") != -1) {
					this.anInt1602 = -1371044433;
				}
			}
			if (Class467.aString216.toLowerCase().indexOf("sun") != -1) {
				this.anInt1608 = 796302543;
			} else if (Class467.aString216.toLowerCase().indexOf("microsoft") != -1) {
				this.anInt1608 = 1592605086;
			} else if (Class467.aString216.toLowerCase().indexOf("apple") != -1) {
				this.anInt1608 = -1906059667;
			} else if (Class467.aString216.toLowerCase().indexOf("oracle") == -1) {
				this.anInt1608 = -1109757124;
			} else {
				this.anInt1608 = -313454581;
			}
			@Pc(276) int local276 = 2;
			@Pc(278) int local278 = 0;
			@Pc(286) char local286;
			try {
				while (local276 < Class143_Sub1.aString59.length()) {
					local286 = Class143_Sub1.aString59.charAt(local276);
					if (local286 < '0' || local286 > '9') {
						break;
					}
					local278 = local286 - '0' + local278 * 10;
					local276++;
				}
			} catch (@Pc(304) Exception local304) {
			}
			this.anInt1609 = local278 * 2040935167;
			local276 = Class143_Sub1.aString59.indexOf(46, 2) + 1;
			local278 = 0;
			try {
				while (local276 < Class143_Sub1.aString59.length()) {
					local286 = Class143_Sub1.aString59.charAt(local276);
					if (local286 < '0' || local286 > '9') {
						break;
					}
					local278 = local286 - '0' + local278 * 10;
					local276++;
				}
			} catch (@Pc(344) Exception local344) {
			}
			this.anInt1610 = local278 * -654768597;
			local276 = Class143_Sub1.aString59.indexOf(95, 4) + 1;
			local278 = 0;
			try {
				while (local276 < Class143_Sub1.aString59.length()) {
					local286 = Class143_Sub1.aString59.charAt(local276);
					if (local286 < '0' || local286 > '9') {
						break;
					}
					local278 = local286 - '0' + local278 * 10;
					local276++;
				}
			} catch (@Pc(384) Exception local384) {
			}
			this.anInt1595 = local278 * 2027918459;
			this.aBoolean331 = false;
			this.anInt1612 = Class504.anInt3376 * -2078220253;
			if (this.anInt1609 * 758172927 > 3) {
				this.anInt1611 = Class504.anInt3372 * -1829000755;
			} else {
				this.anInt1611 = 0;
			}
			try {
				@Pc(414) int[] local414 = HardwareInfo.getCPUInfo();
				if (local414 != null && local414.length == 3) {
					this.anInt1622 = local414[0] * 238329581;
					this.anInt1616 = local414[1] * 815786995;
					this.anInt1615 = local414[2] * -2049910049;
				}
				@Pc(444) int[] local444 = HardwareInfo.getRawCPUInfo();
				@Pc(457) int local457;
				@Pc(477) int local477;
				@Pc(485) int local485;
				@Pc(493) int local493;
				if (local444 != null && local444.length % 5 == 0) {
					@Pc(455) HashMap local455 = new HashMap();
					for (local457 = 0; local457 < local444.length / 5; local457++) {
						@Pc(469) int local469 = local444[local457 * 5];
						local477 = local444[local457 * 5 + 1];
						local485 = local444[local457 * 5 + 2];
						local493 = local444[local457 * 5 + 3];
						@Pc(501) int local501 = local444[local457 * 5 + 4];
						@Pc(510) Class43 local510 = new Class43(local469, local477, local485, local493, local501);
						local455.put(local469, local510);
					}
					@Pc(524) Class43 local524 = (Class43) local455.get(0);
					if (local524 != null) {
						@Pc(531) Class77_Sub39 local531 = new Class77_Sub39(13);
						local531.method22420(local524.anInt167 * 591064797);
						local531.method22420(local524.anInt165 * 849627281);
						local531.method22420(local524.anInt169 * -2091928773);
						local531.anInt3089 = 0;
						this.aString54 = local531.method22523();
					}
					@Pc(566) Class43 local566 = (Class43) local455.get(1);
					if (local566 != null) {
						this.anInt1618 = local566.anInt166 * 2017253763;
						local477 = local566.anInt167 * 591064797;
						this.anInt1617 = (local477 >> 16 & 0xFF) * -917612979;
						this.anIntArray202[0] = local566.anInt169 * -2091928773;
						this.anIntArray202[1] = local566.anInt165 * 849627281;
					}
					@Pc(611) Class43 local611 = (Class43) local455.get(-2147483647);
					if (local611 != null) {
						this.anIntArray202[2] = local611.anInt165 * 849627281;
					}
					@Pc(626) Class77_Sub39 local626 = new Class77_Sub39(49);
					for (local493 = -2147483646; local493 <= -2147483644; local493++) {
						@Pc(637) Class43 local637 = (Class43) local455.get(local493);
						if (local637 != null) {
							local626.method22420(local637.anInt166 * -99932579);
							local626.method22420(local637.anInt167 * 591064797);
							local626.method22420(local637.anInt169 * -2091928773);
							local626.method22420(local637.anInt165 * 849627281);
						}
					}
					local626.anInt3089 = 0;
					this.aString55 = local626.method22523();
				}
				@Pc(679) String[][] local679 = HardwareInfo.getDXDiagDisplayDevicesProps();
				@Pc(730) String local730;
				if (local679 != null && local679.length > 0 && local679[0] != null) {
					for (local457 = 0; local457 < local679[0].length; local457 += 2) {
						if (local679[0][local457].equalsIgnoreCase("szDescription")) {
							this.aString52 = local679[0][local457 + 1];
						} else if (local679[0][local457].equalsIgnoreCase("szDriverDateEnglish")) {
							local730 = local679[0][local457 + 1];
							try {
								local477 = local730.indexOf("/");
								local485 = local730.indexOf("/", local477 + 1);
								this.anInt1620 = Integer.parseInt(local730.substring(0, local477)) * 1770895543;
								this.anInt1619 = Integer.parseInt(local730.substring(local485 + 1, local730.indexOf(" ", local485))) * 1006893155;
							} catch (@Pc(766) Exception local766) {
							}
						}
					}
				}
				@Pc(770) String[] local770 = HardwareInfo.getDXDiagSystemProps();
				if (local770 != null) {
					local730 = "";
					@Pc(776) String local776 = "";
					@Pc(778) String local778 = "";
					for (local493 = 0; local493 < local770.length; local493 += 2) {
						if (local770[local493].equalsIgnoreCase("dwDirectXVersionMajor")) {
							local730 = local770[local493 + 1];
						} else if (local770[local493].equalsIgnoreCase("dwDirectXVersionMinor")) {
							local776 = local770[local493 + 1];
						} else if (local770[local493].equalsIgnoreCase("dwDirectXVersionLetter")) {
							local778 = local770[local493 + 1];
						}
					}
					this.aString53 = local730 + "." + local776 + local778;
				}
			} catch (@Pc(840) Throwable local840) {
				this.anInt1615 = 0;
			}
		}
		if (this.aString52 == null) {
			this.aString52 = "";
		}
		if (this.aString50 == null) {
			this.aString50 = "";
		}
		if (this.aString53 == null) {
			this.aString53 = "";
		}
		if (this.aString51 == null) {
			this.aString51 = "";
		}
		if (this.aString54 == null) {
			this.aString54 = "";
		}
		if (this.aString55 == null) {
			this.aString55 = "";
		}
		if (this.aString56 == null) {
			this.aString56 = "";
		}
		this.method13736();
	}

	@OriginalMember(owner = "client!akd", name = "y", descriptor = "()V", line = 254)
	void method13735() {
		if (this.aString52.length() > 40) {
			this.aString52 = this.aString52.substring(0, 40);
		}
		if (this.aString50.length() > 40) {
			this.aString50 = this.aString50.substring(0, 40);
		}
		if (this.aString53.length() > 10) {
			this.aString53 = this.aString53.substring(0, 10);
		}
		if (this.aString51.length() > 10) {
			this.aString51 = this.aString51.substring(0, 10);
		}
		if (this.aString56.length() > 120) {
			this.aString56 = this.aString56.substring(0, 120);
		}
	}

	@OriginalMember(owner = "client!akd", name = "p", descriptor = "(I)V", line = 254)
	void method13736() {
		if (this.aString52.length() > 40) {
			this.aString52 = this.aString52.substring(0, 40);
		}
		if (this.aString50.length() > 40) {
			this.aString50 = this.aString50.substring(0, 40);
		}
		if (this.aString53.length() > 10) {
			this.aString53 = this.aString53.substring(0, 10);
		}
		if (this.aString51.length() > 10) {
			this.aString51 = this.aString51.substring(0, 10);
		}
		if (this.aString56.length() > 120) {
			this.aString56 = this.aString56.substring(0, 120);
		}
	}

	@OriginalMember(owner = "client!akd", name = "l", descriptor = "()V", line = 254)
	void method13737() {
		if (this.aString52.length() > 40) {
			this.aString52 = this.aString52.substring(0, 40);
		}
		if (this.aString50.length() > 40) {
			this.aString50 = this.aString50.substring(0, 40);
		}
		if (this.aString53.length() > 10) {
			this.aString53 = this.aString53.substring(0, 10);
		}
		if (this.aString51.length() > 10) {
			this.aString51 = this.aString51.substring(0, 10);
		}
		if (this.aString56.length() > 120) {
			this.aString56 = this.aString56.substring(0, 120);
		}
	}

	@OriginalMember(owner = "client!akd", name = "c", descriptor = "(Lclient!akv;B)V", line = 262)
	public void method13738(@OriginalArg(0) Class77_Sub39 arg0) {
		arg0.method22403(7);
		arg0.method22403(this.anInt1582 * -169994563);
		arg0.method22403(this.aBoolean332 ? 1 : 0);
		arg0.method22403(this.anInt1602 * 1639805781);
		arg0.method22403(this.anInt1608 * 618457647);
		arg0.method22403(this.anInt1609 * 758172927);
		arg0.method22403(this.anInt1610 * -2057205629);
		arg0.method22403(this.anInt1595 * -2076366157);
		arg0.method22403(this.aBoolean331 ? 1 : 0);
		arg0.method22408(this.anInt1612 * -314204203);
		arg0.method22403(this.anInt1611 * 111068721);
		arg0.method22413(this.anInt1615 * -686202593);
		arg0.method22408(this.anInt1616 * 1626055995);
		arg0.method22444(this.aString52);
		arg0.method22444(this.aString50);
		arg0.method22444(this.aString53);
		arg0.method22444(this.aString51);
		arg0.method22403(this.anInt1620 * -42031865);
		arg0.method22408(this.anInt1619 * -174700213);
		arg0.method22444(this.aString54);
		arg0.method22444(this.aString55);
		arg0.method22403(this.anInt1622 * -1330352411);
		arg0.method22403(this.anInt1617 * 713740933);
		for (@Pc(151) int local151 = 0; local151 < this.anIntArray202.length; local151++) {
			arg0.method22417(this.anIntArray202[local151]);
		}
		arg0.method22417(this.anInt1618 * -1768400225);
		arg0.method22444(this.aString56);
	}

	@OriginalMember(owner = "client!akd", name = "w", descriptor = "(Lclient!akv;)V", line = 262)
	public void method13739(@OriginalArg(0) Class77_Sub39 arg0) {
		arg0.method22403(7);
		arg0.method22403(this.anInt1582 * -169994563);
		arg0.method22403(this.aBoolean332 ? 1 : 0);
		arg0.method22403(this.anInt1602 * 1639805781);
		arg0.method22403(this.anInt1608 * 618457647);
		arg0.method22403(this.anInt1609 * 758172927);
		arg0.method22403(this.anInt1610 * -2057205629);
		arg0.method22403(this.anInt1595 * -2076366157);
		arg0.method22403(this.aBoolean331 ? 1 : 0);
		arg0.method22408(this.anInt1612 * -314204203);
		arg0.method22403(this.anInt1611 * 111068721);
		arg0.method22413(this.anInt1615 * -686202593);
		arg0.method22408(this.anInt1616 * 1626055995);
		arg0.method22444(this.aString52);
		arg0.method22444(this.aString50);
		arg0.method22444(this.aString53);
		arg0.method22444(this.aString51);
		arg0.method22403(this.anInt1620 * -42031865);
		arg0.method22408(this.anInt1619 * -174700213);
		arg0.method22444(this.aString54);
		arg0.method22444(this.aString55);
		arg0.method22403(this.anInt1622 * -1330352411);
		arg0.method22403(this.anInt1617 * 713740933);
		for (@Pc(151) int local151 = 0; local151 < this.anIntArray202.length; local151++) {
			arg0.method22417(this.anIntArray202[local151]);
		}
		arg0.method22417(this.anInt1618 * -1768400225);
		arg0.method22444(this.aString56);
	}

	@OriginalMember(owner = "client!akd", name = "t", descriptor = "(Lclient!akv;)V", line = 262)
	public void method13740(@OriginalArg(0) Class77_Sub39 arg0) {
		arg0.method22403(7);
		arg0.method22403(this.anInt1582 * -169994563);
		arg0.method22403(this.aBoolean332 ? 1 : 0);
		arg0.method22403(this.anInt1602 * 1639805781);
		arg0.method22403(this.anInt1608 * 618457647);
		arg0.method22403(this.anInt1609 * 758172927);
		arg0.method22403(this.anInt1610 * -2057205629);
		arg0.method22403(this.anInt1595 * -2076366157);
		arg0.method22403(this.aBoolean331 ? 1 : 0);
		arg0.method22408(this.anInt1612 * -314204203);
		arg0.method22403(this.anInt1611 * 111068721);
		arg0.method22413(this.anInt1615 * -686202593);
		arg0.method22408(this.anInt1616 * 1626055995);
		arg0.method22444(this.aString52);
		arg0.method22444(this.aString50);
		arg0.method22444(this.aString53);
		arg0.method22444(this.aString51);
		arg0.method22403(this.anInt1620 * -42031865);
		arg0.method22408(this.anInt1619 * -174700213);
		arg0.method22444(this.aString54);
		arg0.method22444(this.aString55);
		arg0.method22403(this.anInt1622 * -1330352411);
		arg0.method22403(this.anInt1617 * 713740933);
		for (@Pc(151) int local151 = 0; local151 < this.anIntArray202.length; local151++) {
			arg0.method22417(this.anIntArray202[local151]);
		}
		arg0.method22417(this.anInt1618 * -1768400225);
		arg0.method22444(this.aString56);
	}

	@OriginalMember(owner = "client!akd", name = "d", descriptor = "()I", line = 291)
	public int method13741() {
		@Pc(1) byte local1 = 38;
		@Pc(8) int local8 = local1 + Class430.method28814(this.aString52);
		@Pc(15) int local15 = local8 + Class430.method28814(this.aString50);
		@Pc(22) int local22 = local15 + Class430.method28814(this.aString53);
		@Pc(29) int local29 = local22 + Class430.method28814(this.aString51);
		@Pc(36) int local36 = local29 + Class430.method28814(this.aString54);
		@Pc(43) int local43 = local36 + Class430.method28814(this.aString55);
		return local43 + Class430.method28814(this.aString56);
	}

	@OriginalMember(owner = "client!akd", name = "v", descriptor = "(I)I", line = 291)
	public int method13742() {
		@Pc(1) byte local1 = 38;
		@Pc(8) int local8 = local1 + Class430.method28814(this.aString52);
		@Pc(15) int local15 = local8 + Class430.method28814(this.aString50);
		@Pc(22) int local22 = local15 + Class430.method28814(this.aString53);
		@Pc(29) int local29 = local22 + Class430.method28814(this.aString51);
		@Pc(36) int local36 = local29 + Class430.method28814(this.aString54);
		@Pc(43) int local43 = local36 + Class430.method28814(this.aString55);
		return local43 + Class430.method28814(this.aString56);
	}

	@OriginalMember(owner = "client!akd", name = "q", descriptor = "()I", line = 291)
	public int method13743() {
		@Pc(1) byte local1 = 38;
		@Pc(8) int local8 = local1 + Class430.method28814(this.aString52);
		@Pc(15) int local15 = local8 + Class430.method28814(this.aString50);
		@Pc(22) int local22 = local15 + Class430.method28814(this.aString53);
		@Pc(29) int local29 = local22 + Class430.method28814(this.aString51);
		@Pc(36) int local36 = local29 + Class430.method28814(this.aString54);
		@Pc(43) int local43 = local36 + Class430.method28814(this.aString55);
		return local43 + Class430.method28814(this.aString56);
	}

	@OriginalMember(owner = "client!akd", name = "x", descriptor = "()I", line = 291)
	public int method13744() {
		@Pc(1) byte local1 = 38;
		@Pc(8) int local8 = local1 + Class430.method28814(this.aString52);
		@Pc(15) int local15 = local8 + Class430.method28814(this.aString50);
		@Pc(22) int local22 = local15 + Class430.method28814(this.aString53);
		@Pc(29) int local29 = local22 + Class430.method28814(this.aString51);
		@Pc(36) int local36 = local29 + Class430.method28814(this.aString54);
		@Pc(43) int local43 = local36 + Class430.method28814(this.aString55);
		return local43 + Class430.method28814(this.aString56);
	}

	@OriginalMember(owner = "client!akd", name = "fp", descriptor = "(I)V", line = 2371)
	static void method13745() {
		@Pc(3) int local3 = Class149_Sub4.anInt2368 * 1771907305;
		@Pc(7) int local7 = Class19.anInt108 * -1091172141;
		if (Class402.anInt4694 * -166028671 < local3) {
			local3 = Class402.anInt4694 * -166028671;
		}
		if (client.anInt3365 * 8272787 < local7) {
			local7 = client.anInt3365 * 8272787;
		}
		try {
			if (Class35_Sub6.aClass77_Sub35_45 != null) {
				Class413.aClass413_5.method28604(new Object[] { local3, local7, Class569.method31421(), Class35_Sub6.aClass77_Sub35_45.aClass143_Sub21_1.method15716() });
			}
		} catch (@Pc(58) Throwable local58) {
		}
	}
}
