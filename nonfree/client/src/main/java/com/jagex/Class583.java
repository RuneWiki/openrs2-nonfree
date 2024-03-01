package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!xp")
public class Class583 {

	@OriginalMember(owner = "client!xp", name = "hn", descriptor = "Lclient!yv;")
	public static Class609 aClass609_1;

	@OriginalMember(owner = "client!xp", name = "u", descriptor = "I")
	public int anInt5450;

	@OriginalMember(owner = "client!xp", name = "x", descriptor = "I")
	public int anInt5451;

	@OriginalMember(owner = "client!xp", name = "s", descriptor = "I")
	public int anInt5453;

	@OriginalMember(owner = "client!xp", name = "y", descriptor = "I")
	public int anInt5456;

	@OriginalMember(owner = "client!xp", name = "p", descriptor = "I")
	int anInt5454 = 0;

	@OriginalMember(owner = "client!xp", name = "a", descriptor = "I")
	public int anInt5455 = 515965489;

	@OriginalMember(owner = "client!xp", name = "g", descriptor = "I")
	public int anInt5452 = 348971520;

	@OriginalMember(owner = "client!xp", name = "l", descriptor = "Z")
	public boolean aBoolean840 = true;

	@OriginalMember(owner = "client!xp", name = "h", descriptor = "Z")
	public boolean aBoolean839 = true;

	@OriginalMember(owner = "client!xp", name = "<init>", descriptor = "()V", line = 17)
	Class583() {
	}

