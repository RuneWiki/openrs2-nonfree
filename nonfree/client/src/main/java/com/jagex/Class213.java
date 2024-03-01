package com.jagex;

import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gx")
public class Class213 {

	@OriginalMember(owner = "client!gx", name = "p", descriptor = "I")
	public int anInt3705;

	@OriginalMember(owner = "client!gx", name = "g", descriptor = "I")
	public int anInt3707;

	@OriginalMember(owner = "client!gx", name = "l", descriptor = "I")
	public int anInt3708;

	@OriginalMember(owner = "client!gx", name = "h", descriptor = "I")
	public int anInt3709;

	@OriginalMember(owner = "client!gx", name = "b", descriptor = "I")
	public int anInt3710;

	@OriginalMember(owner = "client!gx", name = "x", descriptor = "Z")
	public boolean aBoolean667;

	@OriginalMember(owner = "client!gx", name = "u", descriptor = "I")
	public int anInt3711;

	@OriginalMember(owner = "client!gx", name = "y", descriptor = "I")
	public int anInt3712;

	@OriginalMember(owner = "client!gx", name = "c", descriptor = "I")
	public int anInt3714;

	@OriginalMember(owner = "client!gx", name = "a", descriptor = "I")
	public int anInt3706 = -368529576;

	@OriginalMember(owner = "client!gx", name = "s", descriptor = "I")
	public int anInt3713 = 99122703;

	@OriginalMember(owner = "client!gx", name = "p", descriptor = "(B)[Lclient!wo;", line = 14)
	static Class557[] method24266() {
		return new Class557[] { Class557.aClass557_4, Class557.aClass557_5, Class557.aClass557_6, Class557.aClass557_3, Class557.aClass557_2 };
	}

	@OriginalMember(owner = "client!gx", name = "<init>", descriptor = "()V", line = 18)
	Class213() {
	}