	@OriginalMember(owner = "client!xp", name = "l", descriptor = "(Lclient!ahb;)V", line = 21)
	void method33258(@OriginalArg(0) Class3_Sub41 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method20269();
			if (local3 == 0) {
				return;
			}
			this.method33260(arg0, local3);
		}
	}

	@OriginalMember(owner = "client!xp", name = "p", descriptor = "(Lclient!ahb;B)V", line = 21)
	void method33259(@OriginalArg(0) Class3_Sub41 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method20269();
			if (local3 == 0) {
				return;
			}
			this.method33260(arg0, local3);
		}
	}

	@OriginalMember(owner = "client!xp", name = "a", descriptor = "(Lclient!ahb;II)V", line = 28)
	void method33260(@OriginalArg(0) Class3_Sub41 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt5454 = arg0.method20273() * -1533641035;
			this.method33261(this.anInt5454 * -1169752163);
		} else if (arg1 == 2) {
			this.anInt5455 = arg0.method20271() * -515965489;
			if (this.anInt5455 * -499979985 == 65535) {
				this.anInt5455 = 515965489;
			}
		} else if (arg1 == 3) {
			this.anInt5452 = (arg0.method20271() << 2) * -418748815;
		} else if (arg1 == 4) {
			this.aBoolean840 = false;
		} else if (arg1 == 5) {
			this.aBoolean839 = false;
		}
	}

	@OriginalMember(owner = "client!xp", name = "h", descriptor = "(Lclient!ahb;I)V", line = 28)
	void method33263(@OriginalArg(0) Class3_Sub41 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt5454 = arg0.method20273() * -1533641035;
			this.method33261(this.anInt5454 * -1169752163);
		} else if (arg1 == 2) {
			this.anInt5455 = arg0.method20271() * -515965489;
			if (this.anInt5455 * -499979985 == 65535) {
				this.anInt5455 = 515965489;
			}
		} else if (arg1 == 3) {
			this.anInt5452 = (arg0.method20271() << 2) * -418748815;
		} else if (arg1 == 4) {
			this.aBoolean840 = false;
		} else if (arg1 == 5) {
			this.aBoolean839 = false;
		}
	}

	@OriginalMember(owner = "client!xp", name = "x", descriptor = "(Lclient!ahb;I)V", line = 28)
	void method33264(@OriginalArg(0) Class3_Sub41 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt5454 = arg0.method20273() * -1533641035;
			this.method33261(this.anInt5454 * -1169752163);
		} else if (arg1 == 2) {
			this.anInt5455 = arg0.method20271() * -515965489;
			if (this.anInt5455 * -499979985 == 65535) {
				this.anInt5455 = 515965489;
			}
		} else if (arg1 == 3) {
			this.anInt5452 = (arg0.method20271() << 2) * -418748815;
		} else if (arg1 == 4) {
			this.aBoolean840 = false;
		} else if (arg1 == 5) {
			this.aBoolean839 = false;
		}
	}

	@OriginalMember(owner = "client!xp", name = "g", descriptor = "(II)V", line = 43)
	void method33261(@OriginalArg(0) int arg0) {
		@Pc(8) double local8 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(17) double local17 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		@Pc(24) double local24 = (double) (arg0 & 0xFF) / 256.0D;
		@Pc(26) double local26 = local8;
		if (local17 < local8) {
			local26 = local17;
		}
		if (local24 < local26) {
			local26 = local24;
		}
		@Pc(40) double local40 = local8;
		if (local17 > local8) {
			local40 = local17;
		}
		if (local24 > local40) {
			local40 = local24;
		}
		@Pc(54) double local54 = 0.0D;
		@Pc(56) double local56 = 0.0D;
		@Pc(62) double local62 = (local26 + local40) / 2.0D;
		if (local40 != local26) {
			if (local62 < 0.5D) {
				local56 = (local40 - local26) / (local40 + local26);
			}
			if (local62 >= 0.5D) {
				local56 = (local40 - local26) / (2.0D - local40 - local26);
			}
			if (local8 == local40) {
				local54 = (local17 - local24) / (local40 - local26);
			} else if (local17 == local40) {
				local54 = (local24 - local8) / (local40 - local26) + 2.0D;
			} else if (local24 == local40) {
				local54 = (local8 - local17) / (local40 - local26) + 4.0D;
			}
		}
		local54 /= 6.0D;
		this.anInt5453 = (int) (local56 * 256.0D) * 1451830229;
		this.anInt5450 = (int) (local62 * 256.0D) * -57701919;
		if (this.anInt5453 * -488065667 < 0) {
			this.anInt5453 = 0;
		} else if (this.anInt5453 * -488065667 > 255) {
			this.anInt5453 = 849520939;
		}
		if (this.anInt5450 * -2029356511 < 0) {
			this.anInt5450 = 0;
		} else if (this.anInt5450 * -2029356511 > 255) {
			this.anInt5450 = -1829087457;
		}
		if (local62 > 0.5D) {
			this.anInt5456 = (int) (local56 * (1.0D - local62) * 512.0D) * 1360243283;
		} else {
			this.anInt5456 = (int) (local62 * local56 * 512.0D) * 1360243283;
		}
		if (this.anInt5456 * -1983764005 < 1) {
			this.anInt5456 = 1360243283;
		}
		this.anInt5451 = (int) (local54 * (double) (this.anInt5456 * -1983764005)) * 645860041;
	}

	@OriginalMember(owner = "client!xp", name = "s", descriptor = "(I)V", line = 43)
	void method33262(@OriginalArg(0) int arg0) {
		@Pc(8) double local8 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(17) double local17 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		@Pc(24) double local24 = (double) (arg0 & 0xFF) / 256.0D;
		@Pc(26) double local26 = local8;
		if (local17 < local8) {
			local26 = local17;
		}
		if (local24 < local26) {
			local26 = local24;
		}
		@Pc(40) double local40 = local8;
		if (local17 > local8) {
			local40 = local17;
		}
		if (local24 > local40) {
			local40 = local24;
		}
		@Pc(54) double local54 = 0.0D;
		@Pc(56) double local56 = 0.0D;
		@Pc(62) double local62 = (local26 + local40) / 2.0D;
		if (local40 != local26) {
			if (local62 < 0.5D) {
				local56 = (local40 - local26) / (local40 + local26);
			}
			if (local62 >= 0.5D) {
				local56 = (local40 - local26) / (2.0D - local40 - local26);
			}
			if (local8 == local40) {
				local54 = (local17 - local24) / (local40 - local26);
			} else if (local17 == local40) {
				local54 = (local24 - local8) / (local40 - local26) + 2.0D;
			} else if (local24 == local40) {
				local54 = (local8 - local17) / (local40 - local26) + 4.0D;
			}
		}
		local54 /= 6.0D;
		this.anInt5453 = (int) (local56 * 256.0D) * 1451830229;
		this.anInt5450 = (int) (local62 * 256.0D) * -57701919;
		if (this.anInt5453 * -488065667 < 0) {
			this.anInt5453 = 0;
		} else if (this.anInt5453 * -488065667 > 255) {
			this.anInt5453 = 849520939;
		}
		if (this.anInt5450 * -2029356511 < 0) {
			this.anInt5450 = 0;
		} else if (this.anInt5450 * -2029356511 > 255) {
			this.anInt5450 = -1829087457;
		}
		if (local62 > 0.5D) {
			this.anInt5456 = (int) (local56 * (1.0D - local62) * 512.0D) * 1360243283;
		} else {
			this.anInt5456 = (int) (local62 * local56 * 512.0D) * 1360243283;
		}
		if (this.anInt5456 * -1983764005 < 1) {
			this.anInt5456 = 1360243283;
		}
		this.anInt5451 = (int) (local54 * (double) (this.anInt5456 * -1983764005)) * 645860041;
	}

	@OriginalMember(owner = "client!xp", name = "u", descriptor = "(I)V", line = 43)
	void method33265(@OriginalArg(0) int arg0) {
		@Pc(8) double local8 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(17) double local17 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		@Pc(24) double local24 = (double) (arg0 & 0xFF) / 256.0D;
		@Pc(26) double local26 = local8;
		if (local17 < local8) {
			local26 = local17;
		}
		if (local24 < local26) {
			local26 = local24;
		}
		@Pc(40) double local40 = local8;
		if (local17 > local8) {
			local40 = local17;
		}
		if (local24 > local40) {
			local40 = local24;
		}
		@Pc(54) double local54 = 0.0D;
		@Pc(56) double local56 = 0.0D;
		@Pc(62) double local62 = (local26 + local40) / 2.0D;
		if (local40 != local26) {
			if (local62 < 0.5D) {
				local56 = (local40 - local26) / (local40 + local26);
			}
			if (local62 >= 0.5D) {
				local56 = (local40 - local26) / (2.0D - local40 - local26);
			}
			if (local8 == local40) {
				local54 = (local17 - local24) / (local40 - local26);
			} else if (local17 == local40) {
				local54 = (local24 - local8) / (local40 - local26) + 2.0D;
			} else if (local24 == local40) {
				local54 = (local8 - local17) / (local40 - local26) + 4.0D;
			}
		}
		local54 /= 6.0D;
		this.anInt5453 = (int) (local56 * 256.0D) * 1451830229;
		this.anInt5450 = (int) (local62 * 256.0D) * -57701919;
		if (this.anInt5453 * -488065667 < 0) {
			this.anInt5453 = 0;
		} else if (this.anInt5453 * -488065667 > 255) {
			this.anInt5453 = 849520939;
		}
		if (this.anInt5450 * -2029356511 < 0) {
			this.anInt5450 = 0;
		} else if (this.anInt5450 * -2029356511 > 255) {
			this.anInt5450 = -1829087457;
		}
		if (local62 > 0.5D) {
			this.anInt5456 = (int) (local56 * (1.0D - local62) * 512.0D) * 1360243283;
		} else {
			this.anInt5456 = (int) (local62 * local56 * 512.0D) * 1360243283;
		}
		if (this.anInt5456 * -1983764005 < 1) {
			this.anInt5456 = 1360243283;
		}
		this.anInt5451 = (int) (local54 * (double) (this.anInt5456 * -1983764005)) * 645860041;
	}

	@OriginalMember(owner = "client!xp", name = "y", descriptor = "(I)V", line = 43)
	void method33266(@OriginalArg(0) int arg0) {
		@Pc(8) double local8 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(17) double local17 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		@Pc(24) double local24 = (double) (arg0 & 0xFF) / 256.0D;
		@Pc(26) double local26 = local8;
		if (local17 < local8) {
			local26 = local17;
		}
		if (local24 < local26) {
			local26 = local24;
		}
		@Pc(40) double local40 = local8;
		if (local17 > local8) {
			local40 = local17;
		}
		if (local24 > local40) {
			local40 = local24;
		}
		@Pc(54) double local54 = 0.0D;
		@Pc(56) double local56 = 0.0D;
		@Pc(62) double local62 = (local26 + local40) / 2.0D;
		if (local40 != local26) {
			if (local62 < 0.5D) {
				local56 = (local40 - local26) / (local40 + local26);
			}
			if (local62 >= 0.5D) {
				local56 = (local40 - local26) / (2.0D - local40 - local26);
			}
			if (local8 == local40) {
				local54 = (local17 - local24) / (local40 - local26);
			} else if (local17 == local40) {
				local54 = (local24 - local8) / (local40 - local26) + 2.0D;
			} else if (local24 == local40) {
				local54 = (local8 - local17) / (local40 - local26) + 4.0D;
			}
		}
		local54 /= 6.0D;
		this.anInt5453 = (int) (local56 * 256.0D) * 1451830229;
		this.anInt5450 = (int) (local62 * 256.0D) * -57701919;
		if (this.anInt5453 * -488065667 < 0) {
			this.anInt5453 = 0;
		} else if (this.anInt5453 * -488065667 > 255) {
			this.anInt5453 = 849520939;
		}
		if (this.anInt5450 * -2029356511 < 0) {
			this.anInt5450 = 0;
		} else if (this.anInt5450 * -2029356511 > 255) {
			this.anInt5450 = -1829087457;
		}
		if (local62 > 0.5D) {
			this.anInt5456 = (int) (local56 * (1.0D - local62) * 512.0D) * 1360243283;
		} else {
			this.anInt5456 = (int) (local62 * local56 * 512.0D) * 1360243283;
		}
		if (this.anInt5456 * -1983764005 < 1) {
			this.anInt5456 = 1360243283;
		}
		this.anInt5451 = (int) (local54 * (double) (this.anInt5456 * -1983764005)) * 645860041;
	}

	@OriginalMember(owner = "client!xp", name = "j", descriptor = "(II)V", line = 475)
	public static void method33268(@OriginalArg(0) int arg0) {
		@Pc(2) Class161 local2 = Class488.aClass161_55;
		synchronized (Class488.aClass161_55) {
			Class488.aClass161_55.method23240(arg0);
		}
		local2 = Class488.aClass161_56;
		synchronized (Class488.aClass161_56) {
			Class488.aClass161_56.method23240(arg0);
		}
	}

	@OriginalMember(owner = "client!xp", name = "aoy", descriptor = "(Lclient!vs;S)V", line = 11547)
	static final void method33267(@OriginalArg(0) Class536 arg0) {
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = Class510.aClass3_Sub45_37.aClass60_Sub2_1.method12689() == 1 ? 1 : 0;
	}
}