	@OriginalMember(owner = "client!gx", name = "g", descriptor = "(Lclient!ahb;)V", line = 22)
	void method24256(@OriginalArg(0) Class3_Sub41 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method20269();
			if (local3 == 0) {
				return;
			}
			this.method24258(arg0, local3);
		}
	}

	@OriginalMember(owner = "client!gx", name = "p", descriptor = "(Lclient!ahb;I)V", line = 22)
	void method24257(@OriginalArg(0) Class3_Sub41 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method20269();
			if (local3 == 0) {
				return;
			}
			this.method24258(arg0, local3);
		}
	}

	@OriginalMember(owner = "client!gx", name = "a", descriptor = "(Lclient!ahb;II)V", line = 29)
	void method24258(@OriginalArg(0) Class3_Sub41 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt3706 = arg0.method20271() * -1656678933;
		} else if (arg1 == 2) {
			this.aBoolean667 = true;
		} else if (arg1 == 3) {
			this.anInt3707 = arg0.method20272() * 458023937;
			this.anInt3708 = arg0.method20272() * 261242423;
			this.anInt3709 = arg0.method20272() * 1913117113;
		} else if (arg1 == 4) {
			this.anInt3705 = arg0.method20269() * -178876245;
		} else if (arg1 == 5) {
			this.anInt3711 = arg0.method20375() * 1902957219;
		} else if (arg1 == 6) {
			this.anInt3713 = arg0.method20273() * -350780943;
		} else if (arg1 == 7) {
			this.anInt3712 = arg0.method20272() * -2058274683;
			this.anInt3710 = arg0.method20272() * 1452896221;
			this.anInt3714 = arg0.method20272() * 554512995;
		}
	}

	@OriginalMember(owner = "client!gx", name = "h", descriptor = "(Lclient!ahb;I)V", line = 29)
	void method24259(@OriginalArg(0) Class3_Sub41 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt3706 = arg0.method20271() * -1656678933;
		} else if (arg1 == 2) {
			this.aBoolean667 = true;
		} else if (arg1 == 3) {
			this.anInt3707 = arg0.method20272() * 458023937;
			this.anInt3708 = arg0.method20272() * 261242423;
			this.anInt3709 = arg0.method20272() * 1913117113;
		} else if (arg1 == 4) {
			this.anInt3705 = arg0.method20269() * -178876245;
		} else if (arg1 == 5) {
			this.anInt3711 = arg0.method20375() * 1902957219;
		} else if (arg1 == 6) {
			this.anInt3713 = arg0.method20273() * -350780943;
		} else if (arg1 == 7) {
			this.anInt3712 = arg0.method20272() * -2058274683;
			this.anInt3710 = arg0.method20272() * 1452896221;
			this.anInt3714 = arg0.method20272() * 554512995;
		}
	}

	@OriginalMember(owner = "client!gx", name = "l", descriptor = "(Lclient!ahb;I)V", line = 29)
	void method24260(@OriginalArg(0) Class3_Sub41 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt3706 = arg0.method20271() * -1656678933;
		} else if (arg1 == 2) {
			this.aBoolean667 = true;
		} else if (arg1 == 3) {
			this.anInt3707 = arg0.method20272() * 458023937;
			this.anInt3708 = arg0.method20272() * 261242423;
			this.anInt3709 = arg0.method20272() * 1913117113;
		} else if (arg1 == 4) {
			this.anInt3705 = arg0.method20269() * -178876245;
		} else if (arg1 == 5) {
			this.anInt3711 = arg0.method20375() * 1902957219;
		} else if (arg1 == 6) {
			this.anInt3713 = arg0.method20273() * -350780943;
		} else if (arg1 == 7) {
			this.anInt3712 = arg0.method20272() * -2058274683;
			this.anInt3710 = arg0.method20272() * 1452896221;
			this.anInt3714 = arg0.method20272() * 554512995;
		}
	}

	@OriginalMember(owner = "client!gx", name = "fl", descriptor = "(B)V", line = 2252)
	public static void method24264() {
		@Pc(2) client local2 = Class314.aClient1;
		synchronized (Class314.aClient1) {
			if (Class350.aFrame3 == null) {
				@Pc(12) Container local12 = Class3_Sub45.method13019();
				if (local12 != null) {
					client.anInt3026 = local12.getSize().width * -1727552665;
					Class613.anInt5546 = local12.getSize().height * 744274357;
					@Pc(35) Insets local35;
					if (Class212.aFrame2 == local12) {
						local35 = Class212.aFrame2.getInsets();
						client.anInt3026 -= (local35.right + local35.left) * -1727552665;
						Class613.anInt5546 -= (local35.bottom + local35.top) * 744274357;
					}
					if (client.anInt3026 * -2098608041 <= 0) {
						client.anInt3026 = -1727552665;
					}
					if (Class613.anInt5546 * -457495395 <= 0) {
						Class613.anInt5546 = 744274357;
					}
					if (Class492.method29292() == 1) {
						Class128.anInt3317 = client.anInt3032 * -2139987369;
						client.anInt3022 = (client.anInt3026 * -2098608041 - client.anInt3032 * 581921171) / 2 * 1964245899;
						Class575.anInt5428 = client.anInt3131 * 1536191391;
						client.anInt3024 = 0;
					} else {
						Class19_Sub1.method20892();
					}
					if (Class527.aClass527_10 != Class1.aClass527_1 && Class128.anInt3317 * 2037417253 < 1024 && Class575.anInt5428 * 1261116487 < 768) {
					}
					Class106.aCanvas6.setSize(Class128.anInt3317 * 2037417253, Class575.anInt5428 * 1261116487);
					if (Class613.aClass21_13 != null) {
						Class613.aClass21_13.method17043(Class106.aCanvas6, Class128.anInt3317 * 2037417253, Class575.anInt5428 * 1261116487);
					}
					if (local12 == Class212.aFrame2) {
						local35 = Class212.aFrame2.getInsets();
						Class106.aCanvas6.setLocation(client.anInt3022 * 426445859 + local35.left, local35.top + client.anInt3024 * 2076797327);
					} else {
						Class106.aCanvas6.setLocation(client.anInt3022 * 426445859, client.anInt3024 * 2076797327);
					}
					Class68.method14037();
					if (-1579500007 * client.anInt3125 != -1) {
						Class298.method25633(true);
					}
					Class199.method24133();
				}
			}
		}
	}

	@OriginalMember(owner = "client!gx", name = "fn", descriptor = "(Lclient!vs;B)V", line = 4972)
	static final void method24265(@OriginalArg(0) Class536 arg0) {
		@Pc(12) int local12 = arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381];
		@Pc(16) Class178 local16 = Class375.method27235(local12);
		@Pc(22) Class186 local22 = Class178.aClass186Array1[local12 >> 16];
		Class63_Sub1.method13062(local16, local22, arg0);
	}

	@OriginalMember(owner = "client!gx", name = "fq", descriptor = "(Lclient!vs;I)V", line = 5101)
	static final void method24261(@OriginalArg(0) Class536 arg0) {
		@Pc(8) Class534 local8 = arg0.aBoolean822 ? arg0.aClass534_2 : arg0.aClass534_1;
		@Pc(11) Class178 local11 = local8.aClass178_18;
		@Pc(14) Class186 local14 = local8.aClass186_4;
		Class160.method23209(local11, local14, arg0);
	}

	@OriginalMember(owner = "client!gx", name = "qz", descriptor = "(Lclient!vs;I)V", line = 7030)
	static final void method24262(@OriginalArg(0) Class536 arg0) {
		@Pc(8) Class534 local8 = arg0.aBoolean822 ? arg0.aClass534_2 : arg0.aClass534_1;
		@Pc(11) Class178 local11 = local8.aClass178_18;
		@Pc(24) int local24 = arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381];
		@Pc(25) int local25 = local24 - 1;
		if (local11.aStringArray11 == null || local25 >= local11.aStringArray11.length || local11.aStringArray11[local25] == null) {
			arg0.anObjectArray42[(arg0.anInt5315 += 790013775) * 996806575 - 1] = "";
		} else {
			arg0.anObjectArray42[(arg0.anInt5315 += 790013775) * 996806575 - 1] = local11.aStringArray11[local25];
		}
	}

	@OriginalMember(owner = "client!gx", name = "aat", descriptor = "(Lclient!vs;B)V", line = 8720)
	static final void method24267(@OriginalArg(0) Class536 arg0) {
		@Pc(12) int local12 = arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381];
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = client.aClass367Array1[local12].anInt4655 * 1734808327;
	}

	@OriginalMember(owner = "client!gx", name = "ank", descriptor = "(Lclient!vs;B)V", line = 11394)
	static final void method24263(@OriginalArg(0) Class536 arg0) {
		Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub27_1, arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381]);
		Class26_Sub1_Sub1_Sub1.method16728();
	}
}
